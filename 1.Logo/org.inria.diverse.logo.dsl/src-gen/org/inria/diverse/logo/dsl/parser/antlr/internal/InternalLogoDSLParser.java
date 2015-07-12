package org.inria.diverse.logo.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.inria.diverse.logo.dsl.services.LogoDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLogoDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FORWARD'", "'LEFT'", "'RIGHT'", "'SETX'", "'SETY'", "'PENDOWN'", "'PENUP'", "'PENCOLOR'", "'CANVASCOLOR'", "'BLACK'", "'BLUE'", "'CYAN'", "'DARK GRAY'", "'GRAY'", "'GREEN'", "'LIGHTGRAY'", "'MAGENTA'", "'ORANGE'", "'PINK'", "'RED'", "'WHITE'", "'YELLOW'", "'FONTSTYLE'", "'BOLD'", "'ITALIC'", "'PLAIN'", "'CLEAR'", "'HOME'", "'DRAWSTRING'", "'MAKE'", "'='", "'CONTENT'", "'SUM'", "'+'", "'SUBTRACT'", "'-'", "'MULTIPLY'", "'*'", "'DIVIDE'", "'/'", "'REPEAT'", "'END REPEAT'", "'TO'", "'END TO'", "':'", "'IF'", "'END IF'", "'>'", "'<'"
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
    public String getGrammarFileName() { return "../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g"; }



     	private LogoDSLGrammarAccess grammarAccess;
     	
        public InternalLogoDSLParser(TokenStream input, LogoDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LogoProgram";	
       	}
       	
       	@Override
       	protected LogoDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLogoProgram"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:67:1: entryRuleLogoProgram returns [EObject current=null] : iv_ruleLogoProgram= ruleLogoProgram EOF ;
    public final EObject entryRuleLogoProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogoProgram = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:68:2: (iv_ruleLogoProgram= ruleLogoProgram EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:69:2: iv_ruleLogoProgram= ruleLogoProgram EOF
            {
             newCompositeNode(grammarAccess.getLogoProgramRule()); 
            pushFollow(FOLLOW_ruleLogoProgram_in_entryRuleLogoProgram75);
            iv_ruleLogoProgram=ruleLogoProgram();

            state._fsp--;

             current =iv_ruleLogoProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogoProgram85); 

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
    // $ANTLR end "entryRuleLogoProgram"


    // $ANTLR start "ruleLogoProgram"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:76:1: ruleLogoProgram returns [EObject current=null] : ( (lv_sentences_0_0= ruleSENTENCE ) )* ;
    public final EObject ruleLogoProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_sentences_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:79:28: ( ( (lv_sentences_0_0= ruleSENTENCE ) )* )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:80:1: ( (lv_sentences_0_0= ruleSENTENCE ) )*
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:80:1: ( (lv_sentences_0_0= ruleSENTENCE ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=12 && LA1_0<=20)||LA1_0==34||(LA1_0>=38 && LA1_0<=41)||(LA1_0>=43 && LA1_0<=44)||LA1_0==46||LA1_0==48||LA1_0==50||LA1_0==52||LA1_0==54||LA1_0==57) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:81:1: (lv_sentences_0_0= ruleSENTENCE )
            	    {
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:81:1: (lv_sentences_0_0= ruleSENTENCE )
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:82:3: lv_sentences_0_0= ruleSENTENCE
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogoProgramAccess().getSentencesSENTENCEParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSENTENCE_in_ruleLogoProgram130);
            	    lv_sentences_0_0=ruleSENTENCE();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogoProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentences",
            	            		lv_sentences_0_0, 
            	            		"SENTENCE");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleLogoProgram"


    // $ANTLR start "entryRuleSENTENCE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:106:1: entryRuleSENTENCE returns [EObject current=null] : iv_ruleSENTENCE= ruleSENTENCE EOF ;
    public final EObject entryRuleSENTENCE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSENTENCE = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:107:2: (iv_ruleSENTENCE= ruleSENTENCE EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:108:2: iv_ruleSENTENCE= ruleSENTENCE EOF
            {
             newCompositeNode(grammarAccess.getSENTENCERule()); 
            pushFollow(FOLLOW_ruleSENTENCE_in_entryRuleSENTENCE166);
            iv_ruleSENTENCE=ruleSENTENCE();

            state._fsp--;

             current =iv_ruleSENTENCE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSENTENCE176); 

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
    // $ANTLR end "entryRuleSENTENCE"


    // $ANTLR start "ruleSENTENCE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:115:1: ruleSENTENCE returns [EObject current=null] : (this_MAKE_0= ruleMAKE | this_CONTENT_1= ruleCONTENT | this_PROCEDURE_CALL_2= rulePROCEDURE_CALL | this_OPERATION_3= ruleOPERATION | this_CONTROL_SENTENCES_4= ruleCONTROL_SENTENCES | this_MOVE_5= ruleMOVE | this_DRAWING_SENTENCE_6= ruleDRAWING_SENTENCE ) ;
    public final EObject ruleSENTENCE() throws RecognitionException {
        EObject current = null;

        EObject this_MAKE_0 = null;

        EObject this_CONTENT_1 = null;

        EObject this_PROCEDURE_CALL_2 = null;

        EObject this_OPERATION_3 = null;

        EObject this_CONTROL_SENTENCES_4 = null;

        EObject this_MOVE_5 = null;

        EObject this_DRAWING_SENTENCE_6 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:118:28: ( (this_MAKE_0= ruleMAKE | this_CONTENT_1= ruleCONTENT | this_PROCEDURE_CALL_2= rulePROCEDURE_CALL | this_OPERATION_3= ruleOPERATION | this_CONTROL_SENTENCES_4= ruleCONTROL_SENTENCES | this_MOVE_5= ruleMOVE | this_DRAWING_SENTENCE_6= ruleDRAWING_SENTENCE ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:119:1: (this_MAKE_0= ruleMAKE | this_CONTENT_1= ruleCONTENT | this_PROCEDURE_CALL_2= rulePROCEDURE_CALL | this_OPERATION_3= ruleOPERATION | this_CONTROL_SENTENCES_4= ruleCONTROL_SENTENCES | this_MOVE_5= ruleMOVE | this_DRAWING_SENTENCE_6= ruleDRAWING_SENTENCE )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:119:1: (this_MAKE_0= ruleMAKE | this_CONTENT_1= ruleCONTENT | this_PROCEDURE_CALL_2= rulePROCEDURE_CALL | this_OPERATION_3= ruleOPERATION | this_CONTROL_SENTENCES_4= ruleCONTROL_SENTENCES | this_MOVE_5= ruleMOVE | this_DRAWING_SENTENCE_6= ruleDRAWING_SENTENCE )
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
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
            case 18:
            case 19:
            case 20:
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
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:120:5: this_MAKE_0= ruleMAKE
                    {
                     
                            newCompositeNode(grammarAccess.getSENTENCEAccess().getMAKEParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMAKE_in_ruleSENTENCE223);
                    this_MAKE_0=ruleMAKE();

                    state._fsp--;

                     
                            current = this_MAKE_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:130:5: this_CONTENT_1= ruleCONTENT
                    {
                     
                            newCompositeNode(grammarAccess.getSENTENCEAccess().getCONTENTParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCONTENT_in_ruleSENTENCE250);
                    this_CONTENT_1=ruleCONTENT();

                    state._fsp--;

                     
                            current = this_CONTENT_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:140:5: this_PROCEDURE_CALL_2= rulePROCEDURE_CALL
                    {
                     
                            newCompositeNode(grammarAccess.getSENTENCEAccess().getPROCEDURE_CALLParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePROCEDURE_CALL_in_ruleSENTENCE277);
                    this_PROCEDURE_CALL_2=rulePROCEDURE_CALL();

                    state._fsp--;

                     
                            current = this_PROCEDURE_CALL_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:150:5: this_OPERATION_3= ruleOPERATION
                    {
                     
                            newCompositeNode(grammarAccess.getSENTENCEAccess().getOPERATIONParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleOPERATION_in_ruleSENTENCE304);
                    this_OPERATION_3=ruleOPERATION();

                    state._fsp--;

                     
                            current = this_OPERATION_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:160:5: this_CONTROL_SENTENCES_4= ruleCONTROL_SENTENCES
                    {
                     
                            newCompositeNode(grammarAccess.getSENTENCEAccess().getCONTROL_SENTENCESParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCONTROL_SENTENCES_in_ruleSENTENCE331);
                    this_CONTROL_SENTENCES_4=ruleCONTROL_SENTENCES();

                    state._fsp--;

                     
                            current = this_CONTROL_SENTENCES_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:170:5: this_MOVE_5= ruleMOVE
                    {
                     
                            newCompositeNode(grammarAccess.getSENTENCEAccess().getMOVEParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleMOVE_in_ruleSENTENCE358);
                    this_MOVE_5=ruleMOVE();

                    state._fsp--;

                     
                            current = this_MOVE_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:180:5: this_DRAWING_SENTENCE_6= ruleDRAWING_SENTENCE
                    {
                     
                            newCompositeNode(grammarAccess.getSENTENCEAccess().getDRAWING_SENTENCEParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleDRAWING_SENTENCE_in_ruleSENTENCE385);
                    this_DRAWING_SENTENCE_6=ruleDRAWING_SENTENCE();

                    state._fsp--;

                     
                            current = this_DRAWING_SENTENCE_6; 
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
    // $ANTLR end "ruleSENTENCE"


    // $ANTLR start "entryRuleMOVE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:196:1: entryRuleMOVE returns [EObject current=null] : iv_ruleMOVE= ruleMOVE EOF ;
    public final EObject entryRuleMOVE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOVE = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:197:2: (iv_ruleMOVE= ruleMOVE EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:198:2: iv_ruleMOVE= ruleMOVE EOF
            {
             newCompositeNode(grammarAccess.getMOVERule()); 
            pushFollow(FOLLOW_ruleMOVE_in_entryRuleMOVE420);
            iv_ruleMOVE=ruleMOVE();

            state._fsp--;

             current =iv_ruleMOVE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMOVE430); 

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
    // $ANTLR end "entryRuleMOVE"


    // $ANTLR start "ruleMOVE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:205:1: ruleMOVE returns [EObject current=null] : (this_FORWARD_0= ruleFORWARD | this_LEFT_1= ruleLEFT | this_RIGHT_2= ruleRIGHT | this_SET_X_3= ruleSET_X | this_SET_Y_4= ruleSET_Y ) ;
    public final EObject ruleMOVE() throws RecognitionException {
        EObject current = null;

        EObject this_FORWARD_0 = null;

        EObject this_LEFT_1 = null;

        EObject this_RIGHT_2 = null;

        EObject this_SET_X_3 = null;

        EObject this_SET_Y_4 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:208:28: ( (this_FORWARD_0= ruleFORWARD | this_LEFT_1= ruleLEFT | this_RIGHT_2= ruleRIGHT | this_SET_X_3= ruleSET_X | this_SET_Y_4= ruleSET_Y ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:209:1: (this_FORWARD_0= ruleFORWARD | this_LEFT_1= ruleLEFT | this_RIGHT_2= ruleRIGHT | this_SET_X_3= ruleSET_X | this_SET_Y_4= ruleSET_Y )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:209:1: (this_FORWARD_0= ruleFORWARD | this_LEFT_1= ruleLEFT | this_RIGHT_2= ruleRIGHT | this_SET_X_3= ruleSET_X | this_SET_Y_4= ruleSET_Y )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
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
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:210:5: this_FORWARD_0= ruleFORWARD
                    {
                     
                            newCompositeNode(grammarAccess.getMOVEAccess().getFORWARDParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFORWARD_in_ruleMOVE477);
                    this_FORWARD_0=ruleFORWARD();

                    state._fsp--;

                     
                            current = this_FORWARD_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:220:5: this_LEFT_1= ruleLEFT
                    {
                     
                            newCompositeNode(grammarAccess.getMOVEAccess().getLEFTParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLEFT_in_ruleMOVE504);
                    this_LEFT_1=ruleLEFT();

                    state._fsp--;

                     
                            current = this_LEFT_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:230:5: this_RIGHT_2= ruleRIGHT
                    {
                     
                            newCompositeNode(grammarAccess.getMOVEAccess().getRIGHTParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRIGHT_in_ruleMOVE531);
                    this_RIGHT_2=ruleRIGHT();

                    state._fsp--;

                     
                            current = this_RIGHT_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:240:5: this_SET_X_3= ruleSET_X
                    {
                     
                            newCompositeNode(grammarAccess.getMOVEAccess().getSET_XParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSET_X_in_ruleMOVE558);
                    this_SET_X_3=ruleSET_X();

                    state._fsp--;

                     
                            current = this_SET_X_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:250:5: this_SET_Y_4= ruleSET_Y
                    {
                     
                            newCompositeNode(grammarAccess.getMOVEAccess().getSET_YParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSET_Y_in_ruleMOVE585);
                    this_SET_Y_4=ruleSET_Y();

                    state._fsp--;

                     
                            current = this_SET_Y_4; 
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
    // $ANTLR end "ruleMOVE"


    // $ANTLR start "entryRuleFORWARD"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:266:1: entryRuleFORWARD returns [EObject current=null] : iv_ruleFORWARD= ruleFORWARD EOF ;
    public final EObject entryRuleFORWARD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFORWARD = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:267:2: (iv_ruleFORWARD= ruleFORWARD EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:268:2: iv_ruleFORWARD= ruleFORWARD EOF
            {
             newCompositeNode(grammarAccess.getFORWARDRule()); 
            pushFollow(FOLLOW_ruleFORWARD_in_entryRuleFORWARD620);
            iv_ruleFORWARD=ruleFORWARD();

            state._fsp--;

             current =iv_ruleFORWARD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFORWARD630); 

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
    // $ANTLR end "entryRuleFORWARD"


    // $ANTLR start "ruleFORWARD"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:275:1: ruleFORWARD returns [EObject current=null] : (otherlv_0= 'FORWARD' ( (lv_amount_1_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleFORWARD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_amount_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:278:28: ( (otherlv_0= 'FORWARD' ( (lv_amount_1_0= ruleEXPRESSION ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:279:1: (otherlv_0= 'FORWARD' ( (lv_amount_1_0= ruleEXPRESSION ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:279:1: (otherlv_0= 'FORWARD' ( (lv_amount_1_0= ruleEXPRESSION ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:279:3: otherlv_0= 'FORWARD' ( (lv_amount_1_0= ruleEXPRESSION ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleFORWARD667); 

                	newLeafNode(otherlv_0, grammarAccess.getFORWARDAccess().getFORWARDKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:283:1: ( (lv_amount_1_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:284:1: (lv_amount_1_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:284:1: (lv_amount_1_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:285:3: lv_amount_1_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getFORWARDAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleFORWARD688);
            lv_amount_1_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFORWARDRule());
            	        }
                   		set(
                   			current, 
                   			"amount",
                    		lv_amount_1_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleFORWARD"


    // $ANTLR start "entryRuleLEFT"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:309:1: entryRuleLEFT returns [EObject current=null] : iv_ruleLEFT= ruleLEFT EOF ;
    public final EObject entryRuleLEFT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLEFT = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:310:2: (iv_ruleLEFT= ruleLEFT EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:311:2: iv_ruleLEFT= ruleLEFT EOF
            {
             newCompositeNode(grammarAccess.getLEFTRule()); 
            pushFollow(FOLLOW_ruleLEFT_in_entryRuleLEFT724);
            iv_ruleLEFT=ruleLEFT();

            state._fsp--;

             current =iv_ruleLEFT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLEFT734); 

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
    // $ANTLR end "entryRuleLEFT"


    // $ANTLR start "ruleLEFT"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:318:1: ruleLEFT returns [EObject current=null] : (otherlv_0= 'LEFT' ( (lv_amount_1_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleLEFT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_amount_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:321:28: ( (otherlv_0= 'LEFT' ( (lv_amount_1_0= ruleEXPRESSION ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:322:1: (otherlv_0= 'LEFT' ( (lv_amount_1_0= ruleEXPRESSION ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:322:1: (otherlv_0= 'LEFT' ( (lv_amount_1_0= ruleEXPRESSION ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:322:3: otherlv_0= 'LEFT' ( (lv_amount_1_0= ruleEXPRESSION ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleLEFT771); 

                	newLeafNode(otherlv_0, grammarAccess.getLEFTAccess().getLEFTKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:326:1: ( (lv_amount_1_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:327:1: (lv_amount_1_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:327:1: (lv_amount_1_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:328:3: lv_amount_1_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getLEFTAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleLEFT792);
            lv_amount_1_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLEFTRule());
            	        }
                   		set(
                   			current, 
                   			"amount",
                    		lv_amount_1_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleLEFT"


    // $ANTLR start "entryRuleRIGHT"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:352:1: entryRuleRIGHT returns [EObject current=null] : iv_ruleRIGHT= ruleRIGHT EOF ;
    public final EObject entryRuleRIGHT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRIGHT = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:353:2: (iv_ruleRIGHT= ruleRIGHT EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:354:2: iv_ruleRIGHT= ruleRIGHT EOF
            {
             newCompositeNode(grammarAccess.getRIGHTRule()); 
            pushFollow(FOLLOW_ruleRIGHT_in_entryRuleRIGHT828);
            iv_ruleRIGHT=ruleRIGHT();

            state._fsp--;

             current =iv_ruleRIGHT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRIGHT838); 

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
    // $ANTLR end "entryRuleRIGHT"


    // $ANTLR start "ruleRIGHT"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:361:1: ruleRIGHT returns [EObject current=null] : (otherlv_0= 'RIGHT' ( (lv_amount_1_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleRIGHT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_amount_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:364:28: ( (otherlv_0= 'RIGHT' ( (lv_amount_1_0= ruleEXPRESSION ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:365:1: (otherlv_0= 'RIGHT' ( (lv_amount_1_0= ruleEXPRESSION ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:365:1: (otherlv_0= 'RIGHT' ( (lv_amount_1_0= ruleEXPRESSION ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:365:3: otherlv_0= 'RIGHT' ( (lv_amount_1_0= ruleEXPRESSION ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleRIGHT875); 

                	newLeafNode(otherlv_0, grammarAccess.getRIGHTAccess().getRIGHTKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:369:1: ( (lv_amount_1_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:370:1: (lv_amount_1_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:370:1: (lv_amount_1_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:371:3: lv_amount_1_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getRIGHTAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleRIGHT896);
            lv_amount_1_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRIGHTRule());
            	        }
                   		set(
                   			current, 
                   			"amount",
                    		lv_amount_1_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleRIGHT"


    // $ANTLR start "entryRuleSET_X"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:395:1: entryRuleSET_X returns [EObject current=null] : iv_ruleSET_X= ruleSET_X EOF ;
    public final EObject entryRuleSET_X() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSET_X = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:396:2: (iv_ruleSET_X= ruleSET_X EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:397:2: iv_ruleSET_X= ruleSET_X EOF
            {
             newCompositeNode(grammarAccess.getSET_XRule()); 
            pushFollow(FOLLOW_ruleSET_X_in_entryRuleSET_X932);
            iv_ruleSET_X=ruleSET_X();

            state._fsp--;

             current =iv_ruleSET_X; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSET_X942); 

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
    // $ANTLR end "entryRuleSET_X"


    // $ANTLR start "ruleSET_X"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:404:1: ruleSET_X returns [EObject current=null] : (otherlv_0= 'SETX' ( (lv_amount_1_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleSET_X() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_amount_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:407:28: ( (otherlv_0= 'SETX' ( (lv_amount_1_0= ruleEXPRESSION ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:408:1: (otherlv_0= 'SETX' ( (lv_amount_1_0= ruleEXPRESSION ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:408:1: (otherlv_0= 'SETX' ( (lv_amount_1_0= ruleEXPRESSION ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:408:3: otherlv_0= 'SETX' ( (lv_amount_1_0= ruleEXPRESSION ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSET_X979); 

                	newLeafNode(otherlv_0, grammarAccess.getSET_XAccess().getSETXKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:412:1: ( (lv_amount_1_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:413:1: (lv_amount_1_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:413:1: (lv_amount_1_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:414:3: lv_amount_1_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getSET_XAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleSET_X1000);
            lv_amount_1_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSET_XRule());
            	        }
                   		set(
                   			current, 
                   			"amount",
                    		lv_amount_1_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleSET_X"


    // $ANTLR start "entryRuleSET_Y"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:438:1: entryRuleSET_Y returns [EObject current=null] : iv_ruleSET_Y= ruleSET_Y EOF ;
    public final EObject entryRuleSET_Y() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSET_Y = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:439:2: (iv_ruleSET_Y= ruleSET_Y EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:440:2: iv_ruleSET_Y= ruleSET_Y EOF
            {
             newCompositeNode(grammarAccess.getSET_YRule()); 
            pushFollow(FOLLOW_ruleSET_Y_in_entryRuleSET_Y1036);
            iv_ruleSET_Y=ruleSET_Y();

            state._fsp--;

             current =iv_ruleSET_Y; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSET_Y1046); 

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
    // $ANTLR end "entryRuleSET_Y"


    // $ANTLR start "ruleSET_Y"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:447:1: ruleSET_Y returns [EObject current=null] : (otherlv_0= 'SETY' ( (lv_amount_1_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleSET_Y() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_amount_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:450:28: ( (otherlv_0= 'SETY' ( (lv_amount_1_0= ruleEXPRESSION ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:451:1: (otherlv_0= 'SETY' ( (lv_amount_1_0= ruleEXPRESSION ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:451:1: (otherlv_0= 'SETY' ( (lv_amount_1_0= ruleEXPRESSION ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:451:3: otherlv_0= 'SETY' ( (lv_amount_1_0= ruleEXPRESSION ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSET_Y1083); 

                	newLeafNode(otherlv_0, grammarAccess.getSET_YAccess().getSETYKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:455:1: ( (lv_amount_1_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:456:1: (lv_amount_1_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:456:1: (lv_amount_1_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:457:3: lv_amount_1_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getSET_YAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleSET_Y1104);
            lv_amount_1_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSET_YRule());
            	        }
                   		set(
                   			current, 
                   			"amount",
                    		lv_amount_1_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleSET_Y"


    // $ANTLR start "entryRuleDRAWING_SENTENCE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:481:1: entryRuleDRAWING_SENTENCE returns [EObject current=null] : iv_ruleDRAWING_SENTENCE= ruleDRAWING_SENTENCE EOF ;
    public final EObject entryRuleDRAWING_SENTENCE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRAWING_SENTENCE = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:482:2: (iv_ruleDRAWING_SENTENCE= ruleDRAWING_SENTENCE EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:483:2: iv_ruleDRAWING_SENTENCE= ruleDRAWING_SENTENCE EOF
            {
             newCompositeNode(grammarAccess.getDRAWING_SENTENCERule()); 
            pushFollow(FOLLOW_ruleDRAWING_SENTENCE_in_entryRuleDRAWING_SENTENCE1140);
            iv_ruleDRAWING_SENTENCE=ruleDRAWING_SENTENCE();

            state._fsp--;

             current =iv_ruleDRAWING_SENTENCE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDRAWING_SENTENCE1150); 

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
    // $ANTLR end "entryRuleDRAWING_SENTENCE"


    // $ANTLR start "ruleDRAWING_SENTENCE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:490:1: ruleDRAWING_SENTENCE returns [EObject current=null] : (this_PENDOWN_0= rulePENDOWN | this_PENUP_1= rulePENUP | this_CLEAR_2= ruleCLEAR | this_HOME_3= ruleHOME | this_COLOREABLE_4= ruleCOLOREABLE | this_FONT_SPEC_5= ruleFONT_SPEC | this_DRAW_STRING_6= ruleDRAW_STRING ) ;
    public final EObject ruleDRAWING_SENTENCE() throws RecognitionException {
        EObject current = null;

        EObject this_PENDOWN_0 = null;

        EObject this_PENUP_1 = null;

        EObject this_CLEAR_2 = null;

        EObject this_HOME_3 = null;

        EObject this_COLOREABLE_4 = null;

        EObject this_FONT_SPEC_5 = null;

        EObject this_DRAW_STRING_6 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:493:28: ( (this_PENDOWN_0= rulePENDOWN | this_PENUP_1= rulePENUP | this_CLEAR_2= ruleCLEAR | this_HOME_3= ruleHOME | this_COLOREABLE_4= ruleCOLOREABLE | this_FONT_SPEC_5= ruleFONT_SPEC | this_DRAW_STRING_6= ruleDRAW_STRING ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:494:1: (this_PENDOWN_0= rulePENDOWN | this_PENUP_1= rulePENUP | this_CLEAR_2= ruleCLEAR | this_HOME_3= ruleHOME | this_COLOREABLE_4= ruleCOLOREABLE | this_FONT_SPEC_5= ruleFONT_SPEC | this_DRAW_STRING_6= ruleDRAW_STRING )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:494:1: (this_PENDOWN_0= rulePENDOWN | this_PENUP_1= rulePENUP | this_CLEAR_2= ruleCLEAR | this_HOME_3= ruleHOME | this_COLOREABLE_4= ruleCOLOREABLE | this_FONT_SPEC_5= ruleFONT_SPEC | this_DRAW_STRING_6= ruleDRAW_STRING )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
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
            case 19:
            case 20:
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
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:495:5: this_PENDOWN_0= rulePENDOWN
                    {
                     
                            newCompositeNode(grammarAccess.getDRAWING_SENTENCEAccess().getPENDOWNParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePENDOWN_in_ruleDRAWING_SENTENCE1197);
                    this_PENDOWN_0=rulePENDOWN();

                    state._fsp--;

                     
                            current = this_PENDOWN_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:505:5: this_PENUP_1= rulePENUP
                    {
                     
                            newCompositeNode(grammarAccess.getDRAWING_SENTENCEAccess().getPENUPParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePENUP_in_ruleDRAWING_SENTENCE1224);
                    this_PENUP_1=rulePENUP();

                    state._fsp--;

                     
                            current = this_PENUP_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:515:5: this_CLEAR_2= ruleCLEAR
                    {
                     
                            newCompositeNode(grammarAccess.getDRAWING_SENTENCEAccess().getCLEARParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCLEAR_in_ruleDRAWING_SENTENCE1251);
                    this_CLEAR_2=ruleCLEAR();

                    state._fsp--;

                     
                            current = this_CLEAR_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:525:5: this_HOME_3= ruleHOME
                    {
                     
                            newCompositeNode(grammarAccess.getDRAWING_SENTENCEAccess().getHOMEParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleHOME_in_ruleDRAWING_SENTENCE1278);
                    this_HOME_3=ruleHOME();

                    state._fsp--;

                     
                            current = this_HOME_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:535:5: this_COLOREABLE_4= ruleCOLOREABLE
                    {
                     
                            newCompositeNode(grammarAccess.getDRAWING_SENTENCEAccess().getCOLOREABLEParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCOLOREABLE_in_ruleDRAWING_SENTENCE1305);
                    this_COLOREABLE_4=ruleCOLOREABLE();

                    state._fsp--;

                     
                            current = this_COLOREABLE_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:545:5: this_FONT_SPEC_5= ruleFONT_SPEC
                    {
                     
                            newCompositeNode(grammarAccess.getDRAWING_SENTENCEAccess().getFONT_SPECParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleFONT_SPEC_in_ruleDRAWING_SENTENCE1332);
                    this_FONT_SPEC_5=ruleFONT_SPEC();

                    state._fsp--;

                     
                            current = this_FONT_SPEC_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:555:5: this_DRAW_STRING_6= ruleDRAW_STRING
                    {
                     
                            newCompositeNode(grammarAccess.getDRAWING_SENTENCEAccess().getDRAW_STRINGParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleDRAW_STRING_in_ruleDRAWING_SENTENCE1359);
                    this_DRAW_STRING_6=ruleDRAW_STRING();

                    state._fsp--;

                     
                            current = this_DRAW_STRING_6; 
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
    // $ANTLR end "ruleDRAWING_SENTENCE"


    // $ANTLR start "entryRulePENDOWN"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:571:1: entryRulePENDOWN returns [EObject current=null] : iv_rulePENDOWN= rulePENDOWN EOF ;
    public final EObject entryRulePENDOWN() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePENDOWN = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:572:2: (iv_rulePENDOWN= rulePENDOWN EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:573:2: iv_rulePENDOWN= rulePENDOWN EOF
            {
             newCompositeNode(grammarAccess.getPENDOWNRule()); 
            pushFollow(FOLLOW_rulePENDOWN_in_entryRulePENDOWN1394);
            iv_rulePENDOWN=rulePENDOWN();

            state._fsp--;

             current =iv_rulePENDOWN; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePENDOWN1404); 

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
    // $ANTLR end "entryRulePENDOWN"


    // $ANTLR start "rulePENDOWN"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:580:1: rulePENDOWN returns [EObject current=null] : ( () otherlv_1= 'PENDOWN' ) ;
    public final EObject rulePENDOWN() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:583:28: ( ( () otherlv_1= 'PENDOWN' ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:584:1: ( () otherlv_1= 'PENDOWN' )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:584:1: ( () otherlv_1= 'PENDOWN' )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:584:2: () otherlv_1= 'PENDOWN'
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:584:2: ()
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:585:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPENDOWNAccess().getPENDOWNAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_rulePENDOWN1450); 

                	newLeafNode(otherlv_1, grammarAccess.getPENDOWNAccess().getPENDOWNKeyword_1());
                

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
    // $ANTLR end "rulePENDOWN"


    // $ANTLR start "entryRulePENUP"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:602:1: entryRulePENUP returns [EObject current=null] : iv_rulePENUP= rulePENUP EOF ;
    public final EObject entryRulePENUP() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePENUP = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:603:2: (iv_rulePENUP= rulePENUP EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:604:2: iv_rulePENUP= rulePENUP EOF
            {
             newCompositeNode(grammarAccess.getPENUPRule()); 
            pushFollow(FOLLOW_rulePENUP_in_entryRulePENUP1486);
            iv_rulePENUP=rulePENUP();

            state._fsp--;

             current =iv_rulePENUP; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePENUP1496); 

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
    // $ANTLR end "entryRulePENUP"


    // $ANTLR start "rulePENUP"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:611:1: rulePENUP returns [EObject current=null] : ( () otherlv_1= 'PENUP' ) ;
    public final EObject rulePENUP() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:614:28: ( ( () otherlv_1= 'PENUP' ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:615:1: ( () otherlv_1= 'PENUP' )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:615:1: ( () otherlv_1= 'PENUP' )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:615:2: () otherlv_1= 'PENUP'
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:615:2: ()
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:616:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPENUPAccess().getPENUPAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePENUP1542); 

                	newLeafNode(otherlv_1, grammarAccess.getPENUPAccess().getPENUPKeyword_1());
                

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
    // $ANTLR end "rulePENUP"


    // $ANTLR start "entryRuleCOLOREABLE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:633:1: entryRuleCOLOREABLE returns [EObject current=null] : iv_ruleCOLOREABLE= ruleCOLOREABLE EOF ;
    public final EObject entryRuleCOLOREABLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOLOREABLE = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:634:2: (iv_ruleCOLOREABLE= ruleCOLOREABLE EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:635:2: iv_ruleCOLOREABLE= ruleCOLOREABLE EOF
            {
             newCompositeNode(grammarAccess.getCOLOREABLERule()); 
            pushFollow(FOLLOW_ruleCOLOREABLE_in_entryRuleCOLOREABLE1578);
            iv_ruleCOLOREABLE=ruleCOLOREABLE();

            state._fsp--;

             current =iv_ruleCOLOREABLE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOLOREABLE1588); 

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
    // $ANTLR end "entryRuleCOLOREABLE"


    // $ANTLR start "ruleCOLOREABLE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:642:1: ruleCOLOREABLE returns [EObject current=null] : (this_PENCOLOR_0= rulePENCOLOR | this_CANVAS_COLOR_1= ruleCANVAS_COLOR ) ;
    public final EObject ruleCOLOREABLE() throws RecognitionException {
        EObject current = null;

        EObject this_PENCOLOR_0 = null;

        EObject this_CANVAS_COLOR_1 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:645:28: ( (this_PENCOLOR_0= rulePENCOLOR | this_CANVAS_COLOR_1= ruleCANVAS_COLOR ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:646:1: (this_PENCOLOR_0= rulePENCOLOR | this_CANVAS_COLOR_1= ruleCANVAS_COLOR )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:646:1: (this_PENCOLOR_0= rulePENCOLOR | this_CANVAS_COLOR_1= ruleCANVAS_COLOR )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:647:5: this_PENCOLOR_0= rulePENCOLOR
                    {
                     
                            newCompositeNode(grammarAccess.getCOLOREABLEAccess().getPENCOLORParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePENCOLOR_in_ruleCOLOREABLE1635);
                    this_PENCOLOR_0=rulePENCOLOR();

                    state._fsp--;

                     
                            current = this_PENCOLOR_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:657:5: this_CANVAS_COLOR_1= ruleCANVAS_COLOR
                    {
                     
                            newCompositeNode(grammarAccess.getCOLOREABLEAccess().getCANVAS_COLORParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCANVAS_COLOR_in_ruleCOLOREABLE1662);
                    this_CANVAS_COLOR_1=ruleCANVAS_COLOR();

                    state._fsp--;

                     
                            current = this_CANVAS_COLOR_1; 
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
    // $ANTLR end "ruleCOLOREABLE"


    // $ANTLR start "entryRulePENCOLOR"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:673:1: entryRulePENCOLOR returns [EObject current=null] : iv_rulePENCOLOR= rulePENCOLOR EOF ;
    public final EObject entryRulePENCOLOR() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePENCOLOR = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:674:2: (iv_rulePENCOLOR= rulePENCOLOR EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:675:2: iv_rulePENCOLOR= rulePENCOLOR EOF
            {
             newCompositeNode(grammarAccess.getPENCOLORRule()); 
            pushFollow(FOLLOW_rulePENCOLOR_in_entryRulePENCOLOR1697);
            iv_rulePENCOLOR=rulePENCOLOR();

            state._fsp--;

             current =iv_rulePENCOLOR; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePENCOLOR1707); 

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
    // $ANTLR end "entryRulePENCOLOR"


    // $ANTLR start "rulePENCOLOR"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:682:1: rulePENCOLOR returns [EObject current=null] : (otherlv_0= 'PENCOLOR' ( ( (lv_color_1_0= ruleCOLOR ) ) | ( (lv_colorSpec_2_0= ruleCOLOR_SPEC ) ) ) ) ;
    public final EObject rulePENCOLOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_color_1_0 = null;

        EObject lv_colorSpec_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:685:28: ( (otherlv_0= 'PENCOLOR' ( ( (lv_color_1_0= ruleCOLOR ) ) | ( (lv_colorSpec_2_0= ruleCOLOR_SPEC ) ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:686:1: (otherlv_0= 'PENCOLOR' ( ( (lv_color_1_0= ruleCOLOR ) ) | ( (lv_colorSpec_2_0= ruleCOLOR_SPEC ) ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:686:1: (otherlv_0= 'PENCOLOR' ( ( (lv_color_1_0= ruleCOLOR ) ) | ( (lv_colorSpec_2_0= ruleCOLOR_SPEC ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:686:3: otherlv_0= 'PENCOLOR' ( ( (lv_color_1_0= ruleCOLOR ) ) | ( (lv_colorSpec_2_0= ruleCOLOR_SPEC ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulePENCOLOR1744); 

                	newLeafNode(otherlv_0, grammarAccess.getPENCOLORAccess().getPENCOLORKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:690:1: ( ( (lv_color_1_0= ruleCOLOR ) ) | ( (lv_colorSpec_2_0= ruleCOLOR_SPEC ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=21 && LA6_0<=33)) ) {
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
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:690:2: ( (lv_color_1_0= ruleCOLOR ) )
                    {
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:690:2: ( (lv_color_1_0= ruleCOLOR ) )
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:691:1: (lv_color_1_0= ruleCOLOR )
                    {
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:691:1: (lv_color_1_0= ruleCOLOR )
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:692:3: lv_color_1_0= ruleCOLOR
                    {
                     
                    	        newCompositeNode(grammarAccess.getPENCOLORAccess().getColorCOLORParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCOLOR_in_rulePENCOLOR1766);
                    lv_color_1_0=ruleCOLOR();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPENCOLORRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_1_0, 
                            		"COLOR");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:709:6: ( (lv_colorSpec_2_0= ruleCOLOR_SPEC ) )
                    {
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:709:6: ( (lv_colorSpec_2_0= ruleCOLOR_SPEC ) )
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:710:1: (lv_colorSpec_2_0= ruleCOLOR_SPEC )
                    {
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:710:1: (lv_colorSpec_2_0= ruleCOLOR_SPEC )
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:711:3: lv_colorSpec_2_0= ruleCOLOR_SPEC
                    {
                     
                    	        newCompositeNode(grammarAccess.getPENCOLORAccess().getColorSpecCOLOR_SPECParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCOLOR_SPEC_in_rulePENCOLOR1793);
                    lv_colorSpec_2_0=ruleCOLOR_SPEC();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPENCOLORRule());
                    	        }
                           		set(
                           			current, 
                           			"colorSpec",
                            		lv_colorSpec_2_0, 
                            		"COLOR_SPEC");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "rulePENCOLOR"


    // $ANTLR start "entryRuleCANVAS_COLOR"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:735:1: entryRuleCANVAS_COLOR returns [EObject current=null] : iv_ruleCANVAS_COLOR= ruleCANVAS_COLOR EOF ;
    public final EObject entryRuleCANVAS_COLOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCANVAS_COLOR = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:736:2: (iv_ruleCANVAS_COLOR= ruleCANVAS_COLOR EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:737:2: iv_ruleCANVAS_COLOR= ruleCANVAS_COLOR EOF
            {
             newCompositeNode(grammarAccess.getCANVAS_COLORRule()); 
            pushFollow(FOLLOW_ruleCANVAS_COLOR_in_entryRuleCANVAS_COLOR1830);
            iv_ruleCANVAS_COLOR=ruleCANVAS_COLOR();

            state._fsp--;

             current =iv_ruleCANVAS_COLOR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCANVAS_COLOR1840); 

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
    // $ANTLR end "entryRuleCANVAS_COLOR"


    // $ANTLR start "ruleCANVAS_COLOR"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:744:1: ruleCANVAS_COLOR returns [EObject current=null] : (otherlv_0= 'CANVASCOLOR' ( ( (lv_color_1_0= ruleCOLOR ) ) | ( (lv_colorSpec_2_0= ruleCOLOR_SPEC ) ) ) ) ;
    public final EObject ruleCANVAS_COLOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_color_1_0 = null;

        EObject lv_colorSpec_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:747:28: ( (otherlv_0= 'CANVASCOLOR' ( ( (lv_color_1_0= ruleCOLOR ) ) | ( (lv_colorSpec_2_0= ruleCOLOR_SPEC ) ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:748:1: (otherlv_0= 'CANVASCOLOR' ( ( (lv_color_1_0= ruleCOLOR ) ) | ( (lv_colorSpec_2_0= ruleCOLOR_SPEC ) ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:748:1: (otherlv_0= 'CANVASCOLOR' ( ( (lv_color_1_0= ruleCOLOR ) ) | ( (lv_colorSpec_2_0= ruleCOLOR_SPEC ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:748:3: otherlv_0= 'CANVASCOLOR' ( ( (lv_color_1_0= ruleCOLOR ) ) | ( (lv_colorSpec_2_0= ruleCOLOR_SPEC ) ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleCANVAS_COLOR1877); 

                	newLeafNode(otherlv_0, grammarAccess.getCANVAS_COLORAccess().getCANVASCOLORKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:752:1: ( ( (lv_color_1_0= ruleCOLOR ) ) | ( (lv_colorSpec_2_0= ruleCOLOR_SPEC ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=21 && LA7_0<=33)) ) {
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
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:752:2: ( (lv_color_1_0= ruleCOLOR ) )
                    {
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:752:2: ( (lv_color_1_0= ruleCOLOR ) )
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:753:1: (lv_color_1_0= ruleCOLOR )
                    {
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:753:1: (lv_color_1_0= ruleCOLOR )
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:754:3: lv_color_1_0= ruleCOLOR
                    {
                     
                    	        newCompositeNode(grammarAccess.getCANVAS_COLORAccess().getColorCOLORParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCOLOR_in_ruleCANVAS_COLOR1899);
                    lv_color_1_0=ruleCOLOR();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCANVAS_COLORRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_1_0, 
                            		"COLOR");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:771:6: ( (lv_colorSpec_2_0= ruleCOLOR_SPEC ) )
                    {
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:771:6: ( (lv_colorSpec_2_0= ruleCOLOR_SPEC ) )
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:772:1: (lv_colorSpec_2_0= ruleCOLOR_SPEC )
                    {
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:772:1: (lv_colorSpec_2_0= ruleCOLOR_SPEC )
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:773:3: lv_colorSpec_2_0= ruleCOLOR_SPEC
                    {
                     
                    	        newCompositeNode(grammarAccess.getCANVAS_COLORAccess().getColorSpecCOLOR_SPECParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCOLOR_SPEC_in_ruleCANVAS_COLOR1926);
                    lv_colorSpec_2_0=ruleCOLOR_SPEC();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCANVAS_COLORRule());
                    	        }
                           		set(
                           			current, 
                           			"colorSpec",
                            		lv_colorSpec_2_0, 
                            		"COLOR_SPEC");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleCANVAS_COLOR"


    // $ANTLR start "entryRuleCOLOR_SPEC"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:797:1: entryRuleCOLOR_SPEC returns [EObject current=null] : iv_ruleCOLOR_SPEC= ruleCOLOR_SPEC EOF ;
    public final EObject entryRuleCOLOR_SPEC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOLOR_SPEC = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:798:2: (iv_ruleCOLOR_SPEC= ruleCOLOR_SPEC EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:799:2: iv_ruleCOLOR_SPEC= ruleCOLOR_SPEC EOF
            {
             newCompositeNode(grammarAccess.getCOLOR_SPECRule()); 
            pushFollow(FOLLOW_ruleCOLOR_SPEC_in_entryRuleCOLOR_SPEC1963);
            iv_ruleCOLOR_SPEC=ruleCOLOR_SPEC();

            state._fsp--;

             current =iv_ruleCOLOR_SPEC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOLOR_SPEC1973); 

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
    // $ANTLR end "entryRuleCOLOR_SPEC"


    // $ANTLR start "ruleCOLOR_SPEC"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:806:1: ruleCOLOR_SPEC returns [EObject current=null] : ( ( (lv_red_0_0= ruleEXPRESSION ) ) ( (lv_green_1_0= ruleEXPRESSION ) ) ( (lv_blue_2_0= ruleEXPRESSION ) ) ( (lv_alpha_3_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleCOLOR_SPEC() throws RecognitionException {
        EObject current = null;

        EObject lv_red_0_0 = null;

        EObject lv_green_1_0 = null;

        EObject lv_blue_2_0 = null;

        EObject lv_alpha_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:809:28: ( ( ( (lv_red_0_0= ruleEXPRESSION ) ) ( (lv_green_1_0= ruleEXPRESSION ) ) ( (lv_blue_2_0= ruleEXPRESSION ) ) ( (lv_alpha_3_0= ruleEXPRESSION ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:810:1: ( ( (lv_red_0_0= ruleEXPRESSION ) ) ( (lv_green_1_0= ruleEXPRESSION ) ) ( (lv_blue_2_0= ruleEXPRESSION ) ) ( (lv_alpha_3_0= ruleEXPRESSION ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:810:1: ( ( (lv_red_0_0= ruleEXPRESSION ) ) ( (lv_green_1_0= ruleEXPRESSION ) ) ( (lv_blue_2_0= ruleEXPRESSION ) ) ( (lv_alpha_3_0= ruleEXPRESSION ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:810:2: ( (lv_red_0_0= ruleEXPRESSION ) ) ( (lv_green_1_0= ruleEXPRESSION ) ) ( (lv_blue_2_0= ruleEXPRESSION ) ) ( (lv_alpha_3_0= ruleEXPRESSION ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:810:2: ( (lv_red_0_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:811:1: (lv_red_0_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:811:1: (lv_red_0_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:812:3: lv_red_0_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getCOLOR_SPECAccess().getRedEXPRESSIONParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleCOLOR_SPEC2019);
            lv_red_0_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCOLOR_SPECRule());
            	        }
                   		set(
                   			current, 
                   			"red",
                    		lv_red_0_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:828:2: ( (lv_green_1_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:829:1: (lv_green_1_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:829:1: (lv_green_1_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:830:3: lv_green_1_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getCOLOR_SPECAccess().getGreenEXPRESSIONParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleCOLOR_SPEC2040);
            lv_green_1_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCOLOR_SPECRule());
            	        }
                   		set(
                   			current, 
                   			"green",
                    		lv_green_1_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:846:2: ( (lv_blue_2_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:847:1: (lv_blue_2_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:847:1: (lv_blue_2_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:848:3: lv_blue_2_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getCOLOR_SPECAccess().getBlueEXPRESSIONParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleCOLOR_SPEC2061);
            lv_blue_2_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCOLOR_SPECRule());
            	        }
                   		set(
                   			current, 
                   			"blue",
                    		lv_blue_2_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:864:2: ( (lv_alpha_3_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:865:1: (lv_alpha_3_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:865:1: (lv_alpha_3_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:866:3: lv_alpha_3_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getCOLOR_SPECAccess().getAlphaEXPRESSIONParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleCOLOR_SPEC2082);
            lv_alpha_3_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCOLOR_SPECRule());
            	        }
                   		set(
                   			current, 
                   			"alpha",
                    		lv_alpha_3_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleCOLOR_SPEC"


    // $ANTLR start "entryRuleCOLOR"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:890:1: entryRuleCOLOR returns [String current=null] : iv_ruleCOLOR= ruleCOLOR EOF ;
    public final String entryRuleCOLOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOLOR = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:891:2: (iv_ruleCOLOR= ruleCOLOR EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:892:2: iv_ruleCOLOR= ruleCOLOR EOF
            {
             newCompositeNode(grammarAccess.getCOLORRule()); 
            pushFollow(FOLLOW_ruleCOLOR_in_entryRuleCOLOR2119);
            iv_ruleCOLOR=ruleCOLOR();

            state._fsp--;

             current =iv_ruleCOLOR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOLOR2130); 

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
    // $ANTLR end "entryRuleCOLOR"


    // $ANTLR start "ruleCOLOR"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:899:1: ruleCOLOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BLACK' | kw= 'BLUE' | kw= 'CYAN' | kw= 'DARK GRAY' | kw= 'GRAY' | kw= 'GREEN' | kw= 'LIGHTGRAY' | kw= 'MAGENTA' | kw= 'ORANGE' | kw= 'PINK' | kw= 'RED' | kw= 'WHITE' | kw= 'YELLOW' ) ;
    public final AntlrDatatypeRuleToken ruleCOLOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:902:28: ( (kw= 'BLACK' | kw= 'BLUE' | kw= 'CYAN' | kw= 'DARK GRAY' | kw= 'GRAY' | kw= 'GREEN' | kw= 'LIGHTGRAY' | kw= 'MAGENTA' | kw= 'ORANGE' | kw= 'PINK' | kw= 'RED' | kw= 'WHITE' | kw= 'YELLOW' ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:903:1: (kw= 'BLACK' | kw= 'BLUE' | kw= 'CYAN' | kw= 'DARK GRAY' | kw= 'GRAY' | kw= 'GREEN' | kw= 'LIGHTGRAY' | kw= 'MAGENTA' | kw= 'ORANGE' | kw= 'PINK' | kw= 'RED' | kw= 'WHITE' | kw= 'YELLOW' )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:903:1: (kw= 'BLACK' | kw= 'BLUE' | kw= 'CYAN' | kw= 'DARK GRAY' | kw= 'GRAY' | kw= 'GREEN' | kw= 'LIGHTGRAY' | kw= 'MAGENTA' | kw= 'ORANGE' | kw= 'PINK' | kw= 'RED' | kw= 'WHITE' | kw= 'YELLOW' )
            int alt8=13;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            case 26:
                {
                alt8=6;
                }
                break;
            case 27:
                {
                alt8=7;
                }
                break;
            case 28:
                {
                alt8=8;
                }
                break;
            case 29:
                {
                alt8=9;
                }
                break;
            case 30:
                {
                alt8=10;
                }
                break;
            case 31:
                {
                alt8=11;
                }
                break;
            case 32:
                {
                alt8=12;
                }
                break;
            case 33:
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
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:904:2: kw= 'BLACK'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleCOLOR2168); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCOLORAccess().getBLACKKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:911:2: kw= 'BLUE'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleCOLOR2187); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCOLORAccess().getBLUEKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:918:2: kw= 'CYAN'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleCOLOR2206); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCOLORAccess().getCYANKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:925:2: kw= 'DARK GRAY'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleCOLOR2225); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCOLORAccess().getDARKGRAYKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:932:2: kw= 'GRAY'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleCOLOR2244); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCOLORAccess().getGRAYKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:939:2: kw= 'GREEN'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleCOLOR2263); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCOLORAccess().getGREENKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:946:2: kw= 'LIGHTGRAY'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleCOLOR2282); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCOLORAccess().getLIGHTGRAYKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:953:2: kw= 'MAGENTA'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleCOLOR2301); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCOLORAccess().getMAGENTAKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:960:2: kw= 'ORANGE'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleCOLOR2320); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCOLORAccess().getORANGEKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:967:2: kw= 'PINK'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleCOLOR2339); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCOLORAccess().getPINKKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:974:2: kw= 'RED'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleCOLOR2358); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCOLORAccess().getREDKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:981:2: kw= 'WHITE'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleCOLOR2377); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCOLORAccess().getWHITEKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:988:2: kw= 'YELLOW'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleCOLOR2396); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCOLORAccess().getYELLOWKeyword_12()); 
                        

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
    // $ANTLR end "ruleCOLOR"


    // $ANTLR start "entryRuleFONT_SPEC"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1001:1: entryRuleFONT_SPEC returns [EObject current=null] : iv_ruleFONT_SPEC= ruleFONT_SPEC EOF ;
    public final EObject entryRuleFONT_SPEC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFONT_SPEC = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1002:2: (iv_ruleFONT_SPEC= ruleFONT_SPEC EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1003:2: iv_ruleFONT_SPEC= ruleFONT_SPEC EOF
            {
             newCompositeNode(grammarAccess.getFONT_SPECRule()); 
            pushFollow(FOLLOW_ruleFONT_SPEC_in_entryRuleFONT_SPEC2436);
            iv_ruleFONT_SPEC=ruleFONT_SPEC();

            state._fsp--;

             current =iv_ruleFONT_SPEC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFONT_SPEC2446); 

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
    // $ANTLR end "entryRuleFONT_SPEC"


    // $ANTLR start "ruleFONT_SPEC"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1010:1: ruleFONT_SPEC returns [EObject current=null] : this_FONT_STYLE_0= ruleFONT_STYLE ;
    public final EObject ruleFONT_SPEC() throws RecognitionException {
        EObject current = null;

        EObject this_FONT_STYLE_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1013:28: (this_FONT_STYLE_0= ruleFONT_STYLE )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1015:5: this_FONT_STYLE_0= ruleFONT_STYLE
            {
             
                    newCompositeNode(grammarAccess.getFONT_SPECAccess().getFONT_STYLEParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleFONT_STYLE_in_ruleFONT_SPEC2492);
            this_FONT_STYLE_0=ruleFONT_STYLE();

            state._fsp--;

             
                    current = this_FONT_STYLE_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleFONT_SPEC"


    // $ANTLR start "entryRuleFONT_STYLE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1031:1: entryRuleFONT_STYLE returns [EObject current=null] : iv_ruleFONT_STYLE= ruleFONT_STYLE EOF ;
    public final EObject entryRuleFONT_STYLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFONT_STYLE = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1032:2: (iv_ruleFONT_STYLE= ruleFONT_STYLE EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1033:2: iv_ruleFONT_STYLE= ruleFONT_STYLE EOF
            {
             newCompositeNode(grammarAccess.getFONT_STYLERule()); 
            pushFollow(FOLLOW_ruleFONT_STYLE_in_entryRuleFONT_STYLE2526);
            iv_ruleFONT_STYLE=ruleFONT_STYLE();

            state._fsp--;

             current =iv_ruleFONT_STYLE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFONT_STYLE2536); 

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
    // $ANTLR end "entryRuleFONT_STYLE"


    // $ANTLR start "ruleFONT_STYLE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1040:1: ruleFONT_STYLE returns [EObject current=null] : (otherlv_0= 'FONTSTYLE' ( (lv_style_1_0= ruleFontStyleValues ) ) ) ;
    public final EObject ruleFONT_STYLE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_style_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1043:28: ( (otherlv_0= 'FONTSTYLE' ( (lv_style_1_0= ruleFontStyleValues ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1044:1: (otherlv_0= 'FONTSTYLE' ( (lv_style_1_0= ruleFontStyleValues ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1044:1: (otherlv_0= 'FONTSTYLE' ( (lv_style_1_0= ruleFontStyleValues ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1044:3: otherlv_0= 'FONTSTYLE' ( (lv_style_1_0= ruleFontStyleValues ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleFONT_STYLE2573); 

                	newLeafNode(otherlv_0, grammarAccess.getFONT_STYLEAccess().getFONTSTYLEKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1048:1: ( (lv_style_1_0= ruleFontStyleValues ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1049:1: (lv_style_1_0= ruleFontStyleValues )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1049:1: (lv_style_1_0= ruleFontStyleValues )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1050:3: lv_style_1_0= ruleFontStyleValues
            {
             
            	        newCompositeNode(grammarAccess.getFONT_STYLEAccess().getStyleFontStyleValuesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFontStyleValues_in_ruleFONT_STYLE2594);
            lv_style_1_0=ruleFontStyleValues();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFONT_STYLERule());
            	        }
                   		set(
                   			current, 
                   			"style",
                    		lv_style_1_0, 
                    		"FontStyleValues");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleFONT_STYLE"


    // $ANTLR start "entryRuleFontStyleValues"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1074:1: entryRuleFontStyleValues returns [EObject current=null] : iv_ruleFontStyleValues= ruleFontStyleValues EOF ;
    public final EObject entryRuleFontStyleValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontStyleValues = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1075:2: (iv_ruleFontStyleValues= ruleFontStyleValues EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1076:2: iv_ruleFontStyleValues= ruleFontStyleValues EOF
            {
             newCompositeNode(grammarAccess.getFontStyleValuesRule()); 
            pushFollow(FOLLOW_ruleFontStyleValues_in_entryRuleFontStyleValues2630);
            iv_ruleFontStyleValues=ruleFontStyleValues();

            state._fsp--;

             current =iv_ruleFontStyleValues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFontStyleValues2640); 

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
    // $ANTLR end "entryRuleFontStyleValues"


    // $ANTLR start "ruleFontStyleValues"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1083:1: ruleFontStyleValues returns [EObject current=null] : ( ( () otherlv_1= 'BOLD' ) | ( () otherlv_3= 'ITALIC' ) | ( () otherlv_5= 'PLAIN' ) ) ;
    public final EObject ruleFontStyleValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1086:28: ( ( ( () otherlv_1= 'BOLD' ) | ( () otherlv_3= 'ITALIC' ) | ( () otherlv_5= 'PLAIN' ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1087:1: ( ( () otherlv_1= 'BOLD' ) | ( () otherlv_3= 'ITALIC' ) | ( () otherlv_5= 'PLAIN' ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1087:1: ( ( () otherlv_1= 'BOLD' ) | ( () otherlv_3= 'ITALIC' ) | ( () otherlv_5= 'PLAIN' ) )
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
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1087:2: ( () otherlv_1= 'BOLD' )
                    {
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1087:2: ( () otherlv_1= 'BOLD' )
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1087:3: () otherlv_1= 'BOLD'
                    {
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1087:3: ()
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1088:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFontStyleValuesAccess().getBOLDAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleFontStyleValues2687); 

                        	newLeafNode(otherlv_1, grammarAccess.getFontStyleValuesAccess().getBOLDKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1098:6: ( () otherlv_3= 'ITALIC' )
                    {
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1098:6: ( () otherlv_3= 'ITALIC' )
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1098:7: () otherlv_3= 'ITALIC'
                    {
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1098:7: ()
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1099:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFontStyleValuesAccess().getITALICAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleFontStyleValues2716); 

                        	newLeafNode(otherlv_3, grammarAccess.getFontStyleValuesAccess().getITALICKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1109:6: ( () otherlv_5= 'PLAIN' )
                    {
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1109:6: ( () otherlv_5= 'PLAIN' )
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1109:7: () otherlv_5= 'PLAIN'
                    {
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1109:7: ()
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1110:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFontStyleValuesAccess().getPLAINAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleFontStyleValues2745); 

                        	newLeafNode(otherlv_5, grammarAccess.getFontStyleValuesAccess().getPLAINKeyword_2_1());
                        

                    }


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
    // $ANTLR end "ruleFontStyleValues"


    // $ANTLR start "entryRuleCLEAR"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1127:1: entryRuleCLEAR returns [EObject current=null] : iv_ruleCLEAR= ruleCLEAR EOF ;
    public final EObject entryRuleCLEAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCLEAR = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1128:2: (iv_ruleCLEAR= ruleCLEAR EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1129:2: iv_ruleCLEAR= ruleCLEAR EOF
            {
             newCompositeNode(grammarAccess.getCLEARRule()); 
            pushFollow(FOLLOW_ruleCLEAR_in_entryRuleCLEAR2782);
            iv_ruleCLEAR=ruleCLEAR();

            state._fsp--;

             current =iv_ruleCLEAR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCLEAR2792); 

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
    // $ANTLR end "entryRuleCLEAR"


    // $ANTLR start "ruleCLEAR"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1136:1: ruleCLEAR returns [EObject current=null] : ( () otherlv_1= 'CLEAR' ) ;
    public final EObject ruleCLEAR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1139:28: ( ( () otherlv_1= 'CLEAR' ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1140:1: ( () otherlv_1= 'CLEAR' )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1140:1: ( () otherlv_1= 'CLEAR' )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1140:2: () otherlv_1= 'CLEAR'
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1140:2: ()
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1141:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCLEARAccess().getCLEARAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleCLEAR2838); 

                	newLeafNode(otherlv_1, grammarAccess.getCLEARAccess().getCLEARKeyword_1());
                

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
    // $ANTLR end "ruleCLEAR"


    // $ANTLR start "entryRuleHOME"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1158:1: entryRuleHOME returns [EObject current=null] : iv_ruleHOME= ruleHOME EOF ;
    public final EObject entryRuleHOME() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHOME = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1159:2: (iv_ruleHOME= ruleHOME EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1160:2: iv_ruleHOME= ruleHOME EOF
            {
             newCompositeNode(grammarAccess.getHOMERule()); 
            pushFollow(FOLLOW_ruleHOME_in_entryRuleHOME2874);
            iv_ruleHOME=ruleHOME();

            state._fsp--;

             current =iv_ruleHOME; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHOME2884); 

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
    // $ANTLR end "entryRuleHOME"


    // $ANTLR start "ruleHOME"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1167:1: ruleHOME returns [EObject current=null] : ( () otherlv_1= 'HOME' ) ;
    public final EObject ruleHOME() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1170:28: ( ( () otherlv_1= 'HOME' ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1171:1: ( () otherlv_1= 'HOME' )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1171:1: ( () otherlv_1= 'HOME' )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1171:2: () otherlv_1= 'HOME'
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1171:2: ()
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1172:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHOMEAccess().getHOMEAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleHOME2930); 

                	newLeafNode(otherlv_1, grammarAccess.getHOMEAccess().getHOMEKeyword_1());
                

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
    // $ANTLR end "ruleHOME"


    // $ANTLR start "entryRuleDRAW_STRING"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1189:1: entryRuleDRAW_STRING returns [EObject current=null] : iv_ruleDRAW_STRING= ruleDRAW_STRING EOF ;
    public final EObject entryRuleDRAW_STRING() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRAW_STRING = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1190:2: (iv_ruleDRAW_STRING= ruleDRAW_STRING EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1191:2: iv_ruleDRAW_STRING= ruleDRAW_STRING EOF
            {
             newCompositeNode(grammarAccess.getDRAW_STRINGRule()); 
            pushFollow(FOLLOW_ruleDRAW_STRING_in_entryRuleDRAW_STRING2966);
            iv_ruleDRAW_STRING=ruleDRAW_STRING();

            state._fsp--;

             current =iv_ruleDRAW_STRING; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDRAW_STRING2976); 

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
    // $ANTLR end "entryRuleDRAW_STRING"


    // $ANTLR start "ruleDRAW_STRING"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1198:1: ruleDRAW_STRING returns [EObject current=null] : (otherlv_0= 'DRAWSTRING' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDRAW_STRING() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1201:28: ( (otherlv_0= 'DRAWSTRING' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1202:1: (otherlv_0= 'DRAWSTRING' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1202:1: (otherlv_0= 'DRAWSTRING' ( (lv_text_1_0= RULE_STRING ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1202:3: otherlv_0= 'DRAWSTRING' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleDRAW_STRING3013); 

                	newLeafNode(otherlv_0, grammarAccess.getDRAW_STRINGAccess().getDRAWSTRINGKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1206:1: ( (lv_text_1_0= RULE_STRING ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1207:1: (lv_text_1_0= RULE_STRING )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1207:1: (lv_text_1_0= RULE_STRING )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1208:3: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDRAW_STRING3030); 

            			newLeafNode(lv_text_1_0, grammarAccess.getDRAW_STRINGAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDRAW_STRINGRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"STRING");
            	    

            }


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
    // $ANTLR end "ruleDRAW_STRING"


    // $ANTLR start "entryRuleMAKE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1234:1: entryRuleMAKE returns [EObject current=null] : iv_ruleMAKE= ruleMAKE EOF ;
    public final EObject entryRuleMAKE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMAKE = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1235:2: (iv_ruleMAKE= ruleMAKE EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1236:2: iv_ruleMAKE= ruleMAKE EOF
            {
             newCompositeNode(grammarAccess.getMAKERule()); 
            pushFollow(FOLLOW_ruleMAKE_in_entryRuleMAKE3073);
            iv_ruleMAKE=ruleMAKE();

            state._fsp--;

             current =iv_ruleMAKE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMAKE3083); 

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
    // $ANTLR end "entryRuleMAKE"


    // $ANTLR start "ruleMAKE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1243:1: ruleMAKE returns [EObject current=null] : (otherlv_0= 'MAKE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleMAKE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1246:28: ( (otherlv_0= 'MAKE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEXPRESSION ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1247:1: (otherlv_0= 'MAKE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEXPRESSION ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1247:1: (otherlv_0= 'MAKE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEXPRESSION ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1247:3: otherlv_0= 'MAKE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEXPRESSION ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleMAKE3120); 

                	newLeafNode(otherlv_0, grammarAccess.getMAKEAccess().getMAKEKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1251:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1252:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1252:1: (lv_name_1_0= RULE_ID )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1253:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMAKE3137); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMAKEAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMAKERule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleMAKE3154); 

                	newLeafNode(otherlv_2, grammarAccess.getMAKEAccess().getEqualsSignKeyword_2());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1273:1: ( (lv_value_3_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1274:1: (lv_value_3_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1274:1: (lv_value_3_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1275:3: lv_value_3_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getMAKEAccess().getValueEXPRESSIONParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleMAKE3175);
            lv_value_3_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMAKERule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleMAKE"


    // $ANTLR start "entryRuleVARIABLE_REF"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1299:1: entryRuleVARIABLE_REF returns [EObject current=null] : iv_ruleVARIABLE_REF= ruleVARIABLE_REF EOF ;
    public final EObject entryRuleVARIABLE_REF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVARIABLE_REF = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1300:2: (iv_ruleVARIABLE_REF= ruleVARIABLE_REF EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1301:2: iv_ruleVARIABLE_REF= ruleVARIABLE_REF EOF
            {
             newCompositeNode(grammarAccess.getVARIABLE_REFRule()); 
            pushFollow(FOLLOW_ruleVARIABLE_REF_in_entryRuleVARIABLE_REF3211);
            iv_ruleVARIABLE_REF=ruleVARIABLE_REF();

            state._fsp--;

             current =iv_ruleVARIABLE_REF; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVARIABLE_REF3221); 

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
    // $ANTLR end "entryRuleVARIABLE_REF"


    // $ANTLR start "ruleVARIABLE_REF"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1308:1: ruleVARIABLE_REF returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVARIABLE_REF() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1311:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1312:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1312:1: ( (otherlv_0= RULE_ID ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1313:1: (otherlv_0= RULE_ID )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1313:1: (otherlv_0= RULE_ID )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1314:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVARIABLE_REFRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVARIABLE_REF3265); 

            		newLeafNode(otherlv_0, grammarAccess.getVARIABLE_REFAccess().getToVarREFERENCIABLECrossReference_0()); 
            	

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
    // $ANTLR end "ruleVARIABLE_REF"


    // $ANTLR start "entryRuleEXPRESSION"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1333:1: entryRuleEXPRESSION returns [EObject current=null] : iv_ruleEXPRESSION= ruleEXPRESSION EOF ;
    public final EObject entryRuleEXPRESSION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEXPRESSION = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1334:2: (iv_ruleEXPRESSION= ruleEXPRESSION EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1335:2: iv_ruleEXPRESSION= ruleEXPRESSION EOF
            {
             newCompositeNode(grammarAccess.getEXPRESSIONRule()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_entryRuleEXPRESSION3300);
            iv_ruleEXPRESSION=ruleEXPRESSION();

            state._fsp--;

             current =iv_ruleEXPRESSION; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRESSION3310); 

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
    // $ANTLR end "entryRuleEXPRESSION"


    // $ANTLR start "ruleEXPRESSION"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1342:1: ruleEXPRESSION returns [EObject current=null] : (this_VARIABLE_REF_0= ruleVARIABLE_REF | this_VALUE_1= ruleVALUE ) ;
    public final EObject ruleEXPRESSION() throws RecognitionException {
        EObject current = null;

        EObject this_VARIABLE_REF_0 = null;

        EObject this_VALUE_1 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1345:28: ( (this_VARIABLE_REF_0= ruleVARIABLE_REF | this_VALUE_1= ruleVALUE ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1346:1: (this_VARIABLE_REF_0= ruleVARIABLE_REF | this_VALUE_1= ruleVALUE )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1346:1: (this_VARIABLE_REF_0= ruleVARIABLE_REF | this_VALUE_1= ruleVALUE )
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
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1347:5: this_VARIABLE_REF_0= ruleVARIABLE_REF
                    {
                     
                            newCompositeNode(grammarAccess.getEXPRESSIONAccess().getVARIABLE_REFParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVARIABLE_REF_in_ruleEXPRESSION3357);
                    this_VARIABLE_REF_0=ruleVARIABLE_REF();

                    state._fsp--;

                     
                            current = this_VARIABLE_REF_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1357:5: this_VALUE_1= ruleVALUE
                    {
                     
                            newCompositeNode(grammarAccess.getEXPRESSIONAccess().getVALUEParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVALUE_in_ruleEXPRESSION3384);
                    this_VALUE_1=ruleVALUE();

                    state._fsp--;

                     
                            current = this_VALUE_1; 
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
    // $ANTLR end "ruleEXPRESSION"


    // $ANTLR start "entryRuleVALUE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1373:1: entryRuleVALUE returns [EObject current=null] : iv_ruleVALUE= ruleVALUE EOF ;
    public final EObject entryRuleVALUE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVALUE = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1374:2: (iv_ruleVALUE= ruleVALUE EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1375:2: iv_ruleVALUE= ruleVALUE EOF
            {
             newCompositeNode(grammarAccess.getVALUERule()); 
            pushFollow(FOLLOW_ruleVALUE_in_entryRuleVALUE3419);
            iv_ruleVALUE=ruleVALUE();

            state._fsp--;

             current =iv_ruleVALUE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVALUE3429); 

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
    // $ANTLR end "entryRuleVALUE"


    // $ANTLR start "ruleVALUE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1382:1: ruleVALUE returns [EObject current=null] : ( (lv_val_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleVALUE() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;

         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1385:28: ( ( (lv_val_0_0= RULE_DOUBLE ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1386:1: ( (lv_val_0_0= RULE_DOUBLE ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1386:1: ( (lv_val_0_0= RULE_DOUBLE ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1387:1: (lv_val_0_0= RULE_DOUBLE )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1387:1: (lv_val_0_0= RULE_DOUBLE )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1388:3: lv_val_0_0= RULE_DOUBLE
            {
            lv_val_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleVALUE3470); 

            			newLeafNode(lv_val_0_0, grammarAccess.getVALUEAccess().getValDOUBLETerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVALUERule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"val",
                    		lv_val_0_0, 
                    		"DOUBLE");
            	    

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
    // $ANTLR end "ruleVALUE"


    // $ANTLR start "entryRuleCONTENT"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1412:1: entryRuleCONTENT returns [EObject current=null] : iv_ruleCONTENT= ruleCONTENT EOF ;
    public final EObject entryRuleCONTENT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCONTENT = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1413:2: (iv_ruleCONTENT= ruleCONTENT EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1414:2: iv_ruleCONTENT= ruleCONTENT EOF
            {
             newCompositeNode(grammarAccess.getCONTENTRule()); 
            pushFollow(FOLLOW_ruleCONTENT_in_entryRuleCONTENT3510);
            iv_ruleCONTENT=ruleCONTENT();

            state._fsp--;

             current =iv_ruleCONTENT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCONTENT3520); 

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
    // $ANTLR end "entryRuleCONTENT"


    // $ANTLR start "ruleCONTENT"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1421:1: ruleCONTENT returns [EObject current=null] : (otherlv_0= 'CONTENT' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleCONTENT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1424:28: ( (otherlv_0= 'CONTENT' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1425:1: (otherlv_0= 'CONTENT' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1425:1: (otherlv_0= 'CONTENT' ( (otherlv_1= RULE_ID ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1425:3: otherlv_0= 'CONTENT' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleCONTENT3557); 

                	newLeafNode(otherlv_0, grammarAccess.getCONTENTAccess().getCONTENTKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1429:1: ( (otherlv_1= RULE_ID ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1430:1: (otherlv_1= RULE_ID )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1430:1: (otherlv_1= RULE_ID )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1431:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCONTENTRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCONTENT3577); 

            		newLeafNode(otherlv_1, grammarAccess.getCONTENTAccess().getVarMAKECrossReference_1_0()); 
            	

            }


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
    // $ANTLR end "ruleCONTENT"


    // $ANTLR start "entryRuleOPERATION"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1450:1: entryRuleOPERATION returns [EObject current=null] : iv_ruleOPERATION= ruleOPERATION EOF ;
    public final EObject entryRuleOPERATION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOPERATION = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1451:2: (iv_ruleOPERATION= ruleOPERATION EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1452:2: iv_ruleOPERATION= ruleOPERATION EOF
            {
             newCompositeNode(grammarAccess.getOPERATIONRule()); 
            pushFollow(FOLLOW_ruleOPERATION_in_entryRuleOPERATION3613);
            iv_ruleOPERATION=ruleOPERATION();

            state._fsp--;

             current =iv_ruleOPERATION; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOPERATION3623); 

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
    // $ANTLR end "entryRuleOPERATION"


    // $ANTLR start "ruleOPERATION"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1459:1: ruleOPERATION returns [EObject current=null] : (this_SUM_0= ruleSUM | this_SUBTRACT_1= ruleSUBTRACT | this_MULTIPLY_2= ruleMULTIPLY | this_DIVIDE_3= ruleDIVIDE ) ;
    public final EObject ruleOPERATION() throws RecognitionException {
        EObject current = null;

        EObject this_SUM_0 = null;

        EObject this_SUBTRACT_1 = null;

        EObject this_MULTIPLY_2 = null;

        EObject this_DIVIDE_3 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1462:28: ( (this_SUM_0= ruleSUM | this_SUBTRACT_1= ruleSUBTRACT | this_MULTIPLY_2= ruleMULTIPLY | this_DIVIDE_3= ruleDIVIDE ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1463:1: (this_SUM_0= ruleSUM | this_SUBTRACT_1= ruleSUBTRACT | this_MULTIPLY_2= ruleMULTIPLY | this_DIVIDE_3= ruleDIVIDE )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1463:1: (this_SUM_0= ruleSUM | this_SUBTRACT_1= ruleSUBTRACT | this_MULTIPLY_2= ruleMULTIPLY | this_DIVIDE_3= ruleDIVIDE )
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
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1464:5: this_SUM_0= ruleSUM
                    {
                     
                            newCompositeNode(grammarAccess.getOPERATIONAccess().getSUMParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSUM_in_ruleOPERATION3670);
                    this_SUM_0=ruleSUM();

                    state._fsp--;

                     
                            current = this_SUM_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1474:5: this_SUBTRACT_1= ruleSUBTRACT
                    {
                     
                            newCompositeNode(grammarAccess.getOPERATIONAccess().getSUBTRACTParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSUBTRACT_in_ruleOPERATION3697);
                    this_SUBTRACT_1=ruleSUBTRACT();

                    state._fsp--;

                     
                            current = this_SUBTRACT_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1484:5: this_MULTIPLY_2= ruleMULTIPLY
                    {
                     
                            newCompositeNode(grammarAccess.getOPERATIONAccess().getMULTIPLYParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMULTIPLY_in_ruleOPERATION3724);
                    this_MULTIPLY_2=ruleMULTIPLY();

                    state._fsp--;

                     
                            current = this_MULTIPLY_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1494:5: this_DIVIDE_3= ruleDIVIDE
                    {
                     
                            newCompositeNode(grammarAccess.getOPERATIONAccess().getDIVIDEParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDIVIDE_in_ruleOPERATION3751);
                    this_DIVIDE_3=ruleDIVIDE();

                    state._fsp--;

                     
                            current = this_DIVIDE_3; 
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
    // $ANTLR end "ruleOPERATION"


    // $ANTLR start "entryRuleSUM"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1510:1: entryRuleSUM returns [EObject current=null] : iv_ruleSUM= ruleSUM EOF ;
    public final EObject entryRuleSUM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSUM = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1511:2: (iv_ruleSUM= ruleSUM EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1512:2: iv_ruleSUM= ruleSUM EOF
            {
             newCompositeNode(grammarAccess.getSUMRule()); 
            pushFollow(FOLLOW_ruleSUM_in_entryRuleSUM3786);
            iv_ruleSUM=ruleSUM();

            state._fsp--;

             current =iv_ruleSUM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSUM3796); 

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
    // $ANTLR end "entryRuleSUM"


    // $ANTLR start "ruleSUM"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1519:1: ruleSUM returns [EObject current=null] : (otherlv_0= 'SUM' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '+' ( (lv_valTwo_5_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleSUM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_valOne_3_0 = null;

        EObject lv_valTwo_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1522:28: ( (otherlv_0= 'SUM' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '+' ( (lv_valTwo_5_0= ruleEXPRESSION ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1523:1: (otherlv_0= 'SUM' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '+' ( (lv_valTwo_5_0= ruleEXPRESSION ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1523:1: (otherlv_0= 'SUM' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '+' ( (lv_valTwo_5_0= ruleEXPRESSION ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1523:3: otherlv_0= 'SUM' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '+' ( (lv_valTwo_5_0= ruleEXPRESSION ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleSUM3833); 

                	newLeafNode(otherlv_0, grammarAccess.getSUMAccess().getSUMKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1527:1: ( (otherlv_1= RULE_ID ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1528:1: (otherlv_1= RULE_ID )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1528:1: (otherlv_1= RULE_ID )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1529:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSUMRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSUM3853); 

            		newLeafNode(otherlv_1, grammarAccess.getSUMAccess().getTargetVariableMAKECrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleSUM3865); 

                	newLeafNode(otherlv_2, grammarAccess.getSUMAccess().getEqualsSignKeyword_2());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1544:1: ( (lv_valOne_3_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1545:1: (lv_valOne_3_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1545:1: (lv_valOne_3_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1546:3: lv_valOne_3_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getSUMAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleSUM3886);
            lv_valOne_3_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSUMRule());
            	        }
                   		set(
                   			current, 
                   			"valOne",
                    		lv_valOne_3_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleSUM3898); 

                	newLeafNode(otherlv_4, grammarAccess.getSUMAccess().getPlusSignKeyword_4());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1566:1: ( (lv_valTwo_5_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1567:1: (lv_valTwo_5_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1567:1: (lv_valTwo_5_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1568:3: lv_valTwo_5_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getSUMAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleSUM3919);
            lv_valTwo_5_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSUMRule());
            	        }
                   		set(
                   			current, 
                   			"valTwo",
                    		lv_valTwo_5_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleSUM"


    // $ANTLR start "entryRuleSUBTRACT"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1592:1: entryRuleSUBTRACT returns [EObject current=null] : iv_ruleSUBTRACT= ruleSUBTRACT EOF ;
    public final EObject entryRuleSUBTRACT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSUBTRACT = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1593:2: (iv_ruleSUBTRACT= ruleSUBTRACT EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1594:2: iv_ruleSUBTRACT= ruleSUBTRACT EOF
            {
             newCompositeNode(grammarAccess.getSUBTRACTRule()); 
            pushFollow(FOLLOW_ruleSUBTRACT_in_entryRuleSUBTRACT3955);
            iv_ruleSUBTRACT=ruleSUBTRACT();

            state._fsp--;

             current =iv_ruleSUBTRACT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSUBTRACT3965); 

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
    // $ANTLR end "entryRuleSUBTRACT"


    // $ANTLR start "ruleSUBTRACT"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1601:1: ruleSUBTRACT returns [EObject current=null] : (otherlv_0= 'SUBTRACT' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '-' ( (lv_valTwo_5_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleSUBTRACT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_valOne_3_0 = null;

        EObject lv_valTwo_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1604:28: ( (otherlv_0= 'SUBTRACT' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '-' ( (lv_valTwo_5_0= ruleEXPRESSION ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1605:1: (otherlv_0= 'SUBTRACT' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '-' ( (lv_valTwo_5_0= ruleEXPRESSION ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1605:1: (otherlv_0= 'SUBTRACT' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '-' ( (lv_valTwo_5_0= ruleEXPRESSION ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1605:3: otherlv_0= 'SUBTRACT' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '-' ( (lv_valTwo_5_0= ruleEXPRESSION ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleSUBTRACT4002); 

                	newLeafNode(otherlv_0, grammarAccess.getSUBTRACTAccess().getSUBTRACTKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1609:1: ( (otherlv_1= RULE_ID ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1610:1: (otherlv_1= RULE_ID )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1610:1: (otherlv_1= RULE_ID )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1611:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSUBTRACTRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSUBTRACT4022); 

            		newLeafNode(otherlv_1, grammarAccess.getSUBTRACTAccess().getTargetVariableMAKECrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleSUBTRACT4034); 

                	newLeafNode(otherlv_2, grammarAccess.getSUBTRACTAccess().getEqualsSignKeyword_2());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1626:1: ( (lv_valOne_3_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1627:1: (lv_valOne_3_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1627:1: (lv_valOne_3_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1628:3: lv_valOne_3_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getSUBTRACTAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleSUBTRACT4055);
            lv_valOne_3_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSUBTRACTRule());
            	        }
                   		set(
                   			current, 
                   			"valOne",
                    		lv_valOne_3_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleSUBTRACT4067); 

                	newLeafNode(otherlv_4, grammarAccess.getSUBTRACTAccess().getHyphenMinusKeyword_4());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1648:1: ( (lv_valTwo_5_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1649:1: (lv_valTwo_5_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1649:1: (lv_valTwo_5_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1650:3: lv_valTwo_5_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getSUBTRACTAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleSUBTRACT4088);
            lv_valTwo_5_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSUBTRACTRule());
            	        }
                   		set(
                   			current, 
                   			"valTwo",
                    		lv_valTwo_5_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleSUBTRACT"


    // $ANTLR start "entryRuleMULTIPLY"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1674:1: entryRuleMULTIPLY returns [EObject current=null] : iv_ruleMULTIPLY= ruleMULTIPLY EOF ;
    public final EObject entryRuleMULTIPLY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMULTIPLY = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1675:2: (iv_ruleMULTIPLY= ruleMULTIPLY EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1676:2: iv_ruleMULTIPLY= ruleMULTIPLY EOF
            {
             newCompositeNode(grammarAccess.getMULTIPLYRule()); 
            pushFollow(FOLLOW_ruleMULTIPLY_in_entryRuleMULTIPLY4124);
            iv_ruleMULTIPLY=ruleMULTIPLY();

            state._fsp--;

             current =iv_ruleMULTIPLY; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMULTIPLY4134); 

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
    // $ANTLR end "entryRuleMULTIPLY"


    // $ANTLR start "ruleMULTIPLY"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1683:1: ruleMULTIPLY returns [EObject current=null] : (otherlv_0= 'MULTIPLY' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '*' ( (lv_valTwo_5_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleMULTIPLY() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_valOne_3_0 = null;

        EObject lv_valTwo_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1686:28: ( (otherlv_0= 'MULTIPLY' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '*' ( (lv_valTwo_5_0= ruleEXPRESSION ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1687:1: (otherlv_0= 'MULTIPLY' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '*' ( (lv_valTwo_5_0= ruleEXPRESSION ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1687:1: (otherlv_0= 'MULTIPLY' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '*' ( (lv_valTwo_5_0= ruleEXPRESSION ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1687:3: otherlv_0= 'MULTIPLY' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '*' ( (lv_valTwo_5_0= ruleEXPRESSION ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleMULTIPLY4171); 

                	newLeafNode(otherlv_0, grammarAccess.getMULTIPLYAccess().getMULTIPLYKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1691:1: ( (otherlv_1= RULE_ID ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1692:1: (otherlv_1= RULE_ID )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1692:1: (otherlv_1= RULE_ID )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1693:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMULTIPLYRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMULTIPLY4191); 

            		newLeafNode(otherlv_1, grammarAccess.getMULTIPLYAccess().getTargetVariableMAKECrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleMULTIPLY4203); 

                	newLeafNode(otherlv_2, grammarAccess.getMULTIPLYAccess().getEqualsSignKeyword_2());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1708:1: ( (lv_valOne_3_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1709:1: (lv_valOne_3_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1709:1: (lv_valOne_3_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1710:3: lv_valOne_3_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getMULTIPLYAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleMULTIPLY4224);
            lv_valOne_3_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMULTIPLYRule());
            	        }
                   		set(
                   			current, 
                   			"valOne",
                    		lv_valOne_3_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleMULTIPLY4236); 

                	newLeafNode(otherlv_4, grammarAccess.getMULTIPLYAccess().getAsteriskKeyword_4());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1730:1: ( (lv_valTwo_5_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1731:1: (lv_valTwo_5_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1731:1: (lv_valTwo_5_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1732:3: lv_valTwo_5_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getMULTIPLYAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleMULTIPLY4257);
            lv_valTwo_5_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMULTIPLYRule());
            	        }
                   		set(
                   			current, 
                   			"valTwo",
                    		lv_valTwo_5_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleMULTIPLY"


    // $ANTLR start "entryRuleDIVIDE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1756:1: entryRuleDIVIDE returns [EObject current=null] : iv_ruleDIVIDE= ruleDIVIDE EOF ;
    public final EObject entryRuleDIVIDE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDIVIDE = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1757:2: (iv_ruleDIVIDE= ruleDIVIDE EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1758:2: iv_ruleDIVIDE= ruleDIVIDE EOF
            {
             newCompositeNode(grammarAccess.getDIVIDERule()); 
            pushFollow(FOLLOW_ruleDIVIDE_in_entryRuleDIVIDE4293);
            iv_ruleDIVIDE=ruleDIVIDE();

            state._fsp--;

             current =iv_ruleDIVIDE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDIVIDE4303); 

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
    // $ANTLR end "entryRuleDIVIDE"


    // $ANTLR start "ruleDIVIDE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1765:1: ruleDIVIDE returns [EObject current=null] : (otherlv_0= 'DIVIDE' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '/' ( (lv_valTwo_5_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleDIVIDE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_valOne_3_0 = null;

        EObject lv_valTwo_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1768:28: ( (otherlv_0= 'DIVIDE' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '/' ( (lv_valTwo_5_0= ruleEXPRESSION ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1769:1: (otherlv_0= 'DIVIDE' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '/' ( (lv_valTwo_5_0= ruleEXPRESSION ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1769:1: (otherlv_0= 'DIVIDE' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '/' ( (lv_valTwo_5_0= ruleEXPRESSION ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1769:3: otherlv_0= 'DIVIDE' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_valOne_3_0= ruleEXPRESSION ) ) otherlv_4= '/' ( (lv_valTwo_5_0= ruleEXPRESSION ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleDIVIDE4340); 

                	newLeafNode(otherlv_0, grammarAccess.getDIVIDEAccess().getDIVIDEKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1773:1: ( (otherlv_1= RULE_ID ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1774:1: (otherlv_1= RULE_ID )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1774:1: (otherlv_1= RULE_ID )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1775:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDIVIDERule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDIVIDE4360); 

            		newLeafNode(otherlv_1, grammarAccess.getDIVIDEAccess().getTargetVariableMAKECrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleDIVIDE4372); 

                	newLeafNode(otherlv_2, grammarAccess.getDIVIDEAccess().getEqualsSignKeyword_2());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1790:1: ( (lv_valOne_3_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1791:1: (lv_valOne_3_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1791:1: (lv_valOne_3_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1792:3: lv_valOne_3_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getDIVIDEAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleDIVIDE4393);
            lv_valOne_3_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDIVIDERule());
            	        }
                   		set(
                   			current, 
                   			"valOne",
                    		lv_valOne_3_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleDIVIDE4405); 

                	newLeafNode(otherlv_4, grammarAccess.getDIVIDEAccess().getSolidusKeyword_4());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1812:1: ( (lv_valTwo_5_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1813:1: (lv_valTwo_5_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1813:1: (lv_valTwo_5_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1814:3: lv_valTwo_5_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getDIVIDEAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleDIVIDE4426);
            lv_valTwo_5_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDIVIDERule());
            	        }
                   		set(
                   			current, 
                   			"valTwo",
                    		lv_valTwo_5_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleDIVIDE"


    // $ANTLR start "entryRuleCONTROL_SENTENCES"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1838:1: entryRuleCONTROL_SENTENCES returns [EObject current=null] : iv_ruleCONTROL_SENTENCES= ruleCONTROL_SENTENCES EOF ;
    public final EObject entryRuleCONTROL_SENTENCES() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCONTROL_SENTENCES = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1839:2: (iv_ruleCONTROL_SENTENCES= ruleCONTROL_SENTENCES EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1840:2: iv_ruleCONTROL_SENTENCES= ruleCONTROL_SENTENCES EOF
            {
             newCompositeNode(grammarAccess.getCONTROL_SENTENCESRule()); 
            pushFollow(FOLLOW_ruleCONTROL_SENTENCES_in_entryRuleCONTROL_SENTENCES4462);
            iv_ruleCONTROL_SENTENCES=ruleCONTROL_SENTENCES();

            state._fsp--;

             current =iv_ruleCONTROL_SENTENCES; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCONTROL_SENTENCES4472); 

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
    // $ANTLR end "entryRuleCONTROL_SENTENCES"


    // $ANTLR start "ruleCONTROL_SENTENCES"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1847:1: ruleCONTROL_SENTENCES returns [EObject current=null] : (this_REPEAT_0= ruleREPEAT | this_TO_1= ruleTO | this_IF_SENTENCE_2= ruleIF_SENTENCE ) ;
    public final EObject ruleCONTROL_SENTENCES() throws RecognitionException {
        EObject current = null;

        EObject this_REPEAT_0 = null;

        EObject this_TO_1 = null;

        EObject this_IF_SENTENCE_2 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1850:28: ( (this_REPEAT_0= ruleREPEAT | this_TO_1= ruleTO | this_IF_SENTENCE_2= ruleIF_SENTENCE ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1851:1: (this_REPEAT_0= ruleREPEAT | this_TO_1= ruleTO | this_IF_SENTENCE_2= ruleIF_SENTENCE )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1851:1: (this_REPEAT_0= ruleREPEAT | this_TO_1= ruleTO | this_IF_SENTENCE_2= ruleIF_SENTENCE )
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
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1852:5: this_REPEAT_0= ruleREPEAT
                    {
                     
                            newCompositeNode(grammarAccess.getCONTROL_SENTENCESAccess().getREPEATParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleREPEAT_in_ruleCONTROL_SENTENCES4519);
                    this_REPEAT_0=ruleREPEAT();

                    state._fsp--;

                     
                            current = this_REPEAT_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1862:5: this_TO_1= ruleTO
                    {
                     
                            newCompositeNode(grammarAccess.getCONTROL_SENTENCESAccess().getTOParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTO_in_ruleCONTROL_SENTENCES4546);
                    this_TO_1=ruleTO();

                    state._fsp--;

                     
                            current = this_TO_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1872:5: this_IF_SENTENCE_2= ruleIF_SENTENCE
                    {
                     
                            newCompositeNode(grammarAccess.getCONTROL_SENTENCESAccess().getIF_SENTENCEParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIF_SENTENCE_in_ruleCONTROL_SENTENCES4573);
                    this_IF_SENTENCE_2=ruleIF_SENTENCE();

                    state._fsp--;

                     
                            current = this_IF_SENTENCE_2; 
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
    // $ANTLR end "ruleCONTROL_SENTENCES"


    // $ANTLR start "entryRuleREPEAT"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1888:1: entryRuleREPEAT returns [EObject current=null] : iv_ruleREPEAT= ruleREPEAT EOF ;
    public final EObject entryRuleREPEAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleREPEAT = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1889:2: (iv_ruleREPEAT= ruleREPEAT EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1890:2: iv_ruleREPEAT= ruleREPEAT EOF
            {
             newCompositeNode(grammarAccess.getREPEATRule()); 
            pushFollow(FOLLOW_ruleREPEAT_in_entryRuleREPEAT4608);
            iv_ruleREPEAT=ruleREPEAT();

            state._fsp--;

             current =iv_ruleREPEAT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREPEAT4618); 

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
    // $ANTLR end "entryRuleREPEAT"


    // $ANTLR start "ruleREPEAT"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1897:1: ruleREPEAT returns [EObject current=null] : (otherlv_0= 'REPEAT' ( (lv_times_1_0= ruleEXPRESSION ) ) ( (lv_commands_2_0= ruleSENTENCE ) )+ otherlv_3= 'END REPEAT' ) ;
    public final EObject ruleREPEAT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_times_1_0 = null;

        EObject lv_commands_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1900:28: ( (otherlv_0= 'REPEAT' ( (lv_times_1_0= ruleEXPRESSION ) ) ( (lv_commands_2_0= ruleSENTENCE ) )+ otherlv_3= 'END REPEAT' ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1901:1: (otherlv_0= 'REPEAT' ( (lv_times_1_0= ruleEXPRESSION ) ) ( (lv_commands_2_0= ruleSENTENCE ) )+ otherlv_3= 'END REPEAT' )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1901:1: (otherlv_0= 'REPEAT' ( (lv_times_1_0= ruleEXPRESSION ) ) ( (lv_commands_2_0= ruleSENTENCE ) )+ otherlv_3= 'END REPEAT' )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1901:3: otherlv_0= 'REPEAT' ( (lv_times_1_0= ruleEXPRESSION ) ) ( (lv_commands_2_0= ruleSENTENCE ) )+ otherlv_3= 'END REPEAT'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleREPEAT4655); 

                	newLeafNode(otherlv_0, grammarAccess.getREPEATAccess().getREPEATKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1905:1: ( (lv_times_1_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1906:1: (lv_times_1_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1906:1: (lv_times_1_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1907:3: lv_times_1_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getREPEATAccess().getTimesEXPRESSIONParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleREPEAT4676);
            lv_times_1_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getREPEATRule());
            	        }
                   		set(
                   			current, 
                   			"times",
                    		lv_times_1_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1923:2: ( (lv_commands_2_0= ruleSENTENCE ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=12 && LA13_0<=20)||LA13_0==34||(LA13_0>=38 && LA13_0<=41)||(LA13_0>=43 && LA13_0<=44)||LA13_0==46||LA13_0==48||LA13_0==50||LA13_0==52||LA13_0==54||LA13_0==57) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1924:1: (lv_commands_2_0= ruleSENTENCE )
            	    {
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1924:1: (lv_commands_2_0= ruleSENTENCE )
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1925:3: lv_commands_2_0= ruleSENTENCE
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getREPEATAccess().getCommandsSENTENCEParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSENTENCE_in_ruleREPEAT4697);
            	    lv_commands_2_0=ruleSENTENCE();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getREPEATRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commands",
            	            		lv_commands_2_0, 
            	            		"SENTENCE");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleREPEAT4710); 

                	newLeafNode(otherlv_3, grammarAccess.getREPEATAccess().getENDREPEATKeyword_3());
                

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
    // $ANTLR end "ruleREPEAT"


    // $ANTLR start "entryRuleTO"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1953:1: entryRuleTO returns [EObject current=null] : iv_ruleTO= ruleTO EOF ;
    public final EObject entryRuleTO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTO = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1954:2: (iv_ruleTO= ruleTO EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1955:2: iv_ruleTO= ruleTO EOF
            {
             newCompositeNode(grammarAccess.getTORule()); 
            pushFollow(FOLLOW_ruleTO_in_entryRuleTO4746);
            iv_ruleTO=ruleTO();

            state._fsp--;

             current =iv_ruleTO; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTO4756); 

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
    // $ANTLR end "entryRuleTO"


    // $ANTLR start "ruleTO"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1962:1: ruleTO returns [EObject current=null] : (otherlv_0= 'TO' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= rulePARAM ) )* ( (lv_commands_3_0= ruleSENTENCE ) )+ otherlv_4= 'END TO' ) ;
    public final EObject ruleTO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_commands_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1965:28: ( (otherlv_0= 'TO' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= rulePARAM ) )* ( (lv_commands_3_0= ruleSENTENCE ) )+ otherlv_4= 'END TO' ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1966:1: (otherlv_0= 'TO' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= rulePARAM ) )* ( (lv_commands_3_0= ruleSENTENCE ) )+ otherlv_4= 'END TO' )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1966:1: (otherlv_0= 'TO' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= rulePARAM ) )* ( (lv_commands_3_0= ruleSENTENCE ) )+ otherlv_4= 'END TO' )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1966:3: otherlv_0= 'TO' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= rulePARAM ) )* ( (lv_commands_3_0= ruleSENTENCE ) )+ otherlv_4= 'END TO'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleTO4793); 

                	newLeafNode(otherlv_0, grammarAccess.getTOAccess().getTOKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1970:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1971:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1971:1: (lv_name_1_0= RULE_ID )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1972:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTO4810); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTOAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTORule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1988:2: ( (lv_parameters_2_0= rulePARAM ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==56) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1989:1: (lv_parameters_2_0= rulePARAM )
            	    {
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1989:1: (lv_parameters_2_0= rulePARAM )
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:1990:3: lv_parameters_2_0= rulePARAM
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTOAccess().getParametersPARAMParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePARAM_in_ruleTO4836);
            	    lv_parameters_2_0=rulePARAM();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTORule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_2_0, 
            	            		"PARAM");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2006:3: ( (lv_commands_3_0= ruleSENTENCE ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=12 && LA15_0<=20)||LA15_0==34||(LA15_0>=38 && LA15_0<=41)||(LA15_0>=43 && LA15_0<=44)||LA15_0==46||LA15_0==48||LA15_0==50||LA15_0==52||LA15_0==54||LA15_0==57) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2007:1: (lv_commands_3_0= ruleSENTENCE )
            	    {
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2007:1: (lv_commands_3_0= ruleSENTENCE )
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2008:3: lv_commands_3_0= ruleSENTENCE
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTOAccess().getCommandsSENTENCEParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSENTENCE_in_ruleTO4858);
            	    lv_commands_3_0=ruleSENTENCE();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTORule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commands",
            	            		lv_commands_3_0, 
            	            		"SENTENCE");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleTO4871); 

                	newLeafNode(otherlv_4, grammarAccess.getTOAccess().getENDTOKeyword_4());
                

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
    // $ANTLR end "ruleTO"


    // $ANTLR start "entryRulePARAM"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2036:1: entryRulePARAM returns [EObject current=null] : iv_rulePARAM= rulePARAM EOF ;
    public final EObject entryRulePARAM() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePARAM = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2037:2: (iv_rulePARAM= rulePARAM EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2038:2: iv_rulePARAM= rulePARAM EOF
            {
             newCompositeNode(grammarAccess.getPARAMRule()); 
            pushFollow(FOLLOW_rulePARAM_in_entryRulePARAM4907);
            iv_rulePARAM=rulePARAM();

            state._fsp--;

             current =iv_rulePARAM; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePARAM4917); 

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
    // $ANTLR end "entryRulePARAM"


    // $ANTLR start "rulePARAM"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2045:1: rulePARAM returns [EObject current=null] : (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePARAM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2048:28: ( (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2049:1: (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2049:1: (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2049:3: otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_rulePARAM4954); 

                	newLeafNode(otherlv_0, grammarAccess.getPARAMAccess().getColonKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2053:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2054:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2054:1: (lv_name_1_0= RULE_ID )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2055:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePARAM4971); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPARAMAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPARAMRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "rulePARAM"


    // $ANTLR start "entryRulePROCEDURE_CALL"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2079:1: entryRulePROCEDURE_CALL returns [EObject current=null] : iv_rulePROCEDURE_CALL= rulePROCEDURE_CALL EOF ;
    public final EObject entryRulePROCEDURE_CALL() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePROCEDURE_CALL = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2080:2: (iv_rulePROCEDURE_CALL= rulePROCEDURE_CALL EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2081:2: iv_rulePROCEDURE_CALL= rulePROCEDURE_CALL EOF
            {
             newCompositeNode(grammarAccess.getPROCEDURE_CALLRule()); 
            pushFollow(FOLLOW_rulePROCEDURE_CALL_in_entryRulePROCEDURE_CALL5012);
            iv_rulePROCEDURE_CALL=rulePROCEDURE_CALL();

            state._fsp--;

             current =iv_rulePROCEDURE_CALL; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePROCEDURE_CALL5022); 

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
    // $ANTLR end "entryRulePROCEDURE_CALL"


    // $ANTLR start "rulePROCEDURE_CALL"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2088:1: rulePROCEDURE_CALL returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleEXPRESSION ) )* ) ;
    public final EObject rulePROCEDURE_CALL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_params_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2091:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleEXPRESSION ) )* ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2092:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleEXPRESSION ) )* )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2092:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleEXPRESSION ) )* )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2092:2: ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleEXPRESSION ) )*
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2092:2: ( (otherlv_0= RULE_ID ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2093:1: (otherlv_0= RULE_ID )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2093:1: (otherlv_0= RULE_ID )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2094:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPROCEDURE_CALLRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePROCEDURE_CALL5067); 

            		newLeafNode(otherlv_0, grammarAccess.getPROCEDURE_CALLAccess().getToTOCrossReference_0_0()); 
            	

            }


            }

            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2105:2: ( (lv_params_1_0= ruleEXPRESSION ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_DOUBLE)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2106:1: (lv_params_1_0= ruleEXPRESSION )
            	    {
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2106:1: (lv_params_1_0= ruleEXPRESSION )
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2107:3: lv_params_1_0= ruleEXPRESSION
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPROCEDURE_CALLAccess().getParamsEXPRESSIONParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEXPRESSION_in_rulePROCEDURE_CALL5088);
            	    lv_params_1_0=ruleEXPRESSION();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPROCEDURE_CALLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_1_0, 
            	            		"EXPRESSION");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


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
    // $ANTLR end "rulePROCEDURE_CALL"


    // $ANTLR start "entryRuleIF_SENTENCE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2131:1: entryRuleIF_SENTENCE returns [EObject current=null] : iv_ruleIF_SENTENCE= ruleIF_SENTENCE EOF ;
    public final EObject entryRuleIF_SENTENCE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIF_SENTENCE = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2132:2: (iv_ruleIF_SENTENCE= ruleIF_SENTENCE EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2133:2: iv_ruleIF_SENTENCE= ruleIF_SENTENCE EOF
            {
             newCompositeNode(grammarAccess.getIF_SENTENCERule()); 
            pushFollow(FOLLOW_ruleIF_SENTENCE_in_entryRuleIF_SENTENCE5125);
            iv_ruleIF_SENTENCE=ruleIF_SENTENCE();

            state._fsp--;

             current =iv_ruleIF_SENTENCE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIF_SENTENCE5135); 

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
    // $ANTLR end "entryRuleIF_SENTENCE"


    // $ANTLR start "ruleIF_SENTENCE"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2140:1: ruleIF_SENTENCE returns [EObject current=null] : (otherlv_0= 'IF' ( (lv_condition_1_0= ruleBOOLEAN_EXPRESSION ) ) ( (lv_commands_2_0= ruleSENTENCE ) )+ otherlv_3= 'END IF' ) ;
    public final EObject ruleIF_SENTENCE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_condition_1_0 = null;

        EObject lv_commands_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2143:28: ( (otherlv_0= 'IF' ( (lv_condition_1_0= ruleBOOLEAN_EXPRESSION ) ) ( (lv_commands_2_0= ruleSENTENCE ) )+ otherlv_3= 'END IF' ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2144:1: (otherlv_0= 'IF' ( (lv_condition_1_0= ruleBOOLEAN_EXPRESSION ) ) ( (lv_commands_2_0= ruleSENTENCE ) )+ otherlv_3= 'END IF' )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2144:1: (otherlv_0= 'IF' ( (lv_condition_1_0= ruleBOOLEAN_EXPRESSION ) ) ( (lv_commands_2_0= ruleSENTENCE ) )+ otherlv_3= 'END IF' )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2144:3: otherlv_0= 'IF' ( (lv_condition_1_0= ruleBOOLEAN_EXPRESSION ) ) ( (lv_commands_2_0= ruleSENTENCE ) )+ otherlv_3= 'END IF'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleIF_SENTENCE5172); 

                	newLeafNode(otherlv_0, grammarAccess.getIF_SENTENCEAccess().getIFKeyword_0());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2148:1: ( (lv_condition_1_0= ruleBOOLEAN_EXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2149:1: (lv_condition_1_0= ruleBOOLEAN_EXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2149:1: (lv_condition_1_0= ruleBOOLEAN_EXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2150:3: lv_condition_1_0= ruleBOOLEAN_EXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getIF_SENTENCEAccess().getConditionBOOLEAN_EXPRESSIONParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOLEAN_EXPRESSION_in_ruleIF_SENTENCE5193);
            lv_condition_1_0=ruleBOOLEAN_EXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIF_SENTENCERule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"BOOLEAN_EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2166:2: ( (lv_commands_2_0= ruleSENTENCE ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||(LA17_0>=12 && LA17_0<=20)||LA17_0==34||(LA17_0>=38 && LA17_0<=41)||(LA17_0>=43 && LA17_0<=44)||LA17_0==46||LA17_0==48||LA17_0==50||LA17_0==52||LA17_0==54||LA17_0==57) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2167:1: (lv_commands_2_0= ruleSENTENCE )
            	    {
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2167:1: (lv_commands_2_0= ruleSENTENCE )
            	    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2168:3: lv_commands_2_0= ruleSENTENCE
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIF_SENTENCEAccess().getCommandsSENTENCEParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSENTENCE_in_ruleIF_SENTENCE5214);
            	    lv_commands_2_0=ruleSENTENCE();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIF_SENTENCERule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commands",
            	            		lv_commands_2_0, 
            	            		"SENTENCE");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleIF_SENTENCE5227); 

                	newLeafNode(otherlv_3, grammarAccess.getIF_SENTENCEAccess().getENDIFKeyword_3());
                

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
    // $ANTLR end "ruleIF_SENTENCE"


    // $ANTLR start "entryRuleBOOLEAN_EXPRESSION"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2196:1: entryRuleBOOLEAN_EXPRESSION returns [EObject current=null] : iv_ruleBOOLEAN_EXPRESSION= ruleBOOLEAN_EXPRESSION EOF ;
    public final EObject entryRuleBOOLEAN_EXPRESSION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOLEAN_EXPRESSION = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2197:2: (iv_ruleBOOLEAN_EXPRESSION= ruleBOOLEAN_EXPRESSION EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2198:2: iv_ruleBOOLEAN_EXPRESSION= ruleBOOLEAN_EXPRESSION EOF
            {
             newCompositeNode(grammarAccess.getBOOLEAN_EXPRESSIONRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_EXPRESSION_in_entryRuleBOOLEAN_EXPRESSION5263);
            iv_ruleBOOLEAN_EXPRESSION=ruleBOOLEAN_EXPRESSION();

            state._fsp--;

             current =iv_ruleBOOLEAN_EXPRESSION; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN_EXPRESSION5273); 

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
    // $ANTLR end "entryRuleBOOLEAN_EXPRESSION"


    // $ANTLR start "ruleBOOLEAN_EXPRESSION"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2205:1: ruleBOOLEAN_EXPRESSION returns [EObject current=null] : (this_EQUALS_0= ruleEQUALS | this_GREATER_THAN_1= ruleGREATER_THAN | this_LESSER_THAN_2= ruleLESSER_THAN ) ;
    public final EObject ruleBOOLEAN_EXPRESSION() throws RecognitionException {
        EObject current = null;

        EObject this_EQUALS_0 = null;

        EObject this_GREATER_THAN_1 = null;

        EObject this_LESSER_THAN_2 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2208:28: ( (this_EQUALS_0= ruleEQUALS | this_GREATER_THAN_1= ruleGREATER_THAN | this_LESSER_THAN_2= ruleLESSER_THAN ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2209:1: (this_EQUALS_0= ruleEQUALS | this_GREATER_THAN_1= ruleGREATER_THAN | this_LESSER_THAN_2= ruleLESSER_THAN )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2209:1: (this_EQUALS_0= ruleEQUALS | this_GREATER_THAN_1= ruleGREATER_THAN | this_LESSER_THAN_2= ruleLESSER_THAN )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 59:
                    {
                    alt18=2;
                    }
                    break;
                case 42:
                    {
                    alt18=1;
                    }
                    break;
                case 60:
                    {
                    alt18=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA18_0==RULE_DOUBLE) ) {
                switch ( input.LA(2) ) {
                case 42:
                    {
                    alt18=1;
                    }
                    break;
                case 60:
                    {
                    alt18=3;
                    }
                    break;
                case 59:
                    {
                    alt18=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2210:5: this_EQUALS_0= ruleEQUALS
                    {
                     
                            newCompositeNode(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getEQUALSParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEQUALS_in_ruleBOOLEAN_EXPRESSION5320);
                    this_EQUALS_0=ruleEQUALS();

                    state._fsp--;

                     
                            current = this_EQUALS_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2220:5: this_GREATER_THAN_1= ruleGREATER_THAN
                    {
                     
                            newCompositeNode(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getGREATER_THANParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGREATER_THAN_in_ruleBOOLEAN_EXPRESSION5347);
                    this_GREATER_THAN_1=ruleGREATER_THAN();

                    state._fsp--;

                     
                            current = this_GREATER_THAN_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2230:5: this_LESSER_THAN_2= ruleLESSER_THAN
                    {
                     
                            newCompositeNode(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getLESSER_THANParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLESSER_THAN_in_ruleBOOLEAN_EXPRESSION5374);
                    this_LESSER_THAN_2=ruleLESSER_THAN();

                    state._fsp--;

                     
                            current = this_LESSER_THAN_2; 
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
    // $ANTLR end "ruleBOOLEAN_EXPRESSION"


    // $ANTLR start "entryRuleEQUALS"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2246:1: entryRuleEQUALS returns [EObject current=null] : iv_ruleEQUALS= ruleEQUALS EOF ;
    public final EObject entryRuleEQUALS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEQUALS = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2247:2: (iv_ruleEQUALS= ruleEQUALS EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2248:2: iv_ruleEQUALS= ruleEQUALS EOF
            {
             newCompositeNode(grammarAccess.getEQUALSRule()); 
            pushFollow(FOLLOW_ruleEQUALS_in_entryRuleEQUALS5409);
            iv_ruleEQUALS=ruleEQUALS();

            state._fsp--;

             current =iv_ruleEQUALS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEQUALS5419); 

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
    // $ANTLR end "entryRuleEQUALS"


    // $ANTLR start "ruleEQUALS"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2255:1: ruleEQUALS returns [EObject current=null] : ( ( (lv_op1_0_0= ruleEXPRESSION ) ) otherlv_1= '=' ( (lv_op2_2_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleEQUALS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op1_0_0 = null;

        EObject lv_op2_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2258:28: ( ( ( (lv_op1_0_0= ruleEXPRESSION ) ) otherlv_1= '=' ( (lv_op2_2_0= ruleEXPRESSION ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2259:1: ( ( (lv_op1_0_0= ruleEXPRESSION ) ) otherlv_1= '=' ( (lv_op2_2_0= ruleEXPRESSION ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2259:1: ( ( (lv_op1_0_0= ruleEXPRESSION ) ) otherlv_1= '=' ( (lv_op2_2_0= ruleEXPRESSION ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2259:2: ( (lv_op1_0_0= ruleEXPRESSION ) ) otherlv_1= '=' ( (lv_op2_2_0= ruleEXPRESSION ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2259:2: ( (lv_op1_0_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2260:1: (lv_op1_0_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2260:1: (lv_op1_0_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2261:3: lv_op1_0_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getEQUALSAccess().getOp1EXPRESSIONParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleEQUALS5465);
            lv_op1_0_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEQUALSRule());
            	        }
                   		set(
                   			current, 
                   			"op1",
                    		lv_op1_0_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleEQUALS5477); 

                	newLeafNode(otherlv_1, grammarAccess.getEQUALSAccess().getEqualsSignKeyword_1());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2281:1: ( (lv_op2_2_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2282:1: (lv_op2_2_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2282:1: (lv_op2_2_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2283:3: lv_op2_2_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getEQUALSAccess().getOp2EXPRESSIONParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleEQUALS5498);
            lv_op2_2_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEQUALSRule());
            	        }
                   		set(
                   			current, 
                   			"op2",
                    		lv_op2_2_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleEQUALS"


    // $ANTLR start "entryRuleGREATER_THAN"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2307:1: entryRuleGREATER_THAN returns [EObject current=null] : iv_ruleGREATER_THAN= ruleGREATER_THAN EOF ;
    public final EObject entryRuleGREATER_THAN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGREATER_THAN = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2308:2: (iv_ruleGREATER_THAN= ruleGREATER_THAN EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2309:2: iv_ruleGREATER_THAN= ruleGREATER_THAN EOF
            {
             newCompositeNode(grammarAccess.getGREATER_THANRule()); 
            pushFollow(FOLLOW_ruleGREATER_THAN_in_entryRuleGREATER_THAN5534);
            iv_ruleGREATER_THAN=ruleGREATER_THAN();

            state._fsp--;

             current =iv_ruleGREATER_THAN; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGREATER_THAN5544); 

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
    // $ANTLR end "entryRuleGREATER_THAN"


    // $ANTLR start "ruleGREATER_THAN"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2316:1: ruleGREATER_THAN returns [EObject current=null] : ( ( (lv_op1_0_0= ruleEXPRESSION ) ) otherlv_1= '>' ( (lv_op2_2_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleGREATER_THAN() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op1_0_0 = null;

        EObject lv_op2_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2319:28: ( ( ( (lv_op1_0_0= ruleEXPRESSION ) ) otherlv_1= '>' ( (lv_op2_2_0= ruleEXPRESSION ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2320:1: ( ( (lv_op1_0_0= ruleEXPRESSION ) ) otherlv_1= '>' ( (lv_op2_2_0= ruleEXPRESSION ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2320:1: ( ( (lv_op1_0_0= ruleEXPRESSION ) ) otherlv_1= '>' ( (lv_op2_2_0= ruleEXPRESSION ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2320:2: ( (lv_op1_0_0= ruleEXPRESSION ) ) otherlv_1= '>' ( (lv_op2_2_0= ruleEXPRESSION ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2320:2: ( (lv_op1_0_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2321:1: (lv_op1_0_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2321:1: (lv_op1_0_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2322:3: lv_op1_0_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getGREATER_THANAccess().getOp1EXPRESSIONParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleGREATER_THAN5590);
            lv_op1_0_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGREATER_THANRule());
            	        }
                   		set(
                   			current, 
                   			"op1",
                    		lv_op1_0_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleGREATER_THAN5602); 

                	newLeafNode(otherlv_1, grammarAccess.getGREATER_THANAccess().getGreaterThanSignKeyword_1());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2342:1: ( (lv_op2_2_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2343:1: (lv_op2_2_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2343:1: (lv_op2_2_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2344:3: lv_op2_2_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getGREATER_THANAccess().getOp2EXPRESSIONParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleGREATER_THAN5623);
            lv_op2_2_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGREATER_THANRule());
            	        }
                   		set(
                   			current, 
                   			"op2",
                    		lv_op2_2_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleGREATER_THAN"


    // $ANTLR start "entryRuleLESSER_THAN"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2368:1: entryRuleLESSER_THAN returns [EObject current=null] : iv_ruleLESSER_THAN= ruleLESSER_THAN EOF ;
    public final EObject entryRuleLESSER_THAN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLESSER_THAN = null;


        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2369:2: (iv_ruleLESSER_THAN= ruleLESSER_THAN EOF )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2370:2: iv_ruleLESSER_THAN= ruleLESSER_THAN EOF
            {
             newCompositeNode(grammarAccess.getLESSER_THANRule()); 
            pushFollow(FOLLOW_ruleLESSER_THAN_in_entryRuleLESSER_THAN5659);
            iv_ruleLESSER_THAN=ruleLESSER_THAN();

            state._fsp--;

             current =iv_ruleLESSER_THAN; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLESSER_THAN5669); 

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
    // $ANTLR end "entryRuleLESSER_THAN"


    // $ANTLR start "ruleLESSER_THAN"
    // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2377:1: ruleLESSER_THAN returns [EObject current=null] : ( ( (lv_op1_0_0= ruleEXPRESSION ) ) otherlv_1= '<' ( (lv_op2_2_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleLESSER_THAN() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op1_0_0 = null;

        EObject lv_op2_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2380:28: ( ( ( (lv_op1_0_0= ruleEXPRESSION ) ) otherlv_1= '<' ( (lv_op2_2_0= ruleEXPRESSION ) ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2381:1: ( ( (lv_op1_0_0= ruleEXPRESSION ) ) otherlv_1= '<' ( (lv_op2_2_0= ruleEXPRESSION ) ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2381:1: ( ( (lv_op1_0_0= ruleEXPRESSION ) ) otherlv_1= '<' ( (lv_op2_2_0= ruleEXPRESSION ) ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2381:2: ( (lv_op1_0_0= ruleEXPRESSION ) ) otherlv_1= '<' ( (lv_op2_2_0= ruleEXPRESSION ) )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2381:2: ( (lv_op1_0_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2382:1: (lv_op1_0_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2382:1: (lv_op1_0_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2383:3: lv_op1_0_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getLESSER_THANAccess().getOp1EXPRESSIONParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleLESSER_THAN5715);
            lv_op1_0_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLESSER_THANRule());
            	        }
                   		set(
                   			current, 
                   			"op1",
                    		lv_op1_0_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleLESSER_THAN5727); 

                	newLeafNode(otherlv_1, grammarAccess.getLESSER_THANAccess().getLessThanSignKeyword_1());
                
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2403:1: ( (lv_op2_2_0= ruleEXPRESSION ) )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2404:1: (lv_op2_2_0= ruleEXPRESSION )
            {
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2404:1: (lv_op2_2_0= ruleEXPRESSION )
            // ../org.inria.diverse.logo.dsl/src-gen/org/inria/diverse/logo/dsl/parser/antlr/internal/InternalLogoDSL.g:2405:3: lv_op2_2_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getLESSER_THANAccess().getOp2EXPRESSIONParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleLESSER_THAN5748);
            lv_op2_2_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLESSER_THANRule());
            	        }
                   		set(
                   			current, 
                   			"op2",
                    		lv_op2_2_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleLESSER_THAN"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLogoProgram_in_entryRuleLogoProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogoProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSENTENCE_in_ruleLogoProgram130 = new BitSet(new long[]{0x02555BC4001FF022L});
    public static final BitSet FOLLOW_ruleSENTENCE_in_entryRuleSENTENCE166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSENTENCE176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMAKE_in_ruleSENTENCE223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCONTENT_in_ruleSENTENCE250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePROCEDURE_CALL_in_ruleSENTENCE277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATION_in_ruleSENTENCE304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCONTROL_SENTENCES_in_ruleSENTENCE331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMOVE_in_ruleSENTENCE358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDRAWING_SENTENCE_in_ruleSENTENCE385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMOVE_in_entryRuleMOVE420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMOVE430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFORWARD_in_ruleMOVE477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLEFT_in_ruleMOVE504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRIGHT_in_ruleMOVE531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSET_X_in_ruleMOVE558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSET_Y_in_ruleMOVE585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFORWARD_in_entryRuleFORWARD620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFORWARD630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleFORWARD667 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleFORWARD688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLEFT_in_entryRuleLEFT724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLEFT734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleLEFT771 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleLEFT792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRIGHT_in_entryRuleRIGHT828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRIGHT838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleRIGHT875 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleRIGHT896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSET_X_in_entryRuleSET_X932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSET_X942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSET_X979 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleSET_X1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSET_Y_in_entryRuleSET_Y1036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSET_Y1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSET_Y1083 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleSET_Y1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDRAWING_SENTENCE_in_entryRuleDRAWING_SENTENCE1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDRAWING_SENTENCE1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENDOWN_in_ruleDRAWING_SENTENCE1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENUP_in_ruleDRAWING_SENTENCE1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLEAR_in_ruleDRAWING_SENTENCE1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHOME_in_ruleDRAWING_SENTENCE1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOREABLE_in_ruleDRAWING_SENTENCE1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFONT_SPEC_in_ruleDRAWING_SENTENCE1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDRAW_STRING_in_ruleDRAWING_SENTENCE1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENDOWN_in_entryRulePENDOWN1394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePENDOWN1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePENDOWN1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENUP_in_entryRulePENUP1486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePENUP1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePENUP1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOREABLE_in_entryRuleCOLOREABLE1578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOLOREABLE1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENCOLOR_in_ruleCOLOREABLE1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCANVAS_COLOR_in_ruleCOLOREABLE1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENCOLOR_in_entryRulePENCOLOR1697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePENCOLOR1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePENCOLOR1744 = new BitSet(new long[]{0x00000003FFE00060L});
    public static final BitSet FOLLOW_ruleCOLOR_in_rulePENCOLOR1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOR_SPEC_in_rulePENCOLOR1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCANVAS_COLOR_in_entryRuleCANVAS_COLOR1830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCANVAS_COLOR1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCANVAS_COLOR1877 = new BitSet(new long[]{0x00000003FFE00060L});
    public static final BitSet FOLLOW_ruleCOLOR_in_ruleCANVAS_COLOR1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOR_SPEC_in_ruleCANVAS_COLOR1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOR_SPEC_in_entryRuleCOLOR_SPEC1963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOLOR_SPEC1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleCOLOR_SPEC2019 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleCOLOR_SPEC2040 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleCOLOR_SPEC2061 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleCOLOR_SPEC2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOR_in_entryRuleCOLOR2119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOLOR2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCOLOR2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCOLOR2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCOLOR2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCOLOR2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCOLOR2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCOLOR2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCOLOR2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCOLOR2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCOLOR2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCOLOR2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCOLOR2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCOLOR2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCOLOR2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFONT_SPEC_in_entryRuleFONT_SPEC2436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFONT_SPEC2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFONT_STYLE_in_ruleFONT_SPEC2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFONT_STYLE_in_entryRuleFONT_STYLE2526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFONT_STYLE2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFONT_STYLE2573 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_ruleFontStyleValues_in_ruleFONT_STYLE2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontStyleValues_in_entryRuleFontStyleValues2630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFontStyleValues2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFontStyleValues2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFontStyleValues2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFontStyleValues2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLEAR_in_entryRuleCLEAR2782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLEAR2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCLEAR2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHOME_in_entryRuleHOME2874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHOME2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleHOME2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDRAW_STRING_in_entryRuleDRAW_STRING2966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDRAW_STRING2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDRAW_STRING3013 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDRAW_STRING3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMAKE_in_entryRuleMAKE3073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMAKE3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleMAKE3120 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMAKE3137 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleMAKE3154 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleMAKE3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_REF_in_entryRuleVARIABLE_REF3211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVARIABLE_REF3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVARIABLE_REF3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_entryRuleEXPRESSION3300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRESSION3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_REF_in_ruleEXPRESSION3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVALUE_in_ruleEXPRESSION3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVALUE_in_entryRuleVALUE3419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVALUE3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleVALUE3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCONTENT_in_entryRuleCONTENT3510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCONTENT3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCONTENT3557 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCONTENT3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATION_in_entryRuleOPERATION3613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOPERATION3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSUM_in_ruleOPERATION3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSUBTRACT_in_ruleOPERATION3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLY_in_ruleOPERATION3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDIVIDE_in_ruleOPERATION3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSUM_in_entryRuleSUM3786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSUM3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSUM3833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSUM3853 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSUM3865 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleSUM3886 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleSUM3898 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleSUM3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSUBTRACT_in_entryRuleSUBTRACT3955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSUBTRACT3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSUBTRACT4002 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSUBTRACT4022 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSUBTRACT4034 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleSUBTRACT4055 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleSUBTRACT4067 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleSUBTRACT4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLY_in_entryRuleMULTIPLY4124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMULTIPLY4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleMULTIPLY4171 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMULTIPLY4191 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleMULTIPLY4203 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleMULTIPLY4224 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleMULTIPLY4236 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleMULTIPLY4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDIVIDE_in_entryRuleDIVIDE4293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDIVIDE4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDIVIDE4340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDIVIDE4360 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleDIVIDE4372 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleDIVIDE4393 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleDIVIDE4405 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleDIVIDE4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCONTROL_SENTENCES_in_entryRuleCONTROL_SENTENCES4462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCONTROL_SENTENCES4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREPEAT_in_ruleCONTROL_SENTENCES4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTO_in_ruleCONTROL_SENTENCES4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIF_SENTENCE_in_ruleCONTROL_SENTENCES4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREPEAT_in_entryRuleREPEAT4608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREPEAT4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleREPEAT4655 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleREPEAT4676 = new BitSet(new long[]{0x02755BC4001FF020L});
    public static final BitSet FOLLOW_ruleSENTENCE_in_ruleREPEAT4697 = new BitSet(new long[]{0x02755BC4001FF020L});
    public static final BitSet FOLLOW_53_in_ruleREPEAT4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTO_in_entryRuleTO4746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTO4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTO4793 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTO4810 = new BitSet(new long[]{0x03D55BC4001FF020L});
    public static final BitSet FOLLOW_rulePARAM_in_ruleTO4836 = new BitSet(new long[]{0x03D55BC4001FF020L});
    public static final BitSet FOLLOW_ruleSENTENCE_in_ruleTO4858 = new BitSet(new long[]{0x02D55BC4001FF020L});
    public static final BitSet FOLLOW_55_in_ruleTO4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePARAM_in_entryRulePARAM4907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePARAM4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePARAM4954 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePARAM4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePROCEDURE_CALL_in_entryRulePROCEDURE_CALL5012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePROCEDURE_CALL5022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePROCEDURE_CALL5067 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rulePROCEDURE_CALL5088 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_ruleIF_SENTENCE_in_entryRuleIF_SENTENCE5125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIF_SENTENCE5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleIF_SENTENCE5172 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleBOOLEAN_EXPRESSION_in_ruleIF_SENTENCE5193 = new BitSet(new long[]{0x06555BC4001FF020L});
    public static final BitSet FOLLOW_ruleSENTENCE_in_ruleIF_SENTENCE5214 = new BitSet(new long[]{0x06555BC4001FF020L});
    public static final BitSet FOLLOW_58_in_ruleIF_SENTENCE5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_EXPRESSION_in_entryRuleBOOLEAN_EXPRESSION5263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN_EXPRESSION5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQUALS_in_ruleBOOLEAN_EXPRESSION5320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGREATER_THAN_in_ruleBOOLEAN_EXPRESSION5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLESSER_THAN_in_ruleBOOLEAN_EXPRESSION5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQUALS_in_entryRuleEQUALS5409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEQUALS5419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleEQUALS5465 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleEQUALS5477 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleEQUALS5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGREATER_THAN_in_entryRuleGREATER_THAN5534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGREATER_THAN5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleGREATER_THAN5590 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleGREATER_THAN5602 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleGREATER_THAN5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLESSER_THAN_in_entryRuleLESSER_THAN5659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLESSER_THAN5669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleLESSER_THAN5715 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleLESSER_THAN5727 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleLESSER_THAN5748 = new BitSet(new long[]{0x0000000000000002L});

}