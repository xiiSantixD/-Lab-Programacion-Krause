package daoimpl;

import dao.EstudianteDao;
import model.Estudiante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDaoimpl implements EstudianteDao {

    @Override
    public void crear(Estudiante estudiante) {

        String sql = "INSERT INTO estudiantes(id, nombre, apellido, dni, curso) VALUES (?, ?, ?, ?, ?)";

        try (Connection cx = conectar();
             PreparedStatement ps = cx.prepareStatement(sql)) {

            ps.setInt(1, estudiante.getId());
            ps.setString(2, estudiante.getNombre());
            ps.setString(3, estudiante.getApellido());
            ps.setInt(4, estudiante.getDni());
            ps.setString(5, estudiante.getCurso());

            ps.executeUpdate();

            System.out.println("Estudiante creado correctamente");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public Estudiante listarPorId(int id) {

        String sql = "SELECT id, nombre, apellido, dni, curso FROM estudiantes WHERE id = ?";

        try (Connection cx = conectar();
             PreparedStatement ps = cx.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    return new Estudiante(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("dni"),
                        rs.getString("curso"));
          }
       }
   }catch (SQLException e) {
    e.printStackTrace();
  }
    return null;
    }
    @Override
    public List<Estudiante> listarTodos() {

        List<Estudiante> estudiantes = new ArrayList<>();

        String sql = "SELECT id, nombre, apellido, dni, curso FROM estudiantes";

        try (Connection cx = conectar();
             PreparedStatement ps = cx.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Estudiante estudiante = new Estudiante(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getInt("dni"),
                    rs.getString("curso"));
                
                estudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return estudiantes;
    }
    @Override
    public void actualizar(Estudiante estudiante) {
        String sql = "UPDATE estudiantes SET nombre = ?, apellido = ?, dni = ?, curso = ? WHERE id = ?";

        try (Connection cx = conectar();
             PreparedStatement ps = cx.prepareStatement(sql)) {

            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setInt(3, estudiante.getDni());
            ps.setString(4, estudiante.getCurso());
            ps.setInt(5, estudiante.getId());

            ps.executeUpdate();
            System.out.println("Estudiante actualizado correctamente");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void eliminar(Estudiante estudiante) {
        String sql = "DELETE FROM estudiantes WHERE id = ?";
        try (Connection cx = conectar();
             PreparedStatement ps = cx.prepareStatement(sql)) {
            ps.setInt(1, estudiante.getId());
            ps.executeUpdate();

            System.out.println("Estudiante eliminado correctamente");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static String url = "jdbc:mysql://localhost:3307/bdd?useSSL=false&serverTimezone=UTC";
    private static String user = "root";
    private static String password = "";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
