/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import DB.ConDB;
import Modelo.trabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Mori
 */
public class trabajadorConsulta {
    
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acce;
    
    //Registrar trabajador
    public int addTrabajador(Object[] ob) {
        int r = 0;
        String sql = "INSERT INTO trabajador(trabajador_nombre_completo, trabajador_direccion, trabajador_celular, trabajador_estado) VALUES(?,?,?,?)";
        
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
            System.out.println("Error al registrar trabajador" + e);
        }
        if(r > 0){
            r = 1;
        }
        return r;
    }
    
    //Obtenemos los datos del trabajador por el ID
    public Modelo.trabajador datosTrabajadorID(int id_trabajador){
        Modelo.trabajador modeloTrabajador = new trabajador();
        
        String sql = "SELECT * FROM trabajador WHERE id_trabajador=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setInt(1, id_trabajador);
            rs = ps.executeQuery();
            while(rs.next()){
                modeloTrabajador.setId_trabajador(rs.getInt(1));
                modeloTrabajador.setTrabajador_nombre_completo(rs.getString(2));
                modeloTrabajador.setTrabajador_direccion(rs.getString(3));
                modeloTrabajador.setTrabajador_celular(rs.getString(4));
                modeloTrabajador.setTrabajador_estado(rs.getInt(5));
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener datos de trabajador por su ID:  " + e);
        }
        
        return modeloTrabajador;
    }
    
    public int cantidadTrabajadores(){
        int r = 0;
        
        String sql = "SELECT count(id_trabajador) FROM trabajador";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt(1);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener la cantidad de trabajadores:  " + e);
        }
        
        return r;
    }
    
    public DefaultTableModel consultarTrabajadores(){
        String [] encabe={"ID","NOMBRE COMPLETO","DIRECCION","CELULAR","ESTADO"};
        DefaultTableModel m = new DefaultTableModel(null, encabe);
        Object[] o = new Object[5];
        
        String sql = "SELECT id_trabajador, trabajador_nombre_completo, trabajador_direccion, trabajador_celular, trabajador_estado FROM trabajador";
   
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
            System.out.println("error consultar datos del trabajador para una tabla: " + e);
        }

        return m;
    }
    
    public int updateTrabajador(Object[] ob, int id_trabajador) {
        int r = 0;
        
        String sql = "UPDATE trabajador SET trabajador_nombre_completo=?, trabajador_direccion=?, trabajador_celular=? WHERE id_trabajador=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, ob[0]);
            ps.setObject(2, ob[1]);
            ps.setObject(3, ob[2]);
            ps.setObject(4, id_trabajador);
            r = ps.executeUpdate();
            acce.close();
        } catch (Exception e) {
            System.out.println("Error actualizar el TRABAJADOR "+ id_trabajador + ": " + e);
        }
        if(r > 0){
            r = 2;
        }
        return r;
    }
    
    public void cargarComboTrabajador(JComboBox cbo){
        String sql = "SELECT trabajador_nombre_completo FROM trabajador;";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            cbo.removeAllItems();
            cbo.addItem("Seleccione Trabajador");
            
            while(rs.next()){
                cbo.addItem(rs.getString(1));
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al cargar el combo de trabajador: " + e);
        }
    }
    
}
