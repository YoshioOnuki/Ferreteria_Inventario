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
public class trabajador {
    
    private int id_trabajador;
    private String trabajador_nombre_completo;
    private String trabajador_direccion;
    private String trabajador_celular;
    private int trabajador_estado;

    public trabajador() {
    }

    public trabajador(int id_trabajador, String trabajador_nombre_completo, String trabajador_direccion, String trabajador_celular, int trabajador_estado) {
        this.id_trabajador = id_trabajador;
        this.trabajador_nombre_completo = trabajador_nombre_completo;
        this.trabajador_direccion = trabajador_direccion;
        this.trabajador_celular = trabajador_celular;
        this.trabajador_estado = trabajador_estado;
    }

    public int getId_trabajador() {
        return id_trabajador;
    }

    public void setId_trabajador(int id_trabajador) {
        this.id_trabajador = id_trabajador;
    }

    public String getTrabajador_nombre_completo() {
        return trabajador_nombre_completo;
    }

    public void setTrabajador_nombre_completo(String trabajador_nombre_completo) {
        this.trabajador_nombre_completo = trabajador_nombre_completo;
    }

    public String getTrabajador_direccion() {
        return trabajador_direccion;
    }

    public void setTrabajador_direccion(String trabajador_direccion) {
        this.trabajador_direccion = trabajador_direccion;
    }

    public String getTrabajador_celular() {
        return trabajador_celular;
    }

    public void setTrabajador_celular(String trabajador_celular) {
        this.trabajador_celular = trabajador_celular;
    }

    public int getTrabajador_estado() {
        return trabajador_estado;
    }

    public void setTrabajador_estado(int trabajador_estado) {
        this.trabajador_estado = trabajador_estado;
    }
    
}
