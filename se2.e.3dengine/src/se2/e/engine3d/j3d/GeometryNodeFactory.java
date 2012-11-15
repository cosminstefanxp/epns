package se2.e.engine3d.j3d;

import java.util.logging.Logger;

import javax.media.j3d.LineArray;
import javax.media.j3d.Node;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Point3d;

import org.eclipse.emf.common.util.EList;

import com.sun.j3d.utils.geometry.ColorCube;

import se2.e.engine3d.GeometryAndAppearanceLoader;
import se2.e.geometry.GeometryObject;
import se2.e.geometry.Position;
import se2.e.geometry.Track;
import se2.e.geometry.TrackPosition;

/**
 * A factory for creating nodes containing the representation for the geometry.
 * 
 * @author cosmin
 */
public class GeometryNodeFactory {

	/** The Constant DRAWING_PLANE_Z. */
	private static final double DRAWING_PLANE_Z = 0d;

	/** The loader. */
	private GeometryAndAppearanceLoader loader;

	/**
	 * Instantiates a new geometry node factory.
	 * 
	 * @param loader the loader
	 */
	public GeometryNodeFactory(GeometryAndAppearanceLoader loader) {
		super();
		this.loader = loader;
	}

	/**
	 * Gets the geometry node (could be, for example, a Transform Group) for a specific label (e.g. 'track1').
	 * 
	 * @param geometryLabel the geometry label
	 * @return the node containing the representation for the geometry, or null, if there is no geometry with the given
	 * label or it's not a static GeometryObject (Track).
	 */
	public Node getGeometryNode(String geometryLabel) {
		// Get the track and its coordinates
		Track track = loader.getTrackObject(geometryLabel);
		if (track == null)
			return null;
		TrackPosition firstPoint = track.getStartPosition();
		TrackPosition lastPoint = track.getEndPosition();
		EList<Position> intermediatePoints = track.getIntermediatePositions();
		Logger.getAnonymousLogger().info("Generating " + geometryLabel + " of size " + (intermediatePoints.size() + 2));

		// Prepare the points of the tracks
		LineArray lineArr = new LineArray(intermediatePoints.size() * 2 + 2, LineArray.COORDINATES);
		lineArr.setCoordinate(0, new Point3d(firstPoint.getPosition().getX(), firstPoint.getPosition().getY(),
				DRAWING_PLANE_Z));
		int cur_index = 1;
		for (Position pos : intermediatePoints) {
			// Add each point twice, as it will be both an endpoint for a line and a startpoint for the next one
			lineArr.setCoordinate(cur_index++, new Point3d(pos.getX(), pos.getY(), DRAWING_PLANE_Z));
			lineArr.setCoordinate(cur_index++, new Point3d(pos.getX(), pos.getY(), DRAWING_PLANE_Z));
		}
		lineArr.setCoordinate(cur_index, new Point3d(lastPoint.getPosition().getX(), lastPoint
				.getPosition().getY(), DRAWING_PLANE_Z));

		// Add the line to the track group
		TransformGroup g = new TransformGroup();
		g.addChild(new Shape3D(lineArr));
		g.addChild(new ColorCube(30));
		return g;
	}
}
