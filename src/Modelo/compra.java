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
public class compra {
    
    private int id_compra;
    private String compra_fecha;
    private double compra_total;
    private int id_proveedor;

    public compra() {
    }

    public compra(int id_compra, String compra_fecha, double compra_total, int id_proveedor) {
        this.id_compra = id_compra;
        this.compra_fecha = compra_fecha;
        this.compra_total = compra_total;
        this.id_proveedor = id_proveedor;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getCompra_fecha() {
        return compra_fecha;
    }

    public void setCompra_fecha(String compra_fecha) {
        this.compra_fecha = compra_fecha;
    }

    public double getCompra_total() {
        return compra_total;
    }

    public void setCompra_total(double compra_total) {
        this.compra_total = compra_total;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
    
}
