package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    int number = rand.nextInt(10) + 1;

    int tentativas = 3;

    while (tentativas > 0) {
      System.out.println("Digite o número:");
      int typedNumber = scan.nextInt();

      if (typedNumber == number) {
        System.out.println("Você acertou! O número era: " + number);
        break;
      } else {
        tentativas--;
        System.out.println("Errou! Restam " + tentativas + " tentativas");
      }
    }

    if (tentativas == 0) {
      System.out.println("Fim de jogo! O número era: " + number);
    }

    }
  }
