package exercicio2;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 1 número: ");

        int num = scanner.nextInt();
        scanner.close();

        if (num > 0) {
            System.out.printf("Positivo");
        } else if (num < 0) {
            System.out.printf("Negativo");
        } else {
            System.out.printf("Neutro");
        }
    }
}