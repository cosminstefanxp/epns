package appearance.extensions.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import appearance.Model3D;
import appearance.Texture;

/**
 * FileSetConstraint class
 * 
 * @author Juan, Pablo and María.
 */
public class FileSetConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext vc) {
		EObject object = vc.getTarget();
		if (object instanceof Model3D) {
			Model3D model = (Model3D) object;
			if(model.getFile() == null || model.getFile().equals(""))
				return vc.createFailureStatus(new Object[] {model});
		}else if (object instanceof Texture) {
			Texture texture = (Texture) object;
			if(texture.getFile() == null || texture.getFile().equals(""))
				return vc.createFailureStatus(new Object[] {texture});
		}
		return vc.createSuccessStatus();
	}
	
}
