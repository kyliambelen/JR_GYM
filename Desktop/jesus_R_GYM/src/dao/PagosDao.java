
package dao;

import bd.Conexion;
import entidades.Pagos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class PagosDao {
     private final Conexion conexion = new Conexion();
     
      /*  METODO PARA  AGREGAR  LOS  PAGOS  AL  SISTEMA */
    public boolean agregarPagos(Pagos pagos) throws SQLException {

	boolean fueAgregado = false;
	try ( Connection conn = conexion.conectar()) {

	    String sql = "INSERT INTO pagos(codpago,descripcion,modo_pago,monto, iva, exento,usuario_id) VALUES (?,?,?,?,?,?,?)";

	    PreparedStatement stmt = conn.prepareStatement(sql);

	    stmt.setString(1, pagos.getCodpago());
	    stmt.setString(2, pagos.getDescripcion());
	    stmt.setString(3, pagos.getModo_pago());
	    stmt.setDouble(4, pagos.getMonto());
	    stmt.setDouble(5, pagos.getIva());
	    stmt.setDouble(6, pagos.getExento());
	    stmt.setInt(7, pagos.getUsuario_id());
	    

	    // Aqui se ejecuta la sentencia...//
	    int cantidad = stmt.executeUpdate();

	    fueAgregado = (cantidad > 0);

	} catch (Exception e) {

	    System.out.println("Error agregando el horario" + e.getMessage());
	}

	return fueAgregado;
    }

    /* *****************************************************************************************************************************  */
    public boolean modificarPagos(Pagos pagos) throws SQLException {

	boolean fueAgregado = false;

	try ( Connection conn = conexion.conectar()) {

	    String sql = "UPDATE pagos SET codpago=?, descripcion=?, modo_pago=?, monto=?, iva=?, exento=?,usuario_id=? WHERE idpago=?";

	    PreparedStatement stmt = conn.prepareStatement(sql);

	     stmt.setString(1, pagos.getCodpago());
	    stmt.setString(2, pagos.getDescripcion());
	    stmt.setString(3, pagos.getModo_pago());
	    stmt.setDouble(4, pagos.getMonto());
	    stmt.setDouble(5, pagos.getIva());
	    stmt.setDouble(6, pagos.getExento());
	    stmt.setInt(7, pagos.getUsuario_id());
	    stmt.setInt(8, pagos.getIdpago());
	    
	    // Aqui se ejecuta la sentencia...//
	    int cantidad = stmt.executeUpdate();

	    fueAgregado = (cantidad > 0);

	} catch (Exception e) {

	    System.out.println("Error Editando el horario" + "  " + e.getMessage());
	}

	return fueAgregado;
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    public boolean eliminarPagos(int idpago) throws SQLException {

	boolean fueEliminado = false;

	Connection conn = conexion.conectar();

	try {

	    String sql = "DELETE FROM pagos WHERE idpago = ?";

	    PreparedStatement stmt = conn.prepareStatement(sql);

	    stmt.setInt(1, idpago);

	    fueEliminado = (stmt.executeUpdate() > 0);

	} catch (SQLException e) {
	    System.out.println("Error Eliminando el Registro." + e.getMessage());
	}

	return fueEliminado;
    }
    
     /*   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
     /*  METODO  PARA  COMPROBAR  SI  EL  PAGO  YA  EXISTE O ESTA REGISTRADO  */
    public int existePago(String codpago) throws SQLException {

	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = conexion.conectar();
	String sql = "SELECT count(idpago) FROM pagos WHERE codpago = ?";

	try {

	    ps = conn.prepareStatement(sql);
	    ps.setString(1, codpago);
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
    /*   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    
     /*  FUNCION  PARA  BUSCAR  LOS  PRODUCTOS  PARA  LA  VENTA  */
    public Pagos buscarPagos_cobranza (String codpago) {

        Pagos pagos = new Pagos();

        ResultSet rs = null;

        String sql = "SELECT * FROM pagos WHERE codpago = ?";
        try {
            Connection conn = conexion.conectar ();

            PreparedStatement stmt = conn.prepareStatement (sql);

            stmt.setString (1, codpago);

            rs = stmt.executeQuery ();
            if (rs.next ()) {
                pagos.setIdpago (rs.getInt ("idpago"));
                pagos.setCodpago(rs.getString ("codpago"));
                pagos.setDescripcion (rs.getString ("descripcion"));
                pagos.setMonto(rs.getDouble ("monto"));
            }

        } catch (SQLException e) {
            System.out.println (e.toString ());
        }

        return pagos;
    }

      /*  FUNCION  PARA  HACER  LA  BUSQUEDA EN  LA  TABLA  BUSCAR PAGOS    */
    
    public DefaultTableModel buscarPagos(String buscar) {

        String[] nombresColumnas = {"ID", "COD.PAGO", "DESCRIPCION", "MONTO"};//Indica el nombre de las columnas en la tabla

        String[] registros = new String[4];

        DefaultTableModel modelo = new DefaultTableModel (null, nombresColumnas);

        String sql = "SELECT idpago, codpago,descripcion, monto FROM pagos WHERE codpago LIKE '%" + buscar + "%' OR descripcion LIKE '%" + buscar + "%'";

        Connection conn = conexion.conectar ();

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            pst = conn.prepareStatement (sql);

            rs = pst.executeQuery ();

            while (rs.next ()) {


                registros[0] = rs.getString ("idpago");
                
                registros[1] = rs.getString ("codpago");

                registros[2] = rs.getString ("descripcion");
                
                registros[3] = rs.getString ("monto");

               

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
    
