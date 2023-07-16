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
public class cliente {

    private int id_cliente;
    private String cliente_documento;
    private String cliente_nombre_completo;
    private String cliente_direccion;
    private String cliente_celular;
    private String cliente_email;
    private String cliente_tipo;

    public cliente() {
    }

    public cliente(int id_cliente, String cliente_documento, String cliente_nombre_completo, String cliente_direccion, String cliente_celular, String cliente_email, String cliente_tipo) {
        this.id_cliente = id_cliente;
        this.cliente_documento = cliente_documento;
        this.cliente_nombre_completo = cliente_nombre_completo;
        this.cliente_direccion = cliente_direccion;
        this.cliente_celular = cliente_celular;
        this.cliente_email = cliente_email;
        this.cliente_tipo = cliente_tipo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCliente_documento() {
        return cliente_documento;
    }

    public void setCliente_documento(String cliente_documento) {
        this.cliente_documento = cliente_documento;
    }

    public String getCliente_nombre_completo() {
        return cliente_nombre_completo;
    }

    public void setCliente_nombre_completo(String cliente_nombre_completo) {
        this.cliente_nombre_completo = cliente_nombre_completo;
    }

    public String getCliente_direccion() {
        return cliente_direccion;
    }

    public void setCliente_direccion(String cliente_direccion) {
        this.cliente_direccion = cliente_direccion;
    }

    public String getCliente_celular() {
        return cliente_celular;
    }

    public void setCliente_celular(String cliente_celular) {
        this.cliente_celular = cliente_celular;
    }

    public String getCliente_email() {
        return cliente_email;
    }

    public void setCliente_email(String cliente_email) {
        this.cliente_email = cliente_email;
    }

    public String getCliente_tipo() {
        return cliente_tipo;
    }

    public void setCliente_tipo(String cliente_tipo) {
        this.cliente_tipo = cliente_tipo;
    }
    
}
