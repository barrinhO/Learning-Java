package org.example;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("\nDigite um número: ");
    int number = scan.nextInt();

    // se o resto da divisão por 2 for 0
    if(number % 2 == 0){
      System.out.println("Número par");
    }
    else{
      System.out.println("Número ímpar");
    }

  }
}
