package Examenes;
import java.util.ArrayList;
import java.util.Arrays;

import Examenes.Asignaturas.asignaturas;
public class Student {
    private String nombre;
    private String dni;
    private int edad;
    private asignaturas[] asignaturas;
    public Student(String nombre, String dni, int edad, Examenes.Asignaturas.asignaturas[] asignaturas) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.asignaturas = asignaturas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public asignaturas[] getAsignaturas() {
        return asignaturas;
    }
    public void setAsignaturas(asignaturas[] asignaturas) {
        this.asignaturas = asignaturas;
    }
    @Override
    public String toString() {
        return "Student [asignaturas=" + Arrays.toString(asignaturas) + ", dni=" + dni + ", edad=" + edad + ", nombre="
                + nombre + "]";
    }
    
    





}
