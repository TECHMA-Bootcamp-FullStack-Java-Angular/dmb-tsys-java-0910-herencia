package Ejercicio4;

/**
 * Clase Raices  segun ejercicio 4
 * 
 * @author Robert Lopez & David Maza
 */
public class Raices {
     
    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    /**
     * Devuelve el valor del discriminante,  
     * @return double
     */
    private double getDiscriminante(){
        return Math.pow(b, 2)-(4*a*c);
    }
    
    /**
     * Si el discriminante es mayor que 0 tiene mas de una raiz
     * (No hemos puesto >= ya que puede confundirse con una solucion)
     * @return boolean
     */
    
    private boolean tieneRaices(){
        return getDiscriminante()>0;
    }
    
    /**
     * Si el discriminante es igual a cero tiene una sola raiz
     * @return boolean
     */
    private boolean tieneRaiz(){
        return getDiscriminante()==0;
    }
     
    /**
     * Metodos para obtener las raices cuando hay 2 soluciones posibles
     */
    private void obtenerRaices(){
         
        double rta1=(-b+Math.sqrt(getDiscriminante()))/(2*a);
        double rta2=(-b-Math.sqrt(getDiscriminante()))/(2*a);
         
        System.out.println("Solucion 1: "+String.format("%.2f",(rta1)));     
        System.out.println("Solucion 2: "+String.format("%.2f",(rta2)));
    }
    
    /**
     * Método para obtener una raiz cuando solo tenga una solución posible
     */
    private void obtenerRaiz(){
        
    	double rta = -b / (2 * a);
         
        System.out.println("Solucion 1: "+String.format("%.2f",(rta1)));     
    }
    
    
    
    
}