import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class HospedeRepository {
    
    public void insertHospede(Hospede hospede) {
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
            }
        }
    }
    
    public void consultarHospede() {
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
                System.out.println(hospede);
                
            }
            
            
        } catch(SQLException e) {
            System.err.println("Erro ao inserir dados do hospede: " + e.getMessage());
        } finally {
            if (connection != null) {
                ConnectionDB.closeConnection(connection);
            }
        }
    }
 
}
    

