/**
 */
package appearance;

import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see appearance.AppearancePackage#getColorType()
 * @model
 * @generated
 */
public enum ColorType implements Enumerator {
	/**
	 * The '<em><b>Black</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK(0, "Black", "Black"),

	/**
	 * The '<em><b>Blue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE(1, "Blue", "Blue"),

	/**
	 * The '<em><b>Cyan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYAN_VALUE
	 * @generated
	 * @ordered
	 */
	CYAN(2, "Cyan", "Cyan"),

	/**
	 * The '<em><b>Dark Gray</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARK_GRAY_VALUE
	 * @generated
	 * @ordered
	 */
	DARK_GRAY(3, "DarkGray", "DarkGray"),

	/**
	 * The '<em><b>Gray</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAY_VALUE
	 * @generated
	 * @ordered
	 */
	GRAY(4, "Gray", "Gray"),

	/**
	 * The '<em><b>Green</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	GREEN(5, "Green", "Green"),

	/**
	 * The '<em><b>Light Gray</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_GRAY_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT_GRAY(6, "LightGray", "LightGray"),

	/**
	 * The '<em><b>Magenta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAGENTA_VALUE
	 * @generated
	 * @ordered
	 */
	MAGENTA(7, "Magenta", "Magenta"),

	/**
	 * The '<em><b>Orange</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORANGE_VALUE
	 * @generated
	 * @ordered
	 */
	ORANGE(8, "Orange", "Orange"),

	/**
	 * The '<em><b>Pink</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINK_VALUE
	 * @generated
	 * @ordered
	 */
	PINK(9, "Pink", "Pink"),

	/**
	 * The '<em><b>Red</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_VALUE
	 * @generated
	 * @ordered
	 */
	RED(10, "Red", "Red"),

	/**
	 * The '<em><b>White</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE(11, "White", "White"),

	/**
	 * The '<em><b>Yellow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW_VALUE
	 * @generated
	 * @ordered
	 */
	YELLOW(12, "Yellow", "Yellow");

	/**
	 * The '<em><b>Black</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Black</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLACK
	 * @model name="Black"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_VALUE = 0;

	/**
	 * The '<em><b>Blue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLUE
	 * @model name="Blue"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_VALUE = 1;

	/**
	 * The '<em><b>Cyan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cyan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CYAN
	 * @model name="Cyan"
	 * @generated
	 * @ordered
	 */
	public static final int CYAN_VALUE = 2;

	/**
	 * The '<em><b>Dark Gray</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dark Gray</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARK_GRAY
	 * @model name="DarkGray"
	 * @generated
	 * @ordered
	 */
	public static final int DARK_GRAY_VALUE = 3;

	/**
	 * The '<em><b>Gray</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gray</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAY
	 * @model name="Gray"
	 * @generated
	 * @ordered
	 */
	public static final int GRAY_VALUE = 4;

	/**
	 * The '<em><b>Green</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Green</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREEN
	 * @model name="Green"
	 * @generated
	 * @ordered
	 */
	public static final int GREEN_VALUE = 5;

	/**
	 * The '<em><b>Light Gray</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Light Gray</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHT_GRAY
	 * @model name="LightGray"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_GRAY_VALUE = 6;

	/**
	 * The '<em><b>Magenta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Magenta</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAGENTA
	 * @model name="Magenta"
	 * @generated
	 * @ordered
	 */
	public static final int MAGENTA_VALUE = 7;

	/**
	 * The '<em><b>Orange</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Orange</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORANGE
	 * @model name="Orange"
	 * @generated
	 * @ordered
	 */
	public static final int ORANGE_VALUE = 8;

	/**
	 * The '<em><b>Pink</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pink</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PINK
	 * @model name="Pink"
	 * @generated
	 * @ordered
	 */
	public static final int PINK_VALUE = 9;

	/**
	 * The '<em><b>Red</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Red</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RED
	 * @model name="Red"
	 * @generated
	 * @ordered
	 */
	public static final int RED_VALUE = 10;

	/**
	 * The '<em><b>White</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>White</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHITE
	 * @model name="White"
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_VALUE = 11;

	/**
	 * The '<em><b>Yellow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Yellow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YELLOW
	 * @model name="Yellow"
	 * @generated
	 * @ordered
	 */
	public static final int YELLOW_VALUE = 12;

	/**
	 * An array of all the '<em><b>Color Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ColorType[] VALUES_ARRAY =
		new ColorType[] {
			BLACK,
			BLUE,
			CYAN,
			DARK_GRAY,
			GRAY,
			GREEN,
			LIGHT_GRAY,
			MAGENTA,
			ORANGE,
			PINK,
			RED,
			WHITE,
			YELLOW,
		};

	/**
	 * A public read-only list of all the '<em><b>Color Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ColorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Color Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColorType get(int value) {
		switch (value) {
			case BLACK_VALUE: return BLACK;
			case BLUE_VALUE: return BLUE;
			case CYAN_VALUE: return CYAN;
			case DARK_GRAY_VALUE: return DARK_GRAY;
			case GRAY_VALUE: return GRAY;
			case GREEN_VALUE: return GREEN;
			case LIGHT_GRAY_VALUE: return LIGHT_GRAY;
			case MAGENTA_VALUE: return MAGENTA;
			case ORANGE_VALUE: return ORANGE;
			case PINK_VALUE: return PINK;
			case RED_VALUE: return RED;
			case WHITE_VALUE: return WHITE;
			case YELLOW_VALUE: return YELLOW;
		}
		return null;
	}
	
	/*
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Juan, María and Pablo.
	 */
	public Color getColorCode() {
		switch (value) {
			case BLACK_VALUE: return Color.BLACK;
			case BLUE_VALUE: return Color.BLUE;
			case CYAN_VALUE: return Color.CYAN;
			case DARK_GRAY_VALUE: return Color.DARK_GRAY;
			case GRAY_VALUE: return Color.GRAY;
			case GREEN_VALUE: return Color.GREEN;
			case LIGHT_GRAY_VALUE: return Color.LIGHT_GRAY;
			case MAGENTA_VALUE: return Color.MAGENTA;
			case ORANGE_VALUE: return Color.ORANGE;
			case PINK_VALUE: return Color.PINK;
			case RED_VALUE: return Color.RED;
			case WHITE_VALUE: return Color.WHITE;
			case YELLOW_VALUE: return Color.YELLOW;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ColorType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ColorType
