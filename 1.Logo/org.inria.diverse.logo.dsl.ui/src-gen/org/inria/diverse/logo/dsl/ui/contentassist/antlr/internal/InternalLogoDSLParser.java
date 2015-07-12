package org.inria.diverse.logo.dsl.ui.contentassist.antlr.internal; 

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
import org.inria.diverse.logo.dsl.services.LogoDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLogoDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BLACK'", "'BLUE'", "'CYAN'", "'DARK GRAY'", "'GRAY'", "'GREEN'", "'LIGHTGRAY'", "'MAGENTA'", "'ORANGE'", "'PINK'", "'RED'", "'WHITE'", "'YELLOW'", "'FORWARD'", "'LEFT'", "'RIGHT'", "'SETX'", "'SETY'", "'PENDOWN'", "'PENUP'", "'PENCOLOR'", "'CANVASCOLOR'", "'FONTSTYLE'", "'BOLD'", "'ITALIC'", "'PLAIN'", "'CLEAR'", "'HOME'", "'DRAWSTRING'", "'MAKE'", "'='", "'CONTENT'", "'SUM'", "'+'", "'SUBTRACT'", "'-'", "'MULTIPLY'", "'*'", "'DIVIDE'", "'/'", "'REPEAT'", "'END REPEAT'", "'TO'", "'END TO'", "':'", "'IF'", "'END IF'", "'>'", "'<'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalLogoDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLogoDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLogoDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g"; }


     
     	private LogoDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LogoDSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleLogoProgram"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:60:1: entryRuleLogoProgram : ruleLogoProgram EOF ;
    public final void entryRuleLogoProgram() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:61:1: ( ruleLogoProgram EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:62:1: ruleLogoProgram EOF
            {
             before(grammarAccess.getLogoProgramRule()); 
            pushFollow(FOLLOW_ruleLogoProgram_in_entryRuleLogoProgram61);
            ruleLogoProgram();

            state._fsp--;

             after(grammarAccess.getLogoProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogoProgram68); 

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
    // $ANTLR end "entryRuleLogoProgram"


    // $ANTLR start "ruleLogoProgram"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:69:1: ruleLogoProgram : ( ( rule__LogoProgram__SentencesAssignment )* ) ;
    public final void ruleLogoProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:73:2: ( ( ( rule__LogoProgram__SentencesAssignment )* ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:74:1: ( ( rule__LogoProgram__SentencesAssignment )* )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:74:1: ( ( rule__LogoProgram__SentencesAssignment )* )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:75:1: ( rule__LogoProgram__SentencesAssignment )*
            {
             before(grammarAccess.getLogoProgramAccess().getSentencesAssignment()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:76:1: ( rule__LogoProgram__SentencesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=25 && LA1_0<=34)||(LA1_0>=38 && LA1_0<=41)||(LA1_0>=43 && LA1_0<=44)||LA1_0==46||LA1_0==48||LA1_0==50||LA1_0==52||LA1_0==54||LA1_0==57) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:76:2: rule__LogoProgram__SentencesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__LogoProgram__SentencesAssignment_in_ruleLogoProgram94);
            	    rule__LogoProgram__SentencesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLogoProgramAccess().getSentencesAssignment()); 

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
    // $ANTLR end "ruleLogoProgram"


    // $ANTLR start "entryRuleSENTENCE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:88:1: entryRuleSENTENCE : ruleSENTENCE EOF ;
    public final void entryRuleSENTENCE() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:89:1: ( ruleSENTENCE EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:90:1: ruleSENTENCE EOF
            {
             before(grammarAccess.getSENTENCERule()); 
            pushFollow(FOLLOW_ruleSENTENCE_in_entryRuleSENTENCE122);
            ruleSENTENCE();

            state._fsp--;

             after(grammarAccess.getSENTENCERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSENTENCE129); 

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
    // $ANTLR end "entryRuleSENTENCE"


    // $ANTLR start "ruleSENTENCE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:97:1: ruleSENTENCE : ( ( rule__SENTENCE__Alternatives ) ) ;
    public final void ruleSENTENCE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:101:2: ( ( ( rule__SENTENCE__Alternatives ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:102:1: ( ( rule__SENTENCE__Alternatives ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:102:1: ( ( rule__SENTENCE__Alternatives ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:103:1: ( rule__SENTENCE__Alternatives )
            {
             before(grammarAccess.getSENTENCEAccess().getAlternatives()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:104:1: ( rule__SENTENCE__Alternatives )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:104:2: rule__SENTENCE__Alternatives
            {
            pushFollow(FOLLOW_rule__SENTENCE__Alternatives_in_ruleSENTENCE155);
            rule__SENTENCE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSENTENCEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSENTENCE"


    // $ANTLR start "entryRuleMOVE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:116:1: entryRuleMOVE : ruleMOVE EOF ;
    public final void entryRuleMOVE() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:117:1: ( ruleMOVE EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:118:1: ruleMOVE EOF
            {
             before(grammarAccess.getMOVERule()); 
            pushFollow(FOLLOW_ruleMOVE_in_entryRuleMOVE182);
            ruleMOVE();

            state._fsp--;

             after(grammarAccess.getMOVERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMOVE189); 

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
    // $ANTLR end "entryRuleMOVE"


    // $ANTLR start "ruleMOVE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:125:1: ruleMOVE : ( ( rule__MOVE__Alternatives ) ) ;
    public final void ruleMOVE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:129:2: ( ( ( rule__MOVE__Alternatives ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:130:1: ( ( rule__MOVE__Alternatives ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:130:1: ( ( rule__MOVE__Alternatives ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:131:1: ( rule__MOVE__Alternatives )
            {
             before(grammarAccess.getMOVEAccess().getAlternatives()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:132:1: ( rule__MOVE__Alternatives )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:132:2: rule__MOVE__Alternatives
            {
            pushFollow(FOLLOW_rule__MOVE__Alternatives_in_ruleMOVE215);
            rule__MOVE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMOVEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMOVE"


    // $ANTLR start "entryRuleFORWARD"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:144:1: entryRuleFORWARD : ruleFORWARD EOF ;
    public final void entryRuleFORWARD() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:145:1: ( ruleFORWARD EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:146:1: ruleFORWARD EOF
            {
             before(grammarAccess.getFORWARDRule()); 
            pushFollow(FOLLOW_ruleFORWARD_in_entryRuleFORWARD242);
            ruleFORWARD();

            state._fsp--;

             after(grammarAccess.getFORWARDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFORWARD249); 

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
    // $ANTLR end "entryRuleFORWARD"


    // $ANTLR start "ruleFORWARD"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:153:1: ruleFORWARD : ( ( rule__FORWARD__Group__0 ) ) ;
    public final void ruleFORWARD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:157:2: ( ( ( rule__FORWARD__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:158:1: ( ( rule__FORWARD__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:158:1: ( ( rule__FORWARD__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:159:1: ( rule__FORWARD__Group__0 )
            {
             before(grammarAccess.getFORWARDAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:160:1: ( rule__FORWARD__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:160:2: rule__FORWARD__Group__0
            {
            pushFollow(FOLLOW_rule__FORWARD__Group__0_in_ruleFORWARD275);
            rule__FORWARD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFORWARDAccess().getGroup()); 

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
    // $ANTLR end "ruleFORWARD"


    // $ANTLR start "entryRuleLEFT"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:172:1: entryRuleLEFT : ruleLEFT EOF ;
    public final void entryRuleLEFT() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:173:1: ( ruleLEFT EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:174:1: ruleLEFT EOF
            {
             before(grammarAccess.getLEFTRule()); 
            pushFollow(FOLLOW_ruleLEFT_in_entryRuleLEFT302);
            ruleLEFT();

            state._fsp--;

             after(grammarAccess.getLEFTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLEFT309); 

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
    // $ANTLR end "entryRuleLEFT"


    // $ANTLR start "ruleLEFT"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:181:1: ruleLEFT : ( ( rule__LEFT__Group__0 ) ) ;
    public final void ruleLEFT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:185:2: ( ( ( rule__LEFT__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:186:1: ( ( rule__LEFT__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:186:1: ( ( rule__LEFT__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:187:1: ( rule__LEFT__Group__0 )
            {
             before(grammarAccess.getLEFTAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:188:1: ( rule__LEFT__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:188:2: rule__LEFT__Group__0
            {
            pushFollow(FOLLOW_rule__LEFT__Group__0_in_ruleLEFT335);
            rule__LEFT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLEFTAccess().getGroup()); 

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
    // $ANTLR end "ruleLEFT"


    // $ANTLR start "entryRuleRIGHT"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:200:1: entryRuleRIGHT : ruleRIGHT EOF ;
    public final void entryRuleRIGHT() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:201:1: ( ruleRIGHT EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:202:1: ruleRIGHT EOF
            {
             before(grammarAccess.getRIGHTRule()); 
            pushFollow(FOLLOW_ruleRIGHT_in_entryRuleRIGHT362);
            ruleRIGHT();

            state._fsp--;

             after(grammarAccess.getRIGHTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRIGHT369); 

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
    // $ANTLR end "entryRuleRIGHT"


    // $ANTLR start "ruleRIGHT"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:209:1: ruleRIGHT : ( ( rule__RIGHT__Group__0 ) ) ;
    public final void ruleRIGHT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:213:2: ( ( ( rule__RIGHT__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:214:1: ( ( rule__RIGHT__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:214:1: ( ( rule__RIGHT__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:215:1: ( rule__RIGHT__Group__0 )
            {
             before(grammarAccess.getRIGHTAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:216:1: ( rule__RIGHT__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:216:2: rule__RIGHT__Group__0
            {
            pushFollow(FOLLOW_rule__RIGHT__Group__0_in_ruleRIGHT395);
            rule__RIGHT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRIGHTAccess().getGroup()); 

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
    // $ANTLR end "ruleRIGHT"


    // $ANTLR start "entryRuleSET_X"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:228:1: entryRuleSET_X : ruleSET_X EOF ;
    public final void entryRuleSET_X() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:229:1: ( ruleSET_X EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:230:1: ruleSET_X EOF
            {
             before(grammarAccess.getSET_XRule()); 
            pushFollow(FOLLOW_ruleSET_X_in_entryRuleSET_X422);
            ruleSET_X();

            state._fsp--;

             after(grammarAccess.getSET_XRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSET_X429); 

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
    // $ANTLR end "entryRuleSET_X"


    // $ANTLR start "ruleSET_X"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:237:1: ruleSET_X : ( ( rule__SET_X__Group__0 ) ) ;
    public final void ruleSET_X() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:241:2: ( ( ( rule__SET_X__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:242:1: ( ( rule__SET_X__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:242:1: ( ( rule__SET_X__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:243:1: ( rule__SET_X__Group__0 )
            {
             before(grammarAccess.getSET_XAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:244:1: ( rule__SET_X__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:244:2: rule__SET_X__Group__0
            {
            pushFollow(FOLLOW_rule__SET_X__Group__0_in_ruleSET_X455);
            rule__SET_X__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSET_XAccess().getGroup()); 

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
    // $ANTLR end "ruleSET_X"


    // $ANTLR start "entryRuleSET_Y"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:256:1: entryRuleSET_Y : ruleSET_Y EOF ;
    public final void entryRuleSET_Y() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:257:1: ( ruleSET_Y EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:258:1: ruleSET_Y EOF
            {
             before(grammarAccess.getSET_YRule()); 
            pushFollow(FOLLOW_ruleSET_Y_in_entryRuleSET_Y482);
            ruleSET_Y();

            state._fsp--;

             after(grammarAccess.getSET_YRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSET_Y489); 

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
    // $ANTLR end "entryRuleSET_Y"


    // $ANTLR start "ruleSET_Y"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:265:1: ruleSET_Y : ( ( rule__SET_Y__Group__0 ) ) ;
    public final void ruleSET_Y() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:269:2: ( ( ( rule__SET_Y__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:270:1: ( ( rule__SET_Y__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:270:1: ( ( rule__SET_Y__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:271:1: ( rule__SET_Y__Group__0 )
            {
             before(grammarAccess.getSET_YAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:272:1: ( rule__SET_Y__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:272:2: rule__SET_Y__Group__0
            {
            pushFollow(FOLLOW_rule__SET_Y__Group__0_in_ruleSET_Y515);
            rule__SET_Y__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSET_YAccess().getGroup()); 

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
    // $ANTLR end "ruleSET_Y"


    // $ANTLR start "entryRuleDRAWING_SENTENCE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:284:1: entryRuleDRAWING_SENTENCE : ruleDRAWING_SENTENCE EOF ;
    public final void entryRuleDRAWING_SENTENCE() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:285:1: ( ruleDRAWING_SENTENCE EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:286:1: ruleDRAWING_SENTENCE EOF
            {
             before(grammarAccess.getDRAWING_SENTENCERule()); 
            pushFollow(FOLLOW_ruleDRAWING_SENTENCE_in_entryRuleDRAWING_SENTENCE542);
            ruleDRAWING_SENTENCE();

            state._fsp--;

             after(grammarAccess.getDRAWING_SENTENCERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDRAWING_SENTENCE549); 

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
    // $ANTLR end "entryRuleDRAWING_SENTENCE"


    // $ANTLR start "ruleDRAWING_SENTENCE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:293:1: ruleDRAWING_SENTENCE : ( ( rule__DRAWING_SENTENCE__Alternatives ) ) ;
    public final void ruleDRAWING_SENTENCE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:297:2: ( ( ( rule__DRAWING_SENTENCE__Alternatives ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:298:1: ( ( rule__DRAWING_SENTENCE__Alternatives ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:298:1: ( ( rule__DRAWING_SENTENCE__Alternatives ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:299:1: ( rule__DRAWING_SENTENCE__Alternatives )
            {
             before(grammarAccess.getDRAWING_SENTENCEAccess().getAlternatives()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:300:1: ( rule__DRAWING_SENTENCE__Alternatives )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:300:2: rule__DRAWING_SENTENCE__Alternatives
            {
            pushFollow(FOLLOW_rule__DRAWING_SENTENCE__Alternatives_in_ruleDRAWING_SENTENCE575);
            rule__DRAWING_SENTENCE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDRAWING_SENTENCEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDRAWING_SENTENCE"


    // $ANTLR start "entryRulePENDOWN"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:312:1: entryRulePENDOWN : rulePENDOWN EOF ;
    public final void entryRulePENDOWN() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:313:1: ( rulePENDOWN EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:314:1: rulePENDOWN EOF
            {
             before(grammarAccess.getPENDOWNRule()); 
            pushFollow(FOLLOW_rulePENDOWN_in_entryRulePENDOWN602);
            rulePENDOWN();

            state._fsp--;

             after(grammarAccess.getPENDOWNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePENDOWN609); 

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
    // $ANTLR end "entryRulePENDOWN"


    // $ANTLR start "rulePENDOWN"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:321:1: rulePENDOWN : ( ( rule__PENDOWN__Group__0 ) ) ;
    public final void rulePENDOWN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:325:2: ( ( ( rule__PENDOWN__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:326:1: ( ( rule__PENDOWN__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:326:1: ( ( rule__PENDOWN__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:327:1: ( rule__PENDOWN__Group__0 )
            {
             before(grammarAccess.getPENDOWNAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:328:1: ( rule__PENDOWN__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:328:2: rule__PENDOWN__Group__0
            {
            pushFollow(FOLLOW_rule__PENDOWN__Group__0_in_rulePENDOWN635);
            rule__PENDOWN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPENDOWNAccess().getGroup()); 

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
    // $ANTLR end "rulePENDOWN"


    // $ANTLR start "entryRulePENUP"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:340:1: entryRulePENUP : rulePENUP EOF ;
    public final void entryRulePENUP() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:341:1: ( rulePENUP EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:342:1: rulePENUP EOF
            {
             before(grammarAccess.getPENUPRule()); 
            pushFollow(FOLLOW_rulePENUP_in_entryRulePENUP662);
            rulePENUP();

            state._fsp--;

             after(grammarAccess.getPENUPRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePENUP669); 

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
    // $ANTLR end "entryRulePENUP"


    // $ANTLR start "rulePENUP"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:349:1: rulePENUP : ( ( rule__PENUP__Group__0 ) ) ;
    public final void rulePENUP() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:353:2: ( ( ( rule__PENUP__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:354:1: ( ( rule__PENUP__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:354:1: ( ( rule__PENUP__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:355:1: ( rule__PENUP__Group__0 )
            {
             before(grammarAccess.getPENUPAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:356:1: ( rule__PENUP__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:356:2: rule__PENUP__Group__0
            {
            pushFollow(FOLLOW_rule__PENUP__Group__0_in_rulePENUP695);
            rule__PENUP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPENUPAccess().getGroup()); 

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
    // $ANTLR end "rulePENUP"


    // $ANTLR start "entryRuleCOLOREABLE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:368:1: entryRuleCOLOREABLE : ruleCOLOREABLE EOF ;
    public final void entryRuleCOLOREABLE() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:369:1: ( ruleCOLOREABLE EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:370:1: ruleCOLOREABLE EOF
            {
             before(grammarAccess.getCOLOREABLERule()); 
            pushFollow(FOLLOW_ruleCOLOREABLE_in_entryRuleCOLOREABLE722);
            ruleCOLOREABLE();

            state._fsp--;

             after(grammarAccess.getCOLOREABLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOLOREABLE729); 

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
    // $ANTLR end "entryRuleCOLOREABLE"


    // $ANTLR start "ruleCOLOREABLE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:377:1: ruleCOLOREABLE : ( ( rule__COLOREABLE__Alternatives ) ) ;
    public final void ruleCOLOREABLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:381:2: ( ( ( rule__COLOREABLE__Alternatives ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:382:1: ( ( rule__COLOREABLE__Alternatives ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:382:1: ( ( rule__COLOREABLE__Alternatives ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:383:1: ( rule__COLOREABLE__Alternatives )
            {
             before(grammarAccess.getCOLOREABLEAccess().getAlternatives()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:384:1: ( rule__COLOREABLE__Alternatives )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:384:2: rule__COLOREABLE__Alternatives
            {
            pushFollow(FOLLOW_rule__COLOREABLE__Alternatives_in_ruleCOLOREABLE755);
            rule__COLOREABLE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCOLOREABLEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCOLOREABLE"


    // $ANTLR start "entryRulePENCOLOR"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:396:1: entryRulePENCOLOR : rulePENCOLOR EOF ;
    public final void entryRulePENCOLOR() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:397:1: ( rulePENCOLOR EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:398:1: rulePENCOLOR EOF
            {
             before(grammarAccess.getPENCOLORRule()); 
            pushFollow(FOLLOW_rulePENCOLOR_in_entryRulePENCOLOR782);
            rulePENCOLOR();

            state._fsp--;

             after(grammarAccess.getPENCOLORRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePENCOLOR789); 

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
    // $ANTLR end "entryRulePENCOLOR"


    // $ANTLR start "rulePENCOLOR"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:405:1: rulePENCOLOR : ( ( rule__PENCOLOR__Group__0 ) ) ;
    public final void rulePENCOLOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:409:2: ( ( ( rule__PENCOLOR__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:410:1: ( ( rule__PENCOLOR__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:410:1: ( ( rule__PENCOLOR__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:411:1: ( rule__PENCOLOR__Group__0 )
            {
             before(grammarAccess.getPENCOLORAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:412:1: ( rule__PENCOLOR__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:412:2: rule__PENCOLOR__Group__0
            {
            pushFollow(FOLLOW_rule__PENCOLOR__Group__0_in_rulePENCOLOR815);
            rule__PENCOLOR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPENCOLORAccess().getGroup()); 

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
    // $ANTLR end "rulePENCOLOR"


    // $ANTLR start "entryRuleCANVAS_COLOR"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:424:1: entryRuleCANVAS_COLOR : ruleCANVAS_COLOR EOF ;
    public final void entryRuleCANVAS_COLOR() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:425:1: ( ruleCANVAS_COLOR EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:426:1: ruleCANVAS_COLOR EOF
            {
             before(grammarAccess.getCANVAS_COLORRule()); 
            pushFollow(FOLLOW_ruleCANVAS_COLOR_in_entryRuleCANVAS_COLOR842);
            ruleCANVAS_COLOR();

            state._fsp--;

             after(grammarAccess.getCANVAS_COLORRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCANVAS_COLOR849); 

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
    // $ANTLR end "entryRuleCANVAS_COLOR"


    // $ANTLR start "ruleCANVAS_COLOR"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:433:1: ruleCANVAS_COLOR : ( ( rule__CANVAS_COLOR__Group__0 ) ) ;
    public final void ruleCANVAS_COLOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:437:2: ( ( ( rule__CANVAS_COLOR__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:438:1: ( ( rule__CANVAS_COLOR__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:438:1: ( ( rule__CANVAS_COLOR__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:439:1: ( rule__CANVAS_COLOR__Group__0 )
            {
             before(grammarAccess.getCANVAS_COLORAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:440:1: ( rule__CANVAS_COLOR__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:440:2: rule__CANVAS_COLOR__Group__0
            {
            pushFollow(FOLLOW_rule__CANVAS_COLOR__Group__0_in_ruleCANVAS_COLOR875);
            rule__CANVAS_COLOR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCANVAS_COLORAccess().getGroup()); 

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
    // $ANTLR end "ruleCANVAS_COLOR"


    // $ANTLR start "entryRuleCOLOR_SPEC"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:452:1: entryRuleCOLOR_SPEC : ruleCOLOR_SPEC EOF ;
    public final void entryRuleCOLOR_SPEC() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:453:1: ( ruleCOLOR_SPEC EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:454:1: ruleCOLOR_SPEC EOF
            {
             before(grammarAccess.getCOLOR_SPECRule()); 
            pushFollow(FOLLOW_ruleCOLOR_SPEC_in_entryRuleCOLOR_SPEC902);
            ruleCOLOR_SPEC();

            state._fsp--;

             after(grammarAccess.getCOLOR_SPECRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOLOR_SPEC909); 

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
    // $ANTLR end "entryRuleCOLOR_SPEC"


    // $ANTLR start "ruleCOLOR_SPEC"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:461:1: ruleCOLOR_SPEC : ( ( rule__COLOR_SPEC__Group__0 ) ) ;
    public final void ruleCOLOR_SPEC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:465:2: ( ( ( rule__COLOR_SPEC__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:466:1: ( ( rule__COLOR_SPEC__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:466:1: ( ( rule__COLOR_SPEC__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:467:1: ( rule__COLOR_SPEC__Group__0 )
            {
             before(grammarAccess.getCOLOR_SPECAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:468:1: ( rule__COLOR_SPEC__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:468:2: rule__COLOR_SPEC__Group__0
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__Group__0_in_ruleCOLOR_SPEC935);
            rule__COLOR_SPEC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCOLOR_SPECAccess().getGroup()); 

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
    // $ANTLR end "ruleCOLOR_SPEC"


    // $ANTLR start "entryRuleCOLOR"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:480:1: entryRuleCOLOR : ruleCOLOR EOF ;
    public final void entryRuleCOLOR() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:481:1: ( ruleCOLOR EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:482:1: ruleCOLOR EOF
            {
             before(grammarAccess.getCOLORRule()); 
            pushFollow(FOLLOW_ruleCOLOR_in_entryRuleCOLOR962);
            ruleCOLOR();

            state._fsp--;

             after(grammarAccess.getCOLORRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOLOR969); 

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
    // $ANTLR end "entryRuleCOLOR"


    // $ANTLR start "ruleCOLOR"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:489:1: ruleCOLOR : ( ( rule__COLOR__Alternatives ) ) ;
    public final void ruleCOLOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:493:2: ( ( ( rule__COLOR__Alternatives ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:494:1: ( ( rule__COLOR__Alternatives ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:494:1: ( ( rule__COLOR__Alternatives ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:495:1: ( rule__COLOR__Alternatives )
            {
             before(grammarAccess.getCOLORAccess().getAlternatives()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:496:1: ( rule__COLOR__Alternatives )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:496:2: rule__COLOR__Alternatives
            {
            pushFollow(FOLLOW_rule__COLOR__Alternatives_in_ruleCOLOR995);
            rule__COLOR__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCOLORAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCOLOR"


    // $ANTLR start "entryRuleFONT_SPEC"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:508:1: entryRuleFONT_SPEC : ruleFONT_SPEC EOF ;
    public final void entryRuleFONT_SPEC() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:509:1: ( ruleFONT_SPEC EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:510:1: ruleFONT_SPEC EOF
            {
             before(grammarAccess.getFONT_SPECRule()); 
            pushFollow(FOLLOW_ruleFONT_SPEC_in_entryRuleFONT_SPEC1022);
            ruleFONT_SPEC();

            state._fsp--;

             after(grammarAccess.getFONT_SPECRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFONT_SPEC1029); 

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
    // $ANTLR end "entryRuleFONT_SPEC"


    // $ANTLR start "ruleFONT_SPEC"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:517:1: ruleFONT_SPEC : ( ruleFONT_STYLE ) ;
    public final void ruleFONT_SPEC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:521:2: ( ( ruleFONT_STYLE ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:522:1: ( ruleFONT_STYLE )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:522:1: ( ruleFONT_STYLE )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:523:1: ruleFONT_STYLE
            {
             before(grammarAccess.getFONT_SPECAccess().getFONT_STYLEParserRuleCall()); 
            pushFollow(FOLLOW_ruleFONT_STYLE_in_ruleFONT_SPEC1055);
            ruleFONT_STYLE();

            state._fsp--;

             after(grammarAccess.getFONT_SPECAccess().getFONT_STYLEParserRuleCall()); 

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
    // $ANTLR end "ruleFONT_SPEC"


    // $ANTLR start "entryRuleFONT_STYLE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:536:1: entryRuleFONT_STYLE : ruleFONT_STYLE EOF ;
    public final void entryRuleFONT_STYLE() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:537:1: ( ruleFONT_STYLE EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:538:1: ruleFONT_STYLE EOF
            {
             before(grammarAccess.getFONT_STYLERule()); 
            pushFollow(FOLLOW_ruleFONT_STYLE_in_entryRuleFONT_STYLE1081);
            ruleFONT_STYLE();

            state._fsp--;

             after(grammarAccess.getFONT_STYLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFONT_STYLE1088); 

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
    // $ANTLR end "entryRuleFONT_STYLE"


    // $ANTLR start "ruleFONT_STYLE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:545:1: ruleFONT_STYLE : ( ( rule__FONT_STYLE__Group__0 ) ) ;
    public final void ruleFONT_STYLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:549:2: ( ( ( rule__FONT_STYLE__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:550:1: ( ( rule__FONT_STYLE__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:550:1: ( ( rule__FONT_STYLE__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:551:1: ( rule__FONT_STYLE__Group__0 )
            {
             before(grammarAccess.getFONT_STYLEAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:552:1: ( rule__FONT_STYLE__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:552:2: rule__FONT_STYLE__Group__0
            {
            pushFollow(FOLLOW_rule__FONT_STYLE__Group__0_in_ruleFONT_STYLE1114);
            rule__FONT_STYLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFONT_STYLEAccess().getGroup()); 

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
    // $ANTLR end "ruleFONT_STYLE"


    // $ANTLR start "entryRuleFontStyleValues"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:564:1: entryRuleFontStyleValues : ruleFontStyleValues EOF ;
    public final void entryRuleFontStyleValues() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:565:1: ( ruleFontStyleValues EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:566:1: ruleFontStyleValues EOF
            {
             before(grammarAccess.getFontStyleValuesRule()); 
            pushFollow(FOLLOW_ruleFontStyleValues_in_entryRuleFontStyleValues1141);
            ruleFontStyleValues();

            state._fsp--;

             after(grammarAccess.getFontStyleValuesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFontStyleValues1148); 

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
    // $ANTLR end "entryRuleFontStyleValues"


    // $ANTLR start "ruleFontStyleValues"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:573:1: ruleFontStyleValues : ( ( rule__FontStyleValues__Alternatives ) ) ;
    public final void ruleFontStyleValues() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:577:2: ( ( ( rule__FontStyleValues__Alternatives ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:578:1: ( ( rule__FontStyleValues__Alternatives ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:578:1: ( ( rule__FontStyleValues__Alternatives ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:579:1: ( rule__FontStyleValues__Alternatives )
            {
             before(grammarAccess.getFontStyleValuesAccess().getAlternatives()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:580:1: ( rule__FontStyleValues__Alternatives )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:580:2: rule__FontStyleValues__Alternatives
            {
            pushFollow(FOLLOW_rule__FontStyleValues__Alternatives_in_ruleFontStyleValues1174);
            rule__FontStyleValues__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFontStyleValuesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFontStyleValues"


    // $ANTLR start "entryRuleCLEAR"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:592:1: entryRuleCLEAR : ruleCLEAR EOF ;
    public final void entryRuleCLEAR() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:593:1: ( ruleCLEAR EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:594:1: ruleCLEAR EOF
            {
             before(grammarAccess.getCLEARRule()); 
            pushFollow(FOLLOW_ruleCLEAR_in_entryRuleCLEAR1201);
            ruleCLEAR();

            state._fsp--;

             after(grammarAccess.getCLEARRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCLEAR1208); 

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
    // $ANTLR end "entryRuleCLEAR"


    // $ANTLR start "ruleCLEAR"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:601:1: ruleCLEAR : ( ( rule__CLEAR__Group__0 ) ) ;
    public final void ruleCLEAR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:605:2: ( ( ( rule__CLEAR__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:606:1: ( ( rule__CLEAR__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:606:1: ( ( rule__CLEAR__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:607:1: ( rule__CLEAR__Group__0 )
            {
             before(grammarAccess.getCLEARAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:608:1: ( rule__CLEAR__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:608:2: rule__CLEAR__Group__0
            {
            pushFollow(FOLLOW_rule__CLEAR__Group__0_in_ruleCLEAR1234);
            rule__CLEAR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCLEARAccess().getGroup()); 

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
    // $ANTLR end "ruleCLEAR"


    // $ANTLR start "entryRuleHOME"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:620:1: entryRuleHOME : ruleHOME EOF ;
    public final void entryRuleHOME() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:621:1: ( ruleHOME EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:622:1: ruleHOME EOF
            {
             before(grammarAccess.getHOMERule()); 
            pushFollow(FOLLOW_ruleHOME_in_entryRuleHOME1261);
            ruleHOME();

            state._fsp--;

             after(grammarAccess.getHOMERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHOME1268); 

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
    // $ANTLR end "entryRuleHOME"


    // $ANTLR start "ruleHOME"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:629:1: ruleHOME : ( ( rule__HOME__Group__0 ) ) ;
    public final void ruleHOME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:633:2: ( ( ( rule__HOME__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:634:1: ( ( rule__HOME__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:634:1: ( ( rule__HOME__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:635:1: ( rule__HOME__Group__0 )
            {
             before(grammarAccess.getHOMEAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:636:1: ( rule__HOME__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:636:2: rule__HOME__Group__0
            {
            pushFollow(FOLLOW_rule__HOME__Group__0_in_ruleHOME1294);
            rule__HOME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHOMEAccess().getGroup()); 

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
    // $ANTLR end "ruleHOME"


    // $ANTLR start "entryRuleDRAW_STRING"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:648:1: entryRuleDRAW_STRING : ruleDRAW_STRING EOF ;
    public final void entryRuleDRAW_STRING() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:649:1: ( ruleDRAW_STRING EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:650:1: ruleDRAW_STRING EOF
            {
             before(grammarAccess.getDRAW_STRINGRule()); 
            pushFollow(FOLLOW_ruleDRAW_STRING_in_entryRuleDRAW_STRING1321);
            ruleDRAW_STRING();

            state._fsp--;

             after(grammarAccess.getDRAW_STRINGRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDRAW_STRING1328); 

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
    // $ANTLR end "entryRuleDRAW_STRING"


    // $ANTLR start "ruleDRAW_STRING"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:657:1: ruleDRAW_STRING : ( ( rule__DRAW_STRING__Group__0 ) ) ;
    public final void ruleDRAW_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:661:2: ( ( ( rule__DRAW_STRING__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:662:1: ( ( rule__DRAW_STRING__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:662:1: ( ( rule__DRAW_STRING__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:663:1: ( rule__DRAW_STRING__Group__0 )
            {
             before(grammarAccess.getDRAW_STRINGAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:664:1: ( rule__DRAW_STRING__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:664:2: rule__DRAW_STRING__Group__0
            {
            pushFollow(FOLLOW_rule__DRAW_STRING__Group__0_in_ruleDRAW_STRING1354);
            rule__DRAW_STRING__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDRAW_STRINGAccess().getGroup()); 

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
    // $ANTLR end "ruleDRAW_STRING"


    // $ANTLR start "entryRuleMAKE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:678:1: entryRuleMAKE : ruleMAKE EOF ;
    public final void entryRuleMAKE() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:679:1: ( ruleMAKE EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:680:1: ruleMAKE EOF
            {
             before(grammarAccess.getMAKERule()); 
            pushFollow(FOLLOW_ruleMAKE_in_entryRuleMAKE1383);
            ruleMAKE();

            state._fsp--;

             after(grammarAccess.getMAKERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMAKE1390); 

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
    // $ANTLR end "entryRuleMAKE"


    // $ANTLR start "ruleMAKE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:687:1: ruleMAKE : ( ( rule__MAKE__Group__0 ) ) ;
    public final void ruleMAKE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:691:2: ( ( ( rule__MAKE__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:692:1: ( ( rule__MAKE__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:692:1: ( ( rule__MAKE__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:693:1: ( rule__MAKE__Group__0 )
            {
             before(grammarAccess.getMAKEAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:694:1: ( rule__MAKE__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:694:2: rule__MAKE__Group__0
            {
            pushFollow(FOLLOW_rule__MAKE__Group__0_in_ruleMAKE1416);
            rule__MAKE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMAKEAccess().getGroup()); 

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
    // $ANTLR end "ruleMAKE"


    // $ANTLR start "entryRuleVARIABLE_REF"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:706:1: entryRuleVARIABLE_REF : ruleVARIABLE_REF EOF ;
    public final void entryRuleVARIABLE_REF() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:707:1: ( ruleVARIABLE_REF EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:708:1: ruleVARIABLE_REF EOF
            {
             before(grammarAccess.getVARIABLE_REFRule()); 
            pushFollow(FOLLOW_ruleVARIABLE_REF_in_entryRuleVARIABLE_REF1443);
            ruleVARIABLE_REF();

            state._fsp--;

             after(grammarAccess.getVARIABLE_REFRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVARIABLE_REF1450); 

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
    // $ANTLR end "entryRuleVARIABLE_REF"


    // $ANTLR start "ruleVARIABLE_REF"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:715:1: ruleVARIABLE_REF : ( ( rule__VARIABLE_REF__ToVarAssignment ) ) ;
    public final void ruleVARIABLE_REF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:719:2: ( ( ( rule__VARIABLE_REF__ToVarAssignment ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:720:1: ( ( rule__VARIABLE_REF__ToVarAssignment ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:720:1: ( ( rule__VARIABLE_REF__ToVarAssignment ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:721:1: ( rule__VARIABLE_REF__ToVarAssignment )
            {
             before(grammarAccess.getVARIABLE_REFAccess().getToVarAssignment()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:722:1: ( rule__VARIABLE_REF__ToVarAssignment )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:722:2: rule__VARIABLE_REF__ToVarAssignment
            {
            pushFollow(FOLLOW_rule__VARIABLE_REF__ToVarAssignment_in_ruleVARIABLE_REF1476);
            rule__VARIABLE_REF__ToVarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVARIABLE_REFAccess().getToVarAssignment()); 

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
    // $ANTLR end "ruleVARIABLE_REF"


    // $ANTLR start "entryRuleEXPRESSION"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:734:1: entryRuleEXPRESSION : ruleEXPRESSION EOF ;
    public final void entryRuleEXPRESSION() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:735:1: ( ruleEXPRESSION EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:736:1: ruleEXPRESSION EOF
            {
             before(grammarAccess.getEXPRESSIONRule()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_entryRuleEXPRESSION1503);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getEXPRESSIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRESSION1510); 

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
    // $ANTLR end "entryRuleEXPRESSION"


    // $ANTLR start "ruleEXPRESSION"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:743:1: ruleEXPRESSION : ( ( rule__EXPRESSION__Alternatives ) ) ;
    public final void ruleEXPRESSION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:747:2: ( ( ( rule__EXPRESSION__Alternatives ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:748:1: ( ( rule__EXPRESSION__Alternatives ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:748:1: ( ( rule__EXPRESSION__Alternatives ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:749:1: ( rule__EXPRESSION__Alternatives )
            {
             before(grammarAccess.getEXPRESSIONAccess().getAlternatives()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:750:1: ( rule__EXPRESSION__Alternatives )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:750:2: rule__EXPRESSION__Alternatives
            {
            pushFollow(FOLLOW_rule__EXPRESSION__Alternatives_in_ruleEXPRESSION1536);
            rule__EXPRESSION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEXPRESSIONAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEXPRESSION"


    // $ANTLR start "entryRuleVALUE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:762:1: entryRuleVALUE : ruleVALUE EOF ;
    public final void entryRuleVALUE() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:763:1: ( ruleVALUE EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:764:1: ruleVALUE EOF
            {
             before(grammarAccess.getVALUERule()); 
            pushFollow(FOLLOW_ruleVALUE_in_entryRuleVALUE1563);
            ruleVALUE();

            state._fsp--;

             after(grammarAccess.getVALUERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVALUE1570); 

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
    // $ANTLR end "entryRuleVALUE"


    // $ANTLR start "ruleVALUE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:771:1: ruleVALUE : ( ( rule__VALUE__ValAssignment ) ) ;
    public final void ruleVALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:775:2: ( ( ( rule__VALUE__ValAssignment ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:776:1: ( ( rule__VALUE__ValAssignment ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:776:1: ( ( rule__VALUE__ValAssignment ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:777:1: ( rule__VALUE__ValAssignment )
            {
             before(grammarAccess.getVALUEAccess().getValAssignment()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:778:1: ( rule__VALUE__ValAssignment )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:778:2: rule__VALUE__ValAssignment
            {
            pushFollow(FOLLOW_rule__VALUE__ValAssignment_in_ruleVALUE1596);
            rule__VALUE__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVALUEAccess().getValAssignment()); 

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
    // $ANTLR end "ruleVALUE"


    // $ANTLR start "entryRuleCONTENT"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:790:1: entryRuleCONTENT : ruleCONTENT EOF ;
    public final void entryRuleCONTENT() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:791:1: ( ruleCONTENT EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:792:1: ruleCONTENT EOF
            {
             before(grammarAccess.getCONTENTRule()); 
            pushFollow(FOLLOW_ruleCONTENT_in_entryRuleCONTENT1623);
            ruleCONTENT();

            state._fsp--;

             after(grammarAccess.getCONTENTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCONTENT1630); 

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
    // $ANTLR end "entryRuleCONTENT"


    // $ANTLR start "ruleCONTENT"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:799:1: ruleCONTENT : ( ( rule__CONTENT__Group__0 ) ) ;
    public final void ruleCONTENT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:803:2: ( ( ( rule__CONTENT__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:804:1: ( ( rule__CONTENT__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:804:1: ( ( rule__CONTENT__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:805:1: ( rule__CONTENT__Group__0 )
            {
             before(grammarAccess.getCONTENTAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:806:1: ( rule__CONTENT__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:806:2: rule__CONTENT__Group__0
            {
            pushFollow(FOLLOW_rule__CONTENT__Group__0_in_ruleCONTENT1656);
            rule__CONTENT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCONTENTAccess().getGroup()); 

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
    // $ANTLR end "ruleCONTENT"


    // $ANTLR start "entryRuleOPERATION"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:818:1: entryRuleOPERATION : ruleOPERATION EOF ;
    public final void entryRuleOPERATION() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:819:1: ( ruleOPERATION EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:820:1: ruleOPERATION EOF
            {
             before(grammarAccess.getOPERATIONRule()); 
            pushFollow(FOLLOW_ruleOPERATION_in_entryRuleOPERATION1683);
            ruleOPERATION();

            state._fsp--;

             after(grammarAccess.getOPERATIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOPERATION1690); 

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
    // $ANTLR end "entryRuleOPERATION"


    // $ANTLR start "ruleOPERATION"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:827:1: ruleOPERATION : ( ( rule__OPERATION__Alternatives ) ) ;
    public final void ruleOPERATION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:831:2: ( ( ( rule__OPERATION__Alternatives ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:832:1: ( ( rule__OPERATION__Alternatives ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:832:1: ( ( rule__OPERATION__Alternatives ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:833:1: ( rule__OPERATION__Alternatives )
            {
             before(grammarAccess.getOPERATIONAccess().getAlternatives()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:834:1: ( rule__OPERATION__Alternatives )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:834:2: rule__OPERATION__Alternatives
            {
            pushFollow(FOLLOW_rule__OPERATION__Alternatives_in_ruleOPERATION1716);
            rule__OPERATION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOPERATIONAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOPERATION"


    // $ANTLR start "entryRuleSUM"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:846:1: entryRuleSUM : ruleSUM EOF ;
    public final void entryRuleSUM() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:847:1: ( ruleSUM EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:848:1: ruleSUM EOF
            {
             before(grammarAccess.getSUMRule()); 
            pushFollow(FOLLOW_ruleSUM_in_entryRuleSUM1743);
            ruleSUM();

            state._fsp--;

             after(grammarAccess.getSUMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSUM1750); 

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
    // $ANTLR end "entryRuleSUM"


    // $ANTLR start "ruleSUM"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:855:1: ruleSUM : ( ( rule__SUM__Group__0 ) ) ;
    public final void ruleSUM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:859:2: ( ( ( rule__SUM__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:860:1: ( ( rule__SUM__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:860:1: ( ( rule__SUM__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:861:1: ( rule__SUM__Group__0 )
            {
             before(grammarAccess.getSUMAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:862:1: ( rule__SUM__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:862:2: rule__SUM__Group__0
            {
            pushFollow(FOLLOW_rule__SUM__Group__0_in_ruleSUM1776);
            rule__SUM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSUMAccess().getGroup()); 

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
    // $ANTLR end "ruleSUM"


    // $ANTLR start "entryRuleSUBTRACT"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:874:1: entryRuleSUBTRACT : ruleSUBTRACT EOF ;
    public final void entryRuleSUBTRACT() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:875:1: ( ruleSUBTRACT EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:876:1: ruleSUBTRACT EOF
            {
             before(grammarAccess.getSUBTRACTRule()); 
            pushFollow(FOLLOW_ruleSUBTRACT_in_entryRuleSUBTRACT1803);
            ruleSUBTRACT();

            state._fsp--;

             after(grammarAccess.getSUBTRACTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSUBTRACT1810); 

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
    // $ANTLR end "entryRuleSUBTRACT"


    // $ANTLR start "ruleSUBTRACT"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:883:1: ruleSUBTRACT : ( ( rule__SUBTRACT__Group__0 ) ) ;
    public final void ruleSUBTRACT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:887:2: ( ( ( rule__SUBTRACT__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:888:1: ( ( rule__SUBTRACT__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:888:1: ( ( rule__SUBTRACT__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:889:1: ( rule__SUBTRACT__Group__0 )
            {
             before(grammarAccess.getSUBTRACTAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:890:1: ( rule__SUBTRACT__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:890:2: rule__SUBTRACT__Group__0
            {
            pushFollow(FOLLOW_rule__SUBTRACT__Group__0_in_ruleSUBTRACT1836);
            rule__SUBTRACT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSUBTRACTAccess().getGroup()); 

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
    // $ANTLR end "ruleSUBTRACT"


    // $ANTLR start "entryRuleMULTIPLY"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:902:1: entryRuleMULTIPLY : ruleMULTIPLY EOF ;
    public final void entryRuleMULTIPLY() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:903:1: ( ruleMULTIPLY EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:904:1: ruleMULTIPLY EOF
            {
             before(grammarAccess.getMULTIPLYRule()); 
            pushFollow(FOLLOW_ruleMULTIPLY_in_entryRuleMULTIPLY1863);
            ruleMULTIPLY();

            state._fsp--;

             after(grammarAccess.getMULTIPLYRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMULTIPLY1870); 

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
    // $ANTLR end "entryRuleMULTIPLY"


    // $ANTLR start "ruleMULTIPLY"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:911:1: ruleMULTIPLY : ( ( rule__MULTIPLY__Group__0 ) ) ;
    public final void ruleMULTIPLY() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:915:2: ( ( ( rule__MULTIPLY__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:916:1: ( ( rule__MULTIPLY__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:916:1: ( ( rule__MULTIPLY__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:917:1: ( rule__MULTIPLY__Group__0 )
            {
             before(grammarAccess.getMULTIPLYAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:918:1: ( rule__MULTIPLY__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:918:2: rule__MULTIPLY__Group__0
            {
            pushFollow(FOLLOW_rule__MULTIPLY__Group__0_in_ruleMULTIPLY1896);
            rule__MULTIPLY__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMULTIPLYAccess().getGroup()); 

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
    // $ANTLR end "ruleMULTIPLY"


    // $ANTLR start "entryRuleDIVIDE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:930:1: entryRuleDIVIDE : ruleDIVIDE EOF ;
    public final void entryRuleDIVIDE() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:931:1: ( ruleDIVIDE EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:932:1: ruleDIVIDE EOF
            {
             before(grammarAccess.getDIVIDERule()); 
            pushFollow(FOLLOW_ruleDIVIDE_in_entryRuleDIVIDE1923);
            ruleDIVIDE();

            state._fsp--;

             after(grammarAccess.getDIVIDERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDIVIDE1930); 

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
    // $ANTLR end "entryRuleDIVIDE"


    // $ANTLR start "ruleDIVIDE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:939:1: ruleDIVIDE : ( ( rule__DIVIDE__Group__0 ) ) ;
    public final void ruleDIVIDE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:943:2: ( ( ( rule__DIVIDE__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:944:1: ( ( rule__DIVIDE__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:944:1: ( ( rule__DIVIDE__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:945:1: ( rule__DIVIDE__Group__0 )
            {
             before(grammarAccess.getDIVIDEAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:946:1: ( rule__DIVIDE__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:946:2: rule__DIVIDE__Group__0
            {
            pushFollow(FOLLOW_rule__DIVIDE__Group__0_in_ruleDIVIDE1956);
            rule__DIVIDE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDIVIDEAccess().getGroup()); 

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
    // $ANTLR end "ruleDIVIDE"


    // $ANTLR start "entryRuleCONTROL_SENTENCES"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:958:1: entryRuleCONTROL_SENTENCES : ruleCONTROL_SENTENCES EOF ;
    public final void entryRuleCONTROL_SENTENCES() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:959:1: ( ruleCONTROL_SENTENCES EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:960:1: ruleCONTROL_SENTENCES EOF
            {
             before(grammarAccess.getCONTROL_SENTENCESRule()); 
            pushFollow(FOLLOW_ruleCONTROL_SENTENCES_in_entryRuleCONTROL_SENTENCES1983);
            ruleCONTROL_SENTENCES();

            state._fsp--;

             after(grammarAccess.getCONTROL_SENTENCESRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCONTROL_SENTENCES1990); 

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
    // $ANTLR end "entryRuleCONTROL_SENTENCES"


    // $ANTLR start "ruleCONTROL_SENTENCES"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:967:1: ruleCONTROL_SENTENCES : ( ( rule__CONTROL_SENTENCES__Alternatives ) ) ;
    public final void ruleCONTROL_SENTENCES() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:971:2: ( ( ( rule__CONTROL_SENTENCES__Alternatives ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:972:1: ( ( rule__CONTROL_SENTENCES__Alternatives ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:972:1: ( ( rule__CONTROL_SENTENCES__Alternatives ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:973:1: ( rule__CONTROL_SENTENCES__Alternatives )
            {
             before(grammarAccess.getCONTROL_SENTENCESAccess().getAlternatives()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:974:1: ( rule__CONTROL_SENTENCES__Alternatives )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:974:2: rule__CONTROL_SENTENCES__Alternatives
            {
            pushFollow(FOLLOW_rule__CONTROL_SENTENCES__Alternatives_in_ruleCONTROL_SENTENCES2016);
            rule__CONTROL_SENTENCES__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCONTROL_SENTENCESAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCONTROL_SENTENCES"


    // $ANTLR start "entryRuleREPEAT"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:986:1: entryRuleREPEAT : ruleREPEAT EOF ;
    public final void entryRuleREPEAT() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:987:1: ( ruleREPEAT EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:988:1: ruleREPEAT EOF
            {
             before(grammarAccess.getREPEATRule()); 
            pushFollow(FOLLOW_ruleREPEAT_in_entryRuleREPEAT2043);
            ruleREPEAT();

            state._fsp--;

             after(grammarAccess.getREPEATRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREPEAT2050); 

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
    // $ANTLR end "entryRuleREPEAT"


    // $ANTLR start "ruleREPEAT"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:995:1: ruleREPEAT : ( ( rule__REPEAT__Group__0 ) ) ;
    public final void ruleREPEAT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:999:2: ( ( ( rule__REPEAT__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1000:1: ( ( rule__REPEAT__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1000:1: ( ( rule__REPEAT__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1001:1: ( rule__REPEAT__Group__0 )
            {
             before(grammarAccess.getREPEATAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1002:1: ( rule__REPEAT__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1002:2: rule__REPEAT__Group__0
            {
            pushFollow(FOLLOW_rule__REPEAT__Group__0_in_ruleREPEAT2076);
            rule__REPEAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREPEATAccess().getGroup()); 

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
    // $ANTLR end "ruleREPEAT"


    // $ANTLR start "entryRuleTO"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1014:1: entryRuleTO : ruleTO EOF ;
    public final void entryRuleTO() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1015:1: ( ruleTO EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1016:1: ruleTO EOF
            {
             before(grammarAccess.getTORule()); 
            pushFollow(FOLLOW_ruleTO_in_entryRuleTO2103);
            ruleTO();

            state._fsp--;

             after(grammarAccess.getTORule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTO2110); 

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
    // $ANTLR end "entryRuleTO"


    // $ANTLR start "ruleTO"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1023:1: ruleTO : ( ( rule__TO__Group__0 ) ) ;
    public final void ruleTO() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1027:2: ( ( ( rule__TO__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1028:1: ( ( rule__TO__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1028:1: ( ( rule__TO__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1029:1: ( rule__TO__Group__0 )
            {
             before(grammarAccess.getTOAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1030:1: ( rule__TO__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1030:2: rule__TO__Group__0
            {
            pushFollow(FOLLOW_rule__TO__Group__0_in_ruleTO2136);
            rule__TO__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTOAccess().getGroup()); 

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
    // $ANTLR end "ruleTO"


    // $ANTLR start "entryRulePARAM"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1042:1: entryRulePARAM : rulePARAM EOF ;
    public final void entryRulePARAM() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1043:1: ( rulePARAM EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1044:1: rulePARAM EOF
            {
             before(grammarAccess.getPARAMRule()); 
            pushFollow(FOLLOW_rulePARAM_in_entryRulePARAM2163);
            rulePARAM();

            state._fsp--;

             after(grammarAccess.getPARAMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePARAM2170); 

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
    // $ANTLR end "entryRulePARAM"


    // $ANTLR start "rulePARAM"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1051:1: rulePARAM : ( ( rule__PARAM__Group__0 ) ) ;
    public final void rulePARAM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1055:2: ( ( ( rule__PARAM__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1056:1: ( ( rule__PARAM__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1056:1: ( ( rule__PARAM__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1057:1: ( rule__PARAM__Group__0 )
            {
             before(grammarAccess.getPARAMAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1058:1: ( rule__PARAM__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1058:2: rule__PARAM__Group__0
            {
            pushFollow(FOLLOW_rule__PARAM__Group__0_in_rulePARAM2196);
            rule__PARAM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPARAMAccess().getGroup()); 

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
    // $ANTLR end "rulePARAM"


    // $ANTLR start "entryRulePROCEDURE_CALL"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1070:1: entryRulePROCEDURE_CALL : rulePROCEDURE_CALL EOF ;
    public final void entryRulePROCEDURE_CALL() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1071:1: ( rulePROCEDURE_CALL EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1072:1: rulePROCEDURE_CALL EOF
            {
             before(grammarAccess.getPROCEDURE_CALLRule()); 
            pushFollow(FOLLOW_rulePROCEDURE_CALL_in_entryRulePROCEDURE_CALL2223);
            rulePROCEDURE_CALL();

            state._fsp--;

             after(grammarAccess.getPROCEDURE_CALLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePROCEDURE_CALL2230); 

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
    // $ANTLR end "entryRulePROCEDURE_CALL"


    // $ANTLR start "rulePROCEDURE_CALL"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1079:1: rulePROCEDURE_CALL : ( ( rule__PROCEDURE_CALL__Group__0 ) ) ;
    public final void rulePROCEDURE_CALL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1083:2: ( ( ( rule__PROCEDURE_CALL__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1084:1: ( ( rule__PROCEDURE_CALL__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1084:1: ( ( rule__PROCEDURE_CALL__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1085:1: ( rule__PROCEDURE_CALL__Group__0 )
            {
             before(grammarAccess.getPROCEDURE_CALLAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1086:1: ( rule__PROCEDURE_CALL__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1086:2: rule__PROCEDURE_CALL__Group__0
            {
            pushFollow(FOLLOW_rule__PROCEDURE_CALL__Group__0_in_rulePROCEDURE_CALL2256);
            rule__PROCEDURE_CALL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPROCEDURE_CALLAccess().getGroup()); 

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
    // $ANTLR end "rulePROCEDURE_CALL"


    // $ANTLR start "entryRuleIF_SENTENCE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1098:1: entryRuleIF_SENTENCE : ruleIF_SENTENCE EOF ;
    public final void entryRuleIF_SENTENCE() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1099:1: ( ruleIF_SENTENCE EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1100:1: ruleIF_SENTENCE EOF
            {
             before(grammarAccess.getIF_SENTENCERule()); 
            pushFollow(FOLLOW_ruleIF_SENTENCE_in_entryRuleIF_SENTENCE2283);
            ruleIF_SENTENCE();

            state._fsp--;

             after(grammarAccess.getIF_SENTENCERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIF_SENTENCE2290); 

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
    // $ANTLR end "entryRuleIF_SENTENCE"


    // $ANTLR start "ruleIF_SENTENCE"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1107:1: ruleIF_SENTENCE : ( ( rule__IF_SENTENCE__Group__0 ) ) ;
    public final void ruleIF_SENTENCE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1111:2: ( ( ( rule__IF_SENTENCE__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1112:1: ( ( rule__IF_SENTENCE__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1112:1: ( ( rule__IF_SENTENCE__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1113:1: ( rule__IF_SENTENCE__Group__0 )
            {
             before(grammarAccess.getIF_SENTENCEAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1114:1: ( rule__IF_SENTENCE__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1114:2: rule__IF_SENTENCE__Group__0
            {
            pushFollow(FOLLOW_rule__IF_SENTENCE__Group__0_in_ruleIF_SENTENCE2316);
            rule__IF_SENTENCE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIF_SENTENCEAccess().getGroup()); 

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
    // $ANTLR end "ruleIF_SENTENCE"


    // $ANTLR start "entryRuleBOOLEAN_EXPRESSION"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1126:1: entryRuleBOOLEAN_EXPRESSION : ruleBOOLEAN_EXPRESSION EOF ;
    public final void entryRuleBOOLEAN_EXPRESSION() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1127:1: ( ruleBOOLEAN_EXPRESSION EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1128:1: ruleBOOLEAN_EXPRESSION EOF
            {
             before(grammarAccess.getBOOLEAN_EXPRESSIONRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_EXPRESSION_in_entryRuleBOOLEAN_EXPRESSION2343);
            ruleBOOLEAN_EXPRESSION();

            state._fsp--;

             after(grammarAccess.getBOOLEAN_EXPRESSIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN_EXPRESSION2350); 

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
    // $ANTLR end "entryRuleBOOLEAN_EXPRESSION"


    // $ANTLR start "ruleBOOLEAN_EXPRESSION"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1135:1: ruleBOOLEAN_EXPRESSION : ( ( rule__BOOLEAN_EXPRESSION__Alternatives ) ) ;
    public final void ruleBOOLEAN_EXPRESSION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1139:2: ( ( ( rule__BOOLEAN_EXPRESSION__Alternatives ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1140:1: ( ( rule__BOOLEAN_EXPRESSION__Alternatives ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1140:1: ( ( rule__BOOLEAN_EXPRESSION__Alternatives ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1141:1: ( rule__BOOLEAN_EXPRESSION__Alternatives )
            {
             before(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getAlternatives()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1142:1: ( rule__BOOLEAN_EXPRESSION__Alternatives )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1142:2: rule__BOOLEAN_EXPRESSION__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOLEAN_EXPRESSION__Alternatives_in_ruleBOOLEAN_EXPRESSION2376);
            rule__BOOLEAN_EXPRESSION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBOOLEAN_EXPRESSION"


    // $ANTLR start "entryRuleEQUALS"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1154:1: entryRuleEQUALS : ruleEQUALS EOF ;
    public final void entryRuleEQUALS() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1155:1: ( ruleEQUALS EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1156:1: ruleEQUALS EOF
            {
             before(grammarAccess.getEQUALSRule()); 
            pushFollow(FOLLOW_ruleEQUALS_in_entryRuleEQUALS2403);
            ruleEQUALS();

            state._fsp--;

             after(grammarAccess.getEQUALSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEQUALS2410); 

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
    // $ANTLR end "entryRuleEQUALS"


    // $ANTLR start "ruleEQUALS"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1163:1: ruleEQUALS : ( ( rule__EQUALS__Group__0 ) ) ;
    public final void ruleEQUALS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1167:2: ( ( ( rule__EQUALS__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1168:1: ( ( rule__EQUALS__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1168:1: ( ( rule__EQUALS__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1169:1: ( rule__EQUALS__Group__0 )
            {
             before(grammarAccess.getEQUALSAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1170:1: ( rule__EQUALS__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1170:2: rule__EQUALS__Group__0
            {
            pushFollow(FOLLOW_rule__EQUALS__Group__0_in_ruleEQUALS2436);
            rule__EQUALS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEQUALSAccess().getGroup()); 

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
    // $ANTLR end "ruleEQUALS"


    // $ANTLR start "entryRuleGREATER_THAN"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1182:1: entryRuleGREATER_THAN : ruleGREATER_THAN EOF ;
    public final void entryRuleGREATER_THAN() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1183:1: ( ruleGREATER_THAN EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1184:1: ruleGREATER_THAN EOF
            {
             before(grammarAccess.getGREATER_THANRule()); 
            pushFollow(FOLLOW_ruleGREATER_THAN_in_entryRuleGREATER_THAN2463);
            ruleGREATER_THAN();

            state._fsp--;

             after(grammarAccess.getGREATER_THANRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGREATER_THAN2470); 

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
    // $ANTLR end "entryRuleGREATER_THAN"


    // $ANTLR start "ruleGREATER_THAN"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1191:1: ruleGREATER_THAN : ( ( rule__GREATER_THAN__Group__0 ) ) ;
    public final void ruleGREATER_THAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1195:2: ( ( ( rule__GREATER_THAN__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1196:1: ( ( rule__GREATER_THAN__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1196:1: ( ( rule__GREATER_THAN__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1197:1: ( rule__GREATER_THAN__Group__0 )
            {
             before(grammarAccess.getGREATER_THANAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1198:1: ( rule__GREATER_THAN__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1198:2: rule__GREATER_THAN__Group__0
            {
            pushFollow(FOLLOW_rule__GREATER_THAN__Group__0_in_ruleGREATER_THAN2496);
            rule__GREATER_THAN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGREATER_THANAccess().getGroup()); 

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
    // $ANTLR end "ruleGREATER_THAN"


    // $ANTLR start "entryRuleLESSER_THAN"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1210:1: entryRuleLESSER_THAN : ruleLESSER_THAN EOF ;
    public final void entryRuleLESSER_THAN() throws RecognitionException {
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1211:1: ( ruleLESSER_THAN EOF )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1212:1: ruleLESSER_THAN EOF
            {
             before(grammarAccess.getLESSER_THANRule()); 
            pushFollow(FOLLOW_ruleLESSER_THAN_in_entryRuleLESSER_THAN2523);
            ruleLESSER_THAN();

            state._fsp--;

             after(grammarAccess.getLESSER_THANRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLESSER_THAN2530); 

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
    // $ANTLR end "entryRuleLESSER_THAN"


    // $ANTLR start "ruleLESSER_THAN"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1219:1: ruleLESSER_THAN : ( ( rule__LESSER_THAN__Group__0 ) ) ;
    public final void ruleLESSER_THAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1223:2: ( ( ( rule__LESSER_THAN__Group__0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1224:1: ( ( rule__LESSER_THAN__Group__0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1224:1: ( ( rule__LESSER_THAN__Group__0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1225:1: ( rule__LESSER_THAN__Group__0 )
            {
             before(grammarAccess.getLESSER_THANAccess().getGroup()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1226:1: ( rule__LESSER_THAN__Group__0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1226:2: rule__LESSER_THAN__Group__0
            {
            pushFollow(FOLLOW_rule__LESSER_THAN__Group__0_in_ruleLESSER_THAN2556);
            rule__LESSER_THAN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLESSER_THANAccess().getGroup()); 

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
    // $ANTLR end "ruleLESSER_THAN"


    // $ANTLR start "rule__SENTENCE__Alternatives"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1238:1: rule__SENTENCE__Alternatives : ( ( ruleMAKE ) | ( ruleCONTENT ) | ( rulePROCEDURE_CALL ) | ( ruleOPERATION ) | ( ruleCONTROL_SENTENCES ) | ( ruleMOVE ) | ( ruleDRAWING_SENTENCE ) );
    public final void rule__SENTENCE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1242:1: ( ( ruleMAKE ) | ( ruleCONTENT ) | ( rulePROCEDURE_CALL ) | ( ruleOPERATION ) | ( ruleCONTROL_SENTENCES ) | ( ruleMOVE ) | ( ruleDRAWING_SENTENCE ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt2=1;
                }
                break;
            case 43:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            case 44:
            case 46:
            case 48:
            case 50:
                {
                alt2=4;
                }
                break;
            case 52:
            case 54:
            case 57:
                {
                alt2=5;
                }
                break;
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt2=6;
                }
                break;
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 38:
            case 39:
            case 40:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1243:1: ( ruleMAKE )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1243:1: ( ruleMAKE )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1244:1: ruleMAKE
                    {
                     before(grammarAccess.getSENTENCEAccess().getMAKEParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMAKE_in_rule__SENTENCE__Alternatives2592);
                    ruleMAKE();

                    state._fsp--;

                     after(grammarAccess.getSENTENCEAccess().getMAKEParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1249:6: ( ruleCONTENT )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1249:6: ( ruleCONTENT )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1250:1: ruleCONTENT
                    {
                     before(grammarAccess.getSENTENCEAccess().getCONTENTParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCONTENT_in_rule__SENTENCE__Alternatives2609);
                    ruleCONTENT();

                    state._fsp--;

                     after(grammarAccess.getSENTENCEAccess().getCONTENTParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1255:6: ( rulePROCEDURE_CALL )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1255:6: ( rulePROCEDURE_CALL )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1256:1: rulePROCEDURE_CALL
                    {
                     before(grammarAccess.getSENTENCEAccess().getPROCEDURE_CALLParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePROCEDURE_CALL_in_rule__SENTENCE__Alternatives2626);
                    rulePROCEDURE_CALL();

                    state._fsp--;

                     after(grammarAccess.getSENTENCEAccess().getPROCEDURE_CALLParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1261:6: ( ruleOPERATION )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1261:6: ( ruleOPERATION )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1262:1: ruleOPERATION
                    {
                     before(grammarAccess.getSENTENCEAccess().getOPERATIONParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleOPERATION_in_rule__SENTENCE__Alternatives2643);
                    ruleOPERATION();

                    state._fsp--;

                     after(grammarAccess.getSENTENCEAccess().getOPERATIONParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1267:6: ( ruleCONTROL_SENTENCES )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1267:6: ( ruleCONTROL_SENTENCES )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1268:1: ruleCONTROL_SENTENCES
                    {
                     before(grammarAccess.getSENTENCEAccess().getCONTROL_SENTENCESParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCONTROL_SENTENCES_in_rule__SENTENCE__Alternatives2660);
                    ruleCONTROL_SENTENCES();

                    state._fsp--;

                     after(grammarAccess.getSENTENCEAccess().getCONTROL_SENTENCESParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1273:6: ( ruleMOVE )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1273:6: ( ruleMOVE )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1274:1: ruleMOVE
                    {
                     before(grammarAccess.getSENTENCEAccess().getMOVEParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleMOVE_in_rule__SENTENCE__Alternatives2677);
                    ruleMOVE();

                    state._fsp--;

                     after(grammarAccess.getSENTENCEAccess().getMOVEParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1279:6: ( ruleDRAWING_SENTENCE )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1279:6: ( ruleDRAWING_SENTENCE )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1280:1: ruleDRAWING_SENTENCE
                    {
                     before(grammarAccess.getSENTENCEAccess().getDRAWING_SENTENCEParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleDRAWING_SENTENCE_in_rule__SENTENCE__Alternatives2694);
                    ruleDRAWING_SENTENCE();

                    state._fsp--;

                     after(grammarAccess.getSENTENCEAccess().getDRAWING_SENTENCEParserRuleCall_6()); 

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
    // $ANTLR end "rule__SENTENCE__Alternatives"


    // $ANTLR start "rule__MOVE__Alternatives"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1290:1: rule__MOVE__Alternatives : ( ( ruleFORWARD ) | ( ruleLEFT ) | ( ruleRIGHT ) | ( ruleSET_X ) | ( ruleSET_Y ) );
    public final void rule__MOVE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1294:1: ( ( ruleFORWARD ) | ( ruleLEFT ) | ( ruleRIGHT ) | ( ruleSET_X ) | ( ruleSET_Y ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            case 28:
                {
                alt3=4;
                }
                break;
            case 29:
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
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1295:1: ( ruleFORWARD )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1295:1: ( ruleFORWARD )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1296:1: ruleFORWARD
                    {
                     before(grammarAccess.getMOVEAccess().getFORWARDParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFORWARD_in_rule__MOVE__Alternatives2726);
                    ruleFORWARD();

                    state._fsp--;

                     after(grammarAccess.getMOVEAccess().getFORWARDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1301:6: ( ruleLEFT )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1301:6: ( ruleLEFT )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1302:1: ruleLEFT
                    {
                     before(grammarAccess.getMOVEAccess().getLEFTParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLEFT_in_rule__MOVE__Alternatives2743);
                    ruleLEFT();

                    state._fsp--;

                     after(grammarAccess.getMOVEAccess().getLEFTParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1307:6: ( ruleRIGHT )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1307:6: ( ruleRIGHT )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1308:1: ruleRIGHT
                    {
                     before(grammarAccess.getMOVEAccess().getRIGHTParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRIGHT_in_rule__MOVE__Alternatives2760);
                    ruleRIGHT();

                    state._fsp--;

                     after(grammarAccess.getMOVEAccess().getRIGHTParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1313:6: ( ruleSET_X )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1313:6: ( ruleSET_X )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1314:1: ruleSET_X
                    {
                     before(grammarAccess.getMOVEAccess().getSET_XParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSET_X_in_rule__MOVE__Alternatives2777);
                    ruleSET_X();

                    state._fsp--;

                     after(grammarAccess.getMOVEAccess().getSET_XParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1319:6: ( ruleSET_Y )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1319:6: ( ruleSET_Y )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1320:1: ruleSET_Y
                    {
                     before(grammarAccess.getMOVEAccess().getSET_YParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleSET_Y_in_rule__MOVE__Alternatives2794);
                    ruleSET_Y();

                    state._fsp--;

                     after(grammarAccess.getMOVEAccess().getSET_YParserRuleCall_4()); 

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
    // $ANTLR end "rule__MOVE__Alternatives"


    // $ANTLR start "rule__DRAWING_SENTENCE__Alternatives"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1330:1: rule__DRAWING_SENTENCE__Alternatives : ( ( rulePENDOWN ) | ( rulePENUP ) | ( ruleCLEAR ) | ( ruleHOME ) | ( ruleCOLOREABLE ) | ( ruleFONT_SPEC ) | ( ruleDRAW_STRING ) );
    public final void rule__DRAWING_SENTENCE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1334:1: ( ( rulePENDOWN ) | ( rulePENUP ) | ( ruleCLEAR ) | ( ruleHOME ) | ( ruleCOLOREABLE ) | ( ruleFONT_SPEC ) | ( ruleDRAW_STRING ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 31:
                {
                alt4=2;
                }
                break;
            case 38:
                {
                alt4=3;
                }
                break;
            case 39:
                {
                alt4=4;
                }
                break;
            case 32:
            case 33:
                {
                alt4=5;
                }
                break;
            case 34:
                {
                alt4=6;
                }
                break;
            case 40:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1335:1: ( rulePENDOWN )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1335:1: ( rulePENDOWN )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1336:1: rulePENDOWN
                    {
                     before(grammarAccess.getDRAWING_SENTENCEAccess().getPENDOWNParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePENDOWN_in_rule__DRAWING_SENTENCE__Alternatives2826);
                    rulePENDOWN();

                    state._fsp--;

                     after(grammarAccess.getDRAWING_SENTENCEAccess().getPENDOWNParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1341:6: ( rulePENUP )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1341:6: ( rulePENUP )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1342:1: rulePENUP
                    {
                     before(grammarAccess.getDRAWING_SENTENCEAccess().getPENUPParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePENUP_in_rule__DRAWING_SENTENCE__Alternatives2843);
                    rulePENUP();

                    state._fsp--;

                     after(grammarAccess.getDRAWING_SENTENCEAccess().getPENUPParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1347:6: ( ruleCLEAR )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1347:6: ( ruleCLEAR )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1348:1: ruleCLEAR
                    {
                     before(grammarAccess.getDRAWING_SENTENCEAccess().getCLEARParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCLEAR_in_rule__DRAWING_SENTENCE__Alternatives2860);
                    ruleCLEAR();

                    state._fsp--;

                     after(grammarAccess.getDRAWING_SENTENCEAccess().getCLEARParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1353:6: ( ruleHOME )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1353:6: ( ruleHOME )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1354:1: ruleHOME
                    {
                     before(grammarAccess.getDRAWING_SENTENCEAccess().getHOMEParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleHOME_in_rule__DRAWING_SENTENCE__Alternatives2877);
                    ruleHOME();

                    state._fsp--;

                     after(grammarAccess.getDRAWING_SENTENCEAccess().getHOMEParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1359:6: ( ruleCOLOREABLE )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1359:6: ( ruleCOLOREABLE )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1360:1: ruleCOLOREABLE
                    {
                     before(grammarAccess.getDRAWING_SENTENCEAccess().getCOLOREABLEParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCOLOREABLE_in_rule__DRAWING_SENTENCE__Alternatives2894);
                    ruleCOLOREABLE();

                    state._fsp--;

                     after(grammarAccess.getDRAWING_SENTENCEAccess().getCOLOREABLEParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1365:6: ( ruleFONT_SPEC )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1365:6: ( ruleFONT_SPEC )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1366:1: ruleFONT_SPEC
                    {
                     before(grammarAccess.getDRAWING_SENTENCEAccess().getFONT_SPECParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleFONT_SPEC_in_rule__DRAWING_SENTENCE__Alternatives2911);
                    ruleFONT_SPEC();

                    state._fsp--;

                     after(grammarAccess.getDRAWING_SENTENCEAccess().getFONT_SPECParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1371:6: ( ruleDRAW_STRING )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1371:6: ( ruleDRAW_STRING )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1372:1: ruleDRAW_STRING
                    {
                     before(grammarAccess.getDRAWING_SENTENCEAccess().getDRAW_STRINGParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleDRAW_STRING_in_rule__DRAWING_SENTENCE__Alternatives2928);
                    ruleDRAW_STRING();

                    state._fsp--;

                     after(grammarAccess.getDRAWING_SENTENCEAccess().getDRAW_STRINGParserRuleCall_6()); 

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
    // $ANTLR end "rule__DRAWING_SENTENCE__Alternatives"


    // $ANTLR start "rule__COLOREABLE__Alternatives"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1382:1: rule__COLOREABLE__Alternatives : ( ( rulePENCOLOR ) | ( ruleCANVAS_COLOR ) );
    public final void rule__COLOREABLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1386:1: ( ( rulePENCOLOR ) | ( ruleCANVAS_COLOR ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            else if ( (LA5_0==33) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1387:1: ( rulePENCOLOR )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1387:1: ( rulePENCOLOR )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1388:1: rulePENCOLOR
                    {
                     before(grammarAccess.getCOLOREABLEAccess().getPENCOLORParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePENCOLOR_in_rule__COLOREABLE__Alternatives2960);
                    rulePENCOLOR();

                    state._fsp--;

                     after(grammarAccess.getCOLOREABLEAccess().getPENCOLORParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1393:6: ( ruleCANVAS_COLOR )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1393:6: ( ruleCANVAS_COLOR )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1394:1: ruleCANVAS_COLOR
                    {
                     before(grammarAccess.getCOLOREABLEAccess().getCANVAS_COLORParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCANVAS_COLOR_in_rule__COLOREABLE__Alternatives2977);
                    ruleCANVAS_COLOR();

                    state._fsp--;

                     after(grammarAccess.getCOLOREABLEAccess().getCANVAS_COLORParserRuleCall_1()); 

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
    // $ANTLR end "rule__COLOREABLE__Alternatives"


    // $ANTLR start "rule__PENCOLOR__Alternatives_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1404:1: rule__PENCOLOR__Alternatives_1 : ( ( ( rule__PENCOLOR__ColorAssignment_1_0 ) ) | ( ( rule__PENCOLOR__ColorSpecAssignment_1_1 ) ) );
    public final void rule__PENCOLOR__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1408:1: ( ( ( rule__PENCOLOR__ColorAssignment_1_0 ) ) | ( ( rule__PENCOLOR__ColorSpecAssignment_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=12 && LA6_0<=24)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_DOUBLE)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1409:1: ( ( rule__PENCOLOR__ColorAssignment_1_0 ) )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1409:1: ( ( rule__PENCOLOR__ColorAssignment_1_0 ) )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1410:1: ( rule__PENCOLOR__ColorAssignment_1_0 )
                    {
                     before(grammarAccess.getPENCOLORAccess().getColorAssignment_1_0()); 
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1411:1: ( rule__PENCOLOR__ColorAssignment_1_0 )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1411:2: rule__PENCOLOR__ColorAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__PENCOLOR__ColorAssignment_1_0_in_rule__PENCOLOR__Alternatives_13009);
                    rule__PENCOLOR__ColorAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPENCOLORAccess().getColorAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1415:6: ( ( rule__PENCOLOR__ColorSpecAssignment_1_1 ) )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1415:6: ( ( rule__PENCOLOR__ColorSpecAssignment_1_1 ) )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1416:1: ( rule__PENCOLOR__ColorSpecAssignment_1_1 )
                    {
                     before(grammarAccess.getPENCOLORAccess().getColorSpecAssignment_1_1()); 
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1417:1: ( rule__PENCOLOR__ColorSpecAssignment_1_1 )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1417:2: rule__PENCOLOR__ColorSpecAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__PENCOLOR__ColorSpecAssignment_1_1_in_rule__PENCOLOR__Alternatives_13027);
                    rule__PENCOLOR__ColorSpecAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPENCOLORAccess().getColorSpecAssignment_1_1()); 

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
    // $ANTLR end "rule__PENCOLOR__Alternatives_1"


    // $ANTLR start "rule__CANVAS_COLOR__Alternatives_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1426:1: rule__CANVAS_COLOR__Alternatives_1 : ( ( ( rule__CANVAS_COLOR__ColorAssignment_1_0 ) ) | ( ( rule__CANVAS_COLOR__ColorSpecAssignment_1_1 ) ) );
    public final void rule__CANVAS_COLOR__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1430:1: ( ( ( rule__CANVAS_COLOR__ColorAssignment_1_0 ) ) | ( ( rule__CANVAS_COLOR__ColorSpecAssignment_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=12 && LA7_0<=24)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_DOUBLE)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1431:1: ( ( rule__CANVAS_COLOR__ColorAssignment_1_0 ) )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1431:1: ( ( rule__CANVAS_COLOR__ColorAssignment_1_0 ) )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1432:1: ( rule__CANVAS_COLOR__ColorAssignment_1_0 )
                    {
                     before(grammarAccess.getCANVAS_COLORAccess().getColorAssignment_1_0()); 
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1433:1: ( rule__CANVAS_COLOR__ColorAssignment_1_0 )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1433:2: rule__CANVAS_COLOR__ColorAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__CANVAS_COLOR__ColorAssignment_1_0_in_rule__CANVAS_COLOR__Alternatives_13060);
                    rule__CANVAS_COLOR__ColorAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCANVAS_COLORAccess().getColorAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1437:6: ( ( rule__CANVAS_COLOR__ColorSpecAssignment_1_1 ) )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1437:6: ( ( rule__CANVAS_COLOR__ColorSpecAssignment_1_1 ) )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1438:1: ( rule__CANVAS_COLOR__ColorSpecAssignment_1_1 )
                    {
                     before(grammarAccess.getCANVAS_COLORAccess().getColorSpecAssignment_1_1()); 
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1439:1: ( rule__CANVAS_COLOR__ColorSpecAssignment_1_1 )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1439:2: rule__CANVAS_COLOR__ColorSpecAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__CANVAS_COLOR__ColorSpecAssignment_1_1_in_rule__CANVAS_COLOR__Alternatives_13078);
                    rule__CANVAS_COLOR__ColorSpecAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCANVAS_COLORAccess().getColorSpecAssignment_1_1()); 

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
    // $ANTLR end "rule__CANVAS_COLOR__Alternatives_1"


    // $ANTLR start "rule__COLOR__Alternatives"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1448:1: rule__COLOR__Alternatives : ( ( 'BLACK' ) | ( 'BLUE' ) | ( 'CYAN' ) | ( 'DARK GRAY' ) | ( 'GRAY' ) | ( 'GREEN' ) | ( 'LIGHTGRAY' ) | ( 'MAGENTA' ) | ( 'ORANGE' ) | ( 'PINK' ) | ( 'RED' ) | ( 'WHITE' ) | ( 'YELLOW' ) );
    public final void rule__COLOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1452:1: ( ( 'BLACK' ) | ( 'BLUE' ) | ( 'CYAN' ) | ( 'DARK GRAY' ) | ( 'GRAY' ) | ( 'GREEN' ) | ( 'LIGHTGRAY' ) | ( 'MAGENTA' ) | ( 'ORANGE' ) | ( 'PINK' ) | ( 'RED' ) | ( 'WHITE' ) | ( 'YELLOW' ) )
            int alt8=13;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt8=1;
                }
                break;
            case 13:
                {
                alt8=2;
                }
                break;
            case 14:
                {
                alt8=3;
                }
                break;
            case 15:
                {
                alt8=4;
                }
                break;
            case 16:
                {
                alt8=5;
                }
                break;
            case 17:
                {
                alt8=6;
                }
                break;
            case 18:
                {
                alt8=7;
                }
                break;
            case 19:
                {
                alt8=8;
                }
                break;
            case 20:
                {
                alt8=9;
                }
                break;
            case 21:
                {
                alt8=10;
                }
                break;
            case 22:
                {
                alt8=11;
                }
                break;
            case 23:
                {
                alt8=12;
                }
                break;
            case 24:
                {
                alt8=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1453:1: ( 'BLACK' )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1453:1: ( 'BLACK' )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1454:1: 'BLACK'
                    {
                     before(grammarAccess.getCOLORAccess().getBLACKKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__COLOR__Alternatives3112); 
                     after(grammarAccess.getCOLORAccess().getBLACKKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1461:6: ( 'BLUE' )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1461:6: ( 'BLUE' )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1462:1: 'BLUE'
                    {
                     before(grammarAccess.getCOLORAccess().getBLUEKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__COLOR__Alternatives3132); 
                     after(grammarAccess.getCOLORAccess().getBLUEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1469:6: ( 'CYAN' )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1469:6: ( 'CYAN' )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1470:1: 'CYAN'
                    {
                     before(grammarAccess.getCOLORAccess().getCYANKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__COLOR__Alternatives3152); 
                     after(grammarAccess.getCOLORAccess().getCYANKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1477:6: ( 'DARK GRAY' )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1477:6: ( 'DARK GRAY' )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1478:1: 'DARK GRAY'
                    {
                     before(grammarAccess.getCOLORAccess().getDARKGRAYKeyword_3()); 
                    match(input,15,FOLLOW_15_in_rule__COLOR__Alternatives3172); 
                     after(grammarAccess.getCOLORAccess().getDARKGRAYKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1485:6: ( 'GRAY' )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1485:6: ( 'GRAY' )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1486:1: 'GRAY'
                    {
                     before(grammarAccess.getCOLORAccess().getGRAYKeyword_4()); 
                    match(input,16,FOLLOW_16_in_rule__COLOR__Alternatives3192); 
                     after(grammarAccess.getCOLORAccess().getGRAYKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1493:6: ( 'GREEN' )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1493:6: ( 'GREEN' )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1494:1: 'GREEN'
                    {
                     before(grammarAccess.getCOLORAccess().getGREENKeyword_5()); 
                    match(input,17,FOLLOW_17_in_rule__COLOR__Alternatives3212); 
                     after(grammarAccess.getCOLORAccess().getGREENKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1501:6: ( 'LIGHTGRAY' )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1501:6: ( 'LIGHTGRAY' )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1502:1: 'LIGHTGRAY'
                    {
                     before(grammarAccess.getCOLORAccess().getLIGHTGRAYKeyword_6()); 
                    match(input,18,FOLLOW_18_in_rule__COLOR__Alternatives3232); 
                     after(grammarAccess.getCOLORAccess().getLIGHTGRAYKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1509:6: ( 'MAGENTA' )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1509:6: ( 'MAGENTA' )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1510:1: 'MAGENTA'
                    {
                     before(grammarAccess.getCOLORAccess().getMAGENTAKeyword_7()); 
                    match(input,19,FOLLOW_19_in_rule__COLOR__Alternatives3252); 
                     after(grammarAccess.getCOLORAccess().getMAGENTAKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1517:6: ( 'ORANGE' )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1517:6: ( 'ORANGE' )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1518:1: 'ORANGE'
                    {
                     before(grammarAccess.getCOLORAccess().getORANGEKeyword_8()); 
                    match(input,20,FOLLOW_20_in_rule__COLOR__Alternatives3272); 
                     after(grammarAccess.getCOLORAccess().getORANGEKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1525:6: ( 'PINK' )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1525:6: ( 'PINK' )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1526:1: 'PINK'
                    {
                     before(grammarAccess.getCOLORAccess().getPINKKeyword_9()); 
                    match(input,21,FOLLOW_21_in_rule__COLOR__Alternatives3292); 
                     after(grammarAccess.getCOLORAccess().getPINKKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1533:6: ( 'RED' )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1533:6: ( 'RED' )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1534:1: 'RED'
                    {
                     before(grammarAccess.getCOLORAccess().getREDKeyword_10()); 
                    match(input,22,FOLLOW_22_in_rule__COLOR__Alternatives3312); 
                     after(grammarAccess.getCOLORAccess().getREDKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1541:6: ( 'WHITE' )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1541:6: ( 'WHITE' )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1542:1: 'WHITE'
                    {
                     before(grammarAccess.getCOLORAccess().getWHITEKeyword_11()); 
                    match(input,23,FOLLOW_23_in_rule__COLOR__Alternatives3332); 
                     after(grammarAccess.getCOLORAccess().getWHITEKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1549:6: ( 'YELLOW' )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1549:6: ( 'YELLOW' )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1550:1: 'YELLOW'
                    {
                     before(grammarAccess.getCOLORAccess().getYELLOWKeyword_12()); 
                    match(input,24,FOLLOW_24_in_rule__COLOR__Alternatives3352); 
                     after(grammarAccess.getCOLORAccess().getYELLOWKeyword_12()); 

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
    // $ANTLR end "rule__COLOR__Alternatives"


    // $ANTLR start "rule__FontStyleValues__Alternatives"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1562:1: rule__FontStyleValues__Alternatives : ( ( ( rule__FontStyleValues__Group_0__0 ) ) | ( ( rule__FontStyleValues__Group_1__0 ) ) | ( ( rule__FontStyleValues__Group_2__0 ) ) );
    public final void rule__FontStyleValues__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1566:1: ( ( ( rule__FontStyleValues__Group_0__0 ) ) | ( ( rule__FontStyleValues__Group_1__0 ) ) | ( ( rule__FontStyleValues__Group_2__0 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt9=1;
                }
                break;
            case 36:
                {
                alt9=2;
                }
                break;
            case 37:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1567:1: ( ( rule__FontStyleValues__Group_0__0 ) )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1567:1: ( ( rule__FontStyleValues__Group_0__0 ) )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1568:1: ( rule__FontStyleValues__Group_0__0 )
                    {
                     before(grammarAccess.getFontStyleValuesAccess().getGroup_0()); 
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1569:1: ( rule__FontStyleValues__Group_0__0 )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1569:2: rule__FontStyleValues__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FontStyleValues__Group_0__0_in_rule__FontStyleValues__Alternatives3386);
                    rule__FontStyleValues__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFontStyleValuesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1573:6: ( ( rule__FontStyleValues__Group_1__0 ) )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1573:6: ( ( rule__FontStyleValues__Group_1__0 ) )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1574:1: ( rule__FontStyleValues__Group_1__0 )
                    {
                     before(grammarAccess.getFontStyleValuesAccess().getGroup_1()); 
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1575:1: ( rule__FontStyleValues__Group_1__0 )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1575:2: rule__FontStyleValues__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FontStyleValues__Group_1__0_in_rule__FontStyleValues__Alternatives3404);
                    rule__FontStyleValues__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFontStyleValuesAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1579:6: ( ( rule__FontStyleValues__Group_2__0 ) )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1579:6: ( ( rule__FontStyleValues__Group_2__0 ) )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1580:1: ( rule__FontStyleValues__Group_2__0 )
                    {
                     before(grammarAccess.getFontStyleValuesAccess().getGroup_2()); 
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1581:1: ( rule__FontStyleValues__Group_2__0 )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1581:2: rule__FontStyleValues__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FontStyleValues__Group_2__0_in_rule__FontStyleValues__Alternatives3422);
                    rule__FontStyleValues__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFontStyleValuesAccess().getGroup_2()); 

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
    // $ANTLR end "rule__FontStyleValues__Alternatives"


    // $ANTLR start "rule__EXPRESSION__Alternatives"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1591:1: rule__EXPRESSION__Alternatives : ( ( ruleVARIABLE_REF ) | ( ruleVALUE ) );
    public final void rule__EXPRESSION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1595:1: ( ( ruleVARIABLE_REF ) | ( ruleVALUE ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_DOUBLE) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1596:1: ( ruleVARIABLE_REF )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1596:1: ( ruleVARIABLE_REF )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1597:1: ruleVARIABLE_REF
                    {
                     before(grammarAccess.getEXPRESSIONAccess().getVARIABLE_REFParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVARIABLE_REF_in_rule__EXPRESSION__Alternatives3456);
                    ruleVARIABLE_REF();

                    state._fsp--;

                     after(grammarAccess.getEXPRESSIONAccess().getVARIABLE_REFParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1602:6: ( ruleVALUE )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1602:6: ( ruleVALUE )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1603:1: ruleVALUE
                    {
                     before(grammarAccess.getEXPRESSIONAccess().getVALUEParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVALUE_in_rule__EXPRESSION__Alternatives3473);
                    ruleVALUE();

                    state._fsp--;

                     after(grammarAccess.getEXPRESSIONAccess().getVALUEParserRuleCall_1()); 

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
    // $ANTLR end "rule__EXPRESSION__Alternatives"


    // $ANTLR start "rule__OPERATION__Alternatives"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1613:1: rule__OPERATION__Alternatives : ( ( ruleSUM ) | ( ruleSUBTRACT ) | ( ruleMULTIPLY ) | ( ruleDIVIDE ) );
    public final void rule__OPERATION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1617:1: ( ( ruleSUM ) | ( ruleSUBTRACT ) | ( ruleMULTIPLY ) | ( ruleDIVIDE ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt11=1;
                }
                break;
            case 46:
                {
                alt11=2;
                }
                break;
            case 48:
                {
                alt11=3;
                }
                break;
            case 50:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1618:1: ( ruleSUM )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1618:1: ( ruleSUM )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1619:1: ruleSUM
                    {
                     before(grammarAccess.getOPERATIONAccess().getSUMParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSUM_in_rule__OPERATION__Alternatives3505);
                    ruleSUM();

                    state._fsp--;

                     after(grammarAccess.getOPERATIONAccess().getSUMParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1624:6: ( ruleSUBTRACT )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1624:6: ( ruleSUBTRACT )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1625:1: ruleSUBTRACT
                    {
                     before(grammarAccess.getOPERATIONAccess().getSUBTRACTParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSUBTRACT_in_rule__OPERATION__Alternatives3522);
                    ruleSUBTRACT();

                    state._fsp--;

                     after(grammarAccess.getOPERATIONAccess().getSUBTRACTParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1630:6: ( ruleMULTIPLY )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1630:6: ( ruleMULTIPLY )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1631:1: ruleMULTIPLY
                    {
                     before(grammarAccess.getOPERATIONAccess().getMULTIPLYParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMULTIPLY_in_rule__OPERATION__Alternatives3539);
                    ruleMULTIPLY();

                    state._fsp--;

                     after(grammarAccess.getOPERATIONAccess().getMULTIPLYParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1636:6: ( ruleDIVIDE )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1636:6: ( ruleDIVIDE )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1637:1: ruleDIVIDE
                    {
                     before(grammarAccess.getOPERATIONAccess().getDIVIDEParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDIVIDE_in_rule__OPERATION__Alternatives3556);
                    ruleDIVIDE();

                    state._fsp--;

                     after(grammarAccess.getOPERATIONAccess().getDIVIDEParserRuleCall_3()); 

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
    // $ANTLR end "rule__OPERATION__Alternatives"


    // $ANTLR start "rule__CONTROL_SENTENCES__Alternatives"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1647:1: rule__CONTROL_SENTENCES__Alternatives : ( ( ruleREPEAT ) | ( ruleTO ) | ( ruleIF_SENTENCE ) );
    public final void rule__CONTROL_SENTENCES__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1651:1: ( ( ruleREPEAT ) | ( ruleTO ) | ( ruleIF_SENTENCE ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt12=1;
                }
                break;
            case 54:
                {
                alt12=2;
                }
                break;
            case 57:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1652:1: ( ruleREPEAT )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1652:1: ( ruleREPEAT )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1653:1: ruleREPEAT
                    {
                     before(grammarAccess.getCONTROL_SENTENCESAccess().getREPEATParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleREPEAT_in_rule__CONTROL_SENTENCES__Alternatives3588);
                    ruleREPEAT();

                    state._fsp--;

                     after(grammarAccess.getCONTROL_SENTENCESAccess().getREPEATParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1658:6: ( ruleTO )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1658:6: ( ruleTO )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1659:1: ruleTO
                    {
                     before(grammarAccess.getCONTROL_SENTENCESAccess().getTOParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTO_in_rule__CONTROL_SENTENCES__Alternatives3605);
                    ruleTO();

                    state._fsp--;

                     after(grammarAccess.getCONTROL_SENTENCESAccess().getTOParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1664:6: ( ruleIF_SENTENCE )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1664:6: ( ruleIF_SENTENCE )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1665:1: ruleIF_SENTENCE
                    {
                     before(grammarAccess.getCONTROL_SENTENCESAccess().getIF_SENTENCEParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIF_SENTENCE_in_rule__CONTROL_SENTENCES__Alternatives3622);
                    ruleIF_SENTENCE();

                    state._fsp--;

                     after(grammarAccess.getCONTROL_SENTENCESAccess().getIF_SENTENCEParserRuleCall_2()); 

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
    // $ANTLR end "rule__CONTROL_SENTENCES__Alternatives"


    // $ANTLR start "rule__BOOLEAN_EXPRESSION__Alternatives"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1675:1: rule__BOOLEAN_EXPRESSION__Alternatives : ( ( ruleEQUALS ) | ( ruleGREATER_THAN ) | ( ruleLESSER_THAN ) );
    public final void rule__BOOLEAN_EXPRESSION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1679:1: ( ( ruleEQUALS ) | ( ruleGREATER_THAN ) | ( ruleLESSER_THAN ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 42:
                    {
                    alt13=1;
                    }
                    break;
                case 60:
                    {
                    alt13=3;
                    }
                    break;
                case 59:
                    {
                    alt13=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA13_0==RULE_DOUBLE) ) {
                switch ( input.LA(2) ) {
                case 59:
                    {
                    alt13=2;
                    }
                    break;
                case 42:
                    {
                    alt13=1;
                    }
                    break;
                case 60:
                    {
                    alt13=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1680:1: ( ruleEQUALS )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1680:1: ( ruleEQUALS )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1681:1: ruleEQUALS
                    {
                     before(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getEQUALSParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEQUALS_in_rule__BOOLEAN_EXPRESSION__Alternatives3654);
                    ruleEQUALS();

                    state._fsp--;

                     after(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getEQUALSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1686:6: ( ruleGREATER_THAN )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1686:6: ( ruleGREATER_THAN )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1687:1: ruleGREATER_THAN
                    {
                     before(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getGREATER_THANParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleGREATER_THAN_in_rule__BOOLEAN_EXPRESSION__Alternatives3671);
                    ruleGREATER_THAN();

                    state._fsp--;

                     after(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getGREATER_THANParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1692:6: ( ruleLESSER_THAN )
                    {
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1692:6: ( ruleLESSER_THAN )
                    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1693:1: ruleLESSER_THAN
                    {
                     before(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getLESSER_THANParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleLESSER_THAN_in_rule__BOOLEAN_EXPRESSION__Alternatives3688);
                    ruleLESSER_THAN();

                    state._fsp--;

                     after(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getLESSER_THANParserRuleCall_2()); 

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
    // $ANTLR end "rule__BOOLEAN_EXPRESSION__Alternatives"


    // $ANTLR start "rule__FORWARD__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1705:1: rule__FORWARD__Group__0 : rule__FORWARD__Group__0__Impl rule__FORWARD__Group__1 ;
    public final void rule__FORWARD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1709:1: ( rule__FORWARD__Group__0__Impl rule__FORWARD__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1710:2: rule__FORWARD__Group__0__Impl rule__FORWARD__Group__1
            {
            pushFollow(FOLLOW_rule__FORWARD__Group__0__Impl_in_rule__FORWARD__Group__03718);
            rule__FORWARD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FORWARD__Group__1_in_rule__FORWARD__Group__03721);
            rule__FORWARD__Group__1();

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
    // $ANTLR end "rule__FORWARD__Group__0"


    // $ANTLR start "rule__FORWARD__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1717:1: rule__FORWARD__Group__0__Impl : ( 'FORWARD' ) ;
    public final void rule__FORWARD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1721:1: ( ( 'FORWARD' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1722:1: ( 'FORWARD' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1722:1: ( 'FORWARD' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1723:1: 'FORWARD'
            {
             before(grammarAccess.getFORWARDAccess().getFORWARDKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__FORWARD__Group__0__Impl3749); 
             after(grammarAccess.getFORWARDAccess().getFORWARDKeyword_0()); 

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
    // $ANTLR end "rule__FORWARD__Group__0__Impl"


    // $ANTLR start "rule__FORWARD__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1736:1: rule__FORWARD__Group__1 : rule__FORWARD__Group__1__Impl ;
    public final void rule__FORWARD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1740:1: ( rule__FORWARD__Group__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1741:2: rule__FORWARD__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FORWARD__Group__1__Impl_in_rule__FORWARD__Group__13780);
            rule__FORWARD__Group__1__Impl();

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
    // $ANTLR end "rule__FORWARD__Group__1"


    // $ANTLR start "rule__FORWARD__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1747:1: rule__FORWARD__Group__1__Impl : ( ( rule__FORWARD__AmountAssignment_1 ) ) ;
    public final void rule__FORWARD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1751:1: ( ( ( rule__FORWARD__AmountAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1752:1: ( ( rule__FORWARD__AmountAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1752:1: ( ( rule__FORWARD__AmountAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1753:1: ( rule__FORWARD__AmountAssignment_1 )
            {
             before(grammarAccess.getFORWARDAccess().getAmountAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1754:1: ( rule__FORWARD__AmountAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1754:2: rule__FORWARD__AmountAssignment_1
            {
            pushFollow(FOLLOW_rule__FORWARD__AmountAssignment_1_in_rule__FORWARD__Group__1__Impl3807);
            rule__FORWARD__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFORWARDAccess().getAmountAssignment_1()); 

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
    // $ANTLR end "rule__FORWARD__Group__1__Impl"


    // $ANTLR start "rule__LEFT__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1768:1: rule__LEFT__Group__0 : rule__LEFT__Group__0__Impl rule__LEFT__Group__1 ;
    public final void rule__LEFT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1772:1: ( rule__LEFT__Group__0__Impl rule__LEFT__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1773:2: rule__LEFT__Group__0__Impl rule__LEFT__Group__1
            {
            pushFollow(FOLLOW_rule__LEFT__Group__0__Impl_in_rule__LEFT__Group__03841);
            rule__LEFT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LEFT__Group__1_in_rule__LEFT__Group__03844);
            rule__LEFT__Group__1();

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
    // $ANTLR end "rule__LEFT__Group__0"


    // $ANTLR start "rule__LEFT__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1780:1: rule__LEFT__Group__0__Impl : ( 'LEFT' ) ;
    public final void rule__LEFT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1784:1: ( ( 'LEFT' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1785:1: ( 'LEFT' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1785:1: ( 'LEFT' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1786:1: 'LEFT'
            {
             before(grammarAccess.getLEFTAccess().getLEFTKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__LEFT__Group__0__Impl3872); 
             after(grammarAccess.getLEFTAccess().getLEFTKeyword_0()); 

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
    // $ANTLR end "rule__LEFT__Group__0__Impl"


    // $ANTLR start "rule__LEFT__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1799:1: rule__LEFT__Group__1 : rule__LEFT__Group__1__Impl ;
    public final void rule__LEFT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1803:1: ( rule__LEFT__Group__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1804:2: rule__LEFT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LEFT__Group__1__Impl_in_rule__LEFT__Group__13903);
            rule__LEFT__Group__1__Impl();

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
    // $ANTLR end "rule__LEFT__Group__1"


    // $ANTLR start "rule__LEFT__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1810:1: rule__LEFT__Group__1__Impl : ( ( rule__LEFT__AmountAssignment_1 ) ) ;
    public final void rule__LEFT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1814:1: ( ( ( rule__LEFT__AmountAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1815:1: ( ( rule__LEFT__AmountAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1815:1: ( ( rule__LEFT__AmountAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1816:1: ( rule__LEFT__AmountAssignment_1 )
            {
             before(grammarAccess.getLEFTAccess().getAmountAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1817:1: ( rule__LEFT__AmountAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1817:2: rule__LEFT__AmountAssignment_1
            {
            pushFollow(FOLLOW_rule__LEFT__AmountAssignment_1_in_rule__LEFT__Group__1__Impl3930);
            rule__LEFT__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLEFTAccess().getAmountAssignment_1()); 

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
    // $ANTLR end "rule__LEFT__Group__1__Impl"


    // $ANTLR start "rule__RIGHT__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1831:1: rule__RIGHT__Group__0 : rule__RIGHT__Group__0__Impl rule__RIGHT__Group__1 ;
    public final void rule__RIGHT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1835:1: ( rule__RIGHT__Group__0__Impl rule__RIGHT__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1836:2: rule__RIGHT__Group__0__Impl rule__RIGHT__Group__1
            {
            pushFollow(FOLLOW_rule__RIGHT__Group__0__Impl_in_rule__RIGHT__Group__03964);
            rule__RIGHT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RIGHT__Group__1_in_rule__RIGHT__Group__03967);
            rule__RIGHT__Group__1();

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
    // $ANTLR end "rule__RIGHT__Group__0"


    // $ANTLR start "rule__RIGHT__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1843:1: rule__RIGHT__Group__0__Impl : ( 'RIGHT' ) ;
    public final void rule__RIGHT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1847:1: ( ( 'RIGHT' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1848:1: ( 'RIGHT' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1848:1: ( 'RIGHT' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1849:1: 'RIGHT'
            {
             before(grammarAccess.getRIGHTAccess().getRIGHTKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__RIGHT__Group__0__Impl3995); 
             after(grammarAccess.getRIGHTAccess().getRIGHTKeyword_0()); 

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
    // $ANTLR end "rule__RIGHT__Group__0__Impl"


    // $ANTLR start "rule__RIGHT__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1862:1: rule__RIGHT__Group__1 : rule__RIGHT__Group__1__Impl ;
    public final void rule__RIGHT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1866:1: ( rule__RIGHT__Group__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1867:2: rule__RIGHT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RIGHT__Group__1__Impl_in_rule__RIGHT__Group__14026);
            rule__RIGHT__Group__1__Impl();

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
    // $ANTLR end "rule__RIGHT__Group__1"


    // $ANTLR start "rule__RIGHT__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1873:1: rule__RIGHT__Group__1__Impl : ( ( rule__RIGHT__AmountAssignment_1 ) ) ;
    public final void rule__RIGHT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1877:1: ( ( ( rule__RIGHT__AmountAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1878:1: ( ( rule__RIGHT__AmountAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1878:1: ( ( rule__RIGHT__AmountAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1879:1: ( rule__RIGHT__AmountAssignment_1 )
            {
             before(grammarAccess.getRIGHTAccess().getAmountAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1880:1: ( rule__RIGHT__AmountAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1880:2: rule__RIGHT__AmountAssignment_1
            {
            pushFollow(FOLLOW_rule__RIGHT__AmountAssignment_1_in_rule__RIGHT__Group__1__Impl4053);
            rule__RIGHT__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRIGHTAccess().getAmountAssignment_1()); 

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
    // $ANTLR end "rule__RIGHT__Group__1__Impl"


    // $ANTLR start "rule__SET_X__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1894:1: rule__SET_X__Group__0 : rule__SET_X__Group__0__Impl rule__SET_X__Group__1 ;
    public final void rule__SET_X__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1898:1: ( rule__SET_X__Group__0__Impl rule__SET_X__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1899:2: rule__SET_X__Group__0__Impl rule__SET_X__Group__1
            {
            pushFollow(FOLLOW_rule__SET_X__Group__0__Impl_in_rule__SET_X__Group__04087);
            rule__SET_X__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SET_X__Group__1_in_rule__SET_X__Group__04090);
            rule__SET_X__Group__1();

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
    // $ANTLR end "rule__SET_X__Group__0"


    // $ANTLR start "rule__SET_X__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1906:1: rule__SET_X__Group__0__Impl : ( 'SETX' ) ;
    public final void rule__SET_X__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1910:1: ( ( 'SETX' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1911:1: ( 'SETX' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1911:1: ( 'SETX' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1912:1: 'SETX'
            {
             before(grammarAccess.getSET_XAccess().getSETXKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__SET_X__Group__0__Impl4118); 
             after(grammarAccess.getSET_XAccess().getSETXKeyword_0()); 

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
    // $ANTLR end "rule__SET_X__Group__0__Impl"


    // $ANTLR start "rule__SET_X__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1925:1: rule__SET_X__Group__1 : rule__SET_X__Group__1__Impl ;
    public final void rule__SET_X__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1929:1: ( rule__SET_X__Group__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1930:2: rule__SET_X__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SET_X__Group__1__Impl_in_rule__SET_X__Group__14149);
            rule__SET_X__Group__1__Impl();

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
    // $ANTLR end "rule__SET_X__Group__1"


    // $ANTLR start "rule__SET_X__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1936:1: rule__SET_X__Group__1__Impl : ( ( rule__SET_X__AmountAssignment_1 ) ) ;
    public final void rule__SET_X__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1940:1: ( ( ( rule__SET_X__AmountAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1941:1: ( ( rule__SET_X__AmountAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1941:1: ( ( rule__SET_X__AmountAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1942:1: ( rule__SET_X__AmountAssignment_1 )
            {
             before(grammarAccess.getSET_XAccess().getAmountAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1943:1: ( rule__SET_X__AmountAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1943:2: rule__SET_X__AmountAssignment_1
            {
            pushFollow(FOLLOW_rule__SET_X__AmountAssignment_1_in_rule__SET_X__Group__1__Impl4176);
            rule__SET_X__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSET_XAccess().getAmountAssignment_1()); 

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
    // $ANTLR end "rule__SET_X__Group__1__Impl"


    // $ANTLR start "rule__SET_Y__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1957:1: rule__SET_Y__Group__0 : rule__SET_Y__Group__0__Impl rule__SET_Y__Group__1 ;
    public final void rule__SET_Y__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1961:1: ( rule__SET_Y__Group__0__Impl rule__SET_Y__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1962:2: rule__SET_Y__Group__0__Impl rule__SET_Y__Group__1
            {
            pushFollow(FOLLOW_rule__SET_Y__Group__0__Impl_in_rule__SET_Y__Group__04210);
            rule__SET_Y__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SET_Y__Group__1_in_rule__SET_Y__Group__04213);
            rule__SET_Y__Group__1();

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
    // $ANTLR end "rule__SET_Y__Group__0"


    // $ANTLR start "rule__SET_Y__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1969:1: rule__SET_Y__Group__0__Impl : ( 'SETY' ) ;
    public final void rule__SET_Y__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1973:1: ( ( 'SETY' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1974:1: ( 'SETY' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1974:1: ( 'SETY' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1975:1: 'SETY'
            {
             before(grammarAccess.getSET_YAccess().getSETYKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__SET_Y__Group__0__Impl4241); 
             after(grammarAccess.getSET_YAccess().getSETYKeyword_0()); 

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
    // $ANTLR end "rule__SET_Y__Group__0__Impl"


    // $ANTLR start "rule__SET_Y__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1988:1: rule__SET_Y__Group__1 : rule__SET_Y__Group__1__Impl ;
    public final void rule__SET_Y__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1992:1: ( rule__SET_Y__Group__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1993:2: rule__SET_Y__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SET_Y__Group__1__Impl_in_rule__SET_Y__Group__14272);
            rule__SET_Y__Group__1__Impl();

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
    // $ANTLR end "rule__SET_Y__Group__1"


    // $ANTLR start "rule__SET_Y__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:1999:1: rule__SET_Y__Group__1__Impl : ( ( rule__SET_Y__AmountAssignment_1 ) ) ;
    public final void rule__SET_Y__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2003:1: ( ( ( rule__SET_Y__AmountAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2004:1: ( ( rule__SET_Y__AmountAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2004:1: ( ( rule__SET_Y__AmountAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2005:1: ( rule__SET_Y__AmountAssignment_1 )
            {
             before(grammarAccess.getSET_YAccess().getAmountAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2006:1: ( rule__SET_Y__AmountAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2006:2: rule__SET_Y__AmountAssignment_1
            {
            pushFollow(FOLLOW_rule__SET_Y__AmountAssignment_1_in_rule__SET_Y__Group__1__Impl4299);
            rule__SET_Y__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSET_YAccess().getAmountAssignment_1()); 

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
    // $ANTLR end "rule__SET_Y__Group__1__Impl"


    // $ANTLR start "rule__PENDOWN__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2020:1: rule__PENDOWN__Group__0 : rule__PENDOWN__Group__0__Impl rule__PENDOWN__Group__1 ;
    public final void rule__PENDOWN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2024:1: ( rule__PENDOWN__Group__0__Impl rule__PENDOWN__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2025:2: rule__PENDOWN__Group__0__Impl rule__PENDOWN__Group__1
            {
            pushFollow(FOLLOW_rule__PENDOWN__Group__0__Impl_in_rule__PENDOWN__Group__04333);
            rule__PENDOWN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PENDOWN__Group__1_in_rule__PENDOWN__Group__04336);
            rule__PENDOWN__Group__1();

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
    // $ANTLR end "rule__PENDOWN__Group__0"


    // $ANTLR start "rule__PENDOWN__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2032:1: rule__PENDOWN__Group__0__Impl : ( () ) ;
    public final void rule__PENDOWN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2036:1: ( ( () ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2037:1: ( () )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2037:1: ( () )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2038:1: ()
            {
             before(grammarAccess.getPENDOWNAccess().getPENDOWNAction_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2039:1: ()
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2041:1: 
            {
            }

             after(grammarAccess.getPENDOWNAccess().getPENDOWNAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENDOWN__Group__0__Impl"


    // $ANTLR start "rule__PENDOWN__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2051:1: rule__PENDOWN__Group__1 : rule__PENDOWN__Group__1__Impl ;
    public final void rule__PENDOWN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2055:1: ( rule__PENDOWN__Group__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2056:2: rule__PENDOWN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PENDOWN__Group__1__Impl_in_rule__PENDOWN__Group__14394);
            rule__PENDOWN__Group__1__Impl();

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
    // $ANTLR end "rule__PENDOWN__Group__1"


    // $ANTLR start "rule__PENDOWN__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2062:1: rule__PENDOWN__Group__1__Impl : ( 'PENDOWN' ) ;
    public final void rule__PENDOWN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2066:1: ( ( 'PENDOWN' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2067:1: ( 'PENDOWN' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2067:1: ( 'PENDOWN' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2068:1: 'PENDOWN'
            {
             before(grammarAccess.getPENDOWNAccess().getPENDOWNKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__PENDOWN__Group__1__Impl4422); 
             after(grammarAccess.getPENDOWNAccess().getPENDOWNKeyword_1()); 

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
    // $ANTLR end "rule__PENDOWN__Group__1__Impl"


    // $ANTLR start "rule__PENUP__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2085:1: rule__PENUP__Group__0 : rule__PENUP__Group__0__Impl rule__PENUP__Group__1 ;
    public final void rule__PENUP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2089:1: ( rule__PENUP__Group__0__Impl rule__PENUP__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2090:2: rule__PENUP__Group__0__Impl rule__PENUP__Group__1
            {
            pushFollow(FOLLOW_rule__PENUP__Group__0__Impl_in_rule__PENUP__Group__04457);
            rule__PENUP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PENUP__Group__1_in_rule__PENUP__Group__04460);
            rule__PENUP__Group__1();

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
    // $ANTLR end "rule__PENUP__Group__0"


    // $ANTLR start "rule__PENUP__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2097:1: rule__PENUP__Group__0__Impl : ( () ) ;
    public final void rule__PENUP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2101:1: ( ( () ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2102:1: ( () )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2102:1: ( () )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2103:1: ()
            {
             before(grammarAccess.getPENUPAccess().getPENUPAction_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2104:1: ()
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2106:1: 
            {
            }

             after(grammarAccess.getPENUPAccess().getPENUPAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENUP__Group__0__Impl"


    // $ANTLR start "rule__PENUP__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2116:1: rule__PENUP__Group__1 : rule__PENUP__Group__1__Impl ;
    public final void rule__PENUP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2120:1: ( rule__PENUP__Group__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2121:2: rule__PENUP__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PENUP__Group__1__Impl_in_rule__PENUP__Group__14518);
            rule__PENUP__Group__1__Impl();

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
    // $ANTLR end "rule__PENUP__Group__1"


    // $ANTLR start "rule__PENUP__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2127:1: rule__PENUP__Group__1__Impl : ( 'PENUP' ) ;
    public final void rule__PENUP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2131:1: ( ( 'PENUP' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2132:1: ( 'PENUP' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2132:1: ( 'PENUP' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2133:1: 'PENUP'
            {
             before(grammarAccess.getPENUPAccess().getPENUPKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__PENUP__Group__1__Impl4546); 
             after(grammarAccess.getPENUPAccess().getPENUPKeyword_1()); 

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
    // $ANTLR end "rule__PENUP__Group__1__Impl"


    // $ANTLR start "rule__PENCOLOR__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2150:1: rule__PENCOLOR__Group__0 : rule__PENCOLOR__Group__0__Impl rule__PENCOLOR__Group__1 ;
    public final void rule__PENCOLOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2154:1: ( rule__PENCOLOR__Group__0__Impl rule__PENCOLOR__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2155:2: rule__PENCOLOR__Group__0__Impl rule__PENCOLOR__Group__1
            {
            pushFollow(FOLLOW_rule__PENCOLOR__Group__0__Impl_in_rule__PENCOLOR__Group__04581);
            rule__PENCOLOR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PENCOLOR__Group__1_in_rule__PENCOLOR__Group__04584);
            rule__PENCOLOR__Group__1();

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
    // $ANTLR end "rule__PENCOLOR__Group__0"


    // $ANTLR start "rule__PENCOLOR__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2162:1: rule__PENCOLOR__Group__0__Impl : ( 'PENCOLOR' ) ;
    public final void rule__PENCOLOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2166:1: ( ( 'PENCOLOR' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2167:1: ( 'PENCOLOR' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2167:1: ( 'PENCOLOR' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2168:1: 'PENCOLOR'
            {
             before(grammarAccess.getPENCOLORAccess().getPENCOLORKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__PENCOLOR__Group__0__Impl4612); 
             after(grammarAccess.getPENCOLORAccess().getPENCOLORKeyword_0()); 

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
    // $ANTLR end "rule__PENCOLOR__Group__0__Impl"


    // $ANTLR start "rule__PENCOLOR__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2181:1: rule__PENCOLOR__Group__1 : rule__PENCOLOR__Group__1__Impl ;
    public final void rule__PENCOLOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2185:1: ( rule__PENCOLOR__Group__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2186:2: rule__PENCOLOR__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PENCOLOR__Group__1__Impl_in_rule__PENCOLOR__Group__14643);
            rule__PENCOLOR__Group__1__Impl();

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
    // $ANTLR end "rule__PENCOLOR__Group__1"


    // $ANTLR start "rule__PENCOLOR__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2192:1: rule__PENCOLOR__Group__1__Impl : ( ( rule__PENCOLOR__Alternatives_1 ) ) ;
    public final void rule__PENCOLOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2196:1: ( ( ( rule__PENCOLOR__Alternatives_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2197:1: ( ( rule__PENCOLOR__Alternatives_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2197:1: ( ( rule__PENCOLOR__Alternatives_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2198:1: ( rule__PENCOLOR__Alternatives_1 )
            {
             before(grammarAccess.getPENCOLORAccess().getAlternatives_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2199:1: ( rule__PENCOLOR__Alternatives_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2199:2: rule__PENCOLOR__Alternatives_1
            {
            pushFollow(FOLLOW_rule__PENCOLOR__Alternatives_1_in_rule__PENCOLOR__Group__1__Impl4670);
            rule__PENCOLOR__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPENCOLORAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__PENCOLOR__Group__1__Impl"


    // $ANTLR start "rule__CANVAS_COLOR__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2213:1: rule__CANVAS_COLOR__Group__0 : rule__CANVAS_COLOR__Group__0__Impl rule__CANVAS_COLOR__Group__1 ;
    public final void rule__CANVAS_COLOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2217:1: ( rule__CANVAS_COLOR__Group__0__Impl rule__CANVAS_COLOR__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2218:2: rule__CANVAS_COLOR__Group__0__Impl rule__CANVAS_COLOR__Group__1
            {
            pushFollow(FOLLOW_rule__CANVAS_COLOR__Group__0__Impl_in_rule__CANVAS_COLOR__Group__04704);
            rule__CANVAS_COLOR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CANVAS_COLOR__Group__1_in_rule__CANVAS_COLOR__Group__04707);
            rule__CANVAS_COLOR__Group__1();

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
    // $ANTLR end "rule__CANVAS_COLOR__Group__0"


    // $ANTLR start "rule__CANVAS_COLOR__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2225:1: rule__CANVAS_COLOR__Group__0__Impl : ( 'CANVASCOLOR' ) ;
    public final void rule__CANVAS_COLOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2229:1: ( ( 'CANVASCOLOR' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2230:1: ( 'CANVASCOLOR' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2230:1: ( 'CANVASCOLOR' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2231:1: 'CANVASCOLOR'
            {
             before(grammarAccess.getCANVAS_COLORAccess().getCANVASCOLORKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__CANVAS_COLOR__Group__0__Impl4735); 
             after(grammarAccess.getCANVAS_COLORAccess().getCANVASCOLORKeyword_0()); 

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
    // $ANTLR end "rule__CANVAS_COLOR__Group__0__Impl"


    // $ANTLR start "rule__CANVAS_COLOR__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2244:1: rule__CANVAS_COLOR__Group__1 : rule__CANVAS_COLOR__Group__1__Impl ;
    public final void rule__CANVAS_COLOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2248:1: ( rule__CANVAS_COLOR__Group__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2249:2: rule__CANVAS_COLOR__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CANVAS_COLOR__Group__1__Impl_in_rule__CANVAS_COLOR__Group__14766);
            rule__CANVAS_COLOR__Group__1__Impl();

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
    // $ANTLR end "rule__CANVAS_COLOR__Group__1"


    // $ANTLR start "rule__CANVAS_COLOR__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2255:1: rule__CANVAS_COLOR__Group__1__Impl : ( ( rule__CANVAS_COLOR__Alternatives_1 ) ) ;
    public final void rule__CANVAS_COLOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2259:1: ( ( ( rule__CANVAS_COLOR__Alternatives_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2260:1: ( ( rule__CANVAS_COLOR__Alternatives_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2260:1: ( ( rule__CANVAS_COLOR__Alternatives_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2261:1: ( rule__CANVAS_COLOR__Alternatives_1 )
            {
             before(grammarAccess.getCANVAS_COLORAccess().getAlternatives_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2262:1: ( rule__CANVAS_COLOR__Alternatives_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2262:2: rule__CANVAS_COLOR__Alternatives_1
            {
            pushFollow(FOLLOW_rule__CANVAS_COLOR__Alternatives_1_in_rule__CANVAS_COLOR__Group__1__Impl4793);
            rule__CANVAS_COLOR__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCANVAS_COLORAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__CANVAS_COLOR__Group__1__Impl"


    // $ANTLR start "rule__COLOR_SPEC__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2276:1: rule__COLOR_SPEC__Group__0 : rule__COLOR_SPEC__Group__0__Impl rule__COLOR_SPEC__Group__1 ;
    public final void rule__COLOR_SPEC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2280:1: ( rule__COLOR_SPEC__Group__0__Impl rule__COLOR_SPEC__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2281:2: rule__COLOR_SPEC__Group__0__Impl rule__COLOR_SPEC__Group__1
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__Group__0__Impl_in_rule__COLOR_SPEC__Group__04827);
            rule__COLOR_SPEC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__COLOR_SPEC__Group__1_in_rule__COLOR_SPEC__Group__04830);
            rule__COLOR_SPEC__Group__1();

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
    // $ANTLR end "rule__COLOR_SPEC__Group__0"


    // $ANTLR start "rule__COLOR_SPEC__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2288:1: rule__COLOR_SPEC__Group__0__Impl : ( ( rule__COLOR_SPEC__RedAssignment_0 ) ) ;
    public final void rule__COLOR_SPEC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2292:1: ( ( ( rule__COLOR_SPEC__RedAssignment_0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2293:1: ( ( rule__COLOR_SPEC__RedAssignment_0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2293:1: ( ( rule__COLOR_SPEC__RedAssignment_0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2294:1: ( rule__COLOR_SPEC__RedAssignment_0 )
            {
             before(grammarAccess.getCOLOR_SPECAccess().getRedAssignment_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2295:1: ( rule__COLOR_SPEC__RedAssignment_0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2295:2: rule__COLOR_SPEC__RedAssignment_0
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__RedAssignment_0_in_rule__COLOR_SPEC__Group__0__Impl4857);
            rule__COLOR_SPEC__RedAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCOLOR_SPECAccess().getRedAssignment_0()); 

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
    // $ANTLR end "rule__COLOR_SPEC__Group__0__Impl"


    // $ANTLR start "rule__COLOR_SPEC__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2305:1: rule__COLOR_SPEC__Group__1 : rule__COLOR_SPEC__Group__1__Impl rule__COLOR_SPEC__Group__2 ;
    public final void rule__COLOR_SPEC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2309:1: ( rule__COLOR_SPEC__Group__1__Impl rule__COLOR_SPEC__Group__2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2310:2: rule__COLOR_SPEC__Group__1__Impl rule__COLOR_SPEC__Group__2
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__Group__1__Impl_in_rule__COLOR_SPEC__Group__14887);
            rule__COLOR_SPEC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__COLOR_SPEC__Group__2_in_rule__COLOR_SPEC__Group__14890);
            rule__COLOR_SPEC__Group__2();

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
    // $ANTLR end "rule__COLOR_SPEC__Group__1"


    // $ANTLR start "rule__COLOR_SPEC__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2317:1: rule__COLOR_SPEC__Group__1__Impl : ( ( rule__COLOR_SPEC__GreenAssignment_1 ) ) ;
    public final void rule__COLOR_SPEC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2321:1: ( ( ( rule__COLOR_SPEC__GreenAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2322:1: ( ( rule__COLOR_SPEC__GreenAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2322:1: ( ( rule__COLOR_SPEC__GreenAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2323:1: ( rule__COLOR_SPEC__GreenAssignment_1 )
            {
             before(grammarAccess.getCOLOR_SPECAccess().getGreenAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2324:1: ( rule__COLOR_SPEC__GreenAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2324:2: rule__COLOR_SPEC__GreenAssignment_1
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__GreenAssignment_1_in_rule__COLOR_SPEC__Group__1__Impl4917);
            rule__COLOR_SPEC__GreenAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCOLOR_SPECAccess().getGreenAssignment_1()); 

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
    // $ANTLR end "rule__COLOR_SPEC__Group__1__Impl"


    // $ANTLR start "rule__COLOR_SPEC__Group__2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2334:1: rule__COLOR_SPEC__Group__2 : rule__COLOR_SPEC__Group__2__Impl rule__COLOR_SPEC__Group__3 ;
    public final void rule__COLOR_SPEC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2338:1: ( rule__COLOR_SPEC__Group__2__Impl rule__COLOR_SPEC__Group__3 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2339:2: rule__COLOR_SPEC__Group__2__Impl rule__COLOR_SPEC__Group__3
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__Group__2__Impl_in_rule__COLOR_SPEC__Group__24947);
            rule__COLOR_SPEC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__COLOR_SPEC__Group__3_in_rule__COLOR_SPEC__Group__24950);
            rule__COLOR_SPEC__Group__3();

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
    // $ANTLR end "rule__COLOR_SPEC__Group__2"


    // $ANTLR start "rule__COLOR_SPEC__Group__2__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2346:1: rule__COLOR_SPEC__Group__2__Impl : ( ( rule__COLOR_SPEC__BlueAssignment_2 ) ) ;
    public final void rule__COLOR_SPEC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2350:1: ( ( ( rule__COLOR_SPEC__BlueAssignment_2 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2351:1: ( ( rule__COLOR_SPEC__BlueAssignment_2 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2351:1: ( ( rule__COLOR_SPEC__BlueAssignment_2 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2352:1: ( rule__COLOR_SPEC__BlueAssignment_2 )
            {
             before(grammarAccess.getCOLOR_SPECAccess().getBlueAssignment_2()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2353:1: ( rule__COLOR_SPEC__BlueAssignment_2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2353:2: rule__COLOR_SPEC__BlueAssignment_2
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__BlueAssignment_2_in_rule__COLOR_SPEC__Group__2__Impl4977);
            rule__COLOR_SPEC__BlueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCOLOR_SPECAccess().getBlueAssignment_2()); 

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
    // $ANTLR end "rule__COLOR_SPEC__Group__2__Impl"


    // $ANTLR start "rule__COLOR_SPEC__Group__3"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2363:1: rule__COLOR_SPEC__Group__3 : rule__COLOR_SPEC__Group__3__Impl ;
    public final void rule__COLOR_SPEC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2367:1: ( rule__COLOR_SPEC__Group__3__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2368:2: rule__COLOR_SPEC__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__Group__3__Impl_in_rule__COLOR_SPEC__Group__35007);
            rule__COLOR_SPEC__Group__3__Impl();

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
    // $ANTLR end "rule__COLOR_SPEC__Group__3"


    // $ANTLR start "rule__COLOR_SPEC__Group__3__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2374:1: rule__COLOR_SPEC__Group__3__Impl : ( ( rule__COLOR_SPEC__AlphaAssignment_3 ) ) ;
    public final void rule__COLOR_SPEC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2378:1: ( ( ( rule__COLOR_SPEC__AlphaAssignment_3 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2379:1: ( ( rule__COLOR_SPEC__AlphaAssignment_3 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2379:1: ( ( rule__COLOR_SPEC__AlphaAssignment_3 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2380:1: ( rule__COLOR_SPEC__AlphaAssignment_3 )
            {
             before(grammarAccess.getCOLOR_SPECAccess().getAlphaAssignment_3()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2381:1: ( rule__COLOR_SPEC__AlphaAssignment_3 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2381:2: rule__COLOR_SPEC__AlphaAssignment_3
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__AlphaAssignment_3_in_rule__COLOR_SPEC__Group__3__Impl5034);
            rule__COLOR_SPEC__AlphaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCOLOR_SPECAccess().getAlphaAssignment_3()); 

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
    // $ANTLR end "rule__COLOR_SPEC__Group__3__Impl"


    // $ANTLR start "rule__FONT_STYLE__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2399:1: rule__FONT_STYLE__Group__0 : rule__FONT_STYLE__Group__0__Impl rule__FONT_STYLE__Group__1 ;
    public final void rule__FONT_STYLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2403:1: ( rule__FONT_STYLE__Group__0__Impl rule__FONT_STYLE__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2404:2: rule__FONT_STYLE__Group__0__Impl rule__FONT_STYLE__Group__1
            {
            pushFollow(FOLLOW_rule__FONT_STYLE__Group__0__Impl_in_rule__FONT_STYLE__Group__05072);
            rule__FONT_STYLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FONT_STYLE__Group__1_in_rule__FONT_STYLE__Group__05075);
            rule__FONT_STYLE__Group__1();

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
    // $ANTLR end "rule__FONT_STYLE__Group__0"


    // $ANTLR start "rule__FONT_STYLE__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2411:1: rule__FONT_STYLE__Group__0__Impl : ( 'FONTSTYLE' ) ;
    public final void rule__FONT_STYLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2415:1: ( ( 'FONTSTYLE' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2416:1: ( 'FONTSTYLE' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2416:1: ( 'FONTSTYLE' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2417:1: 'FONTSTYLE'
            {
             before(grammarAccess.getFONT_STYLEAccess().getFONTSTYLEKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__FONT_STYLE__Group__0__Impl5103); 
             after(grammarAccess.getFONT_STYLEAccess().getFONTSTYLEKeyword_0()); 

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
    // $ANTLR end "rule__FONT_STYLE__Group__0__Impl"


    // $ANTLR start "rule__FONT_STYLE__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2430:1: rule__FONT_STYLE__Group__1 : rule__FONT_STYLE__Group__1__Impl ;
    public final void rule__FONT_STYLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2434:1: ( rule__FONT_STYLE__Group__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2435:2: rule__FONT_STYLE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FONT_STYLE__Group__1__Impl_in_rule__FONT_STYLE__Group__15134);
            rule__FONT_STYLE__Group__1__Impl();

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
    // $ANTLR end "rule__FONT_STYLE__Group__1"


    // $ANTLR start "rule__FONT_STYLE__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2441:1: rule__FONT_STYLE__Group__1__Impl : ( ( rule__FONT_STYLE__StyleAssignment_1 ) ) ;
    public final void rule__FONT_STYLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2445:1: ( ( ( rule__FONT_STYLE__StyleAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2446:1: ( ( rule__FONT_STYLE__StyleAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2446:1: ( ( rule__FONT_STYLE__StyleAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2447:1: ( rule__FONT_STYLE__StyleAssignment_1 )
            {
             before(grammarAccess.getFONT_STYLEAccess().getStyleAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2448:1: ( rule__FONT_STYLE__StyleAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2448:2: rule__FONT_STYLE__StyleAssignment_1
            {
            pushFollow(FOLLOW_rule__FONT_STYLE__StyleAssignment_1_in_rule__FONT_STYLE__Group__1__Impl5161);
            rule__FONT_STYLE__StyleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFONT_STYLEAccess().getStyleAssignment_1()); 

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
    // $ANTLR end "rule__FONT_STYLE__Group__1__Impl"


    // $ANTLR start "rule__FontStyleValues__Group_0__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2462:1: rule__FontStyleValues__Group_0__0 : rule__FontStyleValues__Group_0__0__Impl rule__FontStyleValues__Group_0__1 ;
    public final void rule__FontStyleValues__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2466:1: ( rule__FontStyleValues__Group_0__0__Impl rule__FontStyleValues__Group_0__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2467:2: rule__FontStyleValues__Group_0__0__Impl rule__FontStyleValues__Group_0__1
            {
            pushFollow(FOLLOW_rule__FontStyleValues__Group_0__0__Impl_in_rule__FontStyleValues__Group_0__05195);
            rule__FontStyleValues__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FontStyleValues__Group_0__1_in_rule__FontStyleValues__Group_0__05198);
            rule__FontStyleValues__Group_0__1();

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
    // $ANTLR end "rule__FontStyleValues__Group_0__0"


    // $ANTLR start "rule__FontStyleValues__Group_0__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2474:1: rule__FontStyleValues__Group_0__0__Impl : ( () ) ;
    public final void rule__FontStyleValues__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2478:1: ( ( () ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2479:1: ( () )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2479:1: ( () )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2480:1: ()
            {
             before(grammarAccess.getFontStyleValuesAccess().getBOLDAction_0_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2481:1: ()
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2483:1: 
            {
            }

             after(grammarAccess.getFontStyleValuesAccess().getBOLDAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontStyleValues__Group_0__0__Impl"


    // $ANTLR start "rule__FontStyleValues__Group_0__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2493:1: rule__FontStyleValues__Group_0__1 : rule__FontStyleValues__Group_0__1__Impl ;
    public final void rule__FontStyleValues__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2497:1: ( rule__FontStyleValues__Group_0__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2498:2: rule__FontStyleValues__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__FontStyleValues__Group_0__1__Impl_in_rule__FontStyleValues__Group_0__15256);
            rule__FontStyleValues__Group_0__1__Impl();

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
    // $ANTLR end "rule__FontStyleValues__Group_0__1"


    // $ANTLR start "rule__FontStyleValues__Group_0__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2504:1: rule__FontStyleValues__Group_0__1__Impl : ( 'BOLD' ) ;
    public final void rule__FontStyleValues__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2508:1: ( ( 'BOLD' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2509:1: ( 'BOLD' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2509:1: ( 'BOLD' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2510:1: 'BOLD'
            {
             before(grammarAccess.getFontStyleValuesAccess().getBOLDKeyword_0_1()); 
            match(input,35,FOLLOW_35_in_rule__FontStyleValues__Group_0__1__Impl5284); 
             after(grammarAccess.getFontStyleValuesAccess().getBOLDKeyword_0_1()); 

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
    // $ANTLR end "rule__FontStyleValues__Group_0__1__Impl"


    // $ANTLR start "rule__FontStyleValues__Group_1__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2527:1: rule__FontStyleValues__Group_1__0 : rule__FontStyleValues__Group_1__0__Impl rule__FontStyleValues__Group_1__1 ;
    public final void rule__FontStyleValues__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2531:1: ( rule__FontStyleValues__Group_1__0__Impl rule__FontStyleValues__Group_1__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2532:2: rule__FontStyleValues__Group_1__0__Impl rule__FontStyleValues__Group_1__1
            {
            pushFollow(FOLLOW_rule__FontStyleValues__Group_1__0__Impl_in_rule__FontStyleValues__Group_1__05319);
            rule__FontStyleValues__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FontStyleValues__Group_1__1_in_rule__FontStyleValues__Group_1__05322);
            rule__FontStyleValues__Group_1__1();

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
    // $ANTLR end "rule__FontStyleValues__Group_1__0"


    // $ANTLR start "rule__FontStyleValues__Group_1__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2539:1: rule__FontStyleValues__Group_1__0__Impl : ( () ) ;
    public final void rule__FontStyleValues__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2543:1: ( ( () ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2544:1: ( () )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2544:1: ( () )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2545:1: ()
            {
             before(grammarAccess.getFontStyleValuesAccess().getITALICAction_1_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2546:1: ()
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2548:1: 
            {
            }

             after(grammarAccess.getFontStyleValuesAccess().getITALICAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontStyleValues__Group_1__0__Impl"


    // $ANTLR start "rule__FontStyleValues__Group_1__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2558:1: rule__FontStyleValues__Group_1__1 : rule__FontStyleValues__Group_1__1__Impl ;
    public final void rule__FontStyleValues__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2562:1: ( rule__FontStyleValues__Group_1__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2563:2: rule__FontStyleValues__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FontStyleValues__Group_1__1__Impl_in_rule__FontStyleValues__Group_1__15380);
            rule__FontStyleValues__Group_1__1__Impl();

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
    // $ANTLR end "rule__FontStyleValues__Group_1__1"


    // $ANTLR start "rule__FontStyleValues__Group_1__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2569:1: rule__FontStyleValues__Group_1__1__Impl : ( 'ITALIC' ) ;
    public final void rule__FontStyleValues__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2573:1: ( ( 'ITALIC' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2574:1: ( 'ITALIC' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2574:1: ( 'ITALIC' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2575:1: 'ITALIC'
            {
             before(grammarAccess.getFontStyleValuesAccess().getITALICKeyword_1_1()); 
            match(input,36,FOLLOW_36_in_rule__FontStyleValues__Group_1__1__Impl5408); 
             after(grammarAccess.getFontStyleValuesAccess().getITALICKeyword_1_1()); 

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
    // $ANTLR end "rule__FontStyleValues__Group_1__1__Impl"


    // $ANTLR start "rule__FontStyleValues__Group_2__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2592:1: rule__FontStyleValues__Group_2__0 : rule__FontStyleValues__Group_2__0__Impl rule__FontStyleValues__Group_2__1 ;
    public final void rule__FontStyleValues__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2596:1: ( rule__FontStyleValues__Group_2__0__Impl rule__FontStyleValues__Group_2__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2597:2: rule__FontStyleValues__Group_2__0__Impl rule__FontStyleValues__Group_2__1
            {
            pushFollow(FOLLOW_rule__FontStyleValues__Group_2__0__Impl_in_rule__FontStyleValues__Group_2__05443);
            rule__FontStyleValues__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FontStyleValues__Group_2__1_in_rule__FontStyleValues__Group_2__05446);
            rule__FontStyleValues__Group_2__1();

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
    // $ANTLR end "rule__FontStyleValues__Group_2__0"


    // $ANTLR start "rule__FontStyleValues__Group_2__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2604:1: rule__FontStyleValues__Group_2__0__Impl : ( () ) ;
    public final void rule__FontStyleValues__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2608:1: ( ( () ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2609:1: ( () )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2609:1: ( () )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2610:1: ()
            {
             before(grammarAccess.getFontStyleValuesAccess().getPLAINAction_2_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2611:1: ()
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2613:1: 
            {
            }

             after(grammarAccess.getFontStyleValuesAccess().getPLAINAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontStyleValues__Group_2__0__Impl"


    // $ANTLR start "rule__FontStyleValues__Group_2__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2623:1: rule__FontStyleValues__Group_2__1 : rule__FontStyleValues__Group_2__1__Impl ;
    public final void rule__FontStyleValues__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2627:1: ( rule__FontStyleValues__Group_2__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2628:2: rule__FontStyleValues__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FontStyleValues__Group_2__1__Impl_in_rule__FontStyleValues__Group_2__15504);
            rule__FontStyleValues__Group_2__1__Impl();

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
    // $ANTLR end "rule__FontStyleValues__Group_2__1"


    // $ANTLR start "rule__FontStyleValues__Group_2__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2634:1: rule__FontStyleValues__Group_2__1__Impl : ( 'PLAIN' ) ;
    public final void rule__FontStyleValues__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2638:1: ( ( 'PLAIN' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2639:1: ( 'PLAIN' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2639:1: ( 'PLAIN' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2640:1: 'PLAIN'
            {
             before(grammarAccess.getFontStyleValuesAccess().getPLAINKeyword_2_1()); 
            match(input,37,FOLLOW_37_in_rule__FontStyleValues__Group_2__1__Impl5532); 
             after(grammarAccess.getFontStyleValuesAccess().getPLAINKeyword_2_1()); 

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
    // $ANTLR end "rule__FontStyleValues__Group_2__1__Impl"


    // $ANTLR start "rule__CLEAR__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2657:1: rule__CLEAR__Group__0 : rule__CLEAR__Group__0__Impl rule__CLEAR__Group__1 ;
    public final void rule__CLEAR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2661:1: ( rule__CLEAR__Group__0__Impl rule__CLEAR__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2662:2: rule__CLEAR__Group__0__Impl rule__CLEAR__Group__1
            {
            pushFollow(FOLLOW_rule__CLEAR__Group__0__Impl_in_rule__CLEAR__Group__05567);
            rule__CLEAR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLEAR__Group__1_in_rule__CLEAR__Group__05570);
            rule__CLEAR__Group__1();

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
    // $ANTLR end "rule__CLEAR__Group__0"


    // $ANTLR start "rule__CLEAR__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2669:1: rule__CLEAR__Group__0__Impl : ( () ) ;
    public final void rule__CLEAR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2673:1: ( ( () ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2674:1: ( () )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2674:1: ( () )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2675:1: ()
            {
             before(grammarAccess.getCLEARAccess().getCLEARAction_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2676:1: ()
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2678:1: 
            {
            }

             after(grammarAccess.getCLEARAccess().getCLEARAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLEAR__Group__0__Impl"


    // $ANTLR start "rule__CLEAR__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2688:1: rule__CLEAR__Group__1 : rule__CLEAR__Group__1__Impl ;
    public final void rule__CLEAR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2692:1: ( rule__CLEAR__Group__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2693:2: rule__CLEAR__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CLEAR__Group__1__Impl_in_rule__CLEAR__Group__15628);
            rule__CLEAR__Group__1__Impl();

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
    // $ANTLR end "rule__CLEAR__Group__1"


    // $ANTLR start "rule__CLEAR__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2699:1: rule__CLEAR__Group__1__Impl : ( 'CLEAR' ) ;
    public final void rule__CLEAR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2703:1: ( ( 'CLEAR' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2704:1: ( 'CLEAR' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2704:1: ( 'CLEAR' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2705:1: 'CLEAR'
            {
             before(grammarAccess.getCLEARAccess().getCLEARKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__CLEAR__Group__1__Impl5656); 
             after(grammarAccess.getCLEARAccess().getCLEARKeyword_1()); 

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
    // $ANTLR end "rule__CLEAR__Group__1__Impl"


    // $ANTLR start "rule__HOME__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2722:1: rule__HOME__Group__0 : rule__HOME__Group__0__Impl rule__HOME__Group__1 ;
    public final void rule__HOME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2726:1: ( rule__HOME__Group__0__Impl rule__HOME__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2727:2: rule__HOME__Group__0__Impl rule__HOME__Group__1
            {
            pushFollow(FOLLOW_rule__HOME__Group__0__Impl_in_rule__HOME__Group__05691);
            rule__HOME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HOME__Group__1_in_rule__HOME__Group__05694);
            rule__HOME__Group__1();

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
    // $ANTLR end "rule__HOME__Group__0"


    // $ANTLR start "rule__HOME__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2734:1: rule__HOME__Group__0__Impl : ( () ) ;
    public final void rule__HOME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2738:1: ( ( () ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2739:1: ( () )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2739:1: ( () )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2740:1: ()
            {
             before(grammarAccess.getHOMEAccess().getHOMEAction_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2741:1: ()
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2743:1: 
            {
            }

             after(grammarAccess.getHOMEAccess().getHOMEAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOME__Group__0__Impl"


    // $ANTLR start "rule__HOME__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2753:1: rule__HOME__Group__1 : rule__HOME__Group__1__Impl ;
    public final void rule__HOME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2757:1: ( rule__HOME__Group__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2758:2: rule__HOME__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__HOME__Group__1__Impl_in_rule__HOME__Group__15752);
            rule__HOME__Group__1__Impl();

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
    // $ANTLR end "rule__HOME__Group__1"


    // $ANTLR start "rule__HOME__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2764:1: rule__HOME__Group__1__Impl : ( 'HOME' ) ;
    public final void rule__HOME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2768:1: ( ( 'HOME' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2769:1: ( 'HOME' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2769:1: ( 'HOME' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2770:1: 'HOME'
            {
             before(grammarAccess.getHOMEAccess().getHOMEKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__HOME__Group__1__Impl5780); 
             after(grammarAccess.getHOMEAccess().getHOMEKeyword_1()); 

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
    // $ANTLR end "rule__HOME__Group__1__Impl"


    // $ANTLR start "rule__DRAW_STRING__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2787:1: rule__DRAW_STRING__Group__0 : rule__DRAW_STRING__Group__0__Impl rule__DRAW_STRING__Group__1 ;
    public final void rule__DRAW_STRING__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2791:1: ( rule__DRAW_STRING__Group__0__Impl rule__DRAW_STRING__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2792:2: rule__DRAW_STRING__Group__0__Impl rule__DRAW_STRING__Group__1
            {
            pushFollow(FOLLOW_rule__DRAW_STRING__Group__0__Impl_in_rule__DRAW_STRING__Group__05815);
            rule__DRAW_STRING__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DRAW_STRING__Group__1_in_rule__DRAW_STRING__Group__05818);
            rule__DRAW_STRING__Group__1();

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
    // $ANTLR end "rule__DRAW_STRING__Group__0"


    // $ANTLR start "rule__DRAW_STRING__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2799:1: rule__DRAW_STRING__Group__0__Impl : ( 'DRAWSTRING' ) ;
    public final void rule__DRAW_STRING__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2803:1: ( ( 'DRAWSTRING' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2804:1: ( 'DRAWSTRING' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2804:1: ( 'DRAWSTRING' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2805:1: 'DRAWSTRING'
            {
             before(grammarAccess.getDRAW_STRINGAccess().getDRAWSTRINGKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__DRAW_STRING__Group__0__Impl5846); 
             after(grammarAccess.getDRAW_STRINGAccess().getDRAWSTRINGKeyword_0()); 

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
    // $ANTLR end "rule__DRAW_STRING__Group__0__Impl"


    // $ANTLR start "rule__DRAW_STRING__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2818:1: rule__DRAW_STRING__Group__1 : rule__DRAW_STRING__Group__1__Impl ;
    public final void rule__DRAW_STRING__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2822:1: ( rule__DRAW_STRING__Group__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2823:2: rule__DRAW_STRING__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DRAW_STRING__Group__1__Impl_in_rule__DRAW_STRING__Group__15877);
            rule__DRAW_STRING__Group__1__Impl();

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
    // $ANTLR end "rule__DRAW_STRING__Group__1"


    // $ANTLR start "rule__DRAW_STRING__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2829:1: rule__DRAW_STRING__Group__1__Impl : ( ( rule__DRAW_STRING__TextAssignment_1 ) ) ;
    public final void rule__DRAW_STRING__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2833:1: ( ( ( rule__DRAW_STRING__TextAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2834:1: ( ( rule__DRAW_STRING__TextAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2834:1: ( ( rule__DRAW_STRING__TextAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2835:1: ( rule__DRAW_STRING__TextAssignment_1 )
            {
             before(grammarAccess.getDRAW_STRINGAccess().getTextAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2836:1: ( rule__DRAW_STRING__TextAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2836:2: rule__DRAW_STRING__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__DRAW_STRING__TextAssignment_1_in_rule__DRAW_STRING__Group__1__Impl5904);
            rule__DRAW_STRING__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDRAW_STRINGAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__DRAW_STRING__Group__1__Impl"


    // $ANTLR start "rule__MAKE__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2850:1: rule__MAKE__Group__0 : rule__MAKE__Group__0__Impl rule__MAKE__Group__1 ;
    public final void rule__MAKE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2854:1: ( rule__MAKE__Group__0__Impl rule__MAKE__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2855:2: rule__MAKE__Group__0__Impl rule__MAKE__Group__1
            {
            pushFollow(FOLLOW_rule__MAKE__Group__0__Impl_in_rule__MAKE__Group__05938);
            rule__MAKE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MAKE__Group__1_in_rule__MAKE__Group__05941);
            rule__MAKE__Group__1();

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
    // $ANTLR end "rule__MAKE__Group__0"


    // $ANTLR start "rule__MAKE__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2862:1: rule__MAKE__Group__0__Impl : ( 'MAKE' ) ;
    public final void rule__MAKE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2866:1: ( ( 'MAKE' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2867:1: ( 'MAKE' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2867:1: ( 'MAKE' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2868:1: 'MAKE'
            {
             before(grammarAccess.getMAKEAccess().getMAKEKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__MAKE__Group__0__Impl5969); 
             after(grammarAccess.getMAKEAccess().getMAKEKeyword_0()); 

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
    // $ANTLR end "rule__MAKE__Group__0__Impl"


    // $ANTLR start "rule__MAKE__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2881:1: rule__MAKE__Group__1 : rule__MAKE__Group__1__Impl rule__MAKE__Group__2 ;
    public final void rule__MAKE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2885:1: ( rule__MAKE__Group__1__Impl rule__MAKE__Group__2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2886:2: rule__MAKE__Group__1__Impl rule__MAKE__Group__2
            {
            pushFollow(FOLLOW_rule__MAKE__Group__1__Impl_in_rule__MAKE__Group__16000);
            rule__MAKE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MAKE__Group__2_in_rule__MAKE__Group__16003);
            rule__MAKE__Group__2();

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
    // $ANTLR end "rule__MAKE__Group__1"


    // $ANTLR start "rule__MAKE__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2893:1: rule__MAKE__Group__1__Impl : ( ( rule__MAKE__NameAssignment_1 ) ) ;
    public final void rule__MAKE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2897:1: ( ( ( rule__MAKE__NameAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2898:1: ( ( rule__MAKE__NameAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2898:1: ( ( rule__MAKE__NameAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2899:1: ( rule__MAKE__NameAssignment_1 )
            {
             before(grammarAccess.getMAKEAccess().getNameAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2900:1: ( rule__MAKE__NameAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2900:2: rule__MAKE__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MAKE__NameAssignment_1_in_rule__MAKE__Group__1__Impl6030);
            rule__MAKE__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMAKEAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MAKE__Group__1__Impl"


    // $ANTLR start "rule__MAKE__Group__2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2910:1: rule__MAKE__Group__2 : rule__MAKE__Group__2__Impl rule__MAKE__Group__3 ;
    public final void rule__MAKE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2914:1: ( rule__MAKE__Group__2__Impl rule__MAKE__Group__3 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2915:2: rule__MAKE__Group__2__Impl rule__MAKE__Group__3
            {
            pushFollow(FOLLOW_rule__MAKE__Group__2__Impl_in_rule__MAKE__Group__26060);
            rule__MAKE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MAKE__Group__3_in_rule__MAKE__Group__26063);
            rule__MAKE__Group__3();

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
    // $ANTLR end "rule__MAKE__Group__2"


    // $ANTLR start "rule__MAKE__Group__2__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2922:1: rule__MAKE__Group__2__Impl : ( '=' ) ;
    public final void rule__MAKE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2926:1: ( ( '=' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2927:1: ( '=' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2927:1: ( '=' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2928:1: '='
            {
             before(grammarAccess.getMAKEAccess().getEqualsSignKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__MAKE__Group__2__Impl6091); 
             after(grammarAccess.getMAKEAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__MAKE__Group__2__Impl"


    // $ANTLR start "rule__MAKE__Group__3"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2941:1: rule__MAKE__Group__3 : rule__MAKE__Group__3__Impl ;
    public final void rule__MAKE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2945:1: ( rule__MAKE__Group__3__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2946:2: rule__MAKE__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MAKE__Group__3__Impl_in_rule__MAKE__Group__36122);
            rule__MAKE__Group__3__Impl();

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
    // $ANTLR end "rule__MAKE__Group__3"


    // $ANTLR start "rule__MAKE__Group__3__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2952:1: rule__MAKE__Group__3__Impl : ( ( rule__MAKE__ValueAssignment_3 ) ) ;
    public final void rule__MAKE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2956:1: ( ( ( rule__MAKE__ValueAssignment_3 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2957:1: ( ( rule__MAKE__ValueAssignment_3 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2957:1: ( ( rule__MAKE__ValueAssignment_3 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2958:1: ( rule__MAKE__ValueAssignment_3 )
            {
             before(grammarAccess.getMAKEAccess().getValueAssignment_3()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2959:1: ( rule__MAKE__ValueAssignment_3 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2959:2: rule__MAKE__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__MAKE__ValueAssignment_3_in_rule__MAKE__Group__3__Impl6149);
            rule__MAKE__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMAKEAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__MAKE__Group__3__Impl"


    // $ANTLR start "rule__CONTENT__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2977:1: rule__CONTENT__Group__0 : rule__CONTENT__Group__0__Impl rule__CONTENT__Group__1 ;
    public final void rule__CONTENT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2981:1: ( rule__CONTENT__Group__0__Impl rule__CONTENT__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2982:2: rule__CONTENT__Group__0__Impl rule__CONTENT__Group__1
            {
            pushFollow(FOLLOW_rule__CONTENT__Group__0__Impl_in_rule__CONTENT__Group__06187);
            rule__CONTENT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CONTENT__Group__1_in_rule__CONTENT__Group__06190);
            rule__CONTENT__Group__1();

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
    // $ANTLR end "rule__CONTENT__Group__0"


    // $ANTLR start "rule__CONTENT__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2989:1: rule__CONTENT__Group__0__Impl : ( 'CONTENT' ) ;
    public final void rule__CONTENT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2993:1: ( ( 'CONTENT' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2994:1: ( 'CONTENT' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2994:1: ( 'CONTENT' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:2995:1: 'CONTENT'
            {
             before(grammarAccess.getCONTENTAccess().getCONTENTKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__CONTENT__Group__0__Impl6218); 
             after(grammarAccess.getCONTENTAccess().getCONTENTKeyword_0()); 

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
    // $ANTLR end "rule__CONTENT__Group__0__Impl"


    // $ANTLR start "rule__CONTENT__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3008:1: rule__CONTENT__Group__1 : rule__CONTENT__Group__1__Impl ;
    public final void rule__CONTENT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3012:1: ( rule__CONTENT__Group__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3013:2: rule__CONTENT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CONTENT__Group__1__Impl_in_rule__CONTENT__Group__16249);
            rule__CONTENT__Group__1__Impl();

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
    // $ANTLR end "rule__CONTENT__Group__1"


    // $ANTLR start "rule__CONTENT__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3019:1: rule__CONTENT__Group__1__Impl : ( ( rule__CONTENT__VarAssignment_1 ) ) ;
    public final void rule__CONTENT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3023:1: ( ( ( rule__CONTENT__VarAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3024:1: ( ( rule__CONTENT__VarAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3024:1: ( ( rule__CONTENT__VarAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3025:1: ( rule__CONTENT__VarAssignment_1 )
            {
             before(grammarAccess.getCONTENTAccess().getVarAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3026:1: ( rule__CONTENT__VarAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3026:2: rule__CONTENT__VarAssignment_1
            {
            pushFollow(FOLLOW_rule__CONTENT__VarAssignment_1_in_rule__CONTENT__Group__1__Impl6276);
            rule__CONTENT__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCONTENTAccess().getVarAssignment_1()); 

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
    // $ANTLR end "rule__CONTENT__Group__1__Impl"


    // $ANTLR start "rule__SUM__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3040:1: rule__SUM__Group__0 : rule__SUM__Group__0__Impl rule__SUM__Group__1 ;
    public final void rule__SUM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3044:1: ( rule__SUM__Group__0__Impl rule__SUM__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3045:2: rule__SUM__Group__0__Impl rule__SUM__Group__1
            {
            pushFollow(FOLLOW_rule__SUM__Group__0__Impl_in_rule__SUM__Group__06310);
            rule__SUM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUM__Group__1_in_rule__SUM__Group__06313);
            rule__SUM__Group__1();

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
    // $ANTLR end "rule__SUM__Group__0"


    // $ANTLR start "rule__SUM__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3052:1: rule__SUM__Group__0__Impl : ( 'SUM' ) ;
    public final void rule__SUM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3056:1: ( ( 'SUM' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3057:1: ( 'SUM' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3057:1: ( 'SUM' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3058:1: 'SUM'
            {
             before(grammarAccess.getSUMAccess().getSUMKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__SUM__Group__0__Impl6341); 
             after(grammarAccess.getSUMAccess().getSUMKeyword_0()); 

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
    // $ANTLR end "rule__SUM__Group__0__Impl"


    // $ANTLR start "rule__SUM__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3071:1: rule__SUM__Group__1 : rule__SUM__Group__1__Impl rule__SUM__Group__2 ;
    public final void rule__SUM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3075:1: ( rule__SUM__Group__1__Impl rule__SUM__Group__2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3076:2: rule__SUM__Group__1__Impl rule__SUM__Group__2
            {
            pushFollow(FOLLOW_rule__SUM__Group__1__Impl_in_rule__SUM__Group__16372);
            rule__SUM__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUM__Group__2_in_rule__SUM__Group__16375);
            rule__SUM__Group__2();

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
    // $ANTLR end "rule__SUM__Group__1"


    // $ANTLR start "rule__SUM__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3083:1: rule__SUM__Group__1__Impl : ( ( rule__SUM__TargetVariableAssignment_1 ) ) ;
    public final void rule__SUM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3087:1: ( ( ( rule__SUM__TargetVariableAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3088:1: ( ( rule__SUM__TargetVariableAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3088:1: ( ( rule__SUM__TargetVariableAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3089:1: ( rule__SUM__TargetVariableAssignment_1 )
            {
             before(grammarAccess.getSUMAccess().getTargetVariableAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3090:1: ( rule__SUM__TargetVariableAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3090:2: rule__SUM__TargetVariableAssignment_1
            {
            pushFollow(FOLLOW_rule__SUM__TargetVariableAssignment_1_in_rule__SUM__Group__1__Impl6402);
            rule__SUM__TargetVariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSUMAccess().getTargetVariableAssignment_1()); 

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
    // $ANTLR end "rule__SUM__Group__1__Impl"


    // $ANTLR start "rule__SUM__Group__2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3100:1: rule__SUM__Group__2 : rule__SUM__Group__2__Impl rule__SUM__Group__3 ;
    public final void rule__SUM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3104:1: ( rule__SUM__Group__2__Impl rule__SUM__Group__3 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3105:2: rule__SUM__Group__2__Impl rule__SUM__Group__3
            {
            pushFollow(FOLLOW_rule__SUM__Group__2__Impl_in_rule__SUM__Group__26432);
            rule__SUM__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUM__Group__3_in_rule__SUM__Group__26435);
            rule__SUM__Group__3();

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
    // $ANTLR end "rule__SUM__Group__2"


    // $ANTLR start "rule__SUM__Group__2__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3112:1: rule__SUM__Group__2__Impl : ( '=' ) ;
    public final void rule__SUM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3116:1: ( ( '=' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3117:1: ( '=' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3117:1: ( '=' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3118:1: '='
            {
             before(grammarAccess.getSUMAccess().getEqualsSignKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__SUM__Group__2__Impl6463); 
             after(grammarAccess.getSUMAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__SUM__Group__2__Impl"


    // $ANTLR start "rule__SUM__Group__3"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3131:1: rule__SUM__Group__3 : rule__SUM__Group__3__Impl rule__SUM__Group__4 ;
    public final void rule__SUM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3135:1: ( rule__SUM__Group__3__Impl rule__SUM__Group__4 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3136:2: rule__SUM__Group__3__Impl rule__SUM__Group__4
            {
            pushFollow(FOLLOW_rule__SUM__Group__3__Impl_in_rule__SUM__Group__36494);
            rule__SUM__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUM__Group__4_in_rule__SUM__Group__36497);
            rule__SUM__Group__4();

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
    // $ANTLR end "rule__SUM__Group__3"


    // $ANTLR start "rule__SUM__Group__3__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3143:1: rule__SUM__Group__3__Impl : ( ( rule__SUM__ValOneAssignment_3 ) ) ;
    public final void rule__SUM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3147:1: ( ( ( rule__SUM__ValOneAssignment_3 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3148:1: ( ( rule__SUM__ValOneAssignment_3 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3148:1: ( ( rule__SUM__ValOneAssignment_3 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3149:1: ( rule__SUM__ValOneAssignment_3 )
            {
             before(grammarAccess.getSUMAccess().getValOneAssignment_3()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3150:1: ( rule__SUM__ValOneAssignment_3 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3150:2: rule__SUM__ValOneAssignment_3
            {
            pushFollow(FOLLOW_rule__SUM__ValOneAssignment_3_in_rule__SUM__Group__3__Impl6524);
            rule__SUM__ValOneAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSUMAccess().getValOneAssignment_3()); 

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
    // $ANTLR end "rule__SUM__Group__3__Impl"


    // $ANTLR start "rule__SUM__Group__4"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3160:1: rule__SUM__Group__4 : rule__SUM__Group__4__Impl rule__SUM__Group__5 ;
    public final void rule__SUM__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3164:1: ( rule__SUM__Group__4__Impl rule__SUM__Group__5 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3165:2: rule__SUM__Group__4__Impl rule__SUM__Group__5
            {
            pushFollow(FOLLOW_rule__SUM__Group__4__Impl_in_rule__SUM__Group__46554);
            rule__SUM__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUM__Group__5_in_rule__SUM__Group__46557);
            rule__SUM__Group__5();

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
    // $ANTLR end "rule__SUM__Group__4"


    // $ANTLR start "rule__SUM__Group__4__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3172:1: rule__SUM__Group__4__Impl : ( '+' ) ;
    public final void rule__SUM__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3176:1: ( ( '+' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3177:1: ( '+' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3177:1: ( '+' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3178:1: '+'
            {
             before(grammarAccess.getSUMAccess().getPlusSignKeyword_4()); 
            match(input,45,FOLLOW_45_in_rule__SUM__Group__4__Impl6585); 
             after(grammarAccess.getSUMAccess().getPlusSignKeyword_4()); 

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
    // $ANTLR end "rule__SUM__Group__4__Impl"


    // $ANTLR start "rule__SUM__Group__5"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3191:1: rule__SUM__Group__5 : rule__SUM__Group__5__Impl ;
    public final void rule__SUM__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3195:1: ( rule__SUM__Group__5__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3196:2: rule__SUM__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SUM__Group__5__Impl_in_rule__SUM__Group__56616);
            rule__SUM__Group__5__Impl();

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
    // $ANTLR end "rule__SUM__Group__5"


    // $ANTLR start "rule__SUM__Group__5__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3202:1: rule__SUM__Group__5__Impl : ( ( rule__SUM__ValTwoAssignment_5 ) ) ;
    public final void rule__SUM__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3206:1: ( ( ( rule__SUM__ValTwoAssignment_5 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3207:1: ( ( rule__SUM__ValTwoAssignment_5 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3207:1: ( ( rule__SUM__ValTwoAssignment_5 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3208:1: ( rule__SUM__ValTwoAssignment_5 )
            {
             before(grammarAccess.getSUMAccess().getValTwoAssignment_5()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3209:1: ( rule__SUM__ValTwoAssignment_5 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3209:2: rule__SUM__ValTwoAssignment_5
            {
            pushFollow(FOLLOW_rule__SUM__ValTwoAssignment_5_in_rule__SUM__Group__5__Impl6643);
            rule__SUM__ValTwoAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSUMAccess().getValTwoAssignment_5()); 

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
    // $ANTLR end "rule__SUM__Group__5__Impl"


    // $ANTLR start "rule__SUBTRACT__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3231:1: rule__SUBTRACT__Group__0 : rule__SUBTRACT__Group__0__Impl rule__SUBTRACT__Group__1 ;
    public final void rule__SUBTRACT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3235:1: ( rule__SUBTRACT__Group__0__Impl rule__SUBTRACT__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3236:2: rule__SUBTRACT__Group__0__Impl rule__SUBTRACT__Group__1
            {
            pushFollow(FOLLOW_rule__SUBTRACT__Group__0__Impl_in_rule__SUBTRACT__Group__06685);
            rule__SUBTRACT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUBTRACT__Group__1_in_rule__SUBTRACT__Group__06688);
            rule__SUBTRACT__Group__1();

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
    // $ANTLR end "rule__SUBTRACT__Group__0"


    // $ANTLR start "rule__SUBTRACT__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3243:1: rule__SUBTRACT__Group__0__Impl : ( 'SUBTRACT' ) ;
    public final void rule__SUBTRACT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3247:1: ( ( 'SUBTRACT' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3248:1: ( 'SUBTRACT' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3248:1: ( 'SUBTRACT' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3249:1: 'SUBTRACT'
            {
             before(grammarAccess.getSUBTRACTAccess().getSUBTRACTKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__SUBTRACT__Group__0__Impl6716); 
             after(grammarAccess.getSUBTRACTAccess().getSUBTRACTKeyword_0()); 

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
    // $ANTLR end "rule__SUBTRACT__Group__0__Impl"


    // $ANTLR start "rule__SUBTRACT__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3262:1: rule__SUBTRACT__Group__1 : rule__SUBTRACT__Group__1__Impl rule__SUBTRACT__Group__2 ;
    public final void rule__SUBTRACT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3266:1: ( rule__SUBTRACT__Group__1__Impl rule__SUBTRACT__Group__2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3267:2: rule__SUBTRACT__Group__1__Impl rule__SUBTRACT__Group__2
            {
            pushFollow(FOLLOW_rule__SUBTRACT__Group__1__Impl_in_rule__SUBTRACT__Group__16747);
            rule__SUBTRACT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUBTRACT__Group__2_in_rule__SUBTRACT__Group__16750);
            rule__SUBTRACT__Group__2();

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
    // $ANTLR end "rule__SUBTRACT__Group__1"


    // $ANTLR start "rule__SUBTRACT__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3274:1: rule__SUBTRACT__Group__1__Impl : ( ( rule__SUBTRACT__TargetVariableAssignment_1 ) ) ;
    public final void rule__SUBTRACT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3278:1: ( ( ( rule__SUBTRACT__TargetVariableAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3279:1: ( ( rule__SUBTRACT__TargetVariableAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3279:1: ( ( rule__SUBTRACT__TargetVariableAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3280:1: ( rule__SUBTRACT__TargetVariableAssignment_1 )
            {
             before(grammarAccess.getSUBTRACTAccess().getTargetVariableAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3281:1: ( rule__SUBTRACT__TargetVariableAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3281:2: rule__SUBTRACT__TargetVariableAssignment_1
            {
            pushFollow(FOLLOW_rule__SUBTRACT__TargetVariableAssignment_1_in_rule__SUBTRACT__Group__1__Impl6777);
            rule__SUBTRACT__TargetVariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSUBTRACTAccess().getTargetVariableAssignment_1()); 

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
    // $ANTLR end "rule__SUBTRACT__Group__1__Impl"


    // $ANTLR start "rule__SUBTRACT__Group__2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3291:1: rule__SUBTRACT__Group__2 : rule__SUBTRACT__Group__2__Impl rule__SUBTRACT__Group__3 ;
    public final void rule__SUBTRACT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3295:1: ( rule__SUBTRACT__Group__2__Impl rule__SUBTRACT__Group__3 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3296:2: rule__SUBTRACT__Group__2__Impl rule__SUBTRACT__Group__3
            {
            pushFollow(FOLLOW_rule__SUBTRACT__Group__2__Impl_in_rule__SUBTRACT__Group__26807);
            rule__SUBTRACT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUBTRACT__Group__3_in_rule__SUBTRACT__Group__26810);
            rule__SUBTRACT__Group__3();

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
    // $ANTLR end "rule__SUBTRACT__Group__2"


    // $ANTLR start "rule__SUBTRACT__Group__2__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3303:1: rule__SUBTRACT__Group__2__Impl : ( '=' ) ;
    public final void rule__SUBTRACT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3307:1: ( ( '=' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3308:1: ( '=' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3308:1: ( '=' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3309:1: '='
            {
             before(grammarAccess.getSUBTRACTAccess().getEqualsSignKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__SUBTRACT__Group__2__Impl6838); 
             after(grammarAccess.getSUBTRACTAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__SUBTRACT__Group__2__Impl"


    // $ANTLR start "rule__SUBTRACT__Group__3"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3322:1: rule__SUBTRACT__Group__3 : rule__SUBTRACT__Group__3__Impl rule__SUBTRACT__Group__4 ;
    public final void rule__SUBTRACT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3326:1: ( rule__SUBTRACT__Group__3__Impl rule__SUBTRACT__Group__4 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3327:2: rule__SUBTRACT__Group__3__Impl rule__SUBTRACT__Group__4
            {
            pushFollow(FOLLOW_rule__SUBTRACT__Group__3__Impl_in_rule__SUBTRACT__Group__36869);
            rule__SUBTRACT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUBTRACT__Group__4_in_rule__SUBTRACT__Group__36872);
            rule__SUBTRACT__Group__4();

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
    // $ANTLR end "rule__SUBTRACT__Group__3"


    // $ANTLR start "rule__SUBTRACT__Group__3__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3334:1: rule__SUBTRACT__Group__3__Impl : ( ( rule__SUBTRACT__ValOneAssignment_3 ) ) ;
    public final void rule__SUBTRACT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3338:1: ( ( ( rule__SUBTRACT__ValOneAssignment_3 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3339:1: ( ( rule__SUBTRACT__ValOneAssignment_3 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3339:1: ( ( rule__SUBTRACT__ValOneAssignment_3 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3340:1: ( rule__SUBTRACT__ValOneAssignment_3 )
            {
             before(grammarAccess.getSUBTRACTAccess().getValOneAssignment_3()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3341:1: ( rule__SUBTRACT__ValOneAssignment_3 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3341:2: rule__SUBTRACT__ValOneAssignment_3
            {
            pushFollow(FOLLOW_rule__SUBTRACT__ValOneAssignment_3_in_rule__SUBTRACT__Group__3__Impl6899);
            rule__SUBTRACT__ValOneAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSUBTRACTAccess().getValOneAssignment_3()); 

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
    // $ANTLR end "rule__SUBTRACT__Group__3__Impl"


    // $ANTLR start "rule__SUBTRACT__Group__4"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3351:1: rule__SUBTRACT__Group__4 : rule__SUBTRACT__Group__4__Impl rule__SUBTRACT__Group__5 ;
    public final void rule__SUBTRACT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3355:1: ( rule__SUBTRACT__Group__4__Impl rule__SUBTRACT__Group__5 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3356:2: rule__SUBTRACT__Group__4__Impl rule__SUBTRACT__Group__5
            {
            pushFollow(FOLLOW_rule__SUBTRACT__Group__4__Impl_in_rule__SUBTRACT__Group__46929);
            rule__SUBTRACT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUBTRACT__Group__5_in_rule__SUBTRACT__Group__46932);
            rule__SUBTRACT__Group__5();

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
    // $ANTLR end "rule__SUBTRACT__Group__4"


    // $ANTLR start "rule__SUBTRACT__Group__4__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3363:1: rule__SUBTRACT__Group__4__Impl : ( '-' ) ;
    public final void rule__SUBTRACT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3367:1: ( ( '-' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3368:1: ( '-' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3368:1: ( '-' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3369:1: '-'
            {
             before(grammarAccess.getSUBTRACTAccess().getHyphenMinusKeyword_4()); 
            match(input,47,FOLLOW_47_in_rule__SUBTRACT__Group__4__Impl6960); 
             after(grammarAccess.getSUBTRACTAccess().getHyphenMinusKeyword_4()); 

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
    // $ANTLR end "rule__SUBTRACT__Group__4__Impl"


    // $ANTLR start "rule__SUBTRACT__Group__5"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3382:1: rule__SUBTRACT__Group__5 : rule__SUBTRACT__Group__5__Impl ;
    public final void rule__SUBTRACT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3386:1: ( rule__SUBTRACT__Group__5__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3387:2: rule__SUBTRACT__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SUBTRACT__Group__5__Impl_in_rule__SUBTRACT__Group__56991);
            rule__SUBTRACT__Group__5__Impl();

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
    // $ANTLR end "rule__SUBTRACT__Group__5"


    // $ANTLR start "rule__SUBTRACT__Group__5__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3393:1: rule__SUBTRACT__Group__5__Impl : ( ( rule__SUBTRACT__ValTwoAssignment_5 ) ) ;
    public final void rule__SUBTRACT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3397:1: ( ( ( rule__SUBTRACT__ValTwoAssignment_5 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3398:1: ( ( rule__SUBTRACT__ValTwoAssignment_5 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3398:1: ( ( rule__SUBTRACT__ValTwoAssignment_5 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3399:1: ( rule__SUBTRACT__ValTwoAssignment_5 )
            {
             before(grammarAccess.getSUBTRACTAccess().getValTwoAssignment_5()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3400:1: ( rule__SUBTRACT__ValTwoAssignment_5 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3400:2: rule__SUBTRACT__ValTwoAssignment_5
            {
            pushFollow(FOLLOW_rule__SUBTRACT__ValTwoAssignment_5_in_rule__SUBTRACT__Group__5__Impl7018);
            rule__SUBTRACT__ValTwoAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSUBTRACTAccess().getValTwoAssignment_5()); 

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
    // $ANTLR end "rule__SUBTRACT__Group__5__Impl"


    // $ANTLR start "rule__MULTIPLY__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3422:1: rule__MULTIPLY__Group__0 : rule__MULTIPLY__Group__0__Impl rule__MULTIPLY__Group__1 ;
    public final void rule__MULTIPLY__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3426:1: ( rule__MULTIPLY__Group__0__Impl rule__MULTIPLY__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3427:2: rule__MULTIPLY__Group__0__Impl rule__MULTIPLY__Group__1
            {
            pushFollow(FOLLOW_rule__MULTIPLY__Group__0__Impl_in_rule__MULTIPLY__Group__07060);
            rule__MULTIPLY__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MULTIPLY__Group__1_in_rule__MULTIPLY__Group__07063);
            rule__MULTIPLY__Group__1();

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
    // $ANTLR end "rule__MULTIPLY__Group__0"


    // $ANTLR start "rule__MULTIPLY__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3434:1: rule__MULTIPLY__Group__0__Impl : ( 'MULTIPLY' ) ;
    public final void rule__MULTIPLY__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3438:1: ( ( 'MULTIPLY' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3439:1: ( 'MULTIPLY' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3439:1: ( 'MULTIPLY' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3440:1: 'MULTIPLY'
            {
             before(grammarAccess.getMULTIPLYAccess().getMULTIPLYKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__MULTIPLY__Group__0__Impl7091); 
             after(grammarAccess.getMULTIPLYAccess().getMULTIPLYKeyword_0()); 

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
    // $ANTLR end "rule__MULTIPLY__Group__0__Impl"


    // $ANTLR start "rule__MULTIPLY__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3453:1: rule__MULTIPLY__Group__1 : rule__MULTIPLY__Group__1__Impl rule__MULTIPLY__Group__2 ;
    public final void rule__MULTIPLY__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3457:1: ( rule__MULTIPLY__Group__1__Impl rule__MULTIPLY__Group__2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3458:2: rule__MULTIPLY__Group__1__Impl rule__MULTIPLY__Group__2
            {
            pushFollow(FOLLOW_rule__MULTIPLY__Group__1__Impl_in_rule__MULTIPLY__Group__17122);
            rule__MULTIPLY__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MULTIPLY__Group__2_in_rule__MULTIPLY__Group__17125);
            rule__MULTIPLY__Group__2();

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
    // $ANTLR end "rule__MULTIPLY__Group__1"


    // $ANTLR start "rule__MULTIPLY__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3465:1: rule__MULTIPLY__Group__1__Impl : ( ( rule__MULTIPLY__TargetVariableAssignment_1 ) ) ;
    public final void rule__MULTIPLY__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3469:1: ( ( ( rule__MULTIPLY__TargetVariableAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3470:1: ( ( rule__MULTIPLY__TargetVariableAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3470:1: ( ( rule__MULTIPLY__TargetVariableAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3471:1: ( rule__MULTIPLY__TargetVariableAssignment_1 )
            {
             before(grammarAccess.getMULTIPLYAccess().getTargetVariableAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3472:1: ( rule__MULTIPLY__TargetVariableAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3472:2: rule__MULTIPLY__TargetVariableAssignment_1
            {
            pushFollow(FOLLOW_rule__MULTIPLY__TargetVariableAssignment_1_in_rule__MULTIPLY__Group__1__Impl7152);
            rule__MULTIPLY__TargetVariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMULTIPLYAccess().getTargetVariableAssignment_1()); 

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
    // $ANTLR end "rule__MULTIPLY__Group__1__Impl"


    // $ANTLR start "rule__MULTIPLY__Group__2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3482:1: rule__MULTIPLY__Group__2 : rule__MULTIPLY__Group__2__Impl rule__MULTIPLY__Group__3 ;
    public final void rule__MULTIPLY__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3486:1: ( rule__MULTIPLY__Group__2__Impl rule__MULTIPLY__Group__3 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3487:2: rule__MULTIPLY__Group__2__Impl rule__MULTIPLY__Group__3
            {
            pushFollow(FOLLOW_rule__MULTIPLY__Group__2__Impl_in_rule__MULTIPLY__Group__27182);
            rule__MULTIPLY__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MULTIPLY__Group__3_in_rule__MULTIPLY__Group__27185);
            rule__MULTIPLY__Group__3();

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
    // $ANTLR end "rule__MULTIPLY__Group__2"


    // $ANTLR start "rule__MULTIPLY__Group__2__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3494:1: rule__MULTIPLY__Group__2__Impl : ( '=' ) ;
    public final void rule__MULTIPLY__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3498:1: ( ( '=' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3499:1: ( '=' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3499:1: ( '=' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3500:1: '='
            {
             before(grammarAccess.getMULTIPLYAccess().getEqualsSignKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__MULTIPLY__Group__2__Impl7213); 
             after(grammarAccess.getMULTIPLYAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__MULTIPLY__Group__2__Impl"


    // $ANTLR start "rule__MULTIPLY__Group__3"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3513:1: rule__MULTIPLY__Group__3 : rule__MULTIPLY__Group__3__Impl rule__MULTIPLY__Group__4 ;
    public final void rule__MULTIPLY__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3517:1: ( rule__MULTIPLY__Group__3__Impl rule__MULTIPLY__Group__4 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3518:2: rule__MULTIPLY__Group__3__Impl rule__MULTIPLY__Group__4
            {
            pushFollow(FOLLOW_rule__MULTIPLY__Group__3__Impl_in_rule__MULTIPLY__Group__37244);
            rule__MULTIPLY__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MULTIPLY__Group__4_in_rule__MULTIPLY__Group__37247);
            rule__MULTIPLY__Group__4();

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
    // $ANTLR end "rule__MULTIPLY__Group__3"


    // $ANTLR start "rule__MULTIPLY__Group__3__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3525:1: rule__MULTIPLY__Group__3__Impl : ( ( rule__MULTIPLY__ValOneAssignment_3 ) ) ;
    public final void rule__MULTIPLY__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3529:1: ( ( ( rule__MULTIPLY__ValOneAssignment_3 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3530:1: ( ( rule__MULTIPLY__ValOneAssignment_3 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3530:1: ( ( rule__MULTIPLY__ValOneAssignment_3 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3531:1: ( rule__MULTIPLY__ValOneAssignment_3 )
            {
             before(grammarAccess.getMULTIPLYAccess().getValOneAssignment_3()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3532:1: ( rule__MULTIPLY__ValOneAssignment_3 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3532:2: rule__MULTIPLY__ValOneAssignment_3
            {
            pushFollow(FOLLOW_rule__MULTIPLY__ValOneAssignment_3_in_rule__MULTIPLY__Group__3__Impl7274);
            rule__MULTIPLY__ValOneAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMULTIPLYAccess().getValOneAssignment_3()); 

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
    // $ANTLR end "rule__MULTIPLY__Group__3__Impl"


    // $ANTLR start "rule__MULTIPLY__Group__4"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3542:1: rule__MULTIPLY__Group__4 : rule__MULTIPLY__Group__4__Impl rule__MULTIPLY__Group__5 ;
    public final void rule__MULTIPLY__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3546:1: ( rule__MULTIPLY__Group__4__Impl rule__MULTIPLY__Group__5 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3547:2: rule__MULTIPLY__Group__4__Impl rule__MULTIPLY__Group__5
            {
            pushFollow(FOLLOW_rule__MULTIPLY__Group__4__Impl_in_rule__MULTIPLY__Group__47304);
            rule__MULTIPLY__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MULTIPLY__Group__5_in_rule__MULTIPLY__Group__47307);
            rule__MULTIPLY__Group__5();

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
    // $ANTLR end "rule__MULTIPLY__Group__4"


    // $ANTLR start "rule__MULTIPLY__Group__4__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3554:1: rule__MULTIPLY__Group__4__Impl : ( '*' ) ;
    public final void rule__MULTIPLY__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3558:1: ( ( '*' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3559:1: ( '*' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3559:1: ( '*' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3560:1: '*'
            {
             before(grammarAccess.getMULTIPLYAccess().getAsteriskKeyword_4()); 
            match(input,49,FOLLOW_49_in_rule__MULTIPLY__Group__4__Impl7335); 
             after(grammarAccess.getMULTIPLYAccess().getAsteriskKeyword_4()); 

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
    // $ANTLR end "rule__MULTIPLY__Group__4__Impl"


    // $ANTLR start "rule__MULTIPLY__Group__5"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3573:1: rule__MULTIPLY__Group__5 : rule__MULTIPLY__Group__5__Impl ;
    public final void rule__MULTIPLY__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3577:1: ( rule__MULTIPLY__Group__5__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3578:2: rule__MULTIPLY__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MULTIPLY__Group__5__Impl_in_rule__MULTIPLY__Group__57366);
            rule__MULTIPLY__Group__5__Impl();

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
    // $ANTLR end "rule__MULTIPLY__Group__5"


    // $ANTLR start "rule__MULTIPLY__Group__5__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3584:1: rule__MULTIPLY__Group__5__Impl : ( ( rule__MULTIPLY__ValTwoAssignment_5 ) ) ;
    public final void rule__MULTIPLY__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3588:1: ( ( ( rule__MULTIPLY__ValTwoAssignment_5 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3589:1: ( ( rule__MULTIPLY__ValTwoAssignment_5 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3589:1: ( ( rule__MULTIPLY__ValTwoAssignment_5 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3590:1: ( rule__MULTIPLY__ValTwoAssignment_5 )
            {
             before(grammarAccess.getMULTIPLYAccess().getValTwoAssignment_5()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3591:1: ( rule__MULTIPLY__ValTwoAssignment_5 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3591:2: rule__MULTIPLY__ValTwoAssignment_5
            {
            pushFollow(FOLLOW_rule__MULTIPLY__ValTwoAssignment_5_in_rule__MULTIPLY__Group__5__Impl7393);
            rule__MULTIPLY__ValTwoAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMULTIPLYAccess().getValTwoAssignment_5()); 

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
    // $ANTLR end "rule__MULTIPLY__Group__5__Impl"


    // $ANTLR start "rule__DIVIDE__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3613:1: rule__DIVIDE__Group__0 : rule__DIVIDE__Group__0__Impl rule__DIVIDE__Group__1 ;
    public final void rule__DIVIDE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3617:1: ( rule__DIVIDE__Group__0__Impl rule__DIVIDE__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3618:2: rule__DIVIDE__Group__0__Impl rule__DIVIDE__Group__1
            {
            pushFollow(FOLLOW_rule__DIVIDE__Group__0__Impl_in_rule__DIVIDE__Group__07435);
            rule__DIVIDE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DIVIDE__Group__1_in_rule__DIVIDE__Group__07438);
            rule__DIVIDE__Group__1();

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
    // $ANTLR end "rule__DIVIDE__Group__0"


    // $ANTLR start "rule__DIVIDE__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3625:1: rule__DIVIDE__Group__0__Impl : ( 'DIVIDE' ) ;
    public final void rule__DIVIDE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3629:1: ( ( 'DIVIDE' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3630:1: ( 'DIVIDE' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3630:1: ( 'DIVIDE' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3631:1: 'DIVIDE'
            {
             before(grammarAccess.getDIVIDEAccess().getDIVIDEKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__DIVIDE__Group__0__Impl7466); 
             after(grammarAccess.getDIVIDEAccess().getDIVIDEKeyword_0()); 

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
    // $ANTLR end "rule__DIVIDE__Group__0__Impl"


    // $ANTLR start "rule__DIVIDE__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3644:1: rule__DIVIDE__Group__1 : rule__DIVIDE__Group__1__Impl rule__DIVIDE__Group__2 ;
    public final void rule__DIVIDE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3648:1: ( rule__DIVIDE__Group__1__Impl rule__DIVIDE__Group__2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3649:2: rule__DIVIDE__Group__1__Impl rule__DIVIDE__Group__2
            {
            pushFollow(FOLLOW_rule__DIVIDE__Group__1__Impl_in_rule__DIVIDE__Group__17497);
            rule__DIVIDE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DIVIDE__Group__2_in_rule__DIVIDE__Group__17500);
            rule__DIVIDE__Group__2();

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
    // $ANTLR end "rule__DIVIDE__Group__1"


    // $ANTLR start "rule__DIVIDE__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3656:1: rule__DIVIDE__Group__1__Impl : ( ( rule__DIVIDE__TargetVariableAssignment_1 ) ) ;
    public final void rule__DIVIDE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3660:1: ( ( ( rule__DIVIDE__TargetVariableAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3661:1: ( ( rule__DIVIDE__TargetVariableAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3661:1: ( ( rule__DIVIDE__TargetVariableAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3662:1: ( rule__DIVIDE__TargetVariableAssignment_1 )
            {
             before(grammarAccess.getDIVIDEAccess().getTargetVariableAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3663:1: ( rule__DIVIDE__TargetVariableAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3663:2: rule__DIVIDE__TargetVariableAssignment_1
            {
            pushFollow(FOLLOW_rule__DIVIDE__TargetVariableAssignment_1_in_rule__DIVIDE__Group__1__Impl7527);
            rule__DIVIDE__TargetVariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDIVIDEAccess().getTargetVariableAssignment_1()); 

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
    // $ANTLR end "rule__DIVIDE__Group__1__Impl"


    // $ANTLR start "rule__DIVIDE__Group__2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3673:1: rule__DIVIDE__Group__2 : rule__DIVIDE__Group__2__Impl rule__DIVIDE__Group__3 ;
    public final void rule__DIVIDE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3677:1: ( rule__DIVIDE__Group__2__Impl rule__DIVIDE__Group__3 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3678:2: rule__DIVIDE__Group__2__Impl rule__DIVIDE__Group__3
            {
            pushFollow(FOLLOW_rule__DIVIDE__Group__2__Impl_in_rule__DIVIDE__Group__27557);
            rule__DIVIDE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DIVIDE__Group__3_in_rule__DIVIDE__Group__27560);
            rule__DIVIDE__Group__3();

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
    // $ANTLR end "rule__DIVIDE__Group__2"


    // $ANTLR start "rule__DIVIDE__Group__2__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3685:1: rule__DIVIDE__Group__2__Impl : ( '=' ) ;
    public final void rule__DIVIDE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3689:1: ( ( '=' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3690:1: ( '=' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3690:1: ( '=' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3691:1: '='
            {
             before(grammarAccess.getDIVIDEAccess().getEqualsSignKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__DIVIDE__Group__2__Impl7588); 
             after(grammarAccess.getDIVIDEAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__DIVIDE__Group__2__Impl"


    // $ANTLR start "rule__DIVIDE__Group__3"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3704:1: rule__DIVIDE__Group__3 : rule__DIVIDE__Group__3__Impl rule__DIVIDE__Group__4 ;
    public final void rule__DIVIDE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3708:1: ( rule__DIVIDE__Group__3__Impl rule__DIVIDE__Group__4 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3709:2: rule__DIVIDE__Group__3__Impl rule__DIVIDE__Group__4
            {
            pushFollow(FOLLOW_rule__DIVIDE__Group__3__Impl_in_rule__DIVIDE__Group__37619);
            rule__DIVIDE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DIVIDE__Group__4_in_rule__DIVIDE__Group__37622);
            rule__DIVIDE__Group__4();

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
    // $ANTLR end "rule__DIVIDE__Group__3"


    // $ANTLR start "rule__DIVIDE__Group__3__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3716:1: rule__DIVIDE__Group__3__Impl : ( ( rule__DIVIDE__ValOneAssignment_3 ) ) ;
    public final void rule__DIVIDE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3720:1: ( ( ( rule__DIVIDE__ValOneAssignment_3 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3721:1: ( ( rule__DIVIDE__ValOneAssignment_3 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3721:1: ( ( rule__DIVIDE__ValOneAssignment_3 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3722:1: ( rule__DIVIDE__ValOneAssignment_3 )
            {
             before(grammarAccess.getDIVIDEAccess().getValOneAssignment_3()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3723:1: ( rule__DIVIDE__ValOneAssignment_3 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3723:2: rule__DIVIDE__ValOneAssignment_3
            {
            pushFollow(FOLLOW_rule__DIVIDE__ValOneAssignment_3_in_rule__DIVIDE__Group__3__Impl7649);
            rule__DIVIDE__ValOneAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDIVIDEAccess().getValOneAssignment_3()); 

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
    // $ANTLR end "rule__DIVIDE__Group__3__Impl"


    // $ANTLR start "rule__DIVIDE__Group__4"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3733:1: rule__DIVIDE__Group__4 : rule__DIVIDE__Group__4__Impl rule__DIVIDE__Group__5 ;
    public final void rule__DIVIDE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3737:1: ( rule__DIVIDE__Group__4__Impl rule__DIVIDE__Group__5 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3738:2: rule__DIVIDE__Group__4__Impl rule__DIVIDE__Group__5
            {
            pushFollow(FOLLOW_rule__DIVIDE__Group__4__Impl_in_rule__DIVIDE__Group__47679);
            rule__DIVIDE__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DIVIDE__Group__5_in_rule__DIVIDE__Group__47682);
            rule__DIVIDE__Group__5();

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
    // $ANTLR end "rule__DIVIDE__Group__4"


    // $ANTLR start "rule__DIVIDE__Group__4__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3745:1: rule__DIVIDE__Group__4__Impl : ( '/' ) ;
    public final void rule__DIVIDE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3749:1: ( ( '/' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3750:1: ( '/' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3750:1: ( '/' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3751:1: '/'
            {
             before(grammarAccess.getDIVIDEAccess().getSolidusKeyword_4()); 
            match(input,51,FOLLOW_51_in_rule__DIVIDE__Group__4__Impl7710); 
             after(grammarAccess.getDIVIDEAccess().getSolidusKeyword_4()); 

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
    // $ANTLR end "rule__DIVIDE__Group__4__Impl"


    // $ANTLR start "rule__DIVIDE__Group__5"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3764:1: rule__DIVIDE__Group__5 : rule__DIVIDE__Group__5__Impl ;
    public final void rule__DIVIDE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3768:1: ( rule__DIVIDE__Group__5__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3769:2: rule__DIVIDE__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__DIVIDE__Group__5__Impl_in_rule__DIVIDE__Group__57741);
            rule__DIVIDE__Group__5__Impl();

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
    // $ANTLR end "rule__DIVIDE__Group__5"


    // $ANTLR start "rule__DIVIDE__Group__5__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3775:1: rule__DIVIDE__Group__5__Impl : ( ( rule__DIVIDE__ValTwoAssignment_5 ) ) ;
    public final void rule__DIVIDE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3779:1: ( ( ( rule__DIVIDE__ValTwoAssignment_5 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3780:1: ( ( rule__DIVIDE__ValTwoAssignment_5 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3780:1: ( ( rule__DIVIDE__ValTwoAssignment_5 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3781:1: ( rule__DIVIDE__ValTwoAssignment_5 )
            {
             before(grammarAccess.getDIVIDEAccess().getValTwoAssignment_5()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3782:1: ( rule__DIVIDE__ValTwoAssignment_5 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3782:2: rule__DIVIDE__ValTwoAssignment_5
            {
            pushFollow(FOLLOW_rule__DIVIDE__ValTwoAssignment_5_in_rule__DIVIDE__Group__5__Impl7768);
            rule__DIVIDE__ValTwoAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDIVIDEAccess().getValTwoAssignment_5()); 

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
    // $ANTLR end "rule__DIVIDE__Group__5__Impl"


    // $ANTLR start "rule__REPEAT__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3804:1: rule__REPEAT__Group__0 : rule__REPEAT__Group__0__Impl rule__REPEAT__Group__1 ;
    public final void rule__REPEAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3808:1: ( rule__REPEAT__Group__0__Impl rule__REPEAT__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3809:2: rule__REPEAT__Group__0__Impl rule__REPEAT__Group__1
            {
            pushFollow(FOLLOW_rule__REPEAT__Group__0__Impl_in_rule__REPEAT__Group__07810);
            rule__REPEAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REPEAT__Group__1_in_rule__REPEAT__Group__07813);
            rule__REPEAT__Group__1();

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
    // $ANTLR end "rule__REPEAT__Group__0"


    // $ANTLR start "rule__REPEAT__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3816:1: rule__REPEAT__Group__0__Impl : ( 'REPEAT' ) ;
    public final void rule__REPEAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3820:1: ( ( 'REPEAT' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3821:1: ( 'REPEAT' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3821:1: ( 'REPEAT' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3822:1: 'REPEAT'
            {
             before(grammarAccess.getREPEATAccess().getREPEATKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__REPEAT__Group__0__Impl7841); 
             after(grammarAccess.getREPEATAccess().getREPEATKeyword_0()); 

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
    // $ANTLR end "rule__REPEAT__Group__0__Impl"


    // $ANTLR start "rule__REPEAT__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3835:1: rule__REPEAT__Group__1 : rule__REPEAT__Group__1__Impl rule__REPEAT__Group__2 ;
    public final void rule__REPEAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3839:1: ( rule__REPEAT__Group__1__Impl rule__REPEAT__Group__2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3840:2: rule__REPEAT__Group__1__Impl rule__REPEAT__Group__2
            {
            pushFollow(FOLLOW_rule__REPEAT__Group__1__Impl_in_rule__REPEAT__Group__17872);
            rule__REPEAT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REPEAT__Group__2_in_rule__REPEAT__Group__17875);
            rule__REPEAT__Group__2();

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
    // $ANTLR end "rule__REPEAT__Group__1"


    // $ANTLR start "rule__REPEAT__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3847:1: rule__REPEAT__Group__1__Impl : ( ( rule__REPEAT__TimesAssignment_1 ) ) ;
    public final void rule__REPEAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3851:1: ( ( ( rule__REPEAT__TimesAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3852:1: ( ( rule__REPEAT__TimesAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3852:1: ( ( rule__REPEAT__TimesAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3853:1: ( rule__REPEAT__TimesAssignment_1 )
            {
             before(grammarAccess.getREPEATAccess().getTimesAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3854:1: ( rule__REPEAT__TimesAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3854:2: rule__REPEAT__TimesAssignment_1
            {
            pushFollow(FOLLOW_rule__REPEAT__TimesAssignment_1_in_rule__REPEAT__Group__1__Impl7902);
            rule__REPEAT__TimesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getREPEATAccess().getTimesAssignment_1()); 

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
    // $ANTLR end "rule__REPEAT__Group__1__Impl"


    // $ANTLR start "rule__REPEAT__Group__2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3864:1: rule__REPEAT__Group__2 : rule__REPEAT__Group__2__Impl rule__REPEAT__Group__3 ;
    public final void rule__REPEAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3868:1: ( rule__REPEAT__Group__2__Impl rule__REPEAT__Group__3 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3869:2: rule__REPEAT__Group__2__Impl rule__REPEAT__Group__3
            {
            pushFollow(FOLLOW_rule__REPEAT__Group__2__Impl_in_rule__REPEAT__Group__27932);
            rule__REPEAT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REPEAT__Group__3_in_rule__REPEAT__Group__27935);
            rule__REPEAT__Group__3();

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
    // $ANTLR end "rule__REPEAT__Group__2"


    // $ANTLR start "rule__REPEAT__Group__2__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3876:1: rule__REPEAT__Group__2__Impl : ( ( ( rule__REPEAT__CommandsAssignment_2 ) ) ( ( rule__REPEAT__CommandsAssignment_2 )* ) ) ;
    public final void rule__REPEAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3880:1: ( ( ( ( rule__REPEAT__CommandsAssignment_2 ) ) ( ( rule__REPEAT__CommandsAssignment_2 )* ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3881:1: ( ( ( rule__REPEAT__CommandsAssignment_2 ) ) ( ( rule__REPEAT__CommandsAssignment_2 )* ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3881:1: ( ( ( rule__REPEAT__CommandsAssignment_2 ) ) ( ( rule__REPEAT__CommandsAssignment_2 )* ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3882:1: ( ( rule__REPEAT__CommandsAssignment_2 ) ) ( ( rule__REPEAT__CommandsAssignment_2 )* )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3882:1: ( ( rule__REPEAT__CommandsAssignment_2 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3883:1: ( rule__REPEAT__CommandsAssignment_2 )
            {
             before(grammarAccess.getREPEATAccess().getCommandsAssignment_2()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3884:1: ( rule__REPEAT__CommandsAssignment_2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3884:2: rule__REPEAT__CommandsAssignment_2
            {
            pushFollow(FOLLOW_rule__REPEAT__CommandsAssignment_2_in_rule__REPEAT__Group__2__Impl7964);
            rule__REPEAT__CommandsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getREPEATAccess().getCommandsAssignment_2()); 

            }

            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3887:1: ( ( rule__REPEAT__CommandsAssignment_2 )* )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3888:1: ( rule__REPEAT__CommandsAssignment_2 )*
            {
             before(grammarAccess.getREPEATAccess().getCommandsAssignment_2()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3889:1: ( rule__REPEAT__CommandsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=25 && LA14_0<=34)||(LA14_0>=38 && LA14_0<=41)||(LA14_0>=43 && LA14_0<=44)||LA14_0==46||LA14_0==48||LA14_0==50||LA14_0==52||LA14_0==54||LA14_0==57) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3889:2: rule__REPEAT__CommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__REPEAT__CommandsAssignment_2_in_rule__REPEAT__Group__2__Impl7976);
            	    rule__REPEAT__CommandsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getREPEATAccess().getCommandsAssignment_2()); 

            }


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
    // $ANTLR end "rule__REPEAT__Group__2__Impl"


    // $ANTLR start "rule__REPEAT__Group__3"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3900:1: rule__REPEAT__Group__3 : rule__REPEAT__Group__3__Impl ;
    public final void rule__REPEAT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3904:1: ( rule__REPEAT__Group__3__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3905:2: rule__REPEAT__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__REPEAT__Group__3__Impl_in_rule__REPEAT__Group__38009);
            rule__REPEAT__Group__3__Impl();

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
    // $ANTLR end "rule__REPEAT__Group__3"


    // $ANTLR start "rule__REPEAT__Group__3__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3911:1: rule__REPEAT__Group__3__Impl : ( 'END REPEAT' ) ;
    public final void rule__REPEAT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3915:1: ( ( 'END REPEAT' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3916:1: ( 'END REPEAT' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3916:1: ( 'END REPEAT' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3917:1: 'END REPEAT'
            {
             before(grammarAccess.getREPEATAccess().getENDREPEATKeyword_3()); 
            match(input,53,FOLLOW_53_in_rule__REPEAT__Group__3__Impl8037); 
             after(grammarAccess.getREPEATAccess().getENDREPEATKeyword_3()); 

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
    // $ANTLR end "rule__REPEAT__Group__3__Impl"


    // $ANTLR start "rule__TO__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3938:1: rule__TO__Group__0 : rule__TO__Group__0__Impl rule__TO__Group__1 ;
    public final void rule__TO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3942:1: ( rule__TO__Group__0__Impl rule__TO__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3943:2: rule__TO__Group__0__Impl rule__TO__Group__1
            {
            pushFollow(FOLLOW_rule__TO__Group__0__Impl_in_rule__TO__Group__08076);
            rule__TO__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TO__Group__1_in_rule__TO__Group__08079);
            rule__TO__Group__1();

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
    // $ANTLR end "rule__TO__Group__0"


    // $ANTLR start "rule__TO__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3950:1: rule__TO__Group__0__Impl : ( 'TO' ) ;
    public final void rule__TO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3954:1: ( ( 'TO' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3955:1: ( 'TO' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3955:1: ( 'TO' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3956:1: 'TO'
            {
             before(grammarAccess.getTOAccess().getTOKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__TO__Group__0__Impl8107); 
             after(grammarAccess.getTOAccess().getTOKeyword_0()); 

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
    // $ANTLR end "rule__TO__Group__0__Impl"


    // $ANTLR start "rule__TO__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3969:1: rule__TO__Group__1 : rule__TO__Group__1__Impl rule__TO__Group__2 ;
    public final void rule__TO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3973:1: ( rule__TO__Group__1__Impl rule__TO__Group__2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3974:2: rule__TO__Group__1__Impl rule__TO__Group__2
            {
            pushFollow(FOLLOW_rule__TO__Group__1__Impl_in_rule__TO__Group__18138);
            rule__TO__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TO__Group__2_in_rule__TO__Group__18141);
            rule__TO__Group__2();

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
    // $ANTLR end "rule__TO__Group__1"


    // $ANTLR start "rule__TO__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3981:1: rule__TO__Group__1__Impl : ( ( rule__TO__NameAssignment_1 ) ) ;
    public final void rule__TO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3985:1: ( ( ( rule__TO__NameAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3986:1: ( ( rule__TO__NameAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3986:1: ( ( rule__TO__NameAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3987:1: ( rule__TO__NameAssignment_1 )
            {
             before(grammarAccess.getTOAccess().getNameAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3988:1: ( rule__TO__NameAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3988:2: rule__TO__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TO__NameAssignment_1_in_rule__TO__Group__1__Impl8168);
            rule__TO__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTOAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TO__Group__1__Impl"


    // $ANTLR start "rule__TO__Group__2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:3998:1: rule__TO__Group__2 : rule__TO__Group__2__Impl rule__TO__Group__3 ;
    public final void rule__TO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4002:1: ( rule__TO__Group__2__Impl rule__TO__Group__3 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4003:2: rule__TO__Group__2__Impl rule__TO__Group__3
            {
            pushFollow(FOLLOW_rule__TO__Group__2__Impl_in_rule__TO__Group__28198);
            rule__TO__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TO__Group__3_in_rule__TO__Group__28201);
            rule__TO__Group__3();

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
    // $ANTLR end "rule__TO__Group__2"


    // $ANTLR start "rule__TO__Group__2__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4010:1: rule__TO__Group__2__Impl : ( ( rule__TO__ParametersAssignment_2 )* ) ;
    public final void rule__TO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4014:1: ( ( ( rule__TO__ParametersAssignment_2 )* ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4015:1: ( ( rule__TO__ParametersAssignment_2 )* )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4015:1: ( ( rule__TO__ParametersAssignment_2 )* )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4016:1: ( rule__TO__ParametersAssignment_2 )*
            {
             before(grammarAccess.getTOAccess().getParametersAssignment_2()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4017:1: ( rule__TO__ParametersAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==56) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4017:2: rule__TO__ParametersAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__TO__ParametersAssignment_2_in_rule__TO__Group__2__Impl8228);
            	    rule__TO__ParametersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTOAccess().getParametersAssignment_2()); 

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
    // $ANTLR end "rule__TO__Group__2__Impl"


    // $ANTLR start "rule__TO__Group__3"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4027:1: rule__TO__Group__3 : rule__TO__Group__3__Impl rule__TO__Group__4 ;
    public final void rule__TO__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4031:1: ( rule__TO__Group__3__Impl rule__TO__Group__4 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4032:2: rule__TO__Group__3__Impl rule__TO__Group__4
            {
            pushFollow(FOLLOW_rule__TO__Group__3__Impl_in_rule__TO__Group__38259);
            rule__TO__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TO__Group__4_in_rule__TO__Group__38262);
            rule__TO__Group__4();

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
    // $ANTLR end "rule__TO__Group__3"


    // $ANTLR start "rule__TO__Group__3__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4039:1: rule__TO__Group__3__Impl : ( ( ( rule__TO__CommandsAssignment_3 ) ) ( ( rule__TO__CommandsAssignment_3 )* ) ) ;
    public final void rule__TO__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4043:1: ( ( ( ( rule__TO__CommandsAssignment_3 ) ) ( ( rule__TO__CommandsAssignment_3 )* ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4044:1: ( ( ( rule__TO__CommandsAssignment_3 ) ) ( ( rule__TO__CommandsAssignment_3 )* ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4044:1: ( ( ( rule__TO__CommandsAssignment_3 ) ) ( ( rule__TO__CommandsAssignment_3 )* ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4045:1: ( ( rule__TO__CommandsAssignment_3 ) ) ( ( rule__TO__CommandsAssignment_3 )* )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4045:1: ( ( rule__TO__CommandsAssignment_3 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4046:1: ( rule__TO__CommandsAssignment_3 )
            {
             before(grammarAccess.getTOAccess().getCommandsAssignment_3()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4047:1: ( rule__TO__CommandsAssignment_3 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4047:2: rule__TO__CommandsAssignment_3
            {
            pushFollow(FOLLOW_rule__TO__CommandsAssignment_3_in_rule__TO__Group__3__Impl8291);
            rule__TO__CommandsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTOAccess().getCommandsAssignment_3()); 

            }

            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4050:1: ( ( rule__TO__CommandsAssignment_3 )* )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4051:1: ( rule__TO__CommandsAssignment_3 )*
            {
             before(grammarAccess.getTOAccess().getCommandsAssignment_3()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4052:1: ( rule__TO__CommandsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=25 && LA16_0<=34)||(LA16_0>=38 && LA16_0<=41)||(LA16_0>=43 && LA16_0<=44)||LA16_0==46||LA16_0==48||LA16_0==50||LA16_0==52||LA16_0==54||LA16_0==57) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4052:2: rule__TO__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__TO__CommandsAssignment_3_in_rule__TO__Group__3__Impl8303);
            	    rule__TO__CommandsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getTOAccess().getCommandsAssignment_3()); 

            }


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
    // $ANTLR end "rule__TO__Group__3__Impl"


    // $ANTLR start "rule__TO__Group__4"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4063:1: rule__TO__Group__4 : rule__TO__Group__4__Impl ;
    public final void rule__TO__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4067:1: ( rule__TO__Group__4__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4068:2: rule__TO__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TO__Group__4__Impl_in_rule__TO__Group__48336);
            rule__TO__Group__4__Impl();

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
    // $ANTLR end "rule__TO__Group__4"


    // $ANTLR start "rule__TO__Group__4__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4074:1: rule__TO__Group__4__Impl : ( 'END TO' ) ;
    public final void rule__TO__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4078:1: ( ( 'END TO' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4079:1: ( 'END TO' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4079:1: ( 'END TO' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4080:1: 'END TO'
            {
             before(grammarAccess.getTOAccess().getENDTOKeyword_4()); 
            match(input,55,FOLLOW_55_in_rule__TO__Group__4__Impl8364); 
             after(grammarAccess.getTOAccess().getENDTOKeyword_4()); 

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
    // $ANTLR end "rule__TO__Group__4__Impl"


    // $ANTLR start "rule__PARAM__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4103:1: rule__PARAM__Group__0 : rule__PARAM__Group__0__Impl rule__PARAM__Group__1 ;
    public final void rule__PARAM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4107:1: ( rule__PARAM__Group__0__Impl rule__PARAM__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4108:2: rule__PARAM__Group__0__Impl rule__PARAM__Group__1
            {
            pushFollow(FOLLOW_rule__PARAM__Group__0__Impl_in_rule__PARAM__Group__08405);
            rule__PARAM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PARAM__Group__1_in_rule__PARAM__Group__08408);
            rule__PARAM__Group__1();

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
    // $ANTLR end "rule__PARAM__Group__0"


    // $ANTLR start "rule__PARAM__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4115:1: rule__PARAM__Group__0__Impl : ( ':' ) ;
    public final void rule__PARAM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4119:1: ( ( ':' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4120:1: ( ':' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4120:1: ( ':' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4121:1: ':'
            {
             before(grammarAccess.getPARAMAccess().getColonKeyword_0()); 
            match(input,56,FOLLOW_56_in_rule__PARAM__Group__0__Impl8436); 
             after(grammarAccess.getPARAMAccess().getColonKeyword_0()); 

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
    // $ANTLR end "rule__PARAM__Group__0__Impl"


    // $ANTLR start "rule__PARAM__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4134:1: rule__PARAM__Group__1 : rule__PARAM__Group__1__Impl ;
    public final void rule__PARAM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4138:1: ( rule__PARAM__Group__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4139:2: rule__PARAM__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PARAM__Group__1__Impl_in_rule__PARAM__Group__18467);
            rule__PARAM__Group__1__Impl();

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
    // $ANTLR end "rule__PARAM__Group__1"


    // $ANTLR start "rule__PARAM__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4145:1: rule__PARAM__Group__1__Impl : ( ( rule__PARAM__NameAssignment_1 ) ) ;
    public final void rule__PARAM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4149:1: ( ( ( rule__PARAM__NameAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4150:1: ( ( rule__PARAM__NameAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4150:1: ( ( rule__PARAM__NameAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4151:1: ( rule__PARAM__NameAssignment_1 )
            {
             before(grammarAccess.getPARAMAccess().getNameAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4152:1: ( rule__PARAM__NameAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4152:2: rule__PARAM__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PARAM__NameAssignment_1_in_rule__PARAM__Group__1__Impl8494);
            rule__PARAM__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPARAMAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PARAM__Group__1__Impl"


    // $ANTLR start "rule__PROCEDURE_CALL__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4166:1: rule__PROCEDURE_CALL__Group__0 : rule__PROCEDURE_CALL__Group__0__Impl rule__PROCEDURE_CALL__Group__1 ;
    public final void rule__PROCEDURE_CALL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4170:1: ( rule__PROCEDURE_CALL__Group__0__Impl rule__PROCEDURE_CALL__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4171:2: rule__PROCEDURE_CALL__Group__0__Impl rule__PROCEDURE_CALL__Group__1
            {
            pushFollow(FOLLOW_rule__PROCEDURE_CALL__Group__0__Impl_in_rule__PROCEDURE_CALL__Group__08528);
            rule__PROCEDURE_CALL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PROCEDURE_CALL__Group__1_in_rule__PROCEDURE_CALL__Group__08531);
            rule__PROCEDURE_CALL__Group__1();

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
    // $ANTLR end "rule__PROCEDURE_CALL__Group__0"


    // $ANTLR start "rule__PROCEDURE_CALL__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4178:1: rule__PROCEDURE_CALL__Group__0__Impl : ( ( rule__PROCEDURE_CALL__ToAssignment_0 ) ) ;
    public final void rule__PROCEDURE_CALL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4182:1: ( ( ( rule__PROCEDURE_CALL__ToAssignment_0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4183:1: ( ( rule__PROCEDURE_CALL__ToAssignment_0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4183:1: ( ( rule__PROCEDURE_CALL__ToAssignment_0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4184:1: ( rule__PROCEDURE_CALL__ToAssignment_0 )
            {
             before(grammarAccess.getPROCEDURE_CALLAccess().getToAssignment_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4185:1: ( rule__PROCEDURE_CALL__ToAssignment_0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4185:2: rule__PROCEDURE_CALL__ToAssignment_0
            {
            pushFollow(FOLLOW_rule__PROCEDURE_CALL__ToAssignment_0_in_rule__PROCEDURE_CALL__Group__0__Impl8558);
            rule__PROCEDURE_CALL__ToAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPROCEDURE_CALLAccess().getToAssignment_0()); 

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
    // $ANTLR end "rule__PROCEDURE_CALL__Group__0__Impl"


    // $ANTLR start "rule__PROCEDURE_CALL__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4195:1: rule__PROCEDURE_CALL__Group__1 : rule__PROCEDURE_CALL__Group__1__Impl ;
    public final void rule__PROCEDURE_CALL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4199:1: ( rule__PROCEDURE_CALL__Group__1__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4200:2: rule__PROCEDURE_CALL__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PROCEDURE_CALL__Group__1__Impl_in_rule__PROCEDURE_CALL__Group__18588);
            rule__PROCEDURE_CALL__Group__1__Impl();

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
    // $ANTLR end "rule__PROCEDURE_CALL__Group__1"


    // $ANTLR start "rule__PROCEDURE_CALL__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4206:1: rule__PROCEDURE_CALL__Group__1__Impl : ( ( rule__PROCEDURE_CALL__ParamsAssignment_1 )* ) ;
    public final void rule__PROCEDURE_CALL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4210:1: ( ( ( rule__PROCEDURE_CALL__ParamsAssignment_1 )* ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4211:1: ( ( rule__PROCEDURE_CALL__ParamsAssignment_1 )* )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4211:1: ( ( rule__PROCEDURE_CALL__ParamsAssignment_1 )* )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4212:1: ( rule__PROCEDURE_CALL__ParamsAssignment_1 )*
            {
             before(grammarAccess.getPROCEDURE_CALLAccess().getParamsAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4213:1: ( rule__PROCEDURE_CALL__ParamsAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_DOUBLE)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4213:2: rule__PROCEDURE_CALL__ParamsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__PROCEDURE_CALL__ParamsAssignment_1_in_rule__PROCEDURE_CALL__Group__1__Impl8615);
            	    rule__PROCEDURE_CALL__ParamsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPROCEDURE_CALLAccess().getParamsAssignment_1()); 

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
    // $ANTLR end "rule__PROCEDURE_CALL__Group__1__Impl"


    // $ANTLR start "rule__IF_SENTENCE__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4227:1: rule__IF_SENTENCE__Group__0 : rule__IF_SENTENCE__Group__0__Impl rule__IF_SENTENCE__Group__1 ;
    public final void rule__IF_SENTENCE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4231:1: ( rule__IF_SENTENCE__Group__0__Impl rule__IF_SENTENCE__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4232:2: rule__IF_SENTENCE__Group__0__Impl rule__IF_SENTENCE__Group__1
            {
            pushFollow(FOLLOW_rule__IF_SENTENCE__Group__0__Impl_in_rule__IF_SENTENCE__Group__08650);
            rule__IF_SENTENCE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IF_SENTENCE__Group__1_in_rule__IF_SENTENCE__Group__08653);
            rule__IF_SENTENCE__Group__1();

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
    // $ANTLR end "rule__IF_SENTENCE__Group__0"


    // $ANTLR start "rule__IF_SENTENCE__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4239:1: rule__IF_SENTENCE__Group__0__Impl : ( 'IF' ) ;
    public final void rule__IF_SENTENCE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4243:1: ( ( 'IF' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4244:1: ( 'IF' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4244:1: ( 'IF' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4245:1: 'IF'
            {
             before(grammarAccess.getIF_SENTENCEAccess().getIFKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__IF_SENTENCE__Group__0__Impl8681); 
             after(grammarAccess.getIF_SENTENCEAccess().getIFKeyword_0()); 

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
    // $ANTLR end "rule__IF_SENTENCE__Group__0__Impl"


    // $ANTLR start "rule__IF_SENTENCE__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4258:1: rule__IF_SENTENCE__Group__1 : rule__IF_SENTENCE__Group__1__Impl rule__IF_SENTENCE__Group__2 ;
    public final void rule__IF_SENTENCE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4262:1: ( rule__IF_SENTENCE__Group__1__Impl rule__IF_SENTENCE__Group__2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4263:2: rule__IF_SENTENCE__Group__1__Impl rule__IF_SENTENCE__Group__2
            {
            pushFollow(FOLLOW_rule__IF_SENTENCE__Group__1__Impl_in_rule__IF_SENTENCE__Group__18712);
            rule__IF_SENTENCE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IF_SENTENCE__Group__2_in_rule__IF_SENTENCE__Group__18715);
            rule__IF_SENTENCE__Group__2();

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
    // $ANTLR end "rule__IF_SENTENCE__Group__1"


    // $ANTLR start "rule__IF_SENTENCE__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4270:1: rule__IF_SENTENCE__Group__1__Impl : ( ( rule__IF_SENTENCE__ConditionAssignment_1 ) ) ;
    public final void rule__IF_SENTENCE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4274:1: ( ( ( rule__IF_SENTENCE__ConditionAssignment_1 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4275:1: ( ( rule__IF_SENTENCE__ConditionAssignment_1 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4275:1: ( ( rule__IF_SENTENCE__ConditionAssignment_1 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4276:1: ( rule__IF_SENTENCE__ConditionAssignment_1 )
            {
             before(grammarAccess.getIF_SENTENCEAccess().getConditionAssignment_1()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4277:1: ( rule__IF_SENTENCE__ConditionAssignment_1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4277:2: rule__IF_SENTENCE__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__IF_SENTENCE__ConditionAssignment_1_in_rule__IF_SENTENCE__Group__1__Impl8742);
            rule__IF_SENTENCE__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIF_SENTENCEAccess().getConditionAssignment_1()); 

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
    // $ANTLR end "rule__IF_SENTENCE__Group__1__Impl"


    // $ANTLR start "rule__IF_SENTENCE__Group__2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4287:1: rule__IF_SENTENCE__Group__2 : rule__IF_SENTENCE__Group__2__Impl rule__IF_SENTENCE__Group__3 ;
    public final void rule__IF_SENTENCE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4291:1: ( rule__IF_SENTENCE__Group__2__Impl rule__IF_SENTENCE__Group__3 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4292:2: rule__IF_SENTENCE__Group__2__Impl rule__IF_SENTENCE__Group__3
            {
            pushFollow(FOLLOW_rule__IF_SENTENCE__Group__2__Impl_in_rule__IF_SENTENCE__Group__28772);
            rule__IF_SENTENCE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IF_SENTENCE__Group__3_in_rule__IF_SENTENCE__Group__28775);
            rule__IF_SENTENCE__Group__3();

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
    // $ANTLR end "rule__IF_SENTENCE__Group__2"


    // $ANTLR start "rule__IF_SENTENCE__Group__2__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4299:1: rule__IF_SENTENCE__Group__2__Impl : ( ( ( rule__IF_SENTENCE__CommandsAssignment_2 ) ) ( ( rule__IF_SENTENCE__CommandsAssignment_2 )* ) ) ;
    public final void rule__IF_SENTENCE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4303:1: ( ( ( ( rule__IF_SENTENCE__CommandsAssignment_2 ) ) ( ( rule__IF_SENTENCE__CommandsAssignment_2 )* ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4304:1: ( ( ( rule__IF_SENTENCE__CommandsAssignment_2 ) ) ( ( rule__IF_SENTENCE__CommandsAssignment_2 )* ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4304:1: ( ( ( rule__IF_SENTENCE__CommandsAssignment_2 ) ) ( ( rule__IF_SENTENCE__CommandsAssignment_2 )* ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4305:1: ( ( rule__IF_SENTENCE__CommandsAssignment_2 ) ) ( ( rule__IF_SENTENCE__CommandsAssignment_2 )* )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4305:1: ( ( rule__IF_SENTENCE__CommandsAssignment_2 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4306:1: ( rule__IF_SENTENCE__CommandsAssignment_2 )
            {
             before(grammarAccess.getIF_SENTENCEAccess().getCommandsAssignment_2()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4307:1: ( rule__IF_SENTENCE__CommandsAssignment_2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4307:2: rule__IF_SENTENCE__CommandsAssignment_2
            {
            pushFollow(FOLLOW_rule__IF_SENTENCE__CommandsAssignment_2_in_rule__IF_SENTENCE__Group__2__Impl8804);
            rule__IF_SENTENCE__CommandsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIF_SENTENCEAccess().getCommandsAssignment_2()); 

            }

            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4310:1: ( ( rule__IF_SENTENCE__CommandsAssignment_2 )* )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4311:1: ( rule__IF_SENTENCE__CommandsAssignment_2 )*
            {
             before(grammarAccess.getIF_SENTENCEAccess().getCommandsAssignment_2()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4312:1: ( rule__IF_SENTENCE__CommandsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=25 && LA18_0<=34)||(LA18_0>=38 && LA18_0<=41)||(LA18_0>=43 && LA18_0<=44)||LA18_0==46||LA18_0==48||LA18_0==50||LA18_0==52||LA18_0==54||LA18_0==57) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4312:2: rule__IF_SENTENCE__CommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__IF_SENTENCE__CommandsAssignment_2_in_rule__IF_SENTENCE__Group__2__Impl8816);
            	    rule__IF_SENTENCE__CommandsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getIF_SENTENCEAccess().getCommandsAssignment_2()); 

            }


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
    // $ANTLR end "rule__IF_SENTENCE__Group__2__Impl"


    // $ANTLR start "rule__IF_SENTENCE__Group__3"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4323:1: rule__IF_SENTENCE__Group__3 : rule__IF_SENTENCE__Group__3__Impl ;
    public final void rule__IF_SENTENCE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4327:1: ( rule__IF_SENTENCE__Group__3__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4328:2: rule__IF_SENTENCE__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IF_SENTENCE__Group__3__Impl_in_rule__IF_SENTENCE__Group__38849);
            rule__IF_SENTENCE__Group__3__Impl();

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
    // $ANTLR end "rule__IF_SENTENCE__Group__3"


    // $ANTLR start "rule__IF_SENTENCE__Group__3__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4334:1: rule__IF_SENTENCE__Group__3__Impl : ( 'END IF' ) ;
    public final void rule__IF_SENTENCE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4338:1: ( ( 'END IF' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4339:1: ( 'END IF' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4339:1: ( 'END IF' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4340:1: 'END IF'
            {
             before(grammarAccess.getIF_SENTENCEAccess().getENDIFKeyword_3()); 
            match(input,58,FOLLOW_58_in_rule__IF_SENTENCE__Group__3__Impl8877); 
             after(grammarAccess.getIF_SENTENCEAccess().getENDIFKeyword_3()); 

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
    // $ANTLR end "rule__IF_SENTENCE__Group__3__Impl"


    // $ANTLR start "rule__EQUALS__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4361:1: rule__EQUALS__Group__0 : rule__EQUALS__Group__0__Impl rule__EQUALS__Group__1 ;
    public final void rule__EQUALS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4365:1: ( rule__EQUALS__Group__0__Impl rule__EQUALS__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4366:2: rule__EQUALS__Group__0__Impl rule__EQUALS__Group__1
            {
            pushFollow(FOLLOW_rule__EQUALS__Group__0__Impl_in_rule__EQUALS__Group__08916);
            rule__EQUALS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EQUALS__Group__1_in_rule__EQUALS__Group__08919);
            rule__EQUALS__Group__1();

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
    // $ANTLR end "rule__EQUALS__Group__0"


    // $ANTLR start "rule__EQUALS__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4373:1: rule__EQUALS__Group__0__Impl : ( ( rule__EQUALS__Op1Assignment_0 ) ) ;
    public final void rule__EQUALS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4377:1: ( ( ( rule__EQUALS__Op1Assignment_0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4378:1: ( ( rule__EQUALS__Op1Assignment_0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4378:1: ( ( rule__EQUALS__Op1Assignment_0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4379:1: ( rule__EQUALS__Op1Assignment_0 )
            {
             before(grammarAccess.getEQUALSAccess().getOp1Assignment_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4380:1: ( rule__EQUALS__Op1Assignment_0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4380:2: rule__EQUALS__Op1Assignment_0
            {
            pushFollow(FOLLOW_rule__EQUALS__Op1Assignment_0_in_rule__EQUALS__Group__0__Impl8946);
            rule__EQUALS__Op1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEQUALSAccess().getOp1Assignment_0()); 

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
    // $ANTLR end "rule__EQUALS__Group__0__Impl"


    // $ANTLR start "rule__EQUALS__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4390:1: rule__EQUALS__Group__1 : rule__EQUALS__Group__1__Impl rule__EQUALS__Group__2 ;
    public final void rule__EQUALS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4394:1: ( rule__EQUALS__Group__1__Impl rule__EQUALS__Group__2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4395:2: rule__EQUALS__Group__1__Impl rule__EQUALS__Group__2
            {
            pushFollow(FOLLOW_rule__EQUALS__Group__1__Impl_in_rule__EQUALS__Group__18976);
            rule__EQUALS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EQUALS__Group__2_in_rule__EQUALS__Group__18979);
            rule__EQUALS__Group__2();

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
    // $ANTLR end "rule__EQUALS__Group__1"


    // $ANTLR start "rule__EQUALS__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4402:1: rule__EQUALS__Group__1__Impl : ( '=' ) ;
    public final void rule__EQUALS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4406:1: ( ( '=' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4407:1: ( '=' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4407:1: ( '=' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4408:1: '='
            {
             before(grammarAccess.getEQUALSAccess().getEqualsSignKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__EQUALS__Group__1__Impl9007); 
             after(grammarAccess.getEQUALSAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__EQUALS__Group__1__Impl"


    // $ANTLR start "rule__EQUALS__Group__2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4421:1: rule__EQUALS__Group__2 : rule__EQUALS__Group__2__Impl ;
    public final void rule__EQUALS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4425:1: ( rule__EQUALS__Group__2__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4426:2: rule__EQUALS__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EQUALS__Group__2__Impl_in_rule__EQUALS__Group__29038);
            rule__EQUALS__Group__2__Impl();

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
    // $ANTLR end "rule__EQUALS__Group__2"


    // $ANTLR start "rule__EQUALS__Group__2__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4432:1: rule__EQUALS__Group__2__Impl : ( ( rule__EQUALS__Op2Assignment_2 ) ) ;
    public final void rule__EQUALS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4436:1: ( ( ( rule__EQUALS__Op2Assignment_2 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4437:1: ( ( rule__EQUALS__Op2Assignment_2 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4437:1: ( ( rule__EQUALS__Op2Assignment_2 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4438:1: ( rule__EQUALS__Op2Assignment_2 )
            {
             before(grammarAccess.getEQUALSAccess().getOp2Assignment_2()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4439:1: ( rule__EQUALS__Op2Assignment_2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4439:2: rule__EQUALS__Op2Assignment_2
            {
            pushFollow(FOLLOW_rule__EQUALS__Op2Assignment_2_in_rule__EQUALS__Group__2__Impl9065);
            rule__EQUALS__Op2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEQUALSAccess().getOp2Assignment_2()); 

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
    // $ANTLR end "rule__EQUALS__Group__2__Impl"


    // $ANTLR start "rule__GREATER_THAN__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4455:1: rule__GREATER_THAN__Group__0 : rule__GREATER_THAN__Group__0__Impl rule__GREATER_THAN__Group__1 ;
    public final void rule__GREATER_THAN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4459:1: ( rule__GREATER_THAN__Group__0__Impl rule__GREATER_THAN__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4460:2: rule__GREATER_THAN__Group__0__Impl rule__GREATER_THAN__Group__1
            {
            pushFollow(FOLLOW_rule__GREATER_THAN__Group__0__Impl_in_rule__GREATER_THAN__Group__09101);
            rule__GREATER_THAN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GREATER_THAN__Group__1_in_rule__GREATER_THAN__Group__09104);
            rule__GREATER_THAN__Group__1();

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
    // $ANTLR end "rule__GREATER_THAN__Group__0"


    // $ANTLR start "rule__GREATER_THAN__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4467:1: rule__GREATER_THAN__Group__0__Impl : ( ( rule__GREATER_THAN__Op1Assignment_0 ) ) ;
    public final void rule__GREATER_THAN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4471:1: ( ( ( rule__GREATER_THAN__Op1Assignment_0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4472:1: ( ( rule__GREATER_THAN__Op1Assignment_0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4472:1: ( ( rule__GREATER_THAN__Op1Assignment_0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4473:1: ( rule__GREATER_THAN__Op1Assignment_0 )
            {
             before(grammarAccess.getGREATER_THANAccess().getOp1Assignment_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4474:1: ( rule__GREATER_THAN__Op1Assignment_0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4474:2: rule__GREATER_THAN__Op1Assignment_0
            {
            pushFollow(FOLLOW_rule__GREATER_THAN__Op1Assignment_0_in_rule__GREATER_THAN__Group__0__Impl9131);
            rule__GREATER_THAN__Op1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGREATER_THANAccess().getOp1Assignment_0()); 

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
    // $ANTLR end "rule__GREATER_THAN__Group__0__Impl"


    // $ANTLR start "rule__GREATER_THAN__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4484:1: rule__GREATER_THAN__Group__1 : rule__GREATER_THAN__Group__1__Impl rule__GREATER_THAN__Group__2 ;
    public final void rule__GREATER_THAN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4488:1: ( rule__GREATER_THAN__Group__1__Impl rule__GREATER_THAN__Group__2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4489:2: rule__GREATER_THAN__Group__1__Impl rule__GREATER_THAN__Group__2
            {
            pushFollow(FOLLOW_rule__GREATER_THAN__Group__1__Impl_in_rule__GREATER_THAN__Group__19161);
            rule__GREATER_THAN__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GREATER_THAN__Group__2_in_rule__GREATER_THAN__Group__19164);
            rule__GREATER_THAN__Group__2();

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
    // $ANTLR end "rule__GREATER_THAN__Group__1"


    // $ANTLR start "rule__GREATER_THAN__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4496:1: rule__GREATER_THAN__Group__1__Impl : ( '>' ) ;
    public final void rule__GREATER_THAN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4500:1: ( ( '>' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4501:1: ( '>' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4501:1: ( '>' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4502:1: '>'
            {
             before(grammarAccess.getGREATER_THANAccess().getGreaterThanSignKeyword_1()); 
            match(input,59,FOLLOW_59_in_rule__GREATER_THAN__Group__1__Impl9192); 
             after(grammarAccess.getGREATER_THANAccess().getGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__GREATER_THAN__Group__1__Impl"


    // $ANTLR start "rule__GREATER_THAN__Group__2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4515:1: rule__GREATER_THAN__Group__2 : rule__GREATER_THAN__Group__2__Impl ;
    public final void rule__GREATER_THAN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4519:1: ( rule__GREATER_THAN__Group__2__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4520:2: rule__GREATER_THAN__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GREATER_THAN__Group__2__Impl_in_rule__GREATER_THAN__Group__29223);
            rule__GREATER_THAN__Group__2__Impl();

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
    // $ANTLR end "rule__GREATER_THAN__Group__2"


    // $ANTLR start "rule__GREATER_THAN__Group__2__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4526:1: rule__GREATER_THAN__Group__2__Impl : ( ( rule__GREATER_THAN__Op2Assignment_2 ) ) ;
    public final void rule__GREATER_THAN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4530:1: ( ( ( rule__GREATER_THAN__Op2Assignment_2 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4531:1: ( ( rule__GREATER_THAN__Op2Assignment_2 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4531:1: ( ( rule__GREATER_THAN__Op2Assignment_2 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4532:1: ( rule__GREATER_THAN__Op2Assignment_2 )
            {
             before(grammarAccess.getGREATER_THANAccess().getOp2Assignment_2()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4533:1: ( rule__GREATER_THAN__Op2Assignment_2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4533:2: rule__GREATER_THAN__Op2Assignment_2
            {
            pushFollow(FOLLOW_rule__GREATER_THAN__Op2Assignment_2_in_rule__GREATER_THAN__Group__2__Impl9250);
            rule__GREATER_THAN__Op2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGREATER_THANAccess().getOp2Assignment_2()); 

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
    // $ANTLR end "rule__GREATER_THAN__Group__2__Impl"


    // $ANTLR start "rule__LESSER_THAN__Group__0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4549:1: rule__LESSER_THAN__Group__0 : rule__LESSER_THAN__Group__0__Impl rule__LESSER_THAN__Group__1 ;
    public final void rule__LESSER_THAN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4553:1: ( rule__LESSER_THAN__Group__0__Impl rule__LESSER_THAN__Group__1 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4554:2: rule__LESSER_THAN__Group__0__Impl rule__LESSER_THAN__Group__1
            {
            pushFollow(FOLLOW_rule__LESSER_THAN__Group__0__Impl_in_rule__LESSER_THAN__Group__09286);
            rule__LESSER_THAN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LESSER_THAN__Group__1_in_rule__LESSER_THAN__Group__09289);
            rule__LESSER_THAN__Group__1();

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
    // $ANTLR end "rule__LESSER_THAN__Group__0"


    // $ANTLR start "rule__LESSER_THAN__Group__0__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4561:1: rule__LESSER_THAN__Group__0__Impl : ( ( rule__LESSER_THAN__Op1Assignment_0 ) ) ;
    public final void rule__LESSER_THAN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4565:1: ( ( ( rule__LESSER_THAN__Op1Assignment_0 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4566:1: ( ( rule__LESSER_THAN__Op1Assignment_0 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4566:1: ( ( rule__LESSER_THAN__Op1Assignment_0 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4567:1: ( rule__LESSER_THAN__Op1Assignment_0 )
            {
             before(grammarAccess.getLESSER_THANAccess().getOp1Assignment_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4568:1: ( rule__LESSER_THAN__Op1Assignment_0 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4568:2: rule__LESSER_THAN__Op1Assignment_0
            {
            pushFollow(FOLLOW_rule__LESSER_THAN__Op1Assignment_0_in_rule__LESSER_THAN__Group__0__Impl9316);
            rule__LESSER_THAN__Op1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLESSER_THANAccess().getOp1Assignment_0()); 

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
    // $ANTLR end "rule__LESSER_THAN__Group__0__Impl"


    // $ANTLR start "rule__LESSER_THAN__Group__1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4578:1: rule__LESSER_THAN__Group__1 : rule__LESSER_THAN__Group__1__Impl rule__LESSER_THAN__Group__2 ;
    public final void rule__LESSER_THAN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4582:1: ( rule__LESSER_THAN__Group__1__Impl rule__LESSER_THAN__Group__2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4583:2: rule__LESSER_THAN__Group__1__Impl rule__LESSER_THAN__Group__2
            {
            pushFollow(FOLLOW_rule__LESSER_THAN__Group__1__Impl_in_rule__LESSER_THAN__Group__19346);
            rule__LESSER_THAN__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LESSER_THAN__Group__2_in_rule__LESSER_THAN__Group__19349);
            rule__LESSER_THAN__Group__2();

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
    // $ANTLR end "rule__LESSER_THAN__Group__1"


    // $ANTLR start "rule__LESSER_THAN__Group__1__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4590:1: rule__LESSER_THAN__Group__1__Impl : ( '<' ) ;
    public final void rule__LESSER_THAN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4594:1: ( ( '<' ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4595:1: ( '<' )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4595:1: ( '<' )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4596:1: '<'
            {
             before(grammarAccess.getLESSER_THANAccess().getLessThanSignKeyword_1()); 
            match(input,60,FOLLOW_60_in_rule__LESSER_THAN__Group__1__Impl9377); 
             after(grammarAccess.getLESSER_THANAccess().getLessThanSignKeyword_1()); 

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
    // $ANTLR end "rule__LESSER_THAN__Group__1__Impl"


    // $ANTLR start "rule__LESSER_THAN__Group__2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4609:1: rule__LESSER_THAN__Group__2 : rule__LESSER_THAN__Group__2__Impl ;
    public final void rule__LESSER_THAN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4613:1: ( rule__LESSER_THAN__Group__2__Impl )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4614:2: rule__LESSER_THAN__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LESSER_THAN__Group__2__Impl_in_rule__LESSER_THAN__Group__29408);
            rule__LESSER_THAN__Group__2__Impl();

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
    // $ANTLR end "rule__LESSER_THAN__Group__2"


    // $ANTLR start "rule__LESSER_THAN__Group__2__Impl"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4620:1: rule__LESSER_THAN__Group__2__Impl : ( ( rule__LESSER_THAN__Op2Assignment_2 ) ) ;
    public final void rule__LESSER_THAN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4624:1: ( ( ( rule__LESSER_THAN__Op2Assignment_2 ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4625:1: ( ( rule__LESSER_THAN__Op2Assignment_2 ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4625:1: ( ( rule__LESSER_THAN__Op2Assignment_2 ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4626:1: ( rule__LESSER_THAN__Op2Assignment_2 )
            {
             before(grammarAccess.getLESSER_THANAccess().getOp2Assignment_2()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4627:1: ( rule__LESSER_THAN__Op2Assignment_2 )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4627:2: rule__LESSER_THAN__Op2Assignment_2
            {
            pushFollow(FOLLOW_rule__LESSER_THAN__Op2Assignment_2_in_rule__LESSER_THAN__Group__2__Impl9435);
            rule__LESSER_THAN__Op2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLESSER_THANAccess().getOp2Assignment_2()); 

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
    // $ANTLR end "rule__LESSER_THAN__Group__2__Impl"


    // $ANTLR start "rule__LogoProgram__SentencesAssignment"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4644:1: rule__LogoProgram__SentencesAssignment : ( ruleSENTENCE ) ;
    public final void rule__LogoProgram__SentencesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4648:1: ( ( ruleSENTENCE ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4649:1: ( ruleSENTENCE )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4649:1: ( ruleSENTENCE )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4650:1: ruleSENTENCE
            {
             before(grammarAccess.getLogoProgramAccess().getSentencesSENTENCEParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSENTENCE_in_rule__LogoProgram__SentencesAssignment9476);
            ruleSENTENCE();

            state._fsp--;

             after(grammarAccess.getLogoProgramAccess().getSentencesSENTENCEParserRuleCall_0()); 

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
    // $ANTLR end "rule__LogoProgram__SentencesAssignment"


    // $ANTLR start "rule__FORWARD__AmountAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4659:1: rule__FORWARD__AmountAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__FORWARD__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4663:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4664:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4664:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4665:1: ruleEXPRESSION
            {
             before(grammarAccess.getFORWARDAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__FORWARD__AmountAssignment_19507);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getFORWARDAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FORWARD__AmountAssignment_1"


    // $ANTLR start "rule__LEFT__AmountAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4674:1: rule__LEFT__AmountAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__LEFT__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4678:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4679:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4679:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4680:1: ruleEXPRESSION
            {
             before(grammarAccess.getLEFTAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__LEFT__AmountAssignment_19538);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getLEFTAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LEFT__AmountAssignment_1"


    // $ANTLR start "rule__RIGHT__AmountAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4689:1: rule__RIGHT__AmountAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__RIGHT__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4693:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4694:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4694:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4695:1: ruleEXPRESSION
            {
             before(grammarAccess.getRIGHTAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__RIGHT__AmountAssignment_19569);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getRIGHTAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RIGHT__AmountAssignment_1"


    // $ANTLR start "rule__SET_X__AmountAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4704:1: rule__SET_X__AmountAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__SET_X__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4708:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4709:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4709:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4710:1: ruleEXPRESSION
            {
             before(grammarAccess.getSET_XAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__SET_X__AmountAssignment_19600);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getSET_XAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SET_X__AmountAssignment_1"


    // $ANTLR start "rule__SET_Y__AmountAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4719:1: rule__SET_Y__AmountAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__SET_Y__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4723:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4724:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4724:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4725:1: ruleEXPRESSION
            {
             before(grammarAccess.getSET_YAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__SET_Y__AmountAssignment_19631);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getSET_YAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SET_Y__AmountAssignment_1"


    // $ANTLR start "rule__PENCOLOR__ColorAssignment_1_0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4734:1: rule__PENCOLOR__ColorAssignment_1_0 : ( ruleCOLOR ) ;
    public final void rule__PENCOLOR__ColorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4738:1: ( ( ruleCOLOR ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4739:1: ( ruleCOLOR )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4739:1: ( ruleCOLOR )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4740:1: ruleCOLOR
            {
             before(grammarAccess.getPENCOLORAccess().getColorCOLORParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleCOLOR_in_rule__PENCOLOR__ColorAssignment_1_09662);
            ruleCOLOR();

            state._fsp--;

             after(grammarAccess.getPENCOLORAccess().getColorCOLORParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__PENCOLOR__ColorAssignment_1_0"


    // $ANTLR start "rule__PENCOLOR__ColorSpecAssignment_1_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4749:1: rule__PENCOLOR__ColorSpecAssignment_1_1 : ( ruleCOLOR_SPEC ) ;
    public final void rule__PENCOLOR__ColorSpecAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4753:1: ( ( ruleCOLOR_SPEC ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4754:1: ( ruleCOLOR_SPEC )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4754:1: ( ruleCOLOR_SPEC )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4755:1: ruleCOLOR_SPEC
            {
             before(grammarAccess.getPENCOLORAccess().getColorSpecCOLOR_SPECParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCOLOR_SPEC_in_rule__PENCOLOR__ColorSpecAssignment_1_19693);
            ruleCOLOR_SPEC();

            state._fsp--;

             after(grammarAccess.getPENCOLORAccess().getColorSpecCOLOR_SPECParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PENCOLOR__ColorSpecAssignment_1_1"


    // $ANTLR start "rule__CANVAS_COLOR__ColorAssignment_1_0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4764:1: rule__CANVAS_COLOR__ColorAssignment_1_0 : ( ruleCOLOR ) ;
    public final void rule__CANVAS_COLOR__ColorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4768:1: ( ( ruleCOLOR ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4769:1: ( ruleCOLOR )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4769:1: ( ruleCOLOR )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4770:1: ruleCOLOR
            {
             before(grammarAccess.getCANVAS_COLORAccess().getColorCOLORParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleCOLOR_in_rule__CANVAS_COLOR__ColorAssignment_1_09724);
            ruleCOLOR();

            state._fsp--;

             after(grammarAccess.getCANVAS_COLORAccess().getColorCOLORParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__CANVAS_COLOR__ColorAssignment_1_0"


    // $ANTLR start "rule__CANVAS_COLOR__ColorSpecAssignment_1_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4779:1: rule__CANVAS_COLOR__ColorSpecAssignment_1_1 : ( ruleCOLOR_SPEC ) ;
    public final void rule__CANVAS_COLOR__ColorSpecAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4783:1: ( ( ruleCOLOR_SPEC ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4784:1: ( ruleCOLOR_SPEC )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4784:1: ( ruleCOLOR_SPEC )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4785:1: ruleCOLOR_SPEC
            {
             before(grammarAccess.getCANVAS_COLORAccess().getColorSpecCOLOR_SPECParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCOLOR_SPEC_in_rule__CANVAS_COLOR__ColorSpecAssignment_1_19755);
            ruleCOLOR_SPEC();

            state._fsp--;

             after(grammarAccess.getCANVAS_COLORAccess().getColorSpecCOLOR_SPECParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__CANVAS_COLOR__ColorSpecAssignment_1_1"


    // $ANTLR start "rule__COLOR_SPEC__RedAssignment_0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4794:1: rule__COLOR_SPEC__RedAssignment_0 : ( ruleEXPRESSION ) ;
    public final void rule__COLOR_SPEC__RedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4798:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4799:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4799:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4800:1: ruleEXPRESSION
            {
             before(grammarAccess.getCOLOR_SPECAccess().getRedEXPRESSIONParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__COLOR_SPEC__RedAssignment_09786);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getCOLOR_SPECAccess().getRedEXPRESSIONParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__COLOR_SPEC__RedAssignment_0"


    // $ANTLR start "rule__COLOR_SPEC__GreenAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4809:1: rule__COLOR_SPEC__GreenAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__COLOR_SPEC__GreenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4813:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4814:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4814:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4815:1: ruleEXPRESSION
            {
             before(grammarAccess.getCOLOR_SPECAccess().getGreenEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__COLOR_SPEC__GreenAssignment_19817);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getCOLOR_SPECAccess().getGreenEXPRESSIONParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__COLOR_SPEC__GreenAssignment_1"


    // $ANTLR start "rule__COLOR_SPEC__BlueAssignment_2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4824:1: rule__COLOR_SPEC__BlueAssignment_2 : ( ruleEXPRESSION ) ;
    public final void rule__COLOR_SPEC__BlueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4828:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4829:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4829:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4830:1: ruleEXPRESSION
            {
             before(grammarAccess.getCOLOR_SPECAccess().getBlueEXPRESSIONParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__COLOR_SPEC__BlueAssignment_29848);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getCOLOR_SPECAccess().getBlueEXPRESSIONParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__COLOR_SPEC__BlueAssignment_2"


    // $ANTLR start "rule__COLOR_SPEC__AlphaAssignment_3"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4839:1: rule__COLOR_SPEC__AlphaAssignment_3 : ( ruleEXPRESSION ) ;
    public final void rule__COLOR_SPEC__AlphaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4843:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4844:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4844:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4845:1: ruleEXPRESSION
            {
             before(grammarAccess.getCOLOR_SPECAccess().getAlphaEXPRESSIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__COLOR_SPEC__AlphaAssignment_39879);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getCOLOR_SPECAccess().getAlphaEXPRESSIONParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__COLOR_SPEC__AlphaAssignment_3"


    // $ANTLR start "rule__FONT_STYLE__StyleAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4854:1: rule__FONT_STYLE__StyleAssignment_1 : ( ruleFontStyleValues ) ;
    public final void rule__FONT_STYLE__StyleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4858:1: ( ( ruleFontStyleValues ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4859:1: ( ruleFontStyleValues )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4859:1: ( ruleFontStyleValues )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4860:1: ruleFontStyleValues
            {
             before(grammarAccess.getFONT_STYLEAccess().getStyleFontStyleValuesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFontStyleValues_in_rule__FONT_STYLE__StyleAssignment_19910);
            ruleFontStyleValues();

            state._fsp--;

             after(grammarAccess.getFONT_STYLEAccess().getStyleFontStyleValuesParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FONT_STYLE__StyleAssignment_1"


    // $ANTLR start "rule__DRAW_STRING__TextAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4869:1: rule__DRAW_STRING__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DRAW_STRING__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4873:1: ( ( RULE_STRING ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4874:1: ( RULE_STRING )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4874:1: ( RULE_STRING )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4875:1: RULE_STRING
            {
             before(grammarAccess.getDRAW_STRINGAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DRAW_STRING__TextAssignment_19941); 
             after(grammarAccess.getDRAW_STRINGAccess().getTextSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DRAW_STRING__TextAssignment_1"


    // $ANTLR start "rule__MAKE__NameAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4884:1: rule__MAKE__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MAKE__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4888:1: ( ( RULE_ID ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4889:1: ( RULE_ID )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4889:1: ( RULE_ID )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4890:1: RULE_ID
            {
             before(grammarAccess.getMAKEAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MAKE__NameAssignment_19972); 
             after(grammarAccess.getMAKEAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MAKE__NameAssignment_1"


    // $ANTLR start "rule__MAKE__ValueAssignment_3"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4899:1: rule__MAKE__ValueAssignment_3 : ( ruleEXPRESSION ) ;
    public final void rule__MAKE__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4903:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4904:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4904:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4905:1: ruleEXPRESSION
            {
             before(grammarAccess.getMAKEAccess().getValueEXPRESSIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__MAKE__ValueAssignment_310003);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getMAKEAccess().getValueEXPRESSIONParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MAKE__ValueAssignment_3"


    // $ANTLR start "rule__VARIABLE_REF__ToVarAssignment"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4914:1: rule__VARIABLE_REF__ToVarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VARIABLE_REF__ToVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4918:1: ( ( ( RULE_ID ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4919:1: ( ( RULE_ID ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4919:1: ( ( RULE_ID ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4920:1: ( RULE_ID )
            {
             before(grammarAccess.getVARIABLE_REFAccess().getToVarREFERENCIABLECrossReference_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4921:1: ( RULE_ID )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4922:1: RULE_ID
            {
             before(grammarAccess.getVARIABLE_REFAccess().getToVarREFERENCIABLEIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VARIABLE_REF__ToVarAssignment10038); 
             after(grammarAccess.getVARIABLE_REFAccess().getToVarREFERENCIABLEIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVARIABLE_REFAccess().getToVarREFERENCIABLECrossReference_0()); 

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
    // $ANTLR end "rule__VARIABLE_REF__ToVarAssignment"


    // $ANTLR start "rule__VALUE__ValAssignment"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4933:1: rule__VALUE__ValAssignment : ( RULE_DOUBLE ) ;
    public final void rule__VALUE__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4937:1: ( ( RULE_DOUBLE ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4938:1: ( RULE_DOUBLE )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4938:1: ( RULE_DOUBLE )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4939:1: RULE_DOUBLE
            {
             before(grammarAccess.getVALUEAccess().getValDOUBLETerminalRuleCall_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__VALUE__ValAssignment10073); 
             after(grammarAccess.getVALUEAccess().getValDOUBLETerminalRuleCall_0()); 

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
    // $ANTLR end "rule__VALUE__ValAssignment"


    // $ANTLR start "rule__CONTENT__VarAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4948:1: rule__CONTENT__VarAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CONTENT__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4952:1: ( ( ( RULE_ID ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4953:1: ( ( RULE_ID ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4953:1: ( ( RULE_ID ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4954:1: ( RULE_ID )
            {
             before(grammarAccess.getCONTENTAccess().getVarMAKECrossReference_1_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4955:1: ( RULE_ID )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4956:1: RULE_ID
            {
             before(grammarAccess.getCONTENTAccess().getVarMAKEIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CONTENT__VarAssignment_110108); 
             after(grammarAccess.getCONTENTAccess().getVarMAKEIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCONTENTAccess().getVarMAKECrossReference_1_0()); 

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
    // $ANTLR end "rule__CONTENT__VarAssignment_1"


    // $ANTLR start "rule__SUM__TargetVariableAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4967:1: rule__SUM__TargetVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SUM__TargetVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4971:1: ( ( ( RULE_ID ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4972:1: ( ( RULE_ID ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4972:1: ( ( RULE_ID ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4973:1: ( RULE_ID )
            {
             before(grammarAccess.getSUMAccess().getTargetVariableMAKECrossReference_1_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4974:1: ( RULE_ID )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4975:1: RULE_ID
            {
             before(grammarAccess.getSUMAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SUM__TargetVariableAssignment_110147); 
             after(grammarAccess.getSUMAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSUMAccess().getTargetVariableMAKECrossReference_1_0()); 

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
    // $ANTLR end "rule__SUM__TargetVariableAssignment_1"


    // $ANTLR start "rule__SUM__ValOneAssignment_3"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4986:1: rule__SUM__ValOneAssignment_3 : ( ruleEXPRESSION ) ;
    public final void rule__SUM__ValOneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4990:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4991:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4991:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:4992:1: ruleEXPRESSION
            {
             before(grammarAccess.getSUMAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__SUM__ValOneAssignment_310182);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getSUMAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SUM__ValOneAssignment_3"


    // $ANTLR start "rule__SUM__ValTwoAssignment_5"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5001:1: rule__SUM__ValTwoAssignment_5 : ( ruleEXPRESSION ) ;
    public final void rule__SUM__ValTwoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5005:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5006:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5006:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5007:1: ruleEXPRESSION
            {
             before(grammarAccess.getSUMAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__SUM__ValTwoAssignment_510213);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getSUMAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__SUM__ValTwoAssignment_5"


    // $ANTLR start "rule__SUBTRACT__TargetVariableAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5016:1: rule__SUBTRACT__TargetVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SUBTRACT__TargetVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5020:1: ( ( ( RULE_ID ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5021:1: ( ( RULE_ID ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5021:1: ( ( RULE_ID ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5022:1: ( RULE_ID )
            {
             before(grammarAccess.getSUBTRACTAccess().getTargetVariableMAKECrossReference_1_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5023:1: ( RULE_ID )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5024:1: RULE_ID
            {
             before(grammarAccess.getSUBTRACTAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SUBTRACT__TargetVariableAssignment_110248); 
             after(grammarAccess.getSUBTRACTAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSUBTRACTAccess().getTargetVariableMAKECrossReference_1_0()); 

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
    // $ANTLR end "rule__SUBTRACT__TargetVariableAssignment_1"


    // $ANTLR start "rule__SUBTRACT__ValOneAssignment_3"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5035:1: rule__SUBTRACT__ValOneAssignment_3 : ( ruleEXPRESSION ) ;
    public final void rule__SUBTRACT__ValOneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5039:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5040:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5040:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5041:1: ruleEXPRESSION
            {
             before(grammarAccess.getSUBTRACTAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__SUBTRACT__ValOneAssignment_310283);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getSUBTRACTAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SUBTRACT__ValOneAssignment_3"


    // $ANTLR start "rule__SUBTRACT__ValTwoAssignment_5"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5050:1: rule__SUBTRACT__ValTwoAssignment_5 : ( ruleEXPRESSION ) ;
    public final void rule__SUBTRACT__ValTwoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5054:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5055:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5055:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5056:1: ruleEXPRESSION
            {
             before(grammarAccess.getSUBTRACTAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__SUBTRACT__ValTwoAssignment_510314);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getSUBTRACTAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__SUBTRACT__ValTwoAssignment_5"


    // $ANTLR start "rule__MULTIPLY__TargetVariableAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5065:1: rule__MULTIPLY__TargetVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MULTIPLY__TargetVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5069:1: ( ( ( RULE_ID ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5070:1: ( ( RULE_ID ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5070:1: ( ( RULE_ID ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5071:1: ( RULE_ID )
            {
             before(grammarAccess.getMULTIPLYAccess().getTargetVariableMAKECrossReference_1_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5072:1: ( RULE_ID )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5073:1: RULE_ID
            {
             before(grammarAccess.getMULTIPLYAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MULTIPLY__TargetVariableAssignment_110349); 
             after(grammarAccess.getMULTIPLYAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMULTIPLYAccess().getTargetVariableMAKECrossReference_1_0()); 

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
    // $ANTLR end "rule__MULTIPLY__TargetVariableAssignment_1"


    // $ANTLR start "rule__MULTIPLY__ValOneAssignment_3"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5084:1: rule__MULTIPLY__ValOneAssignment_3 : ( ruleEXPRESSION ) ;
    public final void rule__MULTIPLY__ValOneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5088:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5089:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5089:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5090:1: ruleEXPRESSION
            {
             before(grammarAccess.getMULTIPLYAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__MULTIPLY__ValOneAssignment_310384);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getMULTIPLYAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MULTIPLY__ValOneAssignment_3"


    // $ANTLR start "rule__MULTIPLY__ValTwoAssignment_5"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5099:1: rule__MULTIPLY__ValTwoAssignment_5 : ( ruleEXPRESSION ) ;
    public final void rule__MULTIPLY__ValTwoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5103:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5104:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5104:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5105:1: ruleEXPRESSION
            {
             before(grammarAccess.getMULTIPLYAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__MULTIPLY__ValTwoAssignment_510415);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getMULTIPLYAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__MULTIPLY__ValTwoAssignment_5"


    // $ANTLR start "rule__DIVIDE__TargetVariableAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5114:1: rule__DIVIDE__TargetVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DIVIDE__TargetVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5118:1: ( ( ( RULE_ID ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5119:1: ( ( RULE_ID ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5119:1: ( ( RULE_ID ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5120:1: ( RULE_ID )
            {
             before(grammarAccess.getDIVIDEAccess().getTargetVariableMAKECrossReference_1_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5121:1: ( RULE_ID )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5122:1: RULE_ID
            {
             before(grammarAccess.getDIVIDEAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DIVIDE__TargetVariableAssignment_110450); 
             after(grammarAccess.getDIVIDEAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDIVIDEAccess().getTargetVariableMAKECrossReference_1_0()); 

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
    // $ANTLR end "rule__DIVIDE__TargetVariableAssignment_1"


    // $ANTLR start "rule__DIVIDE__ValOneAssignment_3"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5133:1: rule__DIVIDE__ValOneAssignment_3 : ( ruleEXPRESSION ) ;
    public final void rule__DIVIDE__ValOneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5137:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5138:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5138:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5139:1: ruleEXPRESSION
            {
             before(grammarAccess.getDIVIDEAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__DIVIDE__ValOneAssignment_310485);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getDIVIDEAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DIVIDE__ValOneAssignment_3"


    // $ANTLR start "rule__DIVIDE__ValTwoAssignment_5"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5148:1: rule__DIVIDE__ValTwoAssignment_5 : ( ruleEXPRESSION ) ;
    public final void rule__DIVIDE__ValTwoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5152:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5153:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5153:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5154:1: ruleEXPRESSION
            {
             before(grammarAccess.getDIVIDEAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__DIVIDE__ValTwoAssignment_510516);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getDIVIDEAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__DIVIDE__ValTwoAssignment_5"


    // $ANTLR start "rule__REPEAT__TimesAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5163:1: rule__REPEAT__TimesAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__REPEAT__TimesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5167:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5168:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5168:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5169:1: ruleEXPRESSION
            {
             before(grammarAccess.getREPEATAccess().getTimesEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__REPEAT__TimesAssignment_110547);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getREPEATAccess().getTimesEXPRESSIONParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__REPEAT__TimesAssignment_1"


    // $ANTLR start "rule__REPEAT__CommandsAssignment_2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5178:1: rule__REPEAT__CommandsAssignment_2 : ( ruleSENTENCE ) ;
    public final void rule__REPEAT__CommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5182:1: ( ( ruleSENTENCE ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5183:1: ( ruleSENTENCE )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5183:1: ( ruleSENTENCE )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5184:1: ruleSENTENCE
            {
             before(grammarAccess.getREPEATAccess().getCommandsSENTENCEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSENTENCE_in_rule__REPEAT__CommandsAssignment_210578);
            ruleSENTENCE();

            state._fsp--;

             after(grammarAccess.getREPEATAccess().getCommandsSENTENCEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__REPEAT__CommandsAssignment_2"


    // $ANTLR start "rule__TO__NameAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5193:1: rule__TO__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TO__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5197:1: ( ( RULE_ID ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5198:1: ( RULE_ID )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5198:1: ( RULE_ID )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5199:1: RULE_ID
            {
             before(grammarAccess.getTOAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TO__NameAssignment_110609); 
             after(grammarAccess.getTOAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TO__NameAssignment_1"


    // $ANTLR start "rule__TO__ParametersAssignment_2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5208:1: rule__TO__ParametersAssignment_2 : ( rulePARAM ) ;
    public final void rule__TO__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5212:1: ( ( rulePARAM ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5213:1: ( rulePARAM )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5213:1: ( rulePARAM )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5214:1: rulePARAM
            {
             before(grammarAccess.getTOAccess().getParametersPARAMParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePARAM_in_rule__TO__ParametersAssignment_210640);
            rulePARAM();

            state._fsp--;

             after(grammarAccess.getTOAccess().getParametersPARAMParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TO__ParametersAssignment_2"


    // $ANTLR start "rule__TO__CommandsAssignment_3"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5223:1: rule__TO__CommandsAssignment_3 : ( ruleSENTENCE ) ;
    public final void rule__TO__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5227:1: ( ( ruleSENTENCE ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5228:1: ( ruleSENTENCE )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5228:1: ( ruleSENTENCE )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5229:1: ruleSENTENCE
            {
             before(grammarAccess.getTOAccess().getCommandsSENTENCEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSENTENCE_in_rule__TO__CommandsAssignment_310671);
            ruleSENTENCE();

            state._fsp--;

             after(grammarAccess.getTOAccess().getCommandsSENTENCEParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__TO__CommandsAssignment_3"


    // $ANTLR start "rule__PARAM__NameAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5238:1: rule__PARAM__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PARAM__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5242:1: ( ( RULE_ID ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5243:1: ( RULE_ID )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5243:1: ( RULE_ID )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5244:1: RULE_ID
            {
             before(grammarAccess.getPARAMAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PARAM__NameAssignment_110702); 
             after(grammarAccess.getPARAMAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PARAM__NameAssignment_1"


    // $ANTLR start "rule__PROCEDURE_CALL__ToAssignment_0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5253:1: rule__PROCEDURE_CALL__ToAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PROCEDURE_CALL__ToAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5257:1: ( ( ( RULE_ID ) ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5258:1: ( ( RULE_ID ) )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5258:1: ( ( RULE_ID ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5259:1: ( RULE_ID )
            {
             before(grammarAccess.getPROCEDURE_CALLAccess().getToTOCrossReference_0_0()); 
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5260:1: ( RULE_ID )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5261:1: RULE_ID
            {
             before(grammarAccess.getPROCEDURE_CALLAccess().getToTOIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PROCEDURE_CALL__ToAssignment_010737); 
             after(grammarAccess.getPROCEDURE_CALLAccess().getToTOIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPROCEDURE_CALLAccess().getToTOCrossReference_0_0()); 

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
    // $ANTLR end "rule__PROCEDURE_CALL__ToAssignment_0"


    // $ANTLR start "rule__PROCEDURE_CALL__ParamsAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5272:1: rule__PROCEDURE_CALL__ParamsAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__PROCEDURE_CALL__ParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5276:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5277:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5277:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5278:1: ruleEXPRESSION
            {
             before(grammarAccess.getPROCEDURE_CALLAccess().getParamsEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__PROCEDURE_CALL__ParamsAssignment_110772);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getPROCEDURE_CALLAccess().getParamsEXPRESSIONParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PROCEDURE_CALL__ParamsAssignment_1"


    // $ANTLR start "rule__IF_SENTENCE__ConditionAssignment_1"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5287:1: rule__IF_SENTENCE__ConditionAssignment_1 : ( ruleBOOLEAN_EXPRESSION ) ;
    public final void rule__IF_SENTENCE__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5291:1: ( ( ruleBOOLEAN_EXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5292:1: ( ruleBOOLEAN_EXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5292:1: ( ruleBOOLEAN_EXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5293:1: ruleBOOLEAN_EXPRESSION
            {
             before(grammarAccess.getIF_SENTENCEAccess().getConditionBOOLEAN_EXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_EXPRESSION_in_rule__IF_SENTENCE__ConditionAssignment_110803);
            ruleBOOLEAN_EXPRESSION();

            state._fsp--;

             after(grammarAccess.getIF_SENTENCEAccess().getConditionBOOLEAN_EXPRESSIONParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__IF_SENTENCE__ConditionAssignment_1"


    // $ANTLR start "rule__IF_SENTENCE__CommandsAssignment_2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5302:1: rule__IF_SENTENCE__CommandsAssignment_2 : ( ruleSENTENCE ) ;
    public final void rule__IF_SENTENCE__CommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5306:1: ( ( ruleSENTENCE ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5307:1: ( ruleSENTENCE )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5307:1: ( ruleSENTENCE )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5308:1: ruleSENTENCE
            {
             before(grammarAccess.getIF_SENTENCEAccess().getCommandsSENTENCEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSENTENCE_in_rule__IF_SENTENCE__CommandsAssignment_210834);
            ruleSENTENCE();

            state._fsp--;

             after(grammarAccess.getIF_SENTENCEAccess().getCommandsSENTENCEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__IF_SENTENCE__CommandsAssignment_2"


    // $ANTLR start "rule__EQUALS__Op1Assignment_0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5317:1: rule__EQUALS__Op1Assignment_0 : ( ruleEXPRESSION ) ;
    public final void rule__EQUALS__Op1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5321:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5322:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5322:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5323:1: ruleEXPRESSION
            {
             before(grammarAccess.getEQUALSAccess().getOp1EXPRESSIONParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__EQUALS__Op1Assignment_010865);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getEQUALSAccess().getOp1EXPRESSIONParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__EQUALS__Op1Assignment_0"


    // $ANTLR start "rule__EQUALS__Op2Assignment_2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5332:1: rule__EQUALS__Op2Assignment_2 : ( ruleEXPRESSION ) ;
    public final void rule__EQUALS__Op2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5336:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5337:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5337:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5338:1: ruleEXPRESSION
            {
             before(grammarAccess.getEQUALSAccess().getOp2EXPRESSIONParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__EQUALS__Op2Assignment_210896);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getEQUALSAccess().getOp2EXPRESSIONParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EQUALS__Op2Assignment_2"


    // $ANTLR start "rule__GREATER_THAN__Op1Assignment_0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5347:1: rule__GREATER_THAN__Op1Assignment_0 : ( ruleEXPRESSION ) ;
    public final void rule__GREATER_THAN__Op1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5351:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5352:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5352:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5353:1: ruleEXPRESSION
            {
             before(grammarAccess.getGREATER_THANAccess().getOp1EXPRESSIONParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__GREATER_THAN__Op1Assignment_010927);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getGREATER_THANAccess().getOp1EXPRESSIONParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__GREATER_THAN__Op1Assignment_0"


    // $ANTLR start "rule__GREATER_THAN__Op2Assignment_2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5362:1: rule__GREATER_THAN__Op2Assignment_2 : ( ruleEXPRESSION ) ;
    public final void rule__GREATER_THAN__Op2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5366:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5367:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5367:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5368:1: ruleEXPRESSION
            {
             before(grammarAccess.getGREATER_THANAccess().getOp2EXPRESSIONParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__GREATER_THAN__Op2Assignment_210958);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getGREATER_THANAccess().getOp2EXPRESSIONParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__GREATER_THAN__Op2Assignment_2"


    // $ANTLR start "rule__LESSER_THAN__Op1Assignment_0"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5377:1: rule__LESSER_THAN__Op1Assignment_0 : ( ruleEXPRESSION ) ;
    public final void rule__LESSER_THAN__Op1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5381:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5382:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5382:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5383:1: ruleEXPRESSION
            {
             before(grammarAccess.getLESSER_THANAccess().getOp1EXPRESSIONParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__LESSER_THAN__Op1Assignment_010989);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getLESSER_THANAccess().getOp1EXPRESSIONParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LESSER_THAN__Op1Assignment_0"


    // $ANTLR start "rule__LESSER_THAN__Op2Assignment_2"
    // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5392:1: rule__LESSER_THAN__Op2Assignment_2 : ( ruleEXPRESSION ) ;
    public final void rule__LESSER_THAN__Op2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5396:1: ( ( ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5397:1: ( ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5397:1: ( ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl.ui/src-gen/org/inria/diverse/logo/dsl/ui/contentassist/antlr/internal/InternalLogoDSL.g:5398:1: ruleEXPRESSION
            {
             before(grammarAccess.getLESSER_THANAccess().getOp2EXPRESSIONParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__LESSER_THAN__Op2Assignment_211020);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getLESSER_THANAccess().getOp2EXPRESSIONParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LESSER_THAN__Op2Assignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLogoProgram_in_entryRuleLogoProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogoProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogoProgram__SentencesAssignment_in_ruleLogoProgram94 = new BitSet(new long[]{0x02555BC7FE000022L});
    public static final BitSet FOLLOW_ruleSENTENCE_in_entryRuleSENTENCE122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSENTENCE129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SENTENCE__Alternatives_in_ruleSENTENCE155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMOVE_in_entryRuleMOVE182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMOVE189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MOVE__Alternatives_in_ruleMOVE215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFORWARD_in_entryRuleFORWARD242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFORWARD249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FORWARD__Group__0_in_ruleFORWARD275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLEFT_in_entryRuleLEFT302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLEFT309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEFT__Group__0_in_ruleLEFT335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRIGHT_in_entryRuleRIGHT362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRIGHT369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RIGHT__Group__0_in_ruleRIGHT395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSET_X_in_entryRuleSET_X422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSET_X429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SET_X__Group__0_in_ruleSET_X455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSET_Y_in_entryRuleSET_Y482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSET_Y489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SET_Y__Group__0_in_ruleSET_Y515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDRAWING_SENTENCE_in_entryRuleDRAWING_SENTENCE542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDRAWING_SENTENCE549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DRAWING_SENTENCE__Alternatives_in_ruleDRAWING_SENTENCE575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENDOWN_in_entryRulePENDOWN602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePENDOWN609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENDOWN__Group__0_in_rulePENDOWN635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENUP_in_entryRulePENUP662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePENUP669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENUP__Group__0_in_rulePENUP695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOREABLE_in_entryRuleCOLOREABLE722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOLOREABLE729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOREABLE__Alternatives_in_ruleCOLOREABLE755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENCOLOR_in_entryRulePENCOLOR782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePENCOLOR789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENCOLOR__Group__0_in_rulePENCOLOR815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCANVAS_COLOR_in_entryRuleCANVAS_COLOR842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCANVAS_COLOR849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CANVAS_COLOR__Group__0_in_ruleCANVAS_COLOR875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOR_SPEC_in_entryRuleCOLOR_SPEC902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOLOR_SPEC909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__Group__0_in_ruleCOLOR_SPEC935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOR_in_entryRuleCOLOR962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOLOR969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR__Alternatives_in_ruleCOLOR995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFONT_SPEC_in_entryRuleFONT_SPEC1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFONT_SPEC1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFONT_STYLE_in_ruleFONT_SPEC1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFONT_STYLE_in_entryRuleFONT_STYLE1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFONT_STYLE1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FONT_STYLE__Group__0_in_ruleFONT_STYLE1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontStyleValues_in_entryRuleFontStyleValues1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFontStyleValues1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Alternatives_in_ruleFontStyleValues1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLEAR_in_entryRuleCLEAR1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLEAR1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLEAR__Group__0_in_ruleCLEAR1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHOME_in_entryRuleHOME1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHOME1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HOME__Group__0_in_ruleHOME1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDRAW_STRING_in_entryRuleDRAW_STRING1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDRAW_STRING1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DRAW_STRING__Group__0_in_ruleDRAW_STRING1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMAKE_in_entryRuleMAKE1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMAKE1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAKE__Group__0_in_ruleMAKE1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_REF_in_entryRuleVARIABLE_REF1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVARIABLE_REF1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_REF__ToVarAssignment_in_ruleVARIABLE_REF1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_entryRuleEXPRESSION1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRESSION1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__Alternatives_in_ruleEXPRESSION1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVALUE_in_entryRuleVALUE1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVALUE1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VALUE__ValAssignment_in_ruleVALUE1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCONTENT_in_entryRuleCONTENT1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCONTENT1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CONTENT__Group__0_in_ruleCONTENT1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATION_in_entryRuleOPERATION1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOPERATION1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OPERATION__Alternatives_in_ruleOPERATION1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSUM_in_entryRuleSUM1743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSUM1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__Group__0_in_ruleSUM1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSUBTRACT_in_entryRuleSUBTRACT1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSUBTRACT1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__0_in_ruleSUBTRACT1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLY_in_entryRuleMULTIPLY1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMULTIPLY1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__0_in_ruleMULTIPLY1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDIVIDE_in_entryRuleDIVIDE1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDIVIDE1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__0_in_ruleDIVIDE1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCONTROL_SENTENCES_in_entryRuleCONTROL_SENTENCES1983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCONTROL_SENTENCES1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CONTROL_SENTENCES__Alternatives_in_ruleCONTROL_SENTENCES2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREPEAT_in_entryRuleREPEAT2043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREPEAT2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REPEAT__Group__0_in_ruleREPEAT2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTO_in_entryRuleTO2103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTO2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TO__Group__0_in_ruleTO2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePARAM_in_entryRulePARAM2163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePARAM2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PARAM__Group__0_in_rulePARAM2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePROCEDURE_CALL_in_entryRulePROCEDURE_CALL2223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePROCEDURE_CALL2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PROCEDURE_CALL__Group__0_in_rulePROCEDURE_CALL2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIF_SENTENCE_in_entryRuleIF_SENTENCE2283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIF_SENTENCE2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IF_SENTENCE__Group__0_in_ruleIF_SENTENCE2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_EXPRESSION_in_entryRuleBOOLEAN_EXPRESSION2343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN_EXPRESSION2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN_EXPRESSION__Alternatives_in_ruleBOOLEAN_EXPRESSION2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQUALS_in_entryRuleEQUALS2403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEQUALS2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQUALS__Group__0_in_ruleEQUALS2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGREATER_THAN_in_entryRuleGREATER_THAN2463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGREATER_THAN2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GREATER_THAN__Group__0_in_ruleGREATER_THAN2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLESSER_THAN_in_entryRuleLESSER_THAN2523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLESSER_THAN2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LESSER_THAN__Group__0_in_ruleLESSER_THAN2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMAKE_in_rule__SENTENCE__Alternatives2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCONTENT_in_rule__SENTENCE__Alternatives2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePROCEDURE_CALL_in_rule__SENTENCE__Alternatives2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATION_in_rule__SENTENCE__Alternatives2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCONTROL_SENTENCES_in_rule__SENTENCE__Alternatives2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMOVE_in_rule__SENTENCE__Alternatives2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDRAWING_SENTENCE_in_rule__SENTENCE__Alternatives2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFORWARD_in_rule__MOVE__Alternatives2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLEFT_in_rule__MOVE__Alternatives2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRIGHT_in_rule__MOVE__Alternatives2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSET_X_in_rule__MOVE__Alternatives2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSET_Y_in_rule__MOVE__Alternatives2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENDOWN_in_rule__DRAWING_SENTENCE__Alternatives2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENUP_in_rule__DRAWING_SENTENCE__Alternatives2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLEAR_in_rule__DRAWING_SENTENCE__Alternatives2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHOME_in_rule__DRAWING_SENTENCE__Alternatives2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOREABLE_in_rule__DRAWING_SENTENCE__Alternatives2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFONT_SPEC_in_rule__DRAWING_SENTENCE__Alternatives2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDRAW_STRING_in_rule__DRAWING_SENTENCE__Alternatives2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENCOLOR_in_rule__COLOREABLE__Alternatives2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCANVAS_COLOR_in_rule__COLOREABLE__Alternatives2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENCOLOR__ColorAssignment_1_0_in_rule__PENCOLOR__Alternatives_13009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENCOLOR__ColorSpecAssignment_1_1_in_rule__PENCOLOR__Alternatives_13027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CANVAS_COLOR__ColorAssignment_1_0_in_rule__CANVAS_COLOR__Alternatives_13060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CANVAS_COLOR__ColorSpecAssignment_1_1_in_rule__CANVAS_COLOR__Alternatives_13078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__COLOR__Alternatives3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__COLOR__Alternatives3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__COLOR__Alternatives3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__COLOR__Alternatives3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__COLOR__Alternatives3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__COLOR__Alternatives3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__COLOR__Alternatives3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__COLOR__Alternatives3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__COLOR__Alternatives3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__COLOR__Alternatives3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__COLOR__Alternatives3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__COLOR__Alternatives3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__COLOR__Alternatives3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_0__0_in_rule__FontStyleValues__Alternatives3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_1__0_in_rule__FontStyleValues__Alternatives3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_2__0_in_rule__FontStyleValues__Alternatives3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_REF_in_rule__EXPRESSION__Alternatives3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVALUE_in_rule__EXPRESSION__Alternatives3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSUM_in_rule__OPERATION__Alternatives3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSUBTRACT_in_rule__OPERATION__Alternatives3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLY_in_rule__OPERATION__Alternatives3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDIVIDE_in_rule__OPERATION__Alternatives3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREPEAT_in_rule__CONTROL_SENTENCES__Alternatives3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTO_in_rule__CONTROL_SENTENCES__Alternatives3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIF_SENTENCE_in_rule__CONTROL_SENTENCES__Alternatives3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQUALS_in_rule__BOOLEAN_EXPRESSION__Alternatives3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGREATER_THAN_in_rule__BOOLEAN_EXPRESSION__Alternatives3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLESSER_THAN_in_rule__BOOLEAN_EXPRESSION__Alternatives3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FORWARD__Group__0__Impl_in_rule__FORWARD__Group__03718 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__FORWARD__Group__1_in_rule__FORWARD__Group__03721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FORWARD__Group__0__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FORWARD__Group__1__Impl_in_rule__FORWARD__Group__13780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FORWARD__AmountAssignment_1_in_rule__FORWARD__Group__1__Impl3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEFT__Group__0__Impl_in_rule__LEFT__Group__03841 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__LEFT__Group__1_in_rule__LEFT__Group__03844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LEFT__Group__0__Impl3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEFT__Group__1__Impl_in_rule__LEFT__Group__13903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEFT__AmountAssignment_1_in_rule__LEFT__Group__1__Impl3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RIGHT__Group__0__Impl_in_rule__RIGHT__Group__03964 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__RIGHT__Group__1_in_rule__RIGHT__Group__03967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RIGHT__Group__0__Impl3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RIGHT__Group__1__Impl_in_rule__RIGHT__Group__14026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RIGHT__AmountAssignment_1_in_rule__RIGHT__Group__1__Impl4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SET_X__Group__0__Impl_in_rule__SET_X__Group__04087 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__SET_X__Group__1_in_rule__SET_X__Group__04090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SET_X__Group__0__Impl4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SET_X__Group__1__Impl_in_rule__SET_X__Group__14149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SET_X__AmountAssignment_1_in_rule__SET_X__Group__1__Impl4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SET_Y__Group__0__Impl_in_rule__SET_Y__Group__04210 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__SET_Y__Group__1_in_rule__SET_Y__Group__04213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SET_Y__Group__0__Impl4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SET_Y__Group__1__Impl_in_rule__SET_Y__Group__14272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SET_Y__AmountAssignment_1_in_rule__SET_Y__Group__1__Impl4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENDOWN__Group__0__Impl_in_rule__PENDOWN__Group__04333 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__PENDOWN__Group__1_in_rule__PENDOWN__Group__04336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENDOWN__Group__1__Impl_in_rule__PENDOWN__Group__14394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PENDOWN__Group__1__Impl4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENUP__Group__0__Impl_in_rule__PENUP__Group__04457 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PENUP__Group__1_in_rule__PENUP__Group__04460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENUP__Group__1__Impl_in_rule__PENUP__Group__14518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PENUP__Group__1__Impl4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENCOLOR__Group__0__Impl_in_rule__PENCOLOR__Group__04581 = new BitSet(new long[]{0x0000000001FFF060L});
    public static final BitSet FOLLOW_rule__PENCOLOR__Group__1_in_rule__PENCOLOR__Group__04584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PENCOLOR__Group__0__Impl4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENCOLOR__Group__1__Impl_in_rule__PENCOLOR__Group__14643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENCOLOR__Alternatives_1_in_rule__PENCOLOR__Group__1__Impl4670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CANVAS_COLOR__Group__0__Impl_in_rule__CANVAS_COLOR__Group__04704 = new BitSet(new long[]{0x0000000001FFF060L});
    public static final BitSet FOLLOW_rule__CANVAS_COLOR__Group__1_in_rule__CANVAS_COLOR__Group__04707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CANVAS_COLOR__Group__0__Impl4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CANVAS_COLOR__Group__1__Impl_in_rule__CANVAS_COLOR__Group__14766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CANVAS_COLOR__Alternatives_1_in_rule__CANVAS_COLOR__Group__1__Impl4793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__Group__0__Impl_in_rule__COLOR_SPEC__Group__04827 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__Group__1_in_rule__COLOR_SPEC__Group__04830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__RedAssignment_0_in_rule__COLOR_SPEC__Group__0__Impl4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__Group__1__Impl_in_rule__COLOR_SPEC__Group__14887 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__Group__2_in_rule__COLOR_SPEC__Group__14890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__GreenAssignment_1_in_rule__COLOR_SPEC__Group__1__Impl4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__Group__2__Impl_in_rule__COLOR_SPEC__Group__24947 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__Group__3_in_rule__COLOR_SPEC__Group__24950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__BlueAssignment_2_in_rule__COLOR_SPEC__Group__2__Impl4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__Group__3__Impl_in_rule__COLOR_SPEC__Group__35007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__AlphaAssignment_3_in_rule__COLOR_SPEC__Group__3__Impl5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FONT_STYLE__Group__0__Impl_in_rule__FONT_STYLE__Group__05072 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_rule__FONT_STYLE__Group__1_in_rule__FONT_STYLE__Group__05075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FONT_STYLE__Group__0__Impl5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FONT_STYLE__Group__1__Impl_in_rule__FONT_STYLE__Group__15134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FONT_STYLE__StyleAssignment_1_in_rule__FONT_STYLE__Group__1__Impl5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_0__0__Impl_in_rule__FontStyleValues__Group_0__05195 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_0__1_in_rule__FontStyleValues__Group_0__05198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_0__1__Impl_in_rule__FontStyleValues__Group_0__15256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FontStyleValues__Group_0__1__Impl5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_1__0__Impl_in_rule__FontStyleValues__Group_1__05319 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_1__1_in_rule__FontStyleValues__Group_1__05322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_1__1__Impl_in_rule__FontStyleValues__Group_1__15380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FontStyleValues__Group_1__1__Impl5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_2__0__Impl_in_rule__FontStyleValues__Group_2__05443 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_2__1_in_rule__FontStyleValues__Group_2__05446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_2__1__Impl_in_rule__FontStyleValues__Group_2__15504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FontStyleValues__Group_2__1__Impl5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLEAR__Group__0__Impl_in_rule__CLEAR__Group__05567 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__CLEAR__Group__1_in_rule__CLEAR__Group__05570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLEAR__Group__1__Impl_in_rule__CLEAR__Group__15628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__CLEAR__Group__1__Impl5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HOME__Group__0__Impl_in_rule__HOME__Group__05691 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__HOME__Group__1_in_rule__HOME__Group__05694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HOME__Group__1__Impl_in_rule__HOME__Group__15752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__HOME__Group__1__Impl5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DRAW_STRING__Group__0__Impl_in_rule__DRAW_STRING__Group__05815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DRAW_STRING__Group__1_in_rule__DRAW_STRING__Group__05818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DRAW_STRING__Group__0__Impl5846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DRAW_STRING__Group__1__Impl_in_rule__DRAW_STRING__Group__15877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DRAW_STRING__TextAssignment_1_in_rule__DRAW_STRING__Group__1__Impl5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAKE__Group__0__Impl_in_rule__MAKE__Group__05938 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MAKE__Group__1_in_rule__MAKE__Group__05941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MAKE__Group__0__Impl5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAKE__Group__1__Impl_in_rule__MAKE__Group__16000 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__MAKE__Group__2_in_rule__MAKE__Group__16003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAKE__NameAssignment_1_in_rule__MAKE__Group__1__Impl6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAKE__Group__2__Impl_in_rule__MAKE__Group__26060 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__MAKE__Group__3_in_rule__MAKE__Group__26063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MAKE__Group__2__Impl6091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAKE__Group__3__Impl_in_rule__MAKE__Group__36122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAKE__ValueAssignment_3_in_rule__MAKE__Group__3__Impl6149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CONTENT__Group__0__Impl_in_rule__CONTENT__Group__06187 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CONTENT__Group__1_in_rule__CONTENT__Group__06190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__CONTENT__Group__0__Impl6218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CONTENT__Group__1__Impl_in_rule__CONTENT__Group__16249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CONTENT__VarAssignment_1_in_rule__CONTENT__Group__1__Impl6276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__Group__0__Impl_in_rule__SUM__Group__06310 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SUM__Group__1_in_rule__SUM__Group__06313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__SUM__Group__0__Impl6341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__Group__1__Impl_in_rule__SUM__Group__16372 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__SUM__Group__2_in_rule__SUM__Group__16375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__TargetVariableAssignment_1_in_rule__SUM__Group__1__Impl6402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__Group__2__Impl_in_rule__SUM__Group__26432 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__SUM__Group__3_in_rule__SUM__Group__26435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SUM__Group__2__Impl6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__Group__3__Impl_in_rule__SUM__Group__36494 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__SUM__Group__4_in_rule__SUM__Group__36497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__ValOneAssignment_3_in_rule__SUM__Group__3__Impl6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__Group__4__Impl_in_rule__SUM__Group__46554 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__SUM__Group__5_in_rule__SUM__Group__46557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__SUM__Group__4__Impl6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__Group__5__Impl_in_rule__SUM__Group__56616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__ValTwoAssignment_5_in_rule__SUM__Group__5__Impl6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__0__Impl_in_rule__SUBTRACT__Group__06685 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__1_in_rule__SUBTRACT__Group__06688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__SUBTRACT__Group__0__Impl6716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__1__Impl_in_rule__SUBTRACT__Group__16747 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__2_in_rule__SUBTRACT__Group__16750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__TargetVariableAssignment_1_in_rule__SUBTRACT__Group__1__Impl6777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__2__Impl_in_rule__SUBTRACT__Group__26807 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__3_in_rule__SUBTRACT__Group__26810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SUBTRACT__Group__2__Impl6838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__3__Impl_in_rule__SUBTRACT__Group__36869 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__4_in_rule__SUBTRACT__Group__36872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__ValOneAssignment_3_in_rule__SUBTRACT__Group__3__Impl6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__4__Impl_in_rule__SUBTRACT__Group__46929 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__5_in_rule__SUBTRACT__Group__46932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__SUBTRACT__Group__4__Impl6960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__5__Impl_in_rule__SUBTRACT__Group__56991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__ValTwoAssignment_5_in_rule__SUBTRACT__Group__5__Impl7018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__0__Impl_in_rule__MULTIPLY__Group__07060 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__1_in_rule__MULTIPLY__Group__07063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MULTIPLY__Group__0__Impl7091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__1__Impl_in_rule__MULTIPLY__Group__17122 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__2_in_rule__MULTIPLY__Group__17125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__TargetVariableAssignment_1_in_rule__MULTIPLY__Group__1__Impl7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__2__Impl_in_rule__MULTIPLY__Group__27182 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__3_in_rule__MULTIPLY__Group__27185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MULTIPLY__Group__2__Impl7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__3__Impl_in_rule__MULTIPLY__Group__37244 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__4_in_rule__MULTIPLY__Group__37247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__ValOneAssignment_3_in_rule__MULTIPLY__Group__3__Impl7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__4__Impl_in_rule__MULTIPLY__Group__47304 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__5_in_rule__MULTIPLY__Group__47307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__MULTIPLY__Group__4__Impl7335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__5__Impl_in_rule__MULTIPLY__Group__57366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__ValTwoAssignment_5_in_rule__MULTIPLY__Group__5__Impl7393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__0__Impl_in_rule__DIVIDE__Group__07435 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__1_in_rule__DIVIDE__Group__07438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__DIVIDE__Group__0__Impl7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__1__Impl_in_rule__DIVIDE__Group__17497 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__2_in_rule__DIVIDE__Group__17500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__TargetVariableAssignment_1_in_rule__DIVIDE__Group__1__Impl7527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__2__Impl_in_rule__DIVIDE__Group__27557 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__3_in_rule__DIVIDE__Group__27560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__DIVIDE__Group__2__Impl7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__3__Impl_in_rule__DIVIDE__Group__37619 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__4_in_rule__DIVIDE__Group__37622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__ValOneAssignment_3_in_rule__DIVIDE__Group__3__Impl7649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__4__Impl_in_rule__DIVIDE__Group__47679 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__5_in_rule__DIVIDE__Group__47682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__DIVIDE__Group__4__Impl7710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__5__Impl_in_rule__DIVIDE__Group__57741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__ValTwoAssignment_5_in_rule__DIVIDE__Group__5__Impl7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REPEAT__Group__0__Impl_in_rule__REPEAT__Group__07810 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__REPEAT__Group__1_in_rule__REPEAT__Group__07813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__REPEAT__Group__0__Impl7841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REPEAT__Group__1__Impl_in_rule__REPEAT__Group__17872 = new BitSet(new long[]{0x02555BC7FE000020L});
    public static final BitSet FOLLOW_rule__REPEAT__Group__2_in_rule__REPEAT__Group__17875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REPEAT__TimesAssignment_1_in_rule__REPEAT__Group__1__Impl7902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REPEAT__Group__2__Impl_in_rule__REPEAT__Group__27932 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__REPEAT__Group__3_in_rule__REPEAT__Group__27935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REPEAT__CommandsAssignment_2_in_rule__REPEAT__Group__2__Impl7964 = new BitSet(new long[]{0x02555BC7FE000022L});
    public static final BitSet FOLLOW_rule__REPEAT__CommandsAssignment_2_in_rule__REPEAT__Group__2__Impl7976 = new BitSet(new long[]{0x02555BC7FE000022L});
    public static final BitSet FOLLOW_rule__REPEAT__Group__3__Impl_in_rule__REPEAT__Group__38009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__REPEAT__Group__3__Impl8037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TO__Group__0__Impl_in_rule__TO__Group__08076 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TO__Group__1_in_rule__TO__Group__08079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__TO__Group__0__Impl8107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TO__Group__1__Impl_in_rule__TO__Group__18138 = new BitSet(new long[]{0x03555BC7FE000020L});
    public static final BitSet FOLLOW_rule__TO__Group__2_in_rule__TO__Group__18141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TO__NameAssignment_1_in_rule__TO__Group__1__Impl8168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TO__Group__2__Impl_in_rule__TO__Group__28198 = new BitSet(new long[]{0x03555BC7FE000020L});
    public static final BitSet FOLLOW_rule__TO__Group__3_in_rule__TO__Group__28201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TO__ParametersAssignment_2_in_rule__TO__Group__2__Impl8228 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_rule__TO__Group__3__Impl_in_rule__TO__Group__38259 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__TO__Group__4_in_rule__TO__Group__38262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TO__CommandsAssignment_3_in_rule__TO__Group__3__Impl8291 = new BitSet(new long[]{0x03555BC7FE000022L});
    public static final BitSet FOLLOW_rule__TO__CommandsAssignment_3_in_rule__TO__Group__3__Impl8303 = new BitSet(new long[]{0x03555BC7FE000022L});
    public static final BitSet FOLLOW_rule__TO__Group__4__Impl_in_rule__TO__Group__48336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__TO__Group__4__Impl8364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PARAM__Group__0__Impl_in_rule__PARAM__Group__08405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PARAM__Group__1_in_rule__PARAM__Group__08408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__PARAM__Group__0__Impl8436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PARAM__Group__1__Impl_in_rule__PARAM__Group__18467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PARAM__NameAssignment_1_in_rule__PARAM__Group__1__Impl8494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PROCEDURE_CALL__Group__0__Impl_in_rule__PROCEDURE_CALL__Group__08528 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__PROCEDURE_CALL__Group__1_in_rule__PROCEDURE_CALL__Group__08531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PROCEDURE_CALL__ToAssignment_0_in_rule__PROCEDURE_CALL__Group__0__Impl8558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PROCEDURE_CALL__Group__1__Impl_in_rule__PROCEDURE_CALL__Group__18588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PROCEDURE_CALL__ParamsAssignment_1_in_rule__PROCEDURE_CALL__Group__1__Impl8615 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_rule__IF_SENTENCE__Group__0__Impl_in_rule__IF_SENTENCE__Group__08650 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__IF_SENTENCE__Group__1_in_rule__IF_SENTENCE__Group__08653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__IF_SENTENCE__Group__0__Impl8681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IF_SENTENCE__Group__1__Impl_in_rule__IF_SENTENCE__Group__18712 = new BitSet(new long[]{0x02555BC7FE000020L});
    public static final BitSet FOLLOW_rule__IF_SENTENCE__Group__2_in_rule__IF_SENTENCE__Group__18715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IF_SENTENCE__ConditionAssignment_1_in_rule__IF_SENTENCE__Group__1__Impl8742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IF_SENTENCE__Group__2__Impl_in_rule__IF_SENTENCE__Group__28772 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__IF_SENTENCE__Group__3_in_rule__IF_SENTENCE__Group__28775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IF_SENTENCE__CommandsAssignment_2_in_rule__IF_SENTENCE__Group__2__Impl8804 = new BitSet(new long[]{0x02555BC7FE000022L});
    public static final BitSet FOLLOW_rule__IF_SENTENCE__CommandsAssignment_2_in_rule__IF_SENTENCE__Group__2__Impl8816 = new BitSet(new long[]{0x02555BC7FE000022L});
    public static final BitSet FOLLOW_rule__IF_SENTENCE__Group__3__Impl_in_rule__IF_SENTENCE__Group__38849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__IF_SENTENCE__Group__3__Impl8877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQUALS__Group__0__Impl_in_rule__EQUALS__Group__08916 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__EQUALS__Group__1_in_rule__EQUALS__Group__08919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQUALS__Op1Assignment_0_in_rule__EQUALS__Group__0__Impl8946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQUALS__Group__1__Impl_in_rule__EQUALS__Group__18976 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__EQUALS__Group__2_in_rule__EQUALS__Group__18979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EQUALS__Group__1__Impl9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQUALS__Group__2__Impl_in_rule__EQUALS__Group__29038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQUALS__Op2Assignment_2_in_rule__EQUALS__Group__2__Impl9065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GREATER_THAN__Group__0__Impl_in_rule__GREATER_THAN__Group__09101 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__GREATER_THAN__Group__1_in_rule__GREATER_THAN__Group__09104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GREATER_THAN__Op1Assignment_0_in_rule__GREATER_THAN__Group__0__Impl9131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GREATER_THAN__Group__1__Impl_in_rule__GREATER_THAN__Group__19161 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__GREATER_THAN__Group__2_in_rule__GREATER_THAN__Group__19164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__GREATER_THAN__Group__1__Impl9192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GREATER_THAN__Group__2__Impl_in_rule__GREATER_THAN__Group__29223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GREATER_THAN__Op2Assignment_2_in_rule__GREATER_THAN__Group__2__Impl9250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LESSER_THAN__Group__0__Impl_in_rule__LESSER_THAN__Group__09286 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__LESSER_THAN__Group__1_in_rule__LESSER_THAN__Group__09289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LESSER_THAN__Op1Assignment_0_in_rule__LESSER_THAN__Group__0__Impl9316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LESSER_THAN__Group__1__Impl_in_rule__LESSER_THAN__Group__19346 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__LESSER_THAN__Group__2_in_rule__LESSER_THAN__Group__19349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__LESSER_THAN__Group__1__Impl9377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LESSER_THAN__Group__2__Impl_in_rule__LESSER_THAN__Group__29408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LESSER_THAN__Op2Assignment_2_in_rule__LESSER_THAN__Group__2__Impl9435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSENTENCE_in_rule__LogoProgram__SentencesAssignment9476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__FORWARD__AmountAssignment_19507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__LEFT__AmountAssignment_19538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__RIGHT__AmountAssignment_19569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__SET_X__AmountAssignment_19600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__SET_Y__AmountAssignment_19631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOR_in_rule__PENCOLOR__ColorAssignment_1_09662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOR_SPEC_in_rule__PENCOLOR__ColorSpecAssignment_1_19693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOR_in_rule__CANVAS_COLOR__ColorAssignment_1_09724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOR_SPEC_in_rule__CANVAS_COLOR__ColorSpecAssignment_1_19755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__COLOR_SPEC__RedAssignment_09786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__COLOR_SPEC__GreenAssignment_19817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__COLOR_SPEC__BlueAssignment_29848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__COLOR_SPEC__AlphaAssignment_39879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontStyleValues_in_rule__FONT_STYLE__StyleAssignment_19910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DRAW_STRING__TextAssignment_19941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MAKE__NameAssignment_19972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__MAKE__ValueAssignment_310003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VARIABLE_REF__ToVarAssignment10038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__VALUE__ValAssignment10073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CONTENT__VarAssignment_110108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SUM__TargetVariableAssignment_110147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__SUM__ValOneAssignment_310182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__SUM__ValTwoAssignment_510213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SUBTRACT__TargetVariableAssignment_110248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__SUBTRACT__ValOneAssignment_310283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__SUBTRACT__ValTwoAssignment_510314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MULTIPLY__TargetVariableAssignment_110349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__MULTIPLY__ValOneAssignment_310384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__MULTIPLY__ValTwoAssignment_510415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DIVIDE__TargetVariableAssignment_110450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__DIVIDE__ValOneAssignment_310485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__DIVIDE__ValTwoAssignment_510516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__REPEAT__TimesAssignment_110547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSENTENCE_in_rule__REPEAT__CommandsAssignment_210578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TO__NameAssignment_110609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePARAM_in_rule__TO__ParametersAssignment_210640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSENTENCE_in_rule__TO__CommandsAssignment_310671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PARAM__NameAssignment_110702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PROCEDURE_CALL__ToAssignment_010737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__PROCEDURE_CALL__ParamsAssignment_110772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_EXPRESSION_in_rule__IF_SENTENCE__ConditionAssignment_110803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSENTENCE_in_rule__IF_SENTENCE__CommandsAssignment_210834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__EQUALS__Op1Assignment_010865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__EQUALS__Op2Assignment_210896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__GREATER_THAN__Op1Assignment_010927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__GREATER_THAN__Op2Assignment_210958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__LESSER_THAN__Op1Assignment_010989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__LESSER_THAN__Op2Assignment_211020 = new BitSet(new long[]{0x0000000000000002L});

}