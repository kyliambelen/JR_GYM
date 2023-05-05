package entidades;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class CboxSelectAtletas {

    private Conexion conexion = new Conexion();
    
    private int idatletas;
    private String nombres;

    public CboxSelectAtletas() {
        
        
    }

    public CboxSelectAtletas(int idatletas, String nombres) {
        this.idatletas = idatletas;
        this.nombres = nombres;
    }

    public int getIdatletas() {
        return idatletas;
    }

    public void setIdatletas(int idatletas) {
        this.idatletas = idatletas;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
     //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    
    
    public void cargarCboxAtletas(JComboBox<CboxSelectAtletas> ComboBoxId_atletas) throws SQLException {
        Connection conn = conexion.conectar ();
        try {
            
            String sql = "SELECT idatletas, nombres FROM atletas";
            
            PreparedStatement stmt = conn.prepareStatement (sql);
            ResultSet rs = stmt.executeQuery ();
            ComboBoxId_atletas.removeAllItems ();
            
            while (rs.next ()) {
                
                // aqui se extraen los datos....//
                
            ComboBoxId_atletas.addItem (new CboxSelectAtletas (
                        
                rs.getInt ("idatletas"),
                rs.getString ("nombres")
              
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
        
        return idatletas + "     " +nombres;
    } 

   
    
    public void cargarCboxAtletas2(JComboBox<CboxSelectAtletas> ComboBoxId_atletas2) throws SQLException {
        Connection conn = conexion.conectar ();
        try {
            
            String sql = "SELECT idatletas, nombres FROM atletas";
            
            PreparedStatement stmt = conn.prepareStatement (sql);
            ResultSet rs = stmt.executeQuery ();
            ComboBoxId_atletas2.removeAllItems ();
            
            while (rs.next ()) {
                
                // aqui se extraen los datos....//
                
            ComboBoxId_atletas2.addItem (new CboxSelectAtletas (
                        
                rs.getInt ("idatletas"),
                rs.getString ("nombres")
              
                ));
            
            }    
        } catch (Exception e) {
            
            System.out.println ("Error en la extraccion de los Datos");
    }finally{
            
            conn.close ();
            
        }  
    }
    
    //@Override
    
    /*public String toString(){
    
    return idatletas + "     " +nombres;
    } */

   
}
