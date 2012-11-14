/**
 */
package extendedpetrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link extendedpetrinet.Arc#getIgnoreAnimation <em>Ignore Animation</em>}</li>
 *   <li>{@link extendedpetrinet.Arc#getIdentity <em>Identity</em>}</li>
 * </ul>
 * </p>
 *
 * @see extendedpetrinet.ExtendedpetrinetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends org.pnml.tools.epnk.pnmlcoremodel.Arc {
	/**
	 * Returns the value of the '<em><b>Ignore Animation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Animation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Animation</em>' containment reference.
	 * @see #setIgnoreAnimation(IgnoreAnimation)
	 * @see extendedpetrinet.ExtendedpetrinetPackage#getArc_IgnoreAnimation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IgnoreAnimation getIgnoreAnimation();

	/**
	 * Sets the value of the '{@link extendedpetrinet.Arc#getIgnoreAnimation <em>Ignore Animation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Animation</em>' containment reference.
	 * @see #getIgnoreAnimation()
	 * @generated
	 */
	void setIgnoreAnimation(IgnoreAnimation value);

	/**
	 * Returns the value of the '<em><b>Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' containment reference.
	 * @see #setIdentity(Identity)
	 * @see extendedpetrinet.ExtendedpetrinetPackage#getArc_Identity()
	 * @model containment="true"
	 * @generated
	 */
	Identity getIdentity();

	/**
	 * Sets the value of the '{@link extendedpetrinet.Arc#getIdentity <em>Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' containment reference.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(Identity value);

} // Arc
