package Ejercicio1;

/**
 * Subclase Lavadora que pertenece a la clase padre Eletrodomestico
 * 
 * @author Robert López
 */
public class Lavadora extends Electrodomestico {
	private int carga;
	private static final int CARGA_POR_DEFECTO = 5;

	public Lavadora() {
		super();
		this.carga = CARGA_POR_DEFECTO;
	}

	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = CARGA_POR_DEFECTO;
	}

	public Lavadora(int carga, int precioBase, String color, char consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}
	
	/**
	 * Metodo que calcula si la carga es mayor de 30kg
	 * 
	 */
	public double precioFinal(int carga, double precio) {
		if (carga > 30) {
			precio += 50;
		}

		return precio;
	}

}
