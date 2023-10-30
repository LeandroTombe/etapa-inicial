package Models;

import java.util.*;

public class Inscripcion {


    private UUID idInscripcion;

    private Alumno alumno;

    private Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
            Set<Materia> noAprobadas= new HashSet<>();

            for (Materia materias: materia.getCorrelativas()) {
                if (materias.getAprobada()==false){
                    noAprobadas.add(materias);
                }
            }

            if (noAprobadas.size()==0){
                alumno.getMaterias().add(materia);
                this.setAlumno(alumno);
                this.setMateria(materia);

                System.out.println("El alumno se ha inscripto correctamente");
            } else {
                System.out.println("No puede incribirse porque tiene que aprobar:");
                for (Materia noAprobado:noAprobadas) {
                    System.out.println(noAprobado.getNombre());
                }
            }
    }

    public UUID getIdInscripcion() {
        return idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }




}
