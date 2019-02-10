/* The following code was generated by JFlex 1.7.0-1 tweaked for IntelliJ platform */

/*
 Copyright 2019 Thomas Rosenau

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package de.thomasrosenau.diffplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static de.thomasrosenau.diffplugin.psi.DiffTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-1
 * from the specification file <tt>/Users/thomas/projects/intellij-diff-plugin/src/main/java/de/thomasrosenau/diffplugin/lexer/Diff.flex</tt>
 */
public class DiffLexer implements FlexLexer {

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
     0, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\12\0\1\4\2\5\1\1\22\0\1\11\1\20\10\0\1\13\1\15\1\3\1\12\2\0\12\2\2\0\1\17"+
    "\1\0\1\16\1\0\1\14\33\0\1\21\7\0\1\6\1\0\1\10\2\0\1\7\33\0\1\5\242\0\2\5\26"+
    "\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\13\1\1\0\3\3\4\0\1\3"+
    "\4\0\1\3\2\0\1\3\1\0\1\3\1\4\2\0"+
    "\2\5\2\6\3\0\1\3\2\7\1\0\2\10\3\11"+
    "\3\12\4\0\1\12\1\0\1\13\1\14\3\0\1\3"+
    "\3\0\1\3\3\15\3\0\3\16\1\17\3\0\1\20"+
    "\16\0\1\12\3\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[104];
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
    "\0\0\0\22\0\44\0\44\0\66\0\110\0\132\0\154"+
    "\0\176\0\220\0\242\0\264\0\306\0\330\0\352\0\66"+
    "\0\374\0\44\0\66\0\110\0\u010e\0\u0120\0\u0132\0\u0132"+
    "\0\u0144\0\u0156\0\u0168\0\u017a\0\u017a\0\u018c\0\u019e\0\u019e"+
    "\0\u01b0\0\u01b0\0\44\0\u01c2\0\u01d4\0\374\0\44\0\374"+
    "\0\44\0\u01e6\0\u01f8\0\u020a\0\u020a\0\374\0\44\0\u021c"+
    "\0\374\0\44\0\u022e\0\44\0\u01b0\0\u0240\0\44\0\66"+
    "\0\u0252\0\u0264\0\u0276\0\u0288\0\u020a\0\u029a\0\44\0\44"+
    "\0\u02ac\0\u02be\0\u02d0\0\u02be\0\u02e2\0\u02f4\0\u0306\0\u0306"+
    "\0\u0318\0\44\0\u02be\0\u032a\0\u033c\0\u034e\0\u0360\0\44"+
    "\0\u0306\0\44\0\u0372\0\u0384\0\u0396\0\44\0\u03a8\0\u03ba"+
    "\0\u03cc\0\u03de\0\u03f0\0\u0402\0\u0414\0\u0426\0\u0438\0\u044a"+
    "\0\u045c\0\u046e\0\u0480\0\u0492\0\u02be\0\u04a4\0\u04b6\0\u04c8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[104];
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
    "\1\3\1\4\2\3\1\4\15\3\1\5\1\4\1\6"+
    "\1\5\1\4\1\5\1\7\3\5\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\22\0\1\20\1\21"+
    "\2\20\1\22\1\23\15\20\1\21\1\24\1\25\1\22"+
    "\1\23\15\20\1\21\2\20\1\22\1\23\1\20\1\26"+
    "\12\20\1\27\1\21\2\27\1\22\1\30\4\27\1\31"+
    "\7\27\1\20\1\21\2\20\1\22\1\23\5\20\1\32"+
    "\7\20\1\21\2\20\1\22\1\23\6\20\1\33\5\20"+
    "\1\34\1\21\2\34\1\22\1\35\7\34\1\36\5\34"+
    "\1\21\2\34\1\22\1\35\14\34\1\27\1\21\2\27"+
    "\1\22\1\30\14\27\1\37\1\21\2\37\1\22\1\40"+
    "\14\37\1\41\1\21\2\41\1\22\1\42\14\41\4\0"+
    "\1\43\15\0\1\20\1\21\1\44\1\20\1\22\1\23"+
    "\15\20\1\21\2\20\1\22\1\23\2\20\1\45\11\20"+
    "\1\27\1\46\2\27\1\47\1\30\15\27\1\50\2\27"+
    "\1\51\1\30\4\27\1\52\7\27\1\20\1\21\2\20"+
    "\1\22\1\23\5\20\1\53\6\20\1\54\1\21\2\54"+
    "\1\22\1\55\14\54\1\34\1\56\2\34\1\57\1\35"+
    "\15\34\1\56\2\34\1\57\1\35\7\34\1\60\4\34"+
    "\1\37\1\61\2\37\1\62\1\40\14\37\1\41\1\63"+
    "\2\41\1\64\1\65\14\41\1\20\1\66\1\44\1\20"+
    "\1\67\1\70\15\20\1\21\2\20\1\22\1\23\2\20"+
    "\1\71\11\20\1\27\1\50\2\27\1\51\1\30\3\27"+
    "\1\72\10\27\1\20\1\21\2\20\1\22\1\23\3\20"+
    "\1\73\1\20\1\74\6\20\1\54\1\66\2\54\1\67"+
    "\1\75\14\54\1\34\1\56\2\34\1\57\1\35\3\34"+
    "\1\76\10\34\4\0\1\77\21\0\1\100\15\0\1\20"+
    "\1\21\2\20\1\22\1\23\3\20\1\101\10\20\1\102"+
    "\1\46\1\103\1\102\1\47\1\104\15\102\1\21\1\105"+
    "\1\102\1\22\1\104\14\102\1\20\1\21\2\20\1\22"+
    "\1\23\5\20\1\106\6\20\1\102\1\56\2\102\1\57"+
    "\1\104\14\102\1\107\1\21\2\107\1\22\1\110\14\107"+
    "\1\102\1\111\2\102\1\112\1\113\15\102\1\111\1\103"+
    "\1\114\1\112\1\113\15\102\1\111\1\105\1\115\1\112"+
    "\1\113\14\102\1\20\1\21\2\20\1\22\1\23\5\20"+
    "\1\116\6\20\1\107\1\117\2\107\1\120\1\121\14\107"+
    "\4\0\1\122\15\0\1\102\1\111\1\123\1\102\1\112"+
    "\1\113\15\102\1\111\1\124\1\102\1\112\1\113\14\102"+
    "\1\20\1\21\2\20\1\22\1\23\5\20\1\125\6\20"+
    "\4\0\1\126\15\0\1\102\1\111\1\123\1\102\1\112"+
    "\1\113\3\102\1\127\11\102\1\111\1\124\1\102\1\112"+
    "\1\113\3\102\1\130\10\102\1\20\1\21\2\20\1\22"+
    "\1\23\5\20\1\131\6\20\1\102\1\111\2\102\1\112"+
    "\1\113\4\102\1\132\10\102\1\111\2\102\1\112\1\113"+
    "\5\102\1\133\6\102\1\20\1\21\2\20\1\22\1\23"+
    "\5\20\1\134\6\20\1\102\1\111\2\102\1\112\1\113"+
    "\4\102\1\135\10\102\1\111\2\102\1\112\1\113\5\102"+
    "\1\136\6\102\1\20\1\21\2\20\1\22\1\23\5\20"+
    "\1\137\6\20\1\102\1\111\2\102\1\112\1\113\4\102"+
    "\1\140\10\102\1\111\2\102\1\112\1\113\5\102\1\141"+
    "\6\102\1\20\1\21\2\20\1\22\1\23\5\20\1\142"+
    "\6\20\1\102\1\111\2\102\1\112\1\113\4\102\1\143"+
    "\10\102\1\111\2\102\1\112\1\113\5\102\1\143\6\102"+
    "\1\20\1\21\2\20\1\22\1\23\5\20\1\144\6\20"+
    "\1\102\1\66\2\102\1\67\1\145\14\102\1\20\1\21"+
    "\2\20\1\22\1\23\5\20\1\146\7\20\1\21\2\20"+
    "\1\22\1\23\5\20\1\147\7\20\1\21\2\20\1\22"+
    "\1\23\5\20\1\150\7\20\1\50\2\20\1\51\1\23"+
    "\14\20";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1242];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\13\1\1\0\1\1\1\11\1\1\4\0"+
    "\1\1\4\0\1\1\2\0\1\1\1\0\1\1\1\11"+
    "\2\0\1\1\1\11\1\1\1\11\3\0\2\1\1\11"+
    "\1\0\1\1\1\11\1\1\1\11\2\1\1\11\1\1"+
    "\4\0\1\1\1\0\2\11\3\0\1\1\3\0\2\1"+
    "\1\11\1\1\3\0\1\1\1\11\1\1\1\11\3\0"+
    "\1\11\16\0\1\1\3\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[104];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

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
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public DiffLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBuffer.charAt(zzStartRead+pos);
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
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      if (zzMarkedPosL > zzStartRead) {
        switch (zzBufferL.charAt(zzMarkedPosL-1)) {
        case '\n':
        case '\u000B':  // fall though
        case '\u000C':  // fall though
        case '\u0085':  // fall though
        case '\u2028':  // fall though
        case '\u2029':  // fall though
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = zzBufferL.charAt(zzMarkedPosL) != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = zzBufferL.charAt(zzMarkedPosL) != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 17: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 18: break;
          case 3: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return OTHER;
            } 
            // fall through
          case 19: break;
          case 4: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return OTHER;
            } 
            // fall through
          case 20: break;
          case 5: 
            { return DELETED;
            } 
            // fall through
          case 21: break;
          case 6: 
            { return SEPARATOR;
            } 
            // fall through
          case 22: break;
          case 7: 
            { return ADDED;
            } 
            // fall through
          case 23: break;
          case 8: 
            { return MODIFIED;
            } 
            // fall through
          case 24: break;
          case 9: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return EOLHINT;
            } 
            // fall through
          case 25: break;
          case 10: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return HUNK_HEAD;
            } 
            // fall through
          case 26: break;
          case 11: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return EOLHINT;
            } 
            // fall through
          case 27: break;
          case 12: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return HUNK_HEAD;
            } 
            // fall through
          case 28: break;
          case 13: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return FILE;
            } 
            // fall through
          case 29: break;
          case 14: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return COMMAND;
            } 
            // fall through
          case 30: break;
          case 15: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return FILE;
            } 
            // fall through
          case 31: break;
          case 16: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return COMMAND;
            } 
            // fall through
          case 32: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}