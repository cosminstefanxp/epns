/**
 */
package se2.e.configurator.Configurator;

import extendedpetrinet.ExtendedPetriNet;

import org.eclipse.emf.ecore.EObject;

import se2.e.geometry.Geometry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se2.e.configurator.Configurator.Configurator#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link se2.e.configurator.Configurator.Configurator#getPetrinet <em>Petrinet</em>}</li>
 * </ul>
 * </p>
 *
 * @see se2.e.configurator.Configurator.ConfiguratorPackage#getConfigurator()
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
	 * @see se2.e.configurator.Configurator.ConfiguratorPackage#getConfigurator_Geometry()
	 * @model required="true"
	 * @generated
	 */
	Geometry getGeometry();

	/**
	 * Sets the value of the '{@link se2.e.configurator.Configurator.Configurator#getGeometry <em>Geometry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(Geometry value);

	/**
	 * Returns the value of the '<em><b>Petrinet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet</em>' reference.
	 * @see #setPetrinet(ExtendedPetriNet)
	 * @see se2.e.configurator.Configurator.ConfiguratorPackage#getConfigurator_Petrinet()
	 * @model required="true"
	 * @generated
	 */
	ExtendedPetriNet getPetrinet();

	/**
	 * Sets the value of the '{@link se2.e.configurator.Configurator.Configurator#getPetrinet <em>Petrinet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petrinet</em>' reference.
	 * @see #getPetrinet()
	 * @generated
	 */
	void setPetrinet(ExtendedPetriNet value);

} // Configurator
