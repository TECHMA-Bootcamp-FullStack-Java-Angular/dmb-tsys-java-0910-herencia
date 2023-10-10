package Ejercicio3;

public class App {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro(123456789, "El dios del git", "Jordi Mallafre", 200);
		Libro libro2 = new Libro(123456789, "El papuchi de clase", "David Maza", 345);
		
		System.out.println("Libro 1 conocido como: "+libro1+"\n");
		System.out.println("Libro 2 conocido como: "+libro2+"\n");
			
		libro1.libroConMasPaguinas(libro2);
		
	}

}
