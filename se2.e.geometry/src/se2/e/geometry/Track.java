/**
 */
package se2.e.geometry;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se2.e.geometry.Track#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link se2.e.geometry.Track#getEndPosition <em>End Position</em>}</li>
 *   <li>{@link se2.e.geometry.Track#getIntermediatePositions <em>Intermediate Positions</em>}</li>
 *   <li>{@link se2.e.geometry.Track#getAppearanceLabel <em>Appearance Label</em>}</li>
 *   <li>{@link se2.e.geometry.Track#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see se2.e.geometry.GeometryPackage#getTrack()
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
	 * @see #setStartPosition(TrackPosition)
	 * @see se2.e.geometry.GeometryPackage#getTrack_StartPosition()
	 * @model required="true"
	 * @generated
	 */
	TrackPosition getStartPosition();

	/**
	 * Sets the value of the '{@link se2.e.geometry.Track#getStartPosition <em>Start Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Position</em>' reference.
	 * @see #getStartPosition()
	 * @generated
	 */
	void setStartPosition(TrackPosition value);

	/**
	 * Returns the value of the '<em><b>End Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Position</em>' reference.
	 * @see #setEndPosition(TrackPosition)
	 * @see se2.e.geometry.GeometryPackage#getTrack_EndPosition()
	 * @model required="true"
	 * @generated
	 */
	TrackPosition getEndPosition();

	/**
	 * Sets the value of the '{@link se2.e.geometry.Track#getEndPosition <em>End Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Position</em>' reference.
	 * @see #getEndPosition()
	 * @generated
	 */
	void setEndPosition(TrackPosition value);

	/**
	 * Returns the value of the '<em><b>Intermediate Positions</b></em>' containment reference list.
	 * The list contents are of type {@link se2.e.geometry.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Positions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Positions</em>' containment reference list.
	 * @see se2.e.geometry.GeometryPackage#getTrack_IntermediatePositions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Position> getIntermediatePositions();

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
	 * @see se2.e.geometry.GeometryPackage#getTrack_AppearanceLabel()
	 * @model
	 * @generated
	 */
	String getAppearanceLabel();

	/**
	 * Sets the value of the '{@link se2.e.geometry.Track#getAppearanceLabel <em>Appearance Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance Label</em>' attribute.
	 * @see #getAppearanceLabel()
	 * @generated
	 */
	void setAppearanceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see se2.e.geometry.GeometryPackage#getTrack_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link se2.e.geometry.Track#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // Track
