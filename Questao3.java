import java.util.Arrays;

public class Questao3 {

    public static void main(String[] args) {
        double[] faturamentoDiario = {20, 50, 150, 250, 400, 0, 500, 0, 750, 950, 1000, 0, 1250, 1500, 2000};
        
        Resultado resultado = calcularFaturamento(faturamentoDiario);

        System.out.println("Menor Faturamento: " + resultado.menorFaturamento);
        System.out.println("Maior Faturamento: " + resultado.maiorFaturamento);
        System.out.println("Dias acima da média mensal: " + resultado.diasAcimaMedia);
    }

    public static Resultado calcularFaturamento(double[] faturamentoDiario) {
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasValidos = 0;

        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) {
                somaFaturamento += faturamento;
                diasValidos++;
                
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
            }
        }

        double mediaMensal = diasValidos > 0 ? somaFaturamento / diasValidos : 0;
        int diasAcimaMedia = 0;

        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaMensal) {
                diasAcimaMedia++;
            }
        }

        return new Resultado(menorFaturamento, maiorFaturamento, diasAcimaMedia);
    }

    static class Resultado {
        double menorFaturamento;
        double maiorFaturamento;
        int diasAcimaMedia;

        Resultado(double menor, double maior, int dias) {
            this.menorFaturamento = menor;
            this.maiorFaturamento = maior;
            this.diasAcimaMedia = dias;
        }
    }
}
