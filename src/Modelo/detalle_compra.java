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
public class detalle_compra {
    
    private int id_detalle_compra;
    private int detalle_compra_cantidad;
    private double detalle_compra_precio;
    private int id_producto;
    private int id_compra;

    public detalle_compra() {
    }

    public detalle_compra(int id_detalle_compra, int detalle_compra_cantidad, double detalle_compra_precio, int id_producto, int id_compra) {
        this.id_detalle_compra = id_detalle_compra;
        this.detalle_compra_cantidad = detalle_compra_cantidad;
        this.detalle_compra_precio = detalle_compra_precio;
        this.id_producto = id_producto;
        this.id_compra = id_compra;
    }

    public int getId_detalle_compra() {
        return id_detalle_compra;
    }

    public void setId_detalle_compra(int id_detalle_compra) {
        this.id_detalle_compra = id_detalle_compra;
    }

    public float getDetalle_compra_cantidad() {
        return detalle_compra_cantidad;
    }

    public void setDetalle_compra_cantidad(int detalle_compra_cantidad) {
        this.detalle_compra_cantidad = detalle_compra_cantidad;
    }

    public double getDetalle_compra_precio() {
        return detalle_compra_precio;
    }

    public void setDetalle_compra_precio(double detalle_compra_precio) {
        this.detalle_compra_precio = detalle_compra_precio;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }   
    
}
