/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import DB.ConDB;
import Modelo.cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Mori
 */
public class clienteConsulta {
    
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acce;
    
    //Registrar cliente
    public int addCliente(Object[] ob) {
        int r = 0;
        String sql = "INSERT INTO cliente(cliente_documento, cliente_nombre_completo, cliente_direccion, cliente_celular, cliente_email, cliente_tipo) VALUES(?,?,?,?,?,?)";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, ob[0]);
            ps.setObject(2, ob[1]);
            ps.setObject(3, ob[2]);
            ps.setObject(4, ob[3]);
            ps.setObject(5, ob[4]);
            ps.setObject(6, ob[5]);
            r = ps.executeUpdate();
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al registrar un cliente" + e);
        }
        if(r > 0){
            r = 1;
        }
        return r;
    }
    
    //Obtenemos el último ID del cliente
    public int ultimoIdCliente(){
        int r = 0;
        
        String sql = "SELECT max(id_cliente) FROM cliente";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt(1);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener el último ID del cliente:  " + e);
        }
        
        return r;
    }
    
    //Agregamos un email del cliente ya existente
    public int addCorreo(Object ob, int id_cliente) {
        int r = 0;
        String sql = "UPDATE cliente SET cliente_email=? WHERE id_cliente=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, ob);
            ps.setObject(2, id_cliente);
            r = ps.executeUpdate();
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al registrar correo del cliente" + e);
        }
        return r;
    }
    
    //Agregamos un email del celular ya existente
    public int addCelular(Object ob, int id_celular) {
        int r = 0;
        String sql = "UPDATE cliente SET cliente_celular=? WHERE id_cliente=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, ob);
            ps.setObject(2, id_celular);
            r = ps.executeUpdate();
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al registrar celular del cliente" + e);
        }
        return r;
    }
    
    //Obtenemos los datos del cliente por el ID
    public Modelo.cliente datosClienteID(int id_cliente){
        Modelo.cliente modeloCliente = new cliente();
        
        String sql = "SELECT * FROM cliente WHERE id_cliente=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setInt(1, id_cliente);
            rs = ps.executeQuery();
            while(rs.next()){
                modeloCliente.setId_cliente(rs.getInt(1));
                modeloCliente.setCliente_documento(rs.getString(2));
                modeloCliente.setCliente_nombre_completo(rs.getString(3));
                modeloCliente.setCliente_direccion(rs.getString(4));
                modeloCliente.setCliente_celular(rs.getString(5));
                modeloCliente.setCliente_email(rs.getString(6));
                modeloCliente.setCliente_tipo(rs.getString(7));
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener datos del cliente por su ID:  " + e);
        }
        
        return modeloCliente;
    }
    
    //Obtenemos los datos del cliente por el DNI
    public Modelo.cliente datosClienteDNI(String documento){
        Modelo.cliente modeloCliente = new cliente();
        
        String sql = "SELECT * FROM cliente WHERE cliente_documento=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setString(1, documento);
            rs = ps.executeQuery();
            while(rs.next()){
                modeloCliente.setId_cliente(rs.getInt(1));
                modeloCliente.setCliente_documento(rs.getString(2));
                modeloCliente.setCliente_nombre_completo(rs.getString(3));
                modeloCliente.setCliente_direccion(rs.getString(4));
                modeloCliente.setCliente_celular(rs.getString(5));
                modeloCliente.setCliente_email(rs.getString(6));
                modeloCliente.setCliente_tipo(rs.getString(7));

            }
            //Cerramos la conexion
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener datos del cliente por su documento:  " + e);
        }
        
        return modeloCliente;
    }
    
    public int updateCliente(Object[] ob, int id_cliente) {
        int r = 0;
        
        String sql = "UPDATE cliente SET cliente_documento=?, cliente_nombre_completo=?, cliente_direccion=?, cliente_celular=?, cliente_email=?, cliente_tipo=? WHERE id_cliente=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, ob[0]);
            ps.setObject(2, ob[1]);
            ps.setObject(3, ob[2]);
            ps.setObject(4, ob[3]);
            ps.setObject(5, ob[4]);
            ps.setObject(6, ob[5]);
            ps.setObject(7, id_cliente);
            r = ps.executeUpdate();
            acce.close();
        } catch (Exception e) {
            System.out.println("Error actualizar el cliente "+ id_cliente + ": " + e);
        }
        if(r > 0){
            r = 2;
        }
        return r;
    }
    
    public int cantidadClientes(){
        int r = 0;
        
        String sql = "SELECT count(id_cliente) FROM cliente";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt(1);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener la cantidad de clientes:  " + e);
        }
        
        return r;
    }
    
    public DefaultTableModel consultarClientes(){
        String [] encabe={"ID","DOCUMENTO","NOMBRE COMPLETO","DIRECCION","CELULAR","CORREO"};
        DefaultTableModel m = new DefaultTableModel(null, encabe);
        Object[] o = new Object[6];
        
        String sql = "SELECT id_cliente, cliente_documento, cliente_nombre_completo, cliente_direccion, cliente_celular, cliente_email FROM cliente";
   
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                o[0] = rs.getInt(1);
                o[1] = rs.getString(2);
                o[2] = rs.getString(3);
                o[3] = rs.getString(4);
                o[4] = rs.getString(5);
                o[5] = rs.getString(6);
                
                m.addRow(o);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("error consultar datos del cliente para una tabla: " + e);
        }

        return m;
    }
    
    public void cargarComboCliente(JComboBox cbo){
        String sql = "SELECT cliente_nombre_completo FROM cliente";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            cbo.removeAllItems();
            cbo.addItem("Seleccione el Cliente");
            
            while(rs.next()){
                cbo.addItem(rs.getString(1));
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al cargar el combo de Cliente: " + e);
        }
    }
}
