package Comparators.Brasil;

import java.util.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        List<Estado> brasil = new ArrayList<>();

        brasil.add(new Estado("Alagoas", "Maceió", 3322820));
        brasil.add(new Estado("Bahia", "Salvador", 14812617));
        brasil.add(new Estado("Ceará", "Fortaleza", 9075649));
        brasil.add(new Estado("Maranhão", "São Luís", 7035055));

        System.out.println("--- Ordem de Inserção ---");
        System.out.println("Estado\t\tCapital\t\tPopulacao");
        for (Estado estado : brasil) {
            System.out.println(estado.getNome() + " - " + estado.getCapital() + " - " + estado.getPopolacao());
        }

        System.out.println("--- Ordene implementando a interface java.util.Comparator no seu objeto complexo (Populacao - Decrescente) ---");
        Collections.sort(brasil, new EstadoOrdemReversaComparator()); // Usando comparator
        System.out.println("Estado\t\tCapital\t\tPopulacao");
        for (Estado estado : brasil) {
            System.out.println(estado.getNome() + " - " + estado.getCapital() + " - " + estado.getPopolacao());
        }

        System.out.println("--- Ordene implementando um novo objeto com a interface java.util.Comparable (Populacao - Crescente)---");
        Collections.sort(brasil); // Usando o Comparable
        System.out.println("Estado\t\tCapital\t\tPopulacao");
        for (Estado estado : brasil) {
            System.out.println(estado.getNome() + " - " + estado.getCapital() + " - " + estado.getPopolacao());
        }


        System.out.println("--- Ordene sua lista usando uma expressão lambda na chama de sua suaLista.sort() (Nome do Estado - Ordem Alfabetica)---");
        brasil.sort((first, second) -> first.getNome().compareToIgnoreCase(second.getNome()));
        for (Estado estado : brasil) {
            System.out.println(estado.getNome() + " - " + estado.getCapital() + " - " + estado.getPopolacao());
        }

        System.out.println("--- Ordenação por população usando Method Reference (Nome da Capital) ---");
        brasil.sort(Comparator.comparing(new Function<Estado, String>() {
            @Override
            public String apply(Estado estado) {
                return estado.getCapital();
            }
        }));
        for (Estado estado : brasil) {
            System.out.println(estado.getNome() + " - " + estado.getCapital() + " - " + estado.getPopolacao());
        }

        System.out.println("--- Ordenação por ordem Alfabética TreeSet (Ordem Natural)---");
        Set<Estado> brasilOrdenadoAlfabeticamente = new TreeSet<>(brasil); // A ordem Natural é de acordo a estabelecida na criação do projeto
        for (Estado estado : brasilOrdenadoAlfabeticamente) {
            System.out.println(estado.getNome() + " - " + estado.getCapital() + " - " + estado.getPopolacao());
        }

        System.out.println("--- Ordenação de um Map (Ordenação por key) ---");
        Map<Integer, Estado> brasil3 = new TreeMap<>();
        brasil3.put(0, brasil.get(0));
        brasil3.put(1, brasil.get(1));
        brasil3.put(2, brasil.get(2));
        brasil3.put(3, brasil.get(3));
        for(Map.Entry<Integer, Estado> estado : brasil3.entrySet())
            System.out.println(estado.getKey() + " - " + estado.getValue().getNome()
                    + " - " + estado.getValue().getCapital()
                    + " - " + estado.getValue().getPopolacao());

        System.out.println("--- Ordenação de um Map (Ordenação Key) Reversa");
        Map<Integer, Estado> brasil4 = new TreeMap<>(Collections.reverseOrder());

        brasil4.put(0, brasil.get(0));
        brasil4.put(1, brasil.get(1));
        brasil4.put(2, brasil.get(2));
        brasil4.put(3, brasil.get(3));

        for(Map.Entry<Integer, Estado> estado : brasil4.entrySet())
            System.out.println(estado.getKey() + " - " + estado.getValue().getNome() + " - " + estado.getValue().getCapital() + " - " + estado.getValue().getPopolacao());

    }
}

