package dao;

import bd.Conexion;
import entidades.Mensualidad;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class MensualidadDao {

    private final Conexion conexion = new Conexion();
    private FileInputStream fis;
    private int longitudBytes;

    /*  METODO PARA  LISTAR  LAS MENSUALIDADES */
    @SuppressWarnings("null")
    public ArrayList<Mensualidad> Listar_mensualidad() {
        ArrayList<Mensualidad> list = new ArrayList<>();
        Connection conn = conexion.conectar();

        String sql = "SELECT idmensualidad, nroreferencia, cedula,nombres,fecha_inscripcion,forma_depago,nombre_entrenador,fecha_inicio,entrenamientos,turno,hora_entrada,rutaFoto,foto FROM mensualidad;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Mensualidad mensualidad = new Mensualidad();

                mensualidad.setIdmensualidad(rs.getInt(1));
                mensualidad.setNroreferencia(rs.getString(2));
                mensualidad.setCedula(rs.getInt(3));
                mensualidad.setNombres(rs.getString(4));
                mensualidad.setFecha_inscripcion(rs.getString(5));
                mensualidad.setForma_depago(rs.getString(6));
                mensualidad.setNombre_entrenador(rs.getString(7));
                mensualidad.setFecha_inicio(rs.getString(8));
                mensualidad.setEntrenamientos(rs.getString(9));
                mensualidad.setTurno(rs.getString(10));
                mensualidad.setHora_entrada(rs.getString(11));
                mensualidad.setRutaFoto(rs.getString(12));
                mensualidad.setFoto(rs.getBytes(13));

                list.add(mensualidad);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();

            } catch (SQLException ex) {
            }
        }
        return list;
    }

    /*  METODO  PARA  COMPROBAR  SI LA MENSUALIDAD  YA  EXISTE  */
    public int existeMensualidad(int cedula) throws SQLException {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = conexion.conectar();
        String sql = "SELECT count(idmensualidad) FROM mensualidad WHERE cedula = ?";

        try {

            ps = conn.prepareStatement(sql);
            ps.setInt(1, cedula);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }

            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(MensualidadDao.class.getName()).log(Level.SEVERE, null, ex);

            return 1;
        }
    }

    // METODO PARA BUSCAR LOS ATLETAS QUE PAGAN MENSUAL EN LA TABLA LISTAR MENSUALIDADES
    public DefaultTableModel buscarMensualidades(String buscar) {

        String[] nombresColumnas = {"Nro.REFERENCIA.", "CEDULA", "NOMBRES", "FECHA", "FINALIZACION", "INSCRIPCION", "MENSUALIDAD", "ABONO", "DEBE", "FORMA PAGO", "TURNO"};//Indica el nombre de las columnas en la tabla

        String[] registros = new String[11];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        String sql = "SELECT * FROM mensualidad WHERE  nroreferencia LIKE '%" + buscar + "%' OR cedula LIKE '%" + buscar + "%' OR nombres LIKE '%" + buscar + "%' OR fecha_inscripcion LIKE '%" + buscar + "%' OR fecha_final LIKE '%" + buscar + "%' OR monto_inscripcion LIKE '%" + buscar + "%' OR monto_mensualidad LIKE '%" + buscar + "%'  OR monto_abono LIKE '%" + buscar + "%'  OR monto_debe LIKE '%" + buscar + "%' OR forma_depago LIKE '%" + buscar + "%'  OR turno LIKE '%" + buscar + "%'";

        Connection conn = conexion.conectar();

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString("nroreferencia");

                registros[1] = rs.getString("cedula");

                registros[2] = rs.getString("nombres");

                registros[3] = rs.getString("fecha_inscripcion");

                registros[4] = rs.getString("fecha_final");

                registros[5] = rs.getString("monto_inscripcion");

                registros[6] = rs.getString("monto_mensualidad");

                registros[7] = rs.getString("monto_abono");

                registros[8] = rs.getString("monto_debe");

                registros[9] = rs.getString("forma_depago");

                registros[10] = rs.getString("turno");

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

    // METODO PARA BUSCAR LOS ATLETAS EN LA TABLA OPERACIONES ATLETAS
    public DefaultTableModel buscarMensualidad_oper(String buscar) {

        String[] nombresColumnas = {"ID", "CEDULA", "NOMBRES", "F.INSCRIPCION", "FORMA PAGO", "ENTRENADOR", "F.INICIO", "ENTRENAMIENTO", "TURNO", "H.ENTRADA"};//Indica el nombre de las columnas en la tabla

        String[] registros = new String[10];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        String sql = "SELECT * FROM mensualidad WHERE idmensualidad LIKE '%" + buscar + "%'  OR cedula LIKE '%" + buscar + "%' OR nombres LIKE '%" + buscar + "%' OR nombre_entrenador LIKE '%" + buscar + "%' OR forma_depago LIKE '%" + buscar + "%' OR entrenamientos LIKE '%" + buscar + "%' OR turno LIKE '%" + buscar + "%' OR hora_entrada LIKE '%" + buscar + "%'";

        Connection conn = conexion.conectar();

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString("idmensualidad");

                registros[1] = rs.getString("cedula");

                registros[2] = rs.getString("nombres");

                registros[3] = rs.getString("fecha_inscripcion");

                registros[4] = rs.getString("forma_depago");

                registros[5] = rs.getString("nombre_entrenador");

                registros[6] = rs.getString("fecha_inicio");

                registros[7] = rs.getString("entrenamientos");

                registros[8] = rs.getString("turno");

                registros[9] = rs.getString("hora_entrada");

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
