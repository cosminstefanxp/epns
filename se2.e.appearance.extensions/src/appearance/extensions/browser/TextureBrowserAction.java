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
import appearance.Texture;

/**
 * Class TextureBrowserAction
 * 
 * Shows a browser to select a file with a texture.
 * 
 * @author Juan, María and Pablo.
 */
public class TextureBrowserAction implements IObjectActionDelegate {

	private Texture selectedTexture;

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (isEnabled()) {
			EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(selectedTexture);	
			domain.getCommandStack().execute(new TextureBrowserCommand(domain,selectedTexture));
			System.out.println(">>"+((Model3D)selectedTexture).getFileURI());
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selectedTexture = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			if (structuredSelection.size() == 1 && 
					structuredSelection.getFirstElement() instanceof Texture) {
				selectedTexture = (Texture)structuredSelection.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}
	
	public boolean isEnabled() {
		return selectedTexture != null;
	}

}
