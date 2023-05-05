package entidades;

import java.util.Date;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class PagoPendiente {

    private int idpagoP;
    private String cedula;
    private String nombres;
    private String fecha;
    private String tiempo;
    private String hora_entrada;
    private String hora_salida;
    private String observaciones;
    private int estatus;

    public PagoPendiente() {

    }

    public PagoPendiente(int idpagoP, String cedula, String nombres, String fecha, String tiempo, String hora_entrada, String hora_salida, String observaciones, int estatus) {
        this.idpagoP = idpagoP;
        this.cedula = cedula;
        this.nombres = nombres;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.observaciones = observaciones;
        this.estatus = estatus;
    }

    public int getIdpagoP() {
        return idpagoP;
    }

    public void setIdpagoP(int idpagoP) {
        this.idpagoP = idpagoP;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
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

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "PagoPendiente{" + "idpagoP=" + idpagoP + ", cedula=" + cedula + ", nombres=" + nombres + ", fecha=" + fecha + ", tiempo=" + tiempo + ", hora_entrada=" + hora_entrada + ", hora_salida=" + hora_salida + ", observaciones=" + observaciones + ", estatus=" + estatus + '}';
    }

   

}
