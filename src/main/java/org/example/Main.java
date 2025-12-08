package org.example;

public class Main {
  public static void main(String[] args) {

      System.out.println("Hello");
      Car carro = new Car("Corolla", 2199, "roblox");
      carro.carInfo();
      /*carro.vrumvrum();
      * aqui por exemplo não é acessível pq o método ta privado*/

  }

}
