package org.example;
import java.util.ArrayList;
// preciso nem falar nada ne aldkjaihfaskhfj
// basicamente if else, else if, else omai sheila

import com.sun.jdi.ArrayReference;

import javax.naming.PartialResultException;

public class Condicionais {
    public static void main(String[] args) {

        String personName = "Carlos";
        String personName2 = "Christian";

        if(personName == "Carlos"){
            System.out.println("O nome dele é carlos dhnaoidhaoifha");
        }
        else if(personName == personName2){
            System.out.println("O nome da primeira pessoa não é: " + personName2);
        }
        else{
            System.out.println("O nome dele não é carlos");
        }

        String[] ArrayNames = new String[3];

        ArrayNames[0] = "SenhorFarofa123CapaCapadoFreeFire";
        ArrayNames[1] = "Ronaldinho";
        ArrayNames[2] = "SenhorRobloxDoFreeFire";

        int nome_anterior = 0;


        for (String name : ArrayNames) {
            int nome_atual = name.length();

            System.out.println("Nome: " + name);
            System.out.println("Caracteres: " + name.length() + "\n");

            if (nome_atual == nome_anterior) {
                System.out.println("Mesma quantidade de caracteres do ultimo elemento");
            } else {
                System.out.println("Quantidade de caracteres diferente do ultimo elemento");
            }

            nome_anterior = nome_atual;

        }
    }
}