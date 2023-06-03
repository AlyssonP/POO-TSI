package AluguelQuartos;

public class Quarto {
    // Atributos
    private double valorDiaria;
    private int capacidadePessoas;
    private boolean arCondicionado, banheiraHidromassagem;

    // Construtor
    public Quarto(double valorDiaria, int capacidadePessoas, boolean arCondicionado, boolean banheiraHidromassagem) {
        this.valorDiaria = valorDiaria;
        this.capacidadePessoas = capacidadePessoas;
        this.arCondicionado = arCondicionado;
        this.banheiraHidromassagem = banheiraHidromassagem;
    }

    // Métodos Get e Set
    public double getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getCapacidadePessoa() {
        return capacidadePessoas;
    }
    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    public boolean getArcondicionado() {
        return arCondicionado;
    }
    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean getBanheiraHidromassagem() {
        return banheiraHidromassagem;
    }
    public void setBanheiraHidromassagem(boolean banheiraHidromassagem) {
        this.banheiraHidromassagem = banheiraHidromassagem;
    }

    // toString
    public String toString() {
        return String.format("Valor Diária: %.2f; Capacidade Máxima de Pessoa: %d; Tem Ar Condicionado? %s; Tem Banheira Hidromassagem? %s;",valorDiaria, capacidadePessoas, arCondicionado, banheiraHidromassagem);
    }
}
