package Ejercicio5;

import java.util.ArrayList;
import java.util.Random;

class Estudiante extends Persona {
    private double calificacionActual;

    public Estudiante(String nombre, int edad, String sexo, double calificacionActual) {
        super(nombre, edad, sexo);
        this.calificacionActual = calificacionActual;
    }

    public double getCalificacionActual() {
        return calificacionActual;
    }

    public boolean faltar() {
        Random random = new Random();
        double probabilidad = random.nextDouble();

        if (probabilidad < 0.5) {
            return true; 
        }
        return false; 
    }

    public boolean estaAprobado() {
        return calificacionActual >= 5.0;
    }
    
    public String getCalificacionFormateada() {
        // Redondear la calificaciÃ³n a 3 dÃ­gitos decimales
        double calificacionRedondeada = Math.round(calificacionActual * 1000.0) / 1000.0;
        return String.format("%.2f", calificacionRedondeada);
    }
    
    public static ArrayList<Estudiante> crearEstudiantes(String[] nombresChicos, String[] nombresChicas)
    {
    	ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Random random = new Random();

		for (int i = 0; i < 20; i++) {
			String nombre;
			int edad = 18 + random.nextInt(7);
			String sexo = random.nextBoolean() ? "Hombre" : "Mujer";
			double calificacion = random.nextDouble() * 10;

			if (sexo.equals("Hombre")) {
				nombre = nombresChicos[random.nextInt(nombresChicos.length)];
			} else {
				nombre = nombresChicas[random.nextInt(nombresChicas.length)];
			}

			Estudiante estudiante = new Estudiante(nombre, edad, sexo, calificacion);

			estudiantes.add(estudiante);
		}
		
		return estudiantes;
    }

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