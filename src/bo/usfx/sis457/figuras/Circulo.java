/*
 * 
 */
package bo.usfx.sis457.figuras;

/**
 * 
 * @author Dell
 */
public class Circulo {
    private float Radio;
    
    /**
     * 
     */
    public Circulo() {
        this.Radio = 0;
    }
    
    /**
     * 
     * @param radio Valor tipo float
     */
    public Circulo (float radio) {
        this.Radio = radio;
    }

    /**
     * Método que retorna el valor del Radio 
     * @return Devuelve el valor del Radio en tipo float
     */
    public float getRadio() {
        return Radio;
    }

    /**
     * 
     * @param radio Valor de tipo float
     */
    public void setRadio(float radio) {
        this.Radio = radio;
    }
    
    /**
     *
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return (Math.PI * Math.pow(this.Radio, 2));
    }
    
    /**
     *
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (2 * Math.PI * this.Radio);
    }
}
