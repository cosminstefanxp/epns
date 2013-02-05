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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'move'", "'('", "')'", "'hide'", "'show'", "'wait'", "'['", "']'", "'-'", "'.'", "'E'", "'e'"
    };
    public static final int RULE_ID=5;
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
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
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
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:226:1: ruleMove returns [EObject current=null] : ( () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEDouble ) ) otherlv_4= ')' ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_speed_3_0 = null;


         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:229:28: ( ( () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEDouble ) ) otherlv_4= ')' ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:230:1: ( () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEDouble ) ) otherlv_4= ')' )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:230:1: ( () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEDouble ) ) otherlv_4= ')' )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:230:2: () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEDouble ) ) otherlv_4= ')'
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

                	newLeafNode(otherlv_4, grammarAccess.getMoveAccess().getRightParenthesisKeyword_4());
                

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
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:274:1: entryRuleHide returns [EObject current=null] : iv_ruleHide= ruleHide EOF ;
    public final EObject entryRuleHide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHide = null;


        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:275:2: (iv_ruleHide= ruleHide EOF )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:276:2: iv_ruleHide= ruleHide EOF
            {
             newCompositeNode(grammarAccess.getHideRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHide_in_entryRuleHide585);
            iv_ruleHide=ruleHide();

            state._fsp--;

             current =iv_ruleHide; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHide595); 

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
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:283:1: ruleHide returns [EObject current=null] : ( () otherlv_1= 'hide' otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleHide() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:286:28: ( ( () otherlv_1= 'hide' otherlv_2= '(' otherlv_3= ')' ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:287:1: ( () otherlv_1= 'hide' otherlv_2= '(' otherlv_3= ')' )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:287:1: ( () otherlv_1= 'hide' otherlv_2= '(' otherlv_3= ')' )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:287:2: () otherlv_1= 'hide' otherlv_2= '(' otherlv_3= ')'
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:287:2: ()
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:288:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHideAccess().getHideAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHide641); 

                	newLeafNode(otherlv_1, grammarAccess.getHideAccess().getHideKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleHide653); 

                	newLeafNode(otherlv_2, grammarAccess.getHideAccess().getLeftParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleHide665); 

                	newLeafNode(otherlv_3, grammarAccess.getHideAccess().getRightParenthesisKeyword_3());
                

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
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:313:1: entryRuleShow returns [EObject current=null] : iv_ruleShow= ruleShow EOF ;
    public final EObject entryRuleShow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShow = null;


        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:314:2: (iv_ruleShow= ruleShow EOF )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:315:2: iv_ruleShow= ruleShow EOF
            {
             newCompositeNode(grammarAccess.getShowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleShow_in_entryRuleShow701);
            iv_ruleShow=ruleShow();

            state._fsp--;

             current =iv_ruleShow; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShow711); 

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
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:322:1: ruleShow returns [EObject current=null] : ( () otherlv_1= 'show' otherlv_2= '(' ( (lv_shape_3_0= ruleEString ) ) otherlv_4= ')' ) ;
    public final EObject ruleShow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_shape_3_0 = null;


         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:325:28: ( ( () otherlv_1= 'show' otherlv_2= '(' ( (lv_shape_3_0= ruleEString ) ) otherlv_4= ')' ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:326:1: ( () otherlv_1= 'show' otherlv_2= '(' ( (lv_shape_3_0= ruleEString ) ) otherlv_4= ')' )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:326:1: ( () otherlv_1= 'show' otherlv_2= '(' ( (lv_shape_3_0= ruleEString ) ) otherlv_4= ')' )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:326:2: () otherlv_1= 'show' otherlv_2= '(' ( (lv_shape_3_0= ruleEString ) ) otherlv_4= ')'
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:326:2: ()
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:327:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShowAccess().getShowAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleShow757); 

                	newLeafNode(otherlv_1, grammarAccess.getShowAccess().getShowKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleShow769); 

                	newLeafNode(otherlv_2, grammarAccess.getShowAccess().getLeftParenthesisKeyword_2());
                
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:340:1: ( (lv_shape_3_0= ruleEString ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:341:1: (lv_shape_3_0= ruleEString )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:341:1: (lv_shape_3_0= ruleEString )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:342:3: lv_shape_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getShowAccess().getShapeEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleShow790);
            lv_shape_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShowRule());
            	        }
                   		set(
                   			current, 
                   			"shape",
                    		lv_shape_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleShow802); 

                	newLeafNode(otherlv_4, grammarAccess.getShowAccess().getRightParenthesisKeyword_4());
                

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
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:370:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:371:2: (iv_ruleWait= ruleWait EOF )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:372:2: iv_ruleWait= ruleWait EOF
            {
             newCompositeNode(grammarAccess.getWaitRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWait_in_entryRuleWait838);
            iv_ruleWait=ruleWait();

            state._fsp--;

             current =iv_ruleWait; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWait848); 

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
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:379:1: ruleWait returns [EObject current=null] : ( () otherlv_1= 'wait' otherlv_2= '(' ( (lv_time_3_0= ruleEInt ) ) otherlv_4= ')' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_time_3_0 = null;


         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:382:28: ( ( () otherlv_1= 'wait' otherlv_2= '(' ( (lv_time_3_0= ruleEInt ) ) otherlv_4= ')' ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:383:1: ( () otherlv_1= 'wait' otherlv_2= '(' ( (lv_time_3_0= ruleEInt ) ) otherlv_4= ')' )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:383:1: ( () otherlv_1= 'wait' otherlv_2= '(' ( (lv_time_3_0= ruleEInt ) ) otherlv_4= ')' )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:383:2: () otherlv_1= 'wait' otherlv_2= '(' ( (lv_time_3_0= ruleEInt ) ) otherlv_4= ')'
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:383:2: ()
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:384:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWaitAccess().getWaitAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWait894); 

                	newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getWaitKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleWait906); 

                	newLeafNode(otherlv_2, grammarAccess.getWaitAccess().getLeftParenthesisKeyword_2());
                
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:397:1: ( (lv_time_3_0= ruleEInt ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:398:1: (lv_time_3_0= ruleEInt )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:398:1: (lv_time_3_0= ruleEInt )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:399:3: lv_time_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getWaitAccess().getTimeEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleWait927);
            lv_time_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWaitRule());
            	        }
                   		set(
                   			current, 
                   			"time",
                    		lv_time_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleWait939); 

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
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:427:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:428:2: (iv_ruleSequence= ruleSequence EOF )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:429:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSequence_in_entryRuleSequence975);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSequence985); 

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
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:436:1: ruleSequence returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_components_2_0= ruleSimpleAnimation ) ) (otherlv_3= ';' ( (lv_components_4_0= ruleSimpleAnimation ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_components_2_0 = null;

        EObject lv_components_4_0 = null;


         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:439:28: ( ( () otherlv_1= '[' ( (lv_components_2_0= ruleSimpleAnimation ) ) (otherlv_3= ';' ( (lv_components_4_0= ruleSimpleAnimation ) ) )* otherlv_5= ']' ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:440:1: ( () otherlv_1= '[' ( (lv_components_2_0= ruleSimpleAnimation ) ) (otherlv_3= ';' ( (lv_components_4_0= ruleSimpleAnimation ) ) )* otherlv_5= ']' )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:440:1: ( () otherlv_1= '[' ( (lv_components_2_0= ruleSimpleAnimation ) ) (otherlv_3= ';' ( (lv_components_4_0= ruleSimpleAnimation ) ) )* otherlv_5= ']' )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:440:2: () otherlv_1= '[' ( (lv_components_2_0= ruleSimpleAnimation ) ) (otherlv_3= ';' ( (lv_components_4_0= ruleSimpleAnimation ) ) )* otherlv_5= ']'
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:440:2: ()
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:441:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSequenceAccess().getSequenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSequence1031); 

                	newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getLeftSquareBracketKeyword_1());
                
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:450:1: ( (lv_components_2_0= ruleSimpleAnimation ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:451:1: (lv_components_2_0= ruleSimpleAnimation )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:451:1: (lv_components_2_0= ruleSimpleAnimation )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:452:3: lv_components_2_0= ruleSimpleAnimation
            {
             
            	        newCompositeNode(grammarAccess.getSequenceAccess().getComponentsSimpleAnimationParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_ruleSequence1052);
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

            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:468:2: (otherlv_3= ';' ( (lv_components_4_0= ruleSimpleAnimation ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:468:4: otherlv_3= ';' ( (lv_components_4_0= ruleSimpleAnimation ) )
            	    {
            	    otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSequence1065); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSequenceAccess().getSemicolonKeyword_3_0());
            	        
            	    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:472:1: ( (lv_components_4_0= ruleSimpleAnimation ) )
            	    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:473:1: (lv_components_4_0= ruleSimpleAnimation )
            	    {
            	    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:473:1: (lv_components_4_0= ruleSimpleAnimation )
            	    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:474:3: lv_components_4_0= ruleSimpleAnimation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSequenceAccess().getComponentsSimpleAnimationParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_ruleSequence1086);
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

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSequence1100); 

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
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:502:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:503:2: (iv_ruleEString= ruleEString EOF )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:504:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1137);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1148); 

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
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:511:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:514:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:515:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:515:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:515:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1188); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:523:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1214); 

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
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:538:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:539:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:540:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble1260);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble1271); 

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
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:547:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:550:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:551:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:551:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:551:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:551:2: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:552:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEDouble1310); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:557:3: (this_INT_1= RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:557:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1328); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEDouble1348); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1363); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
                
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:577:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=22 && LA10_0<=23)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:577:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:577:2: (kw= 'E' | kw= 'e' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==22) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==23) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:578:2: kw= 'E'
                            {
                            kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEDouble1383); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:585:2: kw= 'e'
                            {
                            kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEDouble1402); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:590:2: (kw= '-' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==20) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:591:2: kw= '-'
                            {
                            kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEDouble1417); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1434); 

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


    // $ANTLR start "entryRuleEInt"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:611:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:612:2: (iv_ruleEInt= ruleEInt EOF )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:613:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1482);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1493); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:620:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:623:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:624:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:624:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:624:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:624:2: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../se2.e.animations.language/src-gen/anl/parser/antlr/internal/InternalAnimationsLanguage.g:625:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEInt1532); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1549); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnimation_in_entryRuleAnimation75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimation85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_ruleAnimation132 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleAnimation144 = new BitSet(new long[]{0x0000000000079000L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_ruleAnimation174 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleAnimation187 = new BitSet(new long[]{0x0000000000079000L});
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
        public static final BitSet FOLLOW_13_in_ruleMove516 = new BitSet(new long[]{0x0000000000300040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleMove537 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMove549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHide_in_entryRuleHide585 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHide595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleHide641 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleHide653 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleHide665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShow_in_entryRuleShow701 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShow711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleShow757 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleShow769 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleShow790 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleShow802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWait_in_entryRuleWait838 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWait848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleWait894 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleWait906 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleWait927 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleWait939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence975 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSequence985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleSequence1031 = new BitSet(new long[]{0x0000000000079000L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_ruleSequence1052 = new BitSet(new long[]{0x0000000000080800L});
        public static final BitSet FOLLOW_11_in_ruleSequence1065 = new BitSet(new long[]{0x0000000000079000L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_ruleSequence1086 = new BitSet(new long[]{0x0000000000080800L});
        public static final BitSet FOLLOW_19_in_ruleSequence1100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1137 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble1260 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble1271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleEDouble1310 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1328 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEDouble1348 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1363 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_22_in_ruleEDouble1383 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_23_in_ruleEDouble1402 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_20_in_ruleEDouble1417 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1482 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleEInt1532 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1549 = new BitSet(new long[]{0x0000000000000002L});
    }


}