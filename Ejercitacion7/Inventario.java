package ejercicio7;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> listaProductos;

    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        listaProductos.add(p);
    }

    public void listarProductos() {
        System.out.println("Lista de productos en el inventario: ");
        for (Producto p : listaProductos) {
            p.mostrarInformacion();
        }
    }

    public int cantidadProductos() {
        return listaProductos.size();
    }
}