package exercicio1;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;

		System.out.print("Digite 3 numeros: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		scanner.close();

		int delta = (b * b) - 4 * a * c;

		System.out.println("Delta: " + delta);
	}
}
