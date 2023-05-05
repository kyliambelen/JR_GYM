package dao;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class AsistenciaDao {

    private final Conexion conexion = new Conexion();

    public boolean eliminarAsistencia(int idasistencia) throws SQLException {

        boolean fueEliminado = false;

        Connection conn = conexion.conectar();

        try {

            String sql = "DELETE FROM asistencia WHERE idasistencia = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, idasistencia);

            fueEliminado = (stmt.executeUpdate() > 0);

        } catch (SQLException e) {
            System.out.println("Error Eliminando el Registro." + e.getMessage());
        }

        return fueEliminado;
    }

    /*  FUNCION  PARA  HACER  LA  BUSQUEDA EN  LA  TABLA  BUSCAR ASISTENCIA    */
    public DefaultTableModel buscarAsistencias(String buscar) {

        String[] nombresColumnas = {"ID", "CEDULA", "NOMBRES", "FECHA", "TIEMPO", "HORA ENTRADA", "HORA SALIDA", "OBSERVACIONES"};//Indica el nombre de las columnas en la tabla

        String[] registros = new String[8];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        String sql = "SELECT idasistencia, cedula,nombres,fecha,tiempo,hora_entrada,hora_salida,observaciones FROM asistencia WHERE idasistencia LIKE '%" + buscar + "%' OR cedula LIKE '%" + buscar + "%' OR nombres LIKE '%" + buscar + "%' OR fecha LIKE '%" + buscar + "%' OR observaciones LIKE '%" + buscar + "%'";

        Connection conn = conexion.conectar();

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString("idasistencia");

                registros[1] = rs.getString("cedula");

                registros[2] = rs.getString("nombres");

                registros[3] = rs.getString("fecha");

                registros[4] = rs.getString("tiempo");

                registros[5] = rs.getString("hora_entrada");

                registros[6] = rs.getString("hora_salida");

                registros[7] = rs.getString("observaciones");

                modelo.addRow(registros);

            }
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al conectar. " + e.getMessage());

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }

                if (pst != null) {
                    pst.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return modelo;

    }
}