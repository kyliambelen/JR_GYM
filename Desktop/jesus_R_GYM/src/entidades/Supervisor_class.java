
package entidades;


public class Supervisor_class {
    
    private int idsupervisor;
    private int idusuario;
    private String nombre;
    private String clave;
    private int rol;
    private int estatus;

    public Supervisor_class () {
    }

    public Supervisor_class (int idsupervisor, int idusuario, String nombre, String clave, int rol, int estatus) {
        this.idsupervisor = idsupervisor;
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.clave = clave;
        this.rol = rol;
        this.estatus = estatus;
    }

    public int getIdsupervisor () {
        return idsupervisor;
    }

    public void setIdsupervisor (int idsupervisor) {
        this.idsupervisor = idsupervisor;
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

    public String getClave () {
        return clave;
    }

    public void setClave (String clave) {
        this.clave = clave;
    }

    public int getRol () {
        return rol;
    }

    public void setRol (int rol) {
        this.rol = rol;
    }

    public int getEstatus () {
        return estatus;
    }

    public void setEstatus (int estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString () {
        return "Supervisor_class{" + "idsupervisor=" + idsupervisor + ", idusuario=" + idusuario + ", nombre=" + nombre + ", clave=" + clave + ", rol=" + rol + ", estatus=" + estatus + '}';
    }
    
    
    
}
