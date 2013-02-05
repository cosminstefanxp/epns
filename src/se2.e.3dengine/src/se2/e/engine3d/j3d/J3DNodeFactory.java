package se2.e.engine3d.j3d;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.media.j3d.Appearance;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.GeometryArray;
import javax.media.j3d.Node;
import javax.media.j3d.QuadArray;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Texture;
import javax.media.j3d.TextureAttributes;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import se2.e.engine3d.GeometryAndAppearanceLoader;
import se2.e.geometry.GeometryObject;
import se2.e.geometry.Position;
import se2.e.geometry.SimplePosition;
import se2.e.geometry.Track;
import se2.e.utilities.PathInterpolator;
import se2.e.utilities.Vector2D;
import se2.e.utilities.Where;
import se2.e.utilities.path.BezierPathInterpolator;
import appearance.AppearanceInfo;
import appearance.Model3D;
import appearance.Object3D;
import appearance.Surface;
import appearance.SurfaceColor;

import com.microcrowd.loader.java3d.max3ds.Loader3DS;
import com.sun.j3d.loaders.Scene;
import com.sun.j3d.loaders.objectfile.ObjectFile;
import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.image.TextureLoader;

/**
 * A factory for creating nodes containing the representation for various types
 * of objects in Java3D.
 * 
 * @author marius, ruxandra, cosmin
 */
public class J3DNodeFactory {

	/** The Constant DRAWING_PLANE_Z. */
	private static final double DRAWING_PLANE_Z = 0d;
	
	/** The Constant INTERPOLATION_DIST. */
	private static final double INTERPOLATION_DIST = 8.0d;

	/** The loader. */
	private GeometryAndAppearanceLoader loader;

	/** The canvas. */
	private Canvas3D canvas;

	/** The engine. */
	private J3DEngine engine;
	
	/** The track width. */
	private double trackWidth;
	
	/** The logger. */
	private static Logger logger = Logger.getAnonymousLogger();

	/**
	 * Instantiates a new geometry node factory.
	 * 
	 * @param loader
	 *            the geometry and appearance loader
	 * @param engine
	 *            the engine
	 * @param canvas
	 *            the canvas
	 */
	public J3DNodeFactory(GeometryAndAppearanceLoader loader, J3DEngine engine,
			Canvas3D canvas, double trackWidth) {
		super();
		this.loader = loader;
		this.canvas = canvas;
		this.engine = engine;
		this.trackWidth = trackWidth;
	}

	/**
	 * Builds the Java3D Appearance based on the given Appearance Info.
	 * 
	 * @param appearanceInfo
	 *            the information of how the surface should look like
	 * @return the appearance
	 * @author marius
	 */
	private Appearance buildSurfaceAppearance(Surface surface) 
	{
		Appearance app = new Appearance();
		ColoringAttributes ca = new ColoringAttributes();
		//if surface is color, set coloring attributes
		if (surface instanceof SurfaceColor) 
		{
			SurfaceColor sc = (SurfaceColor) surface;
			ca.setColor((float) sc.getColor().getColorCode().getRed() / 255,
					(float) sc.getColor().getColorCode().getGreen() / 255,
					(float) sc.getColor().getColorCode().getBlue() / 255);
			app.setColoringAttributes(ca);
		} 
		//if surface is texture, load and set texture
		else if (surface instanceof appearance.Texture) 
		{
			try
			{
				String file = ((appearance.Texture) surface).getFileURI();
				Texture tex = new TextureLoader(file, engine).getTexture();
				tex.setEnable(true);
				app.setTexture(tex);
				
				TextureAttributes texAttr = new TextureAttributes();
				texAttr.setTextureMode(TextureAttributes.MODULATE);
				app.setTextureAttributes(texAttr);
			}
			catch (Exception e)
			{
				//display error message and load default appearance
				logger.info("Cannot load texture");
				ColoringAttributes ca2 = new ColoringAttributes();
				ca2.setColor(0f, 0f, 0f);
				app.setColoringAttributes(ca2);
			}
		}
		//else return empty appearance
		return app;

	}
	
	
	/**
	 * Gets the transform3d for a specified shape.
	 *
	 * @param shape the shape
	 * @return the transform3 d
	 * @author marius
	 */
	private Transform3D getTransform3D(appearance.Shape shape)
	{
		//instantiate new empty transforms for rotation and elevation
		Transform3D transforms = new Transform3D();
		Transform3D rotateX = new Transform3D();
		Transform3D rotateY = new Transform3D();
		Transform3D rotateZ = new Transform3D();
		Transform3D elevate = new Transform3D();

		//rotate
		rotateX.rotX(shape.getXRotation());
		rotateY.rotY(shape.getYRotation());
		rotateZ.rotZ(shape.getZRotation());
		
		//elevate
		elevate.setTranslation(new Vector3d(0d,0d,shape.getElevation()));
		
		transforms.mul(transforms, elevate);
		transforms.mul(transforms, rotateX);
		transforms.mul(transforms, rotateY);
		transforms.mul(transforms, rotateZ);
		
		//scale
		transforms.setScale(shape.getScale());
		
		return transforms;
	}

