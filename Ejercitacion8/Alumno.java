package ejercitacion8;

public class Alumno {

    private String dni;
    private String nombreApellido;
    private String curso;
    private int inasistencias;
    private String estadoAcademico;
    private Tutor tutor;

    public Alumno(String dni, String nombreApellido, String curso, int inasistencias, String estadoAcademico) {

        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.curso = curso;
        this.estadoAcademico = estadoAcademico;

        setInasistencias(inasistencias);

    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setInasistencias(int inasistencias) {

        if (inasistencias < 0) {
            throw new IllegalArgumentException("Las inasistencias no pueden ser negativas");
        }

        this.inasistencias = inasistencias;
    }

    public void agregarInasistencias(int cantidad) {

        setInasistencias(inasistencias + cantidad);

    }

    public void realizarOperacionEspecial() throws AlumnoLibre {

        if (inasistencias > 20) {
            throw new AlumnoLibre ("El alumno esta libre por inasistencias");
        }

        System.out.println("Operacion realizada correctamente");

    }

    @Override
    public String toString() {

        return "DNI: " + dni +
                "\nNombre: " + nombreApellido +
                "\nCurso: " + curso +
                "\nInasistencias: " + inasistencias +
                "\nEstado: " + estadoAcademico;

    }

}