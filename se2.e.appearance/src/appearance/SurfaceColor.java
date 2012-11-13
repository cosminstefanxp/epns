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
 *   <li>{@link appearance.SurfaceColor#getColorCode <em>Color Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see appearance.AppearancePackage#getSurfaceColor()
 * @model
 * @generated
 */
public interface SurfaceColor extends Surface {
	/**
	 * Returns the value of the '<em><b>Color Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Code</em>' attribute.
	 * @see #setColorCode(String)
	 * @see appearance.AppearancePackage#getSurfaceColor_ColorCode()
	 * @model
	 * @generated
	 */
	String getColorCode();

	/**
	 * Sets the value of the '{@link appearance.SurfaceColor#getColorCode <em>Color Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Code</em>' attribute.
	 * @see #getColorCode()
	 * @generated
	 */
	void setColorCode(String value);

} // SurfaceColor
