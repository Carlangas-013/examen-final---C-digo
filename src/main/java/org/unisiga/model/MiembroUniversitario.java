package org.unisiga.model;

public abstract class MiembroUniversitario {
    protected String rut;
    protected String nombre;
    protected String correoInstitucional;

    // Constructor vacío
    public MiembroUniversitario() {
    }

    // Constructor con parámetros
    public MiembroUniversitario(String rut, String nombre, String correoInstitucional) {
        this.rut = rut;
        this.nombre = nombre;
        this.correoInstitucional = correoInstitucional;
    }

    // Métodos Getters y Setters
    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreoInstitucional() { return correoInstitucional; }
    public void setCorreoInstitucional(String correoInstitucional) { this.correoInstitucional = correoInstitucional; }

    // Método del diagrama UML
    public Boolean login() {
        // Aquí iría la lógica de autenticación
        System.out.println("Iniciando sesión para: " + this.correoInstitucional);
        return true;
    }
}
