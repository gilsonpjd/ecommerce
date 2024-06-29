package com.project.eCommerce.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBCConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ecommerce";
        String user = "root";
        String password = "jr0505";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
