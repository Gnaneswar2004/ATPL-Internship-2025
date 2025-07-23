import java.sql.*;

public class DeleteRecords {

    public static void main(String[] args) {

        String delete = "delete from users_gnani where dob < '2004-01-01'";

        String url = "jdbc:mysql://192.168.71.15:3306/intern";
        String username = "intern2025";
        String password = "intern2025";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(delete);
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}