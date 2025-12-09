package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Scan {
    public static void main(String[] args){
        System.out.println("Teste da Silva 123\n");

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while(numbers.size() != 10){
            System.out.println("Digite um número\n");
            int addNumber = scan.nextInt();
            numbers.add(addNumber);
        }

        System.out.println("Tamanho do array: " + numbers.size() + "\n");
        System.out.println("Indices do array: ");

        for(int number: numbers){
            System.out.println(number);
        }
    }
}
