package exercicio1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.print("Digite um valor: ");
		number = scanner.nextInt();
		scanner.close();

		System.out.println("Dobro = " + number * 2);
	}
}