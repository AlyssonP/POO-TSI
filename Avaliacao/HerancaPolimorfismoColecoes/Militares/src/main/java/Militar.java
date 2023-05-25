public abstract class Militar implements Carreira{
    // Atributos
    private int matricula;
    private String patente;

    // Construtor
    public Militar(int matricula, String patente) {
        this.matricula = matricula;
        this.patente = patente;
    }

    // Métodos Get e Set
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }

    // toString
    public String toString() {
        return String.format("Mátricula: %d; Patente: %s;",matricula,patente);
    }
}
