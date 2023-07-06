package Model.Entity;

import Model.Entity.Aluguel;

import java.util.ArrayList;

public class CadastroAluguel {
    // Atributos
    private ArrayList<Aluguel> alugueis;

    // Construtor
    public CadastroAluguel() {
        alugueis = new ArrayList<Aluguel>();
    }

    // Métodos Especiais
    public boolean addAluguel(Aluguel residencia) {
        return alugueis.add(residencia);
    }

    // Métodos Get e Set
    public ArrayList<Aluguel> getAlugueis() {
        return alugueis;
    }
}
