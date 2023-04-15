package mercadinho;

public abstract class Cliente {
    // Atributos
    private String nome;
    private double valorCompra;

    // Construtor
    public Cliente(String nome, double valorCompra) {
        this.nome = nome;
        this.valorCompra = valorCompra;
    }

    // Métodos Especiais
    public abstract double calculaPagamento();

    // Métodos Get e Set
    public String getNome() {
        return nome;
    }
    
    public double getValorCompra() {
        return valorCompra;
    }
    
    
    // ToString
    public String toString() {
        return String.format("Nome: %s; Valor de Compra: %.2f;", nome, valorCompra);
    }
}