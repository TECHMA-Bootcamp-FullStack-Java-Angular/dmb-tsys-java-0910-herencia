package Ejercicio1;

/**
 * Clase la Super clase Eletrodomestico según ejerccio
 * 
 * @author David Maza
 */
public class Electrodomestico {
	
	private final Character[] NIVELES_CONSUMO = { 'A', 'B', 'C', 'D', 'E', 'F' };
	private final String[] COLORES_DISPONIBLES = { "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" };
	
	private final Character CONSUMO_DEFAULT = 'F';
	private final String COLOR_DEFAULT = "BLANCO";
	private final int PESO_DEFAULT = 5;

	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;

	public Electrodomestico() {
		this.precioBase = calcularPrecio(100, CONSUMO_DEFAULT, PESO_DEFAULT);
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_DEFAULT;
		this.peso = PESO_DEFAULT;
	}

	public Electrodomestico(double precio, int peso) {
		this.precioBase = calcularPrecio(precio, CONSUMO_DEFAULT, peso);
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_DEFAULT;
		this.peso = peso;
	}

	public Electrodomestico(double precio, String color, char consumo, int peso) {
		this.precioBase = calcularPrecio(precio, validarConsumo(consumo), peso);
		this.color = validarColor(color);
		this.consumoEnergetico = validarConsumo(consumo);
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	// Setters
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setColor(String color) {
		this.color = validarColor(color);
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = validarConsumo(consumoEnergetico);
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * Valida el parámetro color
	 * 
	 * @param color
	 * @return String
	 */
	public String validarColor(String color) {
		color = color.toUpperCase();
		for (int i = 0; i < COLORES_DISPONIBLES.length; i++) {
			if (color.equals(COLORES_DISPONIBLES[i])) {
				return color;
			}
		}
		return COLOR_DEFAULT;
	}

	/**
	 * Valida el parámetro consumo
	 * 
	 * @param consumo
	 * @return char
	 */
	public char validarConsumo(char consumo) {
		consumo = Character.toUpperCase(consumo);
		for (int i = 0; i < NIVELES_CONSUMO.length; i++) {
			if (Character.compare(consumo, NIVELES_CONSUMO[i]) == 0) {
				return consumo;
			}
		}
		return CONSUMO_DEFAULT;
	}

	/**
	 * Metodo que calcula el precio
	 * @param preciocalc
	 * @param consumo
	 * @param peso
	 * @return double 
	 */
	public double calcularPrecio(double preciocalc, char consumo, int peso) {
		
		consumo = Character.toUpperCase(consumo);
		
		
		if (Character.compare(consumo, 'A') == 0) {
			preciocalc += 100;
		} else if (Character.compare(consumo, 'B') == 0) { 
			preciocalc += 80;
		} else if (Character.compare(consumo, 'C') == 0) {
			preciocalc += 60;
		} else if (Character.compare(consumo, 'D') == 0) {
			preciocalc += 50;
		} else if (Character.compare(consumo, 'E') == 0) {
			preciocalc += 30;
		} else if (Character.compare(consumo, 'F') == 0) {
			preciocalc += 10;
		}

		if (peso > 0 && peso < 19) {
			preciocalc += 10;
		} else if (peso > 19 && peso < 49) {
			preciocalc += 50;
		} else if (peso > 49 && peso < 79) {
			preciocalc += 80;
		} else if (peso > 79) {
			preciocalc += 100;
		}

		return preciocalc;
	}
	
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

}