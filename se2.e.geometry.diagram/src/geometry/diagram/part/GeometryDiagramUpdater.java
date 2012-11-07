package geometry.diagram.part;

import geometry.Geometry;
import geometry.GeometryObject;
import geometry.GeometryPackage;
import geometry.Track;
import geometry.diagram.edit.parts.ClickablePositionEditPart;
import geometry.diagram.edit.parts.GeometryEditPart;
import geometry.diagram.edit.parts.TrackEditPart;
import geometry.diagram.edit.parts.TrackPositionEditPart;
import geometry.diagram.providers.GeometryElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class GeometryDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<GeometryNodeDescriptor> getSemanticChildren(View view) {
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getGeometry_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryNodeDescriptor> getGeometry_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Geometry modelElement = (Geometry) view.getElement();
		LinkedList<GeometryNodeDescriptor> result = new LinkedList<GeometryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGeoObjects().iterator(); it
				.hasNext();) {
			GeometryObject childElement = (GeometryObject) it.next();
			int visualID = GeometryVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ClickablePositionEditPart.VISUAL_ID) {
				result.add(new GeometryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TrackPositionEditPart.VISUAL_ID) {
				result.add(new GeometryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getContainedLinks(View view) {
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getGeometry_1000ContainedLinks(view);
		case ClickablePositionEditPart.VISUAL_ID:
			return getClickablePosition_2001ContainedLinks(view);
		case TrackPositionEditPart.VISUAL_ID:
			return getTrackPosition_2002ContainedLinks(view);
		case TrackEditPart.VISUAL_ID:
			return getTrack_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getIncomingLinks(View view) {
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case ClickablePositionEditPart.VISUAL_ID:
			return getClickablePosition_2001IncomingLinks(view);
		case TrackPositionEditPart.VISUAL_ID:
			return getTrackPosition_2002IncomingLinks(view);
		case TrackEditPart.VISUAL_ID:
			return getTrack_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getOutgoingLinks(View view) {
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case ClickablePositionEditPart.VISUAL_ID:
			return getClickablePosition_2001OutgoingLinks(view);
		case TrackPositionEditPart.VISUAL_ID:
			return getTrackPosition_2002OutgoingLinks(view);
		case TrackEditPart.VISUAL_ID:
			return getTrack_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getGeometry_1000ContainedLinks(
			View view) {
		Geometry modelElement = (Geometry) view.getElement();
		LinkedList<GeometryLinkDescriptor> result = new LinkedList<GeometryLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Track_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getClickablePosition_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getTrackPosition_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getTrack_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getClickablePosition_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getTrackPosition_2002IncomingLinks(
			View view) {
		geometry.trackPosition modelElement = (geometry.trackPosition) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GeometryLinkDescriptor> result = new LinkedList<GeometryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Track_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getTrack_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getClickablePosition_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getTrackPosition_2002OutgoingLinks(
			View view) {
		geometry.trackPosition modelElement = (geometry.trackPosition) view
				.getElement();
		LinkedList<GeometryLinkDescriptor> result = new LinkedList<GeometryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Track_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getTrack_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<GeometryLinkDescriptor> getContainedTypeModelFacetLinks_Track_4001(
			Geometry container) {
		LinkedList<GeometryLinkDescriptor> result = new LinkedList<GeometryLinkDescriptor>();
		for (Iterator<?> links = container.getGeoObjects().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Track) {
				continue;
			}
			Track link = (Track) linkObject;
			if (TrackEditPart.VISUAL_ID != GeometryVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			geometry.trackPosition dst = link.getEndPosition();
			geometry.trackPosition src = link.getStartPosition();
			result.add(new GeometryLinkDescriptor(src, dst, link,
					GeometryElementTypes.Track_4001, TrackEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeometryLinkDescriptor> getIncomingTypeModelFacetLinks_Track_4001(
			geometry.trackPosition target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeometryLinkDescriptor> result = new LinkedList<GeometryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != GeometryPackage.eINSTANCE
					.getTrack_EndPosition()
					|| false == setting.getEObject() instanceof Track) {
				continue;
			}
			Track link = (Track) setting.getEObject();
			if (TrackEditPart.VISUAL_ID != GeometryVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			geometry.trackPosition src = link.getStartPosition();
			result.add(new GeometryLinkDescriptor(src, target, link,
					GeometryElementTypes.Track_4001, TrackEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeometryLinkDescriptor> getOutgoingTypeModelFacetLinks_Track_4001(
			geometry.trackPosition source) {
		Geometry container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Geometry) {
				container = (Geometry) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<GeometryLinkDescriptor> result = new LinkedList<GeometryLinkDescriptor>();
		for (Iterator<?> links = container.getGeoObjects().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Track) {
				continue;
			}
			Track link = (Track) linkObject;
			if (TrackEditPart.VISUAL_ID != GeometryVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			geometry.trackPosition dst = link.getEndPosition();
			geometry.trackPosition src = link.getStartPosition();
			if (src != source) {
				continue;
			}
			result.add(new GeometryLinkDescriptor(src, dst, link,
					GeometryElementTypes.Track_4001, TrackEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<GeometryNodeDescriptor> getSemanticChildren(View view) {
			return GeometryDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GeometryLinkDescriptor> getContainedLinks(View view) {
			return GeometryDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GeometryLinkDescriptor> getIncomingLinks(View view) {
			return GeometryDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GeometryLinkDescriptor> getOutgoingLinks(View view) {
			return GeometryDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
