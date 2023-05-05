
package bd;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {

    private  Connection conexion;
    private  String host = "localhost";
    private  String usuario = "root";
    private  String password = "";
    private  String BaseDatos = "jesus_r_gym";
    private String url= "jdbc:mysql://"+host+"/"+BaseDatos;

    //private  String url = "jdbc:mysql://"+host+"/"+nombreDB;

    public Connection conectar(){
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            this.conexion = DriverManager.getConnection (this.url, this.usuario, this.password);

        } catch (Exception e) {

            System.out.println ("Error de conexion:"+e.getMessage ());
        }

        return this.conexion;
    }
}




    

