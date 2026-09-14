package negocio;
import service.EmpleadoService;

public class Main {
	public static void main(String[] args) {
		EmpleadoService service = new EmpleadoService();
    try {
        service.Registrar("Santiago", "Rodriguez", 38123456, "Desarrollador", 150000);
        System.out.println("Empleado registrado correctamente");
    }catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    try {
        service.Registrar("Rodrigo", "Moreno", 38123456, "Analista", 120000);
    }catch (Exception e) {
        System.out.println("Error DNI Duplicado capturado: " + e.getMessage());
    }
    try {
        service.Registrar("Lisandro", "Sadañoski", 40123456, "Director", 200000);
    }catch (Exception e) {
        System.out.println("Error Cargo capturado: " + e.getMessage());
    }
    try {
        service.Eliminar(999);
    }catch (Exception e) {
        System.out.println("Error ID no encontrado: " + e.getMessage());
    }
    try {
        service.Eliminar(1);
        System.out.println("Empleado eliminado (baja logica).");
        
        service.Eliminar(1);
    }catch (Exception e) {
        System.out.println("Error Inactivo capturado: " + e.getMessage());
    }
    try {
        service.Actualizar(1, "Santiago", "Rodriguez", 123, "Desarrollador", 150000);
    }catch (Exception e) {
        System.out.println("Error DNI Invalido capturado: " + e.getMessage());
    }
}
}

