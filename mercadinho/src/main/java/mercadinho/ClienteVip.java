package mercadinho;

public class ClienteVip extends Cliente {
    // Atributos
    private String numeroCartao;

    // Construtor
    public ClienteVip(String nome, double valorCompra, String numeroCartao) {
        super(nome, valorCompra);
        this.numeroCartao = numeroCartao;
    }

    // Métodos Especiais
    
    // Polimorfismo
    public double calculaPagamento() {
        return super.getValorCompra() - (super.getValorCompra()*0.10);
    }

    public String toString() {
        return String.format(super.toString()+" Número de Cartão: %s;", numeroCartao);
    }
}