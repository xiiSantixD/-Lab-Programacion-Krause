import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static String URL = "jdbc:mysql://localhost:3307/vendedores_db";
    private static String Usuario = "root";
    private static String Contrasena = "";

    public static Connection conectar() {
        try {
            Connection conexion = DriverManager.getConnection(URL, Usuario, Contrasena);
            System.out.println("Conexion exitosa");
            return conexion;
        } catch (SQLException e) {
            System.out.println("Error de conexion: " + e.getMessage());
            return null;
        }
    }
}