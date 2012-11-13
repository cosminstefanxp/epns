/**
 */
package appearance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link appearance.Shape3D#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see appearance.AppearancePackage#getShape3D()
 * @model
 * @generated
 */
public interface Shape3D extends Shape {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link appearance.Object3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see appearance.Object3D
	 * @see #setType(Object3D)
	 * @see appearance.AppearancePackage#getShape3D_Type()
	 * @model
	 * @generated
	 */
	Object3D getType();

	/**
	 * Sets the value of the '{@link appearance.Shape3D#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see appearance.Object3D
	 * @see #getType()
	 * @generated
	 */
	void setType(Object3D value);

} // Shape3D
