public class Pessoa implements Desenho{
    // Atributos
    private String nome;

    // Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Polimorfismo
    public void desenhar() {
        System.out.printf("Desenhando uma Pessoa: Nome %s.\n",nome);
    }
}
