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
public class producto {
    
    private int id_producto;
    private String producto;
    private String producto_descripcion;
    private double producto_precio;
    private int producto_stock;
    private int producto_estado;

    public producto() {
    }

    public producto(int id_producto, String producto, String producto_descripcion, double producto_precio, int producto_stock, int producto_estado) {
        this.id_producto = id_producto;
        this.producto = producto;
        this.producto_descripcion = producto_descripcion;
        this.producto_precio = producto_precio;
        this.producto_stock = producto_stock;
        this.producto_estado = producto_estado;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getProducto_descripcion() {
        return producto_descripcion;
    }

    public void setProducto_descripcion(String producto_descripcion) {
        this.producto_descripcion = producto_descripcion;
    }

    public double getProducto_precio() {
        return producto_precio;
    }

    public void setProducto_precio(double producto_precio) {
        this.producto_precio = producto_precio;
    }

    public int getProducto_stock() {
        return producto_stock;
    }

    public void setProducto_stock(int producto_stock) {
        this.producto_stock = producto_stock;
    }

    public int getProducto_estado() {
        return producto_estado;
    }

    public void setProducto_estado(int producto_estado) {
        this.producto_estado = producto_estado;
    }
    
    public double precio_por_vender(){
        return this.producto_precio * this.producto_stock;
    }
    
}
