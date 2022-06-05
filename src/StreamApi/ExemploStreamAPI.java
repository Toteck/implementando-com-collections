package StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {

        // Cria uma coleção de estudantes
        List<String> estudantes = new ArrayList<>();

        // Adicione 4 estudantes para a coleção
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        // Retorna a contagem de elementos do stream
        System.out.println("Contagem " + estudantes.stream().count());

        // Retorna o elemento com o maior número de letras
        System.out.println("Maior nome: " + (estudantes.stream().max(Comparator.comparingInt(String::length)).get()));

        // Retorna o elemento com menor numero de letras, ou seja, menor nome
        System.out.println("Menor nome: " + estudantes.stream().min(Comparator.comparingInt(String::length)).get());

        // Retona o elemento que tem letra "r" no nome
        System.out.println("Nomes que tem a letra r: " + estudantes.stream().filter(estudante -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        // Retona uma nova coleção, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Retorna uma nova coleção com a quantidade de letras em cada nome: " +
                estudantes.stream()
                        .map(estudante -> estudante.concat(" - ")
                                .concat(String.valueOf(estudante.length())))
                        .collect(Collectors.toList()));

        // Retona somente os 3 primeiros elementos da coleção
        System.out.println(estudantes.stream().limit(3));

        // Exibe cada elemento no console e depois exibe a mesma coleção
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        // Exibe cada elemento no console sem retornar outra coleção
        System.out.println("Retona os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);
        
        // Retorna true se todos os elementos possuem a letra w no nome
        System.out.println("Todos os elementos tem W no nome" + estudantes.stream().allMatch((elemento) -> elemento.toLowerCase().contains("w")));

        // Retorna True se algumd dos elementos possuem a letra "a" minuscula no nome
        System.out.println("Tem algum elemento com a letra a minuscula no nome" + estudantes.stream().anyMatch((elemento) -> elemento.toLowerCase().contains("a")));

        // Retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        // Exemplo de operação encadeada
        System.out.println("Operação encadeada");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante -> estudante.concat(" - ")
                        .concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) -> estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));
        //      .collect(Collectors.joining(", "));
        //      .collect(Collectors.toSet()));
        //      .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1)));

    }
}
