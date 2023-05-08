public class Principal {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();

        Cachorro cachorro = new Cachorro();
        Animal galinha = new Galinha();
        Gato gato = new Gato();
        Animal papagaio = new Papagaio();

        zoo.adicionar(cachorro);
        zoo.adicionar(galinha);
        zoo.adicionar(gato);
        zoo.adicionar(papagaio);

        zoo.animarBicharada();

        zoo.exibirAnimalDoTipo("Cachorro");
        zoo.exibirAnimalDoTipo("Galinha");
        zoo.exibirAnimalDoTipo("Gato");
        zoo.exibirAnimalDoTipo("Papagaio");
        zoo.exibirAnimalDoTipo("Bode");
    }
}
