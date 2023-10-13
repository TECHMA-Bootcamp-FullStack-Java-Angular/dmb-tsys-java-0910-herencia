package Ejercicio3;

/**
 * Clase Libro que reperesenta un libro seg�n ejerccio
 * <ul>
 * <li>int isbn;
 * <li>String titulo;
 * <li>String autor;
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

	public int getIsbn() {
		return isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getNum_paginas() {
		return num_paginas;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNum_paginas(int num_paginas) {
		this.num_paginas = num_paginas;
	}

	@Override
	public String toString() {
		return this.titulo + ", con el ISBN (" + this.isbn + ") creado por el autor " + this.autor + " contiene "
				+ this.num_paginas + " paginas.";
	}

	/**
	 * Compara el número de páginas de el objeto Libro pasado por parametro con el
	 * actual y en función del resultado muestra un mensaje por consola
	 * 
	 * @param Libro
	 */
	public void libroConMasPaguinas(Libro libro) {

		if (this.num_paginas < libro.getNum_paginas()) {
			System.out.println("El libro con mas paginas es --> "+libro);
		} else if (this.num_paginas > libro.getNum_paginas()) {
			System.out.println("El libro con mas paginas es --> "+ this.toString());
		} else {
			System.out.println("Ambos libros tiene el mismo numero de paginas \n");
			System.out.println(this.toString());
			System.out.println();
			System.out.println(libro);
		}
	}
}
