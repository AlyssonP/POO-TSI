package Model.Entity;

import Model.Entity.Hospede;
import java.util.ArrayList;

public class CadastroHospede {
    // Atributos
    private ArrayList<Hospede> hospedes;

    // Construtor
    public CadastroHospede() {
        hospedes = new ArrayList<Hospede>();
    }

    // Métodos Especiais
    public boolean addHospede(Hospede residencia) {
        return hospedes.add(residencia);
    }

    // Métodos Get e Set
    public ArrayList<Hospede> getHospedes() {
        return hospedes;
    }
}
