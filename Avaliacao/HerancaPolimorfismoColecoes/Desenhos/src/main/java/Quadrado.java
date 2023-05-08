public class Quadrado implements Desenho{
    // Atributos
    private double lado;

    // Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Métodos Especiais
    public double calcularArea() {
        return (lado*lado);
    }
    public double calcularPerimetro() {
        return 4*lado;
    }

    // Polimorfismo
    public void desenhar() {
        System.out.printf("Desenhando um Quadrado: Lado: %.2f, Area: %.2f, Perimetro: %.2f.\n", lado,this.calcularArea(), this.calcularPerimetro());
    }
}
