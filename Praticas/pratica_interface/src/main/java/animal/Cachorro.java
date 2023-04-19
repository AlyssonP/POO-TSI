package animal;

public class Cachorro implements Animal{
    // Atributos
    private String cor;
    private double altura, peso;

    // Construtor
    public Cachorro(String cor, double altura, double peso) {
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
    }

    public void run() {
        System.out.println("Saia da frente que ele está doido kkk");
    }

    public void animalSound() {
        System.out.println("Au Au Au");
    }

    public String getCor() {
        return cor;
    }
    
}
