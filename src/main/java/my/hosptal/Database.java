/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.hosptal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class Database {
        static Connection con=null;
    
        // Database connection parameters
        private static String url = "jdbc:mysql://localhost:3306/java";
        private static String username = "root";
        private static String password = "Novel222@@@";
        
        public static void connecter() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

            return;
        }

        

        try {

            con = DriverManager.getConnection(url, username, password);

            System.out.println("Connected !");
        } catch (SQLException e) {

            e.printStackTrace();

        }
    }
}
