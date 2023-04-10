package exercicio2;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um dia da semana de 1 a 7: ");

        int dia = scanner.nextInt();
        scanner.close();

        if (dia >= 1 && dia <= 7) {
            switch (dia) {
                case 1:
                    System.out.printf("Domingo");
                    break;
                case 2:
                    System.out.printf("Segunda");
                    break;
                case 3:
                    System.out.printf("Terça");
                    break;
                case 4:
                    System.out.printf("Quarta");
                    break;
                case 5:
                    System.out.printf("Quinta");
                    break;
                case 6:
                    System.out.printf("Sexta");
                    break;
                case 7:
                    System.out.printf("Sábado");
                    break;
            }
        } else {
            System.out.printf("Dia Inválido");
        }
    }
}