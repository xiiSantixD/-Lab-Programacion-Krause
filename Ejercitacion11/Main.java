import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
 
        Connection conexion = Conexion.conectar();

        if (conexion == null) {
            return;
        }

        insertarVendedores(conexion);
        borrarVendedor(conexion, 4);
        modificarVendedor(conexion, 2, "Gonzalez", "Tecnologia");
        listarVendedores(conexion);

        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion");
        }
    }

    public static void insertarVendedores(Connection conexion) {

        String sql = "INSERT INTO vendedores (nombre, apellido, dni, rubro, actual) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);

            sentencia.setString(1, "Juan");
            sentencia.setString(2, "Perez");
            sentencia.setString(3, "40111222");
            sentencia.setString(4, "Ropa");
            sentencia.setBoolean(5, true);
            sentencia.executeUpdate();

            sentencia.setString(1, "Pedro");
            sentencia.setString(2, "Gomez");
            sentencia.setString(3, "40222333");
            sentencia.setString(4, "Electronica");
            sentencia.setBoolean(5, true);
            sentencia.executeUpdate();

            sentencia.setString(1, "Martin");
            sentencia.setString(2, "Rodriguez");
            sentencia.setString(3, "40333444");
            sentencia.setString(4, "Alimentos");
            sentencia.setBoolean(5, true);
            sentencia.executeUpdate();

            sentencia.setString(1, "Lucas");
            sentencia.setString(2, "Fernandez");
            sentencia.setString(3, "40444555");
            sentencia.setString(4, "Calzado");
            sentencia.setBoolean(5, false);
            sentencia.executeUpdate();

            sentencia.setString(1, "Santiago");
            sentencia.setString(2, "Lopez");
            sentencia.setString(3, "40555666");
            sentencia.setString(4, "Tecnologia");
            sentencia.setBoolean(5, true);
            sentencia.executeUpdate();

            System.out.println("5 vendedores insertados");

        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }

    public static void borrarVendedor(Connection conexion, int id) {

        String sql = "DELETE FROM vendedores WHERE id = ?";

        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);

            sentencia.setInt(1, id);

            int filas = sentencia.executeUpdate();

            if (filas > 0) {
                System.out.println("Vendedor con ID " + id + " eliminado");
            } else {
                System.out.println("No existe el vendedor con ID " + id);
            }

        } catch (SQLException e) {
            System.out.println("Error al borrar: " + e.getMessage());
        }
    }

    public static void modificarVendedor(Connection conexion, int id, String apellido, String rubro) {

        String sql = "UPDATE vendedores SET apellido = ?, rubro = ? WHERE id = ?";

        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);

            sentencia.setString(1, apellido);
            sentencia.setString(2, rubro);
            sentencia.setInt(3, id);

            int filas = sentencia.executeUpdate();

            if (filas > 0) {
                System.out.println("Vendedor con ID " + id + " modificado");
            } else {
                System.out.println("No existe el vendedor con ID " + id);
            }

        } catch (SQLException e) {
            System.out.println("Error al modificar: " + e.getMessage());
        }
    }

    public static void listarVendedores(Connection conexion) {

        String sql = "SELECT * FROM vendedores";

        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();

            System.out.println("\nLISTA DE VENDEDORES");
            System.out.println("-----------------------------");

            while (resultado.next()) {

                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String dni = resultado.getString("dni");
                String rubro = resultado.getString("rubro");
                boolean actual = resultado.getBoolean("actual");

                System.out.println("ID: " + id);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido: " + apellido);
                System.out.println("DNI: " + dni);
                System.out.println("Rubro: " + rubro);
                System.out.println("Actual: " + actual);
                System.out.println("-----------------------------");
            }

        } catch (SQLException e) {
            System.out.println("Error al listar: " + e.getMessage());
        }
    }
}