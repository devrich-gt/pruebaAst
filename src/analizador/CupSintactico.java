
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizador;

import java_cup.runtime.*;
import java_cup.runtime.Symbol;
import estructuras.*;
import estructuras.sents.*;
import estructuras.exp.*;
import compartido.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class CupSintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return CupSimbolos.class;
}

  /** Default constructor. */
  @Deprecated
  public CupSintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public CupSintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public CupSintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\035\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\005\003\000\002\005\003" +
    "\000\002\005\003\000\002\005\003\000\002\006\003\000" +
    "\002\007\007\000\002\007\005\000\002\010\006\000\002" +
    "\011\007\000\002\004\004\000\002\004\005\000\002\012" +
    "\004\000\002\012\003\000\002\013\005\000\002\013\003" +
    "\000\002\014\007\000\002\015\004\000\002\016\003\000" +
    "\002\017\003\000\002\017\003\000\002\017\003\000\002" +
    "\017\003\000\002\017\003\000\002\017\003\000\002\017" +
    "\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\061\000\012\004\021\006\010\007\015\021\005\001" +
    "\002\000\020\002\ufff1\004\ufff1\006\ufff1\007\ufff1\010\061" +
    "\015\ufff1\021\ufff1\001\002\000\010\011\ufff9\013\ufff9\016" +
    "\ufff9\001\002\000\016\002\ufffd\004\ufffd\006\ufffd\007\ufffd" +
    "\015\ufffd\021\ufffd\001\002\000\004\002\057\001\002\000" +
    "\004\012\053\001\002\000\016\002\ufffa\004\ufffa\006\ufffa" +
    "\007\ufffa\015\ufffa\021\ufffa\001\002\000\020\002\uffef\004" +
    "\uffef\006\uffef\007\uffef\010\uffef\015\uffef\021\uffef\001\002" +
    "\000\016\002\ufffe\004\ufffe\006\ufffe\007\ufffe\015\ufffe\021" +
    "\ufffe\001\002\000\004\011\050\001\002\000\004\012\040" +
    "\001\002\000\016\002\ufffc\004\ufffc\006\ufffc\007\ufffc\015" +
    "\ufffc\021\ufffc\001\002\000\016\002\ufffb\004\ufffb\006\ufffb" +
    "\007\ufffb\015\ufffb\021\ufffb\001\002\000\014\002\000\004" +
    "\021\006\010\007\015\021\005\001\002\000\004\021\005" +
    "\001\002\000\006\011\023\016\024\001\002\000\020\005" +
    "\026\017\025\020\032\021\005\022\031\023\030\024\027" +
    "\001\002\000\016\002\ufff7\004\ufff7\006\ufff7\007\ufff7\015" +
    "\ufff7\021\ufff7\001\002\000\006\013\uffea\016\uffea\001\002" +
    "\000\006\013\uffe6\016\uffe6\001\002\000\006\013\uffe9\016" +
    "\uffe9\001\002\000\006\013\uffe7\016\uffe7\001\002\000\006" +
    "\013\uffe8\016\uffe8\001\002\000\006\013\uffeb\016\uffeb\001" +
    "\002\000\006\013\uffe5\016\uffe5\001\002\000\006\013\uffec" +
    "\016\uffec\001\002\000\004\016\036\001\002\000\016\002" +
    "\ufff8\004\ufff8\006\ufff8\007\ufff8\015\ufff8\021\ufff8\001\002" +
    "\000\016\002\uffff\004\uffff\006\uffff\007\uffff\015\uffff\021" +
    "\uffff\001\002\000\020\005\026\017\025\020\032\021\005" +
    "\022\031\023\030\024\027\001\002\000\004\013\042\001" +
    "\002\000\004\014\044\001\002\000\020\002\uffee\004\uffee" +
    "\006\uffee\007\uffee\010\uffee\015\uffee\021\uffee\001\002\000" +
    "\014\004\021\006\010\007\015\015\045\021\005\001\002" +
    "\000\020\002\ufff4\004\ufff4\006\ufff4\007\ufff4\010\ufff4\015" +
    "\ufff4\021\ufff4\001\002\000\014\004\021\006\010\007\015" +
    "\015\047\021\005\001\002\000\020\002\ufff3\004\ufff3\006" +
    "\ufff3\007\ufff3\010\ufff3\015\ufff3\021\ufff3\001\002\000\020" +
    "\005\026\017\025\020\032\021\005\022\031\023\030\024" +
    "\027\001\002\000\004\016\052\001\002\000\016\002\ufff6" +
    "\004\ufff6\006\ufff6\007\ufff6\015\ufff6\021\ufff6\001\002\000" +
    "\020\005\026\017\025\020\032\021\005\022\031\023\030" +
    "\024\027\001\002\000\004\013\055\001\002\000\004\016" +
    "\056\001\002\000\016\002\ufff5\004\ufff5\006\ufff5\007\ufff5" +
    "\015\ufff5\021\ufff5\001\002\000\004\002\001\001\002\000" +
    "\016\002\ufff2\004\ufff2\006\ufff2\007\ufff2\015\ufff2\021\ufff2" +
    "\001\002\000\006\007\015\014\044\001\002\000\016\002" +
    "\uffed\004\uffed\006\uffed\007\uffed\015\uffed\021\uffed\001\002" +
    "\000\020\002\ufff0\004\ufff0\006\ufff0\007\ufff0\010\ufff0\015" +
    "\ufff0\021\ufff0\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\061\000\026\002\006\003\017\005\012\006\013\007" +
    "\005\010\015\011\016\012\010\013\003\014\011\001\001" +
    "\000\004\015\057\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\022" +
    "\005\036\006\013\007\005\010\015\011\016\012\010\013" +
    "\003\014\011\001\001\000\004\006\021\001\001\000\002" +
    "\001\001\000\010\006\032\016\034\017\033\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\006\032\016" +
    "\040\017\033\001\001\000\002\001\001\000\004\004\042" +
    "\001\001\000\002\001\001\000\024\003\045\005\012\006" +
    "\013\007\005\010\015\011\016\012\010\013\003\014\011" +
    "\001\001\000\002\001\001\000\022\005\036\006\013\007" +
    "\005\010\015\011\016\012\010\013\003\014\011\001\001" +
    "\000\002\001\001\000\010\006\032\016\050\017\033\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\006\032" +
    "\016\053\017\033\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\004\061\014\062\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$CupSintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$CupSintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$CupSintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public Nodo raiz = new Documento();

