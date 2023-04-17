package exercicio2;

// Classe Principal
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor do lado X: ");
    float ladoX = scanner.nextFloat();

    System.out.println("Digite o valor do lado Y: ");
    float ladoY = scanner.nextFloat();

    System.out.println("Digite o valor do lado Z: ");
    float ladoZ = scanner.nextFloat();

    Forma forma = new Forma(ladoX, ladoY, ladoZ);
    String resultado = forma.verificaForma();

    System.out.println(resultado);
  }
}
