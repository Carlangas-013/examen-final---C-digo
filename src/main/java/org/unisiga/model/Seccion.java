package org.unisiga.model;

public class Seccion {
    private Character idGrupo;
    private Integer cupoMaximo;
    private String horario;

    public Seccion() {
    }

    public Seccion(Character idGrupo, Integer cupoMaximo, String horario) {
        this.idGrupo = idGrupo;
        this.cupoMaximo = cupoMaximo;
        this.horario = horario;
    }

    public Character getIdGrupo() { 
        return idGrupo; 
    }
    
    public void setIdGrupo(Character idGrupo) { 
        this.idGrupo = idGrupo; 
    }

    public Integer getCupoMaximo() { 
        return cupoMaximo; 
    }
    
    public void setCupoMaximo(Integer cupoMaximo) { 
        this.cupoMaximo = cupoMaximo; 
    }

    public String getHorario() { 
        return horario; 
    }
    
    public void setHorario(String horario) { 
        this.horario = horario; 
    }
}
