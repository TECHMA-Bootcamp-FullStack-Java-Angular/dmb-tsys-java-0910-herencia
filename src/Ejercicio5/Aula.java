package Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    public void asignarProfessor(Profesor profesor) {
        if (profesor != null && profesor.getMateria().equals(materiaDestinada)) {
            this.profesor = profesor;
        }
    }

    public boolean puedeDarseClase() {
        if (profesor != null && !estudiantes.isEmpty()) {
            return true;
        }
        return false;
    }


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
    
    public static ArrayList<Aula> crearAulas(String[] materias, ArrayList<Estudiante> estudiantes, ArrayList<Profesor> profesores)
    {
        Random random = new Random();
		ArrayList<Aula> aulas = new ArrayList<>();
    	for (int i = 0; i < 2; i++) 
    	{
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
			Profesor profesor = Profesor.obtenerProfesorDisponible(profesores, materias[i]);
			aula.asignarProfessor(profesor);
	
			aulas.add(aula);
		}
    	return aulas;
    }
    
    public static void mostrarAulas(ArrayList<Aula> aulas)
    {
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
    				System.out.println("Calificación: " + estudiante.getCalificacionFormateada());
    				System.out.println("Hace Novillos: " + (estudiante.faltar() ? "Sí" : "No"));
    				System.out.println("----------------------------------------");
    			}

    			int aprobadosHombres = aula.contarAprobados("Hombre");
    			int aprobadosMujeres = aula.contarAprobados("Mujer");

    			System.out.println("Aprobados (Hombres): " + aprobadosHombres);
    			System.out.println("Aprobados (Mujeres): " + aprobadosMujeres);

    			System.out.println();
    		} else {
    			System.out.println("No se puede dar clase en esta aula.");
    		}
    	}
    }

}