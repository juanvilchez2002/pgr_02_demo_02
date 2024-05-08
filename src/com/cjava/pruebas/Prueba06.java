package com.cjava.pruebas;

import com.cjava.modelo.daos.CursoDao;
import com.cjava.modelo.daos.impl.DaoFactory;
import com.cjava.modelo.entidades.Curso;
import com.cjava.servicio.CursoService;
import com.cjava.servicio.impl.CursoServiceImpl;
import com.cjava.util.Util;

public class Prueba06 {
    public static void main(String[] args) {

        CursoService service = new CursoServiceImpl();

        Curso c01 = new Curso(100, "Java", 3);
        Curso c02 = new Curso(200, "Html", 3);
        Curso c03 = new Curso(300, "JS", 3);

        service.grabar(c01);
        service.grabar(c02);
        service.grabar(c03);

        service.listar().forEach(System.out::println);
    }
}
