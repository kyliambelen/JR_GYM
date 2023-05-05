
package dao;

import bd.Conexion;
import entidades.Configuracion_gym;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Configuracion_gymDao {
    
     private Conexion conexion = new Conexion ();
     
        /*  METODO PARA  AGREGAR  LOS  PRODUCTOS  AL  SISTEMA */
    
    public boolean agregarConfiguracion_gym (Configuracion_gym configuracion_gym) throws SQLException {
       
        boolean fueAgregado = false;
        try 
            
            (Connection conn = conexion.conectar ()) {
            
            String sql = "INSERT INTO organizacion(rif,nombre,razon_social,correo,telefono, direccion, inicio_actividad) VALUES (?,?,?,?,?,?,?)";

            PreparedStatement pst = conn.prepareStatement (sql);

            
            pst.setString (1, configuracion_gym.getRif ());
            pst.setString (2, configuracion_gym.getNombre ());
            pst.setString (3, configuracion_gym.getRazon_social ());
            pst.setString (4, configuracion_gym.getCorreo ());
            pst.setString (5, configuracion_gym.getTelefono ());         
            pst.setString (6, configuracion_gym.getDireccion ());
            pst.setString (7, configuracion_gym.getInicio_actividad());
            
            // Aqui se ejecuta la sentencia...//
            
            int cantidad = pst.executeUpdate ();
            
            
            fueAgregado = (cantidad > 0);
            
           

        } catch (Exception e) {

            System.out.println ("Error agregando los datos de Configuracion" + e.getMessage ());
        }

        return fueAgregado;
    }
    
    /* *****************************************************************************************************************************  */
    
     
    
     public boolean modificarConfiguracion_gym (Configuracion_gym config_gym) throws SQLException {

        boolean fueAgregado = false;

        try (Connection conn = conexion.conectar ()) {

            String sql = "UPDATE organizacion SET rif=?,nombre=?,razon_social=?, correo=?, telefono=?, direccion=?, inicio_actividad=? WHERE idorganizacion=?";

            PreparedStatement pst = conn.prepareStatement (sql);

            
            pst.setString (1, config_gym.getRif());
            pst.setString (2, config_gym.getNombre ());
            pst.setString (3, config_gym.getRazon_social ()); 
            pst.setString (4, config_gym.getCorreo());
            pst.setString (5, config_gym.getTelefono ());          
            pst.setString (6, config_gym.getDireccion ());
            pst.setString (7, config_gym.getInicio_actividad()); 
            pst.setInt (8, config_gym.getIdorganizacion()); 
           

            // Aqui se ejecuta la sentencia...//
            int cantidad = pst.executeUpdate ();

            fueAgregado = (cantidad > 0);

        } catch (Exception e) {

            System.out.println ("Error Editando el contenido de la configuracion" +"  " + e.getMessage ());
        }

        return fueAgregado;
    }
     
       //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
     
      public boolean eliminarConfiguracion_gym (int idorganizacion) throws SQLException {

        boolean fueEliminado = false;

        Connection conn = conexion.conectar ();

        try {

            String sql = "DELETE FROM organizacion WHERE idorganizacion = ?";

            PreparedStatement pst = conn.prepareStatement (sql);

            pst.setInt (1, idorganizacion);

            fueEliminado = (pst.executeUpdate () > 0);

        } catch (Exception e) {
            System.out.println ("Error Eliminando el Registro." + e.getMessage ());
        }

        return fueEliminado;
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
      
         
                /*  METODO  PARA  COMPROBAR  SI LA CONFIGURACION  YA  EXISTE  */
    
     public int configuracionExiste (String nombre) throws SQLException {

       
        PreparedStatement ps = null;
        ResultSet rs =null;
        Connection conn = conexion.conectar ();
        String sql = "SELECT count(idorganizacion) FROM organizacion WHERE nombre = ?";
        
         try {
             
                ps = conn.prepareStatement (sql);
                ps.setString (1, nombre);
                rs = ps.executeQuery ();
                
                if(rs.next ())
                {
                    return rs.getInt (1);
                  
                }
                
                return 1;
             
         } catch (SQLException ex) {
             Logger.getLogger(Configuracion_gymDao.class.getName()).log(Level.SEVERE,null, ex);
             return 1;
         }
     }
     
    
}
