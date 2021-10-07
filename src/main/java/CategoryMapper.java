import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryMapper {

    private final Connection connection;
    private PreparedStatement categoryPrepStm;
    private ProductMapper productMapper;

    public CategoryMapper(Connection connection) throws SQLException {
        this.connection = connection;
        categoryStatement();
    }

    public Category findCategoryById (Long id) throws SQLException {
        categoryPrepStm.setLong(1, id);
        try(ResultSet resultSet = categoryPrepStm.executeQuery()){
            if (resultSet.next()){
                return new Category(id, resultSet.getString(1));
            }
        }
        return null;
    }

    public Category findCategoryWithProductsById (Long id) throws SQLException {
                Category category = findCategoryById(id);
                productMapper = new ProductMapper(connection);
                List<Product>products = productMapper.findProductsByCategoryId(id);
                category.setProducts(products);
                return category;
    }

    public void categoryStatement () throws SQLException {
        categoryPrepStm= connection.prepareStatement("SELECT title FROM categories WHERE id = ?;");
    }

    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }
}