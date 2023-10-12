package Ejercicio5;

import java.util.Random;

public class Profesor extends Persona {

	public Profesor(String nombre, int edad, String sexo, int calificacion) {
		super(nombre, edad, sexo);
		asistencia = asistirAula();
		
	}
	// Settea la ssitencia 
	public boolean asistirAula() {
		return asistencia = (generarAsistancia() <20)? false:true;
	}

	// Pone nota al Alumno
	public void ponerNotaAluno(Alumno alumno,int nota) {
		alumno.setNota(nota);

	}
	
	//Genera un porcentaje de asistencia aleatorio del 0 al 100
	private static int generarAsistancia() {
		Random random = new Random();
		return random.nextInt(101);
	}
	
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", asistencia=" + asistencia + "]";
	}
	
	

}
