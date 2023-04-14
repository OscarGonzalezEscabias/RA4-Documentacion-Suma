/**
 * Clase que realiza el producto de los valores que se le inserten
 * dichos valores pueden ser de cualquier tipo tanto enteros como reales
 * teniendo que entrar obligatoriamente dos valores
 * 
 */

package calculadora;

/**
 * Clase que engloba todos los métodos necesarios para el producto 
 * de una calculadora 
 * @author Martin
 * 
 */

public class Producto {

	/**
	 * Método que devuelve el producto de dos variables float introducidas
	 * 
	 * @param a
	 * @param b
	 * @return Producto de dos variables float
	 */
	
	public float dosReales(float a, float b) {
		return a*b;
	}
	/**
	 * Método que devuelve el producto de dos números enteros 
	 * introducidos
	 * @param a
	 * @param b
	 * @return producto de enteros
	 */
	
	public int dosEnteros(int a, int b) {
		return a*b;
	}

	/**
	 * Método que devuelve el producto de tres números reales 
	 * introducidos
	 * @param a
	 * @param b
	 * @param c
	 * @return producto de tres números reales
	 */
	
	public float tresReales(float a, float b, float c) {
		return a*b*c;
	}
	/**
	 * Método que devuelve un número elevado a otro , ejemp; 2^2 =4...
	 * @param base
	 * @param exponente
	 * @return resultado de un número real elevado a otro
	 */
	
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}
}