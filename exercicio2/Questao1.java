package exercicio2;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 2 números: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();

        if (num1 > num2) {
            System.out.printf("Maior = %d", num1);
        } else {
            System.out.printf("Maior = %d", num2);
        }
    }
}