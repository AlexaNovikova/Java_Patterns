import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static Connection connection;

    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:MyShop.db");
//            UserMapper userMapper = new UserMapper(connection);
//            System.out.println(userMapper.findUserById(1L));
            ProductMapper productMapper = new ProductMapper(connection);
            CategoryMapper categoryMapper = new CategoryMapper(connection);
            categoryMapper.setProductMapper(productMapper);
            productMapper.setCategoryMapper(categoryMapper);
            Product product;
            Long id = 1L;
            product = getProductById(productMapper, id);
            System.out.println(product);
            Product product1 = getProductById(productMapper, id);
            System.out.println(product1);
            Category category = getCategoryById(categoryMapper, id);
            System.out.println(category);
            Category category1 = getCategoryById(categoryMapper, id);
            System.out.println(category1);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    private static Product getProductById(ProductMapper productMapper, Long id) throws SQLException {
        Product product;
        if (ProductIdentityMap.getProduct(id).isPresent()){
            System.out.println("From Map");
            product = ProductIdentityMap.getProduct(id).get();
        }
        else {
            System.out.println("From DB");
            product = productMapper.findProductById(id);
            ProductIdentityMap.addProduct(product);
        }
        return product;
    }

    private static Category getCategoryById(CategoryMapper categoryMapper, Long id) throws SQLException {
       Category category;
        if (CategoryIdentityMap.getCategory(id).isPresent()){
            System.out.println("From Map");
           category = CategoryIdentityMap.getCategory(id).get();
        }
        else {
            System.out.println("From DB");
            category = categoryMapper.findCategoryWithProductsById(id);
            CategoryIdentityMap.addCategory(category);
        }
        return category;
    }

}
