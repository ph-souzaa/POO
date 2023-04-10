package exercicio1;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double salarioBruto;

		System.out.print("Digite o salário bruto: ");
		salarioBruto = scanner.nextDouble();
		scanner.close();

		double salarioLiquido = salarioBruto - salarioBruto * 0.08;

		System.out.println("Salário líquido: " + salarioLiquido);
	}
}
