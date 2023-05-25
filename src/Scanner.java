public class Scanner {
    private char currentChar;
    private byte currentKind;
    private StringBuffer currentSpelling;
    
    private void take(char expectedChar) {
        if(currentChar == expectedChar) {
            currentSpelling.append(currentChar);
            // Pass to the next char
        } else {
            // Report Lexical Error
        }
    }
    
    private void takeIt() {
        currentSpelling.append(currentChar);
        // Pass to the next char
    }

    private boolean isLetter(char character) {
        return (character >= 65 && character <= 90)
            || (character >= 97 && character <= 122);
    }

    private boolean isDigit(char character) {
        return (character >= 48 && character <= 57);
    }

    private byte scanToken() {
        switch(currentChar) {
            
        }
    }

    private void scanSeparator() {
        switch(currentChar) {
            
        }
    }

    public Token Scan() {
        while( currentChar != ' '
            || currentChar != '\n'
            || currentChar != '!')
            scanSeparator();
        currentSpelling = new StringBuffer("");
        currentKind = scanToken();
        return new Token(currentKind, currentSpelling.toString());
    }
}
