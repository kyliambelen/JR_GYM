
package dao;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 * 
 */
import bd.Conexion;
import entidades.Supervisor_class;
import entidades.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuariosDao {
    
     private final Conexion conexion = new Conexion ();

    /*  METODO PARA  AGREGAR  LOS  USUARIOS  AL  SISTEMA */
    public boolean agregarUsuarios (Usuarios usuarios) throws SQLException {

        boolean fueAgregado = false;
        try (Connection conn = conexion.conectar ()) {
            String sql = "INSERT INTO usuario(nombre,correo,usuario, clave, rol)VALUES (?,?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement (sql);

            stmt.setString (1, usuarios.getNombre ());
            stmt.setString (2, usuarios.getCorreo ());
            stmt.setString (3, usuarios.getUsuario ());
            stmt.setString (4, usuarios.getClave ());
            stmt.setInt (5, usuarios.getIdRol ());

            // Aqui se ejecuta la sentencia...//
            int cantidad = stmt.executeUpdate ();

            fueAgregado = (cantidad > 0);

        } catch (Exception e) {

            System.out.println ("Error agregando al Usuario" + e.getMessage ());
        }

        return fueAgregado;
    }

    /* *****************************************************************************************************************************  */
    public boolean modificarUsuarios (Usuarios usuarios) throws SQLException {

        boolean fueAgregado = false;

        try (Connection conn = conexion.conectar ()) {

            String sql = "UPDATE usuario SET nombre=?, correo=?, usuario=?, clave=?, rol=? WHERE idusuario=?";

            PreparedStatement stmt = conn.prepareStatement (sql);

            stmt.setString (1, usuarios.getNombre ());
            stmt.setString (2, usuarios.getCorreo ());
            stmt.setString (3, usuarios.getUsuario ());
            stmt.setString (4, usuarios.getClave ());
            stmt.setInt (5, usuarios.getIdRol ());
            stmt.setInt (6, usuarios.getIdusuario ());

            // Aqui se ejecuta la sentencia...//
            int cantidad = stmt.executeUpdate ();

            fueAgregado = (cantidad > 0);

        } catch (Exception e) {

            System.out.println ("Error agregando al Usuario" + "  " + e.getMessage ());
        }

        return fueAgregado;
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    public boolean eliminarUsuarios (int idusuario) throws SQLException {

        boolean fueEliminado = false;

        Connection conn = conexion.conectar ();

        try {

            String sql = "DELETE FROM usuario WHERE idusuario = ?";

            PreparedStatement stmt = conn.prepareStatement (sql);

            stmt.setInt (1, idusuario);

            fueEliminado = (stmt.executeUpdate () > 0);

        } catch (Exception e) {
            System.out.println ("Error Eliminando el Registro." + e.getMessage ());
        }

        return fueEliminado;
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    /*  METODO PARA INGRESAR  O LOGUEARSE  EN  EL  SISTEMA */
    public boolean login (Usuarios usr) throws SQLException {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = conexion.conectar ();
        String sql = "SELECT u.idusuario,u.nombre,u.correo,u.usuario,u.clave,r.idrol, r.rol FROM usuario AS u\n"
                + "INNER JOIN rol AS r\n"
                + "ON u.rol = r.idrol\n"
                + "WHERE u.usuario =  ?";

        try {

            ps = conn.prepareStatement (sql);
            ps.setString (1, usr.getUsuario ());
            rs = ps.executeQuery ();

            if (rs.next ()) {
                if (usr.getClave ().equals (rs.getString (5))) {

                    usr.setIdusuario (rs.getInt (1));
                    usr.setNombre (rs.getString (2));
                    usr.setIdRol (rs.getInt (6));
                    usr.setRol (rs.getString (7));

                    return true;

                } else {

                    return false;
                }

            }

            return false;

        } catch (SQLException ex) {
            Logger.getLogger (UsuariosDao.class.getName ()).log (Level.SEVERE, null, ex);
            return false;
        }
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    /*  METODO PARA INGRESAR  O LOGUEARSE  PARA  DESBLOQUEAR BOTONES EN EL MODULO ASISTENCIA */
    public boolean loginBlock (Supervisor_class usr) throws SQLException {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = conexion.conectar ();
        String sql = "SELECT clave FROM supervisor  WHERE clave =  ?";

        try {

            ps = conn.prepareStatement (sql);
            ps.setString (1, usr.getClave ());
            rs = ps.executeQuery ();

            if (rs.next ()) {
                if (usr.getClave ().equals (rs.getString (1))) {

                    usr.setClave (rs.getString (1));

                    return true;

                } else {

                    return false;
                }

            }

            return false;

        } catch (SQLException ex) {
            Logger.getLogger (UsuariosDao.class.getName ()).log (Level.SEVERE, null, ex);
            return false;
        }
    }

   
    /*  //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++// 
    METODO  PARA  COMPROBAR  SI  EL  USUARIO  YA  EXISTE  */
    public int existeUsuario (String usuario) throws SQLException {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = conexion.conectar ();
        String sql = "SELECT count(idusuario) FROM usuario WHERE usuario = ?";

        try {

            ps = conn.prepareStatement (sql);
            ps.setString (1, usuario);
            rs = ps.executeQuery ();

            if (rs.next ()) {
                return rs.getInt (1);

            }

            return 1;

        } catch (SQLException ex) {
            Logger.getLogger (UsuariosDao.class.getName ()).log (Level.SEVERE, null, ex);
            return 1;
        }
    }

    /* ****************************************************************************************************************************************/
 /*  METODO  PARA  VALIDAR  O  COMPROBAR  QUE  (EL  E-MAIL)  SEA  CORRECTO */
    public boolean esEmail (String correo) {

        Pattern pattern = Pattern.compile ("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+´)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher (correo);
        return mather.find ();

    }
}


/* ************************************************************************************************************************************************  */

    

