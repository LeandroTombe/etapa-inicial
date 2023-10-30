package Models;

import java.util.*;

public class Alumno {

    private UUID legajo;
    private String nombre;
    private String apellido;

    private String dni;



    private Set<Materia> materias;

    public Alumno(String nombre, String apellido, String dni) {
        this.legajo = UUID.randomUUID();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.materias=new LinkedHashSet<>();
    }

    public UUID getLegajo() {
        return legajo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", materias=" + materias +
                '}';
    }

    public void aproboMateria(Materia materia){
        Optional<Materia> buscarMateria= getMaterias().stream().filter(m ->m.getNombre().equals(materia.getNombre())).findFirst();

        if (buscarMateria.isPresent()){
            buscarMateria.get().setAprobada(true);
            System.out.println("aprobado cargado con exito");
        } else {
            System.out.println("El alumno no tiene la materia " + materia.getNombre());

        }

    }
}
