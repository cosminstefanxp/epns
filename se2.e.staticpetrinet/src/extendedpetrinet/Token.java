/**
 */
package extendedpetrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link extendedpetrinet.Token#getAppearance <em>Appearance</em>}</li>
 * </ul>
 * </p>
 *
 * @see extendedpetrinet.ExtendedpetrinetPackage#getToken()
 * @model
 * @generated
 */
public interface Token extends org.pnml.tools.epnk.pnmlcoremodel.Object {
	/**
	 * Returns the value of the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance</em>' containment reference.
	 * @see #setAppearance(AppearanceLabel)
	 * @see extendedpetrinet.ExtendedpetrinetPackage#getToken_Appearance()
	 * @model containment="true"
	 * @generated
	 */
	AppearanceLabel getAppearance();

	/**
	 * Sets the value of the '{@link extendedpetrinet.Token#getAppearance <em>Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance</em>' containment reference.
	 * @see #getAppearance()
	 * @generated
	 */
	void setAppearance(AppearanceLabel value);

} // Token
