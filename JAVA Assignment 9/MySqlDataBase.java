import java.sql.*;

public class MySqlDataBase {

    public static void main(String[] args) {

        String string = "select * from products_gnani";

        String url = "jdbc:mysql://192.168.71.15:3306/intern";
        String username = "intern2025";
        String password = "intern2025";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(string);
            System.out.println("-------------------------------------");
            System.out.format("| %-5s | %-15s | %-5s |\n","ID","Product Name"," Price ");
            System.out.println("-------------------------------------");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                float price = resultSet.getFloat("price");

                System.out.format("| %-5s | %-15s | %-5s |\n",id, name, price);
            }
            System.out.println("-------------------------------------");
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}