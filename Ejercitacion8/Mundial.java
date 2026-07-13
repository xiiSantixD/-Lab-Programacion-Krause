package ejercitacion8;

import java.util.ArrayList;

public class Mundial {

    private ArrayList<Seleccion> selecciones;

    public Mundial() {
        selecciones = new ArrayList<>();
    }

    public void agregarSeleccion(Seleccion seleccion) {
        selecciones.add(seleccion);
    }

    public void consultarSeleccion(int posicion) {
        try {
            System.out.println(selecciones.get(posicion));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posicion inexistente.");
        } finally {
            System.out.println("Consulta finalizada.");
        }
    }

    public void actualizarPuntos(int posicion, String puntos) {

        try {

            int nuevosPuntos = Integer.parseInt(puntos);
            selecciones.get(posicion).setPuntos(nuevosPuntos);

            System.out.println("Puntos actualizados.");

        } catch (NumberFormatException e) {

            System.out.println("Debe ingresar un numero.");

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Seleccion inexistente.");

        } finally {

            System.out.println("Proceso terminado.");

        }

    }

    public void mostrarDirectorTecnico(int posicion) {

        try {

            System.out.println(selecciones.get(posicion).getDirectorTecnico().toString());

        } catch (NullPointerException e) {

            System.out.println("La seleccion no posee director tecnico.");

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Seleccion inexistente.");

        }

    }

    public ArrayList<Seleccion> getSelecciones() {
        return selecciones;
    }

}