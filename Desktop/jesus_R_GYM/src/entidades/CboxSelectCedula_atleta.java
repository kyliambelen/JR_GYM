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
public class CboxSelectCedula_atleta {

    private Conexion conexion = new Conexion();

    private int idatletas;
    private String nombres;
    private int cedula;

    public CboxSelectCedula_atleta() {

    }

    public CboxSelectCedula_atleta(int idatletas, String nombres, int cedula) {
        this.idatletas = idatletas;
        this.nombres = nombres;
        this.cedula = cedula;
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    public void cargarCboxCedula_rutinas(JComboBox<CboxSelectCedula_atleta> ComboBoxCedula_atleta) throws SQLException {
        Connection conn = conexion.conectar();
        try {

            String sql = "SELECT idatletas, nombres,cedula FROM atletas";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            ComboBoxCedula_atleta.removeAllItems();

            while (rs.next()) {

                // aqui se extraen los datos....//
                ComboBoxCedula_atleta.addItem(new CboxSelectCedula_atleta(
                        rs.getInt("idatletas"),
                        rs.getString("nombres"),
                        rs.getInt("cedula")
                ));

            }
        } catch (Exception e) {

            System.out.println("Error en la extraccion de los Datos");
        } finally {

            conn.close();

        }
    }

    @Override

    public String toString() {

        return cedula + "     " + nombres;
    }

    /* METODO PARA CARGAR COMBO BOX PARA LAS RUTINAS PERSONALIZADAS EN LA CLASE RUTINAS PERSONALIZADAS */
    public void cargarCboxCedula_rutinas2(JComboBox<CboxSelectCedula_atleta> ComboBoxCedula_atleta2) throws SQLException {
        Connection conn = conexion.conectar();
        try {

            String sql = "SELECT idatletas, nombres,cedula FROM atletas";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            ComboBoxCedula_atleta2.removeAllItems();

            while (rs.next()) {

                // aqui se extraen los datos....//
                ComboBoxCedula_atleta2.addItem(new CboxSelectCedula_atleta(
                        rs.getInt("idatletas"),
                        rs.getString("nombres"),
                        rs.getInt("cedula")
                ));

            }
        } catch (Exception e) {

            System.out.println("Error en la extraccion de los Datos");
        } finally {

            conn.close();

        }
    }

}
   

      
    
 
 

