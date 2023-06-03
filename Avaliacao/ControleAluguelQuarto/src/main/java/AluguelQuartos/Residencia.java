package AluguelQuartos;

import java.util.ArrayList;
public class Residencia {
    // Atributos
    private String rua, bairro, telefone, email;
    private int cep, numero;
    private ArrayList<Quarto> quartos;

    // Construtor
    public Residencia(String rua,int numero,String bairro,int cep,String telefone,String email) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.quartos = new ArrayList<Quarto>();
    }

    // Método Get e Set
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String Bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    // Métodos Especiais
    public boolean addQuarto(Quarto quarto) {
        return quartos.add(quarto);
    }

    // toString
    public String toString() {
        return String.format("Rua: %s; Número: %d; Bairro: %s; Cep: %d; Telefone: %s; Email: %s;", rua, numero, bairro, cep, telefone, email);
    }

}
