import java.util.List;
import java.util.ArrayList;

public class Zoologico {
    private List<Animal> animais;
    public Zoologico(){
        animais = new ArrayList<Animal>();
    }

    public void adicionar(Animal animal){
        animais.add(animal);
    }

    public void exibirAnimalDoTipo(String tipo) {
        System.out.println("=-=-= Emissão do som do animal escolhido =-=-=");
        switch (tipo) {
            case "Cachorro":
                for (Animal animal: animais) {
                    if(animal.getClass() == Cachorro.class) {
                        animal.emitirSom();
                    }
                }
                break;
            case "Galinha":
                for (Animal animal: animais) {
                    if(animal.getClass() == Galinha.class) {
                        animal.emitirSom();
                    }
                }
                break;
            case "Gato":
                for (Animal animal: animais) {
                    if(animal.getClass() == Gato.class) {
                        animal.emitirSom();
                    }
                }
                break;
            case "Papagaio":
                for (Animal animal: animais) {
                    if(animal.getClass() == Papagaio.class) {
                        animal.emitirSom();
                    }
                }
                break;
            default:
                System.out.println("Tipo não existente.");
        }
    }

    public  void animarBicharada(){
        for (Animal animal : animais){
            animal.andar(); // Cada um faz do seu jeito
            animal.emitirSom(); //Polimorfismo
            animal.saltar();
        }
    }
}
