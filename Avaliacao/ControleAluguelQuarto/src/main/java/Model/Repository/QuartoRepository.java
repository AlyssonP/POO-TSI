package Model.Repository;

import Model.Entity.Quarto;
import Model.Entity.Residencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alyssonp
 */
public class QuartoRepository {
    private static final ResidenciaRepository residenciaRepository = new ResidenciaRepository();
    
    public boolean insertQuarto (Quarto quarto, int codResidencia) {
        Connection connection = null;
        
        if(residenciaRepository.getResidencia(codResidencia) == null) {
            return false;
        }
        
        boolean isCadastrado = false;
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "INSERT INTO quarto(cod_residencia, valor_diaria, capacidade_pessoas, ar_condicionado, banheira_hidromassagem, disponivel) VALUES ( ?, ?, ?, ?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setInt(1, codResidencia);
            preparedStatement.setDouble(2, quarto.getValorDiaria());
            preparedStatement.setInt(3, quarto.getCapacidadePessoa());
            preparedStatement.setBoolean(4, quarto.getArcondicionado());
            preparedStatement.setBoolean(5, quarto.getBanheiraHidromassagem());
            preparedStatement.setBoolean(6, quarto.getIsDisponivel());
            
            
            preparedStatement.executeUpdate();
            isCadastrado = true;
        } catch(SQLException e) {
            System.err.println("Erro ao inserir dados do quarto: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return isCadastrado;
        }
    }
    
    public ArrayList<Quarto> getAllQuartosResidencia(int codResidencia) {
        ArrayList<Quarto> quartos = new ArrayList<Quarto>();
        
        if(residenciaRepository.getResidencia(codResidencia) == null) {
            return quartos;
        }
        
        Connection connection = null;
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "Select * from quarto WHERE cod_residencia = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setInt(1, codResidencia);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                quartos.add(new Quarto(
                        resultSet.getInt("cod"), 
                        resultSet.getDouble("valor_diaria"),
                        resultSet.getInt("capacidade_pessoas"),
                        resultSet.getBoolean("ar_condicionado"),
                        resultSet.getBoolean("banheira_hidromassagem"),
                        resultSet.getBoolean("disponivel")
                ));
            }
            
        } catch(SQLException e) {
            System.err.println("Erro ao lista todos os quartos da residencia: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return quartos;
        }
    }
    
    public ArrayList<Quarto> getQuartosDisponiveisResidencia(int codResidencia) {
        ArrayList<Quarto> quartos = new ArrayList<Quarto>();
        Connection connection = null;
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "Select * from quarto WHERE disponivel = true AND cod_residencia = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setInt(1, codResidencia);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                quartos.add(new Quarto(
                        resultSet.getInt("cod"), 
                        resultSet.getDouble("valor_diaria"),
                        resultSet.getInt("capacidade_pessoas"),
                        resultSet.getBoolean("ar_condicionado"),
                        resultSet.getBoolean("banheira_hidromassagem"),
                        resultSet.getBoolean("disponivel")
                ));
            }
            
        } catch(SQLException e) {
            System.err.println("Erro ao lista todos os quartos disponiveis: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return quartos;
        }
    }
    
    public Quarto getQuarto(int cod) {
        Connection connection = null;
        Quarto quarto = null;
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "Select * from quarto WHERE cod = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setInt(1, cod);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()) {
                quarto = new Quarto(
                        resultSet.getInt("cod"), 
                        resultSet.getDouble("valor_diaria"),
                        resultSet.getInt("capacidade_pessoas"),
                        resultSet.getBoolean("ar_condicionado"),
                        resultSet.getBoolean("banheira_hidromassagem"),
                        resultSet.getBoolean("disponivel"));
            }
            
        } catch(SQLException e) {
            System.err.println("Erro ao consultar dados do quarto: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return quarto;
        }
    }
    
    public String enderecoQuarto(int cod) {
        Connection connection = null;
        String endereco = null;
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "Select * from quarto WHERE cod = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setInt(1, cod);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()) {
                Residencia residencia = residenciaRepository.getResidencia(resultSet.getInt("cod_residencia"));
                endereco = residencia.getEndereco();
            }
            
        } catch(SQLException e) {
            System.err.println("Erro ao consultar dados do quarto: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return endereco;
        }
    }
    
    public boolean alugarQuarto(int cod) {
        Connection connection = null;
        
        if(getQuarto(cod) == null) {
            return false;
        }
        
        boolean isAlugado = false;
        
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "UPDATE quarto SET disponivel=? WHERE cod=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setBoolean(1, false);
            preparedStatement.setInt(2, cod);
            
            preparedStatement.executeUpdate();
            isAlugado = true;
        } catch(SQLException e) {
            System.err.println("Erro ao Alugar o quarto: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return isAlugado;
        }
    }
    
    public boolean disponibilizarQuarto(int cod) {
        Connection connection = null;
        
        if(getQuarto(cod) == null) {
            return false;
        }
        
        boolean isdisponivel = false;
        
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "UPDATE quarto SET disponivel=? WHERE cod=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setBoolean(1, true);
            preparedStatement.setInt(2, cod);
            
            preparedStatement.executeUpdate();
            isdisponivel = true;
        } catch(SQLException e) {
            System.err.println("Erro ao Alugar o quarto: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return isdisponivel;
        }
    }
    
    public boolean updateQuarto(Quarto quarto) {
        Connection connection = null;
        
        if(getQuarto(quarto.getCod()) == null) {
            return false;
        }
        
        boolean isUpdate = false;
        
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "UPDATE quarto SET valor_diaria=?, capacidade_pessoas=?, ar_condicionado=?, banheira_hidromassagem=?, disponivel=? WHERE cod=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setDouble(1, quarto.getValorDiaria());
            preparedStatement.setInt(2, quarto.getCapacidadePessoa());
            preparedStatement.setBoolean(3, quarto.getArcondicionado());
            preparedStatement.setBoolean(4, quarto.getBanheiraHidromassagem());
            preparedStatement.setBoolean(5, quarto.getIsDisponivel());
            preparedStatement.setInt(6, quarto.getCod());
            
            preparedStatement.executeUpdate();
            isUpdate = true;
        } catch(SQLException e) {
            System.err.println("Erro ao atualizar os dados do quarto: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return isUpdate;
        }
    }
    
    public boolean deleteQuarto(int cod) {
        Connection connection = null;
        
        if(getQuarto(cod) == null) {
            return false;
        }
        
        boolean isDelete = false;
        
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "DELETE FROM quarto WHERE cod = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setInt(1, cod);

            preparedStatement.executeUpdate();
            isDelete = true;
        } catch(SQLException e) {
            System.err.println("Erro ao deletar quarto: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return isDelete;
        }
    }
}
