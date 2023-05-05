
package entidades;

public class Configuracion_gym {
    
    private int idorganizacion;
    private String rif;
    private String nombre;
    private String razon_social;
    private String correo;
    private String telefono;
    private String direccion;
    private String inicio_actividad;

    public Configuracion_gym () {
        
        
    }

    public Configuracion_gym(int idorganizacion, String rif, String nombre, String razon_social, String correo, String telefono, String direccion, String inicio_actividad) {
        this.idorganizacion = idorganizacion;
        this.rif = rif;
        this.nombre = nombre;
        this.razon_social = razon_social;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.inicio_actividad = inicio_actividad;
    }

    public int getIdorganizacion() {
        return idorganizacion;
    }

    public void setIdorganizacion(int idorganizacion) {
        this.idorganizacion = idorganizacion;
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getInicio_actividad() {
        return inicio_actividad;
    }

    public void setInicio_actividad(String inicio_actividad) {
        this.inicio_actividad = inicio_actividad;
    }

    @Override
    public String toString() {
        return "Configuracion_gym{" + "idorganizacion=" + idorganizacion + ", rif=" + rif + ", nombre=" + nombre + ", razon_social=" + razon_social + ", correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion + ", inicio_actividad=" + inicio_actividad + '}';
    }

}
