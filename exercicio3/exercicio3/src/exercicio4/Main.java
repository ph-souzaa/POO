package exercicio4;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor do lado A: ");
    float ladoA = scanner.nextFloat();

    System.out.println("Digite o valor do lado B: ");
    float ladoB = scanner.nextFloat();

    System.out.println("Digite o valor do lado C: ");
    float ladoC = scanner.nextFloat();

    Paralelepipedo paralelepipedo = new Paralelepipedo(ladoA, ladoB, ladoC);
    float diagonal = paralelepipedo.calculaDiagonal();

    System.out.printf("A diagonal do paralelepípedo é: %.2f%n", diagonal);
  }
}
