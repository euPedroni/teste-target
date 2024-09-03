package execsteste;

import java.util.Scanner;

public class Exercicio2 {

   
    public static boolean quadradoPerfeito(int x) {
        int raiz = (int) Math.sqrt(x);
        return raiz * raiz == x;
    }

    
    public static boolean Fibonacci(int n) {
        
        return quadradoPerfeito(5 * n * n + 4) || 
        		quadradoPerfeito(5 * n * n - 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Verificar se número é Fibonacci");
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (Fibonacci(n)) {
            System.out.println(n + " pertence à série de Fibonacci.");
        } else {
            System.out.println(n + " não pertence à série de Fibonacci.");
        }

        sc.close();
    }
}