
package entidades;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Facturas {
    
    private int nofactura;
    private int usuario;
    private String fecha;
    private String nombre_usuario;
    private int idatletas;
    private double totalPago;
    private String token_user;
    private String noserie;
    private int estatus;

    public Facturas() {
        
        
    }

    public Facturas(int nofactura, int usuario, String fecha, String nombre_usuario, int idatletas, double totalPago, String token_user, String noserie, int estatus) {
        this.nofactura = nofactura;
        this.usuario = usuario;
        this.fecha = fecha;
        this.nombre_usuario = nombre_usuario;
        this.idatletas = idatletas;
        this.totalPago = totalPago;
        this.token_user= token_user;
        this.noserie = noserie;
        this.estatus = estatus;
    }

    public int getNofactura() {
        return nofactura;
    }

    public void setNofactura(int nofactura) {
        this.nofactura = nofactura;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getIdatletas() {
        return idatletas;
    }

    public void setIdatletas(int idatletas) {
        this.idatletas = idatletas;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }

    public String getToken_user() {
        return token_user;
    }

    public void setToken_user(String token_user) {
        this.token_user = token_user;
    }
    
    

    public String getNoserie() {
        return noserie;
    }

    public void setNoserie(String noserie) {
        this.noserie = noserie;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Facturas{" + "nofactura=" + nofactura + ", usuario=" + usuario + ", fecha=" + fecha + ", nombre_usuario=" + nombre_usuario + ", idatletas=" + idatletas + ", totalPago=" + totalPago + ", token_user=" + token_user + ", noserie=" + noserie + ", estatus=" + estatus + '}';
    }

   
}
