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
 *   <li>{@link appearance.Shape#getScale <em>Scale</em>}</li>
 *   <li>{@link appearance.Shape#getXRotation <em>XRotation</em>}</li>
 *   <li>{@link appearance.Shape#getYRotation <em>YRotation</em>}</li>
 *   <li>{@link appearance.Shape#getZRotation <em>ZRotation</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(double)
	 * @see appearance.AppearancePackage#getShape_Scale()
	 * @model default="1"
	 * @generated
	 */
	double getScale();

	/**
	 * Sets the value of the '{@link appearance.Shape#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(double value);

	/**
	 * Returns the value of the '<em><b>XRotation</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRotation</em>' attribute.
	 * @see #setXRotation(double)
	 * @see appearance.AppearancePackage#getShape_XRotation()
	 * @model default="0"
	 * @generated
	 */
	double getXRotation();

	/**
	 * Sets the value of the '{@link appearance.Shape#getXRotation <em>XRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRotation</em>' attribute.
	 * @see #getXRotation()
	 * @generated
	 */
	void setXRotation(double value);

	/**
	 * Returns the value of the '<em><b>YRotation</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YRotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YRotation</em>' attribute.
	 * @see #setYRotation(double)
	 * @see appearance.AppearancePackage#getShape_YRotation()
	 * @model default="0"
	 * @generated
	 */
	double getYRotation();

	/**
	 * Sets the value of the '{@link appearance.Shape#getYRotation <em>YRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YRotation</em>' attribute.
	 * @see #getYRotation()
	 * @generated
	 */
	void setYRotation(double value);

	/**
	 * Returns the value of the '<em><b>ZRotation</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZRotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZRotation</em>' attribute.
	 * @see #setZRotation(double)
	 * @see appearance.AppearancePackage#getShape_ZRotation()
	 * @model default="0"
	 * @generated
	 */
	double getZRotation();

	/**
	 * Sets the value of the '{@link appearance.Shape#getZRotation <em>ZRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZRotation</em>' attribute.
	 * @see #getZRotation()
	 * @generated
	 */
	void setZRotation(double value);

} // Shape
