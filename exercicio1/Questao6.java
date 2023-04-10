package exercicio1;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float kilometers;

		System.out.print("Digite um valor em Km: ");
		kilometers = scanner.nextFloat();
		scanner.close();

		float meters = kilometers * 1000;
		System.out.printf("%.2f metros", meters);
	}
}