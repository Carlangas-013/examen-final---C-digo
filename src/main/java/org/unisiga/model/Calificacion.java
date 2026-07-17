package org.unisiga.model;

public class Calificacion {
    private Float nota;

    public Calificacion() {
    }

    public Calificacion(Float nota) {
        this.nota = nota;
    }

    public Float getNota() { return nota; }
    public void setNota(Float nota) { this.nota = nota; }
}
