package colegio;

public class Estudiante {
    private String nombre;
    private String dni;
    private double promedio;

    public Estudiante(String nombre, String dni, double promedio) {
        this.nombre = nombre;
        this.dni = dni;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Promedio: " + promedio);
        System.out.println("-------------------");
    }
}