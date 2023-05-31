public class Hospede {
    // Atributos
    private String nome, cpf, endereco, celular, email;

    // Construtor
    public Hospede(String nome, String cpf, String endereco, String celular, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.celular = celular;
        this.email = email;
    }

    // Métodos Get e Set
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // toString
    public String toString() {
        return String.format("Nome: %s; CPF: %s; Endereço: %s; Celular: %s; Email: %s;",nome,cpf,endereco,celular,email);
    }
}
