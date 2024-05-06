package com.cjava.modelo.daos;

import java.util.List;

public interface EntityDao <T> {
    //creo una interface que fusionara CursoDao y AlumnoDao, ambos tienen los mismos
    //metodos, se crea una interface que recibe una clase de tipo generica y se define
    //con el tipo T y de nombre t

    public void create(T t);
    public void update(T t);
    public void delete(int id);
    public T find(int id);
    public List<T> findAll();
}
