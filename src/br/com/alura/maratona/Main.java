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
        String invertido = new StringBuilder(palavra).reverse().toString();
        return palavra.equals(invertido);
    }
}
