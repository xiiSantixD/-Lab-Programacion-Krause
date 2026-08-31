public class Vendedor {

    private int id;
    private String nombre;
    private String apellido;
    private String dni;
    private String rubro;
    private boolean actual;

    public Vendedor(int id, String nombre, String apellido, String dni, String rubro, boolean actual) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.rubro = rubro;
        this.actual = actual;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getRubro() {
        return rubro;
    }

    public boolean isActual() {
        return actual;
    }
}