	/**
	 * Gets a Transform Group containing the representation for a specific
	 * appearance label (e.g. 'cube', 'red_train'). If a TranformGroup is
	 * provided, the nodes needed for representation should be added as
	 * children, otherwise a new TransformGroup should be created.
	 * 
	 * @param appearanceLabel
	 *            the appearance label
	 * @param destinationTransformGroup
	 *            the destination transform group, or null if a new Transform
	 *            Group should be created
	 * @return the node containing the representation for the appearance, or
	 *         null, if there is no appearance with the given label.
	 *         
	 * @author marius, ruxandra        
	 * 
	 */
	public TransformGroup buildTransformGroupForShape(appearance.Shape shape,
			TransformGroup transformGroup) 
	{
		//if third parameter is null, create new transform group
		if (transformGroup == null)
		{
			transformGroup = new TransformGroup();
			transformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		}
		//init working transformGroup
		TransformGroup nodeTrans = new TransformGroup();
		nodeTrans.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		
		//if shape
		if (shape instanceof appearance.Shape3D) 
		{
			//get shape3D type
			Object3D type = ((appearance.Shape3D) shape).getType();
			if (type == Object3D.CUBE) 
			{
				//cube
				//get appearance
				Appearance app = buildSurfaceAppearance(shape.getShapeSurface());
				Box model;
				if (app != null)
					//bulid cube with provided appearance
					model = new Box(1f, 1f, 1f, app);
				else
					//build cube with empty appearance
					model = new Box(1f, 1f, 1f, new Appearance());
				nodeTrans.addChild(model);
			}
			else if (type == Object3D.SPHERE) 
			{
				//sphere
				Appearance app = buildSurfaceAppearance(shape.getShapeSurface());
				Sphere model;
				//get appearance
				if (app != null)
					//build sphere with provided appearance
					model = new Sphere(1, app);
				else
					//build sphere with empty appearance
					model = new Sphere(1);
				nodeTrans.addChild(model);
			}
		} 
		//if model
		else if (shape instanceof appearance.Model3D) 
		{
			//get gile URI
			String filepath = ((Model3D) shape).getFileURI();
			Scene s = null;
			ObjectFile f = new ObjectFile();
			f.setFlags(ObjectFile.RESIZE | ObjectFile.TRIANGULATE| ObjectFile.STRIPIFY);

			try 
			{
				//if obj, use default java3d loader
				if(filepath.substring(filepath.length()-3, filepath.length()).equalsIgnoreCase("obj"))
					s = f.load(filepath);
				else if(filepath.substring(filepath.length()-3, filepath.length()).equalsIgnoreCase("3ds")) 
				{
					//use Loader3DS loader
					Loader3DS loader = new Loader3DS();
					s = loader.load(filepath);
				}
				//add to node
				nodeTrans.addChild(s.getSceneGroup()); 
				
				//color only the first element of the 3D model
				Appearance app = buildSurfaceAppearance(shape.getShapeSurface());
				if(filepath.substring(filepath.length()-3, filepath.length()).equalsIgnoreCase("obj")) 
				{
					javax.media.j3d.Shape3D sh = (javax.media.j3d.Shape3D) s.getSceneGroup().getChild(0);
					s.getSceneGroup().removeChild(0);			
					sh.setAppearance(app);
					s.getSceneGroup().addChild(sh);
				}

			} 
			catch (Exception e) 
			{
				//display error message and add default model (cube)
				logger.info("Cannot load model. Loading default appearance.");
				Box model = new Box(1f, 1f, 1f, new Appearance());
				transformGroup.addChild(model);
			}

		} 
		else {
			//if fail, add default model (cube)
			Box model = new Box(1f, 1f, 1f, new Appearance());
			transformGroup.addChild(model);
		}

		//add transforms
		Transform3D transforms = new Transform3D();
		transforms = getTransform3D(shape);
		nodeTrans.setTransform(transforms);

		transformGroup.addChild(nodeTrans);
		
		return transformGroup;
	}

		
	/**
	 * Gets a Transform Group containing the representation for a specific
	 * geometry label (e.g. 'track1'), corresponding to a {@link Track} object.
	 * @param geometryLabel the geometry label
	 * @return the geometry transform group
	 * @author Ruxandra
	 */
	public Node getGeometryTransformGroup(String geometryLabel) {
		TransformGroup g = new TransformGroup();
		Track track = loader.getTrackFromLabel(geometryLabel);
		double distance = 0;
		PathInterpolator pathInterpolator = new BezierPathInterpolator(loader.getTrackPoints(geometryLabel));
		Where start = pathInterpolator.start();
		start = pathInterpolator.findPosition(distance);
		
		Vector2D forward=Vector2D.polar(start.getHeading());
		Vector2D right=forward.normal();
		Vector2D startV=start.getPosition();
	
		//compute the forword vector
		forward.multiply(INTERPOLATION_DIST);
		
		//compute the four points
		Vector2D forwardRight=Vector2D.add(startV,forward).add(new Vector2D(right).multiply(this.trackWidth));
		Vector2D forwardLeft = Vector2D.add(startV,forward).add(new Vector2D(right).multiply(-this.trackWidth));
		Vector2D backRight = Vector2D.add(startV,new Vector2D(right).multiply(this.trackWidth));
		Vector2D backLeft = Vector2D.add(startV,new Vector2D(right).multiply(-this.trackWidth));
		
		//list of quad points
		List<Point3d> points = new ArrayList<Point3d>();
		
		//THE QUAD WILL BE DRAWN COUNTER-CLOCKWISE
		
		//compute the two backpoints and put them as back-left back-right
		Point3d p1 = new Point3d(backRight.getX(), backRight.getY(), DRAWING_PLANE_Z);
		Point3d p2 = new Point3d(backLeft.getX(), backLeft.getY(), DRAWING_PLANE_Z);
		points.add(p2);
		points.add(p1);
		
		//compute the two forward points and put them as front-right front-right
		p1 = new Point3d(forwardRight.getX(), forwardRight.getY(), DRAWING_PLANE_Z);
		p2 = new Point3d(forwardLeft.getX(), forwardLeft.getY(), DRAWING_PLANE_Z);
		points.add(p1);
		points.add(p2);
		
		while (pathInterpolator.getLength() > distance) {
			//add the back-points for the quad
			points.add(p2);
			points.add(p1);
			
			//compute the new forward and right vectors 
			distance = distance + INTERPOLATION_DIST;
			Where current = pathInterpolator.findPosition(distance);
			forward=Vector2D.polar(current.getHeading());
			right=forward.normal();
			startV=current.getPosition();
			forward.multiply(INTERPOLATION_DIST);
			
			//compute the new forward position
			forwardRight=Vector2D.add(startV,forward).add(new Vector2D(right).multiply(this.trackWidth));
			forwardLeft = Vector2D.add(startV,forward).add(new Vector2D(right).multiply(-this.trackWidth));
			
			//add the front-points for the quad
			p1 = new Point3d(forwardRight.getX(), forwardRight.getY(), DRAWING_PLANE_Z);
			p2 = new Point3d(forwardLeft.getX(), forwardLeft.getY(), DRAWING_PLANE_Z);
			points.add(p1);
			points.add(p2);
		}
				
		logger.fine("Number of quads: " + points.size()/4);
		Point3d[] myCoords = new Point3d[points.size()];
		
		//put the list in an array so it can e sent to the quad array
		float[] tcoords = new float[points.size() * 4];
		for(int i = 0; i < points.size(); i++){
			myCoords[i] = points.get(i);
		}
		
		for(int i = 0; i < points.size()/4; i++){
			tcoords [8 * i] = 1;// * (i + 1);
			tcoords [8 * i + 1] = 0;
			tcoords [8 * i + 2] = 0;// * (i + 1);
			tcoords [8 * i + 3] = 0;// * (i + 1);
			tcoords [8 * i + 4] = 0;
			tcoords [8 * i + 5] = 1;// * (i + 1);
			tcoords [8 * i + 6] = 1;
			tcoords [8 * i + 7] = 1;
					
		}
		QuadArray myQuads = new QuadArray(
			    myCoords.length,
			    GeometryArray.COORDINATES | GeometryArray.TEXTURE_COORDINATE_2);
		myQuads.setCoordinates(0, myCoords );
		myQuads.setTextureCoordinates(0, tcoords, 0, points.size());
		//set the appearance of the quads
		Appearance myAppear = new Appearance();
		boolean colorSet = false;
		if (track.getAppearanceLabel() != null) {
			AppearanceInfo color = loader.getAppearanceInfo(track
					.getAppearanceLabel());
			if (color != null && color instanceof Surface) {
				myAppear = buildSurfaceAppearance((appearance.Surface) color);
				colorSet = true;
				
			}
		}
		if (colorSet == false) {
			ColoringAttributes ca = new ColoringAttributes();
			ca.setColor(new Color3f(0.5f, 0.5f, 0.5f));
			myAppear.setColoringAttributes(ca);
		}
		
		//transform the quad to a Shape3d and added it to the TransformGroup
		Shape3D myShape = new Shape3D( myQuads, myAppear);
		g.addChild(myShape);
		return g;
	}
	

