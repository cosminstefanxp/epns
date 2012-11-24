package se2.e.appearance.browser.popup.actions;

import java.awt.Frame;

import javax.swing.JFileChooser;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import appearance.AppearanceInfo;
import appearance.Model3D;
import appearance.Texture;

/**
 * Class BrowserAction
 * 
 * Shows a browser to select a file with an Appearance Info.
 * 
 * @author Juan, María and Pablo.
 */
public class BrowserAction implements IObjectActionDelegate {

	private AppearanceInfo selectedAppearanceInfo;

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (isEnabled()) {
				JFileChooser chooser=new JFileChooser();
				chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				chooser.setDialogTitle("Select the appearance file");
				int ret=chooser.showOpenDialog(new Frame());
				if(ret==JFileChooser.APPROVE_OPTION){
					String file=chooser.getSelectedFile().getPath();
					if(selectedAppearanceInfo instanceof Model3D)
						((Model3D)selectedAppearanceInfo).setFile(file);
					else if(selectedAppearanceInfo instanceof Texture)
						((Texture)selectedAppearanceInfo).setFile(file);
				}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selectedAppearanceInfo = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			if (structuredSelection.size() == 1) {
				if(structuredSelection.getFirstElement() instanceof Model3D)
					selectedAppearanceInfo = (Model3D)structuredSelection.getFirstElement();
				else if(structuredSelection.getFirstElement() instanceof Texture)
					selectedAppearanceInfo = (Texture)structuredSelection.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}
	
	public boolean isEnabled() {
		return selectedAppearanceInfo != null;
	}

}
