package Ejercicio3;

/**
 * Clase Libro que reperesenta un libro según ejerccio
 * <ul>
 * <li>int isbn;
 * <li>String titulo;
 * <li>String autor;
 * <li>String diterctor
 * <li>int num_paginas;
 * 
 *
 * @author Jordi Mallfre & David Maza
 */
public class Libro {
	
	private int isbn;
	private String titulo;
	private String autor;
	private int num_paginas;
	
	public Libro(int isbn, String titulo, String autor, int num_paginas) {

		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.num_paginas = num_paginas;
	}

	
	// TODO Getters and Settes
	// TODO toStrig()
	// TODO libroConMasPaguinas()
}