	/**
	 * Returns a dynamic branch that contains the representation for a
	 * particular {@link GeometryObject} referenced by the geometryLabel. The
	 * {@link AppearanceInfo} is obtained from the {@link GeometryObject}. The
	 * last parameter defines whether the place is an interactive input, so the
	 * {@link TransformGroup} has associated a InteractiveInput Listener.
	 * 
	 * @param geometryLabel
	 *            the geometry label
	 * @param interactiveInput
	 *            whether it is an interactive input place
	 * @return the geometry branch
	 * @author Marius
	 */
	public DynamicBranch getGeometryBranch(String geometryLabel,
			boolean interactiveInput) 
	{
		BranchGroup branchGroup = new BranchGroup();
		branchGroup.setCapability(BranchGroup.ALLOW_DETACH);
		TransformGroup tg = null;
		SimplePosition sp = this.loader.getSimplePositionObject(geometryLabel);
		Track t = this.loader.getTrackFromLabel(geometryLabel);
		AppearanceInfo appearanceInfo = null;

		if (sp != null)
			// it is a simple position object
			appearanceInfo = this.loader.getAppearanceInfo(sp.getAppearanceLabel());
		else if (t != null)
			// it is a track object
			appearanceInfo = this.loader.getAppearanceInfo(t.getAppearanceLabel());
		
		if (appearanceInfo == null)
		{
			tg = new TransformGroup();
			tg.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
			branchGroup.addChild(tg);
			tg.setPickable(interactiveInput);
			if (interactiveInput)
				return new DynamicInputBranch(branchGroup, tg,
						geometryLabel, engine, canvas);
			return new DynamicBranch(branchGroup, tg);
		}

		if (appearanceInfo instanceof appearance.Shape)
			tg = buildTransformGroupForShape((appearance.Shape) appearanceInfo,	null);

		//get position
		Position position = this.loader.getSimplePositionObject(geometryLabel).getPosition();
		
		//place object at specified position
		Transform3D trans3d = new Transform3D();
		trans3d.setTranslation(new Vector3d(position.getX(), position.getY(),DRAWING_PLANE_Z));
		tg.setTransform(trans3d);
		
		//if inputPlace, setPickable
		tg.setPickable(interactiveInput);
		
		branchGroup.addChild(tg);

		//return dynamic input branc or dynamic branch, depending on the interactiveInput parameter
		DynamicBranch branch = null;
		if (interactiveInput)
			branch = new DynamicInputBranch(branchGroup, tg,
					geometryLabel, engine, canvas);
		else
			branch = new DynamicBranch(branchGroup, tg);
		return branch;
	}

