/**
 */
package geometry;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geometry.SimplePosition#getPosition <em>Position</em>}</li>
 *   <li>{@link geometry.SimplePosition#getAppearanceLabel <em>Appearance Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry.GeometryPackage#getSimplePosition()
 * @model
 * @generated
 */
public interface SimplePosition extends GeometryObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see geometry.GeometryPackage#getSimplePosition_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link geometry.SimplePosition#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Appearance Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance Label</em>' attribute.
	 * @see #setAppearanceLabel(String)
	 * @see geometry.GeometryPackage#getSimplePosition_AppearanceLabel()
	 * @model
	 * @generated
	 */
	String getAppearanceLabel();

	/**
	 * Sets the value of the '{@link geometry.SimplePosition#getAppearanceLabel <em>Appearance Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance Label</em>' attribute.
	 * @see #getAppearanceLabel()
	 * @generated
	 */
	void setAppearanceLabel(String value);

} // SimplePosition
