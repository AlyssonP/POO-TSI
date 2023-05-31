import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionDB {
    // Atributos
    private static final String url = "jdbc:postgresql://localhost:5432/ConexaoJava";
    private static final String username = "postgres";
    private static final String password = "1100100";

    // Métodos
    // Estabelecer conexão
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,username,password);
    }

    // Finalizar conexão
    public static void closeConnection(Connection connection) {
        if(connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Ocorreu um erro ao fechar o BD: " + e.getMessage());
            }
        }
    }

}
