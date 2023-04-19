package tv;

public class Televisor implements ControleRemoto{
    //Atributos
    private int canal, volume;
    private boolean ligado;

    // Construtor
    public Televisor() {
        this.canal = 0;
        this.volume = 0;
        this.ligado = false;
    }

    public Televisor(int volume) {
        this.canal = 0;
        this.volume = volume;
        this.ligado = false;
    }

    // Métodos Get Set
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    // Métodos Especiais
    public void ligar() {
        if(!ligado) {
            ligado = true;
        }
    }

    public void desligar() {
        if(ligado) {
            ligado = false;
        }
    }

    public void aumentarVolume() {
        if (ligado && volume < 100) {
            volume += 1;
        }
        
    }

    public void diminuirVolume() {
        if (ligado && volume > 0) {
            volume -= 1;
        }
    }

    public void trocarCanal(int canal) {
        this.setCanal(canal);
    }
    // ToString
    public String toString() {
        if (!ligado) {
            return "Televisão desligada.";
        }
        return "Canal: "+canal+", Volume: "+volume+", Ligado: "+ligado;
    }

}
