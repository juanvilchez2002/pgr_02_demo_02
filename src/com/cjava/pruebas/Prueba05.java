package com.cjava.pruebas;

import com.cjava.modelo.daos.AlumnoDao;
import com.cjava.modelo.daos.impl.DaoFactory;
import com.cjava.modelo.entidades.Alumno;
import com.cjava.util.Util;

public class Prueba05 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan", "Vilchez", 17.5);
        Alumno alumno2 = new Alumno("Julio", "Calle", 17.5);
        Alumno alumno3 = new Alumno("Henry", "Caman", 17.5);

        AlumnoDao dao = DaoFactory.getInstance().getAlumnoDao(Util.opc);
        dao.create(alumno1);
        dao.create(alumno2);
        dao.create(alumno3);

        dao.findAll().forEach(System.out::println);
    }
}
