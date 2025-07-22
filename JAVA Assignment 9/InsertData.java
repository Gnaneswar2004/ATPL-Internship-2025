import java.sql.*;

public class InsertData {

    public static void main(String[] args) {

        String insert = "insert into users_gnani values (?, ?, ?, ?, ?)";

        String url = "jdbc:mysql://192.168.71.15:3306/intern";
        String username = "intern2025";
        String password = "intern2025";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setInt(1,104);
            preparedStatement.setString(2,"Hemanth");
            preparedStatement.setString(3,"hemanth@gmail.com");
            preparedStatement.setString(4,"8974856321");
            preparedStatement.setString(5,"2003-08-25");
            preparedStatement.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}