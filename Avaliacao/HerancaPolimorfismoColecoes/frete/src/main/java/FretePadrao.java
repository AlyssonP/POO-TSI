public class FretePadrao extends Frete {
    // Construtor
    public FretePadrao(double distancia, double precoKm) {
        super(distancia, precoKm);
    }

    // Método Abstrato
    public double calcularFrete() {
        return super.getDistancia() * super.getPrecoKm();
    }

    public String toString() {
        return String.format(super.toString() + " Valor Frete: %.2f;", this.calcularFrete() );
    }

}