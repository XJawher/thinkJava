package lesson.two;

/**
 * @author lipc
 */
public class Token {
    public TokenType tokenType;
    public Object value;

    public Token(TokenType tt, Object v) {
        this.tokenType = tt;
        this.value = v;
    }


    public enum TokenType {
        // test
        LPAR,
        RPAR,
        PLUS,
        MINUS,
        MULT,
        DIV,
        INT,
        NONE,
    }
}