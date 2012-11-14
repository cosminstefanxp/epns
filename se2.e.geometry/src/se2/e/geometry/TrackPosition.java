/**
 */
package se2.e.geometry;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se2.e.geometry.TrackPosition#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see se2.e.geometry.GeometryPackage#getTrackPosition()
 * @model
 * @generated
 */
public interface TrackPosition extends GeometryObject {
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
	 * @see se2.e.geometry.GeometryPackage#getTrackPosition_Position()
	 * @model containment="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link se2.e.geometry.TrackPosition#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

} // TrackPosition
