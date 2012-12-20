/**
 */
package tester;

import org.eclipse.emf.ecore.EObject;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tester.Tester#getPetrinet <em>Petrinet</em>}</li>
 * </ul>
 * </p>
 *
 * @see tester.TesterPackage#getTester()
 * @model
 * @generated
 */
public interface Tester extends EObject {
	/**
	 * Returns the value of the '<em><b>Petrinet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet</em>' reference.
	 * @see #setPetrinet(PetriNetDoc)
	 * @see tester.TesterPackage#getTester_Petrinet()
	 * @model
	 * @generated
	 */
	PetriNetDoc getPetrinet();

	/**
	 * Sets the value of the '{@link tester.Tester#getPetrinet <em>Petrinet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petrinet</em>' reference.
	 * @see #getPetrinet()
	 * @generated
	 */
	void setPetrinet(PetriNetDoc value);

} // Tester
