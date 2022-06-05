package StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>(){{
            add(new Aluno("Pedro", 22));
            add(new Aluno("Mateus", 22));
            add(new Aluno("Thayse", 23));
            add(new Aluno("Marcelo", 25));
            add(new Aluno("Carla", 24));
            add(new Aluno("Juliano", 19));
            add(new Aluno("Thiago", 20));
            add(new Aluno("Rafael", 27));
            add(new Aluno("Brunilda", 18));
        }};

        // Transforme cada estudante em uma string com os atributos do objeto
        alunos.stream().forEach(entry -> System.out.println(entry.getNome() + " - " + entry.getIdade()));

        // Conte a quantidade de estudantes tem na coleção
        System.out.println("Quanditade de estudantes na coleção: " + alunos.stream().count());

        // Filtre estudantes com idade igual ou superior a 22 anos
        System.out.println("Filtre estudantes com idade igual ou superior a 22");
        alunos.stream().filter(aluno -> aluno.getIdade() > 22).forEach(aluno -> System.out.println(aluno.getNome() + " - " + aluno.getIdade()));

        // Retorne os estudantes com nome que possui a letra B
        System.out.println("Retorne estudantes com nome que possui a letra B");
        alunos.stream().filter(aluno -> aluno.getNome().toLowerCase().contains("b")).forEach(aluno -> System.out.println(aluno.getNome() + " - " + aluno.getIdade()));

        System.out.println("Retorna se existe ao menos um estudante com a letra D no nome: " +
                alunos.stream().anyMatch(aluno -> aluno.getNome().toLowerCase().contains("d")));

        System.out.println("Retorne o estudante mais velho e o mais novo também");
        Aluno alunoMaisVelho = alunos.stream().max(Comparator.comparingInt(Aluno::getIdade)).get();
        Aluno alunoMaisNovo = alunos.stream().min(Comparator.comparingInt(Aluno::getIdade)).get();
        System.out.println("Nome: " + alunoMaisVelho.getNome() + " Idade: " + alunoMaisVelho.getIdade());
        System.out.println("Nome: " + alunoMaisNovo.getNome() + " Idade: " + alunoMaisNovo.getIdade());



    }
}
