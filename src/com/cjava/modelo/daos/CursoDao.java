package com.cjava.modelo.daos;

import com.cjava.modelo.entidades.Curso;

import java.util.List;

public interface CursoDao extends EntityDao<Curso>{
    //se eliminan los metodos anteriores y se hace un extends con EntityDao
    //heredaran los metodos de EntityDao

    //creamos un metodo distinto a los de EntityDao
    public List<Curso> findByName(String name);
}
