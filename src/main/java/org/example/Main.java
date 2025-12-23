package org.example;

public class Main {
  public static void main(String[] args) {
    // inverter uma palavra

    String word = "Java";
    String reverseString = "";

    // stringbuilder tb pode ser usado
    StringBuilder sb = new StringBuilder();

    for(int i = word.length() - 1; i >= 0; i--){
      reverseString = reverseString + word.charAt(i);
      sb.append(word.charAt(i));

    }
    System.out.println(reverseString);
    System.out.println(sb.toString());
  }
}
