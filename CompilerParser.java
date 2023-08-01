import java.util.*;
import java.text.ParseException;

class CompilerParser {

    /**
     * Constructor for the CompilerParser
     * @param tokens A linked list of tokens to be parsed
     */
    public CompilerParser(LinkedList<Token> tokens){
        
    }

    /**
     * Generates a parse tree for a single program
     */
    public ParseTree compileProgram() throws ParseException {
        return null;
    }

    /**
     * Generates a parse tree for a single class
     */
    public ParseTree compileClass() throws ParseException {
        return null;
    }

    /**
     * Generates a parse tree for a static variable declaration or field declaration
     */
    public ParseTree compileClassVarDec() throws ParseException {
        return null;
    }

    /**
     * Generates a parse tree for a method, function, or constructor
     */
    public ParseTree compileSubroutine() throws ParseException {
        return null;
    }

    /**
     * Generates a parse tree for a subroutine's parameters
     */
    public ParseTree compileParameterList() throws ParseException {
        return null;
    }

    /**
     * Generates a parse tree for a subroutine's body
     */
    public ParseTree compileSubroutineBody() throws ParseException {
        return null;
    }

    /**
     * Generates a parse tree for a variable declaration
     */
    public ParseTree compileVarDec() throws ParseException {
        return null;
    }

    /**
     * Generates a parse tree for a series of statements
     */
    public ParseTree compileStatements() throws ParseException {
        return null;
    }

    /**
     * Generates a parse tree for a let statement
     */
    public ParseTree compileLet() throws ParseException {
        return null;
    }

    /**
     * Generates a parse tree for an if statement
     */
    public ParseTree compileIf() throws ParseException {
        return null;
    }

    /**
     * Generates a parse tree for a while statement
     */
    public ParseTree compileWhile() throws ParseException {
        return null;
    }

    /**
     * Generates a parse tree for a do statement
     */
    public ParseTree compileDo() throws ParseException {
        return null;
    }

    /**
     * Generates a parse tree for a return statement
     */
    public ParseTree compileReturn() throws ParseException {
        return null;
    }

    /**
     * Generates a parse tree for an expression
     */
    public ParseTree compileExpression() throws ParseException {
        return null;
    }

    /**
     * Generates a parse tree for an expression term
     */
    public ParseTree compileTerm() throws ParseException {
        return null;
    }

    /**
     * Generates a parse tree for an expression list
     */
    public ParseTree compileExpressionList() throws ParseException {
        return null;
    }

    public static void main(String[] args){

        /* Tokens for:
         *     class MyClass {
         *     
         *     }
         */
        LinkedList<Token> tokens = new LinkedList<Token>();
        tokens.add(new Token("keyword","class"));
        tokens.add(new Token("identifier","MyClass"));
        tokens.add(new Token("symbol","{"));
        tokens.add(new Token("symbol","}"));

        CompilerParser parser = new CompilerParser(tokens);
        try {
            ParseTree result = parser.compileProgram();
            System.out.println(result);
        } catch (ParseException e) {
            System.out.println("Error Parsing!")
        }

    }

} 
