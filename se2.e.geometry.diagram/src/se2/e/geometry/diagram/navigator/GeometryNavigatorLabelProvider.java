package se2.e.geometry.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import se2.e.geometry.TrackPosition;
import se2.e.geometry.diagram.edit.parts.GeometryEditPart;
import se2.e.geometry.diagram.edit.parts.SimplePositionEditPart;
import se2.e.geometry.diagram.edit.parts.SimplePositionNameEditPart;
import se2.e.geometry.diagram.edit.parts.TrackEditPart;
import se2.e.geometry.diagram.edit.parts.TrackPositionEditPart;
import se2.e.geometry.diagram.edit.parts.WrappingLabelEditPart;
import se2.e.geometry.diagram.part.GeometryDiagramEditorPlugin;
import se2.e.geometry.diagram.part.GeometryVisualIDRegistry;
import se2.e.geometry.diagram.providers.GeometryElementTypes;
import se2.e.geometry.diagram.providers.GeometryParserProvider;

/**
 * @generated
 */
public class GeometryNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider,
		ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GeometryDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		GeometryDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GeometryNavigatorItem && !isOwnView(((GeometryNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof GeometryNavigatorGroup) {
			GeometryNavigatorGroup group = (GeometryNavigatorGroup) element;
			return GeometryDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof GeometryNavigatorItem) {
			GeometryNavigatorItem navigatorItem = (GeometryNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case TrackPositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://geometry/1.0?TrackPosition", GeometryElementTypes.TrackPosition_2002); //$NON-NLS-1$
		case SimplePositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://geometry/1.0?SimplePosition", GeometryElementTypes.SimplePosition_2001); //$NON-NLS-1$
		case GeometryEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://geometry/1.0?Geometry", GeometryElementTypes.Geometry_1000); //$NON-NLS-1$
		case TrackEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://geometry/1.0?Track", GeometryElementTypes.Track_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GeometryDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && GeometryElementTypes.isKnownElementType(elementType)) {
			image = GeometryElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof GeometryNavigatorGroup) {
			GeometryNavigatorGroup group = (GeometryNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GeometryNavigatorItem) {
			GeometryNavigatorItem navigatorItem = (GeometryNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case TrackPositionEditPart.VISUAL_ID:
			return getTrackPosition_2002Text(view);
		case SimplePositionEditPart.VISUAL_ID:
			return getSimplePosition_2001Text(view);
		case GeometryEditPart.VISUAL_ID:
			return getGeometry_1000Text(view);
		case TrackEditPart.VISUAL_ID:
			return getTrack_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getTrackPosition_2002Text(View view) {
		TrackPosition domainModelElement = (TrackPosition) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getID());
		} else {
			GeometryDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimplePosition_2001Text(View view) {
		IParser parser = GeometryParserProvider.getParser(GeometryElementTypes.SimplePosition_2001,
				view.getElement() != null ? view.getElement() : view,
				GeometryVisualIDRegistry.getType(SimplePositionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GeometryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGeometry_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTrack_4001Text(View view) {
		IParser parser = GeometryParserProvider.getParser(GeometryElementTypes.Track_4001,
				view.getElement() != null ? view.getElement() : view,
				GeometryVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GeometryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return GeometryEditPart.MODEL_ID.equals(GeometryVisualIDRegistry.getModelID(view));
	}

}