	/**
	 * Returns a dynamic branch that contains the representation for a
	 * particular object according to the {@link AppearanceInfo} corresponding
	 * to the appearanceLabel, but placed at the place defined by the
	 * {@link GeometryObject} referenced by the geometryLabel. If a
	 * {@link DynamicBranch} is given as a parameter, its transform group is
	 * used as a parent for the nodes of the representations. Otherwise, it is
	 * the responsibility of this method to create the Java3D nodes and connect
	 * the {@link TransformGroup} to the {@link BranchGroup}, before putting
	 * them in the {@link DynamicBranch}.
	 * <p>
	 * If the geometry is a Track, the representation is placed at the beginning
	 * of the track. If the geometry is a SimplePosition, the representation is
	 * placed at the corresponding position.
	 * </p>
	 * <p>
	 * If the destination DynamicBranch is not provided, the generated Dynamic
	 * Branch does not have an interactive input listener.
	 * </p>
	 * 
	 * @param appearanceLabel
	 *            the appearance label
	 * @param geometryLabel
	 *            the geometry label
	 * @param destinationBranch
	 *            the branch
	 * @return the geometry branch
	 * @author Marius
	 */
	public DynamicBranch getGeometryBranch(String appearanceLabel,
			String geometryLabel, DynamicBranch destinationBranch) 
	{
		TransformGroup destinationTransformGroup = null;
		BranchGroup destinationBranchGroup;
		//check if destionationBranch is provided and init accordingly
		if (destinationBranch == null) 
		{
			destinationTransformGroup = new TransformGroup();	
			destinationTransformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
			destinationBranchGroup = new BranchGroup();
			destinationBranchGroup.addChild(destinationTransformGroup);
		} 
		else if (destinationBranch.getTransformGroup() != null)
		{
			destinationTransformGroup = destinationBranch.getTransformGroup();
		}
		else
		{
			destinationTransformGroup = new TransformGroup();
			destinationTransformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
			destinationBranch.getBranchGroup().addChild(destinationTransformGroup);
			destinationBranch.setTransformGroup(destinationTransformGroup);
		}
		
		//get appearance info
		AppearanceInfo appearanceInfo = this.loader.getAppearanceInfo(appearanceLabel);
		
		//place at specified position
		Position position = this.loader.getSimplePositionObject(geometryLabel).getPosition();
		Transform3D trans3d = new Transform3D();
		trans3d.setTranslation(new Vector3d(position.getX(), position.getY(),
				DRAWING_PLANE_Z));
		
		if (appearanceInfo instanceof appearance.Shape) 
			buildTransformGroupForShape((appearance.Shape) appearanceInfo,destinationTransformGroup);
		destinationTransformGroup.setTransform(trans3d);
		
		return destinationBranch;

	}

