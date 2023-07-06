package Model.Entity;

import java.util.ArrayList;
public class Residencia {
    // Atributos
    private String rua, bairro, telefone, email;
    private int cod, cep, numero;
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
    public Residencia(int cod, String rua,int numero,String bairro,int cep,String telefone,String email) {
        this.cod = cod;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.quartos = new ArrayList<Quarto>();
    }

    // Método Get e Set

    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    
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
    
    public String getEndereco() {
        return String.format("Rua: %s; Bairro: %s; n°: %d ;CEP: %d;", rua, bairro, numero, cep);
    }

    // toString
    public String toString() {
        return String.format("Rua: %s; Número: %d; Bairro: %s; Cep: %d; Telefone: %s; Email: %s;", rua, numero, bairro, cep, telefone, email);
    }

}
