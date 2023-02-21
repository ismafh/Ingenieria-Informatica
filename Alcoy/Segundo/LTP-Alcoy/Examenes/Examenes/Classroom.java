package Examenes;
import java.util.ArrayList;
public class Classroom {  
ArrayList<Student> clase = new ArrayList<Student>();
Asignaturas[] asignaturas;
public Classroom(Asignaturas[] asignaturas){
    this.clase=new ArrayList<>();
    this.asignaturas = asignaturas;

}
public ArrayList<Student> geStudents(){
    return this.clase;
}
}
