import java.util.ArrayList;

public class CadastroMilitar {
    // Atributos
    private ArrayList<Carreira> militares;

    // Construto
    public CadastroMilitar() {
        this.militares = new ArrayList<Carreira>();
    }

    // Métodos Especiais
    public void addMilitar(Carreira militar) {
        militares.add(militar);
    }

    public void imprimirPodeProgredir() {
        for(Carreira militar: militares) {
            // Polimorfismo
            if(militar.podeProgredir()) {
                System.out.println(militar);
            }
        }
    }

    public void realizarProgressao() {
        for( Carreira militar: militares) {
            // Polimorfismo
            if(militar.podeProgredir()) {
                if(militar.getPatente() == "Soldado") {
                    militar.setPatente("Cabo");
                } else if (militar.getPatente() == "Cabo") {
                    militar.setPatente("Tenente");
                }
            }
        }
    }

    // Exibir todos os militares
    public void showAll() {
        for(Carreira militar: militares) {
            System.out.println(militar);
        }
    }
}






