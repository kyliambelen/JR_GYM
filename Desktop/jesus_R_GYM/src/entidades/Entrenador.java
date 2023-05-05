
package entidades;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Entrenador {
    
    private int identrenador;
    private int cedula;
    private String nombres;
    private String sexo;
    private String horario;
    private String asistencia;
    private String correo;
    private String telefono;
    private String direccion;

    public Entrenador() {
        
        
    }

    public Entrenador(int identrenador, int cedula, String nombres, String sexo, String horario, String asistencia, String correo, String telefono, String direccion) {
        this.identrenador = identrenador;
        this.cedula = cedula;
        this.nombres = nombres;
        this.sexo = sexo;
        this.horario = horario;
        this.asistencia = asistencia;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getIdentrenador() {
        return identrenador;
    }

    public void setIdentrenador(int identrenador) {
        this.identrenador = identrenador;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
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

    @Override
    public String toString() {
        return "Entrenador{" + "identrenador=" + identrenador + ", cedula=" + cedula + ", nombres=" + nombres + ", sexo=" + sexo + ", horario=" + horario + ", asistencia=" + asistencia + ", correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }

   
    
    
}
