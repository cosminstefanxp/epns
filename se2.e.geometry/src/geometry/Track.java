/**
 */
package geometry;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geometry.Track#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link geometry.Track#getEndPosition <em>End Position</em>}</li>
 *   <li>{@link geometry.Track#getIntermediatePositions <em>Intermediate Positions</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry.GeometryPackage#getTrack()
 * @model
 * @generated
 */
public interface Track extends GeometryObject {
	/**
	 * Returns the value of the '<em><b>Start Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Position</em>' reference.
	 * @see #setStartPosition(trackPosition)
	 * @see geometry.GeometryPackage#getTrack_StartPosition()
	 * @model required="true"
	 * @generated
	 */
	trackPosition getStartPosition();

	/**
	 * Sets the value of the '{@link geometry.Track#getStartPosition <em>Start Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Position</em>' reference.
	 * @see #getStartPosition()
	 * @generated
	 */
	void setStartPosition(trackPosition value);

	/**
	 * Returns the value of the '<em><b>End Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Position</em>' reference.
	 * @see #setEndPosition(trackPosition)
	 * @see geometry.GeometryPackage#getTrack_EndPosition()
	 * @model required="true"
	 * @generated
	 */
	trackPosition getEndPosition();

	/**
	 * Sets the value of the '{@link geometry.Track#getEndPosition <em>End Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Position</em>' reference.
	 * @see #getEndPosition()
	 * @generated
	 */
	void setEndPosition(trackPosition value);

	/**
	 * Returns the value of the '<em><b>Intermediate Positions</b></em>' containment reference list.
	 * The list contents are of type {@link geometry.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Positions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Positions</em>' containment reference list.
	 * @see geometry.GeometryPackage#getTrack_IntermediatePositions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Position> getIntermediatePositions();

} // Track
