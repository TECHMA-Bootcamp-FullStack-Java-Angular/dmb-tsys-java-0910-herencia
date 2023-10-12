package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase cre representa un Aula
 * <li>int identificador
 * <li>String materiaDestinada
 * <li>List<Estudiante> estudiantes
 * <li>Profesor profesor
 * 
 * @author Jordi Mallafre
 */
class Aula {
	private int identificador;
	private String materiaDestinada;
	private List<Estudiante> estudiantes;
	private Profesor profesor;

	public Aula(int identificador, int capacidadMaxima, String materiaDestinada) {
		this.identificador = identificador;
		this.materiaDestinada = materiaDestinada;
		this.estudiantes = new ArrayList<>();
		this.profesor = null;
	}

	public String getMateriaDestinada() {
		return materiaDestinada;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void agregarEstudiante(Estudiante estudiante) {
		estudiantes.add(estudiante);
	}

	/**
	 * Asigne un profesor al aula siempre que el profesor no sea nulo o que la
	 * materia sea igual al valor de materiaDestinada
	 * 
	 * @param profesor
	 */
	public void asignarProfessor(Profesor profesor) {
		if (profesor != null && profesor.getMateria().equals(materiaDestinada)) {
			this.profesor = profesor;
		}
	}

	/**
	 * Devuelve un true si el valor de profesor no sea nulo y lista de estudiantes
	 * no este vacia
	 * 
	 * @return boolean
	 */
	public boolean puedeDarseClase() {
		if (profesor != null && !estudiantes.isEmpty()) {
			return true;
		}
		return false;
	}

	/**
	 * Devuelve el total de estudiantes que sean del mismo sexo que el pasado por
	 * parametro y que esten aprobados
	 * 
	 * @param sexo
	 * @return int
	 */
	public int contarAprobados(String sexo) {
		int count = 0;
		for (Estudiante estudiante : estudiantes) {
			if (estudiante.getSexo().equals(sexo) && estudiante.estaAprobado()) {
				count++;
			}
		}
		return count;
	}

	public int getIdentificador() {
		return identificador;
	}
}
