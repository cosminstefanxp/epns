package anl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import anl.services.AnimationsLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnimationsLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "';'", "'move'", "'('", "')'", "'hide'", "'show'", "'wait'", "'['", "']'", "'-'", "'.'"
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
    public String getGrammarFileName() { return "../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g"; }


     
     	private AnimationsLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AnimationsLanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleAnimation"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:60:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:61:1: ( ruleAnimation EOF )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:62:1: ruleAnimation EOF
            {
             before(grammarAccess.getAnimationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_entryRuleAnimation61);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getAnimationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimation68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:69:1: ruleAnimation : ( ( rule__Animation__Group__0 ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:73:2: ( ( ( rule__Animation__Group__0 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:74:1: ( ( rule__Animation__Group__0 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:74:1: ( ( rule__Animation__Group__0 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:75:1: ( rule__Animation__Group__0 )
            {
             before(grammarAccess.getAnimationAccess().getGroup()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:76:1: ( rule__Animation__Group__0 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:76:2: rule__Animation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__0_in_ruleAnimation94);
            rule__Animation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleSimpleAnimation"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:88:1: entryRuleSimpleAnimation : ruleSimpleAnimation EOF ;
    public final void entryRuleSimpleAnimation() throws RecognitionException {
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:89:1: ( ruleSimpleAnimation EOF )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:90:1: ruleSimpleAnimation EOF
            {
             before(grammarAccess.getSimpleAnimationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_entryRuleSimpleAnimation121);
            ruleSimpleAnimation();

            state._fsp--;

             after(grammarAccess.getSimpleAnimationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleAnimation128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleAnimation"


    // $ANTLR start "ruleSimpleAnimation"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:97:1: ruleSimpleAnimation : ( ( rule__SimpleAnimation__Alternatives ) ) ;
    public final void ruleSimpleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:101:2: ( ( ( rule__SimpleAnimation__Alternatives ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:102:1: ( ( rule__SimpleAnimation__Alternatives ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:102:1: ( ( rule__SimpleAnimation__Alternatives ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:103:1: ( rule__SimpleAnimation__Alternatives )
            {
             before(grammarAccess.getSimpleAnimationAccess().getAlternatives()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:104:1: ( rule__SimpleAnimation__Alternatives )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:104:2: rule__SimpleAnimation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAnimation__Alternatives_in_ruleSimpleAnimation154);
            rule__SimpleAnimation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAnimationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleAnimation"


    // $ANTLR start "entryRuleMove"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:116:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:117:1: ( ruleMove EOF )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:118:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMove_in_entryRuleMove181);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMove188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:125:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:129:2: ( ( ( rule__Move__Group__0 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:130:1: ( ( rule__Move__Group__0 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:130:1: ( ( rule__Move__Group__0 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:131:1: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:132:1: ( rule__Move__Group__0 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:132:2: rule__Move__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0_in_ruleMove214);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleHide"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:144:1: entryRuleHide : ruleHide EOF ;
    public final void entryRuleHide() throws RecognitionException {
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:145:1: ( ruleHide EOF )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:146:1: ruleHide EOF
            {
             before(grammarAccess.getHideRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHide_in_entryRuleHide241);
            ruleHide();

            state._fsp--;

             after(grammarAccess.getHideRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHide248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHide"


    // $ANTLR start "ruleHide"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:153:1: ruleHide : ( ( rule__Hide__Group__0 ) ) ;
    public final void ruleHide() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:157:2: ( ( ( rule__Hide__Group__0 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:158:1: ( ( rule__Hide__Group__0 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:158:1: ( ( rule__Hide__Group__0 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:159:1: ( rule__Hide__Group__0 )
            {
             before(grammarAccess.getHideAccess().getGroup()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:160:1: ( rule__Hide__Group__0 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:160:2: rule__Hide__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__0_in_ruleHide274);
            rule__Hide__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHideAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHide"


    // $ANTLR start "entryRuleShow"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:172:1: entryRuleShow : ruleShow EOF ;
    public final void entryRuleShow() throws RecognitionException {
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:173:1: ( ruleShow EOF )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:174:1: ruleShow EOF
            {
             before(grammarAccess.getShowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleShow_in_entryRuleShow301);
            ruleShow();

            state._fsp--;

             after(grammarAccess.getShowRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShow308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShow"


    // $ANTLR start "ruleShow"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:181:1: ruleShow : ( ( rule__Show__Group__0 ) ) ;
    public final void ruleShow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:185:2: ( ( ( rule__Show__Group__0 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:186:1: ( ( rule__Show__Group__0 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:186:1: ( ( rule__Show__Group__0 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:187:1: ( rule__Show__Group__0 )
            {
             before(grammarAccess.getShowAccess().getGroup()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:188:1: ( rule__Show__Group__0 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:188:2: rule__Show__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__0_in_ruleShow334);
            rule__Show__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShow"


    // $ANTLR start "entryRuleWait"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:200:1: entryRuleWait : ruleWait EOF ;
    public final void entryRuleWait() throws RecognitionException {
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:201:1: ( ruleWait EOF )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:202:1: ruleWait EOF
            {
             before(grammarAccess.getWaitRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWait_in_entryRuleWait361);
            ruleWait();

            state._fsp--;

             after(grammarAccess.getWaitRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWait368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:209:1: ruleWait : ( ( rule__Wait__Group__0 ) ) ;
    public final void ruleWait() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:213:2: ( ( ( rule__Wait__Group__0 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:214:1: ( ( rule__Wait__Group__0 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:214:1: ( ( rule__Wait__Group__0 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:215:1: ( rule__Wait__Group__0 )
            {
             before(grammarAccess.getWaitAccess().getGroup()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:216:1: ( rule__Wait__Group__0 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:216:2: rule__Wait__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__0_in_ruleWait394);
            rule__Wait__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleSequence"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:228:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:229:1: ( ruleSequence EOF )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:230:1: ruleSequence EOF
            {
             before(grammarAccess.getSequenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSequence_in_entryRuleSequence421);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getSequenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSequence428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:237:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:241:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:242:1: ( ( rule__Sequence__Group__0 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:242:1: ( ( rule__Sequence__Group__0 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:243:1: ( rule__Sequence__Group__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:244:1: ( rule__Sequence__Group__0 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:244:2: rule__Sequence__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__0_in_ruleSequence454);
            rule__Sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleEString"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:256:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:257:1: ( ruleEString EOF )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:258:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString481);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:265:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:269:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:270:1: ( ( rule__EString__Alternatives ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:270:1: ( ( rule__EString__Alternatives ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:271:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:272:1: ( rule__EString__Alternatives )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:272:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString514);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:284:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:285:1: ( ruleEDouble EOF )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:286:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble541);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:293:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:297:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:298:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:298:1: ( ( rule__EDouble__Group__0 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:299:1: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:300:1: ( rule__EDouble__Group__0 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:300:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble574);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:312:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:313:1: ( ruleEInt EOF )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:314:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt601);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:321:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:325:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:326:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:326:1: ( ( rule__EInt__Group__0 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:327:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:328:1: ( rule__EInt__Group__0 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:328:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt634);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__SimpleAnimation__Alternatives"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:340:1: rule__SimpleAnimation__Alternatives : ( ( ruleMove ) | ( ruleHide ) | ( ruleShow ) | ( ruleWait ) | ( ruleSequence ) );
    public final void rule__SimpleAnimation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:344:1: ( ( ruleMove ) | ( ruleHide ) | ( ruleShow ) | ( ruleWait ) | ( ruleSequence ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case 19:
                {
                alt1=4;
                }
                break;
            case 20:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:345:1: ( ruleMove )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:345:1: ( ruleMove )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:346:1: ruleMove
                    {
                     before(grammarAccess.getSimpleAnimationAccess().getMoveParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_rule__SimpleAnimation__Alternatives670);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnimationAccess().getMoveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:351:6: ( ruleHide )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:351:6: ( ruleHide )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:352:1: ruleHide
                    {
                     before(grammarAccess.getSimpleAnimationAccess().getHideParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleHide_in_rule__SimpleAnimation__Alternatives687);
                    ruleHide();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnimationAccess().getHideParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:357:6: ( ruleShow )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:357:6: ( ruleShow )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:358:1: ruleShow
                    {
                     before(grammarAccess.getSimpleAnimationAccess().getShowParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleShow_in_rule__SimpleAnimation__Alternatives704);
                    ruleShow();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnimationAccess().getShowParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:363:6: ( ruleWait )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:363:6: ( ruleWait )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:364:1: ruleWait
                    {
                     before(grammarAccess.getSimpleAnimationAccess().getWaitParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWait_in_rule__SimpleAnimation__Alternatives721);
                    ruleWait();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnimationAccess().getWaitParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:369:6: ( ruleSequence )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:369:6: ( ruleSequence )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:370:1: ruleSequence
                    {
                     before(grammarAccess.getSimpleAnimationAccess().getSequenceParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSequence_in_rule__SimpleAnimation__Alternatives738);
                    ruleSequence();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnimationAccess().getSequenceParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAnimation__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:380:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:384:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:385:1: ( RULE_STRING )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:385:1: ( RULE_STRING )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:386:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives770); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:391:6: ( RULE_ID )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:391:6: ( RULE_ID )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:392:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives787); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:402:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:406:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:407:1: ( 'E' )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:407:1: ( 'E' )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:408:1: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EDouble__Alternatives_4_0820); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:415:6: ( 'e' )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:415:6: ( 'e' )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:416:1: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EDouble__Alternatives_4_0840); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Animation__Group__0"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:430:1: rule__Animation__Group__0 : rule__Animation__Group__0__Impl rule__Animation__Group__1 ;
    public final void rule__Animation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:434:1: ( rule__Animation__Group__0__Impl rule__Animation__Group__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:435:2: rule__Animation__Group__0__Impl rule__Animation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__0__Impl_in_rule__Animation__Group__0872);
            rule__Animation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__1_in_rule__Animation__Group__0875);
            rule__Animation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__0"


    // $ANTLR start "rule__Animation__Group__0__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:442:1: rule__Animation__Group__0__Impl : ( ruleSimpleAnimation ) ;
    public final void rule__Animation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:446:1: ( ( ruleSimpleAnimation ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:447:1: ( ruleSimpleAnimation )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:447:1: ( ruleSimpleAnimation )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:448:1: ruleSimpleAnimation
            {
             before(grammarAccess.getAnimationAccess().getSimpleAnimationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_rule__Animation__Group__0__Impl902);
            ruleSimpleAnimation();

            state._fsp--;

             after(grammarAccess.getAnimationAccess().getSimpleAnimationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__0__Impl"


    // $ANTLR start "rule__Animation__Group__1"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:459:1: rule__Animation__Group__1 : rule__Animation__Group__1__Impl ;
    public final void rule__Animation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:463:1: ( rule__Animation__Group__1__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:464:2: rule__Animation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__1__Impl_in_rule__Animation__Group__1931);
            rule__Animation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__1"


    // $ANTLR start "rule__Animation__Group__1__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:470:1: rule__Animation__Group__1__Impl : ( ( rule__Animation__Group_1__0 )? ) ;
    public final void rule__Animation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:474:1: ( ( ( rule__Animation__Group_1__0 )? ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:475:1: ( ( rule__Animation__Group_1__0 )? )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:475:1: ( ( rule__Animation__Group_1__0 )? )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:476:1: ( rule__Animation__Group_1__0 )?
            {
             before(grammarAccess.getAnimationAccess().getGroup_1()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:477:1: ( rule__Animation__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:477:2: rule__Animation__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1__0_in_rule__Animation__Group__1__Impl958);
                    rule__Animation__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnimationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__1__Impl"


    // $ANTLR start "rule__Animation__Group_1__0"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:491:1: rule__Animation__Group_1__0 : rule__Animation__Group_1__0__Impl rule__Animation__Group_1__1 ;
    public final void rule__Animation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:495:1: ( rule__Animation__Group_1__0__Impl rule__Animation__Group_1__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:496:2: rule__Animation__Group_1__0__Impl rule__Animation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1__0__Impl_in_rule__Animation__Group_1__0993);
            rule__Animation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1__1_in_rule__Animation__Group_1__0996);
            rule__Animation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1__0"


    // $ANTLR start "rule__Animation__Group_1__0__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:503:1: rule__Animation__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Animation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:507:1: ( ( ';' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:508:1: ( ';' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:508:1: ( ';' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:509:1: ';'
            {
             before(grammarAccess.getAnimationAccess().getSemicolonKeyword_1_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Animation__Group_1__0__Impl1024); 
             after(grammarAccess.getAnimationAccess().getSemicolonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1__0__Impl"


    // $ANTLR start "rule__Animation__Group_1__1"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:522:1: rule__Animation__Group_1__1 : rule__Animation__Group_1__1__Impl rule__Animation__Group_1__2 ;
    public final void rule__Animation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:526:1: ( rule__Animation__Group_1__1__Impl rule__Animation__Group_1__2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:527:2: rule__Animation__Group_1__1__Impl rule__Animation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1__1__Impl_in_rule__Animation__Group_1__11055);
            rule__Animation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1__2_in_rule__Animation__Group_1__11058);
            rule__Animation__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1__1"


    // $ANTLR start "rule__Animation__Group_1__1__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:534:1: rule__Animation__Group_1__1__Impl : ( () ) ;
    public final void rule__Animation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:538:1: ( ( () ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:539:1: ( () )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:539:1: ( () )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:540:1: ()
            {
             before(grammarAccess.getAnimationAccess().getSequenceComponentsAction_1_1()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:541:1: ()
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:543:1: 
            {
            }

             after(grammarAccess.getAnimationAccess().getSequenceComponentsAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1__1__Impl"


    // $ANTLR start "rule__Animation__Group_1__2"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:553:1: rule__Animation__Group_1__2 : rule__Animation__Group_1__2__Impl rule__Animation__Group_1__3 ;
    public final void rule__Animation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:557:1: ( rule__Animation__Group_1__2__Impl rule__Animation__Group_1__3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:558:2: rule__Animation__Group_1__2__Impl rule__Animation__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1__2__Impl_in_rule__Animation__Group_1__21116);
            rule__Animation__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1__3_in_rule__Animation__Group_1__21119);
            rule__Animation__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1__2"


    // $ANTLR start "rule__Animation__Group_1__2__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:565:1: rule__Animation__Group_1__2__Impl : ( ( rule__Animation__ComponentsAssignment_1_2 ) ) ;
    public final void rule__Animation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:569:1: ( ( ( rule__Animation__ComponentsAssignment_1_2 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:570:1: ( ( rule__Animation__ComponentsAssignment_1_2 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:570:1: ( ( rule__Animation__ComponentsAssignment_1_2 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:571:1: ( rule__Animation__ComponentsAssignment_1_2 )
            {
             before(grammarAccess.getAnimationAccess().getComponentsAssignment_1_2()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:572:1: ( rule__Animation__ComponentsAssignment_1_2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:572:2: rule__Animation__ComponentsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__ComponentsAssignment_1_2_in_rule__Animation__Group_1__2__Impl1146);
            rule__Animation__ComponentsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getComponentsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1__2__Impl"


    // $ANTLR start "rule__Animation__Group_1__3"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:582:1: rule__Animation__Group_1__3 : rule__Animation__Group_1__3__Impl ;
    public final void rule__Animation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:586:1: ( rule__Animation__Group_1__3__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:587:2: rule__Animation__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1__3__Impl_in_rule__Animation__Group_1__31176);
            rule__Animation__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1__3"


    // $ANTLR start "rule__Animation__Group_1__3__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:593:1: rule__Animation__Group_1__3__Impl : ( ( rule__Animation__Group_1_3__0 )* ) ;
    public final void rule__Animation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:597:1: ( ( ( rule__Animation__Group_1_3__0 )* ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:598:1: ( ( rule__Animation__Group_1_3__0 )* )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:598:1: ( ( rule__Animation__Group_1_3__0 )* )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:599:1: ( rule__Animation__Group_1_3__0 )*
            {
             before(grammarAccess.getAnimationAccess().getGroup_1_3()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:600:1: ( rule__Animation__Group_1_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:600:2: rule__Animation__Group_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1_3__0_in_rule__Animation__Group_1__3__Impl1203);
            	    rule__Animation__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAnimationAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1__3__Impl"


    // $ANTLR start "rule__Animation__Group_1_3__0"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:618:1: rule__Animation__Group_1_3__0 : rule__Animation__Group_1_3__0__Impl rule__Animation__Group_1_3__1 ;
    public final void rule__Animation__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:622:1: ( rule__Animation__Group_1_3__0__Impl rule__Animation__Group_1_3__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:623:2: rule__Animation__Group_1_3__0__Impl rule__Animation__Group_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1_3__0__Impl_in_rule__Animation__Group_1_3__01242);
            rule__Animation__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1_3__1_in_rule__Animation__Group_1_3__01245);
            rule__Animation__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1_3__0"


    // $ANTLR start "rule__Animation__Group_1_3__0__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:630:1: rule__Animation__Group_1_3__0__Impl : ( ';' ) ;
    public final void rule__Animation__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:634:1: ( ( ';' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:635:1: ( ';' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:635:1: ( ';' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:636:1: ';'
            {
             before(grammarAccess.getAnimationAccess().getSemicolonKeyword_1_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Animation__Group_1_3__0__Impl1273); 
             after(grammarAccess.getAnimationAccess().getSemicolonKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1_3__0__Impl"


    // $ANTLR start "rule__Animation__Group_1_3__1"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:649:1: rule__Animation__Group_1_3__1 : rule__Animation__Group_1_3__1__Impl ;
    public final void rule__Animation__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:653:1: ( rule__Animation__Group_1_3__1__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:654:2: rule__Animation__Group_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1_3__1__Impl_in_rule__Animation__Group_1_3__11304);
            rule__Animation__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1_3__1"


    // $ANTLR start "rule__Animation__Group_1_3__1__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:660:1: rule__Animation__Group_1_3__1__Impl : ( ( rule__Animation__ComponentsAssignment_1_3_1 ) ) ;
    public final void rule__Animation__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:664:1: ( ( ( rule__Animation__ComponentsAssignment_1_3_1 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:665:1: ( ( rule__Animation__ComponentsAssignment_1_3_1 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:665:1: ( ( rule__Animation__ComponentsAssignment_1_3_1 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:666:1: ( rule__Animation__ComponentsAssignment_1_3_1 )
            {
             before(grammarAccess.getAnimationAccess().getComponentsAssignment_1_3_1()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:667:1: ( rule__Animation__ComponentsAssignment_1_3_1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:667:2: rule__Animation__ComponentsAssignment_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__ComponentsAssignment_1_3_1_in_rule__Animation__Group_1_3__1__Impl1331);
            rule__Animation__ComponentsAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getComponentsAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1_3__1__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:681:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:685:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:686:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__01365);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1_in_rule__Move__Group__01368);
            rule__Move__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:693:1: rule__Move__Group__0__Impl : ( () ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:697:1: ( ( () ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:698:1: ( () )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:698:1: ( () )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:699:1: ()
            {
             before(grammarAccess.getMoveAccess().getMoveAction_0()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:700:1: ()
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:702:1: 
            {
            }

             after(grammarAccess.getMoveAccess().getMoveAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:712:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:716:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:717:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__11426);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2_in_rule__Move__Group__11429);
            rule__Move__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:724:1: rule__Move__Group__1__Impl : ( 'move' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:728:1: ( ( 'move' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:729:1: ( 'move' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:729:1: ( 'move' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:730:1: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Move__Group__1__Impl1457); 
             after(grammarAccess.getMoveAccess().getMoveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__2"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:743:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:747:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:748:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__21488);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3_in_rule__Move__Group__21491);
            rule__Move__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2"


    // $ANTLR start "rule__Move__Group__2__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:755:1: rule__Move__Group__2__Impl : ( '(' ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:759:1: ( ( '(' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:760:1: ( '(' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:760:1: ( '(' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:761:1: '('
            {
             before(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Move__Group__2__Impl1519); 
             after(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__3"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:774:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:778:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:779:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__31550);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4_in_rule__Move__Group__31553);
            rule__Move__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3"


    // $ANTLR start "rule__Move__Group__3__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:786:1: rule__Move__Group__3__Impl : ( ( rule__Move__SpeedAssignment_3 ) ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:790:1: ( ( ( rule__Move__SpeedAssignment_3 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:791:1: ( ( rule__Move__SpeedAssignment_3 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:791:1: ( ( rule__Move__SpeedAssignment_3 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:792:1: ( rule__Move__SpeedAssignment_3 )
            {
             before(grammarAccess.getMoveAccess().getSpeedAssignment_3()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:793:1: ( rule__Move__SpeedAssignment_3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:793:2: rule__Move__SpeedAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__SpeedAssignment_3_in_rule__Move__Group__3__Impl1580);
            rule__Move__SpeedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getSpeedAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3__Impl"


    // $ANTLR start "rule__Move__Group__4"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:803:1: rule__Move__Group__4 : rule__Move__Group__4__Impl ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:807:1: ( rule__Move__Group__4__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:808:2: rule__Move__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__41610);
            rule__Move__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4"


    // $ANTLR start "rule__Move__Group__4__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:814:1: rule__Move__Group__4__Impl : ( ')' ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:818:1: ( ( ')' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:819:1: ( ')' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:819:1: ( ')' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:820:1: ')'
            {
             before(grammarAccess.getMoveAccess().getRightParenthesisKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Move__Group__4__Impl1638); 
             after(grammarAccess.getMoveAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4__Impl"


    // $ANTLR start "rule__Hide__Group__0"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:843:1: rule__Hide__Group__0 : rule__Hide__Group__0__Impl rule__Hide__Group__1 ;
    public final void rule__Hide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:847:1: ( rule__Hide__Group__0__Impl rule__Hide__Group__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:848:2: rule__Hide__Group__0__Impl rule__Hide__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__0__Impl_in_rule__Hide__Group__01679);
            rule__Hide__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__1_in_rule__Hide__Group__01682);
            rule__Hide__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hide__Group__0"


    // $ANTLR start "rule__Hide__Group__0__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:855:1: rule__Hide__Group__0__Impl : ( () ) ;
    public final void rule__Hide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:859:1: ( ( () ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:860:1: ( () )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:860:1: ( () )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:861:1: ()
            {
             before(grammarAccess.getHideAccess().getHideAction_0()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:862:1: ()
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:864:1: 
            {
            }

             after(grammarAccess.getHideAccess().getHideAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hide__Group__0__Impl"


    // $ANTLR start "rule__Hide__Group__1"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:874:1: rule__Hide__Group__1 : rule__Hide__Group__1__Impl rule__Hide__Group__2 ;
    public final void rule__Hide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:878:1: ( rule__Hide__Group__1__Impl rule__Hide__Group__2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:879:2: rule__Hide__Group__1__Impl rule__Hide__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__1__Impl_in_rule__Hide__Group__11740);
            rule__Hide__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__2_in_rule__Hide__Group__11743);
            rule__Hide__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hide__Group__1"


    // $ANTLR start "rule__Hide__Group__1__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:886:1: rule__Hide__Group__1__Impl : ( 'hide' ) ;
    public final void rule__Hide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:890:1: ( ( 'hide' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:891:1: ( 'hide' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:891:1: ( 'hide' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:892:1: 'hide'
            {
             before(grammarAccess.getHideAccess().getHideKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Hide__Group__1__Impl1771); 
             after(grammarAccess.getHideAccess().getHideKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hide__Group__1__Impl"


    // $ANTLR start "rule__Hide__Group__2"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:905:1: rule__Hide__Group__2 : rule__Hide__Group__2__Impl rule__Hide__Group__3 ;
    public final void rule__Hide__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:909:1: ( rule__Hide__Group__2__Impl rule__Hide__Group__3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:910:2: rule__Hide__Group__2__Impl rule__Hide__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__2__Impl_in_rule__Hide__Group__21802);
            rule__Hide__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__3_in_rule__Hide__Group__21805);
            rule__Hide__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hide__Group__2"


    // $ANTLR start "rule__Hide__Group__2__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:917:1: rule__Hide__Group__2__Impl : ( '(' ) ;
    public final void rule__Hide__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:921:1: ( ( '(' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:922:1: ( '(' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:922:1: ( '(' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:923:1: '('
            {
             before(grammarAccess.getHideAccess().getLeftParenthesisKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Hide__Group__2__Impl1833); 
             after(grammarAccess.getHideAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hide__Group__2__Impl"


    // $ANTLR start "rule__Hide__Group__3"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:936:1: rule__Hide__Group__3 : rule__Hide__Group__3__Impl ;
    public final void rule__Hide__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:940:1: ( rule__Hide__Group__3__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:941:2: rule__Hide__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__3__Impl_in_rule__Hide__Group__31864);
            rule__Hide__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hide__Group__3"


    // $ANTLR start "rule__Hide__Group__3__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:947:1: rule__Hide__Group__3__Impl : ( ')' ) ;
    public final void rule__Hide__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:951:1: ( ( ')' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:952:1: ( ')' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:952:1: ( ')' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:953:1: ')'
            {
             before(grammarAccess.getHideAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Hide__Group__3__Impl1892); 
             after(grammarAccess.getHideAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hide__Group__3__Impl"


    // $ANTLR start "rule__Show__Group__0"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:974:1: rule__Show__Group__0 : rule__Show__Group__0__Impl rule__Show__Group__1 ;
    public final void rule__Show__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:978:1: ( rule__Show__Group__0__Impl rule__Show__Group__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:979:2: rule__Show__Group__0__Impl rule__Show__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__0__Impl_in_rule__Show__Group__01931);
            rule__Show__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__1_in_rule__Show__Group__01934);
            rule__Show__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__0"


    // $ANTLR start "rule__Show__Group__0__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:986:1: rule__Show__Group__0__Impl : ( () ) ;
    public final void rule__Show__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:990:1: ( ( () ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:991:1: ( () )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:991:1: ( () )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:992:1: ()
            {
             before(grammarAccess.getShowAccess().getShowAction_0()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:993:1: ()
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:995:1: 
            {
            }

             after(grammarAccess.getShowAccess().getShowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__0__Impl"


    // $ANTLR start "rule__Show__Group__1"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1005:1: rule__Show__Group__1 : rule__Show__Group__1__Impl rule__Show__Group__2 ;
    public final void rule__Show__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1009:1: ( rule__Show__Group__1__Impl rule__Show__Group__2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1010:2: rule__Show__Group__1__Impl rule__Show__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__1__Impl_in_rule__Show__Group__11992);
            rule__Show__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__2_in_rule__Show__Group__11995);
            rule__Show__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__1"


    // $ANTLR start "rule__Show__Group__1__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1017:1: rule__Show__Group__1__Impl : ( 'show' ) ;
    public final void rule__Show__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1021:1: ( ( 'show' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1022:1: ( 'show' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1022:1: ( 'show' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1023:1: 'show'
            {
             before(grammarAccess.getShowAccess().getShowKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Show__Group__1__Impl2023); 
             after(grammarAccess.getShowAccess().getShowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__1__Impl"


    // $ANTLR start "rule__Show__Group__2"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1036:1: rule__Show__Group__2 : rule__Show__Group__2__Impl rule__Show__Group__3 ;
    public final void rule__Show__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1040:1: ( rule__Show__Group__2__Impl rule__Show__Group__3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1041:2: rule__Show__Group__2__Impl rule__Show__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__2__Impl_in_rule__Show__Group__22054);
            rule__Show__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__3_in_rule__Show__Group__22057);
            rule__Show__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__2"


    // $ANTLR start "rule__Show__Group__2__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1048:1: rule__Show__Group__2__Impl : ( '(' ) ;
    public final void rule__Show__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1052:1: ( ( '(' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1053:1: ( '(' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1053:1: ( '(' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1054:1: '('
            {
             before(grammarAccess.getShowAccess().getLeftParenthesisKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Show__Group__2__Impl2085); 
             after(grammarAccess.getShowAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__2__Impl"


    // $ANTLR start "rule__Show__Group__3"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1067:1: rule__Show__Group__3 : rule__Show__Group__3__Impl rule__Show__Group__4 ;
    public final void rule__Show__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1071:1: ( rule__Show__Group__3__Impl rule__Show__Group__4 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1072:2: rule__Show__Group__3__Impl rule__Show__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__3__Impl_in_rule__Show__Group__32116);
            rule__Show__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__4_in_rule__Show__Group__32119);
            rule__Show__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__3"


    // $ANTLR start "rule__Show__Group__3__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1079:1: rule__Show__Group__3__Impl : ( ( rule__Show__ShapeAssignment_3 ) ) ;
    public final void rule__Show__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1083:1: ( ( ( rule__Show__ShapeAssignment_3 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1084:1: ( ( rule__Show__ShapeAssignment_3 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1084:1: ( ( rule__Show__ShapeAssignment_3 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1085:1: ( rule__Show__ShapeAssignment_3 )
            {
             before(grammarAccess.getShowAccess().getShapeAssignment_3()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1086:1: ( rule__Show__ShapeAssignment_3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1086:2: rule__Show__ShapeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__ShapeAssignment_3_in_rule__Show__Group__3__Impl2146);
            rule__Show__ShapeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getShapeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__3__Impl"


    // $ANTLR start "rule__Show__Group__4"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1096:1: rule__Show__Group__4 : rule__Show__Group__4__Impl ;
    public final void rule__Show__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1100:1: ( rule__Show__Group__4__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1101:2: rule__Show__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__4__Impl_in_rule__Show__Group__42176);
            rule__Show__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__4"


    // $ANTLR start "rule__Show__Group__4__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1107:1: rule__Show__Group__4__Impl : ( ')' ) ;
    public final void rule__Show__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1111:1: ( ( ')' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1112:1: ( ')' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1112:1: ( ')' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1113:1: ')'
            {
             before(grammarAccess.getShowAccess().getRightParenthesisKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Show__Group__4__Impl2204); 
             after(grammarAccess.getShowAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__4__Impl"


    // $ANTLR start "rule__Wait__Group__0"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1136:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1140:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1141:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__0__Impl_in_rule__Wait__Group__02245);
            rule__Wait__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__1_in_rule__Wait__Group__02248);
            rule__Wait__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__0"


    // $ANTLR start "rule__Wait__Group__0__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1148:1: rule__Wait__Group__0__Impl : ( () ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1152:1: ( ( () ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1153:1: ( () )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1153:1: ( () )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1154:1: ()
            {
             before(grammarAccess.getWaitAccess().getWaitAction_0()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1155:1: ()
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1157:1: 
            {
            }

             after(grammarAccess.getWaitAccess().getWaitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__0__Impl"


    // $ANTLR start "rule__Wait__Group__1"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1167:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl rule__Wait__Group__2 ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1171:1: ( rule__Wait__Group__1__Impl rule__Wait__Group__2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1172:2: rule__Wait__Group__1__Impl rule__Wait__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__1__Impl_in_rule__Wait__Group__12306);
            rule__Wait__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__2_in_rule__Wait__Group__12309);
            rule__Wait__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__1"


    // $ANTLR start "rule__Wait__Group__1__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1179:1: rule__Wait__Group__1__Impl : ( 'wait' ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1183:1: ( ( 'wait' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1184:1: ( 'wait' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1184:1: ( 'wait' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1185:1: 'wait'
            {
             before(grammarAccess.getWaitAccess().getWaitKeyword_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Wait__Group__1__Impl2337); 
             after(grammarAccess.getWaitAccess().getWaitKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__1__Impl"


    // $ANTLR start "rule__Wait__Group__2"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1198:1: rule__Wait__Group__2 : rule__Wait__Group__2__Impl rule__Wait__Group__3 ;
    public final void rule__Wait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1202:1: ( rule__Wait__Group__2__Impl rule__Wait__Group__3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1203:2: rule__Wait__Group__2__Impl rule__Wait__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__2__Impl_in_rule__Wait__Group__22368);
            rule__Wait__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__3_in_rule__Wait__Group__22371);
            rule__Wait__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__2"


    // $ANTLR start "rule__Wait__Group__2__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1210:1: rule__Wait__Group__2__Impl : ( '(' ) ;
    public final void rule__Wait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1214:1: ( ( '(' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1215:1: ( '(' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1215:1: ( '(' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1216:1: '('
            {
             before(grammarAccess.getWaitAccess().getLeftParenthesisKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Wait__Group__2__Impl2399); 
             after(grammarAccess.getWaitAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__2__Impl"


    // $ANTLR start "rule__Wait__Group__3"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1229:1: rule__Wait__Group__3 : rule__Wait__Group__3__Impl rule__Wait__Group__4 ;
    public final void rule__Wait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1233:1: ( rule__Wait__Group__3__Impl rule__Wait__Group__4 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1234:2: rule__Wait__Group__3__Impl rule__Wait__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__3__Impl_in_rule__Wait__Group__32430);
            rule__Wait__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__4_in_rule__Wait__Group__32433);
            rule__Wait__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__3"


    // $ANTLR start "rule__Wait__Group__3__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1241:1: rule__Wait__Group__3__Impl : ( ( rule__Wait__TimeAssignment_3 ) ) ;
    public final void rule__Wait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1245:1: ( ( ( rule__Wait__TimeAssignment_3 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1246:1: ( ( rule__Wait__TimeAssignment_3 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1246:1: ( ( rule__Wait__TimeAssignment_3 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1247:1: ( rule__Wait__TimeAssignment_3 )
            {
             before(grammarAccess.getWaitAccess().getTimeAssignment_3()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1248:1: ( rule__Wait__TimeAssignment_3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1248:2: rule__Wait__TimeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wait__TimeAssignment_3_in_rule__Wait__Group__3__Impl2460);
            rule__Wait__TimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWaitAccess().getTimeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__3__Impl"


    // $ANTLR start "rule__Wait__Group__4"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1258:1: rule__Wait__Group__4 : rule__Wait__Group__4__Impl ;
    public final void rule__Wait__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1262:1: ( rule__Wait__Group__4__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1263:2: rule__Wait__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__4__Impl_in_rule__Wait__Group__42490);
            rule__Wait__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__4"


    // $ANTLR start "rule__Wait__Group__4__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1269:1: rule__Wait__Group__4__Impl : ( ')' ) ;
    public final void rule__Wait__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1273:1: ( ( ')' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1274:1: ( ')' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1274:1: ( ')' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1275:1: ')'
            {
             before(grammarAccess.getWaitAccess().getRightParenthesisKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Wait__Group__4__Impl2518); 
             after(grammarAccess.getWaitAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__4__Impl"


    // $ANTLR start "rule__Sequence__Group__0"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1298:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1302:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1303:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__02559);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__02562);
            rule__Sequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0"


    // $ANTLR start "rule__Sequence__Group__0__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1310:1: rule__Sequence__Group__0__Impl : ( () ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1314:1: ( ( () ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1315:1: ( () )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1315:1: ( () )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1316:1: ()
            {
             before(grammarAccess.getSequenceAccess().getSequenceAction_0()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1317:1: ()
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1319:1: 
            {
            }

             after(grammarAccess.getSequenceAccess().getSequenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0__Impl"


    // $ANTLR start "rule__Sequence__Group__1"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1329:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1333:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1334:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__12620);
            rule__Sequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__12623);
            rule__Sequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1"


    // $ANTLR start "rule__Sequence__Group__1__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1341:1: rule__Sequence__Group__1__Impl : ( '[' ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1345:1: ( ( '[' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1346:1: ( '[' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1346:1: ( '[' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1347:1: '['
            {
             before(grammarAccess.getSequenceAccess().getLeftSquareBracketKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Sequence__Group__1__Impl2651); 
             after(grammarAccess.getSequenceAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1__Impl"


    // $ANTLR start "rule__Sequence__Group__2"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1360:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1364:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1365:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__22682);
            rule__Sequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__22685);
            rule__Sequence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__2"


    // $ANTLR start "rule__Sequence__Group__2__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1372:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__ComponentsAssignment_2 ) ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1376:1: ( ( ( rule__Sequence__ComponentsAssignment_2 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1377:1: ( ( rule__Sequence__ComponentsAssignment_2 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1377:1: ( ( rule__Sequence__ComponentsAssignment_2 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1378:1: ( rule__Sequence__ComponentsAssignment_2 )
            {
             before(grammarAccess.getSequenceAccess().getComponentsAssignment_2()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1379:1: ( rule__Sequence__ComponentsAssignment_2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1379:2: rule__Sequence__ComponentsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__ComponentsAssignment_2_in_rule__Sequence__Group__2__Impl2712);
            rule__Sequence__ComponentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getComponentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__2__Impl"


    // $ANTLR start "rule__Sequence__Group__3"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1389:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1393:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1394:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32742);
            rule__Sequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32745);
            rule__Sequence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__3"


    // $ANTLR start "rule__Sequence__Group__3__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1401:1: rule__Sequence__Group__3__Impl : ( ( rule__Sequence__Group_3__0 )* ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1405:1: ( ( ( rule__Sequence__Group_3__0 )* ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1406:1: ( ( rule__Sequence__Group_3__0 )* )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1406:1: ( ( rule__Sequence__Group_3__0 )* )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1407:1: ( rule__Sequence__Group_3__0 )*
            {
             before(grammarAccess.getSequenceAccess().getGroup_3()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1408:1: ( rule__Sequence__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1408:2: rule__Sequence__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__0_in_rule__Sequence__Group__3__Impl2772);
            	    rule__Sequence__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSequenceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__3__Impl"


    // $ANTLR start "rule__Sequence__Group__4"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1418:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1422:1: ( rule__Sequence__Group__4__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1423:2: rule__Sequence__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42803);
            rule__Sequence__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__4"


    // $ANTLR start "rule__Sequence__Group__4__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1429:1: rule__Sequence__Group__4__Impl : ( ']' ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1433:1: ( ( ']' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1434:1: ( ']' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1434:1: ( ']' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1435:1: ']'
            {
             before(grammarAccess.getSequenceAccess().getRightSquareBracketKeyword_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Sequence__Group__4__Impl2831); 
             after(grammarAccess.getSequenceAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__4__Impl"


    // $ANTLR start "rule__Sequence__Group_3__0"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1458:1: rule__Sequence__Group_3__0 : rule__Sequence__Group_3__0__Impl rule__Sequence__Group_3__1 ;
    public final void rule__Sequence__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1462:1: ( rule__Sequence__Group_3__0__Impl rule__Sequence__Group_3__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1463:2: rule__Sequence__Group_3__0__Impl rule__Sequence__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__0__Impl_in_rule__Sequence__Group_3__02872);
            rule__Sequence__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__1_in_rule__Sequence__Group_3__02875);
            rule__Sequence__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3__0"


    // $ANTLR start "rule__Sequence__Group_3__0__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1470:1: rule__Sequence__Group_3__0__Impl : ( ';' ) ;
    public final void rule__Sequence__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1474:1: ( ( ';' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1475:1: ( ';' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1475:1: ( ';' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1476:1: ';'
            {
             before(grammarAccess.getSequenceAccess().getSemicolonKeyword_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Sequence__Group_3__0__Impl2903); 
             after(grammarAccess.getSequenceAccess().getSemicolonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3__0__Impl"


    // $ANTLR start "rule__Sequence__Group_3__1"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1489:1: rule__Sequence__Group_3__1 : rule__Sequence__Group_3__1__Impl ;
    public final void rule__Sequence__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1493:1: ( rule__Sequence__Group_3__1__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1494:2: rule__Sequence__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__1__Impl_in_rule__Sequence__Group_3__12934);
            rule__Sequence__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3__1"


    // $ANTLR start "rule__Sequence__Group_3__1__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1500:1: rule__Sequence__Group_3__1__Impl : ( ( rule__Sequence__ComponentsAssignment_3_1 ) ) ;
    public final void rule__Sequence__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1504:1: ( ( ( rule__Sequence__ComponentsAssignment_3_1 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1505:1: ( ( rule__Sequence__ComponentsAssignment_3_1 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1505:1: ( ( rule__Sequence__ComponentsAssignment_3_1 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1506:1: ( rule__Sequence__ComponentsAssignment_3_1 )
            {
             before(grammarAccess.getSequenceAccess().getComponentsAssignment_3_1()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1507:1: ( rule__Sequence__ComponentsAssignment_3_1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1507:2: rule__Sequence__ComponentsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__ComponentsAssignment_3_1_in_rule__Sequence__Group_3__1__Impl2961);
            rule__Sequence__ComponentsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getComponentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1521:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1525:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1526:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__02995);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__02998);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1533:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1537:1: ( ( ( '-' )? ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1538:1: ( ( '-' )? )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1538:1: ( ( '-' )? )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1539:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1540:1: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1541:2: '-'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__EDouble__Group__0__Impl3027); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1552:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1556:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1557:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__13060);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__13063);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1564:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1568:1: ( ( ( RULE_INT )? ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1569:1: ( ( RULE_INT )? )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1569:1: ( ( RULE_INT )? )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1570:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1571:1: ( RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1571:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl3091); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1581:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1585:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1586:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__23122);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__23125);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1593:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1597:1: ( ( '.' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1598:1: ( '.' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1598:1: ( '.' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1599:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__EDouble__Group__2__Impl3153); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1612:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1616:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1617:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__33184);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__33187);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1624:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1628:1: ( ( RULE_INT ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1629:1: ( RULE_INT )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1629:1: ( RULE_INT )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1630:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl3214); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1641:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1645:1: ( rule__EDouble__Group__4__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1646:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__43243);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1652:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1656:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1657:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1657:1: ( ( rule__EDouble__Group_4__0 )? )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1658:1: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1659:1: ( rule__EDouble__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=11 && LA9_0<=12)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1659:2: rule__EDouble__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl3270);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1679:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1683:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1684:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__03311);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__03314);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1691:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1695:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1696:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1696:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1697:1: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1698:1: ( rule__EDouble__Alternatives_4_0 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1698:2: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl3341);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1708:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1712:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1713:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__13371);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__13374);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1720:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1724:1: ( ( ( '-' )? ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1725:1: ( ( '-' )? )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1725:1: ( ( '-' )? )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1726:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1727:1: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1728:2: '-'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__EDouble__Group_4__1__Impl3403); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1739:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1743:1: ( rule__EDouble__Group_4__2__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1744:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__23436);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1750:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1754:1: ( ( RULE_INT ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1755:1: ( RULE_INT )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1755:1: ( RULE_INT )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1756:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl3463); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1773:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1777:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1778:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03498);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03501);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1785:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1789:1: ( ( ( '-' )? ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1790:1: ( ( '-' )? )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1790:1: ( ( '-' )? )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1791:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1792:1: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1793:2: '-'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__EInt__Group__0__Impl3530); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1804:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1808:1: ( rule__EInt__Group__1__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1809:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13563);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1815:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1819:1: ( ( RULE_INT ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1820:1: ( RULE_INT )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1820:1: ( RULE_INT )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1821:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3590); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Animation__ComponentsAssignment_1_2"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1837:1: rule__Animation__ComponentsAssignment_1_2 : ( ruleSimpleAnimation ) ;
    public final void rule__Animation__ComponentsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1841:1: ( ( ruleSimpleAnimation ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1842:1: ( ruleSimpleAnimation )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1842:1: ( ruleSimpleAnimation )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1843:1: ruleSimpleAnimation
            {
             before(grammarAccess.getAnimationAccess().getComponentsSimpleAnimationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_rule__Animation__ComponentsAssignment_1_23628);
            ruleSimpleAnimation();

            state._fsp--;

             after(grammarAccess.getAnimationAccess().getComponentsSimpleAnimationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__ComponentsAssignment_1_2"


    // $ANTLR start "rule__Animation__ComponentsAssignment_1_3_1"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1852:1: rule__Animation__ComponentsAssignment_1_3_1 : ( ruleSimpleAnimation ) ;
    public final void rule__Animation__ComponentsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1856:1: ( ( ruleSimpleAnimation ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1857:1: ( ruleSimpleAnimation )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1857:1: ( ruleSimpleAnimation )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1858:1: ruleSimpleAnimation
            {
             before(grammarAccess.getAnimationAccess().getComponentsSimpleAnimationParserRuleCall_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_rule__Animation__ComponentsAssignment_1_3_13659);
            ruleSimpleAnimation();

            state._fsp--;

             after(grammarAccess.getAnimationAccess().getComponentsSimpleAnimationParserRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__ComponentsAssignment_1_3_1"


    // $ANTLR start "rule__Move__SpeedAssignment_3"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1867:1: rule__Move__SpeedAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Move__SpeedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1871:1: ( ( ruleEDouble ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1872:1: ( ruleEDouble )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1872:1: ( ruleEDouble )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1873:1: ruleEDouble
            {
             before(grammarAccess.getMoveAccess().getSpeedEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Move__SpeedAssignment_33690);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getSpeedEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__SpeedAssignment_3"


    // $ANTLR start "rule__Show__ShapeAssignment_3"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1882:1: rule__Show__ShapeAssignment_3 : ( ruleEString ) ;
    public final void rule__Show__ShapeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1886:1: ( ( ruleEString ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1887:1: ( ruleEString )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1887:1: ( ruleEString )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1888:1: ruleEString
            {
             before(grammarAccess.getShowAccess().getShapeEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Show__ShapeAssignment_33721);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShowAccess().getShapeEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__ShapeAssignment_3"


    // $ANTLR start "rule__Wait__TimeAssignment_3"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1897:1: rule__Wait__TimeAssignment_3 : ( ruleEInt ) ;
    public final void rule__Wait__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1901:1: ( ( ruleEInt ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1902:1: ( ruleEInt )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1902:1: ( ruleEInt )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1903:1: ruleEInt
            {
             before(grammarAccess.getWaitAccess().getTimeEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Wait__TimeAssignment_33752);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getWaitAccess().getTimeEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__TimeAssignment_3"


    // $ANTLR start "rule__Sequence__ComponentsAssignment_2"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1912:1: rule__Sequence__ComponentsAssignment_2 : ( ruleSimpleAnimation ) ;
    public final void rule__Sequence__ComponentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1916:1: ( ( ruleSimpleAnimation ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1917:1: ( ruleSimpleAnimation )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1917:1: ( ruleSimpleAnimation )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1918:1: ruleSimpleAnimation
            {
             before(grammarAccess.getSequenceAccess().getComponentsSimpleAnimationParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_rule__Sequence__ComponentsAssignment_23783);
            ruleSimpleAnimation();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getComponentsSimpleAnimationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__ComponentsAssignment_2"


    // $ANTLR start "rule__Sequence__ComponentsAssignment_3_1"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1927:1: rule__Sequence__ComponentsAssignment_3_1 : ( ruleSimpleAnimation ) ;
    public final void rule__Sequence__ComponentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1931:1: ( ( ruleSimpleAnimation ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1932:1: ( ruleSimpleAnimation )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1932:1: ( ruleSimpleAnimation )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1933:1: ruleSimpleAnimation
            {
             before(grammarAccess.getSequenceAccess().getComponentsSimpleAnimationParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_rule__Sequence__ComponentsAssignment_3_13814);
            ruleSimpleAnimation();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getComponentsSimpleAnimationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__ComponentsAssignment_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnimation_in_entryRuleAnimation61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimation68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group__0_in_ruleAnimation94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_entryRuleSimpleAnimation121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAnimation128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAnimation__Alternatives_in_ruleSimpleAnimation154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0_in_ruleMove214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHide_in_entryRuleHide241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHide248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__0_in_ruleHide274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShow_in_entryRuleShow301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShow308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__0_in_ruleShow334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWait_in_entryRuleWait361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWait368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wait__Group__0_in_ruleWait394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSequence428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__0_in_ruleSequence454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_rule__SimpleAnimation__Alternatives670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHide_in_rule__SimpleAnimation__Alternatives687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShow_in_rule__SimpleAnimation__Alternatives704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWait_in_rule__SimpleAnimation__Alternatives721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_rule__SimpleAnimation__Alternatives738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EDouble__Alternatives_4_0820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDouble__Alternatives_4_0840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group__0__Impl_in_rule__Animation__Group__0872 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Animation__Group__1_in_rule__Animation__Group__0875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_rule__Animation__Group__0__Impl902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group__1__Impl_in_rule__Animation__Group__1931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_1__0_in_rule__Animation__Group__1__Impl958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_1__0__Impl_in_rule__Animation__Group_1__0993 = new BitSet(new long[]{0x00000000001E4000L});
        public static final BitSet FOLLOW_rule__Animation__Group_1__1_in_rule__Animation__Group_1__0996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Animation__Group_1__0__Impl1024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_1__1__Impl_in_rule__Animation__Group_1__11055 = new BitSet(new long[]{0x00000000001E4000L});
        public static final BitSet FOLLOW_rule__Animation__Group_1__2_in_rule__Animation__Group_1__11058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_1__2__Impl_in_rule__Animation__Group_1__21116 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Animation__Group_1__3_in_rule__Animation__Group_1__21119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__ComponentsAssignment_1_2_in_rule__Animation__Group_1__2__Impl1146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_1__3__Impl_in_rule__Animation__Group_1__31176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_1_3__0_in_rule__Animation__Group_1__3__Impl1203 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Animation__Group_1_3__0__Impl_in_rule__Animation__Group_1_3__01242 = new BitSet(new long[]{0x00000000001E4000L});
        public static final BitSet FOLLOW_rule__Animation__Group_1_3__1_in_rule__Animation__Group_1_3__01245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Animation__Group_1_3__0__Impl1273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_1_3__1__Impl_in_rule__Animation__Group_1_3__11304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__ComponentsAssignment_1_3_1_in_rule__Animation__Group_1_3__1__Impl1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__01365 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Move__Group__1_in_rule__Move__Group__01368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__11426 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Move__Group__2_in_rule__Move__Group__11429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Move__Group__1__Impl1457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__21488 = new BitSet(new long[]{0x0000000000C00040L});
        public static final BitSet FOLLOW_rule__Move__Group__3_in_rule__Move__Group__21491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Move__Group__2__Impl1519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__31550 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Move__Group__4_in_rule__Move__Group__31553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__SpeedAssignment_3_in_rule__Move__Group__3__Impl1580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__41610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Move__Group__4__Impl1638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__0__Impl_in_rule__Hide__Group__01679 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Hide__Group__1_in_rule__Hide__Group__01682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__1__Impl_in_rule__Hide__Group__11740 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Hide__Group__2_in_rule__Hide__Group__11743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Hide__Group__1__Impl1771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__2__Impl_in_rule__Hide__Group__21802 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Hide__Group__3_in_rule__Hide__Group__21805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Hide__Group__2__Impl1833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__3__Impl_in_rule__Hide__Group__31864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Hide__Group__3__Impl1892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__0__Impl_in_rule__Show__Group__01931 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Show__Group__1_in_rule__Show__Group__01934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__1__Impl_in_rule__Show__Group__11992 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Show__Group__2_in_rule__Show__Group__11995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Show__Group__1__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__2__Impl_in_rule__Show__Group__22054 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Show__Group__3_in_rule__Show__Group__22057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Show__Group__2__Impl2085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__3__Impl_in_rule__Show__Group__32116 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Show__Group__4_in_rule__Show__Group__32119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__ShapeAssignment_3_in_rule__Show__Group__3__Impl2146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__4__Impl_in_rule__Show__Group__42176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Show__Group__4__Impl2204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wait__Group__0__Impl_in_rule__Wait__Group__02245 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Wait__Group__1_in_rule__Wait__Group__02248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wait__Group__1__Impl_in_rule__Wait__Group__12306 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Wait__Group__2_in_rule__Wait__Group__12309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Wait__Group__1__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wait__Group__2__Impl_in_rule__Wait__Group__22368 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_rule__Wait__Group__3_in_rule__Wait__Group__22371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Wait__Group__2__Impl2399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wait__Group__3__Impl_in_rule__Wait__Group__32430 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Wait__Group__4_in_rule__Wait__Group__32433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wait__TimeAssignment_3_in_rule__Wait__Group__3__Impl2460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wait__Group__4__Impl_in_rule__Wait__Group__42490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Wait__Group__4__Impl2518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__02559 = new BitSet(new long[]{0x00000000001E4000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__02562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__12620 = new BitSet(new long[]{0x00000000001E4000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__12623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Sequence__Group__1__Impl2651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__22682 = new BitSet(new long[]{0x0000000000202000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__22685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__ComponentsAssignment_2_in_rule__Sequence__Group__2__Impl2712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32742 = new BitSet(new long[]{0x0000000000202000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__0_in_rule__Sequence__Group__3__Impl2772 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Sequence__Group__4__Impl2831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__0__Impl_in_rule__Sequence__Group_3__02872 = new BitSet(new long[]{0x00000000001E4000L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__1_in_rule__Sequence__Group_3__02875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Sequence__Group_3__0__Impl2903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__1__Impl_in_rule__Sequence__Group_3__12934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__ComponentsAssignment_3_1_in_rule__Sequence__Group_3__1__Impl2961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__02995 = new BitSet(new long[]{0x0000000000C00040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__02998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__EDouble__Group__0__Impl3027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__13060 = new BitSet(new long[]{0x0000000000C00040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__13063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl3091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__23122 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__23125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__EDouble__Group__2__Impl3153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__33184 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__33187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__43243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl3270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__03311 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__03314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl3341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__13371 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__13374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__EDouble__Group_4__1__Impl3403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__23436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl3463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03498 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__EInt__Group__0__Impl3530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_rule__Animation__ComponentsAssignment_1_23628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_rule__Animation__ComponentsAssignment_1_3_13659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Move__SpeedAssignment_33690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Show__ShapeAssignment_33721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Wait__TimeAssignment_33752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_rule__Sequence__ComponentsAssignment_23783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_rule__Sequence__ComponentsAssignment_3_13814 = new BitSet(new long[]{0x0000000000000002L});
    }


}