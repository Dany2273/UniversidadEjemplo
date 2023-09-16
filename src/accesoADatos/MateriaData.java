package accesoADatos;

import entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia(nombre, añoMateria, estado) VALUES (?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAñoMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Materia guardada correctamente.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }

    public Materia buscarMateria(int id) {
        String sql = "SELECT nombre, añoMateria, estado FROM materia "
                + "WHERE idMateria = ? AND estado = 1";
Materia materia = null;
        try {
            

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                materia = new Materia();

                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAñoMateria(rs.getInt("añoMateria"));
                materia.setActivo(rs.getBoolean("estado"));
            } else {
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage() );
        }
        return materia;
    }

    public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre = ? ,añoMateria = ? WHERE idMateria = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(2, materia.getNombre());
            ps.setInt(1, materia.getIdMateria());
            ps.setInt(3, materia.getAñoMateria());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }

    public void eliminarMateria(int id) {
        String sql = "UPDATE materia SET estado = 0  WHERE idMateria = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia eliminada con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }

    }

    public List<Materia> listarMaterias() {
        ArrayList<Materia> materias = new ArrayList<>();

        String sql = "SELECT idMateria, nombre, añoMateria FROM materia WHERE estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();

                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAñoMateria(rs.getInt("añoMateria"));
                materia.setActivo(true);

                materias.add(materia);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        return materias;
    }
}
