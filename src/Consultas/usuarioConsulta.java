/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import DB.ConDB;
import Modelo.usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Jose Mori
 */
public class usuarioConsulta {
    
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acce;
    
    
    //Validamos los campos del inicio de sesion
    public Modelo.usuario validarUsuario(String usuario, String contrasenia){
        Modelo.usuario modeloUsuario = new usuario();
        int estado = 1;
        
        String msql = "SELECT * FROM usuario WHERE usuario=? AND usuario_contrasenia=? AND usuario_estado=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(msql);
            ps.setString(1, usuario);
            ps.setString(2, contrasenia);
            ps.setInt(3, estado);
            rs = ps.executeQuery();
            while(rs.next()){
                modeloUsuario.setId_usuario(rs.getInt(1));
                modeloUsuario.setUsuario(rs.getString(2));
                modeloUsuario.setUsuario_contrasenia(rs.getString(3));
                modeloUsuario.setUsuario_estado(rs.getInt(4));
                modeloUsuario.setId_trabajdor(rs.getInt(5));
                modeloUsuario.setId_rol(rs.getInt(6));
            }
            
        } catch (Exception e) {
            System.out.println("Error al validar usuario en el inicio de sesion:  " + e);
        }
        
        return modeloUsuario;
    }
}
