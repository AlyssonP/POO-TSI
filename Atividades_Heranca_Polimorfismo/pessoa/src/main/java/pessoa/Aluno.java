package pessoa;

public class Aluno extends Pessoa {
    // Atributos
    private String matricula;
    private float nota1, nota2;

    // Construtor
    public Aluno(String nome, String email,String telefone, String sexo, int idade, String matricula) {
        super(nome, email, telefone, sexo, idade);
        this.matricula = matricula;
        nota1 = nota2 = 0;
    }

    // Métodos Get e Set
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    // ToString
    public String toString() {
        return String.format(super.toString()+" Mátricula: %s; Nota 01: %.2f; Nota 02: %.2f;", matricula, nota1, nota2);
    }
}

