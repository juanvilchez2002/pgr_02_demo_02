package com.cjava.modelo.daos.impl;

import com.cjava.modelo.daos.AlumnoDao;
import com.cjava.modelo.entidades.Alumno;

import java.util.List;

public class AlumnoDaoDatabase implements AlumnoDao {
    @Override
    public void create(Alumno alumno) {
        System.out.println("Creando alumno en DB");
        System.out.println(alumno.toString());;
    }

    @Override
    public void update(Alumno alumno) {
        System.out.println("Actualizando alumno en DB");
    }

    @Override
    public void delete(int id) {
        System.out.println("Eliminando alumno en DB");
    }

    @Override
    public Alumno find(int id) {
        return null;
    }

    @Override
    public List<Alumno> findAll() {
        System.out.println("Devolver todos los alumnos de DB");
        return List.of();
    }

}
