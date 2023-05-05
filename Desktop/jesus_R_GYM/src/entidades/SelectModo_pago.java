
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
public class SelectModo_pago {
    
     //private int codproveedor;
    
    private int idpago;
    private String modo_pago;
    
      private Conexion conexion = new Conexion ();

    public SelectModo_pago() {
	
    }

    public SelectModo_pago(int idpago, String modo_pago) {
	this.idpago = idpago;
	this.modo_pago = modo_pago;
    }

    public int getIdpago() {
	return idpago;
    }

    public void setIdpago(int idpago) {
	this.idpago = idpago;
    }

    public String getModo_pago() {
	return modo_pago;
    }

    public void setModo_pago(String modo_pago) {
	this.modo_pago = modo_pago;
    }

   

   
      
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    
    
    public void cargarComboboxModo_pago(JComboBox<SelectModo_pago> CboxModo_pago) throws SQLException {
       
	try (Connection conn = conexion.conectar ()) {
            
            String sql = "SELECT idpago,modo_pago FROM pagos";
            
            PreparedStatement stmt = conn.prepareStatement (sql);
            ResultSet rs = stmt.executeQuery ();
            CboxModo_pago.removeAllItems ();
            
            while (rs.next ()) {
                
                // aqui se extraen los datos....//
                
            CboxModo_pago.addItem (new SelectModo_pago (
                        
                rs.getInt ("idpago"),
                rs.getString ("modo_pago")
              
                ));
            
            }    
        } catch (Exception e) {
            
            System.out.println ("Error en la extraccion de los Datos");
    }  
    }
    
    @Override
    
    public String toString(){
        
        return modo_pago;
	
    } 
    
    
}
