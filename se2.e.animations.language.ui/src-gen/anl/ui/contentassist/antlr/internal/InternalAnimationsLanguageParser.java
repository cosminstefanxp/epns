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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "';'", "'move'", "'('", "','", "')'", "'hide'", "'show'", "'wait'", "'['", "']'", "'-'", "'.'"
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


    // $ANTLR start "rule__SimpleAnimation__Alternatives"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:312:1: rule__SimpleAnimation__Alternatives : ( ( ruleMove ) | ( ruleHide ) | ( ruleShow ) | ( ruleWait ) | ( ruleSequence ) );
    public final void rule__SimpleAnimation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:316:1: ( ( ruleMove ) | ( ruleHide ) | ( ruleShow ) | ( ruleWait ) | ( ruleSequence ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 20:
                {
                alt1=4;
                }
                break;
            case 21:
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
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:317:1: ( ruleMove )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:317:1: ( ruleMove )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:318:1: ruleMove
                    {
                     before(grammarAccess.getSimpleAnimationAccess().getMoveParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_rule__SimpleAnimation__Alternatives610);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnimationAccess().getMoveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:323:6: ( ruleHide )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:323:6: ( ruleHide )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:324:1: ruleHide
                    {
                     before(grammarAccess.getSimpleAnimationAccess().getHideParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleHide_in_rule__SimpleAnimation__Alternatives627);
                    ruleHide();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnimationAccess().getHideParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:329:6: ( ruleShow )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:329:6: ( ruleShow )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:330:1: ruleShow
                    {
                     before(grammarAccess.getSimpleAnimationAccess().getShowParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleShow_in_rule__SimpleAnimation__Alternatives644);
                    ruleShow();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnimationAccess().getShowParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:335:6: ( ruleWait )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:335:6: ( ruleWait )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:336:1: ruleWait
                    {
                     before(grammarAccess.getSimpleAnimationAccess().getWaitParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWait_in_rule__SimpleAnimation__Alternatives661);
                    ruleWait();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnimationAccess().getWaitParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:341:6: ( ruleSequence )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:341:6: ( ruleSequence )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:342:1: ruleSequence
                    {
                     before(grammarAccess.getSimpleAnimationAccess().getSequenceParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSequence_in_rule__SimpleAnimation__Alternatives678);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:352:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:356:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:357:1: ( RULE_STRING )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:357:1: ( RULE_STRING )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:358:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives710); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:363:6: ( RULE_ID )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:363:6: ( RULE_ID )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:364:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives727); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:374:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:378:1: ( ( 'E' ) | ( 'e' ) )
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
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:379:1: ( 'E' )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:379:1: ( 'E' )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:380:1: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EDouble__Alternatives_4_0760); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:387:6: ( 'e' )
                    {
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:387:6: ( 'e' )
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:388:1: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EDouble__Alternatives_4_0780); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:402:1: rule__Animation__Group__0 : rule__Animation__Group__0__Impl rule__Animation__Group__1 ;
    public final void rule__Animation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:406:1: ( rule__Animation__Group__0__Impl rule__Animation__Group__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:407:2: rule__Animation__Group__0__Impl rule__Animation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__0__Impl_in_rule__Animation__Group__0812);
            rule__Animation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__1_in_rule__Animation__Group__0815);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:414:1: rule__Animation__Group__0__Impl : ( ruleSimpleAnimation ) ;
    public final void rule__Animation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:418:1: ( ( ruleSimpleAnimation ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:419:1: ( ruleSimpleAnimation )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:419:1: ( ruleSimpleAnimation )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:420:1: ruleSimpleAnimation
            {
             before(grammarAccess.getAnimationAccess().getSimpleAnimationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_rule__Animation__Group__0__Impl842);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:431:1: rule__Animation__Group__1 : rule__Animation__Group__1__Impl ;
    public final void rule__Animation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:435:1: ( rule__Animation__Group__1__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:436:2: rule__Animation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__1__Impl_in_rule__Animation__Group__1871);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:442:1: rule__Animation__Group__1__Impl : ( ( rule__Animation__Group_1__0 )? ) ;
    public final void rule__Animation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:446:1: ( ( ( rule__Animation__Group_1__0 )? ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:447:1: ( ( rule__Animation__Group_1__0 )? )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:447:1: ( ( rule__Animation__Group_1__0 )? )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:448:1: ( rule__Animation__Group_1__0 )?
            {
             before(grammarAccess.getAnimationAccess().getGroup_1()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:449:1: ( rule__Animation__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:449:2: rule__Animation__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1__0_in_rule__Animation__Group__1__Impl898);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:463:1: rule__Animation__Group_1__0 : rule__Animation__Group_1__0__Impl rule__Animation__Group_1__1 ;
    public final void rule__Animation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:467:1: ( rule__Animation__Group_1__0__Impl rule__Animation__Group_1__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:468:2: rule__Animation__Group_1__0__Impl rule__Animation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1__0__Impl_in_rule__Animation__Group_1__0933);
            rule__Animation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1__1_in_rule__Animation__Group_1__0936);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:475:1: rule__Animation__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Animation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:479:1: ( ( ';' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:480:1: ( ';' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:480:1: ( ';' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:481:1: ';'
            {
             before(grammarAccess.getAnimationAccess().getSemicolonKeyword_1_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Animation__Group_1__0__Impl964); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:494:1: rule__Animation__Group_1__1 : rule__Animation__Group_1__1__Impl rule__Animation__Group_1__2 ;
    public final void rule__Animation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:498:1: ( rule__Animation__Group_1__1__Impl rule__Animation__Group_1__2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:499:2: rule__Animation__Group_1__1__Impl rule__Animation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1__1__Impl_in_rule__Animation__Group_1__1995);
            rule__Animation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1__2_in_rule__Animation__Group_1__1998);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:506:1: rule__Animation__Group_1__1__Impl : ( () ) ;
    public final void rule__Animation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:510:1: ( ( () ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:511:1: ( () )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:511:1: ( () )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:512:1: ()
            {
             before(grammarAccess.getAnimationAccess().getSequenceComponentsAction_1_1()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:513:1: ()
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:515:1: 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:525:1: rule__Animation__Group_1__2 : rule__Animation__Group_1__2__Impl rule__Animation__Group_1__3 ;
    public final void rule__Animation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:529:1: ( rule__Animation__Group_1__2__Impl rule__Animation__Group_1__3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:530:2: rule__Animation__Group_1__2__Impl rule__Animation__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1__2__Impl_in_rule__Animation__Group_1__21056);
            rule__Animation__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1__3_in_rule__Animation__Group_1__21059);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:537:1: rule__Animation__Group_1__2__Impl : ( ( rule__Animation__ComponentsAssignment_1_2 ) ) ;
    public final void rule__Animation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:541:1: ( ( ( rule__Animation__ComponentsAssignment_1_2 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:542:1: ( ( rule__Animation__ComponentsAssignment_1_2 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:542:1: ( ( rule__Animation__ComponentsAssignment_1_2 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:543:1: ( rule__Animation__ComponentsAssignment_1_2 )
            {
             before(grammarAccess.getAnimationAccess().getComponentsAssignment_1_2()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:544:1: ( rule__Animation__ComponentsAssignment_1_2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:544:2: rule__Animation__ComponentsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__ComponentsAssignment_1_2_in_rule__Animation__Group_1__2__Impl1086);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:554:1: rule__Animation__Group_1__3 : rule__Animation__Group_1__3__Impl ;
    public final void rule__Animation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:558:1: ( rule__Animation__Group_1__3__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:559:2: rule__Animation__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1__3__Impl_in_rule__Animation__Group_1__31116);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:565:1: rule__Animation__Group_1__3__Impl : ( ( rule__Animation__Group_1_3__0 )* ) ;
    public final void rule__Animation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:569:1: ( ( ( rule__Animation__Group_1_3__0 )* ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:570:1: ( ( rule__Animation__Group_1_3__0 )* )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:570:1: ( ( rule__Animation__Group_1_3__0 )* )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:571:1: ( rule__Animation__Group_1_3__0 )*
            {
             before(grammarAccess.getAnimationAccess().getGroup_1_3()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:572:1: ( rule__Animation__Group_1_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:572:2: rule__Animation__Group_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1_3__0_in_rule__Animation__Group_1__3__Impl1143);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:590:1: rule__Animation__Group_1_3__0 : rule__Animation__Group_1_3__0__Impl rule__Animation__Group_1_3__1 ;
    public final void rule__Animation__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:594:1: ( rule__Animation__Group_1_3__0__Impl rule__Animation__Group_1_3__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:595:2: rule__Animation__Group_1_3__0__Impl rule__Animation__Group_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1_3__0__Impl_in_rule__Animation__Group_1_3__01182);
            rule__Animation__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1_3__1_in_rule__Animation__Group_1_3__01185);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:602:1: rule__Animation__Group_1_3__0__Impl : ( ';' ) ;
    public final void rule__Animation__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:606:1: ( ( ';' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:607:1: ( ';' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:607:1: ( ';' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:608:1: ';'
            {
             before(grammarAccess.getAnimationAccess().getSemicolonKeyword_1_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Animation__Group_1_3__0__Impl1213); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:621:1: rule__Animation__Group_1_3__1 : rule__Animation__Group_1_3__1__Impl ;
    public final void rule__Animation__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:625:1: ( rule__Animation__Group_1_3__1__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:626:2: rule__Animation__Group_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_1_3__1__Impl_in_rule__Animation__Group_1_3__11244);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:632:1: rule__Animation__Group_1_3__1__Impl : ( ( rule__Animation__ComponentsAssignment_1_3_1 ) ) ;
    public final void rule__Animation__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:636:1: ( ( ( rule__Animation__ComponentsAssignment_1_3_1 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:637:1: ( ( rule__Animation__ComponentsAssignment_1_3_1 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:637:1: ( ( rule__Animation__ComponentsAssignment_1_3_1 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:638:1: ( rule__Animation__ComponentsAssignment_1_3_1 )
            {
             before(grammarAccess.getAnimationAccess().getComponentsAssignment_1_3_1()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:639:1: ( rule__Animation__ComponentsAssignment_1_3_1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:639:2: rule__Animation__ComponentsAssignment_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__ComponentsAssignment_1_3_1_in_rule__Animation__Group_1_3__1__Impl1271);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:653:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:657:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:658:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__01305);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1_in_rule__Move__Group__01308);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:665:1: rule__Move__Group__0__Impl : ( () ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:669:1: ( ( () ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:670:1: ( () )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:670:1: ( () )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:671:1: ()
            {
             before(grammarAccess.getMoveAccess().getMoveAction_0()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:672:1: ()
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:674:1: 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:684:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:688:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:689:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__11366);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2_in_rule__Move__Group__11369);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:696:1: rule__Move__Group__1__Impl : ( 'move' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:700:1: ( ( 'move' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:701:1: ( 'move' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:701:1: ( 'move' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:702:1: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Move__Group__1__Impl1397); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:715:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:719:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:720:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__21428);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3_in_rule__Move__Group__21431);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:727:1: rule__Move__Group__2__Impl : ( '(' ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:731:1: ( ( '(' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:732:1: ( '(' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:732:1: ( '(' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:733:1: '('
            {
             before(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Move__Group__2__Impl1459); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:746:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:750:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:751:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__31490);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4_in_rule__Move__Group__31493);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:758:1: rule__Move__Group__3__Impl : ( ( rule__Move__SpeedAssignment_3 ) ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:762:1: ( ( ( rule__Move__SpeedAssignment_3 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:763:1: ( ( rule__Move__SpeedAssignment_3 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:763:1: ( ( rule__Move__SpeedAssignment_3 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:764:1: ( rule__Move__SpeedAssignment_3 )
            {
             before(grammarAccess.getMoveAccess().getSpeedAssignment_3()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:765:1: ( rule__Move__SpeedAssignment_3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:765:2: rule__Move__SpeedAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__SpeedAssignment_3_in_rule__Move__Group__3__Impl1520);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:775:1: rule__Move__Group__4 : rule__Move__Group__4__Impl rule__Move__Group__5 ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:779:1: ( rule__Move__Group__4__Impl rule__Move__Group__5 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:780:2: rule__Move__Group__4__Impl rule__Move__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__41550);
            rule__Move__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__5_in_rule__Move__Group__41553);
            rule__Move__Group__5();

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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:787:1: rule__Move__Group__4__Impl : ( ',' ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:791:1: ( ( ',' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:792:1: ( ',' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:792:1: ( ',' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:793:1: ','
            {
             before(grammarAccess.getMoveAccess().getCommaKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Move__Group__4__Impl1581); 
             after(grammarAccess.getMoveAccess().getCommaKeyword_4()); 

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


    // $ANTLR start "rule__Move__Group__5"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:806:1: rule__Move__Group__5 : rule__Move__Group__5__Impl rule__Move__Group__6 ;
    public final void rule__Move__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:810:1: ( rule__Move__Group__5__Impl rule__Move__Group__6 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:811:2: rule__Move__Group__5__Impl rule__Move__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__5__Impl_in_rule__Move__Group__51612);
            rule__Move__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__6_in_rule__Move__Group__51615);
            rule__Move__Group__6();

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
    // $ANTLR end "rule__Move__Group__5"


    // $ANTLR start "rule__Move__Group__5__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:818:1: rule__Move__Group__5__Impl : ( ( rule__Move__GeoTrackAssignment_5 ) ) ;
    public final void rule__Move__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:822:1: ( ( ( rule__Move__GeoTrackAssignment_5 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:823:1: ( ( rule__Move__GeoTrackAssignment_5 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:823:1: ( ( rule__Move__GeoTrackAssignment_5 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:824:1: ( rule__Move__GeoTrackAssignment_5 )
            {
             before(grammarAccess.getMoveAccess().getGeoTrackAssignment_5()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:825:1: ( rule__Move__GeoTrackAssignment_5 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:825:2: rule__Move__GeoTrackAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__GeoTrackAssignment_5_in_rule__Move__Group__5__Impl1642);
            rule__Move__GeoTrackAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGeoTrackAssignment_5()); 

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
    // $ANTLR end "rule__Move__Group__5__Impl"


    // $ANTLR start "rule__Move__Group__6"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:835:1: rule__Move__Group__6 : rule__Move__Group__6__Impl ;
    public final void rule__Move__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:839:1: ( rule__Move__Group__6__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:840:2: rule__Move__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__6__Impl_in_rule__Move__Group__61672);
            rule__Move__Group__6__Impl();

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
    // $ANTLR end "rule__Move__Group__6"


    // $ANTLR start "rule__Move__Group__6__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:846:1: rule__Move__Group__6__Impl : ( ')' ) ;
    public final void rule__Move__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:850:1: ( ( ')' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:851:1: ( ')' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:851:1: ( ')' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:852:1: ')'
            {
             before(grammarAccess.getMoveAccess().getRightParenthesisKeyword_6()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Move__Group__6__Impl1700); 
             after(grammarAccess.getMoveAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Move__Group__6__Impl"


    // $ANTLR start "rule__Hide__Group__0"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:879:1: rule__Hide__Group__0 : rule__Hide__Group__0__Impl rule__Hide__Group__1 ;
    public final void rule__Hide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:883:1: ( rule__Hide__Group__0__Impl rule__Hide__Group__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:884:2: rule__Hide__Group__0__Impl rule__Hide__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__0__Impl_in_rule__Hide__Group__01745);
            rule__Hide__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__1_in_rule__Hide__Group__01748);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:891:1: rule__Hide__Group__0__Impl : ( () ) ;
    public final void rule__Hide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:895:1: ( ( () ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:896:1: ( () )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:896:1: ( () )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:897:1: ()
            {
             before(grammarAccess.getHideAccess().getHideAction_0()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:898:1: ()
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:900:1: 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:910:1: rule__Hide__Group__1 : rule__Hide__Group__1__Impl rule__Hide__Group__2 ;
    public final void rule__Hide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:914:1: ( rule__Hide__Group__1__Impl rule__Hide__Group__2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:915:2: rule__Hide__Group__1__Impl rule__Hide__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__1__Impl_in_rule__Hide__Group__11806);
            rule__Hide__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__2_in_rule__Hide__Group__11809);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:922:1: rule__Hide__Group__1__Impl : ( 'hide' ) ;
    public final void rule__Hide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:926:1: ( ( 'hide' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:927:1: ( 'hide' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:927:1: ( 'hide' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:928:1: 'hide'
            {
             before(grammarAccess.getHideAccess().getHideKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Hide__Group__1__Impl1837); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:941:1: rule__Hide__Group__2 : rule__Hide__Group__2__Impl rule__Hide__Group__3 ;
    public final void rule__Hide__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:945:1: ( rule__Hide__Group__2__Impl rule__Hide__Group__3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:946:2: rule__Hide__Group__2__Impl rule__Hide__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__2__Impl_in_rule__Hide__Group__21868);
            rule__Hide__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__3_in_rule__Hide__Group__21871);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:953:1: rule__Hide__Group__2__Impl : ( '(' ) ;
    public final void rule__Hide__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:957:1: ( ( '(' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:958:1: ( '(' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:958:1: ( '(' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:959:1: '('
            {
             before(grammarAccess.getHideAccess().getLeftParenthesisKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Hide__Group__2__Impl1899); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:972:1: rule__Hide__Group__3 : rule__Hide__Group__3__Impl rule__Hide__Group__4 ;
    public final void rule__Hide__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:976:1: ( rule__Hide__Group__3__Impl rule__Hide__Group__4 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:977:2: rule__Hide__Group__3__Impl rule__Hide__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__3__Impl_in_rule__Hide__Group__31930);
            rule__Hide__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__4_in_rule__Hide__Group__31933);
            rule__Hide__Group__4();

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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:984:1: rule__Hide__Group__3__Impl : ( ( rule__Hide__SimplePositionAssignment_3 ) ) ;
    public final void rule__Hide__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:988:1: ( ( ( rule__Hide__SimplePositionAssignment_3 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:989:1: ( ( rule__Hide__SimplePositionAssignment_3 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:989:1: ( ( rule__Hide__SimplePositionAssignment_3 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:990:1: ( rule__Hide__SimplePositionAssignment_3 )
            {
             before(grammarAccess.getHideAccess().getSimplePositionAssignment_3()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:991:1: ( rule__Hide__SimplePositionAssignment_3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:991:2: rule__Hide__SimplePositionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__SimplePositionAssignment_3_in_rule__Hide__Group__3__Impl1960);
            rule__Hide__SimplePositionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHideAccess().getSimplePositionAssignment_3()); 

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


    // $ANTLR start "rule__Hide__Group__4"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1001:1: rule__Hide__Group__4 : rule__Hide__Group__4__Impl ;
    public final void rule__Hide__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1005:1: ( rule__Hide__Group__4__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1006:2: rule__Hide__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__4__Impl_in_rule__Hide__Group__41990);
            rule__Hide__Group__4__Impl();

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
    // $ANTLR end "rule__Hide__Group__4"


    // $ANTLR start "rule__Hide__Group__4__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1012:1: rule__Hide__Group__4__Impl : ( ')' ) ;
    public final void rule__Hide__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1016:1: ( ( ')' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1017:1: ( ')' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1017:1: ( ')' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1018:1: ')'
            {
             before(grammarAccess.getHideAccess().getRightParenthesisKeyword_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Hide__Group__4__Impl2018); 
             after(grammarAccess.getHideAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Hide__Group__4__Impl"


    // $ANTLR start "rule__Show__Group__0"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1041:1: rule__Show__Group__0 : rule__Show__Group__0__Impl rule__Show__Group__1 ;
    public final void rule__Show__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1045:1: ( rule__Show__Group__0__Impl rule__Show__Group__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1046:2: rule__Show__Group__0__Impl rule__Show__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__0__Impl_in_rule__Show__Group__02059);
            rule__Show__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__1_in_rule__Show__Group__02062);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1053:1: rule__Show__Group__0__Impl : ( () ) ;
    public final void rule__Show__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1057:1: ( ( () ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1058:1: ( () )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1058:1: ( () )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1059:1: ()
            {
             before(grammarAccess.getShowAccess().getShowAction_0()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1060:1: ()
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1062:1: 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1072:1: rule__Show__Group__1 : rule__Show__Group__1__Impl rule__Show__Group__2 ;
    public final void rule__Show__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1076:1: ( rule__Show__Group__1__Impl rule__Show__Group__2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1077:2: rule__Show__Group__1__Impl rule__Show__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__1__Impl_in_rule__Show__Group__12120);
            rule__Show__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__2_in_rule__Show__Group__12123);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1084:1: rule__Show__Group__1__Impl : ( 'show' ) ;
    public final void rule__Show__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1088:1: ( ( 'show' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1089:1: ( 'show' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1089:1: ( 'show' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1090:1: 'show'
            {
             before(grammarAccess.getShowAccess().getShowKeyword_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Show__Group__1__Impl2151); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1103:1: rule__Show__Group__2 : rule__Show__Group__2__Impl rule__Show__Group__3 ;
    public final void rule__Show__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1107:1: ( rule__Show__Group__2__Impl rule__Show__Group__3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1108:2: rule__Show__Group__2__Impl rule__Show__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__2__Impl_in_rule__Show__Group__22182);
            rule__Show__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__3_in_rule__Show__Group__22185);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1115:1: rule__Show__Group__2__Impl : ( '(' ) ;
    public final void rule__Show__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1119:1: ( ( '(' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1120:1: ( '(' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1120:1: ( '(' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1121:1: '('
            {
             before(grammarAccess.getShowAccess().getLeftParenthesisKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Show__Group__2__Impl2213); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1134:1: rule__Show__Group__3 : rule__Show__Group__3__Impl rule__Show__Group__4 ;
    public final void rule__Show__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1138:1: ( rule__Show__Group__3__Impl rule__Show__Group__4 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1139:2: rule__Show__Group__3__Impl rule__Show__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__3__Impl_in_rule__Show__Group__32244);
            rule__Show__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__4_in_rule__Show__Group__32247);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1146:1: rule__Show__Group__3__Impl : ( ( rule__Show__SimplePositionAssignment_3 ) ) ;
    public final void rule__Show__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1150:1: ( ( ( rule__Show__SimplePositionAssignment_3 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1151:1: ( ( rule__Show__SimplePositionAssignment_3 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1151:1: ( ( rule__Show__SimplePositionAssignment_3 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1152:1: ( rule__Show__SimplePositionAssignment_3 )
            {
             before(grammarAccess.getShowAccess().getSimplePositionAssignment_3()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1153:1: ( rule__Show__SimplePositionAssignment_3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1153:2: rule__Show__SimplePositionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__SimplePositionAssignment_3_in_rule__Show__Group__3__Impl2274);
            rule__Show__SimplePositionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getSimplePositionAssignment_3()); 

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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1163:1: rule__Show__Group__4 : rule__Show__Group__4__Impl rule__Show__Group__5 ;
    public final void rule__Show__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1167:1: ( rule__Show__Group__4__Impl rule__Show__Group__5 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1168:2: rule__Show__Group__4__Impl rule__Show__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__4__Impl_in_rule__Show__Group__42304);
            rule__Show__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__5_in_rule__Show__Group__42307);
            rule__Show__Group__5();

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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1175:1: rule__Show__Group__4__Impl : ( ',' ) ;
    public final void rule__Show__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1179:1: ( ( ',' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1180:1: ( ',' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1180:1: ( ',' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1181:1: ','
            {
             before(grammarAccess.getShowAccess().getCommaKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Show__Group__4__Impl2335); 
             after(grammarAccess.getShowAccess().getCommaKeyword_4()); 

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


    // $ANTLR start "rule__Show__Group__5"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1194:1: rule__Show__Group__5 : rule__Show__Group__5__Impl rule__Show__Group__6 ;
    public final void rule__Show__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1198:1: ( rule__Show__Group__5__Impl rule__Show__Group__6 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1199:2: rule__Show__Group__5__Impl rule__Show__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__5__Impl_in_rule__Show__Group__52366);
            rule__Show__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__6_in_rule__Show__Group__52369);
            rule__Show__Group__6();

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
    // $ANTLR end "rule__Show__Group__5"


    // $ANTLR start "rule__Show__Group__5__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1206:1: rule__Show__Group__5__Impl : ( ( rule__Show__ShapeAssignment_5 ) ) ;
    public final void rule__Show__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1210:1: ( ( ( rule__Show__ShapeAssignment_5 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1211:1: ( ( rule__Show__ShapeAssignment_5 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1211:1: ( ( rule__Show__ShapeAssignment_5 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1212:1: ( rule__Show__ShapeAssignment_5 )
            {
             before(grammarAccess.getShowAccess().getShapeAssignment_5()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1213:1: ( rule__Show__ShapeAssignment_5 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1213:2: rule__Show__ShapeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__ShapeAssignment_5_in_rule__Show__Group__5__Impl2396);
            rule__Show__ShapeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getShapeAssignment_5()); 

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
    // $ANTLR end "rule__Show__Group__5__Impl"


    // $ANTLR start "rule__Show__Group__6"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1223:1: rule__Show__Group__6 : rule__Show__Group__6__Impl ;
    public final void rule__Show__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1227:1: ( rule__Show__Group__6__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1228:2: rule__Show__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__6__Impl_in_rule__Show__Group__62426);
            rule__Show__Group__6__Impl();

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
    // $ANTLR end "rule__Show__Group__6"


    // $ANTLR start "rule__Show__Group__6__Impl"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1234:1: rule__Show__Group__6__Impl : ( ')' ) ;
    public final void rule__Show__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1238:1: ( ( ')' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1239:1: ( ')' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1239:1: ( ')' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1240:1: ')'
            {
             before(grammarAccess.getShowAccess().getRightParenthesisKeyword_6()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Show__Group__6__Impl2454); 
             after(grammarAccess.getShowAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Show__Group__6__Impl"


    // $ANTLR start "rule__Wait__Group__0"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1267:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1271:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1272:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__0__Impl_in_rule__Wait__Group__02499);
            rule__Wait__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__1_in_rule__Wait__Group__02502);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1279:1: rule__Wait__Group__0__Impl : ( () ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1283:1: ( ( () ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1284:1: ( () )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1284:1: ( () )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1285:1: ()
            {
             before(grammarAccess.getWaitAccess().getWaitAction_0()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1286:1: ()
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1288:1: 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1298:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl rule__Wait__Group__2 ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1302:1: ( rule__Wait__Group__1__Impl rule__Wait__Group__2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1303:2: rule__Wait__Group__1__Impl rule__Wait__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__1__Impl_in_rule__Wait__Group__12560);
            rule__Wait__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__2_in_rule__Wait__Group__12563);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1310:1: rule__Wait__Group__1__Impl : ( 'wait' ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1314:1: ( ( 'wait' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1315:1: ( 'wait' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1315:1: ( 'wait' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1316:1: 'wait'
            {
             before(grammarAccess.getWaitAccess().getWaitKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Wait__Group__1__Impl2591); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1329:1: rule__Wait__Group__2 : rule__Wait__Group__2__Impl rule__Wait__Group__3 ;
    public final void rule__Wait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1333:1: ( rule__Wait__Group__2__Impl rule__Wait__Group__3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1334:2: rule__Wait__Group__2__Impl rule__Wait__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__2__Impl_in_rule__Wait__Group__22622);
            rule__Wait__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__3_in_rule__Wait__Group__22625);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1341:1: rule__Wait__Group__2__Impl : ( '(' ) ;
    public final void rule__Wait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1345:1: ( ( '(' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1346:1: ( '(' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1346:1: ( '(' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1347:1: '('
            {
             before(grammarAccess.getWaitAccess().getLeftParenthesisKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Wait__Group__2__Impl2653); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1360:1: rule__Wait__Group__3 : rule__Wait__Group__3__Impl rule__Wait__Group__4 ;
    public final void rule__Wait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1364:1: ( rule__Wait__Group__3__Impl rule__Wait__Group__4 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1365:2: rule__Wait__Group__3__Impl rule__Wait__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__3__Impl_in_rule__Wait__Group__32684);
            rule__Wait__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__4_in_rule__Wait__Group__32687);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1372:1: rule__Wait__Group__3__Impl : ( ( rule__Wait__TimeAssignment_3 ) ) ;
    public final void rule__Wait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1376:1: ( ( ( rule__Wait__TimeAssignment_3 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1377:1: ( ( rule__Wait__TimeAssignment_3 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1377:1: ( ( rule__Wait__TimeAssignment_3 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1378:1: ( rule__Wait__TimeAssignment_3 )
            {
             before(grammarAccess.getWaitAccess().getTimeAssignment_3()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1379:1: ( rule__Wait__TimeAssignment_3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1379:2: rule__Wait__TimeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wait__TimeAssignment_3_in_rule__Wait__Group__3__Impl2714);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1389:1: rule__Wait__Group__4 : rule__Wait__Group__4__Impl ;
    public final void rule__Wait__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1393:1: ( rule__Wait__Group__4__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1394:2: rule__Wait__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wait__Group__4__Impl_in_rule__Wait__Group__42744);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1400:1: rule__Wait__Group__4__Impl : ( ')' ) ;
    public final void rule__Wait__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1404:1: ( ( ')' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1405:1: ( ')' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1405:1: ( ')' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1406:1: ')'
            {
             before(grammarAccess.getWaitAccess().getRightParenthesisKeyword_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Wait__Group__4__Impl2772); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1429:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1433:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1434:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__02813);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__02816);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1441:1: rule__Sequence__Group__0__Impl : ( () ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1445:1: ( ( () ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1446:1: ( () )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1446:1: ( () )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1447:1: ()
            {
             before(grammarAccess.getSequenceAccess().getSequenceAction_0()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1448:1: ()
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1450:1: 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1460:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1464:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1465:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__12874);
            rule__Sequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__12877);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1472:1: rule__Sequence__Group__1__Impl : ( '[' ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1476:1: ( ( '[' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1477:1: ( '[' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1477:1: ( '[' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1478:1: '['
            {
             before(grammarAccess.getSequenceAccess().getLeftSquareBracketKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Sequence__Group__1__Impl2905); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1491:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1495:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1496:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__22936);
            rule__Sequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__22939);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1503:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__ComponentsAssignment_2 ) ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1507:1: ( ( ( rule__Sequence__ComponentsAssignment_2 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1508:1: ( ( rule__Sequence__ComponentsAssignment_2 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1508:1: ( ( rule__Sequence__ComponentsAssignment_2 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1509:1: ( rule__Sequence__ComponentsAssignment_2 )
            {
             before(grammarAccess.getSequenceAccess().getComponentsAssignment_2()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1510:1: ( rule__Sequence__ComponentsAssignment_2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1510:2: rule__Sequence__ComponentsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__ComponentsAssignment_2_in_rule__Sequence__Group__2__Impl2966);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1520:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1524:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1525:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32996);
            rule__Sequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32999);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1532:1: rule__Sequence__Group__3__Impl : ( ( rule__Sequence__Group_3__0 )* ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1536:1: ( ( ( rule__Sequence__Group_3__0 )* ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1537:1: ( ( rule__Sequence__Group_3__0 )* )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1537:1: ( ( rule__Sequence__Group_3__0 )* )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1538:1: ( rule__Sequence__Group_3__0 )*
            {
             before(grammarAccess.getSequenceAccess().getGroup_3()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1539:1: ( rule__Sequence__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1539:2: rule__Sequence__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__0_in_rule__Sequence__Group__3__Impl3026);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1549:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1553:1: ( rule__Sequence__Group__4__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1554:2: rule__Sequence__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__43057);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1560:1: rule__Sequence__Group__4__Impl : ( ']' ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1564:1: ( ( ']' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1565:1: ( ']' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1565:1: ( ']' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1566:1: ']'
            {
             before(grammarAccess.getSequenceAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Sequence__Group__4__Impl3085); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1589:1: rule__Sequence__Group_3__0 : rule__Sequence__Group_3__0__Impl rule__Sequence__Group_3__1 ;
    public final void rule__Sequence__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1593:1: ( rule__Sequence__Group_3__0__Impl rule__Sequence__Group_3__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1594:2: rule__Sequence__Group_3__0__Impl rule__Sequence__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__0__Impl_in_rule__Sequence__Group_3__03126);
            rule__Sequence__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__1_in_rule__Sequence__Group_3__03129);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1601:1: rule__Sequence__Group_3__0__Impl : ( ';' ) ;
    public final void rule__Sequence__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1605:1: ( ( ';' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1606:1: ( ';' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1606:1: ( ';' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1607:1: ';'
            {
             before(grammarAccess.getSequenceAccess().getSemicolonKeyword_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Sequence__Group_3__0__Impl3157); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1620:1: rule__Sequence__Group_3__1 : rule__Sequence__Group_3__1__Impl ;
    public final void rule__Sequence__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1624:1: ( rule__Sequence__Group_3__1__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1625:2: rule__Sequence__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__1__Impl_in_rule__Sequence__Group_3__13188);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1631:1: rule__Sequence__Group_3__1__Impl : ( ( rule__Sequence__ComponentsAssignment_3_1 ) ) ;
    public final void rule__Sequence__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1635:1: ( ( ( rule__Sequence__ComponentsAssignment_3_1 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1636:1: ( ( rule__Sequence__ComponentsAssignment_3_1 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1636:1: ( ( rule__Sequence__ComponentsAssignment_3_1 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1637:1: ( rule__Sequence__ComponentsAssignment_3_1 )
            {
             before(grammarAccess.getSequenceAccess().getComponentsAssignment_3_1()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1638:1: ( rule__Sequence__ComponentsAssignment_3_1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1638:2: rule__Sequence__ComponentsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__ComponentsAssignment_3_1_in_rule__Sequence__Group_3__1__Impl3215);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1652:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1656:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1657:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__03249);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__03252);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1664:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1668:1: ( ( ( '-' )? ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1669:1: ( ( '-' )? )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1669:1: ( ( '-' )? )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1670:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1671:1: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1672:2: '-'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__EDouble__Group__0__Impl3281); 

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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1683:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1687:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1688:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__13314);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__13317);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1695:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1699:1: ( ( ( RULE_INT )? ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1700:1: ( ( RULE_INT )? )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1700:1: ( ( RULE_INT )? )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1701:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1702:1: ( RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1702:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl3345); 

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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1712:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1716:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1717:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__23376);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__23379);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1724:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1728:1: ( ( '.' ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1729:1: ( '.' )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1729:1: ( '.' )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1730:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__EDouble__Group__2__Impl3407); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1743:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1747:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1748:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__33438);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__33441);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1755:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1759:1: ( ( RULE_INT ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1760:1: ( RULE_INT )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1760:1: ( RULE_INT )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1761:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl3468); 
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1772:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1776:1: ( rule__EDouble__Group__4__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1777:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__43497);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1783:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1787:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1788:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1788:1: ( ( rule__EDouble__Group_4__0 )? )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1789:1: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1790:1: ( rule__EDouble__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=11 && LA9_0<=12)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1790:2: rule__EDouble__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl3524);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1810:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1814:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1815:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__03565);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__03568);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1822:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1826:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1827:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1827:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1828:1: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1829:1: ( rule__EDouble__Alternatives_4_0 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1829:2: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl3595);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1839:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1843:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1844:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__13625);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__13628);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1851:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1855:1: ( ( ( '-' )? ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1856:1: ( ( '-' )? )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1856:1: ( ( '-' )? )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1857:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1858:1: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1859:2: '-'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__EDouble__Group_4__1__Impl3657); 

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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1870:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1874:1: ( rule__EDouble__Group_4__2__Impl )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1875:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__23690);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1881:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1885:1: ( ( RULE_INT ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1886:1: ( RULE_INT )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1886:1: ( RULE_INT )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1887:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl3717); 
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


    // $ANTLR start "rule__Animation__ComponentsAssignment_1_2"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1905:1: rule__Animation__ComponentsAssignment_1_2 : ( ruleSimpleAnimation ) ;
    public final void rule__Animation__ComponentsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1909:1: ( ( ruleSimpleAnimation ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1910:1: ( ruleSimpleAnimation )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1910:1: ( ruleSimpleAnimation )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1911:1: ruleSimpleAnimation
            {
             before(grammarAccess.getAnimationAccess().getComponentsSimpleAnimationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_rule__Animation__ComponentsAssignment_1_23757);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1920:1: rule__Animation__ComponentsAssignment_1_3_1 : ( ruleSimpleAnimation ) ;
    public final void rule__Animation__ComponentsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1924:1: ( ( ruleSimpleAnimation ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1925:1: ( ruleSimpleAnimation )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1925:1: ( ruleSimpleAnimation )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1926:1: ruleSimpleAnimation
            {
             before(grammarAccess.getAnimationAccess().getComponentsSimpleAnimationParserRuleCall_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_rule__Animation__ComponentsAssignment_1_3_13788);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1935:1: rule__Move__SpeedAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Move__SpeedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1939:1: ( ( ruleEDouble ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1940:1: ( ruleEDouble )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1940:1: ( ruleEDouble )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1941:1: ruleEDouble
            {
             before(grammarAccess.getMoveAccess().getSpeedEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Move__SpeedAssignment_33819);
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


    // $ANTLR start "rule__Move__GeoTrackAssignment_5"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1950:1: rule__Move__GeoTrackAssignment_5 : ( ruleEString ) ;
    public final void rule__Move__GeoTrackAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1954:1: ( ( ruleEString ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1955:1: ( ruleEString )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1955:1: ( ruleEString )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1956:1: ruleEString
            {
             before(grammarAccess.getMoveAccess().getGeoTrackEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Move__GeoTrackAssignment_53850);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getGeoTrackEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Move__GeoTrackAssignment_5"


    // $ANTLR start "rule__Hide__SimplePositionAssignment_3"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1965:1: rule__Hide__SimplePositionAssignment_3 : ( ruleEString ) ;
    public final void rule__Hide__SimplePositionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1969:1: ( ( ruleEString ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1970:1: ( ruleEString )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1970:1: ( ruleEString )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1971:1: ruleEString
            {
             before(grammarAccess.getHideAccess().getSimplePositionEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Hide__SimplePositionAssignment_33881);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHideAccess().getSimplePositionEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Hide__SimplePositionAssignment_3"


    // $ANTLR start "rule__Show__SimplePositionAssignment_3"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1980:1: rule__Show__SimplePositionAssignment_3 : ( ruleEString ) ;
    public final void rule__Show__SimplePositionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1984:1: ( ( ruleEString ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1985:1: ( ruleEString )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1985:1: ( ruleEString )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1986:1: ruleEString
            {
             before(grammarAccess.getShowAccess().getSimplePositionEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Show__SimplePositionAssignment_33912);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShowAccess().getSimplePositionEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Show__SimplePositionAssignment_3"


    // $ANTLR start "rule__Show__ShapeAssignment_5"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1995:1: rule__Show__ShapeAssignment_5 : ( ruleEString ) ;
    public final void rule__Show__ShapeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:1999:1: ( ( ruleEString ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2000:1: ( ruleEString )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2000:1: ( ruleEString )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2001:1: ruleEString
            {
             before(grammarAccess.getShowAccess().getShapeEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Show__ShapeAssignment_53943);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShowAccess().getShapeEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Show__ShapeAssignment_5"


    // $ANTLR start "rule__Wait__TimeAssignment_3"
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2010:1: rule__Wait__TimeAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Wait__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2014:1: ( ( ruleEDouble ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2015:1: ( ruleEDouble )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2015:1: ( ruleEDouble )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2016:1: ruleEDouble
            {
             before(grammarAccess.getWaitAccess().getTimeEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Wait__TimeAssignment_33974);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getWaitAccess().getTimeEDoubleParserRuleCall_3_0()); 

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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2025:1: rule__Sequence__ComponentsAssignment_2 : ( ruleSimpleAnimation ) ;
    public final void rule__Sequence__ComponentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2029:1: ( ( ruleSimpleAnimation ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2030:1: ( ruleSimpleAnimation )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2030:1: ( ruleSimpleAnimation )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2031:1: ruleSimpleAnimation
            {
             before(grammarAccess.getSequenceAccess().getComponentsSimpleAnimationParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_rule__Sequence__ComponentsAssignment_24005);
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
    // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2040:1: rule__Sequence__ComponentsAssignment_3_1 : ( ruleSimpleAnimation ) ;
    public final void rule__Sequence__ComponentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2044:1: ( ( ruleSimpleAnimation ) )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2045:1: ( ruleSimpleAnimation )
            {
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2045:1: ( ruleSimpleAnimation )
            // ../se2.e.animations.language.ui/src-gen/anl/ui/contentassist/antlr/internal/InternalAnimationsLanguage.g:2046:1: ruleSimpleAnimation
            {
             before(grammarAccess.getSequenceAccess().getComponentsSimpleAnimationParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnimation_in_rule__Sequence__ComponentsAssignment_3_14036);
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
        public static final BitSet FOLLOW_ruleMove_in_rule__SimpleAnimation__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHide_in_rule__SimpleAnimation__Alternatives627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShow_in_rule__SimpleAnimation__Alternatives644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWait_in_rule__SimpleAnimation__Alternatives661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_rule__SimpleAnimation__Alternatives678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EDouble__Alternatives_4_0760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDouble__Alternatives_4_0780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group__0__Impl_in_rule__Animation__Group__0812 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Animation__Group__1_in_rule__Animation__Group__0815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_rule__Animation__Group__0__Impl842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group__1__Impl_in_rule__Animation__Group__1871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_1__0_in_rule__Animation__Group__1__Impl898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_1__0__Impl_in_rule__Animation__Group_1__0933 = new BitSet(new long[]{0x00000000003C4000L});
        public static final BitSet FOLLOW_rule__Animation__Group_1__1_in_rule__Animation__Group_1__0936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Animation__Group_1__0__Impl964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_1__1__Impl_in_rule__Animation__Group_1__1995 = new BitSet(new long[]{0x00000000003C4000L});
        public static final BitSet FOLLOW_rule__Animation__Group_1__2_in_rule__Animation__Group_1__1998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_1__2__Impl_in_rule__Animation__Group_1__21056 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Animation__Group_1__3_in_rule__Animation__Group_1__21059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__ComponentsAssignment_1_2_in_rule__Animation__Group_1__2__Impl1086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_1__3__Impl_in_rule__Animation__Group_1__31116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_1_3__0_in_rule__Animation__Group_1__3__Impl1143 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Animation__Group_1_3__0__Impl_in_rule__Animation__Group_1_3__01182 = new BitSet(new long[]{0x00000000003C4000L});
        public static final BitSet FOLLOW_rule__Animation__Group_1_3__1_in_rule__Animation__Group_1_3__01185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Animation__Group_1_3__0__Impl1213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_1_3__1__Impl_in_rule__Animation__Group_1_3__11244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__ComponentsAssignment_1_3_1_in_rule__Animation__Group_1_3__1__Impl1271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__01305 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Move__Group__1_in_rule__Move__Group__01308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__11366 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Move__Group__2_in_rule__Move__Group__11369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Move__Group__1__Impl1397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__21428 = new BitSet(new long[]{0x0000000001800040L});
        public static final BitSet FOLLOW_rule__Move__Group__3_in_rule__Move__Group__21431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Move__Group__2__Impl1459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__31490 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Move__Group__4_in_rule__Move__Group__31493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__SpeedAssignment_3_in_rule__Move__Group__3__Impl1520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__41550 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Move__Group__5_in_rule__Move__Group__41553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Move__Group__4__Impl1581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__5__Impl_in_rule__Move__Group__51612 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Move__Group__6_in_rule__Move__Group__51615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__GeoTrackAssignment_5_in_rule__Move__Group__5__Impl1642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__6__Impl_in_rule__Move__Group__61672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Move__Group__6__Impl1700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__0__Impl_in_rule__Hide__Group__01745 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Hide__Group__1_in_rule__Hide__Group__01748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__1__Impl_in_rule__Hide__Group__11806 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Hide__Group__2_in_rule__Hide__Group__11809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Hide__Group__1__Impl1837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__2__Impl_in_rule__Hide__Group__21868 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Hide__Group__3_in_rule__Hide__Group__21871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Hide__Group__2__Impl1899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__3__Impl_in_rule__Hide__Group__31930 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Hide__Group__4_in_rule__Hide__Group__31933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__SimplePositionAssignment_3_in_rule__Hide__Group__3__Impl1960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__4__Impl_in_rule__Hide__Group__41990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Hide__Group__4__Impl2018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__0__Impl_in_rule__Show__Group__02059 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Show__Group__1_in_rule__Show__Group__02062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__1__Impl_in_rule__Show__Group__12120 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Show__Group__2_in_rule__Show__Group__12123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Show__Group__1__Impl2151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__2__Impl_in_rule__Show__Group__22182 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Show__Group__3_in_rule__Show__Group__22185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Show__Group__2__Impl2213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__3__Impl_in_rule__Show__Group__32244 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Show__Group__4_in_rule__Show__Group__32247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__SimplePositionAssignment_3_in_rule__Show__Group__3__Impl2274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__4__Impl_in_rule__Show__Group__42304 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Show__Group__5_in_rule__Show__Group__42307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Show__Group__4__Impl2335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__5__Impl_in_rule__Show__Group__52366 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Show__Group__6_in_rule__Show__Group__52369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__ShapeAssignment_5_in_rule__Show__Group__5__Impl2396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__6__Impl_in_rule__Show__Group__62426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Show__Group__6__Impl2454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wait__Group__0__Impl_in_rule__Wait__Group__02499 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Wait__Group__1_in_rule__Wait__Group__02502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wait__Group__1__Impl_in_rule__Wait__Group__12560 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Wait__Group__2_in_rule__Wait__Group__12563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Wait__Group__1__Impl2591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wait__Group__2__Impl_in_rule__Wait__Group__22622 = new BitSet(new long[]{0x0000000001800040L});
        public static final BitSet FOLLOW_rule__Wait__Group__3_in_rule__Wait__Group__22625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Wait__Group__2__Impl2653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wait__Group__3__Impl_in_rule__Wait__Group__32684 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Wait__Group__4_in_rule__Wait__Group__32687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wait__TimeAssignment_3_in_rule__Wait__Group__3__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wait__Group__4__Impl_in_rule__Wait__Group__42744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Wait__Group__4__Impl2772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__02813 = new BitSet(new long[]{0x00000000003C4000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__02816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__12874 = new BitSet(new long[]{0x00000000003C4000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__12877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Sequence__Group__1__Impl2905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__22936 = new BitSet(new long[]{0x0000000000402000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__22939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__ComponentsAssignment_2_in_rule__Sequence__Group__2__Impl2966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32996 = new BitSet(new long[]{0x0000000000402000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__0_in_rule__Sequence__Group__3__Impl3026 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__43057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Sequence__Group__4__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__0__Impl_in_rule__Sequence__Group_3__03126 = new BitSet(new long[]{0x00000000003C4000L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__1_in_rule__Sequence__Group_3__03129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Sequence__Group_3__0__Impl3157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__1__Impl_in_rule__Sequence__Group_3__13188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__ComponentsAssignment_3_1_in_rule__Sequence__Group_3__1__Impl3215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__03249 = new BitSet(new long[]{0x0000000001800040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__03252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__EDouble__Group__0__Impl3281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__13314 = new BitSet(new long[]{0x0000000001800040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__13317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl3345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__23376 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__23379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__EDouble__Group__2__Impl3407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__33438 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__33441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl3468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__43497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl3524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__03565 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__03568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl3595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__13625 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__13628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__EDouble__Group_4__1__Impl3657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__23690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl3717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_rule__Animation__ComponentsAssignment_1_23757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_rule__Animation__ComponentsAssignment_1_3_13788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Move__SpeedAssignment_33819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Move__GeoTrackAssignment_53850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Hide__SimplePositionAssignment_33881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Show__SimplePositionAssignment_33912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Show__ShapeAssignment_53943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Wait__TimeAssignment_33974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_rule__Sequence__ComponentsAssignment_24005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnimation_in_rule__Sequence__ComponentsAssignment_3_14036 = new BitSet(new long[]{0x0000000000000002L});
    }


}