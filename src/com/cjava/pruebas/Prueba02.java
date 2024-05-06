package com.cjava.pruebas;

import com.cjava.modelo.daos.AlumnoDao;
import com.cjava.modelo.daos.impl.DaoFactory;
import com.cjava.modelo.entidades.Alumno;
import com.cjava.util.Util;

public class Prueba02 {
    public static void main(String[] args) {
        AlumnoDao dao = DaoFactory.getInstance().getAlumnoDao(Util.opc);
        dao.create(new Alumno(
            "Juan", "Vilchez", 14.5));
    }
}
