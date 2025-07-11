import java.util.*;

public class Product {
    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();

        products.put("Laptop", 50000);
        products.put("Phone", 30000);
        products.put("Tablet", 35000);
        products.put("Headphones", 3000);
        products.put("Smartwatch", 5000);

        // Use Iterator to iterate through the entries of the map
        Iterator<Map.Entry<String, Integer>> iterator = products.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Product : " + entry.getKey() + ", Price : " + entry.getValue());
        }
    }
}