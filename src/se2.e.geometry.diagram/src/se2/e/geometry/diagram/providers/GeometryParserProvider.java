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
import se2.e.geometry.diagram.edit.parts.SimplePositionLabelEditPart;
import se2.e.geometry.diagram.edit.parts.SimplePositionNameEditPart;
import se2.e.geometry.diagram.edit.parts.TrackLabelEditPart;
import se2.e.geometry.diagram.edit.parts.WrappingLabelEditPart;
import se2.e.geometry.diagram.parsers.MessageFormatParser;
import se2.e.geometry.diagram.part.GeometryVisualIDRegistry;

/**
 * @generated
 */
public class GeometryParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser simplePositionLabel_5001Parser;

	/**
	 * @generated
	 */
	private IParser getSimplePositionLabel_5001Parser() {
		if (simplePositionLabel_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { GeometryPackage.eINSTANCE
					.getSimplePosition_Label() };
			EAttribute[] editableFeatures = new EAttribute[] { GeometryPackage.eINSTANCE
					.getSimplePosition_Label() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			simplePositionLabel_5001Parser = parser;
		}
		return simplePositionLabel_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser trackLabel_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTrackLabel_6001Parser() {
		if (trackLabel_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { GeometryPackage.eINSTANCE
					.getTrack_Label() };
			EAttribute[] editableFeatures = new EAttribute[] { GeometryPackage.eINSTANCE
					.getTrack_Label() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			trackLabel_6001Parser = parser;
		}
		return trackLabel_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SimplePositionLabelEditPart.VISUAL_ID:
			return getSimplePositionLabel_5001Parser();
		case TrackLabelEditPart.VISUAL_ID:
			return getTrackLabel_6001Parser();
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
