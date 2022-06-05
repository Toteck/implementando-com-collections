package Optional;

import java.util.Optional;

public class ExemploOptionalJava {

    public static void main(String[] args) {

        // O optional é uma forma que ajuda a trabalhar com valores nulls
        // por exemplo você tem um funcionário com data de contratação mas não tem uma data de demissão
        // Então esse valor seria null no bd mas quando o java tenta acessar valores null da NullException
        // para resolver isso usamos o opcional
        Optional<String> optionalString = Optional.empty(); // dessa forma estou declarando que o meu válor é vazio
        // Optional<String> optionalString = Optional.of(null); dá erro

        System.out.println(optionalString.isPresent());
        System.out.println(optionalString.isEmpty());

        optionalString.ifPresent(System.out::println);

        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Valor não está presente"));

        if (optionalString.isPresent()) {
            String valor = optionalString.get();

            System.out.println(valor);
        }

        optionalString.map((valor) -> valor.concat("****")).ifPresent(System.out::println);

        System.out.println(optionalString.orElseThrow(IllegalStateException::new));



    }
}
