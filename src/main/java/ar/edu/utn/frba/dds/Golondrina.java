package ar.edu.utn.frba.dds;

public class Golondrina {

  private int energia;

  public Golondrina(int energia) {
    this.energia = energia;
  }

  public int getEnergia() {
    return energia;
  }

  public void setEnergia(int energia) {
    this.energia = energia;
  }

  public void comer(int calorias) {
    this.energia += calorias * 3;
  }

  public void volar() {
    this.energia -= 10;
  }

}
