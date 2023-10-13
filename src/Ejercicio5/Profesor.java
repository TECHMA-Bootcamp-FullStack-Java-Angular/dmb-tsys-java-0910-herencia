package Ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Clase repersenta a un profesor
 * 
 * <li>private String materia
 * 
 * @author David Maza
 */
class Profesor extends Persona {
	
    private String materia;
    private static Random random = new Random();

    public Profesor(String nombre, int edad, String sexo, String materia) {
        super(nombre, edad, sexo);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }
    
    /**
     * Devuelve si el profesor está ausente o no.
     *
     * @return `true` si el profesor está ausente, `false` si está disponible
     */
    public boolean faltar() {
    	return random.nextDouble()< 0.2 ? true : false;
    }
    
    /**
     * Crea una lista de profesores con un número aleatorio de profesores por materia.
     *
     * @param materias las materias para las que se crearán profesores
     * @return una lista de profesores
     */
    public static ArrayList<Profesor> crearProfesores(String[] materias)
    {
        ArrayList<Profesor> profesores = new ArrayList<>();
        
        Arrays.stream(materias).forEach(e -> {
        	
        	Profesor profesor = new Profesor("Profesor " + e, random.nextInt(31),random.nextBoolean() ? "Hombre" : "Mujer",e);
        	profesores.add(profesor.faltar() ? null : profesor);
        	
        });

        return profesores;
    }

    /**
     * Obtiene el primer profesor disponible para la materia especificada.
     *
     * @param profesores la lista de profesores
     * @param materia la materia para la que se busca un profesor disponible
     * @return el primer profesor disponible para la materia especificada, o `null` si no se encuentra ningún profesor disponible
     */
    public static Profesor obtenerProfesorDisponible(List<Profesor> profesores, String materia) {
    	  return profesores.stream()
    	    .filter(profesor -> profesor.getMateria().equals(materia))
    	    .findFirst()
    	    .orElse(null);
    	}
}