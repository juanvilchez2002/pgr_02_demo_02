package com.cjava.modelo.daos.impl;

import com.cjava.modelo.daos.CursoDao;
import com.cjava.modelo.entidades.Curso;

import java.util.List;

public class CursoDaoDataBase implements CursoDao {
    @Override
    public void create(Curso curso) {

    }

    @Override
    public void update(Curso curso) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Curso find(int id) {
        return null;
    }

    @Override
    public List<Curso> findAll() {
        return List.of();
    }
}
