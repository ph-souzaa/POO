package exercicio1;

public class Produto {
  private int codigo;
  private int quantidade;
  private double valorUnitario;
  private int formaPagamento;

  public Produto(int codigo, int quantidade, double valorUnitario, int formaPagamento) {
    this.codigo = codigo;
    this.quantidade = quantidade;
    this.valorUnitario = valorUnitario;
    this.formaPagamento = formaPagamento;
  }

  public double calculaDesconto() {
    double desconto = 0;
    switch (formaPagamento) {
      case 1: // Dinheiro
        desconto = 0.10;
        break;
      case 2: // Cheque
        desconto = 0.02;
        break;
      case 3: // Cartão débito
        desconto = 0;
        break;
      case 4: // Cartão crédito
        desconto = 0.05;
        break;
      default:
        System.out.println("Forma de pagamento inválida!");
        break;
    }
    return desconto;
  }

  public double valorFinal() {
    double total = quantidade * valorUnitario;
    double desconto = total * calculaDesconto();
    return total - desconto;
  }
}
