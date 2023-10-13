package Ejercicio5;

import java.util.Random;

/**
 * Clase repersenta a un Estudiante
 * 
 * <li>private String materia
 * 
 * @author David Maza
 */
class Estudiante extends Persona {

	private double calificacionActual;

	public Estudiante(String nombre, int edad, String sexo, double calificacionActual) {
		super(nombre, edad, sexo);
		this.calificacionActual = calificacionActual;
	}

	public double getCalificacionActual() {
		return calificacionActual;
	}

	/**
	 * Devuelve si el profesor está ausente o no.
	 *
	 * 
	 * @return `true` si el profesor está ausente, `false` si está disponible
	 */
	public boolean faltar() {
		Random random = new Random();
		return random.nextDouble() < 0.5 ? true : false;
	}

	/**
	 * Devuelve si el estudiante está aprobado o no.
	 *
	 * @return `true` si el estudiante está aprobado, `false` si está reprobado
	 */
	public boolean estaAprobado() {
		return calificacionActual >= 5.0;
	}

	/**
	 * Devuelve la calificación actual del estudiante formateada a dos decimales.
	 *
	 * @return la calificación actual del estudiante formateada a dos decimales
	 */
	public String getCalificacionFormateada() {
		return String.format("%.2f", Math.round(calificacionActual * 1000.0) / 1000.0);
	}
}