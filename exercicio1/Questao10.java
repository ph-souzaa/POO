package exercicio1;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) { // Corrigido de "arg" para "args"
		Scanner scanner = new Scanner(System.in);
		int victories, defeats, draws;

		System.out.print("Digite a quantidade de vitórias: ");
		victories = scanner.nextInt();
		System.out.print("Digite a quantidade de derrotas: ");
		defeats = scanner.nextInt();
		System.out.print("Digite a quantidade de empates: ");
		draws = scanner.nextInt();
		scanner.close();

		int games = victories + defeats + draws;
		int totalPointsAvailable = games * 3;
		int victoryPoints = victories * 3;
		int defeatPoints = defeats * 0;
		int drawPoints = draws * 1;
		int pointsWon = victoryPoints + defeatPoints + drawPoints;
		int pointsLost = totalPointsAvailable - pointsWon;

		System.out.printf("Jogos: %d%nPontos Disputados: %d%nPontos Ganhos: %d%nPontos Perdidos: %d%n",
				games, totalPointsAvailable, pointsWon, pointsLost);
	}
}
