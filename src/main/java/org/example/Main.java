package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Float> notas = new ArrayList<>();


    System.out.println("Quantas notas são?\n");
    int qtdNotas = scan.nextInt();

    System.out.println("Qual a é a media?\n");
    float mediaEscolar = scan.nextFloat();

    System.out.println("Digite as " + qtdNotas + " notas\n");

    for(int i = 1; i <= qtdNotas; i++){
      float typedNota = scan.nextFloat();
      System.out.println("Nota"+ i + ": " + typedNota);
      notas.add(typedNota);
    }

    float total = 0;

    for(float notaLista : notas){
      total += notaLista;
    }

    float mediaFinal = total / qtdNotas;

    System.out.println("\nTotal de pontos: " + total);
    System.out.println("Média: " + total/qtdNotas + "\n");

    if(mediaFinal >= mediaEscolar){
      System.out.println("Você foi aprovado!");
    }
    else{
      System.out.println("Reprovado");
    }

  }
}
