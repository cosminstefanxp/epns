package anl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import anl.services.AnimationsLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnimationsLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'move'", "'('", "','", "')'", "'hide'", "'show'", "'wait'", "'['", "']'", "'-'", "'.'", "'E'", "'e'"
    };
    public static final int RULE_ID=5;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalAnimationsLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnimationsLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnimationsLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g"; }



     	private AnimationsLanguageGrammarAccess grammarAccess;
     	
        public InternalAnimationsLanguageParser(TokenStream input, AnimationsLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Animation";	
       	}
       	
       	@Override
       	protected AnimationsLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAnimation"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:67:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:68:2: (iv_ruleAnimation= ruleAnimation EOF )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:69:2: iv_ruleAnimation= ruleAnimation EOF
            {
             newCompositeNode(grammarAccess.getAnimationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_entryRuleAnimation75);
            iv_ruleAnimation=ruleAnimation();

            state._fsp--;

             current =iv_ruleAnimation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimation85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:76:1: ruleAnimation returns [EObject current=null] : (this_SimpleAnimation_0= ruleSimpleAnimation (otherlv_1= ';' () ( (lv_components_3_0= ruleSimpleAnimation ) ) (otherlv_4= ';' ( (lv_components_5_0= ruleSimpleAnimation ) ) )* )? ) ;
    public final EObject ruleAnimation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_SimpleAnimation_0 = null;

        EObject lv_components_3_0 = null;

        EObject lv_components_5_0 = null;


         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:79:28: ( (this_SimpleAnimation_0= ruleSimpleAnimation (otherlv_1= ';' () ( (lv_components_3_0= ruleSimpleAnimation ) ) (otherlv_4= ';' ( (lv_components_5_0= ruleSimpleAnimation ) ) )* )? ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:80:1: (this_SimpleAnimation_0= ruleSimpleAnimation (otherlv_1= ';' () ( (lv_components_3_0= ruleSimpleAnimation ) ) (otherlv_4= ';' ( (lv_components_5_0= ruleSimpleAnimation ) ) )* )? )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:80:1: (this_SimpleAnimation_0= ruleSimpleAnimation (otherlv_1= ';' () ( (lv_components_3_0= ruleSimpleAnimation ) ) (otherlv_4= ';' ( (lv_components_5_0= ruleSimpleAnimation ) ) )* )? )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:81:5: this_SimpleAnimation_0= ruleSimpleAnimation (otherlv_1= ';' () ( (lv_components_3_0= ruleSimpleAnimation ) ) (otherlv_4= ';' ( (lv_components_5_0= ruleSimpleAnimation ) ) )* )?
            {
             
                    newCompositeNode(grammarAccess.getAnimationAccess().getSimpleAnimationParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_ruleAnimation132);
            this_SimpleAnimation_0=ruleSimpleAnimation();

            state._fsp--;

             
                    current = this_SimpleAnimation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:89:1: (otherlv_1= ';' () ( (lv_components_3_0= ruleSimpleAnimation ) ) (otherlv_4= ';' ( (lv_components_5_0= ruleSimpleAnimation ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:89:3: otherlv_1= ';' () ( (lv_components_3_0= ruleSimpleAnimation ) ) (otherlv_4= ';' ( (lv_components_5_0= ruleSimpleAnimation ) ) )*
                    {
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAnimation144); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnimationAccess().getSemicolonKeyword_1_0());
                        
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:93:1: ()
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:94:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getAnimationAccess().getSequenceComponentsAction_1_1(),
                                current);
                        

                    }

                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:99:2: ( (lv_components_3_0= ruleSimpleAnimation ) )
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:100:1: (lv_components_3_0= ruleSimpleAnimation )
                    {
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:100:1: (lv_components_3_0= ruleSimpleAnimation )
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:101:3: lv_components_3_0= ruleSimpleAnimation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnimationAccess().getComponentsSimpleAnimationParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_ruleAnimation174);
                    lv_components_3_0=ruleSimpleAnimation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnimationRule());
                    	        }
                           		add(
                           			current, 
                           			"components",
                            		lv_components_3_0, 
                            		"SimpleAnimation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:117:2: (otherlv_4= ';' ( (lv_components_5_0= ruleSimpleAnimation ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:117:4: otherlv_4= ';' ( (lv_components_5_0= ruleSimpleAnimation ) )
                    	    {
                    	    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAnimation187); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getAnimationAccess().getSemicolonKeyword_1_3_0());
                    	        
                    	    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:121:1: ( (lv_components_5_0= ruleSimpleAnimation ) )
                    	    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:122:1: (lv_components_5_0= ruleSimpleAnimation )
                    	    {
                    	    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:122:1: (lv_components_5_0= ruleSimpleAnimation )
                    	    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:123:3: lv_components_5_0= ruleSimpleAnimation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnimationAccess().getComponentsSimpleAnimationParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_ruleAnimation208);
                    	    lv_components_5_0=ruleSimpleAnimation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnimationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"components",
                    	            		lv_components_5_0, 
                    	            		"SimpleAnimation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleSimpleAnimation"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:147:1: entryRuleSimpleAnimation returns [EObject current=null] : iv_ruleSimpleAnimation= ruleSimpleAnimation EOF ;
    public final EObject entryRuleSimpleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAnimation = null;


        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:148:2: (iv_ruleSimpleAnimation= ruleSimpleAnimation EOF )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:149:2: iv_ruleSimpleAnimation= ruleSimpleAnimation EOF
            {
             newCompositeNode(grammarAccess.getSimpleAnimationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_entryRuleSimpleAnimation248);
            iv_ruleSimpleAnimation=ruleSimpleAnimation();

            state._fsp--;

             current =iv_ruleSimpleAnimation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleAnimation258); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleAnimation"


    // $ANTLR start "ruleSimpleAnimation"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:156:1: ruleSimpleAnimation returns [EObject current=null] : (this_Move_0= ruleMove | this_Hide_1= ruleHide | this_Show_2= ruleShow | this_Wait_3= ruleWait | this_Sequence_4= ruleSequence ) ;
    public final EObject ruleSimpleAnimation() throws RecognitionException {
        EObject current = null;

        EObject this_Move_0 = null;

        EObject this_Hide_1 = null;

        EObject this_Show_2 = null;

        EObject this_Wait_3 = null;

        EObject this_Sequence_4 = null;


         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:159:28: ( (this_Move_0= ruleMove | this_Hide_1= ruleHide | this_Show_2= ruleShow | this_Wait_3= ruleWait | this_Sequence_4= ruleSequence ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:160:1: (this_Move_0= ruleMove | this_Hide_1= ruleHide | this_Show_2= ruleShow | this_Wait_3= ruleWait | this_Sequence_4= ruleSequence )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:160:1: (this_Move_0= ruleMove | this_Hide_1= ruleHide | this_Show_2= ruleShow | this_Wait_3= ruleWait | this_Sequence_4= ruleSequence )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:161:5: this_Move_0= ruleMove
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleAnimationAccess().getMoveParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_ruleSimpleAnimation305);
                    this_Move_0=ruleMove();

                    state._fsp--;

                     
                            current = this_Move_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:171:5: this_Hide_1= ruleHide
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleAnimationAccess().getHideParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHide_in_ruleSimpleAnimation332);
                    this_Hide_1=ruleHide();

                    state._fsp--;

                     
                            current = this_Hide_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:181:5: this_Show_2= ruleShow
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleAnimationAccess().getShowParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleShow_in_ruleSimpleAnimation359);
                    this_Show_2=ruleShow();

                    state._fsp--;

                     
                            current = this_Show_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:191:5: this_Wait_3= ruleWait
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleAnimationAccess().getWaitParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWait_in_ruleSimpleAnimation386);
                    this_Wait_3=ruleWait();

                    state._fsp--;

                     
                            current = this_Wait_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:201:5: this_Sequence_4= ruleSequence
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleAnimationAccess().getSequenceParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSequence_in_ruleSimpleAnimation413);
                    this_Sequence_4=ruleSequence();

                    state._fsp--;

                     
                            current = this_Sequence_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleAnimation"


    // $ANTLR start "entryRuleMove"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:217:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:218:2: (iv_ruleMove= ruleMove EOF )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:219:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMove_in_entryRuleMove448);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMove458); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:226:1: ruleMove returns [EObject current=null] : ( () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_geoTrack_5_0= ruleEString ) ) otherlv_6= ')' ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_speed_3_0 = null;

        AntlrDatatypeRuleToken lv_geoTrack_5_0 = null;


         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:229:28: ( ( () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_geoTrack_5_0= ruleEString ) ) otherlv_6= ')' ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:230:1: ( () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_geoTrack_5_0= ruleEString ) ) otherlv_6= ')' )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:230:1: ( () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_geoTrack_5_0= ruleEString ) ) otherlv_6= ')' )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:230:2: () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_geoTrack_5_0= ruleEString ) ) otherlv_6= ')'
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:230:2: ()
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:231:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMoveAccess().getMoveAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMove504); 

                	newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getMoveKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMove516); 

                	newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2());
                
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:244:1: ( (lv_speed_3_0= ruleEDouble ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:245:1: (lv_speed_3_0= ruleEDouble )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:245:1: (lv_speed_3_0= ruleEDouble )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:246:3: lv_speed_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getSpeedEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleMove537);
            lv_speed_3_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMoveRule());
            	        }
                   		set(
                   			current, 
                   			"speed",
                    		lv_speed_3_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMove549); 

                	newLeafNode(otherlv_4, grammarAccess.getMoveAccess().getCommaKeyword_4());
                
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:266:1: ( (lv_geoTrack_5_0= ruleEString ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:267:1: (lv_geoTrack_5_0= ruleEString )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:267:1: (lv_geoTrack_5_0= ruleEString )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:268:3: lv_geoTrack_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getGeoTrackEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMove570);
            lv_geoTrack_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMoveRule());
            	        }
                   		set(
                   			current, 
                   			"geoTrack",
                    		lv_geoTrack_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMove582); 

                	newLeafNode(otherlv_6, grammarAccess.getMoveAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleHide"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:296:1: entryRuleHide returns [EObject current=null] : iv_ruleHide= ruleHide EOF ;
    public final EObject entryRuleHide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHide = null;


        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:297:2: (iv_ruleHide= ruleHide EOF )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:298:2: iv_ruleHide= ruleHide EOF
            {
             newCompositeNode(grammarAccess.getHideRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHide_in_entryRuleHide618);
            iv_ruleHide=ruleHide();

            state._fsp--;

             current =iv_ruleHide; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHide628); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHide"


    // $ANTLR start "ruleHide"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:305:1: ruleHide returns [EObject current=null] : ( () otherlv_1= 'hide' otherlv_2= '(' ( (lv_simplePosition_3_0= ruleEString ) ) otherlv_4= ')' ) ;
    public final EObject ruleHide() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_simplePosition_3_0 = null;


         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:308:28: ( ( () otherlv_1= 'hide' otherlv_2= '(' ( (lv_simplePosition_3_0= ruleEString ) ) otherlv_4= ')' ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:309:1: ( () otherlv_1= 'hide' otherlv_2= '(' ( (lv_simplePosition_3_0= ruleEString ) ) otherlv_4= ')' )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:309:1: ( () otherlv_1= 'hide' otherlv_2= '(' ( (lv_simplePosition_3_0= ruleEString ) ) otherlv_4= ')' )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:309:2: () otherlv_1= 'hide' otherlv_2= '(' ( (lv_simplePosition_3_0= ruleEString ) ) otherlv_4= ')'
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:309:2: ()
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:310:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHideAccess().getHideAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleHide674); 

                	newLeafNode(otherlv_1, grammarAccess.getHideAccess().getHideKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleHide686); 

                	newLeafNode(otherlv_2, grammarAccess.getHideAccess().getLeftParenthesisKeyword_2());
                
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:323:1: ( (lv_simplePosition_3_0= ruleEString ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:324:1: (lv_simplePosition_3_0= ruleEString )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:324:1: (lv_simplePosition_3_0= ruleEString )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:325:3: lv_simplePosition_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getHideAccess().getSimplePositionEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleHide707);
            lv_simplePosition_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHideRule());
            	        }
                   		set(
                   			current, 
                   			"simplePosition",
                    		lv_simplePosition_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHide719); 

                	newLeafNode(otherlv_4, grammarAccess.getHideAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHide"


    // $ANTLR start "entryRuleShow"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:353:1: entryRuleShow returns [EObject current=null] : iv_ruleShow= ruleShow EOF ;
    public final EObject entryRuleShow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShow = null;


        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:354:2: (iv_ruleShow= ruleShow EOF )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:355:2: iv_ruleShow= ruleShow EOF
            {
             newCompositeNode(grammarAccess.getShowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleShow_in_entryRuleShow755);
            iv_ruleShow=ruleShow();

            state._fsp--;

             current =iv_ruleShow; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShow765); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShow"


    // $ANTLR start "ruleShow"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:362:1: ruleShow returns [EObject current=null] : ( () otherlv_1= 'show' otherlv_2= '(' ( (lv_simplePosition_3_0= ruleEString ) ) otherlv_4= ',' ( (lv_shape_5_0= ruleEString ) ) otherlv_6= ')' ) ;
    public final EObject ruleShow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_simplePosition_3_0 = null;

        AntlrDatatypeRuleToken lv_shape_5_0 = null;


         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:365:28: ( ( () otherlv_1= 'show' otherlv_2= '(' ( (lv_simplePosition_3_0= ruleEString ) ) otherlv_4= ',' ( (lv_shape_5_0= ruleEString ) ) otherlv_6= ')' ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:366:1: ( () otherlv_1= 'show' otherlv_2= '(' ( (lv_simplePosition_3_0= ruleEString ) ) otherlv_4= ',' ( (lv_shape_5_0= ruleEString ) ) otherlv_6= ')' )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:366:1: ( () otherlv_1= 'show' otherlv_2= '(' ( (lv_simplePosition_3_0= ruleEString ) ) otherlv_4= ',' ( (lv_shape_5_0= ruleEString ) ) otherlv_6= ')' )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:366:2: () otherlv_1= 'show' otherlv_2= '(' ( (lv_simplePosition_3_0= ruleEString ) ) otherlv_4= ',' ( (lv_shape_5_0= ruleEString ) ) otherlv_6= ')'
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:366:2: ()
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:367:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShowAccess().getShowAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleShow811); 

                	newLeafNode(otherlv_1, grammarAccess.getShowAccess().getShowKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleShow823); 

                	newLeafNode(otherlv_2, grammarAccess.getShowAccess().getLeftParenthesisKeyword_2());
                
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:380:1: ( (lv_simplePosition_3_0= ruleEString ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:381:1: (lv_simplePosition_3_0= ruleEString )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:381:1: (lv_simplePosition_3_0= ruleEString )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:382:3: lv_simplePosition_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getShowAccess().getSimplePositionEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleShow844);
            lv_simplePosition_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShowRule());
            	        }
                   		set(
                   			current, 
                   			"simplePosition",
                    		lv_simplePosition_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleShow856); 

                	newLeafNode(otherlv_4, grammarAccess.getShowAccess().getCommaKeyword_4());
                
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:402:1: ( (lv_shape_5_0= ruleEString ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:403:1: (lv_shape_5_0= ruleEString )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:403:1: (lv_shape_5_0= ruleEString )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:404:3: lv_shape_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getShowAccess().getShapeEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleShow877);
            lv_shape_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShowRule());
            	        }
                   		set(
                   			current, 
                   			"shape",
                    		lv_shape_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleShow889); 

                	newLeafNode(otherlv_6, grammarAccess.getShowAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShow"


    // $ANTLR start "entryRuleWait"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:432:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:433:2: (iv_ruleWait= ruleWait EOF )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:434:2: iv_ruleWait= ruleWait EOF
            {
             newCompositeNode(grammarAccess.getWaitRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWait_in_entryRuleWait925);
            iv_ruleWait=ruleWait();

            state._fsp--;

             current =iv_ruleWait; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWait935); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:441:1: ruleWait returns [EObject current=null] : ( () otherlv_1= 'wait' otherlv_2= '(' ( (lv_time_3_0= ruleEDouble ) ) otherlv_4= ')' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_time_3_0 = null;


         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:444:28: ( ( () otherlv_1= 'wait' otherlv_2= '(' ( (lv_time_3_0= ruleEDouble ) ) otherlv_4= ')' ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:445:1: ( () otherlv_1= 'wait' otherlv_2= '(' ( (lv_time_3_0= ruleEDouble ) ) otherlv_4= ')' )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:445:1: ( () otherlv_1= 'wait' otherlv_2= '(' ( (lv_time_3_0= ruleEDouble ) ) otherlv_4= ')' )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:445:2: () otherlv_1= 'wait' otherlv_2= '(' ( (lv_time_3_0= ruleEDouble ) ) otherlv_4= ')'
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:445:2: ()
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:446:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWaitAccess().getWaitAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWait981); 

                	newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getWaitKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleWait993); 

                	newLeafNode(otherlv_2, grammarAccess.getWaitAccess().getLeftParenthesisKeyword_2());
                
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:459:1: ( (lv_time_3_0= ruleEDouble ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:460:1: (lv_time_3_0= ruleEDouble )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:460:1: (lv_time_3_0= ruleEDouble )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:461:3: lv_time_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getWaitAccess().getTimeEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleWait1014);
            lv_time_3_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWaitRule());
            	        }
                   		set(
                   			current, 
                   			"time",
                    		lv_time_3_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWait1026); 

                	newLeafNode(otherlv_4, grammarAccess.getWaitAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleSequence"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:489:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:490:2: (iv_ruleSequence= ruleSequence EOF )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:491:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSequence_in_entryRuleSequence1062);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSequence1072); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:498:1: ruleSequence returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_components_2_0= ruleSimpleAnimation ) ) (otherlv_3= ';' ( (lv_components_4_0= ruleSimpleAnimation ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_components_2_0 = null;

        EObject lv_components_4_0 = null;


         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:501:28: ( ( () otherlv_1= '[' ( (lv_components_2_0= ruleSimpleAnimation ) ) (otherlv_3= ';' ( (lv_components_4_0= ruleSimpleAnimation ) ) )* otherlv_5= ']' ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:502:1: ( () otherlv_1= '[' ( (lv_components_2_0= ruleSimpleAnimation ) ) (otherlv_3= ';' ( (lv_components_4_0= ruleSimpleAnimation ) ) )* otherlv_5= ']' )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:502:1: ( () otherlv_1= '[' ( (lv_components_2_0= ruleSimpleAnimation ) ) (otherlv_3= ';' ( (lv_components_4_0= ruleSimpleAnimation ) ) )* otherlv_5= ']' )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:502:2: () otherlv_1= '[' ( (lv_components_2_0= ruleSimpleAnimation ) ) (otherlv_3= ';' ( (lv_components_4_0= ruleSimpleAnimation ) ) )* otherlv_5= ']'
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:502:2: ()
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:503:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSequenceAccess().getSequenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSequence1118); 

                	newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getLeftSquareBracketKeyword_1());
                
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:512:1: ( (lv_components_2_0= ruleSimpleAnimation ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:513:1: (lv_components_2_0= ruleSimpleAnimation )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:513:1: (lv_components_2_0= ruleSimpleAnimation )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:514:3: lv_components_2_0= ruleSimpleAnimation
            {
             
            	        newCompositeNode(grammarAccess.getSequenceAccess().getComponentsSimpleAnimationParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_ruleSequence1139);
            lv_components_2_0=ruleSimpleAnimation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSequenceRule());
            	        }
                   		add(
                   			current, 
                   			"components",
                    		lv_components_2_0, 
                    		"SimpleAnimation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:530:2: (otherlv_3= ';' ( (lv_components_4_0= ruleSimpleAnimation ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:530:4: otherlv_3= ';' ( (lv_components_4_0= ruleSimpleAnimation ) )
            	    {
            	    otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSequence1152); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSequenceAccess().getSemicolonKeyword_3_0());
            	        
            	    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:534:1: ( (lv_components_4_0= ruleSimpleAnimation ) )
            	    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:535:1: (lv_components_4_0= ruleSimpleAnimation )
            	    {
            	    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:535:1: (lv_components_4_0= ruleSimpleAnimation )
            	    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:536:3: lv_components_4_0= ruleSimpleAnimation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSequenceAccess().getComponentsSimpleAnimationParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_ruleSequence1173);
            	    lv_components_4_0=ruleSimpleAnimation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_4_0, 
            	            		"SimpleAnimation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSequence1187); 

                	newLeafNode(otherlv_5, grammarAccess.getSequenceAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleEString"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:564:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:565:2: (iv_ruleEString= ruleEString EOF )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:566:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1224);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1235); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:573:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:576:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:577:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:577:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:577:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1275); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:585:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1301); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:600:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:601:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:602:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble1347);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble1358); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:609:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:612:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:613:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:613:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:613:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:613:2: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:614:2: kw= '-'
                    {
                    kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEDouble1397); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:619:3: (this_INT_1= RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:619:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1415); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEDouble1435); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1450); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
                
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:639:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=23 && LA10_0<=24)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:639:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:639:2: (kw= 'E' | kw= 'e' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==23) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==24) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:640:2: kw= 'E'
                            {
                            kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEDouble1470); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:647:2: kw= 'e'
                            {
                            kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEDouble1489); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:652:2: (kw= '-' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==21) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:653:2: kw= '-'
                            {
                            kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEDouble1504); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1521); 

                    		current.merge(this_INT_7);
                        
                     
                        newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnimation_in_entryRuleAnimation75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimation85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_ruleAnimation132 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleAnimation144 = new BitSet(new long[]{0x00000000000F1000L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_ruleAnimation174 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleAnimation187 = new BitSet(new long[]{0x00000000000F1000L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_ruleAnimation208 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_entryRuleSimpleAnimation248 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAnimation258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_ruleSimpleAnimation305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHide_in_ruleSimpleAnimation332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShow_in_ruleSimpleAnimation359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWait_in_ruleSimpleAnimation386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_ruleSimpleAnimation413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove448 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleMove504 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMove516 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleMove537 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMove549 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMove570 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMove582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHide_in_entryRuleHide618 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHide628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleHide674 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleHide686 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleHide707 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleHide719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShow_in_entryRuleShow755 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShow765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleShow811 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleShow823 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleShow844 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleShow856 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleShow877 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleShow889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWait_in_entryRuleWait925 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWait935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleWait981 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleWait993 = new BitSet(new long[]{0x0000000000600040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleWait1014 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleWait1026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence1062 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSequence1072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleSequence1118 = new BitSet(new long[]{0x00000000000F1000L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_ruleSequence1139 = new BitSet(new long[]{0x0000000000100800L});
        public static final BitSet FOLLOW_11_in_ruleSequence1152 = new BitSet(new long[]{0x00000000000F1000L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_ruleSequence1173 = new BitSet(new long[]{0x0000000000100800L});
        public static final BitSet FOLLOW_20_in_ruleSequence1187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1224 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble1347 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble1358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleEDouble1397 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1415 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleEDouble1435 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1450 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_23_in_ruleEDouble1470 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_24_in_ruleEDouble1489 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_21_in_ruleEDouble1504 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1521 = new BitSet(new long[]{0x0000000000000002L});
    }


}