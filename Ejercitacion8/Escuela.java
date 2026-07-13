package ejercitacion8;

import java.util.ArrayList;

public class Escuela {

    private ArrayList<Alumno> alumnos;

    public Escuela() {
        alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void consultarAlumno(int posicion) {

        try {

            System.out.println(alumnos.get(posicion));

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Posicion invalida");

        } finally {

            System.out.println("Consulta finalizada");

        }

    }

    public void registrarInasistencias(int posicion, String cantidad) {

        try {

            int faltas = Integer.parseInt(cantidad);

            alumnos.get(posicion).agregarInasistencias(faltas);

            System.out.println("Inasistencias registradas.");

        } catch (NumberFormatException e) {

            System.out.println("Debe ingresar un numero");

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Alumno inexistente");

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("Proceso finalizado");

        }

    }

    public void mostrarTutor(int posicion) {

        try {

            System.out.println(alumnos.get(posicion).getTutor().toString());

        } catch (NullPointerException e) {

            System.out.println("El alumno no posee tutor registrado");

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Alumno inexistente");

        }

    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

}