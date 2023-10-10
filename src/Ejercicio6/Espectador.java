package Ejercicio6;

/**
 * Clase Pelicula que reperesenta un pelicula segÃºn ejerccio
 *
 * <li>private String nombre;
 * <li>int edad;
 * <li>double dinero;
 *
 * @author Robert Lopez
 */
public class Espectador implements IEspecatorValidable
{

	private String nombre;
	private int edad;
	private double dinero;


	public Espectador(String nombre, int edad, double dinero)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getEdad() 
	{
		return edad;
	}

	public void setEdad(int edad) 
	{
		this.edad = edad;
	}

	public double getDinero()
	{
		return dinero;
	}

	public void setDinero(double dinero) 
	{
		this.dinero = dinero;
	}

	/**
	 * Pagamos la entrada del cine y actualizamos el dienro
	 *
	 * @param precio
	 */
	@Override
	public void pay(double precio) 
	{
		dinero -= precio;
	}

	/**
	 * Indica si el espectador tiene edad para ver la pelicula
	 *
	 * @param edadMinima
	 * @return boolean
	 */
	@Override
	public boolean tieneEdad(int edadMinima) 
	{
		return edad >= edadMinima;
	}

	/**
	 * Indica si el espectador tiene diner
	 * 
	 * @param precioEntrada
	 * @return
	 */
	@Override
	public boolean tieneDinero(double precioEntrada) 
	{
		return dinero >= precioEntrada;
	}

	@Override
	public String toString() {
		return  nombre + " tiene " + edad + " años y su saldo es de " + String.format("%.2f", (dinero)) 
				+ "€";
	}
	

}


	
	
	