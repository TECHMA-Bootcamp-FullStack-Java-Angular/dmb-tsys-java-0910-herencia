package Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Profesor extends Persona {
    private String materia;
    private final Random RANDOM = new Random();

    public Profesor(String nombre, int edad, String sexo, String materia) {
        super(nombre, edad, sexo);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public boolean faltar() {
        double probabilidad = RANDOM.nextDouble();

        if (probabilidad < 0.2) {
            return true; 
        }
        return false; 
    }
    
    public static ArrayList<Profesor> crearProfesores(String[] materias)
    {
    	ArrayList<Profesor> profesores = new ArrayList<>();
        Random random = new Random();

        for (String materia : materias) {
			String nombre = "Profesor " + materia;
			int edad = 30 + random.nextInt(31); // Entre 30 y 60 años
			String sexo = random.nextBoolean() ? "Hombre" : "Mujer";
			Profesor profesor = new Profesor(nombre, edad, sexo, materia);

			if (profesor.faltar()) {
				System.out.println(profesor.getNombre() + " no está disponible.");
			} else {
				profesores.add(profesor);
			}
		}
		
		return profesores;
    }
    
    public static Profesor obtenerProfesorDisponible(List<Profesor> profesores, String materia) 
    {
		for (Profesor profesor : profesores) {
			if (profesor.getMateria().equals(materia)) {
				profesores.remove(profesor);
				return profesor;
			}
		}
		return null;
	}
}
