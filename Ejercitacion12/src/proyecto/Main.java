package proyecto;
import service.EstudianteService;
public class Main {

	public static void main(String[] args) {
    	EstudianteService service = new EstudianteService();
    	service.Registrar("Santiago", "Rodriguez", 39243932, "quinto");
        service.Registrar("Angel", "Martinez", 30222111, "sexto");
        service.Registrar("Nahuel", "Martinez", 31222333, "cuarto");
        service.Registrar("Julian", "Sanchez", 40222444, "quinto");
        service.Registrar("Lautaro", "Juarez", 38222555, "sexto");
        service.Registrar("Rodrigo", "Moreno", 36222666, "cuarto");
        service.Registrar("Juan", "Suarez", 32222777, "quinto");
        service.Registrar("Enzo", "Jeremias", 42222888, "quinto");
        service.Registrar("Alexis", "Orion", 39222999, "cuarto");
        service.Registrar("Paulo", "Gonzalez", 35222000, "quinto");

        System.out.println("===== LISTA DE ESTUDIANTES =====");
        service.ListarTodo();
        System.out.println("\n ELIMINAR ID 4 ");
        service.Eliminar(4);
        System.out.println("\n ACTUALIZAR ID 6 ");
        service.Actualizar(6,"Rodrigo", "Moreno", 36222666, "quinto");
        System.out.println("\n ACTUALIZAR ID 8 ");
        service.Actualizar(8,"Enzo", "Jeremias", 42222888, "sexto");
        System.out.println("\n  LISTA FINAL ");
        service.ListarTodo();
    }

}

