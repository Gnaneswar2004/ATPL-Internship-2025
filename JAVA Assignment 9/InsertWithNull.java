import java.sql.*;

public class InsertWithNull {

    public static void main(String[]args) {

        String query = "insert into products_gnani (product_id, product_name, price) values (?, ?, ?)";
        String string = "select * from products_gnani";

        String url = "jdbc:mysql://192.168.71.15:3306/intern";
        String username = "intern2025";
        String password = "intern2025";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,104);
            preparedStatement.setNull(2, Types.VARCHAR);
            preparedStatement.setNull(3, java.sql.Types.FLOAT);

            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.executeQuery(string);
            System.out.println("---------------------------------------");
            System.out.format("| %-5s | %-15s | %-9s |\n","ID","Product Name"," Price ");
            System.out.println("---------------------------------------");

            while (resultSet.next()) {
                int id = resultSet.getInt("product_id");
                String name = resultSet.getString("product_name");
                float price = resultSet.getFloat("price");

                System.out.format("| %-5s | %-15s | %-9s |\n",id, name, price);
            }
            System.out.println("---------------------------------------");
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}