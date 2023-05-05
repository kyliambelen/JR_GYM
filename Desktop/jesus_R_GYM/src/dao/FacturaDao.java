
package dao;

import bd.Conexion;
import entidades.Facturas;
import java.sql.CallableStatement;
import java.sql.Connection;
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
public class FacturaDao {
    
     private final Conexion conexion = new Conexion ();
     
     /*  METODO PARA  LISTAR  LAS  FACTURAS NULAS */
     
    public ArrayList<Facturas> ListarFacturas_nulas() {
	ArrayList<Facturas> list = new ArrayList<>();
	Connection conn = conexion.conectar();

	String sql = "SELECT nofactura,usuario,idatletas,fecha,noserie,nombre_usuario,totalPago,estatus FROM factura WHERE estatus = 2;";
	ResultSet rs = null;
	PreparedStatement ps = null;
	try {

	    ps = conn.prepareStatement(sql);
	    rs = ps.executeQuery();
	    while (rs.next()) {
		Facturas factura = new Facturas();
		
               
                
            
		factura.setNofactura(rs.getInt(1));
		factura.setUsuario(rs.getInt(2));
		factura.setIdatletas(rs.getInt(3));
		factura.setFecha(rs.getString(4));
		factura.setNoserie(rs.getString(5));
		factura.setNombre_usuario(rs.getString(6));
		factura.setTotalPago(rs.getDouble(7));
		factura.setEstatus(rs.getInt(8));
		

		list.add(factura);
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

     //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

    /* METODO PARA MODIFICAR O REVERTIR LA FACTURA ANULADA A ESTATUS 1 */
    
    public boolean modificarFactura_nula (Facturas factura) throws SQLException {

        boolean fueAgregado = false;

        try (Connection conn = conexion.conectar ()) {

            String sql = "UPDATE factura SET estatus = 1 WHERE nofactura = ?";

            PreparedStatement stmt = conn.prepareStatement (sql);

            stmt.setInt (1, factura.getNofactura());
            
            // Aqui se ejecuta la sentencia...//
            int cantidad = stmt.executeUpdate ();

            fueAgregado = (cantidad > 0);

        } catch (Exception e) {

            System.out.println ("Error agregando la Seccion" + " " + e.getMessage ());
        }

        return fueAgregado;
    }


    /*  METODO PARA  AGREGAR  LOS  PAGOS   */
    public boolean generaTotalpagos (Facturas fact) throws SQLException {

        boolean fueAgregado = false;

        try (Connection conn = conexion.conectar ()) {

            String sql_procesarPago = ("{call procesar_pago(?,?,?,?,?)}");

            CallableStatement ps = conn.prepareCall (sql_procesarPago);

            ps.setInt (1, fact.getUsuario ());
            ps.setInt (2, fact.getIdatletas());
            ps.setString (3, fact.getToken_user ());
            ps.setString (4, fact.getNombre_usuario ());
            ps.setString (5, fact.getNoserie ());

            ps.executeQuery ();

            System.out.println ("Actualizacion Correcta");

        } catch (Exception e) {

            System.out.println ("Error agregando el Pago" + " " + e.getMessage ());
        }

        return fueAgregado;

    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
     /*  METODO PARA  ANULAR LAS  FACTURAS */
    
    public boolean anulaFacturas (Facturas fact) throws SQLException {

        boolean fueAgregado = false;
         PreparedStatement ps;
        ResultSet rs;
        try (Connection conn = conexion.conectar ()) {

            String sql = "UPDATE factura SET estatus = 2 WHERE nofactura = ?";

             ps = conn.prepareStatement (sql);

            ps.setInt (1, fact.getNofactura ());
           
            ps.executeUpdate ();

            System.out.println ("Actualizacion Correcta");

        } catch (Exception e) {

            System.out.println ("Error en la Anulación de la Factura" + e.getMessage ());
        }

        return fueAgregado;

    }
    
    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    
    public String NroSeriePagos () {

        String serie = "";
        PreparedStatement ps;
        ResultSet rs;
        int r = 0;

        String sql = "SELECT max(serie_final) from numero_serie_factura";
        try {

            Connection conn = conexion.conectar ();
            ps = conn.prepareStatement (sql);
            rs = ps.executeQuery ();

            while (rs.next ()) {
                serie = rs.getString (1);
            }

        } catch (SQLException e) {
        }

        return serie;
    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    
    
     /*  METODO  PARA  BUSCAR LOS ATLETAS  DEL MODULO  DE PAGOS  */
    public Facturas buscarFactura (String nofactura) {

        Facturas factura = new Facturas ();
        String sql = "SELECT nofactura, date_format(fecha,'%d/%m/%Y')as fecha,totalPago,estatus FROM factura WHERE nofactura = ? and estatus = 1 ";
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conn = conexion.conectar ();
            ps = conn.prepareStatement (sql);
            ps.setString (1, nofactura);
            rs = ps.executeQuery ();
            if (rs.next ()) {
                factura.setNofactura (rs.getInt ("nofactura"));
                factura.setFecha (rs.getString ("fecha"));
                factura.setTotalPago(Double.parseDouble (rs.getString ("totalPago")));
                factura.setEstatus (rs.getInt ("estatus"));
            }

        } catch (Exception e) {
            System.out.println (e.toString ());
        }
        return factura;
    }
/*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
  /*  FUNCION  PARA  HACER  LA  BUSQUEDA EN  LA  TABLA  BUSCAR PAGOS    */
    
    public DefaultTableModel buscarFacturas(String buscar) {

        String[] nombresColumnas = {"ID", "FECHA", "Nro.FACTURA", "CEDULA","CLIENTE","TOTAL FACTURA"};//Indica el nombre de las columnas en la tabla

        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel (null, nombresColumnas);

        String sql = "SELECT cod_atleta, fecha_factura,nofactura, cedula, cliente,totalFactura FROM vista_listar_facturas WHERE cod_atleta LIKE '%" + buscar + "%' OR fecha_factura LIKE '%" + buscar + "%' OR nofactura LIKE '%" + buscar + "%' OR cedula LIKE '%" + buscar + "%' OR cliente LIKE '%" + buscar + "%' OR totalFactura LIKE '%" + buscar + "%'";

        Connection conn = conexion.conectar ();

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            pst = conn.prepareStatement (sql);

            rs = pst.executeQuery ();

            while (rs.next ()) {


                registros[0] = rs.getString ("cod_atleta");
                
                registros[1] = rs.getString ("fecha_factura");

                registros[2] = rs.getString ("nofactura");
                
                registros[3] = rs.getString ("cedula");
                
                registros[4] = rs.getString ("cliente");
                
                registros[5] = rs.getString ("totalFactura");

               

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
