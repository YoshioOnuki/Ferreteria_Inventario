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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Mori
 */
public class usuarioConsulta {
    
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acce;
    
    
    //Registrar Usuario
    public int addUsuario(Object[] ob) {
        int r = 0;
        String sql = "INSERT INTO usuario(usuario, usuario_contrasenia, id_trabajador, id_rol, usuario_estado) VALUES(?,?,?,?,?)";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, ob[0]);
            ps.setObject(2, ob[1]);
            ps.setObject(3, ob[2]);
            ps.setObject(4, ob[3]);
            ps.setObject(5, 1);
            r = ps.executeUpdate();
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al registrar un Usuario " + e);
        }
        if(r > 0){
            r = 1;
        }
        return r;
    }
    
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
    
    public int cantidadUsuarios(){
        int r = 0;
        
        String sql = "SELECT count(id_usuario) FROM usuario";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt(1);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener la cantidad de usuarios:  " + e);
        }
        
        return r;
    }
    
    public int cantidadUsuariosAdmin(){
        int r = 0;
        
        String sql = "SELECT count(id_usuario) FROM usuario WHERE id_rol = 1";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt(1);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener la cantidad de usuarios admin:  " + e);
        }
        
        return r;
    }
    
    public DefaultTableModel consultarUsuarios(){
        String [] encabe={"ID","USUARIO","TRABAJADOR","ROL","ESTADO"};
        DefaultTableModel m = new DefaultTableModel(null, encabe);
        Object[] o = new Object[5];
        
        String sql = "SELECT u.id_usuario, u.usuario, t.trabajador_nombre_completo, r.rol, u.usuario_estado FROM usuario u INNER JOIN trabajador t ON t.id_trabajador = u.id_trabajador INNER JOIN rol r ON r.id_rol = u.id_rol";
   
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                o[0] = rs.getInt(1);
                o[1] = rs.getString(2);
                o[2] = rs.getString(3);
                o[3] = rs.getString(4);
                o[4] = rs.getInt(5) == 1 ? "ACTIVO" : "INACTIVO";
                
                m.addRow(o);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error consultar datos del usuario para una tabla: " + e);
        }

        return m;
    }
    
    //Obtenemos los datos del usuario por el ID
    public Modelo.usuario datosUsuarioID(int id_usuario){
        Modelo.usuario usuario = new usuario();
        
        String sql = "SELECT usuario, id_trabajador, id_rol FROM usuario WHERE id_usuario=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setInt(1, id_usuario);
            rs = ps.executeQuery();
            while(rs.next()){
                usuario.setUsuario(rs.getString(1));
                usuario.setId_trabajdor(rs.getInt(2));
                usuario.setId_rol(rs.getInt(3));
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener datos de usuario por su ID:  " + e);
        }
        
        return usuario;
    }
    
    public int validarUsuarioTrabajador(int id_trabajador){
        int r = 0;
        
        String sql = "SELECT id_usuario FROM usuario WHERE id_trabajador=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setInt(1, id_trabajador);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt(1);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener datos de usuario por su ID:  " + e);
        }
        
        return r;
    }
    
    public int updateUsuario(Object[] ob, int id_usuario){
        int r = 0;
        
        String sql = "UPDATE usuario SET usuario=?, id_trabajador=?, id_rol=? WHERE id_usuario=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, ob[0]);
            ps.setObject(2, ob[1]);
            ps.setObject(3, ob[2]);
            ps.setObject(4, id_usuario);
            r = ps.executeUpdate();
            acce.close();
        } catch (Exception e) {
            System.out.println("Error actualizar el Usuario "+ id_usuario + ": " + e);
        }
        if(r > 0){
            r = 2;
        }
        return r;
    }
    
    public int deleteUsuario(int id_usuario) {
        int r = 0;

        String sql = "DELETE FROM usuario WHERE id_usuario=?";

        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setInt(1, id_usuario);
            r = ps.executeUpdate();
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al eliminar el Usuario " + id_usuario + ": " + e);
        }

        return r;
    }

}
