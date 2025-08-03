import java.util.*;
import java.util.function.Function;

public class ProductDiscountApplication {

    public static void main(String[] args) {

        Function <Double, Double> discount = price -> price * 0.9;

        Map <String, Optional<Double>> products = new HashMap<>();
        products.put("Laptop", Optional.of(70000.00));
        products.put("Mobile", Optional.of(25000.00));
        products.put("Earphones", Optional.empty());

        products.forEach((product, price) -> {
            double finalPrice = price.map(discount).orElse(0.0);
            System.out.println(product + " final price is : " + finalPrice);
        });
    }
}