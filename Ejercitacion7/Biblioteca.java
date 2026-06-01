package ejercicio7;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> inventarioLibros;

    public Biblioteca() {
        this.inventarioLibros = new ArrayList<>();
    }

    public void agregarLibro(Libro l) {
        inventarioLibros.add(l);
    }

    public void listarLibros() {
        System.out.println(" Inventario de la Biblioteca: ");
        for (Libro l : inventarioLibros) {
            l.mostrarInfo();
        }
    }

    public int cantidadLibros() {
        return inventarioLibros.size();
    }

    public Libro obtenerLibroPorIndice(int indice) {
        if (indice >= 0 && indice < inventarioLibros.size()) {
            return inventarioLibros.get(indice);
        }else{
            System.out.println("Error: El indice " + indice + " esta fuera de rango");
            return null;
        }
    }
}