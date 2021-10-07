import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ProductIdentityMap {
    private static Map<Long, Product> productMap = new HashMap<>();

    public static void addProduct(Product product){
        productMap.put(product.getId(), product);
    }

    public static Optional<Product> getProduct(Long id){
     return Optional.ofNullable(productMap.get(id));

    }
}
