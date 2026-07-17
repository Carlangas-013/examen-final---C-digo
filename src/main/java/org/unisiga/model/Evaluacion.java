package org.unisiga.model;

public class Evaluacion {
    private String titulo;
    private Float ponderacion;

    public Evaluacion() {
    }

    public Evaluacion(String titulo, Float ponderacion) {
        this.titulo = titulo;
        this.ponderacion = ponderacion;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Float getPonderacion() { return ponderacion; }
    public void setPonderacion(Float ponderacion) { this.ponderacion = ponderacion; }
}
