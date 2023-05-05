package dao;

import bd.Conexion;
import entidades.Horarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class HorariosDao {

    private final Conexion conexion = new Conexion();

    /*  METODO PARA  AGREGAR  LOS  HORARIOS  AL  SISTEMA */
    public boolean agregarHorarios(Horarios horarios) throws SQLException {

	boolean fueAgregado = false;
	try ( Connection conn = conexion.conectar()) {

	    String sql = "INSERT INTO horarios(manana,tarde,noche,personal_trainer, especial_sabado, servicio_acordado,otro_servicio,observaciones) VALUES (?,?,?,?,?,?,?,?)";

	    PreparedStatement stmt = conn.prepareStatement(sql);

	    stmt.setString(1, horarios.getManana());
	    stmt.setString(2, horarios.getTarde());
	    stmt.setString(3, horarios.getNoche());
	    stmt.setString(4, horarios.getPersonal_trainer());
	    stmt.setString(5, horarios.getEspecial_sabado());
	    stmt.setString(6, horarios.getServicio_acordado());
	    stmt.setString(7, horarios.getOtro_servicio());
	    stmt.setString(8, horarios.getObservaciones());

	    // Aqui se ejecuta la sentencia...//
	    int cantidad = stmt.executeUpdate();

	    fueAgregado = (cantidad > 0);

	} catch (Exception e) {

	    System.out.println("Error agregando el horario" + e.getMessage());
	}

	return fueAgregado;
    }

    /* *****************************************************************************************************************************  */
    public boolean modificarHorarios(Horarios horarios) throws SQLException {

	boolean fueAgregado = false;

	try ( Connection conn = conexion.conectar()) {

	    String sql = "UPDATE horarios SET manana=?, tarde=?, noche=?, personal_trainer=?, especial_sabado=?, servicio_acordado=?,otro_servicio=?,observaciones=? WHERE idhorarios=?";

	    PreparedStatement stmt = conn.prepareStatement(sql);

	    stmt.setString(1, horarios.getManana());
	    stmt.setString(2, horarios.getTarde());
	    stmt.setString(3, horarios.getNoche());
	    stmt.setString(4, horarios.getPersonal_trainer());
	    stmt.setString(5, horarios.getEspecial_sabado());
	    stmt.setString(6, horarios.getServicio_acordado());
	    stmt.setString(7, horarios.getOtro_servicio());
	    stmt.setString(8, horarios.getObservaciones());
	    stmt.setInt(9, horarios.getIdhorario());
	    // Aqui se ejecuta la sentencia...//
	    int cantidad = stmt.executeUpdate();

	    fueAgregado = (cantidad > 0);

	} catch (Exception e) {

	    System.out.println("Error Editando el horario" + "  " + e.getMessage());
	}

	return fueAgregado;
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    public boolean eliminarHorarios(int idhorarios) throws SQLException {

	boolean fueEliminado = false;

	Connection conn = conexion.conectar();

	try {

	    String sql = "DELETE FROM horarios WHERE idhorarios = ?";

	    PreparedStatement stmt = conn.prepareStatement(sql);

	    stmt.setInt(1, idhorarios);

	    fueEliminado = (stmt.executeUpdate() > 0);

	} catch (SQLException e) {
	    System.out.println("Error Eliminando el Registro." + e.getMessage());
	}

	return fueEliminado;
    }

   
   
}
