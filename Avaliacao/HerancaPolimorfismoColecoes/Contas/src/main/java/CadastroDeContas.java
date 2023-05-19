import java.util.Set;
import java.util.TreeSet;
public class CadastroDeContas {
    // Atributos
    private Set<Conta> contas;

    // Construtor
    public CadastroDeContas() {
        this.contas = new TreeSet<Conta>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void ExibirContas() {
        for(Conta conta: contas) {
            System.out.println(conta);
        }
    }

    public Conta buscarContaPorNome(String nomeCliente) {
        for(Conta conta: contas) {
            if(conta.getNomeCliente().equals(nomeCliente)) {
                return conta;
            }
        }
        return null;
    }

    public double valorTotalContas() {
        double valorTot = 0;
        for(Conta conta: contas) {
            // Polimorfismo acontece aqui!!
            valorTot += conta.calcularValor();
        }
        return valorTot;
    }
}