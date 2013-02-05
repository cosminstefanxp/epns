/**
 */
package extendedpetrinet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

import animations.AnimationsPackage;
import extendedpetrinet.AnimationLabel;
import extendedpetrinet.Arc;
import extendedpetrinet.ExtendedPetriNet;
import extendedpetrinet.ExtendedpetrinetFactory;
import extendedpetrinet.ExtendedpetrinetPackage;
import extendedpetrinet.GeometryLabel;
import extendedpetrinet.Identity;
import extendedpetrinet.InputPlaceAppearance;
import extendedpetrinet.InteractiveInput;
import extendedpetrinet.Place;
import extendedpetrinet.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedpetrinetPackageImpl extends EPackageImpl implements ExtendedpetrinetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedPetriNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactiveInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animationLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPlaceAppearanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryLabelEClass = null;

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
	 * @see extendedpetrinet.ExtendedpetrinetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtendedpetrinetPackageImpl() {
		super(eNS_URI, ExtendedpetrinetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExtendedpetrinetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtendedpetrinetPackage init() {
		if (isInited) return (ExtendedpetrinetPackage)EPackage.Registry.INSTANCE.getEPackage(ExtendedpetrinetPackage.eNS_URI);

		// Obtain or create and register package
		ExtendedpetrinetPackageImpl theExtendedpetrinetPackage = (ExtendedpetrinetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtendedpetrinetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtendedpetrinetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AnimationsPackage.eINSTANCE.eClass();
		StructuredpntypemodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExtendedpetrinetPackage.createPackageContents();

		// Initialize created meta-data
		theExtendedpetrinetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtendedpetrinetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExtendedpetrinetPackage.eNS_URI, theExtendedpetrinetPackage);
		return theExtendedpetrinetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedPetriNet() {
		return extendedPetriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Identity() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_InteractiveInput() {
		return (EReference)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Animations() {
		return (EReference)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Tokens() {
		return (EReference)placeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Appearance() {
		return (EReference)placeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_GeometryLabel() {
		return (EReference)placeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentity() {
		return identityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentity_Text() {
		return (EAttribute)identityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractiveInput() {
		return interactiveInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractiveInput_Text() {
		return (EAttribute)interactiveInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Text() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimationLabel() {
		return animationLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationLabel_Structure() {
		return (EReference)animationLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPlaceAppearance() {
		return inputPlaceAppearanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPlaceAppearance_Text() {
		return (EAttribute)inputPlaceAppearanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometryLabel() {
		return geometryLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryLabel_Text() {
		return (EAttribute)geometryLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedpetrinetFactory getExtendedpetrinetFactory() {
		return (ExtendedpetrinetFactory)getEFactoryInstance();
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
		extendedPetriNetEClass = createEClass(EXTENDED_PETRI_NET);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__IDENTITY);

		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__INTERACTIVE_INPUT);
		createEReference(placeEClass, PLACE__ANIMATIONS);
		createEReference(placeEClass, PLACE__TOKENS);
		createEReference(placeEClass, PLACE__APPEARANCE);
		createEReference(placeEClass, PLACE__GEOMETRY_LABEL);

		identityEClass = createEClass(IDENTITY);
		createEAttribute(identityEClass, IDENTITY__TEXT);

		interactiveInputEClass = createEClass(INTERACTIVE_INPUT);
		createEAttribute(interactiveInputEClass, INTERACTIVE_INPUT__TEXT);

		tokenEClass = createEClass(TOKEN);
		createEAttribute(tokenEClass, TOKEN__TEXT);

		animationLabelEClass = createEClass(ANIMATION_LABEL);
		createEReference(animationLabelEClass, ANIMATION_LABEL__STRUCTURE);

		inputPlaceAppearanceEClass = createEClass(INPUT_PLACE_APPEARANCE);
		createEAttribute(inputPlaceAppearanceEClass, INPUT_PLACE_APPEARANCE__TEXT);

		geometryLabelEClass = createEClass(GEOMETRY_LABEL);
		createEAttribute(geometryLabelEClass, GEOMETRY_LABEL__TEXT);
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
		PnmlcoremodelPackage thePnmlcoremodelPackage = (PnmlcoremodelPackage)EPackage.Registry.INSTANCE.getEPackage(PnmlcoremodelPackage.eNS_URI);
		StructuredpntypemodelPackage theStructuredpntypemodelPackage = (StructuredpntypemodelPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredpntypemodelPackage.eNS_URI);
		AnimationsPackage theAnimationsPackage = (AnimationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnimationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		extendedPetriNetEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPetriNetType());
		arcEClass.getESuperTypes().add(thePnmlcoremodelPackage.getArc());
		placeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPlace());
		identityEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		interactiveInputEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		tokenEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());
		animationLabelEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getStructuredLabel());
		inputPlaceAppearanceEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());
		geometryLabelEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());

		// Initialize classes and features; add operations and parameters
		initEClass(extendedPetriNetEClass, ExtendedPetriNet.class, "ExtendedPetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Identity(), this.getIdentity(), null, "identity", null, 0, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlace_InteractiveInput(), this.getInteractiveInput(), null, "interactiveInput", null, 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_Animations(), this.getAnimationLabel(), null, "animations", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_Tokens(), this.getToken(), null, "tokens", null, 0, -1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_Appearance(), this.getInputPlaceAppearance(), null, "appearance", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_GeometryLabel(), this.getGeometryLabel(), null, "geometryLabel", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identityEClass, Identity.class, "Identity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentity_Text(), ecorePackage.getEInt(), "text", null, 0, 1, Identity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactiveInputEClass, InteractiveInput.class, "InteractiveInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteractiveInput_Text(), ecorePackage.getEBoolean(), "text", "false", 0, 1, InteractiveInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToken_Text(), ecorePackage.getEString(), "text", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(animationLabelEClass, AnimationLabel.class, "AnimationLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnimationLabel_Structure(), theAnimationsPackage.getAnimation(), null, "structure", null, 1, 1, AnimationLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputPlaceAppearanceEClass, InputPlaceAppearance.class, "InputPlaceAppearance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputPlaceAppearance_Text(), ecorePackage.getEString(), "text", null, 0, 1, InputPlaceAppearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometryLabelEClass, GeometryLabel.class, "GeometryLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeometryLabel_Text(), ecorePackage.getEString(), "text", null, 0, 1, GeometryLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ExtendedpetrinetPackageImpl
