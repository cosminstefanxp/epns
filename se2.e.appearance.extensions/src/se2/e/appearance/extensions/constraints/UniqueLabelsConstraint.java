package se2.e.appearance.extensions.constraints;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import appearance.AppearanceInfo;
import appearance.AppearanceModel;


public class UniqueLabelsConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext vc) {
		EObject object = vc.getTarget();
		if (object instanceof AppearanceModel) {
			AppearanceModel appModel = (AppearanceModel) object;
			EList<AppearanceInfo> list = appModel.getAppearanceInfos();
			Set<String> setLabels = new HashSet<String>();
			for(AppearanceInfo ai : list){
				if(ai.getLabel() != null && !ai.getLabel().equals("")){
					if(setLabels.contains(ai.getLabel()))
						return vc.createFailureStatus(new Object[] {ai});
					setLabels.add(ai.getLabel());
				}
			}	
		}
		
		return vc.createSuccessStatus();
	}

}
