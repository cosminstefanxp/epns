package se2.e.geometry.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import se2.e.geometry.diagram.part.GeometryVisualIDRegistry;

/**
 * @generated
 */
public class GeometryNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof GeometryNavigatorItem) {
			GeometryNavigatorItem item = (GeometryNavigatorItem) element;
			return GeometryVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
