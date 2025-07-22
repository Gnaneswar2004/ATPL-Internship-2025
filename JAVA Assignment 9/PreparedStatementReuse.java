import java.sql.*;
public class PreparedStatementReuse {
    public static void main(String[]args){

        String insert = "insert into users_gnani values (?, ?, ?, ?, ?)";
        String string = "select * from users_gnani";

        String url = "jdbc:mysql://192.168.71.15:3306/intern";
        String username = "intern2025";
        String password = "intern2025";

        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insert);

            preparedStatement.setInt(1,104);
            preparedStatement.setString(2,"Hemanth");
            preparedStatement.setString(3,"hemanth@gmail.com");
            preparedStatement.setString(4,"8974856321");
            preparedStatement.setString(5,"2003-08-25");
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1,102);
            preparedStatement.setString(2,"Sai Kumar");
            preparedStatement.setString(3,"sai@gmail.com");
            preparedStatement.setString(4,"9638527410");
            preparedStatement.setString(5,"2003-02-10");
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.executeQuery(string);

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
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}