package exercicio2;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println(
                "Este programa calcula a porcentagem de alunos do sexo masculino e feminino entre 30 alunos. Vamos lá?");
        System.out.print("Digite o sexo dos alunos (m para masculino e f para feminino):");
        char sexo;
        int masculino = 0;
        int feminino = 0;
        for (int i = 0; i < 30; i++) {
            try {
                sexo = leia.next(".").charAt(0);
                if (sexo == 'm') {
                    masculino++;
                } else if (sexo == 'f')
                    feminino++;
            } catch (Exception e) {
                System.out.println("Você não digitou um valor válido. Tente novamente.");
                leia.nextLine();
                i--;
            }
        }
        float porcentagem_masculino = (float) masculino / 30 * 100;
        float porcentagem_feminino = (float) feminino / 30 * 100;

        System.out.printf(
                "A porcentagem de alunos do sexo masculino é %.2f%% e a porcentagem de alunos do sexo feminino é %.2f%%. Obrigado por utilizar o programa!",
                porcentagem_masculino, porcentagem_feminino);
        leia.close();
    }
}
