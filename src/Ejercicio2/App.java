package Ejercicio2;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		Videojuego[] array_videojuegos = new Videojuego[5];
		array_videojuegos[0] = new Videojuego();
		array_videojuegos[1] = new Videojuego("Final Fantasy", 40);
		array_videojuegos[2] = new Videojuego("pokemon", 32);
		array_videojuegos[3] = new Videojuego("Marvel's Spider-Man 2", 40, "Accion", "Insomniac");
		array_videojuegos[4] = new Videojuego("EA Sport 24", 55, "Deporte", "Electronic Art");

		Serie[] array_series = new Serie[5];
		array_series[0] = new Serie();
		array_series[1] = new Serie("ahsoka", 1);
		array_series[2] = new Serie("stranger things", 4);
		array_series[3] = new Serie("pokemon", "Ciencia Ficción", "Satoshi Tajiri", 15);
		array_series[4] = new Serie("One Piece", "Aventura", "Eiichiro� Oda", 20);

		entregarVideojuegos(array_videojuegos);
		entregarSeries(array_series);
		separador();
		contarEntregadosVideojuegos(array_videojuegos);
		separador();
		contarEntregadosSeries(array_series);
		separador();
		masHoras(array_videojuegos);
		separador();
		masTemporadas(array_series);

	}

	/**
	 * Recorre el array de videojuegos y si cumplen la condición de estar entregados
	 * los muestra por consola y va incrementando la variable count para mostrar por
	 * consola el total de articulos entregados
	 * 
	 * @param array
	 */
	public static void contarEntregadosVideojuegos(Videojuego[] array) {
		int count = 0;
		System.out.println("Los juegos entregados son: \n");
		for (int i = 0; i < array.length; i++) {
			if (array[i].isEntregado()) {
				System.out.println(array[i]);
				count++;
			}
		}
		System.out.println();
		System.out.println("Hay un total de " + count + " videojuegos entregados");
	}

	/**
	 * Recorre el array de series y si cumplen la condición de estar entregados los
	 * muestra por consola y va incrementando la variable count para mostrar por
	 * consola el total de articulos entregados
	 * 
	 * @param array
	 */
	public static void contarEntregadosSeries(Serie[] array) {
		int count = 0;
		System.out.println("Las Series entregadas son: \n");
		for (int i = 0; i < array.length; i++) {
			if (array[i].isEntregado()) {
				System.out.println(array[i]);
				count++;
			}
		}

		System.out.println();
		System.out.println("Hay un total de " + count + " series entregadas");
	}

	/**
	 * Recorre el array de videojuegos y en funcion de el resultado de la función de
	 * la classe compareTo() guarda el o los objetos Videojuegos con mas horas
	 * estimadas
	 * 
	 * @param array_videojuegos
	 */
	public static void masHoras(Videojuego[] array_videojuegos) {
		int resultado = 0;
		ArrayList<Videojuego> array_tempo = new ArrayList<Videojuego>();
		array_tempo.add(array_videojuegos[0]);

		for (int i = 1; i < array_videojuegos.length; i++) {
			resultado = array_tempo.get(0).compareTo(array_videojuegos[i]);
			if (resultado == -1) {
				array_tempo.clear();
				array_tempo.add(array_videojuegos[i]);
			} else if (resultado == 0) {
				array_tempo.add(array_videojuegos[i]);
			}
		}

		mostrarMasHoras(array_tempo);

	}

	/**
	 * En funcón del total de elementos en el ArrayList muestra un mensaje por
	 * consola y recorre el array para mostrarlos por consola
	 * 
	 * @param a
	 */
	public static void mostrarMasHoras(ArrayList<Videojuego> a) {
		if (a.size() > 1) {
			System.out.println("Los videojuegos con mas horas estimadas son: \n");
		} else {
			System.out.println("El videojuego con mas horas estimadas es: \n");
		}
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}

	/**
	 * Recorre el array de series y en funcion de el resultado de la funciÃ³n de la
	 * classe compareTo() guardara la posición para mostrar por consola la serie con
	 * mas temporadas
	 * 
	 * @param array_videojuegos
	 */
	public static void masTemporadas(Serie[] array_series) {
		int resultado = 0;
		ArrayList<Serie> array_tempo = new ArrayList<Serie>();
		array_tempo.add(array_series[0]);

		for (int i = 1; i < array_series.length; i++) {
			resultado = array_tempo.get(0).compareTo(array_series[i]);
			if (resultado == -1) {
				array_tempo.clear();
				array_tempo.add(array_series[i]);
			} else if (resultado == 0) {
				array_tempo.add(array_series[i]);
			}
		}

		mostrarMasTemporadas(array_tempo);
	}

	/**
	 * En funcón del total de elementos en el ArrayList muestra un mensaje por
	 * consola y recorre el array para mostrarlos por consola
	 * 
	 * @param a
	 */
	public static void mostrarMasTemporadas(ArrayList<Serie> a) {
		if (a.size() > 1) {
			System.out.println("Las series con mas temporadas son: \n");
		} else {
			System.out.println("La serie con mas temporadas es: \n");
		}
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}

	/**
	 * Recorre el array de videojuegos y en funcion del resultado del random
	 * modifica si el videojuego esta entregado
	 * 
	 * @param array_videojuegos
	 */
	public static void entregarVideojuegos(Videojuego[] array_videojuegos) {
		for (int i = 0; i < array_videojuegos.length; i++) {
			if (Math.round(Math.random()) < 1) {
				if (!array_videojuegos[i].isEntregado()) {
					array_videojuegos[i].entregar();
				}
			}
		}
	}

	/**
	 * Recorre el array de series y en funcion del resultado del random modifica si
	 * la serie esta entregada
	 * 
	 * @param array_videojuegos
	 */
	public static void entregarSeries(Serie[] array_series) {
		for (int i = 0; i < array_series.length; i++) {
			if (Math.round(Math.random()) < 1) {
				if (!array_series[i].isEntregado()) {
					array_series[i].entregar();
				}
			}
		}
	}

	/**
	 * Muestra por consola dos lineas en blanco y una con guiones
	 */
	public static void separador() {
		System.out.println("\n ------------------------------ \n");
	}

}
