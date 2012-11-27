/**
 */
package appearance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link appearance.Model3D#getFile <em>File</em>}</li>
 *   <li>{@link appearance.Model3D#getScale <em>Scale</em>}</li>
 *   <li>{@link appearance.Model3D#getXRotation <em>XRotation</em>}</li>
 *   <li>{@link appearance.Model3D#getYRotation <em>YRotation</em>}</li>
 *   <li>{@link appearance.Model3D#getZRotation <em>ZRotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see appearance.AppearancePackage#getModel3D()
 * @model
 * @generated
 */
public interface Model3D extends Shape {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see appearance.AppearancePackage#getModel3D_File()
	 * @model
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link appearance.Model3D#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(double)
	 * @see appearance.AppearancePackage#getModel3D_Scale()
	 * @model default="1"
	 * @generated
	 */
	double getScale();

	/**
	 * Sets the value of the '{@link appearance.Model3D#getScale <em>Scale</em>}' attribute.
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
	 * @see appearance.AppearancePackage#getModel3D_XRotation()
	 * @model default="0"
	 * @generated
	 */
	double getXRotation();

	/**
	 * Sets the value of the '{@link appearance.Model3D#getXRotation <em>XRotation</em>}' attribute.
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
	 * @see appearance.AppearancePackage#getModel3D_YRotation()
	 * @model default="0"
	 * @generated
	 */
	double getYRotation();

	/**
	 * Sets the value of the '{@link appearance.Model3D#getYRotation <em>YRotation</em>}' attribute.
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
	 * @see appearance.AppearancePackage#getModel3D_ZRotation()
	 * @model default="0"
	 * @generated
	 */
	double getZRotation();

	/**
	 * Sets the value of the '{@link appearance.Model3D#getZRotation <em>ZRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZRotation</em>' attribute.
	 * @see #getZRotation()
	 * @generated
	 */
	void setZRotation(double value);

} // Model3D
