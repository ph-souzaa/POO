package exercicio5;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a massa inicial em gramas: ");
    float massaInicial = scanner.nextFloat();

    Massa massa = new Massa(massaInicial);
    massa.calculaTempo();

    System.out.printf("Massa inicial: %.2f g%n", massa.getMassaInicial());
    System.out.printf("Massa final: %.2f g%n", massa.getMassaFinal());
    System.out.printf("Tempo necessário: %d segundos%n", massa.getTempo());
  }
}