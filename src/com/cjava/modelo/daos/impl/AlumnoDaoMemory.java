package com.cjava.modelo.daos.impl;

import com.cjava.modelo.daos.AlumnoDao;
import com.cjava.modelo.entidades.Alumno;

import java.util.ArrayList;
import java.util.List;

public class AlumnoDaoMemory implements AlumnoDao {
    //creamos una lista de alumnos
    List<Alumno> lista;

    //la inicialicamos con el constructor
    public AlumnoDaoMemory(){
        lista = new ArrayList<>();
    }

    @Override
    public void create(Alumno alumno) {
        System.out.println("Creando alumno en Memory");
        //adicionamos a la lista el nuevo alumno
        lista.add(alumno);
    }

    @Override
    public void update(Alumno alumno) {
        System.out.println("Actualizando alumno en Memory");
        //actualizamos el valor de alumno q nos envian
        lista.set(lista.indexOf(alumno), alumno);
    }

    @Override
    public void delete(int id) {
        System.out.println("Eliminando alumno en Memory");
        //eliminamos el valor de la lista
        for (Alumno alumno : lista) {
            if(alumno.getId() == id){
                System.out.println("Alumno eliminado: "+alumno.toString());
                lista.remove(alumno);
                break;
            }
            System.out.println("No se encontro al alumno con Id: "+id);
        }

    }

    @Override
    public Alumno find(int id) {
        //buscamos al alumno con id
        for (Alumno alumno : lista) {
            if(alumno.getId() == id){
                return alumno;
            }
        }
        return null;

    }

    @Override
    public List<Alumno> findAll() {
        System.out.println("Devolver todos los alumnos en Memory");
        return lista;
    }

}
