package Compilador;

public class Token {
    public byte kind;
    public String spelling;
    public Integer row, column;

    public Token (byte kind, String spelling) {
        this.kind = kind;
        this.spelling = spelling;

        if(kind == IDENTIFIER) {
            for(int i=BEGIN ; i<=WHILE ; ++i) {
                if(spelling == spellings[i]){
                    this.kind = (byte) i;
                    break;
                }
            }
        }
    }

    public final static byte
        IDENTIFIER = 0, INTLITERAL = 1, PLUSOPERATOR = 2,
        MINUSOPERATOR = 3, PRODUCTOPERATOR = 4, DIVISIONOPERATOR = 5,
        BEGIN = 6, CONST = 7, DO = 8, ELSE = 9, END =  10, IF = 11,
        IN = 12, LET = 13, THEN = 14, VAR = 15, WHILE = 16,
        SEMICOLON = 17, COLON = 18, EOT = 23;

    public final static String[] spellings = {
        
    };
}
