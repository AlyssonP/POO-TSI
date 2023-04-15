package mercadinho;

public class Mercadinho {
    // Atributos
    private Cliente[] clientes;
    private int indice;

    // Construtor
    public Mercadinho(int qtdCli) {
        this.clientes = new Cliente[qtdCli];
    }

    // Métodos Especiais
    public void adicionarCliente(Cliente cliente) {
        if(indice < clientes.length) {
            clientes[indice++] = cliente;
        } else {
            System.out.println("Já tem todos os clientes.");
        }
    }

    public double calcularTotal() {
        double valorTotal = 0;
        for(Cliente cliente : clientes) {
            if(cliente != null) {
                valorTotal += cliente.calculaPagamento();
            }
        }
        return valorTotal;
    }

    public void imprimirClientes() {
        for(Cliente cli: clientes) {
            if(cli != null) {
                System.out.println(cli.toString());
            }
        }
    }

    public void imprimirValorCompraClientes() {
        for(Cliente cli: clientes) {
            if(cli != null) {
                System.out.printf("Nome do Cliente: %s; Valor de Compra %.2f; Valor de Pagamento: %.2f\n", cli.getNome(), cli.getValorCompra(), cli.calculaPagamento());
            }
        }
    }
}
