package exercicio6;

public class Produto {
  private float pontoX1;
  private float pontoY1;
  private float pontoX2;
  private float pontoY2;

  public Produto(float pontoX1, float pontoY1, float pontoX2, float pontoY2) {
    this.pontoX1 = pontoX1;
    this.pontoY1 = pontoY1;
    this.pontoX2 = pontoX2;
    this.pontoY2 = pontoY2;
  }

  public float calculaDistancia() {
    float deltaX = pontoX2 - pontoX1;
    float deltaY = pontoY2 - pontoY1;
    float distancia = (float) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    return distancia;
  }
}
