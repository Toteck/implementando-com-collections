package Optional.Funcionario;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class Employee {

    private final String admissao;

    private String demissao;

    public Employee(String admissao, String demissao) {
        this.admissao = admissao;
        this.demissao = demissao;
    }

    public String getAdmissao() {
        return admissao;
    }

    public String getDemissao() {
        return demissao;
    }

    public void setDemissao(String demissao) {
        this.demissao = demissao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return admissao.equals(employee.admissao) && demissao.equals(employee.demissao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(admissao, demissao);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "admissao='" + admissao + '\'' +
                ", demissao=" + demissao +
                '}';
    }
}
