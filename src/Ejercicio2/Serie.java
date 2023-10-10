package Ejercicio2;

/**
 * Clase Pelicula que reperesenta un pelicula segÃºn ejerccio
 *
 * <li>String titulo
 * <li>boolean entregado
 * <li>String genero
 * <li>String diterctor
 * <li>int numero_temporadas;
 *
 * @author David Maza
 */
public class Serie implements Entregable {

	private String titulo;
	private boolean entregado;
	private String genero;
	private String diterctor;
	private int numero_temporadas;

	private final int NUM_TEMPORAS_DEF = 3;
	private final boolean ENTREGADO_DEF = false;

	public final static int MAYOR = 1;
	public final static int MENOR = -1;
	public final static int IGUAL = 0;

	public Serie() {

		this.titulo = "";
		this.entregado = ENTREGADO_DEF;
		this.genero = "";
		this.diterctor = "";
		this.numero_temporadas = NUM_TEMPORAS_DEF;
	}

	public Serie(String titulo, int numero_temporadas) {

		this.titulo = titulo;
		this.entregado = ENTREGADO_DEF;
		this.genero = "";
		this.diterctor = "";
		this.numero_temporadas = numero_temporadas;
	}

	public Serie(String titulo, String genero, String diterctor, int numero_temporadas) {

		this.titulo = titulo;
		this.entregado = ENTREGADO_DEF;
		this.genero = genero;
		this.diterctor = diterctor;
		this.numero_temporadas = numero_temporadas;
	}

	// Getters
	public String getTitulo() {
		return titulo;
	}

	public String getGenero() {
		return genero;
	}

	public String getDiterctor() {
		return diterctor;
	}

	public int getNumero_temporadas() {
		return numero_temporadas;
	}

	// Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setDiterctor(String diterctor) {
		this.diterctor = diterctor;
	}

	public void setNumero_temporadas(int numero_temporadas) {
		this.numero_temporadas = numero_temporadas;
	}

	/**
	 * Cambia el contenido de la variable entregado a true
	 *
	 * @return true
	 */
	@Override
	public void entregar() {
		entregado = true;

	}

	/**
	 * Cambia el contenido de la variable entregado a false
	 *
	 * @return false
	 */
	@Override
	public void devolver() {
		entregado = false;

	}

	/**
	 * Devuelve el contenido de la variable entregado
	 *
	 * @return entregado
	 */
	@Override
	public boolean isEntregado() {
		return entregado;
	}

	
	/**
	 * Compara dos series segun su número de temporadas
	 * 
	 * @param objeto 
	 * @return int (-1,0,1)
	 * 
	 *<li>1: La Serie 1 es mayor que la Serie 2</li>
	 *<li>0: Las Series son iguales</li>
	 *<li>-1: La Serie 1 es menor que la Serie 2</li>     
	 */
	@Override
	public int compareTo(Object a) {
		int estado = IGUAL;

		Serie objCompared = (Serie) a;
		if (numero_temporadas > objCompared.getNumero_temporadas()) {
			estado = MAYOR;
		} else if (numero_temporadas < objCompared.getNumero_temporadas()) {
			estado = MAYOR;
		}

		return estado;
	}

}
