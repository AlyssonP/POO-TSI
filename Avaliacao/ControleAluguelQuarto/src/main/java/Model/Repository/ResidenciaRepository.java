package Model.Repository;

import Model.Entity.Residencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ResidenciaRepository {
    
    public boolean insertResidencia (Residencia residencia) {
        Connection connection = null;
        boolean isCadastrado = false;
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "INSERT INTO residencia (rua, bairro, cep, numero, telefone, email) VALUES ( ?, ?, ?, ?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setString(1, residencia.getRua());
            preparedStatement.setString(2, residencia.getBairro());
            preparedStatement.setInt(3, residencia.getCep());
            preparedStatement.setInt(4, residencia.getNumero());
            preparedStatement.setString(5, residencia.getTelefone());
            preparedStatement.setString(6, residencia.getEmail());
            
            preparedStatement.executeUpdate();
            isCadastrado = true;
        } catch(SQLException e) {
            System.err.println("Erro ao inserir dados da residencia: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return isCadastrado;
        }
    }
    
    public ArrayList<Residencia> getAll() {
        ArrayList<Residencia> residencias = new ArrayList<Residencia>();
        Connection connection = null;
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "Select * from residencia";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                residencias.add(new Residencia(
                        resultSet.getInt("cod"), 
                        resultSet.getString("rua"),
                        resultSet.getInt("numero"),
                        resultSet.getString("bairro"),
                        resultSet.getInt("cep"),
                        resultSet.getString("telefone"),
                        resultSet.getString("email")));
            }
            
        } catch(SQLException e) {
            System.err.println("Erro ao lista todas residencia: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return residencias;
        }
    }
    
    public Residencia getResidencia(int cod) {
        Connection connection = null;
        Residencia residencia = null;
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "Select * from residencia WHERE cod = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setInt(1, cod);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()) {
                residencia = new Residencia(
                        resultSet.getInt("cod"), 
                        resultSet.getString("rua"),
                        resultSet.getInt("numero"),
                        resultSet.getString("bairro"),
                        resultSet.getInt("cep"),
                        resultSet.getString("telefone"),
                        resultSet.getString("email"));
            }
            
        } catch(SQLException e) {
            System.err.println("Erro ao consultar dados do residencia: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return residencia;
        }
    }
    
    public boolean updateResidencia(Residencia residencia) {
        Connection connection = null;
        
        if(getResidencia(residencia.getCod()) == null) {
            return false;
        }
        
        boolean isUpdate = false;
        
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "UPDATE residencia SET rua=?, bairro=?, cep=?, numero=?, telefone=?, email=? WHERE cod = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setString(1, residencia.getRua());
            preparedStatement.setString(2, residencia.getBairro());
            preparedStatement.setInt(3, residencia.getCep());
            preparedStatement.setInt(4, residencia.getNumero());
            preparedStatement.setString(5, residencia.getTelefone());
            preparedStatement.setString(6, residencia.getEmail());
            preparedStatement.setInt(7, residencia.getCod());
            
            preparedStatement.executeUpdate();
            isUpdate = true;
        } catch(SQLException e) {
            System.err.println("Erro ao atualizar os dados da residencia: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return isUpdate;
        }
    }
    
    public boolean deleteResidencia(int cod) {
        Connection connection = null;
        
        if(getResidencia(cod) == null) {
            return false;
        }
        
        boolean isDelete = false;
        
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "DELETE FROM residencia WHERE cod = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setInt(1, cod);

            preparedStatement.executeUpdate();
            isDelete = true;
        } catch(SQLException e) {
            System.err.println("Erro ao deletar residencia: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return isDelete;
        }
    }
}
