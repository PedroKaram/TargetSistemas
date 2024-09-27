import static java.lang.System.out;
import java.util.Scanner;

class Questao2 {

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1, fibonacci = 0;

        if(num == a || num == b) {
            return true;
        }

        while(fibonacci < num) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }

        return fibonacci == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número desejado: ");
        int userInt = scanner.nextInt();

        if(isFibonacci(userInt)) {
            System.out.printf("O número %d pertence à sequência de Fibonacci.", userInt);
        } else {
            System.out.printf("O número %d não pertence à sequência de Fibonacci.", userInt);
        }

        scanner.close();
    }
}