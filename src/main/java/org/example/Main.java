package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    
    int actual_number = 1;

    while(actual_number != 0){
      try{

        System.out.println("\nDigite um número: ");
        int typedNumber = scan.nextInt();

        actual_number = typedNumber;

        numbers.add(actual_number);

        System.out.println("\nNúmero digitado: " + actual_number);
      }
      catch (InputMismatchException err){
        System.out.println("Digite números não string: " + err );
        break;
      }
    }

    System.out.println("\nNúmeros da lista: ");


    int soma = 0;
    for(int num : numbers){
      soma += num;
      System.out.println(num);
    }

    System.out.println("Soma: " + soma);

  }
}
