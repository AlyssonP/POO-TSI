public class MilitarExercito extends Militar{
    // Atributos
    private boolean participouGuerra, ganhouGuerra;

    // Construtor
    public MilitarExercito(int matricula, String patente, boolean participouGuerra, boolean ganhouGuerra) {
        super(matricula, patente);
        this.participouGuerra = participouGuerra;
        this.ganhouGuerra = ganhouGuerra;
    }

    // Método Get e Set
    public boolean getParticipouGuerra() {
        return participouGuerra;
    }
    public void setParticipouGuerra(boolean participouGuerra) {
        this.participouGuerra = participouGuerra;
    }

    public boolean getGanhouGuerra() {
        return ganhouGuerra;
    }
    public void setGanhouGuerra(boolean ganhouGuerra) {
        this.ganhouGuerra = ganhouGuerra;
    }

    // Método da interface
    public boolean podeProgredir() {
        if(participouGuerra && ganhouGuerra) {
            return true;
        }
        return false;
    }

    // toString
    public String toString() {
        return String.format(super.toString() + " Participou de Guerra? %s; Ganhou uma Guerra? %s;",participouGuerra,ganhouGuerra);
    }
}
