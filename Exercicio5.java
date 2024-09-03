package execsteste;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string para ser invertida: ");
        String original = sc.nextLine();

        char[] caracteres = original.toCharArray();

        int esquerda = 0;
        int direita = caracteres.length - 1;

        while (esquerda < direita) {
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;

            esquerda++;
            direita--;
        }

        String invertida = new String(caracteres);

        System.out.println("String invertida: " + invertida);

        sc.close();
    }

}
