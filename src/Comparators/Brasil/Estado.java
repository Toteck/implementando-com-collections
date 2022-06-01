package Comparators.Brasil;

import java.util.Objects;

public class Estado implements Comparable<Estado>{


    private final String nome;
    private final String capital;
    private Integer popolacao;

    public Estado(String nome, String capital, Integer popolacao) {
        this.nome = nome;
        this.capital = capital;
        this.popolacao = popolacao;
    }

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public Integer getPopolacao() {
        return popolacao;
    }

    public void setPopolacao(Integer popolacao) {
        this.popolacao = popolacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return nome.equals(estado.nome) && capital.equals(estado.capital) && popolacao.equals(estado.popolacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, capital, popolacao);
    }

    @Override
    public int compareTo(Estado o) {
        return this.getPopolacao() - o.getPopolacao(); // Dessa forma vai ordenar de forma ascendente
    }
}
