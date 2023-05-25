public class MilitarMarinha extends Militar{
    // Atributos
    private boolean participouConsertoAviao;

    // Construtor
    public MilitarMarinha(int matricula, String patente, boolean participouConsertoAviao) {
        super(matricula, patente);
        this.participouConsertoAviao = participouConsertoAviao;
    }

    // Método Get e Set
    public boolean getParticipouConsertoAviao() {
        return participouConsertoAviao;
    }
    public void setParticipouConsertoAviao(boolean participouConsertoAviao) {
        this.participouConsertoAviao = participouConsertoAviao;
    }

    // Método da interface
    public boolean podeProgredir() {
        if(participouConsertoAviao) {
            return true;
        }
        return false;
    }

    // toString
    public String toString() {
        return String.format(super.toString() + " Participou de Conserto de um Avião? %s;",participouConsertoAviao);
    }
}








