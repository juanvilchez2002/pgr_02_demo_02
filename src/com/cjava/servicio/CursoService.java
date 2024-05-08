package com.cjava.servicio;

import com.cjava.modelo.entidades.Curso;

import java.util.List;

public interface CursoService {
    public void grabar(Curso curso);
    public void actualizar(Curso curso);
    public void eliminar(int id);
    public Curso buscar(int id);
    public List<Curso> listar();
}
