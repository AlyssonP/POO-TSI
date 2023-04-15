package pessoa;

public class Funcionario extends Pessoa{
    // Atributos
    private float salario;

    // Construtor
    public Funcionario(String nome, String email, String telefone, String sexo, int idade, float salario) {
        super(nome, email, telefone, sexo, idade);
        this.salario = salario;
    }

    // Métodos Get e Set
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    // ToString
    public String toString() {
        return String.format(super.toString()+" Salário: %.2f;",salario);
    }
}

