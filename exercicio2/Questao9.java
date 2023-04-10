package exercicio2;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out
                .println("Este programa encontra a maior e a menor nota entre 10 notas digitadas por você. Vamos lá?");
        System.out.print("Digite a primeira nota: ");
        float notas[] = new float[10];
        float maior = 0;
        float menor = 0;
        for (int i = 0; i < 10; i++) {
            try {
                notas[i] = leia.nextFloat();
                if (i == 0) {
                    maior = notas[i];
                    menor = notas[i];
                } else if (notas[i] > maior)
                    maior = notas[i];
                else if (notas[i] < menor)
                    menor = notas[i];
            } catch (Exception e) {
                System.out.println("Você não digitou uma nota válida. Tente novamente.");
                leia.nextLine();
                i--;
            }
        }
        System.out.printf("A maior nota é %.2f e a menor nota é %.2f. Obrigado por utilizar o programa!", maior, menor);
        leia.close();
    }
}
