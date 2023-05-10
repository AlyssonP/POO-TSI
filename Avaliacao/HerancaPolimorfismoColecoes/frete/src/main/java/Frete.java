public abstract class Frete implements Fretavel{
    // Atributos
    private double distancia, precoKm;

    // Construtor
    public Frete(double distancia, double precoKm) {
        this.distancia = distancia;
        this.precoKm = precoKm;
    }
    
    // Métodos Get e Set
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPrecoKm() {
        return precoKm;
    }
    public void setPrecoKm(double precoKm) {
        this.precoKm = precoKm;
    }

    // Métodos Especiais
    public abstract double calcularFrete();

    // ToString -> Polimorfismo (Sobrescrita)
    public String toString() {
        return String.format("Distancia em KM: %.2f; Preço por KM: %.2f;", distancia, precoKm);
    }
    
}