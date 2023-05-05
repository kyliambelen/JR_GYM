package dao;

import bd.Conexion;
import entidades.NumeroSerie_factura;
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
public class NumeroSerieDao {

    private final Conexion conexion = new Conexion();

    /*  METODO PARA  AGREGAR  LOS  NUMEROS DE SERIES  AL  SISTEMA */
    public boolean agregarNumeroSerie(NumeroSerie_factura nserie) throws SQLException {

        boolean fueAgregado = false;
        try (Connection conn = conexion.conectar()) {

            String sql = "INSERT INTO numero_serie_factura(serie_inicio, serie_final) VALUES (?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

           
            ps.setInt(1, nserie.getSerieInicio());
            ps.setInt(2, nserie.getSerieFinal());

            // Aqui se ejecuta la sentencia...//
            int cantidad = ps.executeUpdate();

            fueAgregado = (cantidad > 0);

        } catch (Exception e) {

            System.out.println("Error agregando el Numero de Serie" + e.getMessage());
        }

        return fueAgregado;
    }

    /* *****************************************************************************************************************************  */
 /*  METODO PARA  EDITAR  LOS  NUMEROS DE SERIES  EN EL  SISTEMA */
    public boolean modificarNumeroSerie(NumeroSerie_factura nseriefact) throws SQLException {

        boolean fueAgregado = false;

        try (Connection conn = conexion.conectar()) {

            String sql = "UPDATE numero_serie_factura SET  serie_inicio=?, serie_final=? WHERE idserie=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            
            ps.setInt(1, nseriefact.getSerieInicio());
            ps.setInt(2, nseriefact.getSerieFinal());
            ps.setInt(3, nseriefact.getIdserie());

            // Aqui se ejecuta la sentencia...//
            int cantidad = ps.executeUpdate();

            fueAgregado = (cantidad > 0);

        } catch (Exception e) {

            System.out.println("Error Editando el Numero de Serie" + "  " + e.getMessage());
        }

        return fueAgregado;
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    /*  METODO PARA  ELIMINAR  LOS  NUMEROS DE SERIES  DEL  SISTEMA */
    public boolean eliminarNumeroSerie(int idserie) throws SQLException {

        boolean fueEliminado = false;

        Connection conn = conexion.conectar();

        try {

            String sql = "DELETE FROM numero_serie_factura WHERE idserie = ?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, idserie);

            fueEliminado = (ps.executeUpdate() > 0);

        } catch (Exception e) {
            System.out.println("Error Eliminando el Registro." + e.getMessage());
        }

        return fueEliminado;
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    /*  METODO  PARA  COMPROBAR  SI  EL  NUMERO DE SERIE   YA  EXISTE  */
    public int existeNumeroSerie(int idserie) throws SQLException {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = conexion.conectar();
        String sql = "SELECT count(serie_inicio) FROM numero_serie_factura WHERE idserie = ?";

        try {

            ps = conn.prepareStatement(sql);
            ps.setInt(1, idserie);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }

            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(NumeroSerieDao.class.getName()).log(Level.SEVERE, null, ex);

            return 1;
        }
    }

    /*  FUNCION  PARA  HACER  LA  BUSQUEDA EN  LA  TABLA  BUSCAR  CODIGO  */
    public DefaultTableModel buscarNumero_serie(String buscar) {

        String[] nombresColumnas = {"ID", "FECHA", "SERIE", "SERIE INICIAL", "SERIE FINAL", "ESTATUS"};//Indica el nombre de las columnas en la tabla

        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        String sql = "SELECT * FROM numero_serie_factura WHERE idserie LIKE '%" + buscar + "%' OR fecha LIKE '%" + buscar + "%' OR serie_inicio LIKE '%" + buscar + "%' OR serie_final LIKE '%" + buscar + "%'";

        Connection conn = conexion.conectar();

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString("idserie");

                registros[1] = rs.getString("fecha");

                registros[2] = rs.getString("serie_inicio");

                registros[3] = rs.getString("serie_final");

                registros[4] = rs.getString("estatus");

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

    // NUMERO  DE  SERIE  PARA  EL  MODULO  DE CONTROL PAGOS
    // NUMERO  DE  SERIE  PARA  LOS  MODULOS  DE  VENTAS
    public String NroSerieVentas() {

        String serie = "";
        PreparedStatement ps;
        ResultSet rs;

        String sql = "SELECT max(nofactura) from factura";
        try {

            Connection conn = conexion.conectar();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                serie = rs.getString(1);
            }

        } catch (Exception e) {
        }

        return serie;
    }

    public String NroSeriePagos() {

        String serie = "";
        PreparedStatement ps;
        ResultSet rs;

        String sql = "SELECT max(nofactura) from factura";
        try {

            Connection conn = conexion.conectar();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                serie = rs.getString(1);
            }

        } catch (Exception e) {
        }

        return serie;
    }

    // NUMERO  DE  SERIE  FINAL PARA  LOS  MODULOS  DE  VENTAS
    public String NroSerieFinal() {

        String serieFinal = "";
        PreparedStatement ps;
        ResultSet rs;

        String sql = "SELECT max(serie_final) from numero_serie_factura";
        try {

            Connection conn = conexion.conectar();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                serieFinal = rs.getString(1);
            }

        } catch (Exception e) {
        }

        return serieFinal;
    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
 /*  METODO  PARA  BUSCAR LOS NUMEROS  DE SERIES   DEL MODULO  DE VENTAS  */
    public NumeroSerie_factura listarNumeroSerie() {

        NumeroSerie_factura nserieFact = new NumeroSerie_factura();

        String sql = "SELECT max(serie_inicio)as serie_inicio,max(serie_final)as serie_final FROM numero_serie_factura";
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conn = conexion.conectar();
            ps = conn.prepareStatement(sql);
           
            rs = ps.executeQuery();
            if (rs.next()) {

                nserieFact.setSerieInicio(rs.getInt("serie_inicio"));
                nserieFact.setSerieFinal(rs.getInt("serie_final"));

            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return nserieFact;
    }

}
