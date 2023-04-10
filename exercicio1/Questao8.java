package exercicio1;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) { // Corrigido de "arg" para "args"
		Scanner scanner = new Scanner(System.in);
		int maleStudents, femaleStudents, approvedStudents;

		System.out.print("Digite a quantidade de alunos: ");
		maleStudents = scanner.nextInt();
		System.out.print("Digite a quantidade de alunas: ");
		femaleStudents = scanner.nextInt();
		System.out.print("Digite a quantidade de aprovados: ");
		approvedStudents = scanner.nextInt();
		scanner.close();

		int totalStudents = maleStudents + femaleStudents;

		double malePercentage = (double) maleStudents / totalStudents;
		double femalePercentage = (double) femaleStudents / totalStudents;
		double approvedPercentage = (double) approvedStudents / totalStudents;

		System.out.printf(
				"Total de alunos: %d%nPorcentagem de alunos: %.2f%nPorcentagem de alunas: %.2f%nPorcentagem de aprovados: %.2f",
				totalStudents, malePercentage, femalePercentage, approvedPercentage);
	}
}
