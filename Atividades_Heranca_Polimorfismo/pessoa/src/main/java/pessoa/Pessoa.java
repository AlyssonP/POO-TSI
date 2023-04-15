package pessoa;

public abstract class Pessoa {
    // Atributos
    private String nome, email, telefone, sexo;
    private int idade;

    // Construtor
    public Pessoa(String nome, String email, String telefone, String sexo, int idade) {
        this.nome = nome;
        this.email= email;
        this.telefone = telefone;
        this.sexo = sexo;
        this.idade = idade;
    }

    // ToString
    public String toString() {
        return String.format("Nome: %s; Email: %s; Telefone: %s; Sexo: %s; Idade: %d;",nome,email,telefone,sexo,idade);

    }
}
