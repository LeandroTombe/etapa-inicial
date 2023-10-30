import Models.Alumno;
import Models.Inscripcion;
import Models.Materia;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");

        Alumno alumno1= new Alumno("leandro","tombe","123456");
        Materia materia1= new Materia("algoritmo",false);
        Materia materia2= new Materia("paradigma", false);

        materia2.agregarCorrelativa(materia1);

        Inscripcion nuevaIncripcion1= new Inscripcion(alumno1,materia1);


        alumno1.aproboMateria(materia1);


        Inscripcion nuevaIncripcion2= new Inscripcion(alumno1,materia2);
        System.out.println(alumno1.toString());



    }
}
