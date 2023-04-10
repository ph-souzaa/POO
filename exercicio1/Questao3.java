package exercicio1;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float grade1, grade2, grade3;

		System.out.print("Digite 3 notas: ");
		grade1 = scanner.nextFloat();
		grade2 = scanner.nextFloat();
		grade3 = scanner.nextFloat();
		scanner.close();

		float media = (grade1 + grade2 + grade3) / 3;

		System.out.println("Média: " + media);
	}
}