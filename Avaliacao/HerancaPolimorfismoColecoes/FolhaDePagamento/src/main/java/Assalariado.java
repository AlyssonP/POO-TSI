public class Assalariado extends Empregado{
    // Atributos
    private double salario;

    // Construtor
    public Assalariado(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }

    // Metodos Get e Set
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Métodos Abstrato -> Obrigatórios. Polimorfismo.
    public double vencimento() {
        return salario;
    }

    // toString -> Sobrescrita
    public String toString() {
        return String.format(super.toString()+" Salário: %.2f; Vencimento: %.2f;\n",salario, this.vencimento());
    }

}

