/**
 */
package appearance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link appearance.AppearanceModel#getAppearanceInfos <em>Appearance Infos</em>}</li>
 * </ul>
 * </p>
 *
 * @see appearance.AppearancePackage#getAppearanceModel()
 * @model
 * @generated
 */
public interface AppearanceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Appearance Infos</b></em>' containment reference list.
	 * The list contents are of type {@link appearance.AppearanceInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance Infos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance Infos</em>' containment reference list.
	 * @see appearance.AppearancePackage#getAppearanceModel_AppearanceInfos()
	 * @model containment="true"
	 * @generated
	 */
	EList<AppearanceInfo> getAppearanceInfos();

} // AppearanceModel
