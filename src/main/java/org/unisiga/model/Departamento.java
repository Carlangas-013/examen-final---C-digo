package org.unisiga.model;

public class Departamento {
    private String codigoDepto;
    private String nombre;

    public Departamento() {
    }

    public Departamento(String codigoDepto, String nombre) {
        this.codigoDepto = codigoDepto;
        this.nombre = nombre;
    }

    public String getCodigoDepto() { return codigoDepto; }
    public void setCodigoDepto(String codigoDepto) { this.codigoDepto = codigoDepto; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
