package exercicio3;

// Classe Principal
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o código da amostra: ");
    int codigoAmostra = scanner.nextInt();

    System.out.println("Digite o conteúdo de carbono: ");
    int conteudoCarbono = scanner.nextInt();

    System.out.println("Digite a dureza Rokwell: ");
    int durezaRokwell = scanner.nextInt();

    System.out.println("Digite a resistência à tração: ");
    int resistenciaTracao = scanner.nextInt();

    Amostra amostra = new Amostra(codigoAmostra, conteudoCarbono, durezaRokwell, resistenciaTracao);
    int grau = amostra.informaGrau();

    System.out.printf("A amostra de código %d possui grau %d.%n", codigoAmostra, grau);
  }
}