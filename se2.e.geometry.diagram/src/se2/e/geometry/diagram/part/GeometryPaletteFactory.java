package se2.e.geometry.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import se2.e.geometry.diagram.providers.GeometryElementTypes;

/**
 * @generated
 */
public class GeometryPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGeometry1Group());
	}

	/**
	 * Creates "geometry" palette tool group
	 * @generated
	 */
	private PaletteContainer createGeometry1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Geometry1Group_title);
		paletteContainer.setId("createGeometry1Group"); //$NON-NLS-1$
		paletteContainer.add(createTrack1CreationTool());
		paletteContainer.add(createSimplePosition2CreationTool());
		paletteContainer.add(createTrackPosition3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTrack1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.Track1CreationTool_title, Messages.Track1CreationTool_desc,
				Collections.singletonList(GeometryElementTypes.Track_4001));
		entry.setId("createTrack1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeometryElementTypes.getImageDescriptor(GeometryElementTypes.Track_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSimplePosition2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.SimplePosition2CreationTool_title,
				Messages.SimplePosition2CreationTool_desc,
				Collections.singletonList(GeometryElementTypes.SimplePosition_2001));
		entry.setId("createSimplePosition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeometryElementTypes.getImageDescriptor(GeometryElementTypes.SimplePosition_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTrackPosition3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.TrackPosition3CreationTool_title,
				Messages.TrackPosition3CreationTool_desc,
				Collections.singletonList(GeometryElementTypes.TrackPosition_2002));
		entry.setId("createTrackPosition3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeometryElementTypes.getImageDescriptor(GeometryElementTypes.TrackPosition_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description, List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description, List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
