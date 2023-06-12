package Compilador;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Scanner {
    private char currentChar;
    private byte currentKind;
    private StringBuffer currentSpelling;
    private BufferedReader file;
    
    /*
     * Foi utilizado a classe FileReader do Java.
     * A variável file é um buffer onde pode ser lido o arquivo.
     * Para ler caracter por caracter é utilizado a funcao read().
     * A funcao retorna um inteiro que pode ser transformado para char
     * através de um cast. Se o inteiro é -1 significa fim de arquivo.
     */
    public Scanner(String file_name) throws IOException {
        FileReader arquivo = new FileReader(file_name);
        file = new BufferedReader(arquivo);
        currentChar =  (char) file.read();
        currentSpelling = new StringBuffer();
    }

    public void fechar() throws IOException {
        file.close();
    }
    
    private void take(char expectedChar) throws IOException, Exception {
        if(currentChar == expectedChar) {
            currentSpelling.append(currentChar);
            currentChar = (char) file.read(); // Passa para o próximo caracter
        } else {
            throw new Exception("Caracter não esperado");
        }
    }
    
    public void takeIt() throws IOException {
        currentSpelling.append(currentChar);
        currentChar = (char) file.read(); // Passa para o próximo caracter
    }

    private boolean isGraphic(char character) {
        return (character >= 32);
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
        return 1;
    }

    private void scanSeparator() throws IOException {
        switch(currentChar) {
            case ' ': case '\n': {
                takeIt();
                break;
            }
        }
    }

    public Token Scan() throws IOException {
        while( currentChar != ' '
            || currentChar != '\n' )
            scanSeparator();
        currentSpelling = new StringBuffer("");
        currentKind = scanToken();
        return new Token(currentKind, currentSpelling.toString());
    }
}
