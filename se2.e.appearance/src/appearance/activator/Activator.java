package appearance.activator;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EValidator;
import org.osgi.framework.BundleContext;

import appearance.AppearancePackage;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends Plugin {

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		EValidator.Registry.INSTANCE.put(
				AppearancePackage.eINSTANCE,
				new EValidatorAdapter());
	}

}
