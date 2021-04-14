/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Ltxny
 */
import java.beans.*;
import java.sql.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.JLabel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class model {
    
    
    public static Connection Connexion(String url ,String login ,String pssword) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        try{
        Class.forName("com.mysql.jdbc.Driver") ;

            conn = DriverManager.getConnection(url ,login, pssword);
        } catch (ClassNotFoundException e) {
            System.out.println("ça marche pas");
        }
        return conn;
    }
    
  
 public int verifLogin(String req) throws SQLException, ClassNotFoundException {
        Statement stmt = null;
        String url = "jdbc:mysql://localhost:3306/bdd_graph" ;
            String user= "root";
            String password ="";
        Connection connexxion=null;
        int nombre=0;
        
        connexxion = Connexion(url,user,password);

        try {
            
            stmt = (Statement) connexxion.createStatement() ;
            ResultSet result = stmt.executeQuery(req) ;

            while (result.next()){
                    nombre = result.getInt(1);
                }
            }
            catch (SQLException e) {
System.out.println("Connection error");
            } 
           return nombre;
} 
 
    
}

