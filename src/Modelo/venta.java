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
public class venta {
    
    private int id_venta;
    private String venta_fecha;
    private double venta_total;
    private int id_cliente;
    private int id_trabajador;

    public venta() {
    }

    public venta(int id_venta, String venta_fecha, double venta_total, int id_cliente, int id_trabajador) {
        this.id_venta = id_venta;
        this.venta_fecha = venta_fecha;
        this.venta_total = venta_total;
        this.id_cliente = id_cliente;
        this.id_trabajador = id_trabajador;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getVenta_fecha() {
        return venta_fecha;
    }

    public void setVenta_fecha(String venta_fecha) {
        this.venta_fecha = venta_fecha;
    }

    public double getVenta_total() {
        return venta_total;
    }

    public void setVenta_total(double venta_total) {
        this.venta_total = venta_total;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_trabajador() {
        return id_trabajador;
    }

    public void setId_trabajador(int id_trabajador) {
        this.id_trabajador = id_trabajador;
    }
    
}
