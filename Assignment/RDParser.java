import java.io.*;
import java.util.Queue;

/**
 * Recursive Descent Parser of simple expression
 *
 * EBNF of our grammar
 * <command> -> <expr>\n
 * <expr> -> <bexp> {& <bexp> | ‘|’ <bexp>} | !<expr> | true | false
 * <bexp> -> <aexp> [<relop> <aexp>]
 * <relop> -> == | != | < | > | <= | >=
 * <aexp> -> <term> {+ <term> | -<term>}
 * <term> -> <factor> {* <factor> | / <factor>}
 * <factor> -> [-] ( <number> | (<aexp>))
 * <number> -> <digit>{<digit>}
 * <digit> -> 0|1|2|3|4|5|6|7|8|9
 *
 *
 * @author Jangwu Jo
 *
 */
public class RDParser {

	int token, ch;
	private PushbackInputStream input;

	RDParser(PushbackInputStream is) {
        input = is;
    }

    void error( ) {
        System.out.printf("syntax error");
        System.exit(1);
    }

    void command( ) {
    /* command -> expr '\n' */
        expr();
        if (token == '\n') /* end the parse and print the result */
        	System.out.println("good syntax");
        else error();
    }

    void match(int c) {
        if (token == c)
        	token = getToken();
        else error();
    }

    void expr() {
    /* expr -> bexp { '&' bexp | ‘|’ bexp} | !expr | true | false */
        if (token == '!') {
            match('!');
            expr();
        } else if (token == 't') {
            match('t');
            match('r');
            match('u');
            match('e');
        } else if (token == 'f') {
            match('f');
            match('a');
            match('l');
            match('s');
            match('e');
        } else {
            bexp();
            while (token == '&') {
                match('&');
                bexp();
            }
            while (token == '|') {
                match('|');
                bexp();
            }
        }
    }

    void bexp() {
    /* bexp -> aexp [relop aexp] */
        aexp();
        if (token == '=') {
            match('=');
            match('=');
            aexp();
        } else if (token == '!') {
            match('!');
            match('=');
            aexp();
        } else if (token == '<') {
            match('<');
            if (token == '=') {
                match('=');
                aexp();
            } else {
                aexp();
            }
        } else if (token == '>') {
            match('>');
            if (token == '=') {
                match('=');
                aexp();
            } else {
                aexp();
            }
        }
    }

    void aexp( ) {
    /* aexp -> term { '+' term | '-' term} */
        term();
        while (token == '+') {
            match('+');
            term();
        }
        while (token == '-') {
            match('-');
            term();
        }
    }

    void term( ) {
    /* term -> factor { '*' factor | '/' factor} */
       factor();
       while (token == '*') {
           match('*');
           factor();
       }
       while (token == '/') {
           match('/');
           factor();
       }
    }

    void factor() {
    /* factor -> [-] '(' aexp ')' | number */
        if (token == '-') {
            match('-');
        }
        if (token == '(') {
            match('(');
            aexp();
            match(')');
        }
        else {
            number();
        }
    }

    void number() {
    /* number -> digit{digit} */
    	digit();
    	while (Character.isDigit(token)) {
    		digit();
    	}
    }

    void digit() {
    /* digit -> 0|1|...|9 */
    	if (Character.isDigit(token))
    		match(token);
    	else
    		error();
    }

	int getToken() {
        while(true) {
            try  {
	            ch = input.read();
                if (ch == ' ' || ch == '\t' || ch == '\r') ;
                else
                	return ch;
	        } catch (IOException e) {
                System.err.println(e);
            }
        }
    }

    void parse( ) {
        token = getToken(); // get the first character
        command();          // call the parsing command
    }

	public static void main(String[] args) {
		RDParser parser = new RDParser(new PushbackInputStream(System.in));
        while(true) {
            System.out.print(">> ");
            parser.parse();
        }
    }
}

