package Ejercicio2;

/**
 * Clase Videojuego que reperesenta un videojego segun ejercicio
 *  
 * <li>String titulo
 * <li>int horas_estimadas
 * <li>boolean entregado
 * <li>String genero
 * <li>String compañia;
 * 
 * @author Robert Lopez
 */
public class Videojuego implements Entregable {

	private String titulo;
	private int horas_estimadas;
	private boolean entregado;
	private String genero;
	private String compañia;

	private final String TITULO_DEF = "";
	private final int HORAS_ESTIMADAS_DEF = 10;
	private final boolean ENTREGADO_DEF = false;
	private final String GENERO_DEF = "";
	private final String COMPAÑIA_DEF = "";

	public final static int MAYOR = 1;
	public final static int MENOR = -1;
	public final static int IGUAL = 0;

	public Videojuego() {
		this.titulo = TITULO_DEF;
		this.horas_estimadas = HORAS_ESTIMADAS_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = GENERO_DEF;
		this.compañia = COMPAÑIA_DEF;
	}

	public Videojuego(String titulo, int horas_estimadas) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
		this.entregado = ENTREGADO_DEF;
		this.genero = GENERO_DEF;
		this.compañia = COMPAÑIA_DEF;
	}

	public Videojuego(String titulo, int horas_estimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
		this.entregado = ENTREGADO_DEF;
		this.genero = genero;
		this.compañia = compañia;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getHoras_estimadas() {
		return horas_estimadas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setHoras_estimadas(int horas_estimadas) {
		this.horas_estimadas = horas_estimadas;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
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
	 * Compara dos series segun su nÃºmero de temporadas
	 * 
	 * @param objeto
	 * @return int (-1,0,1)
	 * 
	 *         <li>1: La Serie 1 es mayor que la Serie 2</li>
	 *         <li>0: Las Series son iguales</li>
	 *         <li>-1: La Serie 1 es menor que la Serie 2</li>
	 */
	@Override
	public int compareTo(Object a) {
		int estado = IGUAL;

		Videojuego objCompared = (Videojuego) a;
		if (this.horas_estimadas > objCompared.getHoras_estimadas()) {
			estado = MAYOR;
		} else if (this.horas_estimadas < objCompared.getHoras_estimadas()) {
			estado = MENOR;
		}

		return estado;
	}
}