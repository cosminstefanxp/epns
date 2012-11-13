package se2.e.engine3d.j3d;

import geometry.Track;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.TransformGroup;

/**
 * The Class RunningAnimation stores info about a running animation.
 * 
 * @author cosmin
 */
public class RunningAnimation {

	/**
	 * Instantiates a new running animation.
	 * 
	 * @param track the track
	 * @param transformGroup the transform group
	 * @param animationBranchGroup the animation branch group
	 * @param speed the speed
	 */
	public RunningAnimation(Track track, TransformGroup transformGroup, BranchGroup animationBranchGroup, double speed) {
		super();
		this.track = track;
		this.transformGroup = transformGroup;
		this.animationBranchGroup = animationBranchGroup;
		this.speed = speed;
	}

	/** The track. */
	public Track track;

	/** The 3D object. */
	public TransformGroup transformGroup;

	/** The animation branch group. */
	public BranchGroup animationBranchGroup;

	/** The speed. */
	public double speed;
}
