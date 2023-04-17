package exercicio3;

// Classe Amostra
public class Amostra {
  private int codigoAmostra;
  private int conteudoCarbono;
  private int durezaRokwell;
  private int resistenciaTracao;

  public Amostra(int codigoAmostra, int conteudoCarbono, int durezaRokwell, int resistenciaTracao) {
    this.codigoAmostra = codigoAmostra;
    this.conteudoCarbono = conteudoCarbono;
    this.durezaRokwell = durezaRokwell;
    this.resistenciaTracao = resistenciaTracao;
  }

  public int informaGrau() {
    boolean teste1 = conteudoCarbono < 7;
    boolean teste2 = durezaRokwell > 50;
    boolean teste3 = resistenciaTracao > 80000;

    if (teste1 && teste2 && teste3) {
      return 10;
    } else if (teste1 && teste2) {
      return 9;
    } else if (teste1) {
      return 8;
    } else {
      return 7;
    }
  }
}