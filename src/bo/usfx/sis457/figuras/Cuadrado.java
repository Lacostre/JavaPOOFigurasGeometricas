/*
 * Archivo que contiene la Clase Cuadrado
 */
package bo.usfx.sis457.figuras;

/**
 *
 * @author Dell
 */
public class Cuadrado {
    private double Lado;

    /**
     * 
     * @param lado Valor tipo float
     */
    public Cuadrado(double lado) {
        this.Lado = lado;
    }

    /**
     * 
     */
    public Cuadrado() {
        // Llama al método constructor anterior
        this(0);
    }

    /**
     * 
     *
     */
    public double getLado() {
        return this.Lado;
    }

    /**
     * 
     * @param lado Valor de tipo double
     */
    public void setLado(double lado) {
        this.Lado = lado;
    }
    
    /**
     * 
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return (this.Lado * this.Lado);
    }
    
    /**
     *
     * 
     */
    public double getPerimetro() {
        return (4 * this.Lado);
    }
}
