package org.unisiga.model;

public class Estudiante extends MiembroUniversitario {
    private String matricula;
    private Integer anioIngreso;
    private Float promedio;

    public Estudiante() {
        super();
    }

    public Estudiante(String rut, String nombre, String correoInstitucional, String matricula, Integer anioIngreso, Float promedio) {
        super(rut, nombre, correoInstitucional); // Llama al constructor del padre
        this.matricula = matricula;
        this.anioIngreso = anioIngreso;
        this.promedio = promedio;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public Integer getAnioIngreso() { return anioIngreso; }
    public void setAnioIngreso(Integer anioIngreso) { this.anioIngreso = anioIngreso; }

    public Float getPromedio() { return promedio; }
    public void setPromedio(Float promedio) { this.promedio = promedio; }

    // Método del diagrama UML
    public void inscribirSeccion() {
        System.out.println("Estudiante " + this.nombre + " está inscribiendo una sección.");
    }
}
