public class ContaDeAgua extends Conta {
    // Atributos
    private double consumoPorMetro, valorMetro;

    // Construtor
    public ContaDeAgua(String nomeCliente, int diaPagamento, double consumoPorMetro, double valorMetro) {
        super(nomeCliente, diaPagamento);
        this.consumoPorMetro = consumoPorMetro;
        this.valorMetro = valorMetro;
    }

    // Métodos Abstratos
    public double calcularValor() {
        return consumoPorMetro * valorMetro + 30;
    }

    // toString
    public String toString() {
        return String.format(super.toString() + " Consumo por Metro: %.2f; Valor por Metro: %.2f;", consumoPorMetro, valorMetro);
    }
}