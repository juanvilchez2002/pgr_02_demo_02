package com.cjava.modelo.entidades;

import static com.cjava.util.Util.generarId;

public class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private String estado;
    private double promedio;

    public Alumno() {
        this.id = generarId();
    }

    public Alumno(String nombre, String apellido, double promedio ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
        this.id = generarId();
    }

    public int getId() {
        return id;
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
        if(promedio>=13) estado = "Aprobado";
        else estado = "Desaprobado";
        return estado;
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
                ", estado='" + getEstado() + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
