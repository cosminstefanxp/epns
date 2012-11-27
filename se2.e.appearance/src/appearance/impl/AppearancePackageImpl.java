/**
 */
package appearance.impl;

import appearance.AppearanceFactory;
import appearance.AppearanceInfo;
import appearance.AppearanceModel;
import appearance.AppearancePackage;
import appearance.ColorType;
import appearance.Model3D;
import appearance.Object3D;
import appearance.Shape;
import appearance.Shape3D;
import appearance.Surface;
import appearance.SurfaceColor;
import appearance.Texture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppearancePackageImpl extends EPackageImpl implements AppearancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appearanceInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model3DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shape3DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfaceColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appearanceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum object3DEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see appearance.AppearancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AppearancePackageImpl() {
		super(eNS_URI, AppearanceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AppearancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AppearancePackage init() {
		if (isInited) return (AppearancePackage)EPackage.Registry.INSTANCE.getEPackage(AppearancePackage.eNS_URI);

		// Obtain or create and register package
		AppearancePackageImpl theAppearancePackage = (AppearancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AppearancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AppearancePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAppearancePackage.createPackageContents();

		// Initialize created meta-data
		theAppearancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAppearancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AppearancePackage.eNS_URI, theAppearancePackage);
		return theAppearancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppearanceInfo() {
		return appearanceInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppearanceInfo_Label() {
		return (EAttribute)appearanceInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShape() {
		return shapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShape_ShapeSurface() {
		return (EReference)shapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape_Scale() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape_XRotation() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape_YRotation() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape_ZRotation() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurface() {
		return surfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel3D() {
		return model3DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel3D_File() {
		return (EAttribute)model3DEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShape3D() {
		return shape3DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape3D_Type() {
		return (EAttribute)shape3DEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexture() {
		return textureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture_File() {
		return (EAttribute)textureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurfaceColor() {
		return surfaceColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceColor_Color() {
		return (EAttribute)surfaceColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppearanceModel() {
		return appearanceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppearanceModel_AppearanceInfos() {
		return (EReference)appearanceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObject3D() {
		return object3DEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorType() {
		return colorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppearanceFactory getAppearanceFactory() {
		return (AppearanceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		appearanceInfoEClass = createEClass(APPEARANCE_INFO);
		createEAttribute(appearanceInfoEClass, APPEARANCE_INFO__LABEL);

		shapeEClass = createEClass(SHAPE);
		createEReference(shapeEClass, SHAPE__SHAPE_SURFACE);
		createEAttribute(shapeEClass, SHAPE__SCALE);
		createEAttribute(shapeEClass, SHAPE__XROTATION);
		createEAttribute(shapeEClass, SHAPE__YROTATION);
		createEAttribute(shapeEClass, SHAPE__ZROTATION);

		surfaceEClass = createEClass(SURFACE);

		model3DEClass = createEClass(MODEL3_D);
		createEAttribute(model3DEClass, MODEL3_D__FILE);

		shape3DEClass = createEClass(SHAPE3_D);
		createEAttribute(shape3DEClass, SHAPE3_D__TYPE);

		textureEClass = createEClass(TEXTURE);
		createEAttribute(textureEClass, TEXTURE__FILE);

		surfaceColorEClass = createEClass(SURFACE_COLOR);
		createEAttribute(surfaceColorEClass, SURFACE_COLOR__COLOR);

		appearanceModelEClass = createEClass(APPEARANCE_MODEL);
		createEReference(appearanceModelEClass, APPEARANCE_MODEL__APPEARANCE_INFOS);

		// Create enums
		object3DEEnum = createEEnum(OBJECT3_D);
		colorTypeEEnum = createEEnum(COLOR_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		shapeEClass.getESuperTypes().add(this.getAppearanceInfo());
		surfaceEClass.getESuperTypes().add(this.getAppearanceInfo());
		model3DEClass.getESuperTypes().add(this.getShape());
		shape3DEClass.getESuperTypes().add(this.getShape());
		textureEClass.getESuperTypes().add(this.getSurface());
		surfaceColorEClass.getESuperTypes().add(this.getSurface());

		// Initialize classes and features; add operations and parameters
		initEClass(appearanceInfoEClass, AppearanceInfo.class, "AppearanceInfo", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppearanceInfo_Label(), ecorePackage.getEString(), "label", null, 0, 1, AppearanceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeEClass, Shape.class, "Shape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShape_ShapeSurface(), this.getSurface(), null, "shapeSurface", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShape_Scale(), ecorePackage.getEDouble(), "scale", "1", 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShape_XRotation(), ecorePackage.getEDouble(), "xRotation", "0", 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShape_YRotation(), ecorePackage.getEDouble(), "yRotation", "0", 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShape_ZRotation(), ecorePackage.getEDouble(), "zRotation", "0", 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surfaceEClass, Surface.class, "Surface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(model3DEClass, Model3D.class, "Model3D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel3D_File(), ecorePackage.getEString(), "file", null, 0, 1, Model3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shape3DEClass, Shape3D.class, "Shape3D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShape3D_Type(), this.getObject3D(), "type", null, 0, 1, Shape3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textureEClass, Texture.class, "Texture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTexture_File(), ecorePackage.getEString(), "file", null, 0, 1, Texture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surfaceColorEClass, SurfaceColor.class, "SurfaceColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSurfaceColor_Color(), this.getColorType(), "color", null, 0, 1, SurfaceColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appearanceModelEClass, AppearanceModel.class, "AppearanceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppearanceModel_AppearanceInfos(), this.getAppearanceInfo(), null, "appearanceInfos", null, 0, -1, AppearanceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(object3DEEnum, Object3D.class, "Object3D");
		addEEnumLiteral(object3DEEnum, Object3D.CUBE);
		addEEnumLiteral(object3DEEnum, Object3D.SPHERE);

		initEEnum(colorTypeEEnum, ColorType.class, "ColorType");
		addEEnumLiteral(colorTypeEEnum, ColorType.BLACK);
		addEEnumLiteral(colorTypeEEnum, ColorType.BLUE);
		addEEnumLiteral(colorTypeEEnum, ColorType.CYAN);
		addEEnumLiteral(colorTypeEEnum, ColorType.DARK_GRAY);
		addEEnumLiteral(colorTypeEEnum, ColorType.GRAY);
		addEEnumLiteral(colorTypeEEnum, ColorType.GREEN);
		addEEnumLiteral(colorTypeEEnum, ColorType.LIGHT_GRAY);
		addEEnumLiteral(colorTypeEEnum, ColorType.MAGENTA);
		addEEnumLiteral(colorTypeEEnum, ColorType.ORANGE);
		addEEnumLiteral(colorTypeEEnum, ColorType.PINK);
		addEEnumLiteral(colorTypeEEnum, ColorType.RED);
		addEEnumLiteral(colorTypeEEnum, ColorType.WHITE);
		addEEnumLiteral(colorTypeEEnum, ColorType.YELLOW);

		// Create resource
		createResource(eNS_URI);
	}

} //AppearancePackageImpl
