import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductMapper {
    private final Connection connection;
    private PreparedStatement prodPrepStm;
    private PreparedStatement categoryPrepStm;
    private CategoryMapper categoryMapper;

    public ProductMapper(Connection connection) throws SQLException {
        this.connection = connection;
        prodStatement();
        prodStatementCategoryId();
    }

    public Product findProductById (Long id) throws SQLException {
       prodPrepStm.setLong(1, id);
        try(ResultSet resultSet = prodPrepStm.executeQuery()){
            if (resultSet.next()){
                Product product = new Product(id, resultSet.getString(1),resultSet.getBigDecimal(2));
                Long category_id = resultSet.getLong(3);
                Category category = categoryMapper.findCategoryById(category_id);
                product.setCategory(category.getTitle());
                return product;
            }
        }
        return null;
    }

    public List<Product> findProductsByCategoryId(Long category_id) throws SQLException {
        categoryPrepStm.setLong(1, category_id);
        Category category = new CategoryMapper(connection).findCategoryById(category_id);
        List <Product> products = new ArrayList<>();
        try(ResultSet resultSet = categoryPrepStm.executeQuery()){
            while (resultSet.next()){
                Product product = new Product(resultSet.getLong(1), resultSet.getString(2),resultSet.getBigDecimal(3));
                product.setCategory(category.getTitle());
                products.add(product);
            }
        }
        return products;
    }

    public void prodStatement () throws SQLException {
        prodPrepStm= connection.prepareStatement("SELECT title, price, category_id FROM Products WHERE id = ?;");
    }

    public void prodStatementCategoryId () throws SQLException {
        categoryPrepStm= connection.prepareStatement("SELECT id, title, price FROM products WHERE category_id = ?;");
    }

    public void setCategoryMapper(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }
}
