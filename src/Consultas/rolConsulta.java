/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import DB.ConDB;
import Modelo.cliente;
import Modelo.rol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;

/**
 *
 * @author Jose Mori
 */
public class rolConsulta {
    
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acce;
    
    //Obtenemos los datos del cliente por el ID
    public Modelo.rol datosRolID(int id_rol){
        Modelo.rol rol = new rol();
        
        String sql = "SELECT * FROM rol WHERE id_rol=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setInt(1, id_rol);
            rs = ps.executeQuery();
            while(rs.next()){
                rol.setId_rol(rs.getInt(1));
                rol.setRol(rs.getString(2));
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener el rol:  " + e);
        }
        
        return rol;
    }
    
    //Obtenemos los datos del cliente por el ID
    public String rolID(int id_rol){
        String rol = "";
        
        String sql = "SELECT rol FROM rol WHERE id_rol=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setInt(1, id_rol);
            rs = ps.executeQuery();
            while(rs.next()){
                rol = rs.getString(1);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener el rol:  " + e);
        }
        
        return rol;
    }
    
    public void cargarComboRol(JComboBox cbo){
        String sql = "SELECT rol FROM rol";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            cbo.removeAllItems();
            cbo.addItem("Seleccione el Rol");
            
            while(rs.next()){
                cbo.addItem(rs.getString(1));
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al cargar el combo de rol: " + e);
        }
    }
}
