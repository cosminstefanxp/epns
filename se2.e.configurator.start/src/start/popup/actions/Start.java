/*
 * 
 */
package start.popup.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import se2.e.configurator.Configurator;
import se2.e.simulator.Simulator;


public class Start implements IObjectActionDelegate {

	private Configurator selectedConfig;

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}

	/**
	 * @see IActionDelegate#run(IAction)
	 * if isEnabled returns true, it initializes the simulator
	 */
	public void run(IAction action) {
		if (isEnabled()) {
			Simulator s = new Simulator(selectedConfig.getGeometry(), selectedConfig.getPetrinet(), selectedConfig.getAppearance(), selectedConfig.getDefaultTrackWidth());
			s.startSimulation();
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 * 
	 */
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
	
	
	/**
	 * Checks if is enabled. checks whether the selected Config is null
	 *
	 * @return true, if is enabled
	 */
	public boolean isEnabled() {
		return selectedConfig != null;
	}
	
}
