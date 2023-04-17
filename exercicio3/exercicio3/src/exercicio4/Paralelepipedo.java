package exercicio4;

public class Paralelepipedo {
  private float ladoA;
  private float ladoB;
  private float ladoC;

  public Paralelepipedo(float ladoA, float ladoB, float ladoC) {
    this.ladoA = ladoA;
    this.ladoB = ladoB;
    this.ladoC = ladoC;
  }

  public float calculaDiagonal() {
    double l = Math.sqrt(ladoA * ladoA + ladoB * ladoB);
    double diagonal = Math.sqrt(l * l + ladoC * ladoC);
    return (float) diagonal;
  }
}