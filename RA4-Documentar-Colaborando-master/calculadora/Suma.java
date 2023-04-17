package calculadora;

/**
 * Clase en la que se realizan todas las operacione necesarias de sumas para una calculadora.
 * @see calculadora
 * @author Óscar 
 * @version 1.0.0
 * @since 17/04/2023
 */


public class Suma {
	
	/**
     * Valor acumulado de las sumas realizadas en la calculadora.
     */

    public float valorAcumulado;

    /**
     * Obtiene el valor acumulado de las sumas realizadas en la calculadora.
     * @return valor acumulado de las sumas realizadas en la calculadora
     */

    public float getValorAcumulado() {
	    return valorAcumulado;
    }

    /**
     * Establece el valor acumulado de las sumas realizadas en la calculadora.
     * @param valorAcumulado el valor acumulado de las sumas realizadas en la calculadora
     */

    public void setValorAcumulado(float valorAcumulado) {
	    this.valorAcumulado = valorAcumulado;
    }

    /**
     * Realiza la suma de dos números de tipo float.
     * @param a primer número de tipo float a sumar
     * @param b segundo número de tipo float a sumar
     * @return resultado de la suma de los dos números de tipo float
     */

    public float dosReales(float a, float b) {
    	return a+b;
    }

    /**
     * Realiza la suma de dos números enteros.
     * @param a primer número entero a sumar
     * @param b segundo número entero a sumar
     * @return resultado de la suma de los dos números enteros
     */

    public int dosEnteros(int a, int b) {
    	return a+b;
    }

    /**
     * Realiza la suma de tres números de tipo float.
     * @param a primer número de tipo float a sumar
     * @param b segundo número de tipo float a sumar
     * @param c tercer número de tipo float a sumar
     * @return resultado de la suma de los tres números de tipo float
     */

    public float tresReales(float a, float b, float c) {
	    return a+b+c;
    }

    /**
     * Realiza la suma de un número de tipo float al valor acumulado de la calculadora.
     * @param a número de tipo float a sumar al valor acumulado de la calculadora
     * @return valor acumulado de las sumas realizadas en la calculadora después de la operación
     */

    public float sumaAcumulado(float a) {
	    valorAcumulado = a + valorAcumulado;
	    return valorAcumulado;
    }

}
