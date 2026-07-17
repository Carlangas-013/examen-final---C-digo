package org.unisiga.model;

public class Asignatura {
    private String codigo;
    private String nombre;
    private Integer creditosSCT;
    private Asignatura prerrequisito; 

    public Asignatura() {
    }

    public Asignatura(String codigo, String nombre, Integer creditosSCT) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditosSCT = creditosSCT;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getCreditosSCT() { return creditosSCT; }
    public void setCreditosSCT(Integer creditosSCT) { this.creditosSCT = creditosSCT; }

    public Asignatura getPrerrequisito() { return prerrequisito; }
    public void setPrerrequisito(Asignatura prerrequisito) { this.prerrequisito = prerrequisito; }
}
