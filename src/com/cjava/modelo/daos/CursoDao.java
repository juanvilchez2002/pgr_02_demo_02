package com.cjava.modelo.daos;

import com.cjava.modelo.entidades.Curso;

import java.util.List;

public interface CursoDao {
    public void create(Curso curso);
    public void update(Curso curso);
    public void delete(int id);
    public Curso find(int id);
    public List<Curso> findAll();

}
