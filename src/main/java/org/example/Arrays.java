package org.example;

import java.util.ArrayList;

public class Arrays {
  public static void main(String[] args) {

    // Arrays no java podem ser declarados das seguintes formas
    //
    // com Array list
    ArrayList<String> people = new ArrayList<String>();

    people.add("Fernanda");
    people.add("Bárbara");
    people.add("Christian");
    people.add("Pedro");

    System.out.println("Pessoas da ArrayList: \n");
    for (int i = 0; i < people.size(); i++) {
      System.out.println(i + " - " + people.get(i));
    }
    System.out.println("\n");

    // inicializando com o tamanho

    String[] nomes = new String[10];

    nomes[0] = "Carlos";
    nomes[3] = "Josefa";
    nomes[2] = "Claudette";

    // o for que printa cada nome da lista de nomes
    System.out.println("Lista de nomes: \n");
    for (String nome : nomes) {
      System.err.println(nome);
    }

  }

}
