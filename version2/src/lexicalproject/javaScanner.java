/* The following code was generated by JFlex 1.4.3 on 11/25/21 2:54 PM */

    //=>Definitions
    package lexicalproject;
    import static lexicalproject.JavaTokens.*;
    import java.util.Hashtable;
    import java.util.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/25/21 2:54 PM from the specification file
 * <tt>C:/Users/Adnan.DESKTOP-DBG87M9/Documents/NetBeansProjects/LexicalProject/src/lexicalproject/Lexical.flex</tt>
 */
class javaScanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\6\1\10\1\0\1\6\1\11\22\0\1\7\1\30\1\1"+
    "\1\0\1\40\1\30\1\33\1\2\1\12\1\13\1\36\1\35\1\21"+
    "\1\32\1\22\1\37\1\52\1\57\2\65\4\53\2\4\1\24\1\20"+
    "\1\27\1\25\1\26\1\31\1\23\1\55\1\56\1\55\1\62\1\61"+
    "\1\62\5\41\1\60\6\41\1\104\4\41\1\54\2\41\1\16\1\5"+
    "\1\17\1\30\1\40\1\0\1\47\1\64\1\66\1\73\1\45\1\46"+
    "\1\76\1\72\1\70\1\41\1\75\1\50\1\102\1\63\1\67\1\74"+
    "\1\41\1\43\1\51\1\42\1\44\1\101\1\71\1\103\1\77\1\100"+
    "\1\14\1\34\1\15\1\31\1\0\u0329\3\1\3\u1c7c\3\1\105\u7fd9\3"+
    "\u5fff\0\1\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\3\1\1\2\1\1\2\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\2\14\12\15\10\16"+
    "\1\2\14\16\1\1\1\0\1\17\3\0\1\20\1\0"+
    "\1\20\1\2\3\0\1\3\22\16\1\0\1\2\2\0"+
    "\13\16\1\21\4\16\1\21\7\16\1\22\1\17\1\0"+
    "\1\23\2\0\1\20\3\0\24\16\2\2\7\16\1\21"+
    "\16\16\2\0\1\24\11\16\1\25\15\16\2\0\1\16"+
    "\1\21\1\16\1\21\14\16\1\26\1\27\12\16\1\26"+
    "\7\16\1\26\5\16";

  private static int [] zzUnpackAction() {
    int [] result = new int[233];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\106\0\214\0\322\0\u0118\0\u015e\0\106\0\u01a4"+
    "\0\106\0\106\0\106\0\106\0\106\0\106\0\106\0\106"+
    "\0\u01ea\0\106\0\u0230\0\u0276\0\u02bc\0\u0302\0\106\0\u0348"+
    "\0\u038e\0\u03d4\0\u041a\0\u0460\0\u04a6\0\u04ec\0\u0532\0\u0578"+
    "\0\u05be\0\u0604\0\u064a\0\u0690\0\u06d6\0\u071c\0\u0762\0\u07a8"+
    "\0\u07ee\0\u0834\0\u087a\0\u08c0\0\u0906\0\u094c\0\u0992\0\u09d8"+
    "\0\u0a1e\0\u0a64\0\u0aaa\0\u0af0\0\u0b36\0\u0b7c\0\u0bc2\0\u0c08"+
    "\0\u0c4e\0\106\0\106\0\u0c94\0\u0cda\0\u0d20\0\u0d66\0\u0dac"+
    "\0\u0df2\0\u0e38\0\u0e7e\0\u0ec4\0\u0f0a\0\u0f50\0\u0f96\0\u0fdc"+
    "\0\u1022\0\u1068\0\u10ae\0\u10f4\0\u113a\0\u1180\0\u11c6\0\u120c"+
    "\0\u1252\0\u1298\0\u12de\0\u1324\0\u136a\0\u13b0\0\u13f6\0\u143c"+
    "\0\u1482\0\u14c8\0\u150e\0\u1554\0\u159a\0\u15e0\0\u1626\0\u166c"+
    "\0\u04a6\0\u16b2\0\u16f8\0\u173e\0\u1784\0\u17ca\0\u1810\0\u1856"+
    "\0\u189c\0\u18e2\0\u1928\0\u196e\0\u19b4\0\106\0\106\0\u19fa"+
    "\0\106\0\u1a40\0\u1a86\0\u1acc\0\u1b12\0\u1b58\0\u1b9e\0\u1be4"+
    "\0\u1c2a\0\u1c70\0\u1cb6\0\u1cfc\0\u1d42\0\u1d88\0\u1dce\0\u1e14"+
    "\0\u1e5a\0\u1ea0\0\u1ee6\0\u1f2c\0\u1f72\0\u1fb8\0\u1ffe\0\u2044"+
    "\0\u208a\0\u20d0\0\u2116\0\u215c\0\u21a2\0\u21e8\0\u222e\0\u2274"+
    "\0\u22ba\0\u2300\0\u2346\0\u238c\0\u23d2\0\u2418\0\u245e\0\u24a4"+
    "\0\u24ea\0\u2530\0\u2576\0\u25bc\0\u2602\0\u2648\0\u268e\0\u26d4"+
    "\0\u271a\0\u2760\0\u27a6\0\u27ec\0\u2832\0\u04a6\0\u2878\0\u28be"+
    "\0\u2904\0\u294a\0\u2990\0\u29d6\0\u2a1c\0\u2a62\0\u2aa8\0\u04a6"+
    "\0\u2aee\0\u2b34\0\u2b7a\0\u2bc0\0\u2c06\0\u2c4c\0\u2c92\0\u2cd8"+
    "\0\u2d1e\0\u2d64\0\u2daa\0\u2df0\0\u2e36\0\u2e7c\0\u2ec2\0\u2f08"+
    "\0\u1cb6\0\u2f4e\0\u2f94\0\u2fda\0\u3020\0\u3066\0\u30ac\0\u30f2"+
    "\0\u3138\0\u317e\0\u31c4\0\u320a\0\u3250\0\u3296\0\u32dc\0\u3322"+
    "\0\106\0\u3368\0\u33ae\0\u33f4\0\u343a\0\u3480\0\u34c6\0\u350c"+
    "\0\u3552\0\u3598\0\u35de\0\u3624\0\u366a\0\u36b0\0\u36f6\0\u373c"+
    "\0\u3782\0\u37c8\0\u380e\0\106\0\u3854\0\u389a\0\u38e0\0\u3926"+
    "\0\u396c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[233];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\6\3\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\24\1\27"+
    "\1\30\1\31\1\32\1\33\1\24\1\34\2\35\1\36"+
    "\1\37\1\35\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\5\3\35\1\5\3\35\1\46\1\47\1\5\1\50"+
    "\1\51\1\52\1\53\1\35\1\54\1\55\1\35\1\56"+
    "\2\35\1\57\1\60\1\35\1\61\1\62\106\0\1\63"+
    "\1\64\3\63\1\65\2\63\2\0\74\63\2\66\1\0"+
    "\2\66\1\67\2\66\2\0\74\66\4\0\1\5\15\0"+
    "\1\70\22\0\1\71\1\72\1\0\1\73\1\0\2\5"+
    "\3\0\1\5\1\73\1\71\1\72\2\0\1\5\5\0"+
    "\1\72\56\0\1\74\51\0\1\7\101\0\1\70\15\0"+
    "\1\75\27\0\2\70\3\0\1\70\5\0\1\70\44\0"+
    "\1\22\1\27\105\0\1\27\105\0\2\27\104\0\1\27"+
    "\1\0\1\27\103\0\2\27\3\0\1\27\100\0\1\27"+
    "\5\0\1\27\77\0\1\27\6\0\1\27\76\0\1\27"+
    "\7\0\1\27\75\0\1\27\10\0\1\76\1\77\52\0"+
    "\1\35\33\0\45\35\5\0\1\35\33\0\3\35\1\100"+
    "\26\35\1\101\12\35\5\0\1\35\33\0\5\35\1\102"+
    "\37\35\5\0\1\35\33\0\10\35\1\103\12\35\1\104"+
    "\17\35\1\105\1\35\5\0\1\35\33\0\7\35\1\106"+
    "\1\107\16\35\1\110\1\111\14\35\5\0\1\35\33\0"+
    "\11\35\1\112\12\35\1\113\20\35\5\0\1\35\33\0"+
    "\27\35\1\114\15\35\5\0\1\35\33\0\2\35\1\115"+
    "\1\35\1\116\24\35\1\117\1\120\4\35\1\121\5\35"+
    "\5\0\1\122\15\0\1\70\22\0\1\71\1\72\1\0"+
    "\1\73\1\0\2\123\1\124\1\0\1\125\1\123\1\73"+
    "\1\71\1\72\1\0\1\125\1\123\5\0\1\72\7\0"+
    "\1\124\6\0\1\35\33\0\4\35\1\126\1\127\1\35"+
    "\1\130\35\35\5\0\1\35\33\0\3\35\1\131\23\35"+
    "\1\132\7\35\1\133\5\35\5\0\1\35\33\0\7\35"+
    "\1\134\1\135\16\35\1\136\2\35\1\137\12\35\5\0"+
    "\1\35\33\0\4\35\1\140\40\35\5\0\1\35\33\0"+
    "\6\35\1\141\14\35\1\142\16\35\1\143\2\35\5\0"+
    "\1\35\33\0\32\35\1\144\12\35\5\0\1\35\33\0"+
    "\5\35\1\145\21\35\1\146\15\35\5\0\1\35\33\0"+
    "\3\35\1\147\1\150\2\35\1\151\35\35\5\0\1\35"+
    "\33\0\27\35\1\152\15\35\5\0\1\35\33\0\27\35"+
    "\1\153\15\35\5\0\1\35\33\0\7\35\1\154\35\35"+
    "\5\0\1\35\33\0\2\35\1\155\42\35\34\0\1\156"+
    "\52\0\1\63\1\157\3\63\1\65\2\63\2\0\74\63"+
    "\1\0\1\160\105\0\2\63\2\0\1\63\34\0\2\63"+
    "\2\0\1\63\3\0\2\63\3\0\1\63\3\0\3\63"+
    "\22\0\1\161\104\0\2\66\2\0\1\66\34\0\2\66"+
    "\2\0\1\66\3\0\1\162\1\163\3\0\1\162\3\0"+
    "\2\66\1\162\24\0\1\70\40\0\1\71\1\72\3\0"+
    "\2\70\3\0\1\70\1\0\1\71\1\72\2\0\1\70"+
    "\5\0\1\72\16\0\1\164\25\0\1\165\2\0\1\165"+
    "\14\0\2\164\3\0\1\164\5\0\1\164\23\0\2\166"+
    "\2\0\1\166\31\0\45\166\22\0\1\22\63\0\36\76"+
    "\1\167\47\76\10\77\2\0\74\77\4\0\1\35\33\0"+
    "\4\35\1\170\2\35\1\171\27\35\1\141\5\35\5\0"+
    "\1\35\33\0\3\35\1\172\24\35\1\173\14\35\5\0"+
    "\1\35\33\0\2\35\1\174\42\35\5\0\1\35\33\0"+
    "\11\35\1\175\33\35\5\0\1\35\33\0\4\35\1\176"+
    "\40\35\5\0\1\35\33\0\2\35\1\177\42\35\5\0"+
    "\1\35\33\0\10\35\1\200\34\35\5\0\1\35\33\0"+
    "\27\35\1\201\15\35\5\0\1\35\33\0\3\35\1\141"+
    "\41\35\5\0\1\35\33\0\23\35\1\202\21\35\5\0"+
    "\1\35\33\0\11\35\1\203\33\35\5\0\1\35\33\0"+
    "\11\35\1\204\33\35\5\0\1\35\33\0\23\35\1\205"+
    "\21\35\5\0\1\35\33\0\3\35\1\206\3\35\1\207"+
    "\35\35\5\0\1\35\33\0\34\35\1\210\10\35\5\0"+
    "\1\35\33\0\30\35\1\211\14\35\5\0\1\35\33\0"+
    "\27\35\1\212\15\35\5\0\1\35\33\0\23\35\1\213"+
    "\21\35\5\0\1\122\15\0\1\70\22\0\1\71\1\72"+
    "\3\0\2\122\3\0\1\122\1\0\1\71\1\72\2\0"+
    "\1\122\5\0\1\72\16\0\1\122\15\0\1\70\22\0"+
    "\1\71\1\72\1\0\1\73\1\0\2\123\3\0\1\123"+
    "\1\73\1\71\1\72\2\0\1\123\5\0\1\72\16\0"+
    "\1\214\40\0\3\214\2\0\2\214\1\0\3\214\1\0"+
    "\2\214\1\0\3\214\4\0\1\214\64\0\1\215\4\0"+
    "\1\215\32\0\1\35\33\0\10\35\1\216\34\35\5\0"+
    "\1\35\33\0\31\35\1\141\13\35\5\0\1\35\33\0"+
    "\2\35\1\217\42\35\5\0\1\35\33\0\5\35\1\220"+
    "\37\35\5\0\1\35\33\0\27\35\1\221\15\35\5\0"+
    "\1\35\33\0\2\35\1\175\42\35\5\0\1\35\33\0"+
    "\2\35\1\222\6\35\1\175\33\35\5\0\1\35\33\0"+
    "\7\35\1\223\35\35\5\0\1\35\33\0\23\35\1\224"+
    "\21\35\5\0\1\35\33\0\7\35\1\110\35\35\5\0"+
    "\1\35\33\0\2\35\1\141\42\35\5\0\1\35\33\0"+
    "\2\35\1\225\6\35\1\226\33\35\5\0\1\35\33\0"+
    "\34\35\1\227\10\35\5\0\1\35\33\0\30\35\1\230"+
    "\14\35\5\0\1\35\33\0\6\35\1\231\36\35\5\0"+
    "\1\35\33\0\4\35\1\232\40\35\5\0\1\35\33\0"+
    "\27\35\1\233\1\234\14\35\5\0\1\35\33\0\24\35"+
    "\1\235\20\35\5\0\1\35\33\0\26\35\1\236\16\35"+
    "\5\0\1\35\33\0\2\35\1\237\42\35\5\0\1\35"+
    "\33\0\10\35\1\240\17\35\1\241\14\35\5\0\1\35"+
    "\33\0\30\35\1\242\14\35\5\0\1\35\33\0\3\35"+
    "\1\243\41\35\1\0\1\160\1\244\104\160\2\0\1\161"+
    "\47\0\2\163\3\0\1\163\5\0\1\163\22\0\1\161"+
    "\47\0\2\66\3\0\1\66\5\0\1\66\24\0\1\164"+
    "\41\0\1\72\3\0\2\164\3\0\1\164\2\0\1\72"+
    "\2\0\1\164\5\0\1\72\16\0\1\164\45\0\2\164"+
    "\3\0\1\164\5\0\1\164\23\0\2\245\2\0\1\245"+
    "\31\0\45\245\36\76\1\167\1\7\46\76\4\0\1\35"+
    "\33\0\5\35\1\246\37\35\5\0\1\35\33\0\23\35"+
    "\1\247\21\35\5\0\1\35\33\0\27\35\1\250\15\35"+
    "\5\0\1\35\33\0\11\35\1\141\33\35\5\0\1\35"+
    "\33\0\4\35\1\251\40\35\5\0\1\35\33\0\5\35"+
    "\1\141\37\35\5\0\1\35\33\0\42\35\1\141\2\35"+
    "\5\0\1\35\33\0\5\35\1\252\37\35\5\0\1\35"+
    "\33\0\11\35\1\170\33\35\5\0\1\35\33\0\7\35"+
    "\1\140\35\35\5\0\1\35\33\0\7\35\1\253\35\35"+
    "\5\0\1\35\33\0\5\35\1\212\37\35\5\0\1\35"+
    "\33\0\2\35\1\254\42\35\5\0\1\35\33\0\36\35"+
    "\1\141\6\35\5\0\1\35\33\0\30\35\1\255\14\35"+
    "\5\0\1\35\33\0\2\35\1\256\42\35\5\0\1\35"+
    "\33\0\5\35\1\110\37\35\5\0\1\35\33\0\2\35"+
    "\1\222\42\35\5\0\1\35\33\0\3\35\1\140\41\35"+
    "\5\0\1\35\33\0\26\35\1\257\16\35\5\0\1\214"+
    "\40\0\3\214\1\73\1\0\2\214\1\0\3\214\1\73"+
    "\2\214\1\0\3\214\4\0\1\214\62\0\1\73\1\0"+
    "\1\215\4\0\1\215\1\73\31\0\1\35\33\0\10\35"+
    "\1\260\34\35\5\0\1\35\33\0\30\35\1\261\14\35"+
    "\5\0\1\35\33\0\7\35\1\262\35\35\5\0\1\35"+
    "\33\0\10\35\1\263\34\35\5\0\1\35\33\0\26\35"+
    "\1\264\16\35\5\0\1\35\33\0\11\35\1\173\33\35"+
    "\5\0\1\35\33\0\2\35\1\265\6\35\1\140\33\35"+
    "\5\0\1\35\33\0\5\35\1\266\37\35\5\0\1\35"+
    "\33\0\2\35\1\267\42\35\5\0\1\35\33\0\10\35"+
    "\1\270\16\35\1\212\15\35\5\0\1\35\33\0\10\35"+
    "\1\175\34\35\5\0\1\35\33\0\7\35\1\271\35\35"+
    "\5\0\1\35\33\0\24\35\1\230\20\35\5\0\1\35"+
    "\33\0\2\35\1\272\42\35\5\0\1\35\33\0\41\35"+
    "\1\273\3\35\5\0\1\35\33\0\10\35\1\256\34\35"+
    "\5\0\1\35\33\0\35\35\1\274\7\35\5\0\1\35"+
    "\33\0\27\35\1\141\15\35\5\0\1\35\33\0\7\35"+
    "\1\275\35\35\5\0\1\35\33\0\33\35\1\141\11\35"+
    "\5\0\1\35\33\0\23\35\1\141\21\35\5\0\1\35"+
    "\33\0\30\35\1\114\14\35\1\0\1\160\1\276\104\160"+
    "\3\0\2\277\2\0\1\277\31\0\45\277\4\0\1\35"+
    "\33\0\11\35\1\300\33\35\5\0\1\35\33\0\31\35"+
    "\1\301\13\35\5\0\1\35\33\0\3\35\1\242\41\35"+
    "\5\0\1\35\33\0\23\35\1\302\21\35\5\0\1\35"+
    "\33\0\10\35\1\303\34\35\5\0\1\35\33\0\3\35"+
    "\1\304\41\35\5\0\1\35\33\0\26\35\1\305\16\35"+
    "\5\0\1\35\33\0\30\35\1\306\14\35\5\0\1\35"+
    "\33\0\32\35\1\307\12\35\5\0\1\35\33\0\41\35"+
    "\1\175\3\35\5\0\1\35\33\0\35\35\1\141\7\35"+
    "\5\0\1\35\33\0\5\35\1\310\37\35\5\0\1\35"+
    "\33\0\32\35\1\141\12\35\5\0\1\35\33\0\30\35"+
    "\1\311\14\35\5\0\1\35\33\0\3\35\1\312\41\35"+
    "\5\0\1\35\33\0\7\35\1\313\35\35\5\0\1\35"+
    "\33\0\5\35\1\314\37\35\5\0\1\35\33\0\4\35"+
    "\1\315\40\35\5\0\1\35\33\0\5\35\1\316\37\35"+
    "\5\0\1\35\33\0\7\35\1\133\35\35\5\0\1\35"+
    "\33\0\7\35\1\317\35\35\5\0\1\35\33\0\2\35"+
    "\1\144\42\35\1\0\1\160\1\320\104\160\3\0\2\321"+
    "\2\0\1\321\31\0\45\321\4\0\1\35\33\0\30\35"+
    "\1\322\14\35\5\0\1\35\33\0\33\35\1\173\11\35"+
    "\5\0\1\35\33\0\10\35\1\323\34\35\5\0\1\35"+
    "\33\0\7\35\1\324\35\35\5\0\1\35\33\0\2\35"+
    "\1\325\42\35\5\0\1\35\33\0\26\35\1\141\16\35"+
    "\5\0\1\35\33\0\3\35\1\326\41\35\5\0\1\35"+
    "\33\0\7\35\1\242\35\35\5\0\1\35\33\0\23\35"+
    "\1\327\21\35\5\0\1\35\33\0\6\35\1\330\36\35"+
    "\5\0\1\35\33\0\23\35\1\331\21\35\5\0\1\35"+
    "\33\0\42\35\1\332\2\35\5\0\1\35\33\0\10\35"+
    "\1\140\34\35\5\0\1\35\33\0\26\35\1\333\16\35"+
    "\5\0\1\35\33\0\36\35\1\175\6\35\2\0\1\334"+
    "\110\0\1\35\33\0\5\35\1\335\37\35\5\0\1\35"+
    "\33\0\37\35\1\141\5\35\5\0\1\35\33\0\26\35"+
    "\1\140\16\35\5\0\1\35\33\0\6\35\1\336\36\35"+
    "\5\0\1\35\33\0\27\35\1\337\15\35\5\0\1\35"+
    "\33\0\4\35\1\175\40\35\5\0\1\35\33\0\7\35"+
    "\1\340\35\35\5\0\1\35\33\0\26\35\1\341\16\35"+
    "\5\0\1\35\33\0\5\35\1\342\37\35\5\0\1\35"+
    "\33\0\2\35\1\343\42\35\2\0\1\344\110\0\1\35"+
    "\33\0\23\35\1\140\21\35\5\0\1\35\33\0\34\35"+
    "\1\141\10\35\5\0\1\35\33\0\23\35\1\345\21\35"+
    "\5\0\1\35\33\0\26\35\1\175\16\35\5\0\1\35"+
    "\33\0\5\35\1\346\37\35\5\0\1\35\33\0\23\35"+
    "\1\347\21\35\5\0\1\35\33\0\5\35\1\241\37\35"+
    "\5\0\1\35\33\0\30\35\1\350\14\35\5\0\1\35"+
    "\33\0\27\35\1\351\15\35\5\0\1\35\33\0\2\35"+
    "\1\173\42\35\5\0\1\35\33\0\40\35\1\343\4\35"+
    "\5\0\1\35\33\0\6\35\1\141\36\35\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[14770];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\1\1\10\11\1\1\1\11"+
    "\4\1\1\11\33\1\1\0\1\1\3\0\1\1\1\0"+
    "\2\11\3\0\23\1\1\0\1\1\2\0\30\1\2\11"+
    "\1\0\1\11\2\0\1\1\3\0\54\1\2\0\30\1"+
    "\2\0\21\1\1\11\22\1\1\11\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[233];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  javaScanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  javaScanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 184) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public JavaTokens nextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 18: 
          { return  new JavaTokens(TokenKind.AMPERSAND,"nothing","&");
          }
        case 24: break;
        case 16: 
          { return  new JavaTokens(TokenKind.FLOATLIT,"nothing",yytext() );
          }
        case 25: break;
        case 17: 
          { return  new JavaTokens(TokenKind.keyword,"",yytext());
          }
        case 26: break;
        case 6: 
          { return  new JavaTokens(TokenKind.LEFTCURLY,"nothing","{");
          }
        case 27: break;
        case 10: 
          { return  new JavaTokens(TokenKind.sym_Suma,"nothing",";");
          }
        case 28: break;
        case 20: 
          { return  new JavaTokens(TokenKind.BooleanLiteral,"",yytext());
          }
        case 29: break;
        case 14: 
          { return  new JavaTokens(TokenKind.IDENT,"nothing",yytext());
          }
        case 30: break;
        case 19: 
          { return  new JavaTokens(TokenKind.CHARLIT,"",yytext());
          }
        case 31: break;
        case 12: 
          { return  new JavaTokens(TokenKind.Separator,"",yytext());
          }
        case 32: break;
        case 7: 
          { return  new JavaTokens(TokenKind.RIGHTCURLY,"nothing","}");
          }
        case 33: break;
        case 15: 
          { return  new JavaTokens(TokenKind.STRINGLIT,"",yytext());
          }
        case 34: break;
        case 22: 
          { return new JavaTokens(TokenKind.TextBlock,"",yytext());
          }
        case 35: break;
        case 2: 
          { return  new JavaTokens(TokenKind.INTEGERLIT,"nothing",yytext());
          }
        case 36: break;
        case 13: 
          { return  new JavaTokens(TokenKind.Operator,"",yytext());
          }
        case 37: break;
        case 23: 
          { return  new JavaTokens(TokenKind.uniDigit,"",yytext());
          }
        case 38: break;
        case 21: 
          { return  new JavaTokens(TokenKind.NULLLIT,"nothing","null");
          }
        case 39: break;
        case 5: 
          { return  new JavaTokens(TokenKind.RIGHT,"nothing",")");
          }
        case 40: break;
        case 11: 
          { return  new JavaTokens(TokenKind.Comma,"nothing",",");
          }
        case 41: break;
        case 8: 
          { return  new JavaTokens(TokenKind.LEFTSQ,"nothing","[");
          }
        case 42: break;
        case 9: 
          { return  new JavaTokens(TokenKind.RIGHTSQ,"nothing","]");
          }
        case 43: break;
        case 1: 
          { return  new JavaTokens(TokenKind.Unknown);
          }
        case 44: break;
        case 3: 
          { 
          }
        case 45: break;
        case 4: 
          { return  new JavaTokens(TokenKind.LEFT,"nothing","(");
          }
        case 46: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              {
                return  new JavaTokens(TokenKind.EndFile);
              }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
