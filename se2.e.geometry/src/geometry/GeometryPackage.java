/**
 */
package geometry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see geometry.GeometryFactory
 * @model kind="package"
 * @generated
 */
public interface GeometryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "geometry";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://geometry/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "geometry";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeometryPackage eINSTANCE = geometry.impl.GeometryPackageImpl.init();

	/**
	 * The meta object id for the '{@link geometry.impl.GeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry.impl.GeometryImpl
	 * @see geometry.impl.GeometryPackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__ID = 0;

	/**
	 * The feature id for the '<em><b>Geo Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__GEO_OBJECTS = 1;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link geometry.impl.GeometryObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry.impl.GeometryObjectImpl
	 * @see geometry.impl.GeometryPackageImpl#getGeometryObject()
	 * @generated
	 */
	int GEOMETRY_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OBJECT__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link geometry.impl.TrackImpl <em>Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry.impl.TrackImpl
	 * @see geometry.impl.GeometryPackageImpl#getTrack()
	 * @generated
	 */
	int TRACK = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__LABEL = GEOMETRY_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__START_POSITION = GEOMETRY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__END_POSITION = GEOMETRY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Intermediate Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__INTERMEDIATE_POSITIONS = GEOMETRY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_FEATURE_COUNT = GEOMETRY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link geometry.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry.impl.PositionImpl
	 * @see geometry.impl.GeometryPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = 1;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link geometry.impl.ClickablePositionImpl <em>Clickable Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry.impl.ClickablePositionImpl
	 * @see geometry.impl.GeometryPackageImpl#getClickablePosition()
	 * @generated
	 */
	int CLICKABLE_POSITION = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICKABLE_POSITION__LABEL = GEOMETRY_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICKABLE_POSITION__POSITION = GEOMETRY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clickable Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICKABLE_POSITION_FEATURE_COUNT = GEOMETRY_OBJECT_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link geometry.impl.trackPositionImpl <em>track Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry.impl.trackPositionImpl
	 * @see geometry.impl.GeometryPackageImpl#gettrackPosition()
	 * @generated
	 */
	int TRACK_POSITION = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_POSITION__LABEL = GEOMETRY_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_POSITION__POSITION = GEOMETRY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>track Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_POSITION_FEATURE_COUNT = GEOMETRY_OBJECT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link geometry.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see geometry.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for the attribute '{@link geometry.Geometry#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see geometry.Geometry#getID()
	 * @see #getGeometry()
	 * @generated
	 */
	EAttribute getGeometry_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link geometry.Geometry#getGeoObjects <em>Geo Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geo Objects</em>'.
	 * @see geometry.Geometry#getGeoObjects()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_GeoObjects();

	/**
	 * Returns the meta object for class '{@link geometry.GeometryObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see geometry.GeometryObject
	 * @generated
	 */
	EClass getGeometryObject();

	/**
	 * Returns the meta object for the attribute '{@link geometry.GeometryObject#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see geometry.GeometryObject#getLabel()
	 * @see #getGeometryObject()
	 * @generated
	 */
	EAttribute getGeometryObject_Label();

	/**
	 * Returns the meta object for class '{@link geometry.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track</em>'.
	 * @see geometry.Track
	 * @generated
	 */
	EClass getTrack();

	/**
	 * Returns the meta object for the reference '{@link geometry.Track#getStartPosition <em>Start Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Position</em>'.
	 * @see geometry.Track#getStartPosition()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_StartPosition();

	/**
	 * Returns the meta object for the reference '{@link geometry.Track#getEndPosition <em>End Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Position</em>'.
	 * @see geometry.Track#getEndPosition()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_EndPosition();

	/**
	 * Returns the meta object for the containment reference list '{@link geometry.Track#getIntermediatePositions <em>Intermediate Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Positions</em>'.
	 * @see geometry.Track#getIntermediatePositions()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_IntermediatePositions();

	/**
	 * Returns the meta object for class '{@link geometry.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see geometry.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link geometry.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see geometry.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link geometry.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see geometry.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the meta object for class '{@link geometry.ClickablePosition <em>Clickable Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clickable Position</em>'.
	 * @see geometry.ClickablePosition
	 * @generated
	 */
	EClass getClickablePosition();

	/**
	 * Returns the meta object for the containment reference '{@link geometry.ClickablePosition#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see geometry.ClickablePosition#getPosition()
	 * @see #getClickablePosition()
	 * @generated
	 */
	EReference getClickablePosition_Position();

	/**
	 * Returns the meta object for class '{@link geometry.trackPosition <em>track Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>track Position</em>'.
	 * @see geometry.trackPosition
	 * @generated
	 */
	EClass gettrackPosition();

	/**
	 * Returns the meta object for the containment reference '{@link geometry.trackPosition#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see geometry.trackPosition#getPosition()
	 * @see #gettrackPosition()
	 * @generated
	 */
	EReference gettrackPosition_Position();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeometryFactory getGeometryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link geometry.impl.GeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry.impl.GeometryImpl
		 * @see geometry.impl.GeometryPackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY__ID = eINSTANCE.getGeometry_ID();

		/**
		 * The meta object literal for the '<em><b>Geo Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__GEO_OBJECTS = eINSTANCE.getGeometry_GeoObjects();

		/**
		 * The meta object literal for the '{@link geometry.impl.GeometryObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry.impl.GeometryObjectImpl
		 * @see geometry.impl.GeometryPackageImpl#getGeometryObject()
		 * @generated
		 */
		EClass GEOMETRY_OBJECT = eINSTANCE.getGeometryObject();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_OBJECT__LABEL = eINSTANCE.getGeometryObject_Label();

		/**
		 * The meta object literal for the '{@link geometry.impl.TrackImpl <em>Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry.impl.TrackImpl
		 * @see geometry.impl.GeometryPackageImpl#getTrack()
		 * @generated
		 */
		EClass TRACK = eINSTANCE.getTrack();

		/**
		 * The meta object literal for the '<em><b>Start Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK__START_POSITION = eINSTANCE.getTrack_StartPosition();

		/**
		 * The meta object literal for the '<em><b>End Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK__END_POSITION = eINSTANCE.getTrack_EndPosition();

		/**
		 * The meta object literal for the '<em><b>Intermediate Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK__INTERMEDIATE_POSITIONS = eINSTANCE.getTrack_IntermediatePositions();

		/**
		 * The meta object literal for the '{@link geometry.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry.impl.PositionImpl
		 * @see geometry.impl.GeometryPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

		/**
		 * The meta object literal for the '{@link geometry.impl.ClickablePositionImpl <em>Clickable Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry.impl.ClickablePositionImpl
		 * @see geometry.impl.GeometryPackageImpl#getClickablePosition()
		 * @generated
		 */
		EClass CLICKABLE_POSITION = eINSTANCE.getClickablePosition();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLICKABLE_POSITION__POSITION = eINSTANCE.getClickablePosition_Position();

		/**
		 * The meta object literal for the '{@link geometry.impl.trackPositionImpl <em>track Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry.impl.trackPositionImpl
		 * @see geometry.impl.GeometryPackageImpl#gettrackPosition()
		 * @generated
		 */
		EClass TRACK_POSITION = eINSTANCE.gettrackPosition();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK_POSITION__POSITION = eINSTANCE.gettrackPosition_Position();

	}

} //GeometryPackage
