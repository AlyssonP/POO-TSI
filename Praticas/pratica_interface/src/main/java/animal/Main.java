package animal;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Pretão", 0.5, 10.5);
        cachorro.animalSound();
        cachorro.run();
    }
}