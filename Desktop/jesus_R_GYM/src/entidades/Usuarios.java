package entidades;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Usuarios {

    private int idusuario;
    private String nombre;
    private String correo;
    private String usuario;
    private String clave;
    private String rol;
    private int idrol;

 public Usuarios () {
        
    }

    public Usuarios (int idusuario, String nombre, String correo, String usuario, String clave, String rol, int idrol) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.correo = correo;
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
        this.idrol = idrol;
    }

    public int getIdusuario () {
        return idusuario;
    }

    public void setIdusuario (int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo () {
        return correo;
    }

    public void setCorreo (String correo) {
        this.correo = correo;
    }

    public String getUsuario () {
        return usuario;
    }

    public void setUsuario (String usuario) {
        this.usuario = usuario;
    }

    public String getClave () {
        return clave;
    }

    public void setClave (String clave) {
        this.clave = clave;
    }

    public String getRol () {
        return rol;
    }

    public void setRol (String rol) {
        this.rol = rol;
    }

    public int getIdRol () {
        return idrol;
    }

    public void setIdRol (int idrol) {
        this.idrol = idrol;
    }

    @Override
    public String toString () {
        return "Usuarios{" + "idusuario=" + idusuario + ", nombre=" + nombre + ", correo=" + correo + ", usuario=" + usuario + ", clave=" + clave + ", rol=" + rol + ", idrol=" + idrol + '}';
    }
}