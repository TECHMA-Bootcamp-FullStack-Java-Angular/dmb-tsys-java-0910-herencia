package Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

	/**
	 * Agrega el objeto estudiante pasado por parametro al arrayList de estudiantes
	 * 
	 * @param estudiante
	 */

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

	/**
	 * A traves de dos bucles se generan varias aulas y se les asigna un profesor y
	 * estudiantes siempre que cumplan las condiciones
	 * 
	 * @param materias
	 * @param estudiantes
	 * @param profesores
	 * @return ArrayList<Aula>
	 */

	public static ArrayList<Aula> crearAulas(String[] materias, ArrayList<Estudiante> estudiantes,
			ArrayList<Profesor> profesores) {
		Random random = new Random();
		ArrayList<Aula> aulas = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			Aula aula = new Aula(i + 1, 20, materias[i]);

			// Crear 10 estudiantes para cada aula
			for (int j = 0; j < 10; j++) {
				Estudiante estudiante = estudiantes.remove(0);

				if (random.nextBoolean()) {
					estudiante.faltar();
				}
				aula.agregarEstudiante(estudiante);
			}
			
			// Asignar un profesor a esta aula si hay profesores disponibles para la materia
			try {
				Profesor profesor = Profesor.obtenerProfesorDisponible(profesores, materias[i]);
				aula.asignarProfessor(profesor);
			} catch (Exception e) {
				System.out.println("\nNo tenemos profesores diponible para " + materias[i]+"\n");
			}
			
	      aulas.add(aula);
		}
		return aulas;
	}

	/**
	 * Muestra por consola toda la informaciónn de las aulas creadas
	 * 
	 * @param aulas
	 */

	public static void mostrarAulas(ArrayList<Aula> aulas) {
		for (Aula aula : aulas) {
			System.out.println("----- AULA " + aula.getIdentificador() + " -----");
			if (aula.puedeDarseClase()) {
				System.out.println("Se puede dar clase en esta aula.");
				System.out.println("Materia: " + aula.getMateriaDestinada());
				System.out.println(
						"Profesor: " + (aula.getProfesor() != null ? aula.getProfesor().getNombre() : "Ninguno"));
				System.out.println("---------------------------------------");
				System.out.println("Estudiantes que asistieron:");
				System.out.println("---------------------------------------");

				for (Estudiante estudiante : aula.getEstudiantes()) {
					System.out.println("Nombre: " + estudiante.getNombre());
					System.out.println("Calificacion: " + estudiante.getCalificacionFormateada());
					System.out.println("Hace Novillos: " + (estudiante.faltar() ? "SI" : "No"));
					System.out.println("----------------------------------------");
				}

				int aprobadosHombres = aula.contarAprobados("Hombre");
				int aprobadosMujeres = aula.contarAprobados("Mujer");

				System.out.println("Aprobados (Hombres): " + aprobadosHombres);
				System.out.println("Aprobados (Mujeres): " + aprobadosMujeres);

				System.out.println();
			} else {
				System.out.println("No se puede dar clase de " + aula.materiaDestinada+  " en esta aula.");
			}
		}
	}
}
