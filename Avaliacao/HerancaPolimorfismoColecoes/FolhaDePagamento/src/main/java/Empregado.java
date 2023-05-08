public abstract class Empregado {
    // Atributos
    private String nome, sobrenome, cpf;

    // Construtor
    public Empregado(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    // Métodos Get e Set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Métodos Abstrato
    public abstract double vencimento();

    // toString
    public String toString() {
        return String.format("Nome: %s; Sobrenome: %s; CPF: %s;",nome, sobrenome, cpf);
    }
}