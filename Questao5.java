import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        String original = "Exemplo de string"; // Você pode mudar esta string
        String invertida = inverterString(original);
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String str) {
        char[] caracteres = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            caracteres[i] = str.charAt(str.length() - 1 - i);
        }

        return new String(caracteres);
    }
}
