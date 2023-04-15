package mercadinho;

public class Main {
    public static void main(String[] args) {
        Cliente cli01 = new ClienteRegular("Maria",235.50);
        Cliente cli02 = new ClienteVip("João",369.80,"1234 5678 9101 1213");
        Cliente cli03 = new ClienteOuroVip("Alysson",369.80,"1111 2222 3333 4444", "Guarabira");

        Mercadinho mercadinho = new Mercadinho(4);
        mercadinho.adicionarCliente(cli01);
        mercadinho.adicionarCliente(cli02);
        mercadinho.adicionarCliente(cli03);

        
        System.out.println("=+=+= Clientes do Mercadinho =+=+=");
        mercadinho.imprimirClientes();

        System.out.println("=+=+= Compras dos clientes =+=+=");
        mercadinho.imprimirValorCompraClientes();
        
        System.out.printf("Valor total das compras: %.2f\n",mercadinho.calcularTotal());
        
  }
}
