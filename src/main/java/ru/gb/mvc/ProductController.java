package ru.gb.mvc;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public class ProductController {

    private ProductRepository productRepository;
    private ProductView view;

    public ProductController(ProductRepository productRepository, ProductView view) {
        this.productRepository = productRepository;
        this.view = view;
    }

    public void updateView() throws SQLException {
        List<Product> products = productRepository.getAllProducts();
        view.printProductDetails(products);
    }

    public void updateProductDetails(Long id, BigDecimal price) throws SQLException {
      productRepository.updateProductDetails(id, price);
    }
}
