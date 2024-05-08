package com.cjava.servicio.impl;

import com.cjava.modelo.daos.CursoDao;
import com.cjava.modelo.daos.impl.DaoFactory;
import com.cjava.modelo.entidades.Curso;
import com.cjava.servicio.CursoService;
import com.cjava.util.Util;

import java.util.List;

public class CursoServiceImpl implements CursoService {

    //instanciamos DaoFactory
    CursoDao dao;

    public CursoServiceImpl() {
        this.dao = DaoFactory.getInstance().getCursoDao(Util.opc);
    }

    @Override
    public void grabar(Curso curso) {
        dao.create(curso);
    }

    @Override
    public void actualizar(Curso curso) {
        dao.update(curso);
    }

    @Override
    public void eliminar(int id) {
        dao.delete(id);
    }

    @Override
    public Curso buscar(int id) {
        return dao.find(id);
    }

    @Override
    public List<Curso> listar() {
        return dao.findAll();
    }
}
