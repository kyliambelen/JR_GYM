
package dao;

import bd.Conexion;
import entidades.Detalle_temp;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Detalle_tempDao {
    
      private final Conexion conexion = new Conexion ();
      
       /*  METODO PARA  AGREGAR  LOS PAGOS  AL DETALLE TEMPORAL */
    public boolean calcularPAgos (Detalle_temp detemp) throws SQLException {

        boolean fueAgregado = false;

        try (Connection conn = conexion.conectar ()) {

            String sql_addDetalle = ("{call add_detalle_temp(?,?,?,?)}");

            CallableStatement ps = conn.prepareCall (sql_addDetalle);

            ps.setInt (1, detemp.getIdpago ());
            ps.setInt (2, detemp.getCantidad_dia ());
            ps.setString (3, detemp.getToken_user ());
            ps.setDouble (4, detemp.getDescuento ());

            ps.executeQuery ();

            System.out.println ("Actualizacion Correcta");

        } catch (Exception e) {

            System.out.println ("Error agregando la Entrada del pago" + e.getMessage ());
        }

        return fueAgregado;

    }

    
}