/* Metodo que es llamado al encontrar un error lexico */ 
public void syntax_error(Symbol s) {
	System.out.println("Error sintactico en la Linea  " + (s.right+1) + " Columna "+s.left+ ". Identificador " +s.value + " no reconocido." );
    //Constantes.tablaErrores.add(Constantes.SINTACTICO, ". Identificador " + s.value + " no reconocido.", (s.right+1), s.left, "...");
}

/**Metodo al que se llama en el momento en que ya no es posible una recuperación de errores.*/
public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
	System.out.println("Error sintactico No recuperable en la Linea  " + (s.right+1) +" Columna "+s.left+ ". Identificador " +s.value + " no reconocido." );
    //Constantes.tablaErrores.add(Constantes.SINTACTICO, ".Error sintactico No recuperable:  Identificador " +s.value + " no reconocido.", (s.right+1), s.left, "...");
}



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$CupSintactico$actions {


	public Nodo hijo,hijo1,hijo2;

  private final CupSintactico parser;

  /** Constructor */
  CUP$CupSintactico$actions(CupSintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$CupSintactico$do_action_part00000000(
    int                        CUP$CupSintactico$act_num,
    java_cup.runtime.lr_parser CUP$CupSintactico$parser,
    java.util.Stack            CUP$CupSintactico$stack,
    int                        CUP$CupSintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$CupSintactico$result;

      /* select the action based on the action number */
      switch (CUP$CupSintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).right;
		Nodo start_val = (Nodo)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).value;
		RESULT = start_val;
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$CupSintactico$parser.done_parsing();
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= SENTS 
            {
              Nodo RESULT =null;
		int sentsleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int sentsright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Sentencias sents = (Sentencias)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
                System.out.println("Cup java analizando...");
                raiz = new Documento(sents);
                System.out.println("finalizado");
                RESULT = raiz;
            
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // SENTS ::= SENTS SENT 
            {
              Sentencias RESULT =null;
		int sentsleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).left;
		int sentsright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).right;
		Sentencias sents = (Sentencias)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).value;
		int sentleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int sentright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Nodo sent = (Nodo)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
                sents.add(sent);
                RESULT = sents;
            
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("SENTS",1, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SENTS ::= SENT 
            {
              Sentencias RESULT =null;
		int sentleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int sentright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Nodo sent = (Nodo)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
                Sentencias sents = new Sentencias();
                sents.add(sent);
                RESULT = sents;
            
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("SENTS",1, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENT ::= DECLARACION 
            {
              Nodo RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Declaracion s = (Declaracion)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
                RESULT = s;
            
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("SENT",3, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENT ::= ASIGNACION 
            {
              Nodo RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Asignacion s = (Asignacion)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
                RESULT = s;
            
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("SENT",3, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENT ::= IMPRIMIR 
            {
              Nodo RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Imprimir s = (Imprimir)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
                RESULT = s;
            
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("SENT",3, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENT ::= S_IF 
            {
              Nodo RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		SentenciaIf s = (SentenciaIf)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
                RESULT = s;
            
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("SENT",3, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // ID ::= id 
            {
              Id RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
        RESULT = new Id(i.toString());
    
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("ID",4, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DECLARACION ::= var ID igual E punto_coma 
            {
              Declaracion RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-4)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-4)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-4)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-3)).right;
		Id id = (Id)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).right;
		Expresion e = (Expresion)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).value;
		
                    RESULT = new Declaracion(id, e,iright, ileft);
                
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("DECLARACION",5, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-4)), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // DECLARACION ::= var ID punto_coma 
            {
              Declaracion RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).right;
		Id id = (Id)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).value;
		
                    RESULT = new Declaracion(id, iright, ileft);
                
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("DECLARACION",5, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // ASIGNACION ::= ID igual E punto_coma 
            {
              Asignacion RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-3)).right;
		Id id = (Id)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-3)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).right;
		Expresion e = (Expresion)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).value;
		
                    RESULT = new Asignacion(id, e, iright, ileft);
                
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("ASIGNACION",6, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-3)), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // IMPRIMIR ::= imprimir par_a E par_c punto_coma 
            {
              Imprimir RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-4)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-4)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-4)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).right;
		Expresion e = (Expresion)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).value;
		
                    RESULT = new Imprimir(e, iright, ileft);
                
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("IMPRIMIR",7, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-4)), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // BLOQUE_C ::= llaveA llaveC 
            {
              Sentencias RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).value;
		
                RESULT = new Sentencias(iright, ileft);
            
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("BLOQUE_C",2, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // BLOQUE_C ::= llaveA SENTS llaveC 
            {
              Sentencias RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).value;
		int ssleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).left;
		int ssright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).right;
		Sentencias ss = (Sentencias)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).value;
		
                RESULT = ss;
            
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("BLOQUE_C",2, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // S_IF ::= LIF ELSE 
            {
              SentenciaIf RESULT =null;
		int lifleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).left;
		int lifright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).right;
		SentenciaIf lif = (SentenciaIf)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).value;
		int elleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int elright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		If el = (If)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
                lif.add(el);
                RESULT = lif; 
            
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("S_IF",8, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // S_IF ::= LIF 
            {
              SentenciaIf RESULT =null;
		int lifleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int lifright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		SentenciaIf lif = (SentenciaIf)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
                RESULT = lif;
            
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("S_IF",8, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // LIF ::= LIF s_else IF 
            {
              SentenciaIf RESULT =null;
		int lifleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).left;
		int lifright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).right;
		SentenciaIf lif = (SentenciaIf)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).value;
		int sifleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int sifright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		If sif = (If)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
            lif.add(sif);
            RESULT = lif;
        
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("LIF",9, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // LIF ::= IF 
            {
              SentenciaIf RESULT =null;
		int sifleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int sifright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		If sif = (If)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
            SentenciaIf lif = new SentenciaIf();
            lif.add(sif);
            RESULT = lif;
        
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("LIF",9, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // IF ::= s_if par_a E par_c BLOQUE_C 
            {
              If RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-4)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-4)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-4)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).right;
		Expresion e = (Expresion)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Sentencias b = (Sentencias)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
            RESULT = new If(e, b, nright, nleft);
        
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("IF",10, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-4)), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // ELSE ::= s_else BLOQUE_C 
            {
              If RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Sentencias b = (Sentencias)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
            RESULT = new If(new ValorExpresion(new Valor(true ), nright, nleft), b, nright, nleft);
        
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("ELSE",11, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.elementAt(CUP$CupSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // E ::= VAlOR 
            {
              Expresion RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Expresion e = (Expresion)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
            RESULT = e;
        
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("E",12, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // VAlOR ::= numero 
            {
              Expresion RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
            RESULT = new ValorExpresion(new Valor(Double.parseDouble(n.toString())), nright, nleft);
        
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("VAlOR",13, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // VAlOR ::= cadena 
            {
              Expresion RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
            RESULT = new ValorExpresion(new Valor(n.toString()), nright, nleft);
        
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("VAlOR",13, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // VAlOR ::= decimal 
            {
              Expresion RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
            RESULT = new ValorExpresion(new Valor( Double.parseDouble(n.toString())), nright, nleft);
        
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("VAlOR",13, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // VAlOR ::= verdadero 
            {
              Expresion RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
            RESULT = new ValorExpresion(new Valor(true ), nright, nleft);
        
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("VAlOR",13, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // VAlOR ::= falso 
            {
              Expresion RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
            RESULT = new ValorExpresion(new Valor(false ), nright, nleft);
        
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("VAlOR",13, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // VAlOR ::= nulo 
            {
              Expresion RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
            RESULT = new ValorExpresion(new Valor(), nright, nleft);
        
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("VAlOR",13, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // VAlOR ::= ID 
            {
              Expresion RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()).right;
		Id n = (Id)((java_cup.runtime.Symbol) CUP$CupSintactico$stack.peek()).value;
		
            RESULT = n;
        
              CUP$CupSintactico$result = parser.getSymbolFactory().newSymbol("VAlOR",13, ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$CupSintactico$stack.peek()), RESULT);
            }
          return CUP$CupSintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$CupSintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$CupSintactico$do_action(
    int                        CUP$CupSintactico$act_num,
    java_cup.runtime.lr_parser CUP$CupSintactico$parser,
    java.util.Stack            CUP$CupSintactico$stack,
    int                        CUP$CupSintactico$top)
    throws java.lang.Exception
    {
              return CUP$CupSintactico$do_action_part00000000(
                               CUP$CupSintactico$act_num,
                               CUP$CupSintactico$parser,
                               CUP$CupSintactico$stack,
                               CUP$CupSintactico$top);
    }
}

}
