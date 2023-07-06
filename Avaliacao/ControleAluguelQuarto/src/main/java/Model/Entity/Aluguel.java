package Model.Entity;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
public class Aluguel {
    // Atributos
    private int cod;
    private Hospede hospede;
    private Quarto quarto;
    private LocalDateTime dataHoraEntrada, dataHoraSaida;
    private boolean pago, finalizado;

    // Format Date
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    // Construtor
    public Aluguel(Hospede hospede, Quarto quarto, String dataHoraEntrada, String  dataHoraSaida, boolean pago) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataHoraEntrada = LocalDateTime.parse(dataHoraEntrada+" 12:00", formatter);
        this.dataHoraSaida = LocalDateTime.parse(dataHoraSaida+" 12:00", formatter);
        this.pago = pago;
        finalizado=false;
    }
    
    public Aluguel(int cod, Hospede hospede, Quarto quarto, String dataHoraEntrada, String  dataHoraSaida, boolean pago,boolean finalizado) {
        this.cod = cod;
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataHoraEntrada = LocalDateTime.parse(dataHoraEntrada+" 12:00", formatter);
        this.dataHoraSaida = LocalDateTime.parse(dataHoraSaida+" 12:00", formatter);
        this.pago = pago;
        this.finalizado = finalizado;
    }
    // Métodos Get e Set

    public boolean getPago() {
        return pago;
    }
    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public boolean getFinalizado() {
        return finalizado;
    }
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
    
    
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    
    public Hospede getHospede() { return hospede; }
    public void setHospede(Hospede hospede) { this.hospede = hospede; }

    public Quarto getQuarto() { return quarto; }
    public void setQuarto(Quarto quarto) { this.quarto = quarto; }

    public LocalDateTime getDataHoraEntrada() { return dataHoraEntrada; }
    public void setDataHoraEntrada(String dataHoraEntrada) {
        this.dataHoraEntrada =  LocalDateTime.parse(dataHoraEntrada+" 12:00", formatter);
    }
    
    public LocalDateTime getDataHoraSaida() { return dataHoraSaida; }
    public void setDataHoraSaida(String dataHoraSaida) {
        this.dataHoraSaida =  LocalDateTime.parse(dataHoraSaida+" 12:00", formatter);
    }
    // Método Especiais
    public int quantidadeDiaria() {
        return (int) ChronoUnit.DAYS.between(dataHoraEntrada, dataHoraSaida);
    }

    public double valorTotal() {
        return quarto.getValorDiaria() * this.quantidadeDiaria();
    }
    
    // toString
    public String toString() {
        return String.format("Nome hóspede: %s; Data e Hora de Entrada: %s; Data e Hora de Saída: %s; Quantidade de diárias: %d; Valor AluguelQuartos.Aluguel: %.2f;",hospede.getNome(),dataHoraEntrada.format(formatter),dataHoraSaida.format(formatter),this.quantidadeDiaria(), this.valorTotal());
    }
}
