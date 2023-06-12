import Compilador.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(args[0]);
            scanner.takeIt();
            scanner.takeIt();
            // Resto do codigo
            scanner.fechar();
        } catch (Exception e) {
            System.out.println("Erro de leitura do arquivo.");
            e.printStackTrace();
        }
    }
}
