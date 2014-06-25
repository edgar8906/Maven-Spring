package com.morgo.web;

import javax.persistence.Table;

@Table
public class Usuario {
    
    private String nombre;
    private String paterno;
    private String us;
    private String password;
    private String rol_admin;

    public Usuario(String nombre, String paterno, String usuario, String password, String rol_admin) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.us = usuario;
        this.password = password;
        this.rol_admin = rol_admin;
    }

    public String getRol_admin() {
        return rol_admin;
    }

    public void setRol_admin(String rol_admin) {
        this.rol_admin = rol_admin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getUsuario() {
        return us;
    }

    public void setUsuario(String usuario) {
        this.us = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
