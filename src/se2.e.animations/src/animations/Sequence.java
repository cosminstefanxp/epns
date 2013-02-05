/**
 */
package animations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link animations.Sequence#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see animations.AnimationsPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends Animation {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link animations.Animation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see animations.AnimationsPackage#getSequence_Components()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Animation> getComponents();

} // Sequence
