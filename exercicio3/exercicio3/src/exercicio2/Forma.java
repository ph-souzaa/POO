package exercicio2;

// Classe Forma
public class Forma {
  private float ladoX;
  private float ladoY;
  private float ladoZ;

  public Forma(float ladoX, float ladoY, float ladoZ) {
    this.ladoX = ladoX;
    this.ladoY = ladoY;
    this.ladoZ = ladoZ;
  }

  public boolean verificaTriangulo() {
    return (ladoX < ladoY + ladoZ) && (ladoY < ladoX + ladoZ) && (ladoZ < ladoX + ladoY);
  }

  public String verificaForma() {
    if (!verificaTriangulo()) {
      return "Não é um triângulo";
    } else if (ladoX == ladoY && ladoY == ladoZ) {
      return "Triângulo Equilátero";
    } else if (ladoX == ladoY || ladoY == ladoZ || ladoX == ladoZ) {
      return "Triângulo Isósceles";
    } else {
      return "Triângulo Escaleno";
    }
  }
}