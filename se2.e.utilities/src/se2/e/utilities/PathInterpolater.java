package se2.e.utilities;

/**
 * 
 * @author anders
 *
 */
public interface Path {
	
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
	 * @param position the position to update with the new values.
	 * @return the position.
	 * @throws IllegalArgumentException if distance is less than zero.
	 */
	Where findPosition(double distance, Where position);
	
	/**
	 * The start position of this path.
	 * 
	 * @return the start position.
	 */
	Where start();
	
//	/**
//	 * Find the new position after having followed the path for a distance.
//	 * 
//	 * If the distance is longer than the path length,
//	 * the position of the end point will be set.
//	 * 
//	 * @param delta the distance from the position.
//	 * @param position the position to update.
//	 * @throws IllegalArgumentException if distance is less than zero.
//	 */
//	void movePosition(double delta, Where position);
//	
  }
