package Ejercicio5;

public abstract class Persona {
	
	protected String nombre;
	protected int edad;
	protected String sexo;
	protected boolean asistencia;
	
	public Persona(String nombre, int edad, String sexo) {

		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.asistencia = asistirAula();
	}

	public abstract boolean asistirAula();

	
}
