package extensions.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import extendedpetrinet.Arc;
import extendedpetrinet.Place;


public class ArcConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext vc) {
		EObject object = vc.getTarget();
		if (object instanceof Arc) {
			Arc arc = (Arc) object;
			Node source = arc.getSource();
			Node target = arc.getTarget();
			
			if((source instanceof Place && target instanceof Place) || 
					(source instanceof Transition && target instanceof Transition)) {
				return vc.createFailureStatus(new Object[] {arc});
			}
		}
		
		return vc.createSuccessStatus();
	}

}
