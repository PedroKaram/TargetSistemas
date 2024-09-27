// import java.lang.System.format;

class Questao1 {
    public static void main(String[] args) {
        int INDICE = 13, soma = 0, k = 0;
        
        while(k < INDICE) {
            k = k + 1;
            soma = soma + k;
        }

        System.out.printf("%d", soma);
    }
}
