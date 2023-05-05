
package entidades;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Pagos {
    
    private int idpago;
    private String codpago ;
     private String descripcion;
     private String modo_pago;
     private double monto;
     private double iva;
     private double exento;
      private int usuario_id;
 
    public Pagos() {
	
    }
    
     public Pagos(int idpago, String codpago, String descripcion, String modo_pago, double monto, double iva, double exento, int usuario_id) {
	this.idpago = idpago;
	this.codpago = codpago;
	this.descripcion = descripcion;
	this.modo_pago = modo_pago;
	this.monto = monto;
	this.iva = iva;
	this.exento = exento;
	this.usuario_id = usuario_id;
    }

    public int getIdpago() {
	return idpago;
    }

    public void setIdpago(int idpago) {
	this.idpago = idpago;
    }

    public String getCodpago() {
	return codpago;
    }

    public void setCodpago(String codpago) {
	this.codpago = codpago;
    }

    public String getDescripcion() {
	return descripcion;
    }

    public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
    }

    public String getModo_pago() {
	return modo_pago;
    }

    public void setModo_pago(String modo_pago) {
	this.modo_pago = modo_pago;
    }

    public double getMonto() {
	return monto;
    }

    public void setMonto(double monto) {
	this.monto = monto;
    }

    public double getIva() {
	return iva;
    }

    public void setIva(double iva) {
	this.iva = iva;
    }

    public double getExento() {
	return exento;
    }

    public void setExento(double exento) {
	this.exento = exento;
    }

    public int getUsuario_id() {
	return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
	this.usuario_id = usuario_id;
    }

   

    @Override
    public String toString() {
	return "Pagos{" + "idpago=" + idpago + ", codpago=" + codpago + ", descripcion=" + descripcion + ", modo_pago=" + modo_pago + ", monto=" + monto + ", iva=" + iva + ", exento=" + exento + ", usuario_id=" + usuario_id + '}';
    }
 
}
