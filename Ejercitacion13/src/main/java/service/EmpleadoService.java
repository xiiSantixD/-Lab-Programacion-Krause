package service;
import dao.EmpleadoDao;
import daoimpl.EmpleadoDaoimpl;
import excepciones.*;
import model.Empleado;
import java.util.Arrays;
import java.util.List;

public class EmpleadoService {
	private final EmpleadoDao dao = new EmpleadoDaoimpl ();
	private final List<String> cargosPermitidos = Arrays.asList("Analista", "Desarrollador", "Gerente", "Soporte");		
			
	public void Registrar(String nombre, String apellido, int dni, String cargo, double salario)		
			throws DniInvalidoException, DniDuplicadoException, SalarioInvalidoException, CargoInvalidoException {
		validarDatos(dni, cargo, salario);

        if (dao.buscarPorDni(dni) != null) {
            throw new DniDuplicadoException("El DNI " + dni + " ya se encuentra registrado");
	}
        Empleado emp = new Empleado(nombre, apellido, dni, cargo, salario);
        dao.crear(emp);
    }

    public void Actualizar(int id, String nombre, String apellido, int dni, String cargo, double salario)
            throws EmpleadoNoEncontradoException, DniInvalidoException, DniDuplicadoException, SalarioInvalidoException, CargoInvalidoException {
        
        Empleado empExistente = dao.listarPorId(id);
        if (empExistente == null) {
            throw new EmpleadoNoEncontradoException("No se encontró el empleado con ID: " + id);
        }
        validarDatos(dni, cargo, salario);
        
        Empleado empPorDni = dao.buscarPorDni(dni);
        if (empPorDni != null && empPorDni.getId() != id) {
            throw new DniDuplicadoException("El DNI " + dni + " pertenece a otro empleado");
        }
        Empleado emp = new Empleado(id, nombre, apellido, dni, cargo, salario, empExistente.isActivo());
        dao.actualizar(emp);
    }
    public void Eliminar(int id) throws EmpleadoNoEncontradoException, EmpleadoYaInactivoException {
        Empleado emp = dao.listarPorId(id);
        if (emp == null) {
            throw new EmpleadoNoEncontradoException("No existe empleado con ID: " + id);
        }
        if (!emp.isActivo()) {
            throw new EmpleadoYaInactivoException("El empleado con ID " + id + " ya está inactivo");
        }
        dao.eliminar(id);
    }
    public Empleado ListarPorId(int id) throws EmpleadoNoEncontradoException {
        Empleado emp = dao.listarPorId(id);
        if (emp == null) {
            throw new EmpleadoNoEncontradoException("No existe el empleado con ID: " + id);
        }
        return emp;
    }
    public List<Empleado> ListarTodo() {
        return dao.listarTodo();
    }
    private void validarDatos(int dni, String cargo, double salario)
            throws DniInvalidoException, SalarioInvalidoException, CargoInvalidoException {
        
        int len = String.valueOf(dni).length();
        if (len <= 7 || len > 8) {
            throw new DniInvalidoException("El DNI debe contener 7 u 8 dígitos");
        }
        if (salario <= 0) {
            throw new SalarioInvalidoException("El salario debe ser mayor a 0.");
        }
        if (!cargosPermitidos.contains(cargo)) {
            throw new CargoInvalidoException("El cargo '" + cargo + "' no es válido. Permitidos: " + cargosPermitidos);
        }
    }
}

