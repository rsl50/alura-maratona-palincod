package br.com.alura.maratona;
import java.util.Scanner;
public class Main {public static void main(String[]a){Scanner s=new Scanner(System.in);int t=s.nextInt();s.nextLine();for(int i=1; i <= t; i++){System.out.print(i + " ");String p=s.nextLine();String v=new StringBuilder(p).reverse().toString();if(p.equalsIgnoreCase(v))System.out.println("\"YES\"");else System.out.println("\"NO\"");}}}
