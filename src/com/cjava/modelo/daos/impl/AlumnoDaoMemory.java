package com.cjava.modelo.daos.impl;

import com.cjava.modelo.daos.AlumnoDao;
import com.cjava.modelo.entidades.Alumno;

import java.util.List;

public class AlumnoDaoMemory implements AlumnoDao {
    @Override
    public void create(Alumno alumno) {
        System.out.println("Creando alumno en Memory");
    }

    @Override
    public void update(Alumno alumno) {
        System.out.println("Actualizando alumno en Memory");
    }

    @Override
    public void delete(int id) {
        System.out.println("Eliminando alumno en Memory");
    }

    @Override
    public Alumno find(int id) {
        return null;
    }

    @Override
    public List<Alumno> findAll() {
        System.out.println("Devolver todos los alumnos en Memory");
        return List.of();
    }

}
