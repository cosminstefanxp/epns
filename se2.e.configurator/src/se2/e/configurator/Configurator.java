/**
 */
package se2.e.configurator;

import appearance.AppearanceModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import se2.e.geometry.Geometry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se2.e.configurator.Configurator#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link se2.e.configurator.Configurator#getAppearance <em>Appearance</em>}</li>
 *   <li>{@link se2.e.configurator.Configurator#getPetrinet <em>Petrinet</em>}</li>
 *   <li>{@link se2.e.configurator.Configurator#getDefaultTrackWidth <em>Default Track Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see se2.e.configurator.ConfiguratorPackage#getConfigurator()
 * @model
 * @generated
 */
public interface Configurator extends EObject {
	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' reference.
	 * @see #setGeometry(Geometry)
	 * @see se2.e.configurator.ConfiguratorPackage#getConfigurator_Geometry()
	 * @model required="true"
	 * @generated
	 */
	Geometry getGeometry();

	/**
	 * Sets the value of the '{@link se2.e.configurator.Configurator#getGeometry <em>Geometry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(Geometry value);

	/**
	 * Returns the value of the '<em><b>Appearance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance</em>' reference.
	 * @see #setAppearance(AppearanceModel)
	 * @see se2.e.configurator.ConfiguratorPackage#getConfigurator_Appearance()
	 * @model required="true"
	 * @generated
	 */
	AppearanceModel getAppearance();

	/**
	 * Sets the value of the '{@link se2.e.configurator.Configurator#getAppearance <em>Appearance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance</em>' reference.
	 * @see #getAppearance()
	 * @generated
	 */
	void setAppearance(AppearanceModel value);

	/**
	 * Returns the value of the '<em><b>Petrinet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet</em>' reference.
	 * @see #setPetrinet(PetriNetDoc)
	 * @see se2.e.configurator.ConfiguratorPackage#getConfigurator_Petrinet()
	 * @model required="true"
	 * @generated
	 */
	PetriNetDoc getPetrinet();

	/**
	 * Sets the value of the '{@link se2.e.configurator.Configurator#getPetrinet <em>Petrinet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petrinet</em>' reference.
	 * @see #getPetrinet()
	 * @generated
	 */
	void setPetrinet(PetriNetDoc value);

	/**
	 * Returns the value of the '<em><b>Default Track Width</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Track Width</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Track Width</em>' attribute.
	 * @see #setDefaultTrackWidth(double)
	 * @see se2.e.configurator.ConfiguratorPackage#getConfigurator_DefaultTrackWidth()
	 * @model default="1.0" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getDefaultTrackWidth();

	/**
	 * Sets the value of the '{@link se2.e.configurator.Configurator#getDefaultTrackWidth <em>Default Track Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Track Width</em>' attribute.
	 * @see #getDefaultTrackWidth()
	 * @generated
	 */
	void setDefaultTrackWidth(double value);

} // Configurator
