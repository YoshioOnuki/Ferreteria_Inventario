/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jose Mori
 */
public class detalle_venta {
    
    private int id_detalle_venta;
    private int detalle_venta_cantidad;
    private double detalle_venta_precio;
    private int id_producto;
    private int id_venta;

    public detalle_venta() {
    }

    public detalle_venta(int id_detalle_venta, int detalle_venta_cantidad, double detalle_venta_precio, int id_producto, int id_venta) {
        this.id_detalle_venta = id_detalle_venta;
        this.detalle_venta_cantidad = detalle_venta_cantidad;
        this.detalle_venta_precio = detalle_venta_precio;
        this.id_producto = id_producto;
        this.id_venta = id_venta;
    }

    public int getId_detalle_venta() {
        return id_detalle_venta;
    }

    public void setId_detalle_venta(int id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public int getDetalle_venta_cantidad() {
        return detalle_venta_cantidad;
    }

    public void setDetalle_venta_cantidad(int detalle_venta_cantidad) {
        this.detalle_venta_cantidad = detalle_venta_cantidad;
    }

    public double getDetalle_venta_precio() {
        return detalle_venta_precio;
    }

    public void setDetalle_venta_precio(double detalle_venta_precio) {
        this.detalle_venta_precio = detalle_venta_precio;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }
    
    
}
