package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    System.out.println("\nDigite 5 números: ");
    while(numbers.size() != 5){
      int typedNumber = scan.nextInt();
      numbers.add(typedNumber);
    }

    int maiorNumero = numbers.get(0);

    for(int num : numbers){

      if(num > maiorNumero){
        maiorNumero = num;
      }

    }

    System.out.println("Maior número: " + maiorNumero);

  }
}
