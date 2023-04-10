package exercicio2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 1 número: ");

        int num = scanner.nextInt();
        scanner.close();

        if (num % 2 == 0) {
            System.out.printf("PAR");
        } else {
            System.out.printf("IMPAR");
        }
    }
}
