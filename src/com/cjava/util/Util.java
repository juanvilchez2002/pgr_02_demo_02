package com.cjava.util;

public class Util {
    public static Tipo opc = Tipo.MEMORY;

    //variable para el id
    public static int id = 1;
    public static int generarId(){
        return id++;
    }
}
