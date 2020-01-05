package br.com.alura.maratona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= casos; i++) {
            System.out.print(i + " ");

            String palavra = scanner.nextLine();
            if (checkPalindromo(palavra)) {
                System.out.println("\"YES\"");
            } else {
                System.out.println("\"NO\"");
            }
        }
     }

    private static boolean checkPalindromo(String palavra) {

        boolean isPalindromo = true;

        for (int i = 0; i < palavra.length()/2; i++) {
            char esquerda = palavra.charAt(i);
            char direita = palavra.charAt(palavra.length() - 1 - i);
//           System.out.println(esquerda +" "+ direita);
            if (esquerda != direita) {
                isPalindromo = false;
                break;
            }
        }

        return isPalindromo;
    }
}
