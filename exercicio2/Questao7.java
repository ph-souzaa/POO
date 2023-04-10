package exercicio2;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Este programa calcula a média de 15 idades digitadas por você. Vamos lá?");
        System.out.print("Digite a primeira idade: ");
        int soma = 0;
        for (int i = 0; i < 15; i++) {
            try {
                int idade = leia.nextInt();
                soma += idade;
            } catch (Exception e) {
                System.out.println("Você não digitou uma idade válida. Tente novamente.");
                leia.nextLine();
                i--;
            }
        }
        double media = (double) soma / 15;
        System.out.printf("A média das 15 idades é %.2f. Obrigado por utilizar o programa!", media);
        leia.close();
    }
}
