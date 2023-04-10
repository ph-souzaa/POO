package exercicio1;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) { // Corrigido de "arg" para "args"
		Scanner scanner = new Scanner(System.in);
		float start, end;

		System.out.print("Digite o início e depois o final: ");
		start = scanner.nextFloat();
		end = scanner.nextFloat();
		scanner.close();

		float distance = end - start;
		System.out.printf("Percorreu: %.2f", distance);
	}
}
