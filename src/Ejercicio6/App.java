package Ejercicio6;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Pelicula pelicula = new Pelicula(pelisList[randomRange(0, pelisList.length - 1)], randomRange(90, 240), 
				randomRange(12, 18),
				"D. Jose Marín");

		System.out.println("\n**************** " + orange("CINES BOOTCAMP TEAM 4") + " *******************\n");

		int filas = askValueNumeric("Cantidad de filas que tendrá la Sala: ");

		int columnas = askValueNumeric("Cantidad de columnas que tendrá la Sala: ");

		double precio = askPrice("Precio de la entrada al cine: ");

		// Intancioamos un cine con los datos obtenidos
		Cine cine = new Cine(filas, columnas, precio, pelicula);

		int numEspectadores = askValueNumeric("Cantidad de espectadores que se de generar: ");

		sc.close();

		Espectador espectador;
		int fila = 0;
		char letra = 0;
		int asientosDisponibles = filas * columnas;

		Cine.hr();
		System.out.println("\t\tESPECTADORES\n");

		// Termina cuando no queden espectadores o no haya mas sitio disponibles
		for (int i = 0; i < numEspectadores && i < asientosDisponibles; i++) {

			// Generamos un espectador con dados Ramdom
			espectador = new Espectador(espectadoresList[randomRange(0, espectadoresList.length - 1)],
					randomRange(10, 40), 
					randomRange(5, 10)); 

			System.out.println(espectador); // Mostramos la informacion del espectador

			do { // Bucamos un asiento libre

				fila = randomRange(0, cine.getFilas() - 1);
				letra = (char) randomRange('A', 'A' + (cine.getColumnas() - 1));

			} while (cine.estaLibre(fila, letra));

			// Si el espectador cumple con las condiciones lo sentamos
			if (cine.puedeEntrar(espectador)) {
				espectador.pay(cine.getPrecio());
				cine.sentar(fila, letra, espectador);
				--asientosDisponibles;
			}

		}

		cine.showPrint(); // Mostramos la información de sala
	}

	static Scanner sc = new Scanner(System.in);

	// Mock datos pelis
	private static final String pelisList[] = { "BootCamp Killer", "La pesadilla del Codigo Maldito",
			"El código Contrataca", "Que paso? si esto antes compilaba" };

	// Mock datos espectadores
	private static final String espectadoresList[] = { "Asier", "Carla", "Jordi", "Toni", "Manel", "Feli", "Ivan", "Jan",
			"Oriol", "Adri", "Sergi", "Robert", "Marc", "Juanka", "Alejandro" };

	private static int randomRange(int minimo, int maximo) {
		int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
		return num;
	}

	private static Integer askValueNumeric(String txt) {
		Integer res = 0;

		while (res <= 0) {

			System.out.print(txt);
			String resString = sc.next();

			try {
				res = Integer.valueOf(resString);
			} catch (NumberFormatException nfe) {
				System.err.println("Debes introducir un número valido");
			}
		}
		return res;
	}

	private static Double askPrice(String txt) {
		Double res = 0D;

		while (res <= 0) {

			System.out.print(txt);
			String resString = sc.next();

			try {
				res = Double.valueOf(resString);
			} catch (NumberFormatException nfe) {
				System.err.println("Debes introducir un precio válido");
			}
		}
		return res;
	}

	private static String orange(String text) {
		return "\033[33m" + text + "\u001B[0m";
	}
}
