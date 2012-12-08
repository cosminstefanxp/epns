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

import appearance.Texture;
import appearance.impl.AppearancePackageImpl;


/**
 * Class TextureBrowserCommand
 * 
 * Command that shows a browser to select a file with a texture.
 * 
 * @author Juan, María and Pablo.
 */
public class TextureBrowserCommand extends CompoundCommand {

	private Texture selectedTexture;
	
	public TextureBrowserCommand(EditingDomain domain, Texture selectedTexture) {
		
		super(0);
		this.selectedTexture = selectedTexture;
		
		List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
		filters.add(new ViewerFilter() {
		    @Override
		    public boolean select(Viewer viewer, Object parentElement, Object element) {
		        if (element instanceof IFile) {
		        	String extension = ((IFile)element).getFileExtension();
		        	if(extension.equalsIgnoreCase("png") || extension.equalsIgnoreCase("jpg"))
		        			return true;
		        	else return false;
		        } else return true;
		    }
		});
		
		IFile file = WorkspaceResourceDialog.openFileSelection(new Shell(), "Select file", 
				"Please select texture file", false, null, filters)[0];
		
		this.append(new SetCommand(domain, selectedTexture, AppearancePackageImpl.eINSTANCE.getTexture_File(),	
					file.getFullPath().toString()));
	}
	
	@Override
	public String getDescription() {
		return getLabel();
	}

	@Override
	public String getLabel() {
		String label = "Load file for Texture";
		if(selectedTexture.getLabel() == null)
			return label;
		return  label + " " + selectedTexture.getLabel();
	}
	
}
