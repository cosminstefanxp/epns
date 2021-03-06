/**
 */
package extendedpetrinet;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactive Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link extendedpetrinet.InteractiveInput#isText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see extendedpetrinet.ExtendedpetrinetPackage#getInteractiveInput()
 * @model
 * @generated
 */
public interface InteractiveInput extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(boolean)
	 * @see extendedpetrinet.ExtendedpetrinetPackage#getInteractiveInput_Text()
	 * @model default="false"
	 * @generated
	 */
	boolean isText();

	/**
	 * Sets the value of the '{@link extendedpetrinet.InteractiveInput#isText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #isText()
	 * @generated
	 */
	void setText(boolean value);

} // InteractiveInput
