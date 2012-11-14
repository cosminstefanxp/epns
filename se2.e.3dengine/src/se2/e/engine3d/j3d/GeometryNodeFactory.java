package se2.e.engine3d.j3d;

import javax.media.j3d.Node;

import se2.e.engine3d.GeometryAndAppearanceLoader;

/**
 * A factory for creating nodes containing the representation for the geometry.
 */
public class GeometryNodeFactory {

	/** The loader. */
	private GeometryAndAppearanceLoader loader;

	/**
	 * Instantiates a new geometry node factory.
	 * 
	 * @param loader the loader
	 */
	public GeometryNodeFactory(GeometryAndAppearanceLoader loader) {
		super();
		this.loader = loader;
	}

	/**
	 * Gets the geometry node (could be, for example, a Transform Group) for a specific label (e.g. 'track1'). If the
	 * label does not correspond to a static Geometry Element (e.g. Track), return null.
	 * 
	 * @param geometryLabel the geometry label
	 * @return the node containing the representation for the geometry, or null, if there is no geometry with the given
	 * label or it's not a static GeometryObject (Track).
	 */
	public Node getGeometryNode(String geometryLabel) {
		// TODO: Implement
		return null;
	}
}
