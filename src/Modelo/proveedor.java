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
public class proveedor {
    
    private int id_proveedor;
    private String proveedor;
    private String proveedor_direccion;
    private String proveedor_celular;
    private String proveedor_correo;

    public proveedor() {
    }

    public proveedor(int id_proveedor, String proveedor, String proveedor_direccion, String proveedor_celular, String proveedor_correo) {
        this.id_proveedor = id_proveedor;
        this.proveedor = proveedor;
        this.proveedor_direccion = proveedor_direccion;
        this.proveedor_celular = proveedor_celular;
        this.proveedor_correo = proveedor_correo;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getProveedor_direccion() {
        return proveedor_direccion;
    }

    public void setProveedor_direccion(String proveedor_direccion) {
        this.proveedor_direccion = proveedor_direccion;
    }

    public String getProveedor_celular() {
        return proveedor_celular;
    }

    public void setProveedor_celular(String proveedor_celular) {
        this.proveedor_celular = proveedor_celular;
    }

    public String getProveedor_correo() {
        return proveedor_correo;
    }

    public void setProveedor_correo(String proveedor_correo) {
        this.proveedor_correo = proveedor_correo;
    }
    
}
