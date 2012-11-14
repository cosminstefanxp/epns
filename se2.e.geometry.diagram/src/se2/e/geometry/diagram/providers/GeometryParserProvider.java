package se2.e.geometry.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import se2.e.geometry.GeometryPackage;
import se2.e.geometry.diagram.edit.parts.SimplePositionNameEditPart;
import se2.e.geometry.diagram.edit.parts.WrappingLabelEditPart;
import se2.e.geometry.diagram.parsers.MessageFormatParser;
import se2.e.geometry.diagram.part.GeometryVisualIDRegistry;

/**
 * @generated
 */
public class GeometryParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser simplePositionName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getSimplePositionName_5001Parser() {
		if (simplePositionName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { GeometryPackage.eINSTANCE.getName_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { GeometryPackage.eINSTANCE.getName_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			simplePositionName_5001Parser = parser;
		}
		return simplePositionName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser trackName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTrackName_6001Parser() {
		if (trackName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { GeometryPackage.eINSTANCE.getName_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { GeometryPackage.eINSTANCE.getName_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			trackName_6001Parser = parser;
		}
		return trackName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SimplePositionNameEditPart.VISUAL_ID:
			return getSimplePositionName_5001Parser();
		case WrappingLabelEditPart.VISUAL_ID:
			return getTrackName_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GeometryVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GeometryVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GeometryElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
