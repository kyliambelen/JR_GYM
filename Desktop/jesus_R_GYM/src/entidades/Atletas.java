package entidades;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Atletas {

    private int idatletas;
    private String fecha_registro;
    private int cedula;
    private String nombres;
    private String telefono;
    private String sexo;
    private int ano_nacimiento;
    private String correo;
    private String direccion;
    private String asistencia;
    private String modo_pago;
    private String observaciones;
    public String ruta;
    private byte[] foto;

    public Atletas() {

    }

    public Atletas(int idatletas, String fecha_registro, int cedula, String nombres, String telefono, String sexo, int ano_nacimiento, String correo, String direccion, String asistencia, String modo_pago, String observaciones, String ruta, byte[] foto) {
        this.idatletas = idatletas;
        this.fecha_registro = fecha_registro;
        this.cedula = cedula;
        this.nombres = nombres;
        this.telefono = telefono;
        this.sexo = sexo;
        this.ano_nacimiento = ano_nacimiento;
        this.correo = correo;
        this.direccion = direccion;
        this.asistencia = asistencia;
        this.modo_pago = modo_pago;
        this.observaciones = observaciones;
        this.ruta = ruta;
        this.foto = foto;
    }

    public int getIdatletas() {
        return idatletas;
    }

    public void setIdatletas(int idatletas) {
        this.idatletas = idatletas;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAno_nacimiento() {
        return ano_nacimiento;
    }

    public void setAno_nacimiento(int ano_nacimiento) {
        this.ano_nacimiento = ano_nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }

    public String getModo_pago() {
        return modo_pago;
    }

    
    public void setModo_pago(String modo_pago) {
        this.modo_pago = modo_pago;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Atletas{" + "idatletas=" + idatletas + ", fecha_registro=" + fecha_registro + ", cedula=" + cedula + ", nombres=" + nombres + ", telefono=" + telefono + ", sexo=" + sexo + ", ano_nacimiento=" + ano_nacimiento + ", correo=" + correo + ", direccion=" + direccion + ", asistencia=" + asistencia + ", modo_pago=" + modo_pago + ", observaciones=" + observaciones + ", ruta=" + ruta + ", foto=" + foto + '}';
    }

  
}
