public class MilitarAeronautica extends Militar{
    // Atributos
    private int anosPatente, horasVoo;

    // Construtor
    public MilitarAeronautica(int matricula, String patente, int anosPatente, int horasVoo) {
        super(matricula, patente);
        this.anosPatente = anosPatente;
        this.horasVoo = horasVoo;
    }

    // Métodos Get e Set
    public int getAnosPatente() {
        return anosPatente;
    }
    public void setAnosPatente(int anosPatente) {
        this.anosPatente = anosPatente;
    }

    public int getHorasVoo() {
        return horasVoo;
    }
    public void setHorasVoo(int horasVoo) {
        this.horasVoo = horasVoo;
    }

    // Método da interface
    public boolean podeProgredir() {
        if(anosPatente > 2 && horasVoo > 100) {
            return true;
        }
        return false;
    }

    // toString
    public String toString() {
        return String.format(super.toString() + " Anos de Patente: %d; Horas de Voo: %d;",anosPatente,horasVoo);
    }
}
