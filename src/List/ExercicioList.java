package List;

import java.util.*;

public class ExercicioList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(){{
            add("Juliana");
            add("Pedro");
            add("Carlos");
            add("Larrisa");
            add("João");
        }};

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext())
            System.out.println(iterator.next());

        nomes.set(2, "Roberto");
        System.out.println("---------------");
        for (String s : nomes) {
            System.out.println(s);
        }

        System.out.println("---------------");
        System.out.println(nomes.get(1));
        System.out.println("---------------");
        nomes.remove(4);
        System.out.println(nomes);
        System.out.println("---------------");
        nomes.remove("João");
        System.out.println(nomes);

        System.out.println("---------------");
        System.out.println(nomes.size());
        System.out.println("---------------");
        System.out.println(nomes.contains("Juliano"));
        System.out.println("---------------");
        List<String> nomes2 = new ArrayList<>(){{
            add("Ismael");
            add("Rodrigo");
        }};
        nomes.addAll(nomes2);
        System.out.println(nomes);
        System.out.println("---------------");
        Collections.sort(nomes);
        System.out.println(nomes);
        System.out.println("---------------");
        System.out.println(nomes.isEmpty());

    }
}
