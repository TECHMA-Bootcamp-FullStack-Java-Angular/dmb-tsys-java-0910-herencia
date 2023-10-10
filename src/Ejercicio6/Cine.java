package Ejercicio6;

/**
 * Clase Pelicula que reperesenta un pelicula según ejerccio
 *
 * <li>private Butaca butacas[][];
 * <li>private double precio;
 * <li> private Pelicula pelicula;
 *
 * @author David Maza
 */
public class Cine {
	
    private Butaca butacas[][];
    private double precio;
    private Pelicula pelicula;
 

    public Cine(int filas, int columnas, double precio, Pelicula pelicula) {
 
        butacas = new Butaca[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
        createButacas();
    }

    public Butaca[][] getButacas() {
        return butacas;
    }
 
    public void setButacas(Butaca[][] butacas) {
        this.butacas = butacas;
    }
 
    public double getPrecio() {
        return precio;
    }
 
    public void setPrecio(double precio) {
        this.precio = precio;
    }
 
    public Pelicula getPelicula() {
        return pelicula;
    }
 
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
 
    /**
     * Crea los asientos de la sala 
     */
    private void createButacas() {
 
        int fila = butacas.length; 
        
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[0].length; j++) {
            	butacas[i][j] = new Butaca((char) (65 + j), fila);// valor ASCII de la letra 'A' es 65 
            }
            fila--; 
        }
    }
 

    /**
     * Indico si en una posicion concreta esta ocupada
     *
     * @param fila
     * @param letra
     * @return boolean
     */
    public boolean estaLibre(int fila, char letra) {
        return getButaca(fila, letra).ocupado();
    }
 
    /**
     * Chequeamos espectador cumple lo necesario para entrar: dinero y edad 
     *
     * @param Espectador 
     * @return  boolean
     */
    public boolean puedeEntrar(Espectador espectador) {
        return espectador.tieneDinero(precio) && espectador.tieneEdad(pelicula.getEdadMinima());
    }
 
    /**
     * Sienta al espectador en un asiento
     *
     * @param fila
     * @param letra
     * @param espectador
     */
    public void sentar(int fila, char letra, Espectador espectador) {
        getButaca(fila, letra).setEspectador(espectador);
    }
 
    /**
     * Devolvemos un asiento concreto por su fila y letra
     *
     * @param fila
     * @param letra
     * @return butacas
     */
    public Butaca getButaca(int fila, char letra) {
        return butacas[butacas.length - fila - 1][letra - 65];
    }
 
    /**
     * Para obtener el numero de filas de sala
     *
     * @return 
     */
    public int getFilas() {
        return butacas.length;
    }
 
    /**
     * Para obtener el numero columas de la sala
     *
     * @return 
     */
    public int getColumnas() {
        return butacas[0].length;
    }
 
    /**
     * Muestra toda la información de nuestra sala
     */
    public void showPrint() {
        
    	//Muesta info Película
    	hr();
        System.out.println(pelicula);
        System.out.println("Precio entrada: " + precio +".€");
        hr();
   
      //Muesta info de cada butaca
        System.out.println("\t\t\tBUTACAS\n");
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[0].length; j++) {
                System.out.println(butacas[i][j]);               		
            }
            hr();
        }
    }
    
    public static void hr(){
    	System.out.println("\033[36m" + "----------------------------------------------------------" + "\u001B[0m");
    }
}