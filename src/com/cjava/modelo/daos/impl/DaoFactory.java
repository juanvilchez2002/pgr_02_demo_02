package com.cjava.modelo.daos.impl;

import com.cjava.modelo.daos.AlumnoDao;
import com.cjava.modelo.daos.CursoDao;
import com.cjava.util.Tipo;


public class DaoFactory {
    //creamos el patron de singleton
    //primer paso, se crea una instancia de tipo DaoFactory
    private static DaoFactory instance = new DaoFactory();

    //segundo paso, se crea un constructor de tipo privado
    private DaoFactory(){

    }

    //tercer paso, se crea un metodo que retorne instance
    public static DaoFactory getInstance(){
        return instance;
    }

    public CursoDao getCursoDao(Tipo tipo){
        switch(tipo){
            case MEMORY:  return new CursoDaoMemory();
            case FILE:  return new CursoDaoFile();
            case DATABASE:  return new CursoDaoDataBase();
            default: return null;
        }
    }

    public AlumnoDao getAlumnoDao(Tipo tipo){
        switch(tipo){
            case MEMORY:  return new AlumnoDaoMemory();
            case FILE:  return new AlumnoDaoFile();
            case DATABASE:  return new AlumnoDaoDatabase();
            default: return null;
        }
    }
}
