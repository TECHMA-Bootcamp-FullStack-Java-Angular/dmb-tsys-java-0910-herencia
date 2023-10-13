package Ejercicio4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		menu();
	}

	/**
	 * Crea un bucle el cual llama al metodo mostrarMenu() y a traves de un switch
	 * compara el texto introducido por consola
	 */
	public static void menu() {
		String opcion = "";
		boolean condition = true;
		Scanner sc = new Scanner(System.in);

		do {
			separador();
			mostrarMenu();
			System.out.println();
			System.out.println("Escoje una de las opciones");
			opcion = sc.nextLine();
			switch (opcion) {
			case "1":
				completarEcuacion(sc);
				break;
			case "2":
				ejemplosFunciones();
				break;
			case "3":
				condition = !condition;
				separador();
				System.out.println("Adios, que tengas un buen dia");
				separador();
				break;
			default:
				separador();
				System.out.println("Opcion no valida");
				break;
			}
		} while (condition);
	}

	/**
	 * Imprime por consola diferentes textos
	 */
	public static void mostrarMenu() {
		System.out.println("1) Escribe los valores con los que calcular la ecuacion");
		System.out.println("2) Mostrar ejemplos de ecuaciones");
		System.out.println("3) Salir");
	}

	/**
	 * Llama a al metodo comprobacionEntradaTextoEsNumero() para verificar que los
	 * datos proporcionados por el usuario son numeros, crea el objeto Raices y
	 * llama al metodo calcular()
	 * 
	 * @param sc
	 */
	public static void completarEcuacion(Scanner sc) {
		double a = 0;
		double b = 0;
		double c = 0;

		separador();
		a = comprobacionEntradaTextoEsNumero("Escribe el primer valor", sc);
		System.out.println();
		b = comprobacionEntradaTextoEsNumero("Escribe el segundo valor", sc);
		System.out.println();
		c = comprobacionEntradaTextoEsNumero("Escribe el tercer valor", sc);

		Raices raiz = new Raices(a, b, c);
		separador();
		calcular(raiz);

	}

	/**
	 * Comprueba si la informaci�n transmitida por el usuario es un n�mero, en
	 * caso afirmativo lo devuelve.
	 * 
	 * @param texto
	 * @param sc
	 * @return double
	 */
	public static double comprobacionEntradaTextoEsNumero(String texto, Scanner sc) {
		double num = 0;
		String entrada_Texto = "";
		boolean condition = false;

		while (!condition) {
			System.out.println(texto);
			entrada_Texto = sc.nextLine();
			try {
				num = Double.parseDouble(entrada_Texto);
				condition = !condition;
			} catch (Exception e) {
				System.out.println();
				System.out.println("Has de escribir un n�mero");
			}
		}

		return num;
	}

	/**
	 * Passando un objeto Raices compara si tiene una, dos o ninguna solucion y lo
	 * muestra por consola, junto a las posibles soluciones si las tubiera.
	 * 
	 * @param raiz
	 */
	public static void calcular(Raices raiz) {

		System.out.println("Dado los siguientes valores: " + raiz);
		if (raiz.tieneRaiz()) {
			raiz.obtenerRaiz();
		} else if (raiz.tieneRaices()) {
			raiz.obtenerRaices();
		} else {
			System.out.println("La ecuacion de 2 grado no tiene solucion");
		}
	}

	/**
	 * Muestra por consola las tres posibles opciones de ecuaciones de 2 grado
	 */
	public static void ejemplosFunciones() {

		Raices raiz_dos_soluciones = new Raices(2, 10, 3);
		Raices raiz_una_solucion = new Raices(1, 6, 9);
		Raices raiz_sin_soluciones = new Raices(1, 2, 5);

		separador();
		System.out.println("Este es un ejemplo de ecuacion de segundo grado con dos soluciones");
		System.out.println();
		calcular(raiz_dos_soluciones);

		separador();
		System.out.println("Este es un ejemplo de ecuacion de segundo grado con una solucion");
		System.out.println();
		calcular(raiz_una_solucion);

		separador();
		System.out.println("Este es un ejemplo de ecuacion de segundo grado sin solucion");
		System.out.println();
		calcular(raiz_sin_soluciones);
	}

	/**
	 * Muestra por consola dos lineas en blanco y una con guiones
	 */
	public static void separador() {
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
	}

}
