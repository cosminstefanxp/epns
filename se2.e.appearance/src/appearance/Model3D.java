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
	 * Returns the URI of the IFile whose relative path is referenced 
	 * by the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the URI of the IFile whose relative path is referenced 
	 * by the '<em><b>File</b></em>' attribute.
	 * @generated NOT
	 * @author Juan, María and Pablo.
	 */
	public String getFileURI();

} // Model3D
