/**
 */
package configurator;

import geometry.Geometry;

import org.eclipse.emf.ecore.EObject;

import petrinet.PetriNet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configurator.Configurator#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link configurator.Configurator#getPetriNet <em>Petri Net</em>}</li>
 * </ul>
 * </p>
 *
 * @see configurator.ConfiguratorPackage#getConfigurator()
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
	 * @see configurator.ConfiguratorPackage#getConfigurator_Geometry()
	 * @model required="true"
	 * @generated
	 */
	Geometry getGeometry();

	/**
	 * Sets the value of the '{@link configurator.Configurator#getGeometry <em>Geometry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(Geometry value);

	/**
	 * Returns the value of the '<em><b>Petri Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petri Net</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petri Net</em>' reference.
	 * @see #setPetriNet(PetriNet)
	 * @see configurator.ConfiguratorPackage#getConfigurator_PetriNet()
	 * @model required="true"
	 * @generated
	 */
	PetriNet getPetriNet();

	/**
	 * Sets the value of the '{@link configurator.Configurator#getPetriNet <em>Petri Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petri Net</em>' reference.
	 * @see #getPetriNet()
	 * @generated
	 */
	void setPetriNet(PetriNet value);

} // Configurator
