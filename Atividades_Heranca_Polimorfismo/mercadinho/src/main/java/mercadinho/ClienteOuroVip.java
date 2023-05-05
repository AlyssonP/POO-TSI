package mercadinho;

public class ClienteOuroVip extends ClienteVip {
    // Atributos
    private String endereco;

    // Construtor
    public ClienteOuroVip(String nome, double valorCompra, String numeroCartao, String endereco) {
        super(nome, valorCompra, numeroCartao);
        this.endereco = endereco;
    }

    // Polimorfismo
    public double calculaPagamento() {
        return super.getValorCompra() - (super.getValorCompra()*0.15);
    }
    // Sobrescrita
    public String toString() {
        return String.format(super.toString()+" Endereço: %s;", endereco);
    }
}
