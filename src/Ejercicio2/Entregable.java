package Ejercicio2;

/**
 * Interfaz Entregable
 * @author Jordi Mallafre
 */
public interface Entregable {
	
	//Cambia el contenido de la variable entregado a true	
	public void entregar();

	//Cambia el contenido de la variable entregado a false
	public void devolver();

	//devuelve el contenido de la variable entregado 
	public boolean isEntregado();

	/**
	 * Parsea el Objeto a a la clase pertinente.
	 * Compara la variable horas_estimadas o temporadas en función de la clase con la del objeto pasado por parametro
	 * Devuelve 0 si son iguales
	 * devuelve 1 si la variable del objeto pasado por parametro es mas pequeño
	 * devuelve -1 si la variable del objeto pasado por parametro es mas grande
	 * @param a
	 * @return int
	 */
	public int compareTo(Object a);
}