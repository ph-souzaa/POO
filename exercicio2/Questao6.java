package exercicio2;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Este programa soma 10 números digitados por você. Vamos lá?");
        System.out.print("Digite o primeiro número: ");
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            try {
                int numero = leia.nextInt();
                soma += numero;
            } catch (Exception e) {
                System.out.println("Você não digitou um número válido. Tente novamente.");
                leia.nextLine();
                i--;
            }
        }
        System.out.printf("A soma dos 10 números é %d. Obrigado por utilizar o programa!", soma);
        leia.close();
    }
}
