package org.unisiga.model;

import java.util.Date;

public class Inscripcion {
    private String estadoInscripcion;
    private Date fechaInscripcion;

    public Inscripcion() {
    }

    public Inscripcion(String estadoInscripcion, Date fechaInscripcion) {
        this.estadoInscripcion = estadoInscripcion;
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getEstadoInscripcion() { return estadoInscripcion; }
    public void setEstadoInscripcion(String estadoInscripcion) { this.estadoInscripcion = estadoInscripcion; }

    public Date getFechaInscripcion() { return fechaInscripcion; }
    public void setFechaInscripcion(Date fechaInscripcion) { this.fechaInscripcion = fechaInscripcion; }
}
