package ejercitacion8;

public class Tutor {

    private String nombre;
    private String telefono;

    public Tutor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nTelefono: " + telefono;
    }
}