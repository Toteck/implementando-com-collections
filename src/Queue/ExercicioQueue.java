package Queue;

import java.util.*;

public class ExercicioQueue {

    public static void main(String[] args) {

        Queue<String> nomes = new LinkedList<>(){{
            add("Juliana");
            add("Pedro");
            add("Larissa");
            add("João");
        }};
        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("--------------");
        System.out.println(nomes.peek());
        System.out.println("--------------");
        System.out.println(nomes.poll());
        System.out.println("--------------");
        nomes.add("Daniel");
        List<String> nomes2 = new ArrayList<>();
        nomes2.addAll(nomes);
        System.out.println(nomes);
        System.out.println(nomes2.indexOf("Pedro"));
        System.out.println("--------------");
        System.out.println(nomes.size());
        System.out.println("--------------");
        System.out.println(nomes.isEmpty());
        System.out.println("--------------");
        System.out.println(nomes.contains("Carlos"));
    }
}
