import java.sql.*;

public class UpdateData {
    public static void main(String[] args) {

        String update = "update users_gnani set user_email = 'gnaneswar@gmail.com' where user_id = 101";

        String url = "jdbc:mysql://192.168.71.15:3306/intern";
        String username = "intern2025";
        String password = "intern2025";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(update);
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}