package dao;

import bd.Conexion;
import entidades.Rutinas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class RutinasDao {

    private final Conexion conexion = new Conexion();

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */

 /*  METODO PARA  LISTAR  LAS  RUTINAS */
    public ArrayList<Rutinas> Listar_rutinas() {
        ArrayList<Rutinas> list = new ArrayList<>();
        Connection conn = conexion.conectar();

        String sql = "SELECT idrutina,idatletas,cedula, nombres,entrenador,fecha_rutina,rutinas,modalidad,ejercicio,serie,repeticiones,descanso FROM rutinas";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Rutinas rutinas = new Rutinas();

                rutinas.setIdrutina(rs.getInt(1));
                rutinas.setIdatletas(rs.getInt(2));
                rutinas.setCedula(rs.getInt(3));
                rutinas.setNombres(rs.getString(4));
                rutinas.setEntrenador(rs.getString(5));
                rutinas.setFecha_rutina(rs.getString(6));
                rutinas.setRutinas(rs.getString(7));
                rutinas.setModalidad(rs.getString(8));
                rutinas.setEjercicio(rs.getString(9));
                rutinas.setSerie(rs.getString(10));
                rutinas.setRepeticiones(rs.getString(11));
                rutinas.setDescanso(rs.getString(12));

                list.add(rutinas);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                //rs.close();

            } catch (SQLException ex) {
            }
        }
        return list;
    }

    // METODO PARA AGREGAR LAS RUTINAS
    public boolean agregarRutinas(Rutinas rutinas) throws SQLException {

        boolean fueAgregado = false;

        try (Connection conn = conexion.conectar()) {

            String sql = "INSERT INTO rutinas(idatletas,cedula, nombres, entrenador, dia, fecha_rutina,"
                    + "rutinas, modalidad, ejercicio, serie,repeticiones, descanso) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setInt(1, rutinas.getIdatletas());
            pstm.setInt(2, rutinas.getCedula());
            pstm.setString(3, rutinas.getNombres());
            pstm.setString(4, rutinas.getEntrenador());
            pstm.setString(5, rutinas.getDia());
            pstm.setString(6, rutinas.getFecha_rutina());
            pstm.setString(7, rutinas.getRutinas());
            pstm.setString(8, rutinas.getModalidad());
            pstm.setString(9, rutinas.getEjercicio());
            pstm.setString(10, rutinas.getSerie());
            pstm.setString(11, rutinas.getRepeticiones());
            pstm.setString(12, rutinas.getDescanso());

            // Aqui se ejecuta la sentencia...//
            int cantidad = pstm.executeUpdate();

            fueAgregado = (cantidad > 0);

        } catch (Exception e) {

            System.out.println("Error agregando la Rutina" + e.getMessage());
        }

        return fueAgregado;
    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
     /*  FUNCION  PARA  HACER  LA  BUSQUEDA EN  LA  TABLA  BUSCAR CEDULA Y NOMBRES DE ATLETAS   */
    
    public DefaultTableModel buscarCedula_rutinas (String buscar) {

        String[] nombresColumnas = {"ID", "CEDULA", "NOMBRES"};//Indica el nombre de las columnas en la tabla

        String[] registros = new String[3];

        DefaultTableModel modelo = new DefaultTableModel (null, nombresColumnas);

        String sql = "SELECT idatletas, cedula,nombres FROM rutinas WHERE cedula LIKE '%" + buscar + "%' OR nombres LIKE '%" + buscar + "%' group by idatletas";

        Connection conn = conexion.conectar ();

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            pst = conn.prepareStatement (sql);

            rs = pst.executeQuery ();

            while (rs.next ()) {


                registros[0] = rs.getString ("idatletas");
                
                registros[1] = rs.getString ("cedula");

                registros[2] = rs.getString ("nombres");

               

                modelo.addRow (registros);

            }
        } catch (SQLException e) {

            JOptionPane.showMessageDialog (null, "Error al conectar. " + e.getMessage ());

        } finally {
            try {
                if (rs != null) {
                    rs.close ();
                }

                if (pst != null) {
                    pst.close ();
                }

                if (conn != null) {
                    conn.close ();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog (null, e);
            }
        }
        return modelo;
    }
    
    
    
    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    
     // METODO PARA BUSCAR LAS RUTINAS EN LA TABLA OPERACIONES RUTINAS
    
      public DefaultTableModel buscarRutinas_oper (String buscar) {

        String[] nombresColumnas = {"ID", "ID ATLTA", "CEDULA", "NOMBRES", "ENTRENADOR","FECHA", "RUTINAS", "MODALIDAD", "EJERCICIOS",  "SERIE", "REPETICIONES","DESCANSO"};//Indica el nombre de las columnas en la tabla

        String[] registros = new String[12];

        DefaultTableModel modelo = new DefaultTableModel (null, nombresColumnas);

        String sql = "SELECT * FROM rutinas WHERE idrutina LIKE '%" + buscar + "%' OR idatletas LIKE '%" + buscar + "%' OR cedula LIKE '%" + buscar + "%' OR nombres LIKE '%" + buscar + "%' OR entrenador LIKE '%" + buscar + "%' OR dia LIKE '%" + buscar + "%' OR fecha_rutina LIKE '%" + buscar + "%' OR rutinas LIKE '%" + buscar + "%' OR modalidad LIKE '%" + buscar + "%' OR ejercicio LIKE '%" + buscar + "%' OR serie LIKE '%" + buscar + "%' OR repeticiones LIKE '%" + buscar + "%' OR descanso LIKE '%" + buscar + "%'";

        Connection conn = conexion.conectar ();

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            pst = conn.prepareStatement (sql);

            rs = pst.executeQuery ();

            while (rs.next ()) {

                registros[0] = rs.getString ("idrutina");
                
                registros[1] = rs.getString ("idatletas");

                registros[2] = rs.getString ("cedula");

                registros[3] = rs.getString ("nombres");

                registros[4] = rs.getString ("entrenador");

                registros[5] = rs.getString ("fecha_rutina");

                registros[6] = rs.getString ("rutinas");

                registros[7] = rs.getString ("modalidad");
                
                registros[8] = rs.getString ("ejercicio");

                registros[9] = rs.getString ("serie");

                registros[10] = rs.getString ("repeticiones");
                
                registros[11] = rs.getString ("descanso");

                modelo.addRow (registros);

            }
        } catch (SQLException e) {

            JOptionPane.showMessageDialog (null, "Error al conectar. " + e.getMessage ());

        } finally {
            try {
                if (rs != null) {
                    rs.close ();
                }

                if (pst != null) {
                    pst.close ();
                }

                if (conn != null) {
                    conn.close ();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog (null, e);
            }
        }
        return modelo;
    }
}
