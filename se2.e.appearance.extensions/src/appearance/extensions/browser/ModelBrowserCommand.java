package appearance.extensions.browser;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Shell;

import appearance.Model3D;
import appearance.impl.AppearancePackageImpl;

/**
 * Class ModelBrowserCommand
 * 
 * Command that shows a browser to select a file with a 3D model.
 * 
 * @author Juan, María and Pablo.
 */
public class ModelBrowserCommand extends CompoundCommand{

	private Model3D selectedModel;
	
	public ModelBrowserCommand(EditingDomain domain, Model3D selectedModel) {
		
		super(0);
		this.selectedModel = selectedModel;
		
		List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
		filters.add(new ViewerFilter() {
		    @Override
		    public boolean select(Viewer viewer, Object parentElement, Object element) {
		        if (element instanceof IFile) {
		        	String extension = ((IFile)element).getFileExtension();
		        	if(extension.equalsIgnoreCase("obj") || extension.equalsIgnoreCase("3ds"))
		        			return true;
		        	else return false;
		        } else return true;
		    }
		});
		
		IFile file = WorkspaceResourceDialog.openFileSelection(new Shell(), "Select file", 
				"Please select model file", false, null, filters)[0];
		
		this.append(new SetCommand(domain, selectedModel,AppearancePackageImpl.eINSTANCE.getModel3D_File(),	
					file.getFullPath().toString()));
	}
	
	@Override
	public String getDescription() {
		return getLabel();
	}

	@Override
	public String getLabel() {
		String label = "Load file for Model3D";
		if(selectedModel.getLabel() == null)
			return label;
		return  label + " " + selectedModel.getLabel();
	}
	
}
