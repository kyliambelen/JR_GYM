package dao;

public class CalculadorasDao {

    private String cadena;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    private boolean raiz;
    private boolean alcuadrado;

    public CalculadorasDao () {

        cadena = "";
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
        raiz = false;
        alcuadrado = false;

    }

    public String concatenamiento (String cadena) {

        this.cadena = this.cadena + cadena;
        return this.cadena;

    }

    public void suma (String cadena) {

        this.resultado = Double.parseDouble (cadena);
        suma = true;
        this.cadena = "";

    }

    public void resta (String cadena) {

        this.resultado = Double.parseDouble (cadena);
        resta = true;
        this.cadena = "";

    }

    public void multiplicacion (String cadena) {

        this.resultado = Double.parseDouble (cadena);
        multiplicacion = true;
        this.cadena = "";

    }

    public void division (String cadena) {

        this.resultado = Double.parseDouble (cadena);
        division = true;
        this.cadena = "";

    }

    public void raiz (String cadena) {

        this.resultado = Double.parseDouble (cadena);
        raiz = true;
        this.cadena = "";

    }

    public void alcuadrado (String cadena) {

        this.resultado = Double.parseDouble (cadena);
        alcuadrado = true;
        this.cadena = "";

    }

    
////////////////////////////////////////////////////////////////////////////////////////////////

    public double resultado (String numero) {

        if (suma == true) {

            resultado = resultado + Double.parseDouble (numero);

        } else if (resta == true) {

            resultado = resultado - Double.parseDouble (numero);

        } else if (multiplicacion == true) {

            resultado = resultado * Double.parseDouble (numero);

        } else if (division == true) {

            resultado = resultado / Double.parseDouble (numero);

        } else if (raiz == true) {

            resultado = Math.sqrt (Double.parseDouble (numero));

        }else if (alcuadrado == true) {

            resultado = Math.pow (resultado, 2);
        } 

        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
        raiz = false;
        alcuadrado = false;

        return resultado;

    }

}
