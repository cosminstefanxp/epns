package se2.e.engine3d;

import se2.e.geometry.Geometry;
import se2.e.geometry.GeometryObject;
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

	/**
	 * Instantiates a new geometry loader, loading the geometry and appearance configurations and connecting them with
	 * each-other.
	 * 
	 * @param geometry the geometry
	 * @param appearance the appearance
	 */
	public GeometryAndAppearanceLoader(Geometry geometry, AppearanceModel appearance) {
		log.info("Loading geometry and appearance configurations...");
		List<GeometryObject> geomObjs = geometry.getGeoObjects();
		trackObjects = new HashMap<String, Track>();
		simplePositionObjects = new HashMap<String, SimplePosition>();
		for (GeometryObject geomObj : geomObjs) {
			if(geomObj instanceof Track)
			{
				trackObjects.put(((Track)geomObj).getLabel(), (Track)geomObj);
			}
			else if(geomObj instanceof SimplePosition)
			{
				simplePositionObjects.put(((SimplePosition)geomObj).getLabel(), (SimplePosition)geomObj);
			}
		}
		log.info("Loaded trackObjects geometry: " + trackObjects);
		log.info("Loaded simplePositionObjects geometry: " + simplePositionObjects);
		
		
		List<AppearanceInfo> appInfoObjs = appearance.getAppearanceInfos();
		appearanceInfo = new HashMap<String, AppearanceInfo>();
		for (AppearanceInfo appInfo: appInfoObjs){
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
	public Track getTrackObject(String label){
		return trackObjects.get(label);
	}
	
	/**
	 * Gets the simple position object with a given name.
	 *
	 * @param label the label
	 * @return the simple position object
	 */
	public SimplePosition getSimplePositionObject(String label){
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
	public Set<String> getTrackLabels(){
		return trackObjects.keySet();
	}
	
	/**
	 * Gets the simple position labels.
	 *
	 * @return the simple position labels
	 */
	public Set<String> getSimplePositionLabels(){
		return simplePositionObjects.keySet();
	}
	
	/**
	 * Gets the appearance info labels.
	 *
	 * @return the appearance info labels
	 */
	public Set<String> getAppearanceInfoLabels(){
		return appearanceInfo.keySet();
	}
}
