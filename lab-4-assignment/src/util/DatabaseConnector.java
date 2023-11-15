/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.*;
import model.User;

/**
 *
 * @author zoey42
 */
public class DatabaseConnector {
    
    private static final String URL = "jdbc:mysql://55000:3306/myconnection?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "hallowelt";
    
    public Connection connect() throws SQLException {
       return DriverManager.getConnection(URL, USER, PASSWORD);
    }
      
    public void addUser (User user) {
        String query = "INSERT INTO users (firstName, lastName, age) VALUES (?, ?, ?)";
        try (Connection conn = connect(); 
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, user.getFirstName());
            pstmt.setString(2, user.getLastName());
            pstmt.setString(3, user.getAge());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
}
