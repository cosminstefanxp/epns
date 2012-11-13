package se2.e.engine3d;

import se2.e.engine3d.j3d.J3DEngine;

/**
 * A factory for creating Engine3D objects.
 */
public class Engine3DFactory {

	/**
	 * Gets the engine.
	 * 
	 * @return the engine
	 */
	public static Engine3D getEngine() {
		return new J3DEngine();
	}
}
