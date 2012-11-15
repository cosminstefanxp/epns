package se2.e.engine3d;

import se2.e.geometry.Geometry;
import se2.e.geometry.GeometryObject;
import se2.e.geometry.Position;
import se2.e.geometry.SimplePosition;
import se2.e.geometry.Track;
import appearance.AppearanceInfo;
import appearance.AppearanceModel;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * The GeometryAndAppearanceLoader handles the loading of the geometry and appearance configurations.
 * 
 * @author marius, cosmin (just initial structure)
 */
public class GeometryAndAppearanceLoader {

	/** The track objects. */
	private HashMap<String, Track> trackObjects;

	/** The simple position objects. */
	private HashMap<String, SimplePosition> simplePositionObjects;

	/** The appearance information. */
	private HashMap<String, AppearanceInfo> appearanceInfo;

	/** The log. */
	private Logger log = Logger.getLogger("GeometryAndAppearanceLoader");

	/** The min x. */
	public double minX = Double.MAX_VALUE;

	/** The max x. */
	public double maxX = Double.MIN_VALUE;

	/** The min y. */
	public double minY = Double.MAX_VALUE;

	/** The max y. */
	public double maxY = Double.MIN_VALUE;

	/**
	 * Updates the limits based on a position
	 * 
	 * @param pos the position
	 * @author cosmin
	 */
	private void updateLimits(Position pos) {
		if (pos.getX() > maxX)
			maxX = pos.getX();
		else if (pos.getX() < minX)
			minX = pos.getX();
		if (pos.getY() > maxY)
			maxY = pos.getY();
		else if (pos.getY() < minY)
			minY = pos.getY();
	}

	/**
	 * Instantiates a new geometry loader, loading the geometry and appearance configurations and connecting them with
	 * each-other.
	 * 
	 * @param geometry the geometry
	 * @param appearance the appearance
	 * @author cosmin, marius
	 */
	public GeometryAndAppearanceLoader(Geometry geometry, AppearanceModel appearance) {
		log.info("Loading geometry and appearance configurations...");
		List<GeometryObject> geomObjs = geometry.getGeoObjects();
		trackObjects = new HashMap<String, Track>();
		simplePositionObjects = new HashMap<String, SimplePosition>();
		// Load up geometry objects
		for (GeometryObject geomObj : geomObjs) {
			if (geomObj instanceof Track) {
				Track track = (Track) geomObj;
				trackObjects.put(track.getLabel(), track);
				updateLimits(track.getStartPosition().getPosition());
				updateLimits(track.getEndPosition().getPosition());
				for (Position pos : track.getIntermediatePositions())
					updateLimits(pos);
			} else if (geomObj instanceof SimplePosition) {
				simplePositionObjects.put(((SimplePosition) geomObj).getLabel(), (SimplePosition) geomObj);
				updateLimits(((SimplePosition) geomObj).getPosition());
			}
		}
		log.info("Loaded trackObjects geometry: " + trackObjects);
		log.info("Loaded simplePositionObjects geometry: " + simplePositionObjects);
		log.info(String.format("Limits - X: (%f,  %f), Y: (%f, %f)", minX, maxX, minY, maxY));

		// Load up appearance info
		List<AppearanceInfo> appInfoObjs = appearance.getAppearanceInfos();
		appearanceInfo = new HashMap<String, AppearanceInfo>();
		for (AppearanceInfo appInfo : appInfoObjs) {
			appearanceInfo.put(appInfo.getLabel(), appInfo);
		}
		log.info("Loaded appearanceInfo: " + appearanceInfo);
	}

	/**
	 * Gets the track object with a given name.
	 * 
	 * @param label the label
	 * @return the track object
	 */
	public Track getTrackObject(String label) {
		return trackObjects.get(label);
	}

	/**
	 * Gets the simple position object with a given name.
	 * 
	 * @param label the label
	 * @return the simple position object
	 */
	public SimplePosition getSimplePositionObject(String label) {
		return simplePositionObjects.get(label);
	}

	/**
	 * Gets the appearance info.
	 * 
	 * @param label the label
	 * @return the appearance info
	 */
	public AppearanceInfo getAppearanceInfo(String label) {
		return appearanceInfo.get(label);
	}

	/**
	 * Gets the track labels.
	 * 
	 * @return the track labels
	 */
	public Set<String> getTrackLabels() {
		return trackObjects.keySet();
	}

	/**
	 * Gets the simple position labels.
	 * 
	 * @return the simple position labels
	 */
	public Set<String> getSimplePositionLabels() {
		return simplePositionObjects.keySet();
	}

	/**
	 * Gets the appearance info labels.
	 * 
	 * @return the appearance info labels
	 */
	public Set<String> getAppearanceInfoLabels() {
		return appearanceInfo.keySet();
	}
}
