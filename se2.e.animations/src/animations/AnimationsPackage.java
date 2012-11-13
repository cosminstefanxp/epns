/**
 */
package animations;

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
 * @see animations.AnimationsFactory
 * @model kind="package"
 * @generated
 */
public interface AnimationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "animations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://animations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "animations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnimationsPackage eINSTANCE = animations.impl.AnimationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link animations.impl.AnimationImpl <em>Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see animations.impl.AnimationImpl
	 * @see animations.impl.AnimationsPackageImpl#getAnimation()
	 * @generated
	 */
	int ANIMATION = 0;

	/**
	 * The number of structural features of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link animations.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see animations.impl.SequenceImpl
	 * @see animations.impl.AnimationsPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__COMPONENTS = ANIMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link animations.impl.HideImpl <em>Hide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see animations.impl.HideImpl
	 * @see animations.impl.AnimationsPackageImpl#getHide()
	 * @generated
	 */
	int HIDE = 2;

	/**
	 * The feature id for the '<em><b>Simple Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE__SIMPLE_POSITION = ANIMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link animations.impl.ShowImpl <em>Show</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see animations.impl.ShowImpl
	 * @see animations.impl.AnimationsPackageImpl#getShow()
	 * @generated
	 */
	int SHOW = 3;

	/**
	 * The feature id for the '<em><b>Simple Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__SIMPLE_POSITION = ANIMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__SHAPE = ANIMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Show</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link animations.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see animations.impl.MoveImpl
	 * @see animations.impl.AnimationsPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 4;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__SPEED = ANIMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geo Track</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__GEO_TRACK = ANIMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link animations.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see animations.impl.WaitImpl
	 * @see animations.impl.AnimationsPackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 5;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__TIME = ANIMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link animations.Animation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation</em>'.
	 * @see animations.Animation
	 * @generated
	 */
	EClass getAnimation();

	/**
	 * Returns the meta object for class '{@link animations.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see animations.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link animations.Sequence#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see animations.Sequence#getComponents()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Components();

	/**
	 * Returns the meta object for class '{@link animations.Hide <em>Hide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hide</em>'.
	 * @see animations.Hide
	 * @generated
	 */
	EClass getHide();

	/**
	 * Returns the meta object for the attribute '{@link animations.Hide#getSimplePosition <em>Simple Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Position</em>'.
	 * @see animations.Hide#getSimplePosition()
	 * @see #getHide()
	 * @generated
	 */
	EAttribute getHide_SimplePosition();

	/**
	 * Returns the meta object for class '{@link animations.Show <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show</em>'.
	 * @see animations.Show
	 * @generated
	 */
	EClass getShow();

	/**
	 * Returns the meta object for the attribute '{@link animations.Show#getSimplePosition <em>Simple Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Position</em>'.
	 * @see animations.Show#getSimplePosition()
	 * @see #getShow()
	 * @generated
	 */
	EAttribute getShow_SimplePosition();

	/**
	 * Returns the meta object for the attribute '{@link animations.Show#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see animations.Show#getShape()
	 * @see #getShow()
	 * @generated
	 */
	EAttribute getShow_Shape();

	/**
	 * Returns the meta object for class '{@link animations.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see animations.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the attribute '{@link animations.Move#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see animations.Move#getSpeed()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Speed();

	/**
	 * Returns the meta object for the attribute '{@link animations.Move#getGeoTrack <em>Geo Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo Track</em>'.
	 * @see animations.Move#getGeoTrack()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_GeoTrack();

	/**
	 * Returns the meta object for class '{@link animations.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see animations.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for the attribute '{@link animations.Wait#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see animations.Wait#getTime()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Time();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnimationsFactory getAnimationsFactory();

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
		 * The meta object literal for the '{@link animations.impl.AnimationImpl <em>Animation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see animations.impl.AnimationImpl
		 * @see animations.impl.AnimationsPackageImpl#getAnimation()
		 * @generated
		 */
		EClass ANIMATION = eINSTANCE.getAnimation();

		/**
		 * The meta object literal for the '{@link animations.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see animations.impl.SequenceImpl
		 * @see animations.impl.AnimationsPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__COMPONENTS = eINSTANCE.getSequence_Components();

		/**
		 * The meta object literal for the '{@link animations.impl.HideImpl <em>Hide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see animations.impl.HideImpl
		 * @see animations.impl.AnimationsPackageImpl#getHide()
		 * @generated
		 */
		EClass HIDE = eINSTANCE.getHide();

		/**
		 * The meta object literal for the '<em><b>Simple Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE__SIMPLE_POSITION = eINSTANCE.getHide_SimplePosition();

		/**
		 * The meta object literal for the '{@link animations.impl.ShowImpl <em>Show</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see animations.impl.ShowImpl
		 * @see animations.impl.AnimationsPackageImpl#getShow()
		 * @generated
		 */
		EClass SHOW = eINSTANCE.getShow();

		/**
		 * The meta object literal for the '<em><b>Simple Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW__SIMPLE_POSITION = eINSTANCE.getShow_SimplePosition();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW__SHAPE = eINSTANCE.getShow_Shape();

		/**
		 * The meta object literal for the '{@link animations.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see animations.impl.MoveImpl
		 * @see animations.impl.AnimationsPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__SPEED = eINSTANCE.getMove_Speed();

		/**
		 * The meta object literal for the '<em><b>Geo Track</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__GEO_TRACK = eINSTANCE.getMove_GeoTrack();

		/**
		 * The meta object literal for the '{@link animations.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see animations.impl.WaitImpl
		 * @see animations.impl.AnimationsPackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__TIME = eINSTANCE.getWait_Time();

	}

} //AnimationsPackage
