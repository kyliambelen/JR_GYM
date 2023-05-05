
package entidades;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Horarios {
    
    private int idhorario;
    private String manana;
    private String tarde;
    private String noche;
    private String personal_trainer;
    private String especial_sabado;
    private String servicio_acordado;
    private String otro_servicio;
    private String observaciones;

    public Horarios() {
	
	
    }

    public Horarios(int idhorario, String manana, String tarde, String noche, String personal_trainer, String especial_sabado, String servicio_acordado, String otro_servicio, String observaciones) {
	this.idhorario = idhorario;
	this.manana = manana;
	this.tarde = tarde;
	this.noche = noche;
	this.personal_trainer = personal_trainer;
	this.especial_sabado = especial_sabado;
	this.servicio_acordado = servicio_acordado;
	this.otro_servicio = otro_servicio;
	this.observaciones = observaciones;
    }

    public int getIdhorario() {
	return idhorario;
    }

    public void setIdhorario(int idhorario) {
	this.idhorario = idhorario;
    }

    public String getManana() {
	return manana;
    }

    public void setManana(String manana) {
	this.manana = manana;
    }

    public String getTarde() {
	return tarde;
    }

    public void setTarde(String tarde) {
	this.tarde = tarde;
    }

    public String getNoche() {
	return noche;
    }

    public void setNoche(String noche) {
	this.noche = noche;
    }

    public String getPersonal_trainer() {
	return personal_trainer;
    }

    public void setPersonal_trainer(String personal_trainer) {
	this.personal_trainer = personal_trainer;
    }

    public String getEspecial_sabado() {
	return especial_sabado;
    }

    public void setEspecial_sabado(String especial_sabado) {
	this.especial_sabado = especial_sabado;
    }

    public String getServicio_acordado() {
	return servicio_acordado;
    }

    public void setServicio_acordado(String servicio_acordado) {
	this.servicio_acordado = servicio_acordado;
    }

    public String getOtro_servicio() {
	return otro_servicio;
    }

    public void setOtro_servicio(String otro_servicio) {
	this.otro_servicio = otro_servicio;
    }

    public String getObservaciones() {
	return observaciones;
    }

    public void setObservaciones(String observaciones) {
	this.observaciones = observaciones;
    }

    @Override
    public String toString() {
	return "Horarios{" + "idhorario=" + idhorario + ", manana=" + manana + ", tarde=" + tarde + ", noche=" + noche + ", personal_trainer=" + personal_trainer + ", especial_sabado=" + especial_sabado + ", servicio_acordado=" + servicio_acordado + ", otro_servicio=" + otro_servicio + ", observaciones=" + observaciones + '}';
    }
    
}
