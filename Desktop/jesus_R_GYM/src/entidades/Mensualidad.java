
package entidades;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Mensualidad {
    
    private int idmensualidad;
    private String nroreferencia;
    private int cedula;
    private String nombres;
    private String fecha_inscripcion;
    private String fecha_final;
    private Double monto_inscripcion;
    private Double monto_mensualidad;
    private Double monto_abono;
    private Double monto_debe;
    private String forma_depago;
    private String nombre_entrenador;
    private Double monto_entrenador;
    private String fecha_inicio;
    private String fecha_finaliza;
    private String entrenamientos;
    private String turno;
    private String hora_entrada;
    private String hora_salida;
    private String rutaFoto;
    private byte[] foto;

    public Mensualidad() {
	
	
    }

    public Mensualidad(int idmensualidad, String nroreferencia, int cedula, String nombres, String fecha_inscripcion, String fecha_final, Double monto_inscripcion, Double monto_mensualidad, Double monto_abono, Double monto_debe, String forma_depago, String nombre_entrenador, Double monto_entrenador,String fecha_inicio, String fecha_finaliza, String entrenamientos, String turno, String hora_entrada, String hora_salida,String rutaFoto, byte[] foto) {
	this.idmensualidad = idmensualidad;
	this.nroreferencia = nroreferencia;
	this.cedula = cedula;
	this.nombres = nombres;
	this.fecha_inscripcion = fecha_inscripcion;
	this.fecha_final = fecha_final;
	this.monto_inscripcion = monto_inscripcion;
	this.monto_mensualidad = monto_mensualidad;
	this.monto_abono = monto_abono;
	this.monto_debe = monto_debe;
	this.forma_depago = forma_depago;
	this.nombre_entrenador = nombre_entrenador;
	this.monto_entrenador = monto_entrenador;
	this.fecha_inicio = fecha_inicio;
	this.fecha_finaliza = fecha_finaliza;
	this.entrenamientos = entrenamientos;
	this.turno = turno;
	this.hora_entrada = hora_entrada;
	this.hora_salida = hora_salida;
	this.rutaFoto = rutaFoto;
	this.foto = foto;
    }

    public int getIdmensualidad() {
	return idmensualidad;
    }

    public void setIdmensualidad(int idmensualidad) {
	this.idmensualidad = idmensualidad;
    }

    public String getNroreferencia() {
	return nroreferencia;
    }

    public void setNroreferencia(String nroreferencia) {
	this.nroreferencia = nroreferencia;
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

    public String getFecha_inscripcion() {
	return fecha_inscripcion;
    }

    public void setFecha_inscripcion(String fecha_inscripcion) {
	this.fecha_inscripcion = fecha_inscripcion;
    }

    public String getFecha_final() {
	return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
	this.fecha_final = fecha_final;
    }

    public Double getMonto_inscripcion() {
	return monto_inscripcion;
    }

    public void setMonto_inscripcion(Double monto_inscripcion) {
	this.monto_inscripcion = monto_inscripcion;
    }

    public Double getMonto_mensualidad() {
	return monto_mensualidad;
    }

    public void setMonto_mensualidad(Double monto_mensualidad) {
	this.monto_mensualidad = monto_mensualidad;
    }

    public Double getMonto_abono() {
	return monto_abono;
    }

    public void setMonto_abono(Double monto_abono) {
	this.monto_abono = monto_abono;
    }

    public Double getMonto_debe() {
	return monto_debe;
    }

    public void setMonto_debe(Double monto_debe) {
	this.monto_debe = monto_debe;
    }

    public String getForma_depago() {
	return forma_depago;
    }

    public void setForma_depago(String forma_depago) {
	this.forma_depago = forma_depago;
    }

    public String getNombre_entrenador() {
	return nombre_entrenador;
    }

    public void setNombre_entrenador(String nombre_entrenador) {
	this.nombre_entrenador = nombre_entrenador;
    }

    public Double getMonto_entrenador() {
        return monto_entrenador;
    }

    public void setMonto_entrenador(Double monto_entrenador) {
        this.monto_entrenador = monto_entrenador;
    }

    public String getFecha_inicio() {
	return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
	this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_finaliza() {
	return fecha_finaliza;
    }

    public void setFecha_finaliza(String fecha_finaliza) {
	this.fecha_finaliza = fecha_finaliza;
    }

    public String getEntrenamientos() {
	return entrenamientos;
    }

    public void setEntrenamientos(String entrenamientos) {
	this.entrenamientos = entrenamientos;
    }

    public String getTurno() {
	return turno;
    }

    public void setTurno(String turno) {
	this.turno = turno;
    }

    public String getHora_entrada() {
	return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
	this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
	return hora_salida;
    }

    public void setHora_salida(String hota_salida) {
	this.hora_salida = hota_salida;
    }

    public String getRutaFoto() {
	return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
	this.rutaFoto = rutaFoto;
    }
    
    

    public byte[] getFoto() {
	return foto;
    }

    public void setFoto(byte[] foto) {
	this.foto = foto;
    }

    @Override
    public String toString() {
        return "Mensualidad{" + "idmensualidad=" + idmensualidad + ", nroreferencia=" + nroreferencia + ", cedula=" + cedula + ", nombres=" + nombres + ", fecha_inscripcion=" + fecha_inscripcion + ", fecha_final=" + fecha_final + ", monto_inscripcion=" + monto_inscripcion + ", monto_mensualidad=" + monto_mensualidad + ", monto_abono=" + monto_abono + ", monto_debe=" + monto_debe + ", forma_depago=" + forma_depago + ", nombre_entrenador=" + nombre_entrenador + ", monto_entrenador=" + monto_entrenador + ", fecha_inicio=" + fecha_inicio + ", fecha_finaliza=" + fecha_finaliza + ", entrenamientos=" + entrenamientos + ", turno=" + turno + ", hora_entrada=" + hora_entrada + ", hora_salida=" + hora_salida + ", rutaFoto=" + rutaFoto + ", foto=" + foto + '}';
    }

   

    
}
