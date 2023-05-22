package exercicio5;

public class Massa {
  public float massaInicial;
  public float massaFinal;
  public int tempo;

  public Massa(float massaInicial) {
    this.massaInicial = massaInicial;
    this.massaFinal = massaInicial;
    this.tempo = 0;
  }

  public void calculaTempo() {
    while (massaFinal >= 0.5) {
      massaFinal /= 2;
      tempo += 50;
    }
  }

  public float getMassaInicial() {
    return massaInicial;
  }

  public float getMassaFinal() {
    return massaFinal;
  }

  public int getTempo() {
    return tempo;
  }
}
