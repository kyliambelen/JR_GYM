package dao;

import bd.Conexion;
import entidades.PagoPendiente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class PagoPendienteDao {

    private final Conexion conexion = new Conexion();

    /*  METODO PARA  AGREGAR  LOS  PAGOS PENDIENTES  AL  SISTEMA */
    public boolean agregarPagosPendientes(PagoPendiente pagoPen) throws SQLException {

        boolean fueAgregado = false;
        try (Connection conn = conexion.conectar()) {
            String sql = "INSERT INTO pagoPendiente(cedula,nombres,fecha,tiempo,hora_entrada,hora_salida,observaciones)VALUES (?,?,?,?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, pagoPen.getCedula());
            stmt.setString(2, pagoPen.getNombres());
            stmt.setString(3, pagoPen.getFecha());
            stmt.setString(4, pagoPen.getTiempo());
            stmt.setString(5, pagoPen.getHora_entrada());
            stmt.setString(6, pagoPen.getHora_salida());
            stmt.setString(7, pagoPen.getObservaciones());

            // Aqui se ejecuta la sentencia...//
            int cantidad = stmt.executeUpdate();

            fueAgregado = (cantidad > 0);

        } catch (Exception e) {

            System.out.println("Error agregando el pago pendiente" + e.getMessage());
        }

        return fueAgregado;
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    // FUNCION PARA ELIMINAR EL PAGO PENDIENTE 
    public boolean eliminarPagoPendiente(int idpagoP) throws SQLException {

        boolean fueEliminado = false;

        Connection conn = conexion.conectar();

        try {

            String sql = "DELETE FROM pagopendiente WHERE idpagoP = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, idpagoP);

            fueEliminado = (stmt.executeUpdate() > 0);

        } catch (SQLException e) {
            System.out.println("Error Eliminando el Registro." + e.getMessage());
        }

        return fueEliminado;
    }

    // METODO PARA BUSCAR LOS PAGOS PENDIENTES EN LA TABLA LISTAR LISTAR_PAGOS_PENDIENTES
    public DefaultTableModel buscarPago_pendiente(String buscar) {

        String[] nombresColumnas = {"ID", "CEDULA", "NOMBRES", "FECHA", "TIEMPO", "HORA ENTRADA", "HORA SALIDA", "OBSERVACIONES"};//Indica el nombre de las columnas en la tabla

        String[] registros = new String[8];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        String sql = "SELECT * FROM pagopendiente WHERE  idpagoP LIKE '%" + buscar + "%' OR cedula LIKE '%" + buscar + "%' OR nombres LIKE '%" + buscar + "%' OR fecha LIKE '%" + buscar + "%' OR tiempo LIKE '%" + buscar + "%' OR hora_entrada LIKE '%" + buscar + "%' OR hora_salida LIKE '%" + buscar + "%' OR observaciones LIKE '%" + buscar + "%'";
        Connection conn = conexion.conectar();

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString("idpagoP");

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
