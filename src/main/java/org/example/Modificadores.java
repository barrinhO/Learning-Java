package org.example;

/*modificadores de acesso

basicamente PUBLIC, PRIVATE, PROTECTED

PUBLIC = o modificador public, deixa a classe ou método visível em todo o projeto, independente do package em que estiver

PRIVATE =  Uma classe sem modificador é package-private, ou seja, só pode ser acessada por outras classes dentro do mesmo package

Em métodos, caso seja PRIVATE, aquele método só será acessível a partir da própria classe, mesmo que haja outra classe dentro
do arquivo, ele não será acessado
Se houver um subpackage ela também não será vista

PROTECTED = Métodos e atributos podem ser acessados pela própria classe, por qualquer classe dentro do mesmo PACKAGE,
podem ser acessados por subclasses (com herança), mesmo que estejam em outro package.
e NÃO dá acesso entre “subpackages” — package e subpackage são totalmente independentes.

*/


public class Modificadores {

     public void chamarCarro(){
        Car carro1 = new Car("Robilox",1990, "talvez");
        carro1.carInfo();
        carro1.vrumvrum();
    }
}
