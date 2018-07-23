package com.gustavop.holamundo.model;

import java.util.Date;

public class Alumno {
    private String nombre;
    private long nroCuenta;
    private Date fecNac;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(long nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }
}
