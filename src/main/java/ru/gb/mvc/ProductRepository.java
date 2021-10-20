package ru.gb.mvc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductRepository {

    private final Connection connection;
    private PreparedStatement updateProdStm;
    private PreparedStatement allProdPrepStm;


    public ProductRepository(Connection connection) throws SQLException {
        this.connection = connection;
        allProdStatement();
        updateProdStatement();
    }

    public List<Product> getAllProducts() throws SQLException {
        List<Product> products = new ArrayList<>();
        try (ResultSet resultSet = allProdPrepStm.executeQuery()) {
            while (resultSet.next()) {
                Product product = new Product(resultSet.getLong(1), resultSet.getString(2), resultSet.getBigDecimal(3));
                products.add(product);
            }
        }
        return products;
    }

    public void allProdStatement() throws SQLException {
        allProdPrepStm = connection.prepareStatement("SELECT * FROM products;");
    }


    public void updateProductDetails(Long id, BigDecimal price) throws SQLException {
        updateProdStm.setLong(2, id);
        updateProdStm.setBigDecimal(1, price);
        updateProdStm.executeUpdate();
    }

    public void updateProdStatement() throws SQLException {
        updateProdStm = connection
                .prepareStatement("UPDATE products SET price = ? WHERE id = ?;");
    }

}