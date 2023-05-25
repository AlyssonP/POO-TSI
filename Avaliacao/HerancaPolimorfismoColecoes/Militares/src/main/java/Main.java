public class Main {
    public static void main(String[] args) {
        CadastroMilitar militares = new CadastroMilitar();

        Carreira militar01 = new MilitarAeronautica(01,"Soldado", 3,140);
        Carreira militar02 = new MilitarExercito(02,"Cabo",true,true);
        Carreira militar03 = new MilitarMarinha(03,"Cabo", false);

        // Registrando militares
        militares.addMilitar(militar01);
        militares.addMilitar(militar02);
        militares.addMilitar(militar03);

        // Show All militares
        System.out.println("Militares cadastrados.");
        militares.showAll();

        // Militares que podem progredir
        System.out.println("\nMilitares que podem progredir:");
        militares.imprimirPodeProgredir();

        // Progredir militares
        militares.realizarProgressao();

        System.out.println("\nExibisão dos militares depois de progressão de patente:");
        militares.showAll();
    }
}
