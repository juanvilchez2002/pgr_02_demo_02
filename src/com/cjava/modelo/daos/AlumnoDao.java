package com.cjava.modelo.daos;

import com.cjava.modelo.entidades.Alumno;

import java.util.List;

public interface AlumnoDao {
    public void create(Alumno alumno);
    public void update(Alumno alumno);
    public void delete(int id);
    public Alumno find(int id);
    public List<Alumno> findAll();
}
