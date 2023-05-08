public class Horista extends Empregado{
    // Atributos
    private double precoHora, horasTrabalhadas;

    // Construtor
    public Horista(String nome, String sobrenome, String cpf, double precoHora, double horasTrabalhadas) {
        super(nome, sobrenome, cpf);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Métodos Get e Set
    public double getPrecoHora() {
        return precoHora;
    }
    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Métodos Abstratos -> Obrigatórios. Polimorfismo.
    public double vencimento() {
        return horasTrabalhadas * precoHora;
    }

    // toStirng -> Sobrescrita
    public String toString() {
        return String.format(super.toString()+" Horas Trabalhadas: %.2f; Preço por Hora: %.2f; Vencimento: %.2f\n",horasTrabalhadas,precoHora,this.vencimento());
    }
}
