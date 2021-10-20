package ru.gb.mvc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:shop.db");
            ProductRepository productRepository = new ProductRepository(connection);
            ProductView view = new ProductView();
            ProductController productController = new ProductController(productRepository, view);
            view.setProductController(productController);
            productController.updateView();
            productController.updateProductDetails(2L, new BigDecimal(5000));
            System.out.println();
            System.out.println("after update");
            productController.updateView();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }


}
