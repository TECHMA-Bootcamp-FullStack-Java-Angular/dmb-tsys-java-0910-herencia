package Ejercicio5;

import java.util.ArrayList;
import java.util.Collections;

public class App {
	public static void main(String[] args) {

		ArrayList<Estudiante> estudiantes = new ArrayList<>();
		ArrayList<Profesor> profesores = new ArrayList<>();
		ArrayList<Aula> aulas = new ArrayList<>();

		String[] nombresChicos = { "Juan", "Carlos", "Pedro", "Luis", "Andres", "Sergio", "Miguel", "Pablo", "Antonio",
				"Javier" };
		String[] nombresChicas = { "Maria", "Laura", "Ana", "Sofia", "Lucia", "Isabel", "Carmen", "Elena", "Raquel",
				"Patricia" };

		String[] materias = { "Matematicas", "Filosofia", "Fisica" };
		
		estudiantes = Estudiante.crearEstudiantes(nombresChicos, nombresChicas);

		profesores = Profesor.crearProfesores(materias);

		Collections.shuffle(estudiantes);
		Collections.shuffle(profesores);

		
		aulas = Aula.crearAulas(materias, estudiantes, profesores);
		
		Aula.mostrarAulas(aulas);
		
	}
	
}
