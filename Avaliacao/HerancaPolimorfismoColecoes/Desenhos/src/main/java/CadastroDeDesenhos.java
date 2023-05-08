import java.util.ArrayList;

public class CadastroDeDesenhos {
    private ArrayList<Desenho> desenhos;

    public CadastroDeDesenhos() {
        this.desenhos = new ArrayList<Desenho>();
    }
    public void desenharDesenho(Desenho desenho) {
        this.desenhos.add(desenho);
    }

    public void desenharTodos() {
        for(Desenho desenho: desenhos) {
            // Polimorfismo
            desenho.desenhar();
        }
    }
}
