/**
 */
package extendedpetrinet.impl;

import extendedpetrinet.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedpetrinetFactoryImpl extends EFactoryImpl implements ExtendedpetrinetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtendedpetrinetFactory init() {
		try {
			ExtendedpetrinetFactory theExtendedpetrinetFactory = (ExtendedpetrinetFactory)EPackage.Registry.INSTANCE.getEFactory("http://extendedpetrinet/1.0"); 
			if (theExtendedpetrinetFactory != null) {
				return theExtendedpetrinetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtendedpetrinetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedpetrinetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExtendedpetrinetPackage.EXTENDED_PETRI_NET: return createExtendedPetriNet();
			case ExtendedpetrinetPackage.ARC: return createArc();
			case ExtendedpetrinetPackage.PLACE: return createPlace();
			case ExtendedpetrinetPackage.IDENTITY: return createIdentity();
			case ExtendedpetrinetPackage.IGNORE_ANIMATION: return createIgnoreAnimation();
			case ExtendedpetrinetPackage.INTERACTIVE_INPUT: return createInteractiveInput();
			case ExtendedpetrinetPackage.TOKEN: return createToken();
			case ExtendedpetrinetPackage.ANIMATION_LABEL: return createAnimationLabel();
			case ExtendedpetrinetPackage.INPUT_PLACE_APPEARANCE_LABEL: return createInputPlaceAppearanceLabel();
			case ExtendedpetrinetPackage.GEOMETRY_LABEL: return createGeometryLabel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedPetriNet createExtendedPetriNet() {
		ExtendedPetriNetImpl extendedPetriNet = new ExtendedPetriNetImpl();
		return extendedPetriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity createIdentity() {
		IdentityImpl identity = new IdentityImpl();
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IgnoreAnimation createIgnoreAnimation() {
		IgnoreAnimationImpl ignoreAnimation = new IgnoreAnimationImpl();
		return ignoreAnimation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractiveInput createInteractiveInput() {
		InteractiveInputImpl interactiveInput = new InteractiveInputImpl();
		return interactiveInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationLabel createAnimationLabel() {
		AnimationLabelImpl animationLabel = new AnimationLabelImpl();
		return animationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPlaceAppearanceLabel createInputPlaceAppearanceLabel() {
		InputPlaceAppearanceLabelImpl inputPlaceAppearanceLabel = new InputPlaceAppearanceLabelImpl();
		return inputPlaceAppearanceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryLabel createGeometryLabel() {
		GeometryLabelImpl geometryLabel = new GeometryLabelImpl();
		return geometryLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedpetrinetPackage getExtendedpetrinetPackage() {
		return (ExtendedpetrinetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExtendedpetrinetPackage getPackage() {
		return ExtendedpetrinetPackage.eINSTANCE;
	}

} //ExtendedpetrinetFactoryImpl
