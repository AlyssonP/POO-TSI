package AluguelQuartos;

import java.util.ArrayList;

public class CadastroResidencia {
    // Atributos
    private ArrayList<Residencia> residencias;

    // Construtor
    public CadastroResidencia() {
        residencias = new ArrayList<Residencia>();
    }

    // Métodos Especiais
    public boolean addResidencia(Residencia residencia) {
        return residencias.add(residencia);
    }

    // Métodos Get e Set
    public ArrayList<Residencia> getResidencias() {
        return residencias;
    }
}
