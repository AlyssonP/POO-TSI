package Model.Repository;

import Model.Entity.Hospede;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class HospedeRepository {
    
    public boolean insertHospede(Hospede hospede) {
        Connection connection = null;
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "INSERT INTO hospede (cpf, nome, endereco, celular, email) VALUES (?, ?, ?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setString(1, hospede.getCpf());
            preparedStatement.setString(2, hospede.getNome());
            preparedStatement.setString(3, hospede.getEndereco());
            preparedStatement.setString(4, hospede.getCelular());
            preparedStatement.setString(5, hospede.getEmail());
            
            preparedStatement.executeUpdate();
            
        } catch(SQLException e) {
            System.err.println("Erro ao inserir dados do hospede: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
                return true;
            }
            return false;
        }
    }
    
    public ArrayList<Hospede> consultarHospede() {
        ArrayList<Hospede> hospedes = new ArrayList<Hospede>();
        Connection connection = null;
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "Select * from hospede";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            Hospede hospede;
            while(resultSet.next()) {
                String cpf = resultSet.getString("cpf");
                String nome = resultSet.getString("nome");
                String endereco = resultSet.getString("endereco");
                String celular = resultSet.getString("celular");
                String email = resultSet.getString("email");
                
                hospede = new Hospede(nome, cpf, endereco, celular, email);
                hospedes.add(hospede);
                
            }
            
        } catch(SQLException e) {
            System.err.println("Erro ao inserir dados do hospede: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return hospedes;
        }
    }
    
    public Hospede getHospede(String cpf) {
        Connection connection = null;
        Hospede hospede = null;
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "Select * from hospede WHERE cpf = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setString(1, cpf);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()) {
                hospede = new Hospede(
                        resultSet.getString("nome"), 
                        resultSet.getString("cpf"),
                        resultSet.getString("endereco"),
                        resultSet.getString("celular"),
                        resultSet.getString("email"));
            }
            
        } catch(SQLException e) {
            System.err.println("Erro ao consultar dados do hospede: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return hospede;
        }
    }
    
    public boolean updateHospede(Hospede hospede) {
        Connection connection = null;
        
        if(getHospede(hospede.getCpf()) == null) {
            return false;
        }
        
        boolean isUpdate = false;
        
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "UPDATE hospede SET cpf=?, nome=?, endereco=?, celular=?, email=?  WHERE  cpf = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setString(1, hospede.getCpf());
            preparedStatement.setString(2, hospede.getNome());
            preparedStatement.setString(3, hospede.getEndereco());
            preparedStatement.setString(4, hospede.getCelular());
            preparedStatement.setString(5, hospede.getEmail());
            preparedStatement.setString(6, hospede.getCpf());
            
            preparedStatement.executeUpdate();
            isUpdate = true;
        } catch(SQLException e) {
            System.err.println("Erro ao atualizar os dados do hospede: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return isUpdate;
        }
    }
    
    public boolean deleteHospede(String cpf) {
        Connection connection = null;
        
        if(getHospede(cpf) == null) {
            return false;
        }
        
        boolean isDelete = false;
        
        try {
            connection = ConnectionDB.getConnection();
            String codigoSql = "DELETE FROM hospede WHERE cpf = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(codigoSql);
            preparedStatement.setString(1, cpf);

            preparedStatement.executeUpdate();
            isDelete = true;
        } catch(SQLException e) {
            System.err.println("Erro ao deletar hospede: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
            return isDelete;
        }
    }
}
    