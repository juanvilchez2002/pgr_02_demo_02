package com.cjava.pruebas;

import com.cjava.modelo.daos.CursoDao;
import com.cjava.modelo.daos.impl.DaoFactory;
import com.cjava.modelo.entidades.Curso;
import com.cjava.util.Tipo;
import com.cjava.util.Util;

public class Prueba04 {
    public static void main(String[] args) {
        Curso c01 = new Curso(100, "Java", 3);
        Curso c02 = new Curso(200, "Html", 3);
        Curso c03 = new Curso(300, "JS", 3);

        CursoDao dao = DaoFactory.getInstance().getCursoDao(Util.opc);
        dao.create(c01);
        dao.create(c02);
        dao.create(c03);

        for (Curso c: dao.findAll()){
            System.out.println(c);
        }
    }
}
