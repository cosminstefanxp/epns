package geometry.diagram.providers;

import geometry.GeometryPackage;
import geometry.diagram.edit.parts.ClickablePositionLabelEditPart;
import geometry.diagram.edit.parts.TrackPositionLabelEditPart;
import geometry.diagram.parsers.MessageFormatParser;
import geometry.diagram.part.GeometryVisualIDRegistry;

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

/**
 * @generated
 */
public class GeometryParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser clickablePositionLabel_5001Parser;

	/**
	 * @generated
	 */
	private IParser getClickablePositionLabel_5001Parser() {
		if (clickablePositionLabel_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { GeometryPackage.eINSTANCE
					.getGeometryObject_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			clickablePositionLabel_5001Parser = parser;
		}
		return clickablePositionLabel_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser trackPositionLabel_5002Parser;

	/**
	 * @generated
	 */
	private IParser getTrackPositionLabel_5002Parser() {
		if (trackPositionLabel_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { GeometryPackage.eINSTANCE
					.getGeometryObject_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			trackPositionLabel_5002Parser = parser;
		}
		return trackPositionLabel_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ClickablePositionLabelEditPart.VISUAL_ID:
			return getClickablePositionLabel_5001Parser();
		case TrackPositionLabelEditPart.VISUAL_ID:
			return getTrackPositionLabel_5002Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
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
