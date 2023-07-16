/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jose Mori
 */
public class ConDB {
    Connection con;
    String controlador = "com.mysql.jdbc.Driver";
    String db = "ferreteria_inventario";
    String url="jdbc:mysql://localhost:3306/"+db;
    String user="root";
    String pass="";
    
    private final String driver = "com.mysql.jdbc.Driver";
    
    
    public Connection conectardb(){
        try {
            Class.forName(controlador);
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Error al activar la Base de Datos: " + e);
        }
        return con;
    }
    
     public Connection getConexion() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url,user,pass);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error-1: " + e.getMessage());
        }
        
        return null;
    }   
    
    
}
