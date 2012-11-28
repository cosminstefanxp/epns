package se2.e.appearance.extensions.constraints;

import org.eclipse.emf.validation.model.IClientSelector;

public class AppearanceValidationContext implements IClientSelector {

	public boolean selects(Object object) {
		return true;
	}
}
