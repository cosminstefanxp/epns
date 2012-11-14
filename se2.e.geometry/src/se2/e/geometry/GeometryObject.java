/**
 */
package se2.e.geometry;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se2.e.geometry.GeometryObject#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see se2.e.geometry.GeometryPackage#getGeometryObject()
 * @model abstract="true"
 * @generated
 */
public interface GeometryObject extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see se2.e.geometry.GeometryPackage#getGeometryObject_ID()
	 * @model
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link se2.e.geometry.GeometryObject#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

} // GeometryObject
