package exercicio2;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Este programa encontra o maior número entre 10 números digitados por você. Vamos lá?");
        System.out.print("Digite o primeiro número: ");
        int numeros[] = new int[10];
        int maior = 0;
        for (int i = 0; i < 10; i++) {
            try {
                numeros[i] = leia.nextInt();
                if (i == 0)
                    maior = numeros[i];
                else if (numeros[i] > maior)
                    maior = numeros[i];
            } catch (Exception e) {
                System.out.println("Você não digitou um número válido. Tente novamente.");
                leia.nextLine();
                i--;
            }
        }
        System.out.printf("O maior número entre os 10 digitados é %d. Obrigado por utilizar o programa!", maior);
        leia.close();
    }
}
