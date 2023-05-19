public abstract class Conta implements Comparable<Conta>{
    // Atributos
    private String nomeCliente;
    private int diaPagamento;

    // Contrutor
    public Conta(String nomeCliente, int diaPagamento) {
        this.nomeCliente = nomeCliente;
        this.diaPagamento = diaPagamento;
    }

    // Atributos Abstratos
    public abstract double calcularValor();

    // Métodos Get e Set
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeClinte(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getDiaPagamento() {
        return diaPagamento;
    }
    public void setDiaPagamento(int diaPagamento) {
        this.diaPagamento = diaPagamento;
    }

    // Sobrescrita da interface Compárable
    public int compareTo(Conta conta) {
        return this.nomeCliente.compareTo(conta.getNomeCliente());
    }

    // ToString
    public String toString() {
        return String.format("Nome do Cliente: %s; Dia de Pagamento: %d;",nomeCliente, diaPagamento);
    }

}