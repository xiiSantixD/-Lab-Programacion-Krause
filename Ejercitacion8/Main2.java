package ejercitacion8;

public class Main2 {

    public static void main(String[] args) {

        Escuela escuela = new Escuela();

        Alumno alumno1 = new Alumno("45678912", "Lionel Messi", "5A", 5, "Regular");
        Alumno alumno2 = new Alumno("40123456", "Santiago Rodriguez", "5A", 22, "Libre");
        Alumno alumno3 = new Alumno("38987654", "Pedro", "5B", 3, "Regular");

        Tutor tutor = new Tutor("Carlos Perez", "1122334455");

        alumno1.setTutor(tutor);

        escuela.agregarAlumno(alumno1);
        escuela.agregarAlumno(alumno2);
        escuela.agregarAlumno(alumno3);

        escuela.consultarAlumno(0);

        escuela.consultarAlumno(10);

        escuela.registrarInasistencias(0, "2");

        escuela.registrarInasistencias(0, "abc");

        escuela.mostrarTutor(0);

        escuela.mostrarTutor(1);

        try {

            alumno2.realizarOperacionEspecial();

        } catch (AlumnoLibre e) {

            System.out.println(e.getMessage());

        }

        try {

            Alumno prueba = new Alumno("12345678", "Prueba", "5C", -1, "Regular");

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

    }

}