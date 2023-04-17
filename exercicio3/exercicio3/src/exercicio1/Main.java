package exercicio1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o código do produto: ");
    int codigo = scanner.nextInt();

    System.out.println("Digite a quantidade do produto: ");
    int quantidade = scanner.nextInt();

    System.out.println("Digite o valor unitário do produto: ");
    double valorUnitario = scanner.nextDouble();

    System.out
        .println("Digite a forma de pagamento (1 - Dinheiro, 2 - Cheque, 3 - Cartão débito, 4 - Cartão crédito): ");
    int formaPagamento = scanner.nextInt();

    Produto produto = new Produto(codigo, quantidade, valorUnitario, formaPagamento);
    double desconto = produto.calculaDesconto() * 100;
    double valorFinal = produto.valorFinal();

    System.out.printf("O desconto aplicado foi de %.2f%%.%n", desconto);
    System.out.printf("O valor final a pagar é de R$ %.2f.%n", valorFinal);
  }
}