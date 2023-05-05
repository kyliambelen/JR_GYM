package dao;

import bd.Conexion;
import entidades.Entrenador;
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
public class EntrenadorDao {

    private final Conexion conexion = new Conexion();
    
      /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */

    /*  METODO PARA  LISTAR  LOS  ENTRENADORES */
    public ArrayList<Entrenador> Listar_entrenador() {
        ArrayList<Entrenador> list = new ArrayList<>();
        Connection conn = conexion.conectar();

        String sql = "SELECT identrenador,cedula,nombres,sexo,horario,asistencia,correo,telefono,direccion FROM entrenador;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Entrenador entrenador = new Entrenador();

                entrenador.setIdentrenador(rs.getInt(1));
                entrenador.setCedula(rs.getInt(2));
                entrenador.setNombres(rs.getString(3));
                entrenador.setSexo(rs.getString(4));
                entrenador.setHorario(rs.getString(5));
                entrenador.setAsistencia(rs.getString(6));
                entrenador.setCorreo(rs.getString(7));
                entrenador.setTelefono(rs.getString(8));
                entrenador.setDireccion(rs.getString(9));
               

                list.add(entrenador);
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
    
    // METODO PARA EDITAR LOS ENTRENADORES
    
     public boolean modificarEntrenadores (Entrenador entrenador) throws SQLException {

        boolean fueAgregado = false;

        try (Connection conn = conexion.conectar ()) {

            String sql = "UPDATE entrenador SET cedula=?,nombres=?,sexo=?,horario=?,asistencia=?, correo=?,telefono=?,direccion=? WHERE identrenador=?";

            PreparedStatement prepstam = conn.prepareStatement (sql);

            prepstam.setInt (1, entrenador.getCedula());
            prepstam.setString (2, entrenador.getNombres ());
            prepstam.setString (3, entrenador.getSexo());
            prepstam.setString (4, entrenador.getHorario());
            prepstam.setString (5, entrenador.getAsistencia());
            prepstam.setString (6, entrenador.getCorreo());
            prepstam.setString (7, entrenador.getTelefono());
            prepstam.setString (8, entrenador.getDireccion());
            prepstam.setInt (9, entrenador.getIdentrenador());

            // Aqui se ejecuta la sentencia...//
            int cantidad = prepstam.executeUpdate ();

            fueAgregado = (cantidad > 0);

        } catch (Exception e) {

            System.out.println ("Error agregando al entrenador" + "  " + e.getMessage ());
        }

        return fueAgregado;
    }

    
     //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    public boolean eliminarEntrenador(int identrenador) throws SQLException {

	boolean fueEliminado = false;

	Connection conn = conexion.conectar();

	try {

	    String sql = "DELETE FROM entrenador WHERE identrenador = ?";

	    PreparedStatement stmt = conn.prepareStatement(sql);

	    stmt.setInt(1, identrenador);

	    fueEliminado = (stmt.executeUpdate() > 0);

	} catch (SQLException e) {
	    System.out.println("Error Eliminando el Registro." + e.getMessage());
	}

	return fueEliminado;
    }
    
     
      /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */

    /*  METODO  PARA  COMPROBAR  SI  EL  ENTRENADOR  YA HA SIDO REGISTRADO  */
    public int existeEntrenador(int cedula) throws SQLException {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = conexion.conectar();
        String sql = "SELECT count(identrenador) FROM entrenador WHERE cedula = ?";

        try {

            ps = conn.prepareStatement(sql);
            ps.setInt(1, cedula);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }

            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(AtletasDao.class.getName()).log(Level.SEVERE, null, ex);

            return 1;
        }
    }

     // METODO PARA BUSCAR LOS ENTRENADORES EN LA TABLA OPERACIONES ENTRENADOR
    
      public DefaultTableModel buscarEntrenador_oper (String buscar) {

        String[] nombresColumnas = {"ID", "CEDULA", "NOMBRES", "SEXO", "HORARIO","ASISTENCIA", "CORREO",  "TELEFONO", "DIRECCION"};//Indica el nombre de las columnas en la tabla

        String[] registros = new String[9];

        DefaultTableModel modelo = new DefaultTableModel (null, nombresColumnas);

        String sql = "SELECT * FROM entrenador WHERE identrenador LIKE '%" + buscar + "%' OR cedula LIKE '%" + buscar + "%' OR nombres LIKE '%" + buscar + "%' OR sexo LIKE '%" + buscar + "%' OR horario LIKE '%" + buscar + "%' OR asistencia LIKE '%" + buscar + "%' OR correo LIKE '%" + buscar + "%' OR telefono LIKE '%" + buscar + "%' OR direccion LIKE '%" + buscar + "%'";

        Connection conn = conexion.conectar ();

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            pst = conn.prepareStatement (sql);

            rs = pst.executeQuery ();

            while (rs.next ()) {

                registros[0] = rs.getString ("identrenador");

                registros[1] = rs.getString ("cedula");

                registros[2] = rs.getString ("nombres");

                registros[3] = rs.getString ("sexo");

                registros[4] = rs.getString ("horario");

                registros[5] = rs.getString ("asistencia");

                registros[6] = rs.getString ("correo");
                
                registros[7] = rs.getString ("telefono");

                registros[8] = rs.getString ("direccion");

               
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
      
       /*  FUNCION  PARA  HACER  LA  BUSQUEDA EN  LA  TABLA  BUSCAR ENTRENADOR(BuscarEntrenador)*/
    
    public DefaultTableModel buscarNombres (String buscar) {

        String[] nombresColumnas = {"ID", "CEDULA", "NOMBRES"};//Indica el nombre de las columnas en la tabla

        String[] registros = new String[3];

        DefaultTableModel modelo = new DefaultTableModel (null, nombresColumnas);

        String sql = "SELECT identrenador, cedula,nombres FROM entrenador WHERE cedula LIKE '%" + buscar + "%' OR nombres LIKE '%" + buscar + "%'";

        Connection conn = conexion.conectar ();

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            pst = conn.prepareStatement (sql);

            rs = pst.executeQuery ();

            while (rs.next ()) {


                registros[0] = rs.getString ("identrenador");
                
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
    

}
