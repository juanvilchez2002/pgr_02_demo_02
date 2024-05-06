package com.cjava.modelo.daos.impl;

import com.cjava.modelo.daos.CursoDao;
import com.cjava.modelo.entidades.Curso;

import java.util.List;

public class CursoDaoDataBase implements CursoDao {
    //metodos que se heredan de EntityDao
    @Override
    public void create(Curso curso) {
        System.out.println("grabando en db");
    }

    @Override
    public void update(Curso curso) {
        System.out.println("actualizando en db");
    }

    @Override
    public void delete(int id) {
        System.out.println("borrando en db");
    }

    @Override
    public Curso find(int id) {
        System.out.println("buscando en db");
        return null;
    }

    @Override
    public List<Curso> findAll() {
        System.out.println("listar en db");
        return null;
    }

    //este metodo es de CursoDao
    @Override
    public List<Curso> findByName(String name) {
        return null;
    }
}