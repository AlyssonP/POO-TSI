public class Circulo implements Desenho{
    // Atributos
    private double raio, pi;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
        this.pi = 3.141516;
    }
    // Métodos Especiais
    public double calcularArea() {
        return (pi * raio * raio);
    }

    public double calcularPerimetro() {
        return (2 * pi * raio);
    }

    // Polimorfismo
    public void desenhar() {
        System.out.printf("Desenhando um Cículo: Raio: %.2f, Área: %.2f, Perimetro: %.2f.\n",raio, this.calcularArea(), this.calcularPerimetro());
    }
}
