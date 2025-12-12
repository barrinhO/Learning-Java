package org.example;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    String word = "PneuMoutraMicroscopicoSsilicoVulcanoConiotico";
    ArrayList<Character> vogais = new ArrayList<>();
    ArrayList<Character> vogaisEncontradas = new ArrayList<>();

    vogais.add('a');
    vogais.add('e');
    vogais.add('i');
    vogais.add('o');
    vogais.add('u');

    int countVogal = 0;

    for (int i = 0; i < word.length(); i++) {
      char letter = Character.toLowerCase(word.charAt(i));

      for (char vogal : vogais) {
        if (letter == vogal) {

          if (!vogaisEncontradas.contains(letter)) {
            vogaisEncontradas.add(letter);
            countVogal++;
          }
        }
      }
    }

    System.out.println("A palavra: " + word + "\nContém: " + countVogal + " vogais únicas");
  }
}
