package mercadinho;

public class ClienteRegular extends Cliente {
    // Construtor
    public ClienteRegular(String nome, double valorCompra) {
        super(nome, valorCompra);
    }

    // Métodos Especiais
    public double calculaPagamento() {
        return super.getValorCompra();
    }

    
}