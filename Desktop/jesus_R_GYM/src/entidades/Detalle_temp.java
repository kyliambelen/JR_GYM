package entidades;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Detalle_temp {

    private int correlativo;
    private String token_user;
    private int idpago;
    private int cantidad_dia;
    private double monto;
    private double descuento;

    public Detalle_temp() {
        
        
    }

    public Detalle_temp(int correlativo, String token_user, int idpago, int cantidad_dia, double monto, double descuento) {
        this.correlativo = correlativo;
        this.token_user = token_user;
        this.idpago = idpago;
        this.cantidad_dia = cantidad_dia;
        this.monto = monto;
        this.descuento = descuento;
    }

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    public String getToken_user() {
        return token_user;
    }

    public void setToken_user(String token_user) {
        this.token_user = token_user;
    }

    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    public int getCantidad_dia() {
        return cantidad_dia;
    }

    public void setCantidad_dia(int cantidad_dia) {
        this.cantidad_dia = cantidad_dia;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Detalle_temp{" + "correlativo=" + correlativo + ", token_user=" + token_user + ", idpago=" + idpago + ", cantidad_dia=" + cantidad_dia + ", monto=" + monto + ", descuento=" + descuento + '}';
    }
    
    

}
