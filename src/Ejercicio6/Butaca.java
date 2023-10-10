package Ejercicio6;

/**
 * Clase Pelicula que reperesenta un pelicula según ejerccio
 *
 * <li>private char letra;
 * <li>private int fila;
 * <li>private int edadMinima;
 * <li>private Espectador espectador;
 *
 * @author Jordi Mallafre
 */
public class Butaca implements IOcupable{
	private char letra;
	private int fila;
	private Espectador espectador; // info del espectador que esta sentado, null si el saiento esta libre vacio

	public Butaca(char letra, int fila) {
		this.letra = letra;
		this.fila = fila;
		this.espectador = null; // Asiento libre librer defecto
	}

	public char getLetra() {
		return letra;
	}

	public int getFila() {
		return fila;
	}

	public Espectador getEspectador() {
		return espectador;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}

	/**
	 * Indica si el asiento esta ocupado
	 * 
	 * @return
	 */
	@Override
	public boolean ocupado() {
		return espectador == null ? false : true;
	}

	@Override
	public String toString() {
		if (ocupado()) {

			return "\u001B[31m" + " |\033[4;2m" + "O" + "\033[4;0m\u001B[31m|" + "\u001B[37m " + fila + letra + " - "
					+ "\u001B[43m \u001B[30m" + espectador + "\u001B[0m";
		}

		return "\u001B[0m" + "\u001B[32m" + " |\033[4;2m" + " " + "\033[4;0m\u001B[32m|" + "\u001B[37m " + fila + letra
				+ " - Disponble";

	}
}
