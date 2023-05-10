public class FreteExpresso extends Frete {
    // Atributos
    private int nivelUrgencia;

    // Construtor
    public FreteExpresso(double distancia, double precoKm, int nivelUrgencia) {
        super(distancia, precoKm);
        this.nivelUrgencia = nivelUrgencia;
    }

    // Métodos Get e Set
    public int getNivelUrgencia() {
        return nivelUrgencia;
    }
    public void setNivelUrgencia(int nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }

    // Método Abstrato
    public double calcularFrete() {
        return (super.getDistancia() * super.getPrecoKm()) + (nivelUrgencia * 100);
    }

    // ToString
    public String toString() {
        return String.format(super.toString() + " Nivel de Urgencia: %d; Valor Frete: %.2f;", nivelUrgencia, this.calcularFrete() );
    }
}