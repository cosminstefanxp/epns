package se2.e.engine3d.j3d;

import javax.media.j3d.Behavior;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.TransformGroup;

/**
 * The DynamicBranch holds all the required references for a dynamic object represented in the 3D space. It is only a
 * holder and it's the responsibility of the user to make the appropriate connections.
 * 
 * @author cosmin
 */
public class DynamicBranch {

	/** The {@link TransformGroup} holding the 3D object. */
	public TransformGroup transformGroup;

	/** The branch group. */
	public BranchGroup branchGroup;

	/** The behavior node. */
	public Behavior behaviorNode;

	/**
	 * Gets the behavior node.
	 * 
	 * @return the behavior node
	 */
	protected Behavior getBehaviorNode() {
		return behaviorNode;
	}

	/**
	 * Sets the behavior node.
	 * 
	 * @param behaviorNode the new behavior node
	 */
	protected void setBehaviorNode(Behavior behaviorNode) {
		this.behaviorNode = behaviorNode;
	}

	/**
	 * Gets the transform group.
	 * 
	 * @return the transform group
	 */
	protected TransformGroup getTransformGroup() {
		return transformGroup;
	}

	/**
	 * Gets the branch group.
	 * 
	 * @return the branch group
	 */
	protected BranchGroup getBranchGroup() {
		return branchGroup;
	}

	/**
	 * Instantiates a new dynamic branch.
	 * 
	 * @param transformGroup the transform group
	 * @param branchGroup the branch group
	 */
	public DynamicBranch(TransformGroup transformGroup, BranchGroup branchGroup) {
		super();
		this.transformGroup = transformGroup;
		this.branchGroup = branchGroup;
	}
}
