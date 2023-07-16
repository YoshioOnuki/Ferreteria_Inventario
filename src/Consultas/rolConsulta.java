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
    public String datosRolID(int id_rol){
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
    
}
