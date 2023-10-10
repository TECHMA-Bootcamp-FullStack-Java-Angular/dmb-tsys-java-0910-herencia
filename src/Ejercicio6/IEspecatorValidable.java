package Ejercicio6;

/**
 * interface IOcuplable
 *
 * @author David Maza
 */
public interface IEspecatorValidable {

	/**
	 * Indica si el espectador tiene dinero suficiente.
	 * 
	 * @param precioEntrada
	 * @return boolean según tenga dienro para pagar la entrada o no.
	 */
	public boolean tieneDinero(double precioEntrada);

	/**
	 * Actualizamos el saldo del espactador.
	 *
	 * @param precio
	 */
	public void pay(double precioEntrada);

	/**
	 * Indica si el espectador tiene edad para ver la película.
	 *
	 * @param edadMinima de la película.
	 * @return boolean según si es mayor o menor que la edad exigida.
	 */
	public boolean tieneEdad(int edadMinima);

}
