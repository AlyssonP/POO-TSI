package pessoa;

public class Professor extends Funcionario{
    // Atributos
    private String disciplina;

    // Construtor
    public Professor(String nome, String email, String telefone, String sexo, int idade, float salario, String disciplina) {
        super(nome, email, telefone, sexo, idade, salario);
        this.disciplina = disciplina;
    }

    // Métodos Get e Set
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    // ToString
    public String toString() {
        return String.format(super.toString()+" Disciplina: %s;",disciplina);
    }
}

