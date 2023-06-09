package exercicio6;

public class Ponto {
  private float pontoX1;
  private float pontoY1;
  private float pontoX2;
  private float pontoY2;

  public Ponto(float pontoX1, float pontoY1, float pontoX2, float pontoY2) {
    this.pontoX1 = pontoX1;
    this.pontoY1 = pontoY1;
    this.pontoX2 = pontoX2;
    this.pontoY2 = pontoY2;
  }

  public float calculaDistancia() {
    float distancia = (float) Math
        .sqrt((pontoX2 - pontoX1) * (pontoX2 - pontoX1) + (pontoY2 - pontoY1) * (pontoY2 - pontoY1));
    return distancia;
  }
}
