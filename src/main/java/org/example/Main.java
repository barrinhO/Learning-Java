package org.example;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um número pra visualizar sua tabuada de 0 a 10: ");
    int numero = scan.nextInt();

    for(int i = 0; i <= 10; i++){
      int result = numero * i;
      System.out.printf("%d x %d = %d%n", numero, i, result);
    }
  }
}
