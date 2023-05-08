public class Retangulo implements Desenho{
    // Atributos
    private double comprimento, largura;

    // Construtor
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    // Métodos Especiais
    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return (comprimento * 2) + (largura * 2);
    }

    // Polimorfismo
    public void desenhar() {
        System.out.printf("Desenhando um Retangulo: Comprimento: %.2f, Largura: %.2f, Área: %.2f, Perimetro: %.2f.\n", comprimento, largura, this.calcularArea(), this.calcularPerimetro());
    }
}
