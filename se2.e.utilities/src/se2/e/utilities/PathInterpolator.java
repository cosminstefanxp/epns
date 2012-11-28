package se2.e.utilities;

import java.util.List;

/**
 * 
 * @author anders
 *
 */
public interface PathInterpolator {
	
	/**
	 * Get the length of the path.
	 * 
	 * @return the path length.
	 */
	double getLength();
	
	/**
	 * Find the position after having followed the path for a distance.
	 * 
	 * If the distance is longer than the path length,
	 * the position of the end point will be set.
	 * 
	 * @param distance the distance from the start of the path.
	 * @return the position.
	 * @throws IllegalArgumentException if distance is less than zero.
	 */
	Where findPosition(double distance);
	
	/**
	 * The start position of this path.
	 * 
	 * @return the start position.
	 */
	Where start();
	
  	/**
  	 * Create a list of points of the path with a distance close to one (pixel).
  	 * 
  	 * For use with the geometry editor.
  	 * 
  	 * @return list of Vector2D points.
  	 */
	List<Vector2D> getIntermediatePoints();
	
	}
