package org.example;

public class Args {

  public static void main(String[] args) {
    // esse 'args' do método main da classe é um array de Strings que recebe valores
    // passados na execução do
    // programa.
    // Exemplo de execução: java Args 10 20 -> args[0] = "10", args[1] = "20"

    // Convertendo os valores recebidos (que vêm como texto) para int
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);

    // Soma simples usando os valores recebidos por 'args'
    int resultado = x + y;

    System.out.println("Resultado da soma: " + resultado);

    // é bem bizarrinho, mas funciona e é interessante
    // util pra testar algumas coisas ao invés de criar um método

  }
}
