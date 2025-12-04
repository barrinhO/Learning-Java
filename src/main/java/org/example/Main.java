package org.example;

// tipos de dados , int, short, byte, long, String, char
// condicionais, if, else, if else

public class Main {
  public static void main(String[] args) {
    Car myCar1 = new Car("Civic", 2023, "Civic - Manufacture");
    Car myCar2 = new Car("GOl bolinha", 1994, "Gol - Manufacture");
    Car myCar3 = new Car("Tucson", 2015, "Tucson - Manufacture");

    myCar1.carInfo();
    myCar2.carInfo();
    myCar3.carInfo();

    myCar1.vrumvrum();

    // HOLY MOLYYYYYYYYYYYYYYYYYYYYYYYYYYY
  }
}

// classe de um carro OMAGA!

class Car {

  String model;
  int year;
  String manufacture;

  public Car(String model, int year, String manufacture) {
    this.model = model;
    this.year = year;
    this.manufacture = manufacture;
  }

  // métodos

  public void vrumvrum() {
    System.out.println(this.model + " made vrum vrum!");
  }

  public void carInfo() {
    System.out.println("Model: " + this.model);
    System.out.println("Year: " + this.year);
    System.out.println("Manufacture: " + this.manufacture + "\n");
  }

}
