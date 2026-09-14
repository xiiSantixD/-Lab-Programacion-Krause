package dao;
import model.Estudiante;
import java.util.List;

public interface EstudianteDao {
	void crear(Estudiante e);
	Estudiante listarPorId(int id);
	List<Estudiante> listarTodos();
	void eliminar(Estudiante e);
	void actualizar(Estudiante e);
}