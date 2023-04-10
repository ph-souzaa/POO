package exercicio1;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1, number2;

		System.out.print("Digite 2 números: ");
		number1 = scanner.nextInt();
		number2 = scanner.nextInt();
		scanner.close();

		int media = (number1 + number2) / 2;
		int dif = Math.abs(number1 - number2); // Corrigido para garantir o valor absoluto da diferença

		System.out.println("Média: " + media + " Diferença: " + dif);
	}
}
