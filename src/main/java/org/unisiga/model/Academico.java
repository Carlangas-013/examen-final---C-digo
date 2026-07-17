package org.unisiga.model;

public class Academico extends MiembroUniversitario {
    private String idEmpleado;
    private String tipoContrato;

    public Academico() {
        super();
    }

    public Academico(String rut, String nombre, String correoInstitucional, String idEmpleado, String tipoContrato) {
        super(rut, nombre, correoInstitucional);
        this.idEmpleado = idEmpleado;
        this.tipoContrato = tipoContrato;
    }

    public String getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(String idEmpleado) { this.idEmpleado = idEmpleado; }

    public String getTipoContrato() { return tipoContrato; }
    public void setTipoContrato(String tipoContrato) { this.tipoContrato = tipoContrato; }

    // Método del diagrama UML
    public void registrarNota() {
        System.out.println("Académico " + this.nombre + " está registrando una nota.");
    }
}
