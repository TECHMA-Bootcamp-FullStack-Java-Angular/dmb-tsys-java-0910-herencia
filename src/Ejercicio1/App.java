package Ejercicio1;

public class App {
	
	public static void main(String[] args) {

		// Array de Electrodomestico con 10 posiciones
		Electrodomestico electrodomesticos[] = new Electrodomestico[10];

		// Rellenamos las posciones del array
		electrodomesticos[0] = new Lavadora();
		electrodomesticos[1] = new Television();
		electrodomesticos[2] = new Lavadora();
		electrodomesticos[3] = new Television();
		electrodomesticos[4] = new Lavadora();
		electrodomesticos[5] = new Television();
		electrodomesticos[6] = new Lavadora();
		electrodomesticos[7] = new Television();
		electrodomesticos[8] = new Lavadora();
		electrodomesticos[9] = new Television();

		// Variable para calcular el precio total de lavadoras y televisores
		double precioFinalLavadora = 0;
		double precioFinalTV = 0;

		// Recorremos el arrary electrodomesticos y comprobamos si encuentra objetos
		// lavadoras y televisores
		for (Electrodomestico elec : electrodomesticos) {

			// Con instanceof podemos controlar, si es un objeto lavadora o televisor
			if (elec instanceof Lavadora) {
				precioFinalLavadora += elec.getPrecioBase();
			} else
				precioFinalTV += elec.getPrecioBase();

		}
		// Precio total de lavadoras y televisores
		double precioTotal = precioFinalLavadora + precioFinalTV;
		
		System.out.println("\n-------- Resumen de los porductos ---------------\n");
		
		System.out.println("Precio total Lavadoras: " + precioFinalLavadora);
		System.out.println("Precio total Televisores: " + precioFinalTV);
		System.out.println("Precio total: " + precioTotal);

		
	}
		
		
}
