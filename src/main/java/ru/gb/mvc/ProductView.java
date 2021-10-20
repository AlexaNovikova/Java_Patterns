package ru.gb.mvc;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public class ProductView {
    ProductController productController;


    public void printProductDetails(List<Product> products) {
        for (Product p : products) {
            System.out.println("Product info: ");
            System.out.println("Title: " + p.getTitle());
            System.out.println("Product ID: " + p.getId());
            System.out.println("Price: " + p.getPrice());
        }
    }

    public void changeProductDetails(Long id, BigDecimal price) throws SQLException {
        productController.updateProductDetails(id, price);
    }

    public void setProductController(ProductController productController) {
        this.productController = productController;
    }
}
