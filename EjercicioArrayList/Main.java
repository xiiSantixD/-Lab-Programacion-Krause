package colegio;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso("5°2°");

        curso.inscribir(new Estudiante("Lucas Janson", "12345678", 8.5));
        curso.inscribir(new Estudiante("Miguel Merentiel", "23456789", 9.2));
        curso.inscribir(new Estudiante("Exequiel Zeballos", "34567890", 7.8));

        System.out.println("Cantidad de alumnos: " + curso.cantidadAlumnos());

        curso.darDeBaja(1);

        curso.listarAlumnos();
    }
}
