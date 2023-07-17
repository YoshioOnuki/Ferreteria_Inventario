/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import DB.ConDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Mori
 */
public class compraConsulta {
    
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acce;
    
    public int cantidadCompras(){
        int r = 0;
        
        String sql = "SELECT count(id_compra) FROM compra";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt(1);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al obtener la cantidad de compras:  " + e);
        }
        
        return r;
    }
    
    public DefaultTableModel consultarCompras(){
        String [] encabe={"ID","PROVEEDOR","FECHA","TOTAL"};
        DefaultTableModel m = new DefaultTableModel(null, encabe);
        Object[] o = new Object[4];
        
        String sql = "SELECT c.id_compra, p.proveedor, c.compra_fecha, c.compra_total FROM compra c INNER JOIN proveedor p ON p.id_proveedor = c.id_proveedor";
   
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                o[0] = rs.getInt(1);
                o[1] = rs.getString(2);
                o[2] = rs.getString(3);
                o[3] = String.format("%.2f", rs.getDouble(4));;

                
                m.addRow(o);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error consultar datos de compras para una tabla: " + e);
        }

        return m;
    }
    
    public DefaultTableModel consultarReporteCompras(){
        String [] encabe={"ID","PROVEEDOR","PRODUCTO","CANTIDAD","FECHA","TOTAL"};
        DefaultTableModel m = new DefaultTableModel(null, encabe);
        Object[] o = new Object[6];
        
        String sql = "SELECT d.id_detalle_compra, pro.proveedor, p.producto, d.detalle_compra_cantidad, c.compra_fecha, d.detalle_compra_precio FROM detalle_compra d INNER JOIN producto p ON p.id_producto = d.id_producto INNER JOIN compra c ON c.id_compra = d.id_compra INNER JOIN proveedor pro ON pro.id_proveedor = c.id_proveedor";
   
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                o[0] = rs.getInt(1);
                o[1] = rs.getString(2);
                o[2] = rs.getString(3);
                o[3] = rs.getInt(4);
                o[4] = rs.getString(5);
                o[5] = String.format("%.2f", rs.getDouble(6));;
                
                m.addRow(o);
            }
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al consultar datos de reporte compras para una tabla: " + e);
        }

        return m;
    }
    
}
