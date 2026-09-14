package dao;
import java.util.List;
import model.Empleado;

public interface EmpleadoDao {
	void crear(Empleado e);
    void actualizar(Empleado e);
    void eliminar(int id);
    Empleado listarPorId(int id);
    List<Empleado> listarTodo();
    Empleado buscarPorDni(int dni);
}