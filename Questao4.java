import java.util.HashMap;
import java.util.Map;

public class Questao4 {

    public static void main(String[] args) {
        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        double totalFaturamento = calcularTotalFaturamento(faturamentoPorEstado);

        exibirPercentuais(faturamentoPorEstado, totalFaturamento);
    }

    public static double calcularTotalFaturamento(Map<String, Double> faturamento) {
        double total = 0;
        for (double valor : faturamento.values()) {
            total += valor;
        }
        return total;
    }

    public static void exibirPercentuais(Map<String, Double> faturamento, double total) {
        System.out.println("Percentual de representação do faturamento por estado:");
        for (Map.Entry<String, Double> entry : faturamento.entrySet()) {
            String estado = entry.getKey();
            double valor = entry.getValue();
            double percentual = (valor / total) * 100;
            System.out.printf("%s: %.2f%%\n", estado, percentual);
        }
    }
}
