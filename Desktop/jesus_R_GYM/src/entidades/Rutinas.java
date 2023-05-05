
package entidades;

import java.util.Date;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Rutinas {
    
    private int idrutina;
    private int idatletas;
    private int cedula;
    private String nombres;
    private String entrenador;
    private String dia;
    private String fecha_rutina;
    private String rutinas;
    private String modalidad;
    private String ejercicio;
    private String serie;
    private String repeticiones;
    private String descanso;

    public Rutinas() {
        
        
    }

    public Rutinas(int idrutina, int idatletas, int cedula, String nombres, String entrenador, String dia, String fecha_rutina, String rutinas, String modalidad, String ejercicio, String serie, String repeticiones, String descanso) {
        this.idrutina = idrutina;
        this.idatletas = idatletas;
        this.cedula = cedula;
        this.nombres = nombres;
        this.entrenador = entrenador;
        this.dia = dia;
        this.fecha_rutina = fecha_rutina;
        this.rutinas = rutinas;
        this.modalidad = modalidad;
        this.ejercicio = ejercicio;
        this.serie = serie;
        this.repeticiones = repeticiones;
        this.descanso = descanso;
    }

    public int getIdrutina() {
        return idrutina;
    }

    public void setIdrutina(int idrutina) {
        this.idrutina = idrutina;
    }

    public int getIdatletas() {
        return idatletas;
    }

    public void setIdatletas(int idatletas) {
        this.idatletas = idatletas;
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

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getFecha_rutina() {
        return fecha_rutina;
    }

    public void setFecha_rutina(String fecha_rutina) {
        this.fecha_rutina = fecha_rutina;
    }

    public String getRutinas() {
        return rutinas;
    }

    public void setRutinas(String rutinas) {
        this.rutinas = rutinas;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(String ejercicio) {
        this.ejercicio = ejercicio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(String repeticiones) {
        this.repeticiones = repeticiones;
    }

    public String getDescanso() {
        return descanso;
    }

    public void setDescanso(String descanso) {
        this.descanso = descanso;
    }

    @Override
    public String toString() {
        return "Rutinas{" + "idrutina=" + idrutina + ", idatletas=" + idatletas + ", cedula=" + cedula + ", nombres=" + nombres + ", entrenador=" + entrenador + ", dia=" + dia + ", fecha_rutina=" + fecha_rutina + ", rutinas=" + rutinas + ", modalidad=" + modalidad + ", ejercicio=" + ejercicio + ", serie=" + serie + ", repeticiones=" + repeticiones + ", descanso=" + descanso + '}';
    }

}
