package exercicio6;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite as coordenadas do ponto 1 (X1, Y1): ");
    float pontoX1 = scanner.nextFloat();
    float pontoY1 = scanner.nextFloat();

    System.out.println("Digite as coordenadas do ponto 2 (X2, Y2): ");
    float pontoX2 = scanner.nextFloat();
    float pontoY2 = scanner.nextFloat();

    Ponto ponto = new Ponto(pontoX1, pontoY1, pontoX2, pontoY2);
    float distancia = ponto.calculaDistancia();

    System.out.printf("A distância entre os dois pontos é: %.2f%n", distancia);
  }
}
