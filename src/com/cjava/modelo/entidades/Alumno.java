package com.cjava.modelo.entidades;

public class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private String estado;
    private double promedio;

    public Alumno() {
    }

    public Alumno(double promedio, String estado, String apellido, String nombre, int id) {
        this.promedio = promedio;
        this.estado = estado;
        this.apellido = apellido;
        this.nombre = nombre;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", estado='" + estado + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
