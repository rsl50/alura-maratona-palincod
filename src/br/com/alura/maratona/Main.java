package br.com.alura.maratona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        for (int i = 1; i <= casos; i++) {
            System.out.println(i + " ");
            String palavra = scanner.nextLine();
        }
    }
}
