package dao;

import bd.Conexion;
import entidades.Atletas;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class AtletasDao {

    private final Conexion conexion = new Conexion();
    private FileInputStream fis;
    private int longitudBytes;

    /*  METODO PARA  LISTAR  LOS  ATLETAS */
    public ArrayList<Atletas> Listar_atletas() {
	ArrayList<Atletas> list = new ArrayList<>();
	Connection conn = conexion.conectar();

	String sql = "SELECT idatletas,fecha_registro,cedula,nombres,telefono,sexo,year(now())-(ano_nacimiento) as edad,correo,direccion,asistencia,modo_pago,observaciones,foto FROM atletas;";
	ResultSet rs = null;
	PreparedStatement ps = null;
	try {

	    ps = conn.prepareStatement(sql);
	    rs = ps.executeQuery();
	    while (rs.next()) {
		Atletas atletas = new Atletas();
		
               
                
            
		atletas.setIdatletas(rs.getInt(1));
		atletas.setFecha_registro(rs.getString(2));
		atletas.setCedula(rs.getInt(3));
		atletas.setNombres(rs.getString(4));
		atletas.setTelefono(rs.getString(5));
		atletas.setSexo(rs.getString(6));
		atletas.setAno_nacimiento(rs.getInt(7));
		atletas.setCorreo(rs.getString(8));
		atletas.setDireccion(rs.getString(9));
		atletas.setAsistencia(rs.getString(10));
		atletas.setModo_pago(rs.getString(11));
		atletas.setObservaciones(rs.getString(12));
		atletas.setFoto(rs.getBytes(13));

		list.add(atletas);
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

    
    // METODO PARA AGREGAR LOS VALORES A LA TABLA ATLETAS
    public boolean GuardarAtletas() {

	boolean fueAgregado = false;

	try ( Connection conn = conexion.conectar()) {

	    PreparedStatement pst = conn.prepareStatement("insert into atletas(fecha_registro,cedula,nombres,telefono,sexo,ano_nacimiento,correo,direccion,asistencia,modo_pago,observaciones,foto) values (?,?,?,?,?,?,?,?,?,?,?,?)");

	    String fecha;
	    java.util.Date date = new java.util.Date();
	    SimpleDateFormat fechaForm = new SimpleDateFormat("yyyy-MM-dd");
	    //fecha = fechaForm.format(txtFechaR.getDate());

	    fecha = "";
	    int cedula = 0;
	    String nombres = "";
	    String telefono = "";
	    String sexo = "";
	    int ano_nacimiento = 0;
	    String correo = "";
	    String direccion = "";
	    String asistencia = "";
	    String modo_pago = "";
	    String observacion = "";

	    //pst.setInt(1, 0);
	    pst.setString(1, fecha);
	    pst.setInt(2, cedula);
	    pst.setString(3, nombres);
	    pst.setString(4, telefono);
	    pst.setString(5, sexo);
	    pst.setInt(6, ano_nacimiento);
	    pst.setString(7, correo);
	    pst.setString(8, direccion);
	    pst.setString(9, asistencia);
	    pst.setString(10, modo_pago);
	    pst.setString(11, observacion);

	    pst.setBlob(12, fis, longitudBytes);

	    int cantidad = pst.executeUpdate();
	    fueAgregado = (cantidad > 0);
	    conn.close();

	} catch (SQLException e) {
	    System.out.println("Error al guardar foto " + e);
	    JOptionPane.showMessageDialog(null, "¡¡Error al guardar foto!!");
	}
	return fueAgregado;
    }

    /*  METODO  PARA  COMPROBAR  SI  EL  ATLETA  YA  EXISTE  */
    public int existeAtleta(int cedula) throws SQLException {

	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = conexion.conectar();
	String sql = "SELECT count(idatletas) FROM atletas WHERE cedula = ?";

	try {

	    ps = conn.prepareStatement(sql);
	    ps.setInt(1, cedula);
	    rs = ps.executeQuery();

	    if (rs.next()) {
		return rs.getInt(1);

	    }

	    return 1;

	} catch (SQLException ex) {
	    Logger.getLogger(AtletasDao.class.getName()).log(Level.SEVERE, null, ex);

	    return 1;
	}
    }
    
     /*  FUNCION  PARA  HACER  LA  BUSQUEDA EN  LA  TABLA  BUSCAR CEDULA Y NOMBRES DE ATLETAS   */
    
    public DefaultTableModel buscarCedula_nombres (String buscar) {

        String[] nombresColumnas = {"ID", "CEDULA", "NOMBRES"};//Indica el nombre de las columnas en la tabla

        String[] registros = new String[3];

        DefaultTableModel modelo = new DefaultTableModel (null, nombresColumnas);

        String sql = "SELECT idatletas, cedula,nombres FROM atletas WHERE cedula LIKE '%" + buscar + "%' OR nombres LIKE '%" + buscar + "%'";

        Connection conn = conexion.conectar ();

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            pst = conn.prepareStatement (sql);

            rs = pst.executeQuery ();

            while (rs.next ()) {


                registros[0] = rs.getString ("idatletas");
                
                registros[1] = rs.getString ("cedula");

                registros[2] = rs.getString ("nombres");

               

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
    
     /*  FUNCION  PARA  BUSCAR  LOS  ATLETAS    */
    public Atletas buscarAtletas_asistencia (String cedula) {

        Atletas atletas = new Atletas();

        ResultSet rs = null;

        String sql = "SELECT idatletas,cedula,nombres FROM atletas WHERE cedula = ?";
        try {
            Connection conn = conexion.conectar ();

            PreparedStatement stmt = conn.prepareStatement (sql);

            stmt.setString (1, cedula);

            rs = stmt.executeQuery ();
            if (rs.next ()) {
                atletas.setIdatletas(rs.getInt ("idatletas"));
                atletas.setCedula(rs.getInt ("cedula"));
                atletas.setNombres(rs.getString ("nombres"));
               
            }

        } catch (SQLException e) {
            System.out.println (e.toString ());
        }

        return atletas;
    }
    
      /*  METODO  PARA  BUSCAR LOS ATLETAS  DEL MODULO  DE COBRANZAS  */
    public Atletas buscarAtletas (int cedula) {

        Atletas atle = new Atletas();
        String sql = "SELECT * FROM atletas WHERE cedula = ? ";
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conn = conexion.conectar ();
            ps = conn.prepareStatement (sql);
            ps.setInt (1, cedula);
            rs = ps.executeQuery ();
            if (rs.next ()) {
                atle.setIdatletas(rs.getInt ("idatletas"));
                atle.setCedula(rs.getInt ("Cedula"));
                atle.setNombres (rs.getString ("nombres"));
                

            }

        } catch (SQLException e) {
            System.out.println (e.toString ());
        }
        return atle;
    }
    
    // METODO PARA BUSCAR LOS ATLETAS EN LA TABLA LISTAR ATLETAS
    
    public DefaultTableModel buscarAtletas (String buscar) {

        String[] nombresColumnas = { "CEDULA", "NOMBRES", "SEXO", "FECHA-REGISTRO", "ASISTENCIA", "MODO-PAGO", "OBSERVACIONES"};//Indica el nombre de las columnas en la tabla

        String[] registros = new String[7];

        DefaultTableModel modelo = new DefaultTableModel (null, nombresColumnas);

        String sql = "SELECT * FROM atletas WHERE  cedula LIKE '%" + buscar + "%' OR nombres LIKE '%" + buscar + "%' OR sexo LIKE '%" + buscar + "%' OR fecha_registro LIKE '%" + buscar + "%' OR asistencia LIKE '%" + buscar + "%' OR modo_pago LIKE '%" + buscar + "%'";

        Connection conn = conexion.conectar ();

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            pst = conn.prepareStatement (sql);

            rs = pst.executeQuery ();

            while (rs.next ()) {

               
                registros[0] = rs.getString ("cedula");

                registros[1] = rs.getString ("nombres");

                registros[2] = rs.getString ("sexo");

                registros[3] = rs.getString ("fecha_registro");

                registros[4] = rs.getString ("asistencia");

                registros[5] = rs.getString ("modo_pago");

                registros[6] = rs.getString ("observaciones");
                
                

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
    
     // METODO PARA BUSCAR LOS ATLETAS EN LA TABLA OPERACIONES ATLETAS
    
      public DefaultTableModel buscarAtletas_oper (String buscar) {

        String[] nombresColumnas = {"ID", "CEDULA", "NOMBRES", "EDAD", "SEXO", "CORREO", "TELEFONO", "ASISTENCIA", "PAGO",  "REGISTRO", "DIRECCION"};//Indica el nombre de las columnas en la tabla

        String[] registros = new String[11];

        DefaultTableModel modelo = new DefaultTableModel (null, nombresColumnas);

        String sql = "SELECT * FROM atletas WHERE idatletas LIKE '%" + buscar + "%' OR cedula LIKE '%" + buscar + "%' OR nombres LIKE '%" + buscar + "%' OR sexo LIKE '%" + buscar + "%' OR correo LIKE '%" + buscar + "%' OR telefono LIKE '%" + buscar + "%' OR asistencia LIKE '%" + buscar + "%' OR modo_pago LIKE '%" + buscar + "%' OR fecha_registro LIKE '%" + buscar + "%' OR direccion LIKE '%" + buscar + "%'";

        Connection conn = conexion.conectar ();

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            pst = conn.prepareStatement (sql);

            rs = pst.executeQuery ();

            while (rs.next ()) {

                registros[0] = rs.getString ("idatletas");

                registros[1] = rs.getString ("cedula");

                registros[2] = rs.getString ("nombres");

                registros[3] = rs.getString ("ano_nacimiento");

                registros[4] = rs.getString ("sexo");

                registros[5] = rs.getString ("correo");

                registros[6] = rs.getString ("telefono");
                
                registros[7] = rs.getString ("asistencia");

                registros[8] = rs.getString ("modo_pago");

                registros[9] = rs.getString ("fecha_registro");
                
                registros[10] = rs.getString ("direccion");

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
      
       /*  METODO  PARA  BUSCAR LOS ATLETAS  DEL MODULO  CONTROL PAGOS  */
    public Atletas ubicaAtletas (String nofactura) {

        Atletas atletas = new Atletas ();
        String sql = "SELECT * FROM vista_listar_facturas WHERE nofactura = ? ";
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conn = conexion.conectar ();
            ps = conn.prepareStatement (sql);
            ps.setString (1, nofactura);
            rs = ps.executeQuery ();
            if (rs.next ()) {
                atletas.setIdatletas(rs.getInt ("cod_atleta"));
                atletas.setCedula(rs.getInt ("cedula"));
                atletas.setNombres (rs.getString ("cliente"));
                atletas.setDireccion (rs.getString ("direccion"));

            }

        } catch (Exception e) {
            System.out.println (e.toString ());
        }
        return atletas;
    }


}
