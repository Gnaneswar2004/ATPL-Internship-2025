import java.sql.*;
public class SQLInjection {

    public static void main(String[]args){
        String query = "select * from users_gnani where user_name = 'gnani' and user_id = '101'";

        String url = "jdbc:mysql://192.168.71.15:3306/intern";
        String username = "intern2025";
        String password = "intern2025";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println("The User Name is : " + resultSet.getString("user_name") +" and User ID is : "+ resultSet.getInt("user_id"));
            }
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}