package Comparators;

import java.util.*;

public class ComparatorExemplo {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>(){{}};
        estudantes.add(new Estudante("Pedro", 29));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("-- Ordem de Inserção --");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade()); // lambda

        System.out.println("--- Ordem Natural dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

        System.out.println("--- Ordem Reversa dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade)); // Reference Method

        System.out.println("--- Ordem Natural dos números - idade (method reference) ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("--- Ordem reversa dos números - idade (method reference) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes); // Só funciona se meu objeto implementar Comparable
        System.out.println(" --- Ordem Natural dos números - idade (interface Comparable) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemInversaComparator()); // O sort sobrecarregado desobriga a implementação do Comparable, mas precisa de um Comparator passado por parâmetro

        System.out.println("--- ordem reversa dos números - idade (interface Comparator) ---");
        System.out.println(estudantes);







    }
}
