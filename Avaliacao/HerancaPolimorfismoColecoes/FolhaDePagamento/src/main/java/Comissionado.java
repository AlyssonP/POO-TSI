public class Comissionado extends Empregado{
    // Atributos
    private double totalVendas, taxaComissao;

    // Construtor
    public Comissionado(String nome, String sobrenome, String cpf, double totalVendas, double taxaComissao) {
        super(nome, sobrenome, cpf);
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    // Métodos Get e Set
    public double getTotalVendas() {
        return totalVendas;
    }
    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }
    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    // Métodos Abstratos -> Obrigatório. Polimorfismo.
    public double vencimento() {
        return totalVendas * taxaComissao;
    }

    // toString -> Sobrescrita
    public String toString() {
        return String.format(super.toString()+" Total de vendas: %.2f; Taxa de comissão: %.2f; Vencimento: %.2f;\n",totalVendas,taxaComissao, this.vencimento());
    }
}
