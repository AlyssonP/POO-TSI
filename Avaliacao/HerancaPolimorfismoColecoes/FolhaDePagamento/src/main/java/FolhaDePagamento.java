import java.util.HashSet;
import java.util.Set;
import java.util.HashSet;

public class FolhaDePagamento {
    // Atributos
    private Set<Empregado> funcionarios;

    // Construtor
    public FolhaDePagamento() {
        funcionarios = new HashSet<Empregado>();
    }

    // Métodos Especiais
    public void adicionarFuncionario(Empregado funcionario) {
        if(funcionarios.add(funcionario)) {
            System.out.printf("Funcionário(a) %s adicionado com sucesso!\n",funcionario.getNome());
        } else { System.out.println("Funcionário(a) já foi adcionado"); }
    }

    public void exibirTodos() {
        for(Empregado fun: funcionarios) {
            System.out.printf("Nome: %s; Vencimento: %.2f;\n",fun.getNome(),fun.vencimento());
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for(Empregado fun: funcionarios) {
            total += fun.vencimento();
        }
        return total;
    }
}
