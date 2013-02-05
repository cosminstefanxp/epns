package se2.e.geometry.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import se2.e.geometry.Geometry;
import se2.e.geometry.GeometryPackage;
import se2.e.geometry.diagram.edit.parts.GeometryEditPart;
import se2.e.geometry.diagram.edit.parts.SimplePositionEditPart;
import se2.e.geometry.diagram.edit.parts.SimplePositionLabelEditPart;
import se2.e.geometry.diagram.edit.parts.SimplePositionNameEditPart;
import se2.e.geometry.diagram.edit.parts.TrackEditPart;
import se2.e.geometry.diagram.edit.parts.TrackLabelEditPart;
import se2.e.geometry.diagram.edit.parts.TrackPositionEditPart;
import se2.e.geometry.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GeometryVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "se2.e.geometry.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (GeometryEditPart.MODEL_ID.equals(view.getType())) {
				return GeometryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return se2.e.geometry.diagram.part.GeometryVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				GeometryDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GeometryPackage.eINSTANCE.getGeometry().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Geometry) domainElement)) {
			return GeometryEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = se2.e.geometry.diagram.part.GeometryVisualIDRegistry
				.getModelID(containerView);
		if (!GeometryEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (GeometryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = se2.e.geometry.diagram.part.GeometryVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GeometryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case GeometryEditPart.VISUAL_ID:
			if (GeometryPackage.eINSTANCE.getSimplePosition().isSuperTypeOf(
					domainElement.eClass())) {
				return SimplePositionEditPart.VISUAL_ID;
			}
			if (GeometryPackage.eINSTANCE.getTrackPosition().isSuperTypeOf(
					domainElement.eClass())) {
				return TrackPositionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = se2.e.geometry.diagram.part.GeometryVisualIDRegistry
				.getModelID(containerView);
		if (!GeometryEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (GeometryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = se2.e.geometry.diagram.part.GeometryVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GeometryEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case GeometryEditPart.VISUAL_ID:
			if (SimplePositionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TrackPositionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimplePositionEditPart.VISUAL_ID:
			if (SimplePositionLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TrackEditPart.VISUAL_ID:
			if (TrackLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GeometryPackage.eINSTANCE.getTrack().isSuperTypeOf(
				domainElement.eClass())) {
			return TrackEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Geometry element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case GeometryEditPart.VISUAL_ID:
			return false;
		case SimplePositionEditPart.VISUAL_ID:
		case TrackPositionEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return se2.e.geometry.diagram.part.GeometryVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return se2.e.geometry.diagram.part.GeometryVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return se2.e.geometry.diagram.part.GeometryVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return se2.e.geometry.diagram.part.GeometryVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return se2.e.geometry.diagram.part.GeometryVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return se2.e.geometry.diagram.part.GeometryVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
