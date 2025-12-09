package org.example;
import interfaces.Carro;
import interfaces.Civic;
import interfaces.Mobi;

public class Main {
  public static void main(String[] args) {
      // interface Carro

      Carro meuCarro = new Civic();
      Carro meuCarro2 = new Mobi();

      meuCarro.acelerar();
      meuCarro.frear();
      meuCarro.parar();

      meuCarro2.acelerar();
      meuCarro2.frear();
      meuCarro2.parar();
  }

}
