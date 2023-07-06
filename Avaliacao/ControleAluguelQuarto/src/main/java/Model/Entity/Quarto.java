package Model.Entity;

public class Quarto {
    // Atributos
    private double valorDiaria;
    private int cod, capacidadePessoas;
    private boolean arCondicionado, banheiraHidromassagem, disponivel;

    // Construtor
    public Quarto(double valorDiaria, int capacidadePessoas, boolean arCondicionado, boolean banheiraHidromassagem) {
        this.valorDiaria = valorDiaria;
        this.capacidadePessoas = capacidadePessoas;
        this.arCondicionado = arCondicionado;
        this.banheiraHidromassagem = banheiraHidromassagem;
        disponivel = true;
    }
    public Quarto(int cod, double valorDiaria, int capacidadePessoas, boolean arCondicionado, boolean banheiraHidromassagem, boolean disponivel) {
        this.cod = cod;
        this.valorDiaria = valorDiaria;
        this.capacidadePessoas = capacidadePessoas;
        this.arCondicionado = arCondicionado;
        this.banheiraHidromassagem = banheiraHidromassagem;
        this.disponivel = disponivel;
    }
    
    // Métodos Get e Set
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }

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

    public boolean getIsDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    

    // toString
    public String toString() {
        return String.format("Valor Diária: %.2f; Capacidade Máxima de Pessoa: %d; Tem Ar Condicionado? %s; Tem Banheira Hidromassagem? %s;",valorDiaria, capacidadePessoas, arCondicionado, banheiraHidromassagem);
    }
}
