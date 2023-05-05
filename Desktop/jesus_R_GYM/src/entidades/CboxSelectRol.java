
package entidades;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;


public class CboxSelectRol {
    
    private int idrol;
    private String rol;
    
     private Conexion conexion = new Conexion ();

    public CboxSelectRol() {
        
    }

    public CboxSelectRol (int idrol, String rol) {
        this.idrol = idrol;
        this.rol = rol;
    }

    public int getIdrol () {
        return idrol;
    }

    public void setIdrol (int idrol) {
        this.idrol = idrol;
    }

    public String getRol () {
        return rol;
    }

    public void setRol (String rol) {
        this.rol = rol;
    }
     
        
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    
    
    public void cargarcboxSelectRol(JComboBox<CboxSelectRol> CboxSeleccionarRol) throws SQLException {
        Connection conn = conexion.conectar ();
        try {
            
            String sql = "SELECT idrol, rol FROM rol";
            
            PreparedStatement stmt = conn.prepareStatement (sql);
            ResultSet rs = stmt.executeQuery ();
            CboxSeleccionarRol.removeAllItems ();
            
            while (rs.next ()) {
                
                // aqui se extraen los datos....//
                
            CboxSeleccionarRol.addItem (new CboxSelectRol (
                        
                rs.getInt ("idrol"),
                rs.getString ("rol")
              
                ));
            
            }    
        } catch (Exception e) {
            
            System.out.println ("Error en la extraccion de los Datos");
    }finally{
            
            conn.close ();
            
        }  
    }
    
    @Override
    
    public String toString(){
        
        return idrol + "     " +rol;
    } 
    
    
    
    
}
