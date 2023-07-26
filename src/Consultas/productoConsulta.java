/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import DB.ConDB;
import Modelo.producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Mori
 */
public class productoConsulta {
    
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acce;
    
    //Registrar producto
    public int addProducto(Object[] ob) {
        int r = 0;
        String sql = "INSERT INTO producto(producto, producto_descripcion, producto_precio, producto_stock, producto_estado) VALUES(?,?,?,?,?)";
        
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
            System.out.println("Error al registrar un producto" + e);
        }
        if(r > 0){
            r = 1;
        }
        return r;
    }
    
    //Obtenemos el último ID del producto
    public int ultimoIdProducto(){
        int r = 0;
        
        String sql = "SELECT max(id_producto) FROM producto";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt(1);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener el último ID del producto:  " + e);
        }
        
        return r;
    }
    
    //Validamos el producto, devolviendo todos los atributos por medio del modelo
    public Modelo.producto validarProducto(int id_producto){
        Modelo.producto modeloProducto = new producto();
        
        String msql = "SELECT * FROM producto WHERE id_producto=? AND producto_estado=1";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(msql);
            ps.setInt(1, id_producto);
            rs = ps.executeQuery();
            while(rs.next()){
                modeloProducto.setId_producto(rs.getInt(1));
                modeloProducto.setProducto(rs.getString(2));
                modeloProducto.setProducto_descripcion(rs.getString(3));
                modeloProducto.setProducto_precio(rs.getDouble(4));
                modeloProducto.setProducto_stock(rs.getInt(5));
                modeloProducto.setProducto_estado(rs.getInt(6));
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al validar Producto:  " + e);
        }
        
        return modeloProducto;
    }
    
    //Validamos el producto, devolviendo todos los atributos por medio del modelo
    public Modelo.producto validarProductoNombre(String producto){
        Modelo.producto modeloProducto = new producto();
        
        String msql = "SELECT * FROM producto WHERE producto=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(msql);
            ps.setString(1, producto);
            rs = ps.executeQuery();
            while(rs.next()){
                modeloProducto.setId_producto(rs.getInt(1));
                modeloProducto.setProducto(rs.getString(2));
                modeloProducto.setProducto_descripcion(rs.getString(3));
                modeloProducto.setProducto_precio(rs.getDouble(4));
                modeloProducto.setProducto_stock(rs.getInt(5));
                modeloProducto.setProducto_estado(rs.getInt(6));
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al validar Producto por nombre:  " + e);
        }
        
        return modeloProducto;
    }
    
    //Obtenemos la stock de un producto
    public int StockProducto(int id_producto){
        int r = 0;
        
        String msql = "SELECT producto_stock FROM producto WHERE id_producto=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(msql);
            ps.setInt(1, id_producto);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                r = rs.getInt(1);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al objeter stock del producto:  " + e);
        }
        
        return r;
    }

    //Obtener los datos de los productos en un tableModel
    public DefaultTableModel consultarProductos(){
        String [] encabe={"ID","PRODUCTO","DESCRIPCION","PRECIO","STOCK","ESTADO"};
        DefaultTableModel m = new DefaultTableModel(null, encabe);
        Object[] o = new Object[6];
        
        String sql = "SELECT id_producto, producto, producto_descripcion, producto_precio, producto_stock, producto_estado FROM producto WHERE producto_estado=1";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                o[0] = rs.getInt(1);
                o[1] = rs.getString(2);
                o[2] = rs.getString(3);
                o[3] = String.format("%.2f", rs.getDouble(4));
                o[4] = rs.getInt(5);
                o[5] = rs.getInt(6) == 1 ? "ACTIVO" : "INACTIVO";
                
                m.addRow(o);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("error consultar datos de los productos para una tabla: " + e);
        }

        return m;
    }
    
    //Obtenemos los datos de los productos vendidos en una tabla
    public DefaultTableModel consultarCompra1Venta2(int caso){
        Object[] ob = new Object[2];
        
        String [] encabe={"ID","PRODUCTO","DESCRIPCION","ESTADO","CANTIDAD","TOTAL"};
        DefaultTableModel m = new DefaultTableModel(null, encabe);
        Object[] o = new Object[6];
        
        String sql = "SELECT id_producto, producto, producto_descripcion, producto_estado FROM producto";
   
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                if(caso == 1){//Compra
                    ob = sumaCompraProducto(rs.getInt(1));
                }else if(caso == 2){//Venta
                    ob = sumaVentaProducto(rs.getInt(1));
                }
                
                o[0] = rs.getInt(1);
                o[1] = rs.getString(2);
                o[2] = rs.getString(3);
                o[3] = rs.getString(4);
                o[4] = ob[0];
                o[5] = ob[1];
                m.addRow(o);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error consultar datos de los productos en reportes para mostrar en una tabla: " + e);
        }

        return m;
    }
    
    public Object[] sumaVentaProducto(int id_detalle_venta){
        Object[] o = new Object[2];
        
        String sql = "SELECT SUM(detalle_venta_cantidad), SUM(detalle_venta_precio) FROM detalle_venta WHERE id_detalle_venta=?";
   
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setInt(1, id_detalle_venta);
            rs = ps.executeQuery();
            while(rs.next()){
                o[0] = rs.getInt(1);
                o[1] = String.format("%.2f", rs.getDouble(2));
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error consultar datos de sumatorias de ventas del producto: " + e);
        }

        return o;
    }
    
    public Object[] sumaCompraProducto(int id_detalle_compra){
        Object[] o = new Object[2];
        
        String sql = "SELECT SUM(detalle_compra_cantidad), SUM(detalle_compra_precio) FROM detalle_compra WHERE id_detalle_compra=?";
   
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setInt(1, id_detalle_compra);
            rs = ps.executeQuery();
            while(rs.next()){
                o[0] = rs.getInt(1);
                o[1] = String.format("%.2f", rs.getDouble(2));
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error consultar datos de sumatorias de compras del producto: " + e);
        }

        return o;
    }
    
    //Actualizamos el Producto
    public int updateProducto(Object[] ob, int id_producto) {
        int r = 0;
        
        String sql = "UPDATE producto SET producto=?, producto_descripcion=?, producto_precio=? WHERE id_producto=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, ob[0]);
            ps.setObject(2, ob[1]);
            ps.setObject(3, ob[2]);
            ps.setObject(4, id_producto);
            r = ps.executeUpdate();
            acce.close();
        } catch (Exception e) {
            System.out.println("Error actualizar el producto "+ id_producto + ": " + e);
        }
        if(r > 0){
            r = 2;
        }
        return r;
    }

    //Actualizamos el stock del Producto
    public int updateCantidadProducto(int stock, int id_producto) {
        int r = 0;
        
        String sql = "UPDATE producto SET producto_stock=? WHERE id_producto=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, stock);
            ps.setObject(2, id_producto);
            r = ps.executeUpdate();
            acce.close();
        } catch (Exception e) {
            System.out.println("Error actualizar el stock del producto "+ id_producto + ": " + e);
        }
        
        return r;
    }
    
    public void cargarComboProducto(JComboBox cbo){
        String sql = "SELECT producto FROM producto";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            cbo.removeAllItems();
            cbo.addItem("Seleccione");
            
            while(rs.next()){
                cbo.addItem(rs.getString(1));
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al cargar el combo de productos: " + e);
        }
    }
    
    public int cantidadProductos(){
        int r = 0;
        
        String sql = "SELECT count(id_producto) FROM producto";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt(1);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener la cantidad de productos:  " + e);
        }
        
        return r;
    }
    
    public int cantidadProductosComprados(){
        int r = 0;
        
        String sql = "SELECT SUM(detalle_compra_cantidad) FROM detalle_compra";
   
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt(1);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error obtener la cantidad de productos comprados: " + e);
        }

        return r;
    }
    
    public int cantidadProductosVendidos(){
        int r = 0;
        
        String sql = "SELECT SUM(detalle_venta_cantidad) FROM detalle_venta";
   
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt(1);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error obtener la cantidad de productos vendidos: " + e);
        }

        return r;
    }
}
