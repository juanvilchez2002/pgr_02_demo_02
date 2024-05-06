package com.cjava.modelo.daos.impl;

import com.cjava.modelo.daos.CursoDao;
import com.cjava.modelo.entidades.Curso;

import java.util.List;

public class CursoDaoFile implements CursoDao {
    @Override
    public void create(Curso curso) {
        System.out.println("grabando en file");
    }

    @Override
    public void update(Curso curso) {
        System.out.println("actualizando en file");
    }

    @Override
    public void delete(int id) {
        System.out.println("borrando en file");
    }

    @Override
    public Curso find(int id) {
        System.out.println("buscando en file");
        return null;
    }

    @Override
    public List<Curso> findAll() {
        System.out.println("listar en file");
        return null;
    }

    //este metodo es de CursoDao
    @Override
    public List<Curso> findByName(String name) {
        return null;
    }
}