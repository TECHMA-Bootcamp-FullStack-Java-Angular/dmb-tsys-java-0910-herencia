package Ejercicio5;

import java.util.Random;

class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, int edad, String sexo, String materia) {
        super(nombre, edad, sexo);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public boolean faltar() {
        Random random = new Random();
        double probabilidad = random.nextDouble();

        if (probabilidad < 0.2) {
            return true; 
        }
        return false; 
    }

}
