package com.cjava.pruebas;

import com.cjava.modelo.daos.CursoDao;
import com.cjava.modelo.daos.impl.DaoFactory;
import com.cjava.modelo.entidades.Curso;
import com.cjava.util.Tipo;
import com.cjava.util.Util;

public class Prueba01 {
    public static void main(String[] args) {
        CursoDao dao = DaoFactory.getInstance().getCursoDao(Util.opc);
        dao.create(new Curso());

    }
}
