
package entidades;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class NumeroSerie_factura {
    
    private int idserie;
    private int serie;
    private int serieInicio;
    private int serieFinal;

    public NumeroSerie_factura() {
        
        
    }

    public NumeroSerie_factura(int idserie, int serie, int serieInicio, int serieFinal) {
        this.idserie = idserie;
        this.serie = serie;
        this.serieInicio = serieInicio;
        this.serieFinal = serieFinal;
    }

    public int getIdserie() {
        return idserie;
    }

    public void setIdserie(int idserie) {
        this.idserie = idserie;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getSerieInicio() {
        return serieInicio;
    }

    public void setSerieInicio(int serieInicio) {
        this.serieInicio = serieInicio;
    }

    public int getSerieFinal() {
        return serieFinal;
    }

    public void setSerieFinal(int serieFinal) {
        this.serieFinal = serieFinal;
    }

    @Override
    public String toString() {
        return "NumeroSerie_factura{" + "idserie=" + idserie + ", serie=" + serie + ", serieInicio=" + serieInicio + ", serieFinal=" + serieFinal + '}';
    }
    
    
    
    
}
