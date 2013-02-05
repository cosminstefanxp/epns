
package anl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AnimationsLanguageStandaloneSetup extends AnimationsLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new AnimationsLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

