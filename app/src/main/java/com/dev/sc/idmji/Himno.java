package com.dev.sc.idmji;


import java.io.Serializable;

public class Himno implements Serializable{
    private String id;
    private String nombreHimno;
    private String descripcion;

    public String getDescripcion() {

        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId(){

        return id;
    }
    public String getNombreHimno()    {
        return nombreHimno;
    }

    public void  setId(String id){

        this.id=id;
    }
    public void setNombreHimno(String nombreHimno) {

        this.nombreHimno = nombreHimno;
    }

    public Himno( String id,String nombreHimno, String descripcion) {

        this.nombreHimno= nombreHimno;
        this.id=id;
        this.descripcion=descripcion;
    }

    public Himno() {

    }
}
