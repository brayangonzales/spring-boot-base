package com.ejemplo.appjar.dto;

public class usuario {
    private Integer idUsuario;
    private String nombre;
    private Integer edad;

    public usuario(Integer idUsuario, String nombre, Integer edad) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Integer getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
