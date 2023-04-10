package exercicio2;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 2 notas: ");

        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.printf("\nMédia = %.2f", media);

        if (media >= 7) {
            System.out.printf("\nAprovado");
        } else {
            System.out.printf("\nDigite a nota da AV3");
            float nota3 = scanner.nextFloat();
            media = (nota1 + nota2 + (nota3 * 2)) / 3;
            System.out.printf("\nNova Média = %.2f", media);
            if (media >= 6) {
                System.out.printf("\nAprovado");
            } else {
                System.out.printf("\nReprovado");
            }
        }
        scanner.close();
    }
}
