package start.popup.actions;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import se2.e.configurator.Configurator;

/**
 * Class Fire TODO
 */
public class Start implements IObjectActionDelegate {

	private Configurator selectedConfig;

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (isEnabled()) {
			EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(selectedConfig);	
			domain.getCommandStack().execute(new StartCommand(domain, selectedConfig));
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selectedConfig = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof Configurator) {
				selectedConfig = (Configurator)structuredSelection.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}
	
	public boolean isEnabled() {
		return selectedConfig != null;
	}
	
}
