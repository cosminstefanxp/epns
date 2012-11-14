/**
 */
package se2.e.configurator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se2.e.configurator.ConfiguratorPackage
 * @generated
 */
public interface ConfiguratorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfiguratorFactory eINSTANCE = se2.e.configurator.impl.ConfiguratorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Configurator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configurator</em>'.
	 * @generated
	 */
	Configurator createConfigurator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfiguratorPackage getConfiguratorPackage();

} //ConfiguratorFactory
