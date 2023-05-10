public class FreteSuperExpresso extends FreteExpresso {
    // Atributos
    private double porcentoSeguro;

    // Construtor
    public FreteSuperExpresso(double distancia, double precoKm, int nivelUrgencia, double porcentoSeguro) {
        super(distancia, precoKm, nivelUrgencia);
        this.porcentoSeguro = porcentoSeguro;
    }

    public double valorSeguro() {
        return super.calcularFrete() * (porcentoSeguro/100);
    }
    
    // Método Abstrato
    public double calcularFrete() {
        return super.calcularFrete() + this.valorSeguro();
    }

    // ToString
    public String toString() {
        return String.format("Distancia em KM: %.2f; Preço por KM: %.2f; Nivel de Urgencia: %d; Valor seguro: %.2f; Valor Frete: %.2f;", super.getDistancia(), super.getPrecoKm(), super.getNivelUrgencia(), this.valorSeguro(), this.calcularFrete());
    }
}