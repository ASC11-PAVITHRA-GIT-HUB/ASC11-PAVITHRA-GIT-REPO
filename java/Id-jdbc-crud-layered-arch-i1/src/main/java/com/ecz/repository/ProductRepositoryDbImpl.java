package com.ecz.repository;
import java.sql.*;
import com.ecz.model.Product;

import java.util.Collections;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class ProductRepositoryDbImpl implements ProductRepository{
    private static Connection DbConnectionSingleton;

    @Override
    public boolean addProductToCart(Product product) {
        try{
            Connection connection = getConnection();
            System.out.println("Driver Loaded!");
            Statement statement = connection.createStatement();
            System.out.println("Satement Created");
            String insertQuery ="INSERT INTO product(id,name,price,quantity) VALUES('" +product.getId() +"', '" +product.getName()+ "'," + product.getPrice()+ "," + product.getquantity() + ");";
       int noOfRowsAffected = statement.executeUpdate(insertQuery);
            System.out.println("No of rows affected: " + noOfRowsAffected);
        return noOfRowsAffected > 0;
        } catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());
        }
        return false;
    }
    private static Connection getConnection(){
        return DbConnectionSingleton;
    }

    @Override
    public List<Product> getAllProducts() {
        return Collections.emptyList();
    }
}
