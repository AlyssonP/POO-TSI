package Model.Repository;

import Model.Entity.Aluguel;
import Model.Entity.Hospede;
import Model.Entity.Quarto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author alyssonp
 */
public class AluguelRepository {
    private static final HospedeRepository hospedeRepository = new HospedeRepository();
    private static final QuartoRepository quartoRepository = new QuartoRepository();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private static final DateTimeFormatter formatterSemHora = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public boolean insertAluguel (Aluguel aluguel) {
        Quarto quarto = aluguel.getQuarto();
        if(quartoRepository.getQuarto(quarto.getCod()) == null) {
            return false;
        }
        
        Hospede hospede = aluguel.getHospede();
        if(hospedeRepository.getHospede(hospede.getCpf()) == null) {
            return false;
        }
        
        Connection connection = null;
        boolean isCadastrado = false;
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "INSERT INTO aluguel(cod_quarto, cpf_hospede, data_entrada, data_saida, pago, finalizado) VALUES ( ?, ?, ?, ?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setInt(1, quarto.getCod());
            preparedStatement.setString(2, hospede.getCpf());
            preparedStatement.setTimestamp(3, Timestamp.valueOf(aluguel.getDataHoraEntrada()));
            preparedStatement.setTimestamp(4, Timestamp.valueOf(aluguel.getDataHoraSaida()));
            preparedStatement.setBoolean( 5, aluguel.getPago());
            preparedStatement.setBoolean( 6, aluguel.getFinalizado());
            
            quartoRepository.alugarQuarto(quarto.getCod());
            
            preparedStatement.executeUpdate();
            isCadastrado = true;
        } catch(SQLException e) {
            System.err.println("Erro ao inserir dados do Aluguel: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return isCadastrado;
        }
    }
    
    public ArrayList<Aluguel> getAll() {
        ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();
        
        Connection connection = null;
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "Select * from aluguel";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                Hospede hospede = hospedeRepository.getHospede(resultSet.getString("cpf_hospede").strip());
                Quarto quarto = quartoRepository.getQuarto(resultSet.getInt("cod_quarto"));
                LocalDateTime entrada = resultSet.getTimestamp("data_entrada").toLocalDateTime();
                LocalDateTime saida = resultSet.getTimestamp("data_saida").toLocalDateTime();
                alugueis.add(new Aluguel(
                        resultSet.getInt("cod"),
                        hospede, 
                        quarto,
                        entrada.format(formatterSemHora),
                        saida.format(formatterSemHora),
                        resultSet.getBoolean("pago"),
                        resultSet.getBoolean("finalizado")
                ));
            }
            
        } catch(SQLException e) {
            System.err.println("Erro ao lista todos os quartos da residencia: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return alugueis;
        }
    }
    
    public Aluguel getAluguel(int cod) {
        Connection connection = null;
        Aluguel aluguel = null;
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "Select * from aluguel WHERE cod = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setInt(1, cod);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()) {
                
                Hospede hospede = hospedeRepository.getHospede(resultSet.getString("cpf_hospede"));
                Quarto quarto = quartoRepository.getQuarto(resultSet.getInt("cod_quarto"));
                LocalDateTime entrada = resultSet.getTimestamp("data_entrada").toLocalDateTime();
                LocalDateTime saida = resultSet.getTimestamp("data_saida").toLocalDateTime();
                aluguel = new Aluguel(
                        resultSet.getInt("cod"),
                        hospede, 
                        quarto,
                        entrada.format(formatterSemHora),
                        saida.format(formatterSemHora),
                        resultSet.getBoolean("pago"),
                        resultSet.getBoolean("finalizado")
                );
            }
            
        } catch(SQLException e) {
            System.err.println("Erro ao consultar dados do quarto: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return aluguel;
        }
    }
    
    public boolean updateAluguel(Aluguel aluguel) {
        Connection connection = null;
        
        if(getAluguel(aluguel.getCod()) == null) {
            return false;
        }
        
        Quarto quarto = aluguel.getQuarto();
        if(quartoRepository.getQuarto(quarto.getCod()) == null) {
            return false;
        }
        
        Hospede hospede = aluguel.getHospede();
        if(hospedeRepository.getHospede(hospede.getCpf()) == null) {
            return false;
        }
        
        boolean isUpdate = false;
        
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "UPDATE aluguel SET cod_quarto=?, cpf_hospede=?, data_entrada=?, data_saida=?, pago=?, finalizado=? WHERE cod=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setInt(1, quarto.getCod());
            preparedStatement.setString(2, hospede.getCpf());
            preparedStatement.setTimestamp(3, Timestamp.valueOf(aluguel.getDataHoraEntrada()));
            preparedStatement.setTimestamp(4, Timestamp.valueOf(aluguel.getDataHoraSaida()));
            preparedStatement.setBoolean( 5, aluguel.getPago());
            preparedStatement.setBoolean( 6, aluguel.getFinalizado());
            preparedStatement.setInt(7, aluguel.getCod());
            
            
            preparedStatement.executeUpdate();
            isUpdate = true;
        } catch(SQLException e) {
            System.err.println("Erro ao atualizar os dados do Aluguel: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return isUpdate;
        }
    }
    
    public boolean finalizarAluguel(Aluguel aluguel) {
        Connection connection = null;
        
        if(getAluguel(aluguel.getCod()) == null) {
            return false;
        }
        
        if(!aluguel.getPago()) {
            return false;
        }
        
        Quarto quarto = aluguel.getQuarto();
        if(quartoRepository.getQuarto(quarto.getCod()) == null) {
            return false;
        }
        
        boolean isFinalizado = false;
        
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "UPDATE aluguel SET finalizado=? WHERE cod = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setBoolean( 1, true);
            preparedStatement.setInt(2, aluguel.getCod());
            
            quartoRepository.disponibilizarQuarto(quarto.getCod());
            preparedStatement.executeUpdate();
            isFinalizado = true;
        } catch(SQLException e) {
            System.err.println("Erro ao finalizar o Aluguel: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return isFinalizado;
        }
    }
    
    public boolean deleteAluguel(int cod) {
        Connection connection = null;
        
        Aluguel aluguel = getAluguel(cod);
        if(aluguel == null) {
            return false;
        }
        
        boolean isDelete = false;
        
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "DELETE FROM aluguel WHERE cod = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setInt(1, cod);
            
            quartoRepository.disponibilizarQuarto(aluguel.getQuarto().getCod());
            
            preparedStatement.executeUpdate();
            isDelete = true;
        } catch(SQLException e) {
            System.err.println("Erro ao deletar Aluguel: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return isDelete;
        }
    }
}
