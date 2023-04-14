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

	
	public float dosReales(float a, float b) {
		return a*b;
	}
	
	public int dosEnteros(int a, int b) {
		return a*b;
	}
	
	public float tresReales(float a, float b, float c) {
		return a*b*c;
	}
	
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}
}
