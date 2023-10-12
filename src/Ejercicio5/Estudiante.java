package Ejercicio5;

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
     * Comprueba su asistenca al aula
     * @return
     */
    public boolean faltar() {
        Random random = new Random();
        double probabilidad = random.nextDouble();

        if (probabilidad < 0.5) {
            return true; 
        }
        return false; 
    }

    /**
     * Comprueba si esta aprobado
     * @return 
     */
    public boolean estaAprobado() {
        return calificacionActual >= 5.0;
    }

    
    public String getCalificacionFormateada() {
        return String.format("%.2f", Math.round(calificacionActual * 1000.0) / 1000.0);
    }
}