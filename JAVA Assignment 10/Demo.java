import java.sql.*;

public class Demo {
    public static void main(String[] args) {
        String string = "select holder_name from accounts_gnani where account_id = 1";

        String url = "jdbc:mysql://192.168.71.15:3306/intern";
        String username = "intern2025";
        String password = "intern2025";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(string);
            resultSet.next();
            String name = resultSet.getString(1);
            System.out.println(name);
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}