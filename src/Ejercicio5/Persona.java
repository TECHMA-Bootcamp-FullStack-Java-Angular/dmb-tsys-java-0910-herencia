package Ejercicio5;


/**
 * Clase repersenta a un Estudiante
 * 
 * <li>private String materia
 * <li>private int edad
 * <li>private String sexo
 * 
 * @author David Maza
 */
class Persona {
	
    private String nombre;
    private int edad;
    private String sexo;

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }
}