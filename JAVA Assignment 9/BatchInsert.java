import java.sql.*;

public class BatchInsert {

    public static void main(String[] args) {

        String insert = "insert into users_gnani values (?, ?, ?, ?, ?)";

        String url = "jdbc:mysql://192.168.71.15:3306/intern";
        String username = "intern2025";
        String password = "intern2025";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setInt(1,105);
            preparedStatement.setString(2,"Rajith");
            preparedStatement.setString(3,"rajith@gmail.com");
            preparedStatement.setString(4,"7896054133");
            preparedStatement.setString(5,"2003-10-18");
            preparedStatement.addBatch();
            preparedStatement.setInt(1,106);
            preparedStatement.setString(2,"Karthik");
            preparedStatement.setString(3,"karthik@gmail.com");
            preparedStatement.setString(4,"9857463210");
            preparedStatement.setString(5,"2003-07-22");
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}