import java.util.ArrayList;
public class CadastroFrete {
    // Atributos
    private ArrayList<Fretavel> fretes; 

    public CadastroFrete() {
        fretes = new ArrayList<Fretavel>();
    }

    public void adicionarFrete(Fretavel frete) {
        fretes.add(frete);
    }

    public double valorTotalFretes() {
        int sum = 0;
        for(Fretavel frete: fretes) {
            sum += frete.calcularFrete();
        }
        return sum;
    }

}