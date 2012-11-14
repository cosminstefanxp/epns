/**
 */
package se2.e.geometry;

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
 * @see se2.e.geometry.GeometryFactory
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
	GeometryPackage eINSTANCE = se2.e.geometry.impl.GeometryPackageImpl.init();

	/**
	 * The meta object id for the '{@link se2.e.geometry.impl.GeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se2.e.geometry.impl.GeometryImpl
	 * @see se2.e.geometry.impl.GeometryPackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 0;

	/**
	 * The feature id for the '<em><b>Geo Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__GEO_OBJECTS = 0;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link se2.e.geometry.impl.GeometryObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se2.e.geometry.impl.GeometryObjectImpl
	 * @see se2.e.geometry.impl.GeometryPackageImpl#getGeometryObject()
	 * @generated
	 */
	int GEOMETRY_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OBJECT__ID = 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link se2.e.geometry.impl.TrackImpl <em>Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se2.e.geometry.impl.TrackImpl
	 * @see se2.e.geometry.impl.GeometryPackageImpl#getTrack()
	 * @generated
	 */
	int TRACK = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__ID = GEOMETRY_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__NAME = GEOMETRY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__START_POSITION = GEOMETRY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__END_POSITION = GEOMETRY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Intermediate Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__INTERMEDIATE_POSITIONS = GEOMETRY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Appearance Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__APPEARANCE_LABEL = GEOMETRY_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_FEATURE_COUNT = GEOMETRY_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link se2.e.geometry.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se2.e.geometry.impl.PositionImpl
	 * @see se2.e.geometry.impl.GeometryPackageImpl#getPosition()
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
	 * The meta object id for the '{@link se2.e.geometry.impl.SimplePositionImpl <em>Simple Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se2.e.geometry.impl.SimplePositionImpl
	 * @see se2.e.geometry.impl.GeometryPackageImpl#getSimplePosition()
	 * @generated
	 */
	int SIMPLE_POSITION = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_POSITION__ID = GEOMETRY_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_POSITION__NAME = GEOMETRY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_POSITION__POSITION = GEOMETRY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Appearance Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_POSITION__APPEARANCE_LABEL = GEOMETRY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Simple Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_POSITION_FEATURE_COUNT = GEOMETRY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link se2.e.geometry.impl.TrackPositionImpl <em>Track Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se2.e.geometry.impl.TrackPositionImpl
	 * @see se2.e.geometry.impl.GeometryPackageImpl#getTrackPosition()
	 * @generated
	 */
	int TRACK_POSITION = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_POSITION__ID = GEOMETRY_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_POSITION__POSITION = GEOMETRY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Track Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_POSITION_FEATURE_COUNT = GEOMETRY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link se2.e.geometry.impl.NameImpl <em>Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se2.e.geometry.impl.NameImpl
	 * @see se2.e.geometry.impl.GeometryPackageImpl#getName_()
	 * @generated
	 */
	int NAME = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__NAME = 0;

	/**
	 * The number of structural features of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link se2.e.geometry.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see se2.e.geometry.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for the containment reference list '{@link se2.e.geometry.Geometry#getGeoObjects <em>Geo Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geo Objects</em>'.
	 * @see se2.e.geometry.Geometry#getGeoObjects()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_GeoObjects();

	/**
	 * Returns the meta object for class '{@link se2.e.geometry.GeometryObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see se2.e.geometry.GeometryObject
	 * @generated
	 */
	EClass getGeometryObject();

	/**
	 * Returns the meta object for the attribute '{@link se2.e.geometry.GeometryObject#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see se2.e.geometry.GeometryObject#getID()
	 * @see #getGeometryObject()
	 * @generated
	 */
	EAttribute getGeometryObject_ID();

	/**
	 * Returns the meta object for class '{@link se2.e.geometry.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track</em>'.
	 * @see se2.e.geometry.Track
	 * @generated
	 */
	EClass getTrack();

	/**
	 * Returns the meta object for the reference '{@link se2.e.geometry.Track#getStartPosition <em>Start Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Position</em>'.
	 * @see se2.e.geometry.Track#getStartPosition()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_StartPosition();

	/**
	 * Returns the meta object for the reference '{@link se2.e.geometry.Track#getEndPosition <em>End Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Position</em>'.
	 * @see se2.e.geometry.Track#getEndPosition()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_EndPosition();

	/**
	 * Returns the meta object for the containment reference list '{@link se2.e.geometry.Track#getIntermediatePositions <em>Intermediate Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Positions</em>'.
	 * @see se2.e.geometry.Track#getIntermediatePositions()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_IntermediatePositions();

	/**
	 * Returns the meta object for the attribute '{@link se2.e.geometry.Track#getAppearanceLabel <em>Appearance Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appearance Label</em>'.
	 * @see se2.e.geometry.Track#getAppearanceLabel()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_AppearanceLabel();

	/**
	 * Returns the meta object for class '{@link se2.e.geometry.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see se2.e.geometry.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link se2.e.geometry.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see se2.e.geometry.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link se2.e.geometry.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see se2.e.geometry.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the meta object for class '{@link se2.e.geometry.SimplePosition <em>Simple Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Position</em>'.
	 * @see se2.e.geometry.SimplePosition
	 * @generated
	 */
	EClass getSimplePosition();

	/**
	 * Returns the meta object for the containment reference '{@link se2.e.geometry.SimplePosition#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see se2.e.geometry.SimplePosition#getPosition()
	 * @see #getSimplePosition()
	 * @generated
	 */
	EReference getSimplePosition_Position();

	/**
	 * Returns the meta object for the attribute '{@link se2.e.geometry.SimplePosition#getAppearanceLabel <em>Appearance Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appearance Label</em>'.
	 * @see se2.e.geometry.SimplePosition#getAppearanceLabel()
	 * @see #getSimplePosition()
	 * @generated
	 */
	EAttribute getSimplePosition_AppearanceLabel();

	/**
	 * Returns the meta object for class '{@link se2.e.geometry.TrackPosition <em>Track Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track Position</em>'.
	 * @see se2.e.geometry.TrackPosition
	 * @generated
	 */
	EClass getTrackPosition();

	/**
	 * Returns the meta object for the containment reference '{@link se2.e.geometry.TrackPosition#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see se2.e.geometry.TrackPosition#getPosition()
	 * @see #getTrackPosition()
	 * @generated
	 */
	EReference getTrackPosition_Position();

	/**
	 * Returns the meta object for class '{@link se2.e.geometry.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name</em>'.
	 * @see se2.e.geometry.Name
	 * @generated
	 */
	EClass getName_();

	/**
	 * Returns the meta object for the attribute '{@link se2.e.geometry.Name#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se2.e.geometry.Name#getName()
	 * @see #getName_()
	 * @generated
	 */
	EAttribute getName_Name();

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
		 * The meta object literal for the '{@link se2.e.geometry.impl.GeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se2.e.geometry.impl.GeometryImpl
		 * @see se2.e.geometry.impl.GeometryPackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '<em><b>Geo Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__GEO_OBJECTS = eINSTANCE.getGeometry_GeoObjects();

		/**
		 * The meta object literal for the '{@link se2.e.geometry.impl.GeometryObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se2.e.geometry.impl.GeometryObjectImpl
		 * @see se2.e.geometry.impl.GeometryPackageImpl#getGeometryObject()
		 * @generated
		 */
		EClass GEOMETRY_OBJECT = eINSTANCE.getGeometryObject();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_OBJECT__ID = eINSTANCE.getGeometryObject_ID();

		/**
		 * The meta object literal for the '{@link se2.e.geometry.impl.TrackImpl <em>Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se2.e.geometry.impl.TrackImpl
		 * @see se2.e.geometry.impl.GeometryPackageImpl#getTrack()
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
		 * The meta object literal for the '<em><b>Appearance Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__APPEARANCE_LABEL = eINSTANCE.getTrack_AppearanceLabel();

		/**
		 * The meta object literal for the '{@link se2.e.geometry.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se2.e.geometry.impl.PositionImpl
		 * @see se2.e.geometry.impl.GeometryPackageImpl#getPosition()
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
		 * The meta object literal for the '{@link se2.e.geometry.impl.SimplePositionImpl <em>Simple Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se2.e.geometry.impl.SimplePositionImpl
		 * @see se2.e.geometry.impl.GeometryPackageImpl#getSimplePosition()
		 * @generated
		 */
		EClass SIMPLE_POSITION = eINSTANCE.getSimplePosition();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_POSITION__POSITION = eINSTANCE.getSimplePosition_Position();

		/**
		 * The meta object literal for the '<em><b>Appearance Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_POSITION__APPEARANCE_LABEL = eINSTANCE.getSimplePosition_AppearanceLabel();

		/**
		 * The meta object literal for the '{@link se2.e.geometry.impl.TrackPositionImpl <em>Track Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se2.e.geometry.impl.TrackPositionImpl
		 * @see se2.e.geometry.impl.GeometryPackageImpl#getTrackPosition()
		 * @generated
		 */
		EClass TRACK_POSITION = eINSTANCE.getTrackPosition();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK_POSITION__POSITION = eINSTANCE.getTrackPosition_Position();

		/**
		 * The meta object literal for the '{@link se2.e.geometry.impl.NameImpl <em>Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se2.e.geometry.impl.NameImpl
		 * @see se2.e.geometry.impl.GeometryPackageImpl#getName_()
		 * @generated
		 */
		EClass NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME__NAME = eINSTANCE.getName_Name();

	}

} //GeometryPackage
