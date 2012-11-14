package se2.e.engine3d.j3d;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.TransformGroup;

import se2.e.engine3d.GeometryAndAppearanceLoader;

/**
 * A factory for creating DynamicBranch objects. It is the responsibility of this factory to create the Java3D nodes and
 * connect the {@link TransformGroup} to the {@link BranchGroup}, before putting them in the {@link DynamicBranch}.
 * 
 * @author marius, cosmin (just initial structure)
 */
public class DynamicBranchFactory {

	/** The loader. */
	private GeometryAndAppearanceLoader loader;

	/**
	 * Instantiates a new dynamic branch factory.
	 * 
	 * @param loader the loader
	 */
	public DynamicBranchFactory(GeometryAndAppearanceLoader loader) {
		super();
		this.loader = loader;
	}

	/**
	 * Gets the token branch for a specific label (e.g. 'red_train').
	 * 
	 * @param label the label
	 * @return the token branch
	 */
	public DynamicBranch getTokenBranch(String label) {
		// TODO: Implement
		return null;
	}



}
