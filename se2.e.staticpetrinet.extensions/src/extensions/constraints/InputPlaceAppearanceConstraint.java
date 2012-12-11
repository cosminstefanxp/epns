package extensions.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import extendedpetrinet.Place;

/**
 * InputPlaceAppearanceConstraint class
 * 
 * @author Juan, María and Pablo.
 */
public class InputPlaceAppearanceConstraint extends AbstractModelConstraint {
	
	@Override
	public IStatus validate(IValidationContext vc) {
		EObject object = vc.getTarget();
		if (object instanceof Place){
			Place place = (Place) object;
			System.out.println(">>"+place.getInteractiveInput());
			if(place.getInteractiveInput() != null && place.getInteractiveInput().isText() == false 
					&& place.getAppearance() != null)
				return vc.createFailureStatus(new Object[] {place});		
		}
		return vc.createSuccessStatus();
	}
}
