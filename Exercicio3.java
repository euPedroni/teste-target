package execsteste;

public class Exercicio3 {
	
	public static void main(String[] args) {

		double[] faturamentoDiario = {200.0, 300.0, 0.0, 150.0, 0.0, 400.0, 0.0, 100.0, 0.0, 250.0};

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0.0;
        int diasComFaturamento = 0;

        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) { 
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }
        }

        double mediaFaturamento = somaFaturamento / diasComFaturamento;

        int diasAcimaMedia = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaFaturamento) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor faturamento do mês: " + menorFaturamento);
        System.out.println("Maior faturamento do mês: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média: "
        + diasAcimaMedia);
    }
}


