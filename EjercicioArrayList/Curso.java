package colegio;

import java.util.ArrayList;

public class Curso {
    private String nombre;
    private ArrayList<Estudiante> alumnos;

    public Curso(String nombre) {
        this.nombre = nombre;
        alumnos = new ArrayList<>();
    }

    public void inscribir(Estudiante e) {
        alumnos.add(e);
    }

    public void darDeBaja(int indice) {
        alumnos.remove(indice);
    }

    public void listarAlumnos() {
        for (Estudiante e : alumnos) {
            e.mostrarFicha();
        }
    }

    public int cantidadAlumnos() {
        return alumnos.size();
    }
}