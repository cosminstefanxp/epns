package appearance.extensions.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import appearance.AppearanceInfo;


/**
 * ExistsLabelConstraint class
 * 
 * @author Juan, Pablo and María.
 */
public class ExistsLabelConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext vc) {
		EObject object = vc.getTarget();
		if (object instanceof AppearanceInfo) {
			AppearanceInfo appInfo = (AppearanceInfo) object;
			if(appInfo.getLabel() == null || appInfo.getLabel().equals(""))
				return vc.createFailureStatus(new Object[] {appInfo});
		}		
		return vc.createSuccessStatus();
	}
	
}
