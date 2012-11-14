/**
 */
package extendedpetrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link extendedpetrinet.Place#getInteractiveInput <em>Interactive Input</em>}</li>
 *   <li>{@link extendedpetrinet.Place#getAnimations <em>Animations</em>}</li>
 *   <li>{@link extendedpetrinet.Place#getTokens <em>Tokens</em>}</li>
 *   <li>{@link extendedpetrinet.Place#getGeoLabel <em>Geo Label</em>}</li>
 *   <li>{@link extendedpetrinet.Place#getTrackAppearance <em>Track Appearance</em>}</li>
 * </ul>
 * </p>
 *
 * @see extendedpetrinet.ExtendedpetrinetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends org.pnml.tools.epnk.pnmlcoremodel.Place {
	/**
	 * Returns the value of the '<em><b>Interactive Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interactive Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactive Input</em>' containment reference.
	 * @see #setInteractiveInput(InteractiveInput)
	 * @see extendedpetrinet.ExtendedpetrinetPackage#getPlace_InteractiveInput()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InteractiveInput getInteractiveInput();

	/**
	 * Sets the value of the '{@link extendedpetrinet.Place#getInteractiveInput <em>Interactive Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interactive Input</em>' containment reference.
	 * @see #getInteractiveInput()
	 * @generated
	 */
	void setInteractiveInput(InteractiveInput value);

	/**
	 * Returns the value of the '<em><b>Animations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animations</em>' containment reference.
	 * @see #setAnimations(Animations)
	 * @see extendedpetrinet.ExtendedpetrinetPackage#getPlace_Animations()
	 * @model containment="true"
	 * @generated
	 */
	Animations getAnimations();

	/**
	 * Sets the value of the '{@link extendedpetrinet.Place#getAnimations <em>Animations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animations</em>' containment reference.
	 * @see #getAnimations()
	 * @generated
	 */
	void setAnimations(Animations value);

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link extendedpetrinet.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see extendedpetrinet.ExtendedpetrinetPackage#getPlace_Tokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getTokens();

	/**
	 * Returns the value of the '<em><b>Geo Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Label</em>' reference.
	 * @see #setGeoLabel(GeometryLabel)
	 * @see extendedpetrinet.ExtendedpetrinetPackage#getPlace_GeoLabel()
	 * @model
	 * @generated
	 */
	GeometryLabel getGeoLabel();

	/**
	 * Sets the value of the '{@link extendedpetrinet.Place#getGeoLabel <em>Geo Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Label</em>' reference.
	 * @see #getGeoLabel()
	 * @generated
	 */
	void setGeoLabel(GeometryLabel value);

	/**
	 * Returns the value of the '<em><b>Track Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track Appearance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Appearance</em>' containment reference.
	 * @see #setTrackAppearance(Appearance)
	 * @see extendedpetrinet.ExtendedpetrinetPackage#getPlace_TrackAppearance()
	 * @model containment="true"
	 * @generated
	 */
	Appearance getTrackAppearance();

	/**
	 * Sets the value of the '{@link extendedpetrinet.Place#getTrackAppearance <em>Track Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Appearance</em>' containment reference.
	 * @see #getTrackAppearance()
	 * @generated
	 */
	void setTrackAppearance(Appearance value);

} // Place
