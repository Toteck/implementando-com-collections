package StreamApi;

import java.util.Objects;

public class Aluno {

    private String nome;
    private Integer idade;

    public Aluno(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return nome.equals(aluno.nome) && idade.equals(aluno.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
