package Models;

import java.util.*;

public class Materia {

    private UUID idMateria;
    private String nombre;

    private String programa;

    private Boolean aprobada;

    private Set<Materia> correlativas;

    public Materia(String nombre, String programa, Boolean aprobada) {
        this.idMateria = UUID.randomUUID();
        this.nombre = nombre;
        this.programa = programa;
        this.aprobada = aprobada;
        this.correlativas = new HashSet<>();
    }

    public Materia(String nombre, Boolean aprobada) {
        this.idMateria = UUID.randomUUID();
        this.nombre = nombre;
        this.aprobada = aprobada;
        this.correlativas = new HashSet<>();
    }

    public UUID getIdMateria() {
        return idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public Boolean getAprobada() {
        return aprobada;
    }

    public void setAprobada(Boolean aprobada) {
        this.aprobada = aprobada;
    }

    public void agregarCorrelativa(Materia materia){
        getCorrelativas().add(materia);
        System.out.println("Materia agregada");
    }

    public Set<Materia> getCorrelativas() {
        return correlativas;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
