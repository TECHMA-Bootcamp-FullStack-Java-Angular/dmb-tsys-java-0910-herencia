package Ejercicio6;

/**
 * Clase Pelicula que reperesenta un pelicula según ejerccio
 *
 * <li>private String titulo;
 * <li>private int duracion;
 * <li>private int edadMinima;
 * <li>private String director;
 *
 * @author Jordi Mallafre
 */
public class Pelicula {
	private String titulo;
	private int duracion;
	private int edadMinima;
	private String director;

	public Pelicula(String titulo, int duracion, int edadMinima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public String getDirector() {
		return director;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {

		return "\t\t\tPELICULA \n" + "Titulo: " + titulo + "\nDirector: " + director + "\nDuracion: " + duracion
				+ " minutos y la edad minima es de " + edadMinima + " años";
	}
}
