package execsteste;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int INDICE = 13;
		
		int SOMA = 0;
		
		int K = 0;
		
		do {
			
			K += 1;
			
			SOMA += K;
			
			
		}while(K < INDICE);
		
		System.out.println(SOMA);
	}
	
}
