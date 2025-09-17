package Leitura;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int x = leitor.nextInt();

        System.out.println("\n\n\nX = " + x);

        leitor.close();
    }
}