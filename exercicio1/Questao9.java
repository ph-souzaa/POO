package exercicio1;

import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) { // Corrigido de "arg" para "args"
		Scanner scanner = new Scanner(System.in);
		int miniGames, calculators, pens;

		System.out.print("Digite a quantidade de mini-games: ");
		miniGames = scanner.nextInt();
		System.out.print("Digite a quantidade de calculadoras: ");
		calculators = scanner.nextInt();
		System.out.print("Digite a quantidade de canetas: ");
		pens = scanner.nextInt();
		scanner.close();

		double miniGamesValue = (double) miniGames * 6.95;
		double calculatorsValue = (double) calculators * 3.5;
		double pensValue = (double) pens * 1.2;
		double total = miniGamesValue + calculatorsValue + pensValue;

		System.out.printf("Mini-Games: %.2f%nCalculadoras: %.2f%nCanetas: %.2f%nTotal: %.2f",
				miniGamesValue, calculatorsValue, pensValue, total);
	}
}
