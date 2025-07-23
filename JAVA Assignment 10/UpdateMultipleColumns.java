import java.sql.*;

public class UpdateMultipleColumns {

    public static void main(String[] args) {

        String update = "update users_gnani set user_email = 'gnaneswar@gmail.com', phone_number = '9876543210' where user_id = 101";
        String string = "select * from users_gnani";

        String url = "jdbc:mysql://192.168.71.15:3306/intern";
        String username = "intern2025";
        String password = "intern2025";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(update);
            ResultSet resultSet = statement.executeQuery(string);
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.format("| %-5s | %-15s | %-20s | %-15s | %-15s| \n","ID","Name","Email","Phone Number","Date Of Birth");
            System.out.println("-------------------------------------------------------------------------------------");

            while (resultSet.next()) {
                int id = resultSet.getInt("user_id");
                String name = resultSet.getString("user_name");
                String email = resultSet.getString("user_email");
                String number = resultSet.getString("phone_number");
                String dob = resultSet.getString("dob");

                System.out.format("| %-5s | %-15s | %-20s | %-15s | %-15s| \n",id, name, email, number, dob);
            }
            System.out.println("-------------------------------------------------------------------------------------");
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}