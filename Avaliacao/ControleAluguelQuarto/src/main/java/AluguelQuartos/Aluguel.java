package AluguelQuartos;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
public class Aluguel {
    // Atributos
    private Hospede hospede;
    private Quarto quarto;
    private LocalDateTime dataHoraEntrada, dataHoraSaida;

    // Format Date
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    // Construtor
    public Aluguel(Hospede hospede, Quarto quarto, String dataHoraEntrada, String  dataHoraSaida) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataHoraEntrada = LocalDateTime.parse(dataHoraEntrada+" 12:00", formatter);
        this.dataHoraSaida = LocalDateTime.parse(dataHoraSaida+" 12:00", formatter);
    }
    // Métodos Get e Set
    public Hospede getHospede() { return hospede; }
    public void setHospede(Hospede hospede) { this.hospede = hospede; }

    public Quarto getQuarto() { return quarto; }
    public void setQuarto(Quarto quarto) { this.quarto = quarto; }

    public LocalDateTime getDataHoraEntrada() { return dataHoraEntrada; }

    public LocalDateTime getDataHoraSaida() { return dataHoraSaida; }

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
