import java.sql.*;
public class SQLInjection {

    public static void main(String[]args){

        String query1 = "select * from users_gnani where user_name = 'gnani' and user_id = '101'";
        String query2 = "select * from users_gnani where user_name = ? and user_id = ? ";

        String url = "jdbc:mysql://192.168.71.15:3306/intern";
        String username = "intern2025";
        String password = "intern2025";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet1 = statement.executeQuery(query1);
            while (resultSet1.next()) {
                System.out.println("The User Name is : " + resultSet1.getString("user_name") +" and User ID is : "+ resultSet1.getInt("user_id"));
                System.out.println("Vulnerable - using Statement.");
            }

            PreparedStatement preparedStatement = connection.prepareStatement(query2);
            preparedStatement.setString(1,"gnani");
            preparedStatement.setString(2,"101");
            ResultSet resultSet2 = preparedStatement.executeQuery();
            while (resultSet2.next()) {
                System.out.println("The User Name is : " + resultSet2.getString("user_name") +" and User ID is : "+ resultSet2.getInt("user_id"));
                System.out.println("Safe - using PreparedStatement.");
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}