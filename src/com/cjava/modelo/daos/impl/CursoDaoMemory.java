package com.cjava.modelo.daos.impl;

import com.cjava.modelo.daos.CursoDao;
import com.cjava.modelo.entidades.Curso;

import java.util.ArrayList;
import java.util.List;

public class CursoDaoMemory implements CursoDao {

    private List<Curso> lista;

    //se inicializa la variable lista
    public CursoDaoMemory() {
        lista = new ArrayList<>();
    }

    @Override
    public void create(Curso curso) {
        System.out.println("grabando en memoria");
        lista.add(curso);
    }

    @Override
    public void update(Curso curso) {
        System.out.println("actualizando en memoria");
    }

    @Override
    public void delete(int id) {
        System.out.println("borrando en memoria");
    }

    @Override
    public Curso find(int id) {
        System.out.println("buscando en memoria");
        return null;
    }

    @Override
    public List<Curso> findAll() {
        System.out.println("listar en memoria");
        return null;
    }

    //este metodo es de CursoDao
    @Override
    public List<Curso> findByName(String name) {
        return null;
    }
}
