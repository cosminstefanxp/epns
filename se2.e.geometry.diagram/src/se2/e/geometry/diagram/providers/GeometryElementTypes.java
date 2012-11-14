package se2.e.geometry.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import se2.e.geometry.GeometryPackage;
import se2.e.geometry.diagram.edit.parts.GeometryEditPart;
import se2.e.geometry.diagram.edit.parts.SimplePositionEditPart;
import se2.e.geometry.diagram.edit.parts.TrackEditPart;
import se2.e.geometry.diagram.edit.parts.TrackPositionEditPart;
import se2.e.geometry.diagram.part.GeometryDiagramEditorPlugin;

/**
 * @generated
 */
public class GeometryElementTypes {

	/**
	 * @generated
	 */
	private GeometryElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Geometry_1000 = getElementType("se2.e.geometry.diagram.Geometry_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SimplePosition_2001 = getElementType("se2.e.geometry.diagram.SimplePosition_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TrackPosition_2002 = getElementType("se2.e.geometry.diagram.TrackPosition_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Track_4001 = getElementType("se2.e.geometry.diagram.Track_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass && !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return GeometryDiagramEditorPlugin.getInstance().getItemImageDescriptor(
						eClass.getEPackage().getEFactoryInstance().create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Geometry_1000, GeometryPackage.eINSTANCE.getGeometry());

			elements.put(SimplePosition_2001, GeometryPackage.eINSTANCE.getSimplePosition());

			elements.put(TrackPosition_2002, GeometryPackage.eINSTANCE.getTrackPosition());

			elements.put(Track_4001, GeometryPackage.eINSTANCE.getTrack());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Geometry_1000);
			KNOWN_ELEMENT_TYPES.add(SimplePosition_2001);
			KNOWN_ELEMENT_TYPES.add(TrackPosition_2002);
			KNOWN_ELEMENT_TYPES.add(Track_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case GeometryEditPart.VISUAL_ID:
			return Geometry_1000;
		case SimplePositionEditPart.VISUAL_ID:
			return SimplePosition_2001;
		case TrackPositionEditPart.VISUAL_ID:
			return TrackPosition_2002;
		case TrackEditPart.VISUAL_ID:
			return Track_4001;
		}
		return null;
	}

}
