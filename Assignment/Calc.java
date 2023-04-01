import java.io.*;

class Calc {
    int token; int value; int ch;
    private PushbackInputStream input;
    final int NUMBER=256;

    Calc(PushbackInputStream is) {
        input = is;
    }

    int getToken( )  { /* tokens are characters */
        while(true) {
            try  {
	            ch = input.read();
                if (ch == ' ' || ch == '\t' || ch == '\r') ;
                else if (Character.isDigit(ch)) {
                        value = number( );
	                    input.unread(ch);
		                return NUMBER;
                } else if (ch == '+') {
                        int next = input.read();
                        if (next == '+') {
                            error();
                        }
                        input.unread(next);
                        return ch;
                } else if (ch == '-') {
                    int next = input.read();
                    if (next == '-') {
                        error();
                    }
                    input.unread(next);
                    return ch;
                } else if (ch == '*') {
                    int next = input.read();
                    if (next == '*') {
                        error();
                    }
                    input.unread(next);
                    return ch;
                } else if (ch == '/') {
                    int next = input.read();
                    if (next == '/') {
                        error();
                    }
                    input.unread(next);
                    return ch;
                }
	          else return ch;
	  } catch (IOException e) {
                System.err.println(e);
            }
        }
    }

    private int number( )  {
    /* number -> digit { digit } */
        int result = ch - '0';
        try  {
            ch = input.read();
            while (Character.isDigit(ch)) {
                result = 10 * result + ch -'0';
                ch = input.read();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        return result;
    }

    void error() {
        System.out.printf("syntax error");
        System.exit(1);
    }

    void match(int c) {
        if (token == c)
	    token = getToken();
        else error();
    }

    void command( ) {
    /* command -> expr '\n' */
        int result = expr();
        if (token == '\n')
            if (result == 1)
	            System.out.println("true");
            else if (result == 0)
                System.out.println("false");
            else
                System.out.println(result);
        else error();
    }

    int expr() {
    /* expr -> bexp { '&' bexp | ‘|’ bexp } | !expr | true | false */
        int result = 0;
        if (token == '!') {
            match('!');
            result = (expr() == 1) ? 0 : 1;
        } else if (token == 't') {
            match('t');
            match('r');
            match('u');
            match('e');
            result = 1;
        } else if (token == 'f') {
            match('f');
            match('a');
            match('l');
            match('s');
            match('e');
            result = 0;
        } else {
            result = bexp();
            while (token == '&') {
                match('&');
                result =  result & bexp();
            }
            while (token == '|') {
                match('|');
                result = result | bexp();
            }
        }
		return result;
	}

    int bexp( ) {
        /* bexp -> aexp [ relop aexp ] */
        int result = aexp();
        if (token == '=') {
            match('=');
            match('=');
            result = result == aexp() ? 1 : 0;
        } else if (token == '!') {
            match('!');
            match('=');
            result = result != aexp() ? 1 : 0;
        } else if (token == '<') {
            match('<');
            if (token == '=') {
                match('=');
                result = result <= aexp() ? 1 : 0;
            } else {
                result = result < aexp() ? 1 : 0;
            }
        } else if (token == '>') {
            match('>');
            if (token == '=') {
                match('=');
                result = result >= aexp() ? 1 : 0;
            } else {
                result = result > aexp() ? 1 : 0;
            }
        }

		return result;
	}

    int aexp( ) {
    /* aexp -> term {'+' term | '-' term } */
        int result = term();
        while (token == '+') {
            match('+');
            result += term();
        }
        while (token == '-') {
            match('-');
            result -= term();
        }
        return result;
    }

    int term( ) {
    /* term -> factor { '*' factor | '/' factor } */
       int result = factor();
       while (token == '*') {
           match('*');
           result *= factor();
       }
       while (token == '/') {
           match('/');
           result /= factor();
       }
       return result;
    }

    int factor() {
    /* factor -> [-] ( <number> | '(' aexp ')' )  */
        int result = 0;
        boolean negative = false;
        if (token == '-') {
            match('-');
            negative = true;
        }
        if (token == '(') {
            match('(');
            result = aexp();
            match(')');
        } else if (token == NUMBER) {
            result = value;
	        match(NUMBER);
        } else {
            error();
        }
        if (negative) {
            result = -result;
        }
        return result;
    }

    void parse( ) {
        token = getToken();
        command();
    }

    public static void main(String args[]) {
        Calc calc = new Calc(new PushbackInputStream(System.in));
        while(true) {
            System.out.print(">> ");
            calc.parse();
        }
    }
}

