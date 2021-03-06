/**
 */
package se2.e.configurator.impl;

import appearance.AppearancePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import se2.e.configurator.Configurator;
import se2.e.configurator.ConfiguratorFactory;
import se2.e.configurator.ConfiguratorPackage;

import se2.e.geometry.GeometryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfiguratorPackageImpl extends EPackageImpl implements ConfiguratorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configuratorEClass = null;

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
	 * @see se2.e.configurator.ConfiguratorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfiguratorPackageImpl() {
		super(eNS_URI, ConfiguratorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConfiguratorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfiguratorPackage init() {
		if (isInited) return (ConfiguratorPackage)EPackage.Registry.INSTANCE.getEPackage(ConfiguratorPackage.eNS_URI);

		// Obtain or create and register package
		ConfiguratorPackageImpl theConfiguratorPackage = (ConfiguratorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfiguratorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfiguratorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AppearancePackage.eINSTANCE.eClass();
		GeometryPackage.eINSTANCE.eClass();
		PnmlcoremodelPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConfiguratorPackage.createPackageContents();

		// Initialize created meta-data
		theConfiguratorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfiguratorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfiguratorPackage.eNS_URI, theConfiguratorPackage);
		return theConfiguratorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurator() {
		return configuratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurator_Geometry() {
		return (EReference)configuratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurator_Appearance() {
		return (EReference)configuratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurator_Petrinet() {
		return (EReference)configuratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurator_DefaultTrackWidth() {
		return (EAttribute)configuratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfiguratorFactory getConfiguratorFactory() {
		return (ConfiguratorFactory)getEFactoryInstance();
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
		configuratorEClass = createEClass(CONFIGURATOR);
		createEReference(configuratorEClass, CONFIGURATOR__GEOMETRY);
		createEReference(configuratorEClass, CONFIGURATOR__APPEARANCE);
		createEReference(configuratorEClass, CONFIGURATOR__PETRINET);
		createEAttribute(configuratorEClass, CONFIGURATOR__DEFAULT_TRACK_WIDTH);
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

		// Obtain other dependent packages
		GeometryPackage theGeometryPackage = (GeometryPackage)EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI);
		AppearancePackage theAppearancePackage = (AppearancePackage)EPackage.Registry.INSTANCE.getEPackage(AppearancePackage.eNS_URI);
		PnmlcoremodelPackage thePnmlcoremodelPackage = (PnmlcoremodelPackage)EPackage.Registry.INSTANCE.getEPackage(PnmlcoremodelPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(configuratorEClass, Configurator.class, "Configurator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurator_Geometry(), theGeometryPackage.getGeometry(), null, "geometry", null, 1, 1, Configurator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurator_Appearance(), theAppearancePackage.getAppearanceModel(), null, "appearance", null, 1, 1, Configurator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurator_Petrinet(), thePnmlcoremodelPackage.getPetriNetDoc(), null, "petrinet", null, 1, 1, Configurator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurator_DefaultTrackWidth(), theXMLTypePackage.getDouble(), "defaultTrackWidth", "1.0", 0, 1, Configurator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ConfiguratorPackageImpl
