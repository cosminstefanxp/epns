package anl;

import java.io.StringReader;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;

import com.google.inject.Injector;

import animations.Animation;
import anl.parser.antlr.AnimationsLanguageParser;

/**
 * This class makes available the parse operations in a singleton class.
 * 
 * @generated NOT
 * @author Juan, Pablo and María
 */

public class AnimationsParser {
	
	private AnimationsLanguageParser parser;
	
	public AnimationsParser() {
   		Injector guiceInjector = new AnimationsLanguageStandaloneSetup().createInjector();	
		parser = guiceInjector.getInstance(AnimationsLanguageParser.class);
	}

	public Animation parseAnimation(String input) {
		ParserRule rule = parser.getGrammarAccess().getAnimationRule();
		IParseResult result = parser.parse(rule, new StringReader(input));
		Iterable<INode> errors = result.getSyntaxErrors();
		if (!errors.iterator().hasNext())  {
			EObject object = result.getRootASTElement();
			if (object instanceof Animation) {
			  return (Animation) object;
			}
		} 
	    return null;
	}
	
}