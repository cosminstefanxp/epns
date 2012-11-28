/**
 */
package appearance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link appearance.SurfaceColor#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see appearance.AppearancePackage#getSurfaceColor()
 * @model
 * @generated
 */
public interface SurfaceColor extends Surface {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link appearance.ColorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see appearance.ColorType
	 * @see #setColor(ColorType)
	 * @see appearance.AppearancePackage#getSurfaceColor_Color()
	 * @model
	 * @generated
	 */
	ColorType getColor();

	/**
	 * Sets the value of the '{@link appearance.SurfaceColor#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see appearance.ColorType
	 * @see #getColor()
	 * @generated
	 */
	void setColor(ColorType value);

} // SurfaceColor
