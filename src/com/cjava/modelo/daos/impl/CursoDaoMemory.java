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
        //con SET se le indica la posicion del objeto y se pasa el nuevo objeto
        //esto reemplaza valores
        lista.set(lista.indexOf(curso), curso);

        //con lista.add(valor, 1); esto le indicamos que el valo pasara a la posicion
        //1 de la lista y los demas valores se reacomodan
    }

    @Override
    public void delete(int id) {
        System.out.println("borrando en memoria");
        for (Curso curso: lista){
            if(curso.getId()==id){
                lista.remove(curso);
                break;
            }
        }
    }

    @Override
    public Curso find(int id) {
        System.out.println("buscando en memoria");
        for (Curso curso: lista){
            if(curso.getId()==id) return curso;
        }
        return null;
    }

    @Override
    public List<Curso> findAll() {
        System.out.println("listar en memoria");
        return lista;
    }

    //este metodo es de CursoDao
    @Override
    public List<Curso> findByName(String name) {
        return null;
    }
}
