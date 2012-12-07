package appearance.extensions.browser;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import appearance.Model3D;

/**
 * Class ModelBrowserAction
 * 
 * Shows a browser to select a file with a 3D model.
 * 
 * @author Juan, María and Pablo.
 */
public class ModelBrowserAction implements IObjectActionDelegate {

	private Model3D selectedModel;

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (isEnabled()) {
			EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(selectedModel);	
			domain.getCommandStack().execute(new ModelBrowserCommand(domain, selectedModel));
			System.out.println(">>"+((Model3D)selectedModel).getFileURI());
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selectedModel = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			if (structuredSelection.size() == 1 && 
					structuredSelection.getFirstElement() instanceof Model3D) {
				selectedModel = (Model3D)structuredSelection.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}
	
	public boolean isEnabled() {
		return selectedModel != null;
	}

}
