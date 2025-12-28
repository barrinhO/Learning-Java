package generics;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // LIST: aceita elementos duplicados e mantém a ordem de inserção
        List<String> list = new ArrayList<>();
        list.add("Chris");
        list.add("Bárbara");
        list.add("Lucas");

        System.out.println(list); // imprime todos os elementos da lista

        // SET: NÃO aceita elementos duplicados e NÃO garante ordem
        Set<String> setStrings = new HashSet<>();
        setStrings.add("Chris");
        setStrings.add("Bárbara");
        setStrings.add("Bárbara"); // duplicado, será ignorado

        System.out.println(setStrings); // imprime sem duplicatas
        System.out.println(setStrings.contains("Chris"));    // verifica se existe
        System.out.println(setStrings.contains("Bárbara")); // true
        System.out.println(setStrings.contains("ronaldo  ")); // false

        // MAP: funciona com chave e valor (key -> value)
        Map<String, String> map = new HashMap<>();
        map.put("name", "Chris");       // chave "name"
        map.put("surname", "Moreira");  // chave "surname"

        System.out.println(map.get("name")); // busca valor pela chave

        // QUEUE: segue a lógica FIFO (primeiro a entrar, primeiro a sair)
        Queue<String> queue = new LinkedList<>();
        queue.add("Chris");
        queue.add("Bárbara");

        System.out.println("Queue: " + queue);       // mostra a fila
        System.out.println("Queue: " + queue.peek()); // mostra o primeiro sem remover
        System.out.println("Queue: " + queue);       // fila continua igual

        // LINKEDLIST: lista baseada em nós, boa para inserções/remoções, possuí mais métodos
        LinkedList<String> linked = new LinkedList<>();
        linked.add("Chris");
        linked.add("Pedro");
        linked.add("Paulo");
        linked.add("Maria");
        linked.add("Melanie");
        linked.add("Miriam");
        linked.add("Bárbara");

        System.out.println(linked.getLast());
        System.out.println(linked.getFirst());
    }
}

