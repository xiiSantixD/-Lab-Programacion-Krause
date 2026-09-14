package service;
import java.util.List;
import dao.EstudianteDao;
import daoimpl.EstudianteDaoimpl;
import model.Estudiante;

public class EstudianteService {
	private final EstudianteDao estudiantedao;
    public EstudianteService() {

    	this.estudiantedao = new EstudianteDaoimpl();
    }
    public void Registrar(String nombre, String apellido, int dni, String curso) {

        Estudiante estudiante = new Estudiante(0, nombre, apellido, dni, curso);
        estudiantedao.crear(estudiante);
    }
    public void Actualizar(int id, String nombre, String apellido, int dni, String curso) {
        Estudiante estudiante = new Estudiante(id, nombre, apellido, dni, curso);
        estudiantedao.actualizar(estudiante);
    }

    public void ListarTodo() {
        List<Estudiante> estudiantes = estudiantedao.listarTodos();
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

}
    public void ListarPorId(int id) {

        Estudiante estudiante = estudiantedao.listarPorId(id);
        if (estudiante != null) {
            System.out.println(estudiante);
        }else{
            System.out.println("No se encontro el estudiante");
        }
    }
    public void Eliminar(int id) {
    	Estudiante estudiante = estudiantedao.listarPorId(id);
    	if (estudiante != null) {
            estudiantedao.eliminar(estudiante);
            System.out.println("Estudiante eliminado");
        }else{
            System.out.println("No se encontro el estudiante");
        }

    }

}




