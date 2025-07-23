import java.sql.*;

public class SearchRecords {

    public static void main(String[] args) {

        String search = "select * from products_gnani where product_name like ?";

        String url = "jdbc:mysql://192.168.71.15:3306/intern";
        String username = "intern2025";
        String password = "intern2025";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement(search);
            preparedStatement.setString(1, "%phone%");
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("-------------------------------------");
            System.out.format("| %-5s | %-15s | %-5s |\n","ID","Product Name"," Price ");
            System.out.println("-------------------------------------");

            while (resultSet.next()) {
                int id = resultSet.getInt("product_id");
                String name = resultSet.getString("product_name");
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