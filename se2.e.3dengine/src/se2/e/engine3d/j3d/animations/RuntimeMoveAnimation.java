package se2.e.engine3d.j3d.animations;

import java.util.Arrays;

import javax.media.j3d.Transform3D;
import javax.media.j3d.WakeupCondition;
import javax.media.j3d.WakeupOnElapsedFrames;
import javax.vecmath.Vector3d;

import se2.e.engine3d.GeometryAndAppearanceLoader;
import se2.e.engine3d.j3d.DynamicBranch;
import se2.e.simulator.runtime.petrinet.RuntimeToken;
import se2.e.utilities.PathInterpolator;
import se2.e.utilities.Vector2D;
import se2.e.utilities.Where;
import se2.e.utilities.path.LinearPathInterpolator;
import animations.Move;

/**
 * The Class RuntimeMoveAnimation implementing a {@link RuntimeAnimation} for a {@link Move} animation.
 * 
 * @author cosmin
 */
public class RuntimeMoveAnimation extends RuntimeAnimation<Move> {

	/** The Constant UPDATE_FRAME_COUNT. */
	private static final int UPDATE_FRAME_COUNT = 20;

	/** The path interpolator. */
	private PathInterpolator pathInterpolator;

	/** The current position. */
	private Where currentPosition = null;

	/** The current distance from the origin of the move animation the object is at. */
	private double distance = 0;

	/** The geometry and appearance loader. */
	GeometryAndAppearanceLoader loader;

	/**
	 * Instantiates a new runtime move animation.
	 * 
	 * @param targetBranch the target branch
	 * @param animation the animation
	 * @param token the token
	 * @param listener the engine
	 * @param loader the loader
	 * @author cosmin
	 */
	public RuntimeMoveAnimation(DynamicBranch targetBranch, Move animation, RuntimeToken token,
			RuntimeAnimationListener listener, GeometryAndAppearanceLoader loader) {
		super(targetBranch, animation, token, listener);
		this.loader = loader;
	}

	@Override
	public WakeupCondition init() {
		Vector2D[] trackPoints = loader.getTrackPoints(animation.getGeoTrack());
		this.pathInterpolator = new LinearPathInterpolator(trackPoints);
		System.out.println("Starting new move animation for: " + Arrays.toString(trackPoints));
		currentPosition = this.pathInterpolator.start();

		// Place the object on the initial position
		distance = -animation.getSpeed();
		WakeupCondition criteria = onUpdateAnimation();

		return criteria;
	}

	@Override
	public WakeupCondition onUpdateAnimation() {
		// Compute new update location
		distance += animation.getSpeed();
		currentPosition = pathInterpolator.findPosition(distance);

		// Move the object to the new position
		Transform3D t = new Transform3D();
		t.setTranslation(new Vector3d(currentPosition.getPosition().getX(), currentPosition.getY(), 0));
		this.targetBranch.getTransformGroup().setTransform(t);

		// Check for finishing conditions
		if (pathInterpolator.getLength() < distance) {
			onAnimationFinished();
			return null;
		}
		return new WakeupOnElapsedFrames(UPDATE_FRAME_COUNT);
	}

	@Override
	protected void onAnimationFinished() {
		System.out.println("Animation Finished: " + token);
		super.onAnimationFinished();
	}

}
