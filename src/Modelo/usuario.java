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
public class usuario {
    
    private int id_usuario;
    private String usuario;
    private String usuario_contrasenia;
    private int usuario_estado;
    private int id_trabajdor;
    private int id_rol;

    public usuario() {
    }

    public usuario(int id_usuario, String usuario, String usuario_contrasenia, int usuario_estado, int id_trabajdor, int id_rol) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.usuario_contrasenia = usuario_contrasenia;
        this.usuario_estado = usuario_estado;
        this.id_trabajdor = id_trabajdor;
        this.id_rol = id_rol;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario_contrasenia() {
        return usuario_contrasenia;
    }

    public void setUsuario_contrasenia(String usuario_contrasenia) {
        this.usuario_contrasenia = usuario_contrasenia;
    }

    public int getId_trabajdor() {
        return id_trabajdor;
    }

    public void setId_trabajdor(int id_trabajdor) {
        this.id_trabajdor = id_trabajdor;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public int getUsuario_estado() {
        return usuario_estado;
    }

    public void setUsuario_estado(int usuario_estado) {
        this.usuario_estado = usuario_estado;
    }
    
}