	/**
	 * Gets the token branch representation for a particular object according to
	 * the {@link AppearanceInfo} corresponding to the appearanceLabel.  If a
	 * {@link DynamicBranch} is given as a parameter, its transform group is
	 * used as a parent for the nodes of the representations. Otherwise, it is
	 * the responsibility of this method to create the Java3D nodes and connect
	 * the {@link TransformGroup} to the {@link BranchGroup}, before putting
	 * them in the {@link DynamicBranch}.
	 * @param appearanceLabel
	 *            the label
	 * @return the token branch
	 * @author Marius
	 */
	public DynamicBranch getTokenBranch(String appearanceLabel, DynamicBranch destinationBranch)
	{
        TransformGroup tg;

        // if destinationBranch is null, create a new one
        if (destinationBranch == null) 
        {
            BranchGroup branchGroup = new BranchGroup();
            branchGroup.setCapability(BranchGroup.ALLOW_DETACH);
            branchGroup.setCapability(BranchGroup.ALLOW_CHILDREN_WRITE);
            tg = new TransformGroup();
            tg.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
            branchGroup.addChild(tg);

            destinationBranch = new DynamicBranch(branchGroup, tg);
        } 
        else if (destinationBranch.getTransformGroup() != null) 
        {
            // use existing transform group
            tg = destinationBranch.getTransformGroup();
        } 
        else 
        {
            // create new one
            tg = new TransformGroup();
            tg.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
            destinationBranch.getBranchGroup().addChild(tg);
            destinationBranch.setTransformGroup(tg);
        }
        AppearanceInfo appearanceInfo = this.loader.getAppearanceInfo(appearanceLabel);

        if (appearanceInfo instanceof appearance.Shape) 
            tg = buildTransformGroupForShape((appearance.Shape) appearanceInfo, tg);
        else 
        {
        	Box model = new Box(1f, 1f, 1f, new Appearance());
            tg.addChild(model);
        }

        return destinationBranch;
    }
	
	
	/**
	 * Gets the ground.
	 *
	 * @param x the x
	 * @param y the y
	 * @param size half the length of a side
	 * @return the ground
	 * @author Ruxandra
	 */
	public Node getGround(double x, double y, double size){
		
		logger.fine("Creating ground of size "+size+" at "+x+","+y);
		
		Point3d[] myCoords = new Point3d[4];
		
		//computing the corners of the quad that will be used as ground
		myCoords[0] = new Point3d(x - size, y - size, DRAWING_PLANE_Z-0.5);
		myCoords[3] = new Point3d(x - size, y + size, DRAWING_PLANE_Z-0.5);
		myCoords[2] = new Point3d(x + size, y + size, DRAWING_PLANE_Z-0.5);
		myCoords[1] = new Point3d(x + size, y - size, DRAWING_PLANE_Z-0.5);
		
		//create the new quadarray
		QuadArray myQuads = new QuadArray(
			    myCoords.length,
			    GeometryArray.COORDINATES);
		myQuads.setCoordinates(0, myCoords);
		TransformGroup g = new TransformGroup();
		Appearance myAppear = new Appearance();
		
		//color it green
		ColoringAttributes ca = new ColoringAttributes(0.2f, 0.5f, 0.2f, ColoringAttributes.FASTEST);
		myAppear.setColoringAttributes(ca);
		
		Shape3D myShape = new Shape3D( myQuads, myAppear);
		g.addChild(myShape);
		
		return g;
	}
}
