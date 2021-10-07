import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CategoryIdentityMap {
    private static Map<Long, Category> categoryMap = new HashMap<>();

    public static void addCategory(Category category){
       categoryMap.put(category.getId(), category);
    }

    public static Optional<Category> getCategory(Long id){
        return Optional.ofNullable(categoryMap.get(id));

    }
}
