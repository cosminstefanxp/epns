/**
 */
package appearance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link appearance.Shape#getShapeSurface <em>Shape Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see appearance.AppearancePackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends AppearanceInfo {

	/**
	 * Returns the value of the '<em><b>Shape Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Surface</em>' containment reference.
	 * @see #setShapeSurface(Surface)
	 * @see appearance.AppearancePackage#getShape_ShapeSurface()
	 * @model containment="true"
	 * @generated
	 */
	Surface getShapeSurface();

	/**
	 * Sets the value of the '{@link appearance.Shape#getShapeSurface <em>Shape Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Surface</em>' containment reference.
	 * @see #getShapeSurface()
	 * @generated
	 */
	void setShapeSurface(Surface value);
} // Shape
