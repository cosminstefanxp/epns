/**
 */
package extendedpetrinet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see extendedpetrinet.ExtendedpetrinetPackage
 * @generated
 */
public interface ExtendedpetrinetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtendedpetrinetFactory eINSTANCE = extendedpetrinet.impl.ExtendedpetrinetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Extended Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Petri Net</em>'.
	 * @generated
	 */
	ExtendedPetriNet createExtendedPetriNet();

	/**
	 * Returns a new object of class '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arc</em>'.
	 * @generated
	 */
	Arc createArc();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity</em>'.
	 * @generated
	 */
	Identity createIdentity();

	/**
	 * Returns a new object of class '<em>Interactive Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interactive Input</em>'.
	 * @generated
	 */
	InteractiveInput createInteractiveInput();

	/**
	 * Returns a new object of class '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token</em>'.
	 * @generated
	 */
	Token createToken();

	/**
	 * Returns a new object of class '<em>Animation Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animation Label</em>'.
	 * @generated
	 */
	AnimationLabel createAnimationLabel();

	/**
	 * Returns a new object of class '<em>Input Place Appearance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Place Appearance</em>'.
	 * @generated
	 */
	InputPlaceAppearance createInputPlaceAppearance();

	/**
	 * Returns a new object of class '<em>Geometry Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geometry Label</em>'.
	 * @generated
	 */
	GeometryLabel createGeometryLabel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtendedpetrinetPackage getExtendedpetrinetPackage();

} //ExtendedpetrinetFactory
