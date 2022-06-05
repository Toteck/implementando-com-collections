package Optional.Funcionario;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Employee mateus = new Employee("01/09/22", null);
        Optional<String> demissao = Optional.ofNullable(mateus.getDemissao());
        demissao.ifPresentOrElse(System.out::println, () -> System.out.println("Optional Vazio"));
        // Se vazio lançe uma exceção IllegalStateException
        //System.out.println(demissao.orElseThrow(IllegalStateException::new));

        mateus.setDemissao("02/09/22");

        demissao = Optional.of(mateus.getDemissao());
        demissao.ifPresent(System.out::println);








    }
}

