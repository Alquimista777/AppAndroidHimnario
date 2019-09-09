package com.dev.sc.idmji;
import java.io.Serializable;

public class Himno implements Serializable{

    private String id;
    private String nombreHimno;
    private String contenido;
    private String coro;
    private String contenido2;

    public Himno(String id, String nombreHimno, String contenido, String coro, String contenido2) {
        this.id = id;
        this.nombreHimno = nombreHimno;
        this.contenido = contenido;
        this.coro = coro;
        this.contenido2 = contenido2;
    }

    public Himno() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreHimno() {
        return nombreHimno;
    }

    public void setNombreHimno(String nombreHimno) {
        this.nombreHimno = nombreHimno;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getCoro() {
        return coro;
    }

    public void setCoro(String coro) {
        this.coro = coro;
    }

    public String getContenido2() {
        return contenido2;
    }

    public void setContenido2(String contenido2) {
        this.contenido2 = contenido2;
    }
}
