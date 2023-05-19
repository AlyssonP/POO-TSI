public class ContaDeEnergia extends Conta {
    // Atributos
    private double consumoEmKwh, tarifaPorKwh;

    // Contrutor
    public ContaDeEnergia(String nomeCliente, int diaPagamento, double consumoEmKwh, double tarifaPorKwh) {
        super(nomeCliente, diaPagamento);
        this.consumoEmKwh = consumoEmKwh;
        this.tarifaPorKwh = tarifaPorKwh;
    }

    // Métodos Abstratos
    public double calcularValor() {
        return consumoEmKwh * tarifaPorKwh + 22;
    }

    // toString
    public String toString() {
        return String.format(super.toString() + " Consumo em Kwh: %.2f; Tarifa por Kwh: %.2f;", consumoEmKwh, tarifaPorKwh);
    }

}