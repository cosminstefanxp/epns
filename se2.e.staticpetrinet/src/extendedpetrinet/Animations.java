/**
 */
package extendedpetrinet;

import animations.Animation;

import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link extendedpetrinet.Animations#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see extendedpetrinet.ExtendedpetrinetPackage#getAnimations()
 * @model
 * @generated
 */
public interface Animations extends StructuredLabel {
	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(Animation)
	 * @see extendedpetrinet.ExtendedpetrinetPackage#getAnimations_Structure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Animation getStructure();

	/**
	 * Sets the value of the '{@link extendedpetrinet.Animations#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(Animation value);

} // Animations
