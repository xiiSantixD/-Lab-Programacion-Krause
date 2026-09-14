package daoimpl;
import dao.EmpleadoDao;
import model.Empleado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDaoimpl implements EmpleadoDao {
	private Connection conexionBd() throws SQLException {
		String url = "jdbc:mysql://localhost:3307/globant_db?serverTimezone=UTC&useSSL=false";
	    String user = "root";
	    String password = "";
	    return DriverManager.getConnection(url, user, password);
	}
    @Override
    public void crear(Empleado e) {
        String sql = "INSERT INTO empleados (nombre, apellido, dni, cargo, salario, activo) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionBd(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, e.getNombre());
            stmt.setString(2, e.getApellido());
            stmt.setInt(3, e.getDni());
            stmt.setString(4, e.getCargo());
            stmt.setDouble(5, e.getSalario());
            stmt.setBoolean(6, true);
            stmt.executeUpdate();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void actualizar(Empleado e) {
        String sql = "UPDATE empleados SET nombre=?, apellido=?, dni=?, cargo=?, salario=? WHERE id=?";
        try (Connection conn = conexionBd(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, e.getNombre());
            stmt.setString(2, e.getApellido());
            stmt.setInt(3, e.getDni());
            stmt.setString(4, e.getCargo());
            stmt.setDouble(5, e.getSalario());
            stmt.setInt(6, e.getId());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void eliminar(int id) {
        String sql = "UPDATE empleados SET activo = false WHERE id = ?";
        try (Connection conn = conexionBd(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public Empleado listarPorId(int id) {
        String sql = "SELECT * FROM empleados WHERE id = ?";
        try (Connection conn = conexionBd(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Empleado(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"), rs.getInt("dni"), rs.getString("cargo"), rs.getDouble("salario"), rs.getBoolean("activo"));
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    @Override
    public List<Empleado> listarTodo() {
        List<Empleado> lista = new ArrayList<>();
        String sql = "SELECT * FROM empleados WHERE activo = true";
        try (Connection conn = conexionBd(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                lista.add(new Empleado(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"),
                        rs.getInt("dni"), rs.getString("cargo"), rs.getDouble("salario"), rs.getBoolean("activo")));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    @Override
    public Empleado buscarPorDni(int dni) {
        String sql = "SELECT * FROM empleados WHERE dni = ?";
        try (Connection conn = conexionBd(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, dni);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Empleado(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"),
                        rs.getInt("dni"), rs.getString("cargo"), rs.getDouble("salario"), rs.getBoolean("activo"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
	

