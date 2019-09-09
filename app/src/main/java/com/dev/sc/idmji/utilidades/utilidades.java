package com.dev.sc.idmji.utilidades;

public class utilidades {

    //Constantes tablas himnos
    public static final String TABLA_HIMNO = "himno";
    public static final String CAMPO_ID = "id";
    public static final String CAMPO_NOMBRE = "nombre";
    public static final String CAMPO_CONTENIDO = "contenido";
    public static final String CAMPO_CORO = "coro";
    public static final String CAMPO_CONTENIDO_DOS = "contenido_dos";

    public final static String CREAR_TABLA_HIMNO = "CREATE TABLE "+TABLA_HIMNO+" ("+CAMPO_ID+" TEXT, "+CAMPO_NOMBRE+" TEXT, "+CAMPO_CONTENIDO+" TEXT, "+CAMPO_CORO+" TEXT, "+CAMPO_CONTENIDO_DOS+" TEXT );";

}
