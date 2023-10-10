package Ejercicio1;


/**
 * Clase Television que reperesenta una television según el ejerccio
 * <li> private double pulgadas
 * <li> private boolean sintonizador
 * 
 * @author Jordi Mallafre
 */
public class Television extends Electrodomestico {
	private double pulgadas;
	private boolean sintonizador;

	private final double PULGADAS_DEF = 20;
	private final boolean SINTONIZADOR_DEF = false;

	public Television() {
		super();
		this.pulgadas = this.PULGADAS_DEF;
		this.sintonizador = this.SINTONIZADOR_DEF;
	}

	/**
	 * @param precio
	 * @param peso
	 */
	public Television(double precio, int peso) {
		super(precio, peso);
		this.pulgadas = this.PULGADAS_DEF;
		this.sintonizador = this.SINTONIZADOR_DEF;
	}

	/**
	 * @param precio
	 * @param color
	 * @param consumo
	 * @param peso
	 * @param pulgadas
	 * @param sintonizador
	 */
	public Television(double precio, String color, char consumo, int peso, double pulgadas, boolean sintonizador) {
		super(precio, color, consumo, peso);
		this.pulgadas = pulgadas;
		this.sintonizador = sintonizador;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}

	public void precioFinal() {

		if (this.pulgadas > 40) {
			this.precioBase += (this.precioBase * 0.3);
		}

		if (this.sintonizador) {
			this.precioBase += 50;
		}
		
	}

}
