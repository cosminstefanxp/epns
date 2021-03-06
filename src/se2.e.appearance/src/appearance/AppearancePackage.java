/**
 */
package appearance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see appearance.AppearanceFactory
 * @model kind="package"
 * @generated
 */
public interface AppearancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "appearance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://appearance/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "appearance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppearancePackage eINSTANCE = appearance.impl.AppearancePackageImpl.init();

	/**
	 * The meta object id for the '{@link appearance.impl.AppearanceInfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see appearance.impl.AppearanceInfoImpl
	 * @see appearance.impl.AppearancePackageImpl#getAppearanceInfo()
	 * @generated
	 */
	int APPEARANCE_INFO = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_INFO__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_INFO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link appearance.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see appearance.impl.ShapeImpl
	 * @see appearance.impl.AppearancePackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LABEL = APPEARANCE_INFO__LABEL;

	/**
	 * The feature id for the '<em><b>Shape Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__SHAPE_SURFACE = APPEARANCE_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__SCALE = APPEARANCE_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__XROTATION = APPEARANCE_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>YRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__YROTATION = APPEARANCE_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ZRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ZROTATION = APPEARANCE_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ELEVATION = APPEARANCE_INFO_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = APPEARANCE_INFO_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link appearance.impl.SurfaceImpl <em>Surface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see appearance.impl.SurfaceImpl
	 * @see appearance.impl.AppearancePackageImpl#getSurface()
	 * @generated
	 */
	int SURFACE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE__LABEL = APPEARANCE_INFO__LABEL;

	/**
	 * The number of structural features of the '<em>Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_FEATURE_COUNT = APPEARANCE_INFO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link appearance.impl.Model3DImpl <em>Model3 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see appearance.impl.Model3DImpl
	 * @see appearance.impl.AppearancePackageImpl#getModel3D()
	 * @generated
	 */
	int MODEL3_D = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL3_D__LABEL = SHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Shape Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL3_D__SHAPE_SURFACE = SHAPE__SHAPE_SURFACE;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL3_D__SCALE = SHAPE__SCALE;

	/**
	 * The feature id for the '<em><b>XRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL3_D__XROTATION = SHAPE__XROTATION;

	/**
	 * The feature id for the '<em><b>YRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL3_D__YROTATION = SHAPE__YROTATION;

	/**
	 * The feature id for the '<em><b>ZRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL3_D__ZROTATION = SHAPE__ZROTATION;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL3_D__ELEVATION = SHAPE__ELEVATION;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL3_D__FILE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model3 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL3_D_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link appearance.impl.Shape3DImpl <em>Shape3 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see appearance.impl.Shape3DImpl
	 * @see appearance.impl.AppearancePackageImpl#getShape3D()
	 * @generated
	 */
	int SHAPE3_D = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE3_D__LABEL = SHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Shape Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE3_D__SHAPE_SURFACE = SHAPE__SHAPE_SURFACE;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE3_D__SCALE = SHAPE__SCALE;

	/**
	 * The feature id for the '<em><b>XRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE3_D__XROTATION = SHAPE__XROTATION;

	/**
	 * The feature id for the '<em><b>YRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE3_D__YROTATION = SHAPE__YROTATION;

	/**
	 * The feature id for the '<em><b>ZRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE3_D__ZROTATION = SHAPE__ZROTATION;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE3_D__ELEVATION = SHAPE__ELEVATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE3_D__TYPE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shape3 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE3_D_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link appearance.impl.TextureImpl <em>Texture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see appearance.impl.TextureImpl
	 * @see appearance.impl.AppearancePackageImpl#getTexture()
	 * @generated
	 */
	int TEXTURE = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE__LABEL = SURFACE__LABEL;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE__FILE = SURFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Texture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_FEATURE_COUNT = SURFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link appearance.impl.SurfaceColorImpl <em>Surface Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see appearance.impl.SurfaceColorImpl
	 * @see appearance.impl.AppearancePackageImpl#getSurfaceColor()
	 * @generated
	 */
	int SURFACE_COLOR = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_COLOR__LABEL = SURFACE__LABEL;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_COLOR__COLOR = SURFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Surface Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_COLOR_FEATURE_COUNT = SURFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link appearance.impl.AppearanceModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see appearance.impl.AppearanceModelImpl
	 * @see appearance.impl.AppearancePackageImpl#getAppearanceModel()
	 * @generated
	 */
	int APPEARANCE_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Appearance Infos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_MODEL__APPEARANCE_INFOS = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_MODEL__ID = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link appearance.Object3D <em>Object3 D</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see appearance.Object3D
	 * @see appearance.impl.AppearancePackageImpl#getObject3D()
	 * @generated
	 */
	int OBJECT3_D = 8;

	/**
	 * The meta object id for the '{@link appearance.ColorType <em>Color Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see appearance.ColorType
	 * @see appearance.impl.AppearancePackageImpl#getColorType()
	 * @generated
	 */
	int COLOR_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link appearance.AppearanceInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info</em>'.
	 * @see appearance.AppearanceInfo
	 * @generated
	 */
	EClass getAppearanceInfo();

	/**
	 * Returns the meta object for the attribute '{@link appearance.AppearanceInfo#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see appearance.AppearanceInfo#getLabel()
	 * @see #getAppearanceInfo()
	 * @generated
	 */
	EAttribute getAppearanceInfo_Label();

	/**
	 * Returns the meta object for class '{@link appearance.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see appearance.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the containment reference '{@link appearance.Shape#getShapeSurface <em>Shape Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape Surface</em>'.
	 * @see appearance.Shape#getShapeSurface()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_ShapeSurface();

	/**
	 * Returns the meta object for the attribute '{@link appearance.Shape#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see appearance.Shape#getScale()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Scale();

	/**
	 * Returns the meta object for the attribute '{@link appearance.Shape#getXRotation <em>XRotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XRotation</em>'.
	 * @see appearance.Shape#getXRotation()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_XRotation();

	/**
	 * Returns the meta object for the attribute '{@link appearance.Shape#getYRotation <em>YRotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YRotation</em>'.
	 * @see appearance.Shape#getYRotation()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_YRotation();

	/**
	 * Returns the meta object for the attribute '{@link appearance.Shape#getZRotation <em>ZRotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZRotation</em>'.
	 * @see appearance.Shape#getZRotation()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_ZRotation();

	/**
	 * Returns the meta object for the attribute '{@link appearance.Shape#getElevation <em>Elevation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevation</em>'.
	 * @see appearance.Shape#getElevation()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Elevation();

	/**
	 * Returns the meta object for class '{@link appearance.Surface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface</em>'.
	 * @see appearance.Surface
	 * @generated
	 */
	EClass getSurface();

	/**
	 * Returns the meta object for class '{@link appearance.Model3D <em>Model3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model3 D</em>'.
	 * @see appearance.Model3D
	 * @generated
	 */
	EClass getModel3D();

	/**
	 * Returns the meta object for the attribute '{@link appearance.Model3D#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see appearance.Model3D#getFile()
	 * @see #getModel3D()
	 * @generated
	 */
	EAttribute getModel3D_File();

	/**
	 * Returns the meta object for class '{@link appearance.Shape3D <em>Shape3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape3 D</em>'.
	 * @see appearance.Shape3D
	 * @generated
	 */
	EClass getShape3D();

	/**
	 * Returns the meta object for the attribute '{@link appearance.Shape3D#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see appearance.Shape3D#getType()
	 * @see #getShape3D()
	 * @generated
	 */
	EAttribute getShape3D_Type();

	/**
	 * Returns the meta object for class '{@link appearance.Texture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Texture</em>'.
	 * @see appearance.Texture
	 * @generated
	 */
	EClass getTexture();

	/**
	 * Returns the meta object for the attribute '{@link appearance.Texture#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see appearance.Texture#getFile()
	 * @see #getTexture()
	 * @generated
	 */
	EAttribute getTexture_File();

	/**
	 * Returns the meta object for class '{@link appearance.SurfaceColor <em>Surface Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface Color</em>'.
	 * @see appearance.SurfaceColor
	 * @generated
	 */
	EClass getSurfaceColor();

	/**
	 * Returns the meta object for the attribute '{@link appearance.SurfaceColor#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see appearance.SurfaceColor#getColor()
	 * @see #getSurfaceColor()
	 * @generated
	 */
	EAttribute getSurfaceColor_Color();

	/**
	 * Returns the meta object for class '{@link appearance.AppearanceModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see appearance.AppearanceModel
	 * @generated
	 */
	EClass getAppearanceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link appearance.AppearanceModel#getAppearanceInfos <em>Appearance Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Appearance Infos</em>'.
	 * @see appearance.AppearanceModel#getAppearanceInfos()
	 * @see #getAppearanceModel()
	 * @generated
	 */
	EReference getAppearanceModel_AppearanceInfos();

	/**
	 * Returns the meta object for the attribute '{@link appearance.AppearanceModel#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see appearance.AppearanceModel#getID()
	 * @see #getAppearanceModel()
	 * @generated
	 */
	EAttribute getAppearanceModel_ID();

	/**
	 * Returns the meta object for enum '{@link appearance.Object3D <em>Object3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object3 D</em>'.
	 * @see appearance.Object3D
	 * @generated
	 */
	EEnum getObject3D();

	/**
	 * Returns the meta object for enum '{@link appearance.ColorType <em>Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Type</em>'.
	 * @see appearance.ColorType
	 * @generated
	 */
	EEnum getColorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AppearanceFactory getAppearanceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link appearance.impl.AppearanceInfoImpl <em>Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see appearance.impl.AppearanceInfoImpl
		 * @see appearance.impl.AppearancePackageImpl#getAppearanceInfo()
		 * @generated
		 */
		EClass APPEARANCE_INFO = eINSTANCE.getAppearanceInfo();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_INFO__LABEL = eINSTANCE.getAppearanceInfo_Label();

		/**
		 * The meta object literal for the '{@link appearance.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see appearance.impl.ShapeImpl
		 * @see appearance.impl.AppearancePackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Shape Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__SHAPE_SURFACE = eINSTANCE.getShape_ShapeSurface();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__SCALE = eINSTANCE.getShape_Scale();

		/**
		 * The meta object literal for the '<em><b>XRotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__XROTATION = eINSTANCE.getShape_XRotation();

		/**
		 * The meta object literal for the '<em><b>YRotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__YROTATION = eINSTANCE.getShape_YRotation();

		/**
		 * The meta object literal for the '<em><b>ZRotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__ZROTATION = eINSTANCE.getShape_ZRotation();

		/**
		 * The meta object literal for the '<em><b>Elevation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__ELEVATION = eINSTANCE.getShape_Elevation();

		/**
		 * The meta object literal for the '{@link appearance.impl.SurfaceImpl <em>Surface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see appearance.impl.SurfaceImpl
		 * @see appearance.impl.AppearancePackageImpl#getSurface()
		 * @generated
		 */
		EClass SURFACE = eINSTANCE.getSurface();

		/**
		 * The meta object literal for the '{@link appearance.impl.Model3DImpl <em>Model3 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see appearance.impl.Model3DImpl
		 * @see appearance.impl.AppearancePackageImpl#getModel3D()
		 * @generated
		 */
		EClass MODEL3_D = eINSTANCE.getModel3D();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL3_D__FILE = eINSTANCE.getModel3D_File();

		/**
		 * The meta object literal for the '{@link appearance.impl.Shape3DImpl <em>Shape3 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see appearance.impl.Shape3DImpl
		 * @see appearance.impl.AppearancePackageImpl#getShape3D()
		 * @generated
		 */
		EClass SHAPE3_D = eINSTANCE.getShape3D();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE3_D__TYPE = eINSTANCE.getShape3D_Type();

		/**
		 * The meta object literal for the '{@link appearance.impl.TextureImpl <em>Texture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see appearance.impl.TextureImpl
		 * @see appearance.impl.AppearancePackageImpl#getTexture()
		 * @generated
		 */
		EClass TEXTURE = eINSTANCE.getTexture();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE__FILE = eINSTANCE.getTexture_File();

		/**
		 * The meta object literal for the '{@link appearance.impl.SurfaceColorImpl <em>Surface Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see appearance.impl.SurfaceColorImpl
		 * @see appearance.impl.AppearancePackageImpl#getSurfaceColor()
		 * @generated
		 */
		EClass SURFACE_COLOR = eINSTANCE.getSurfaceColor();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURFACE_COLOR__COLOR = eINSTANCE.getSurfaceColor_Color();

		/**
		 * The meta object literal for the '{@link appearance.impl.AppearanceModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see appearance.impl.AppearanceModelImpl
		 * @see appearance.impl.AppearancePackageImpl#getAppearanceModel()
		 * @generated
		 */
		EClass APPEARANCE_MODEL = eINSTANCE.getAppearanceModel();

		/**
		 * The meta object literal for the '<em><b>Appearance Infos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE_MODEL__APPEARANCE_INFOS = eINSTANCE.getAppearanceModel_AppearanceInfos();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_MODEL__ID = eINSTANCE.getAppearanceModel_ID();

		/**
		 * The meta object literal for the '{@link appearance.Object3D <em>Object3 D</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see appearance.Object3D
		 * @see appearance.impl.AppearancePackageImpl#getObject3D()
		 * @generated
		 */
		EEnum OBJECT3_D = eINSTANCE.getObject3D();

		/**
		 * The meta object literal for the '{@link appearance.ColorType <em>Color Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see appearance.ColorType
		 * @see appearance.impl.AppearancePackageImpl#getColorType()
		 * @generated
		 */
		EEnum COLOR_TYPE = eINSTANCE.getColorType();

	}

} //AppearancePackage
