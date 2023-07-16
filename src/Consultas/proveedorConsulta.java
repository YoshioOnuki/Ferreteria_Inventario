/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import DB.ConDB;
import Modelo.proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Jose Mori
 */
public class proveedorConsulta {
    
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acce;
    
    //Registrar proveedor
    public int addProveedor(Object[] ob) {
        int r = 0;
        String sql = "INSERT INTO proveedor(proveedor, proveedor_direccion, proveedor_celular, proveedor_correo) VALUES(?,?,?,?)";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, ob[0]);
            ps.setObject(2, ob[1]);
            ps.setObject(3, ob[2]);
            ps.setObject(4, ob[3]);
            r = ps.executeUpdate();
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al registrar un proveedor" + e);
        }
        
        return r;
    }
    
    //Obtenemos el último ID del proveedor
    public int ultimoIdProveedor(){
        int r = 0;
        
        String sql = "SELECT max(id_proveedor) FROM proveedor";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt(1);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener el último ID del proveedor:  " + e);
        }
        
        return r;
    }
    
    //Obtenemos los datos del proveedor por el ID
    public Modelo.proveedor datosProveedorID(int id_proveedor){
        Modelo.proveedor modeloproveedor = new proveedor();
        
        String sql = "SELECT * FROM proveedor WHERE id_proveedor=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setInt(1, id_proveedor);
            rs = ps.executeQuery();
            while(rs.next()){
                modeloproveedor.setId_proveedor(rs.getInt(1));
                modeloproveedor.setProveedor(rs.getString(2));
                modeloproveedor.setProveedor_direccion(rs.getString(3));
                modeloproveedor.setProveedor_celular(rs.getString(4));
                modeloproveedor.setProveedor_correo(rs.getString(5));
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener datos del proveedor por su ID:  " + e);
        }
        
        return modeloproveedor;
    }
    
    public int updateProveedor(Object[] ob, int id_proveedor) {
        int r = 0;
        
        String sql = "UPDATE proveedor SET proveedor=?, proveedor_direccion=?, proveedor_celular=?, proveedor_correo=? WHERE id_proveedor=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, ob[0]);
            ps.setObject(2, ob[1]);
            ps.setObject(3, ob[2]);
            ps.setObject(4, ob[3]);
            ps.setObject(5, id_proveedor);
            r = ps.executeUpdate();
            acce.close();
        } catch (Exception e) {
            System.out.println("Error actualizar el proveedor "+ id_proveedor + ": " + e);
        }
        
        return r;
    }
    
}
