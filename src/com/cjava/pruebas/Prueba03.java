package com.cjava.pruebas;

import com.cjava.modelo.entidades.Curso;

import java.util.ArrayList;

public class Prueba03 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add(1);
        lista.add("Juan");
        lista.add(new Curso());
        lista.add(new ArrayList<Curso>());

        lista.forEach(System.out::println);
    }
}
