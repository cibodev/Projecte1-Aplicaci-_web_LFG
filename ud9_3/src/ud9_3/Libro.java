package ud9_3;

public class Libro {

	// Atributos//
	private int ISBN;
	private String titulo;
	private String autor;
	private int numPaginas;

	// Get y set//
	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String toString() {
		return "El libro " + titulo + " con el ISBN " + ISBN + " creado por " + autor + "tiene " + numPaginas
				+ "de páginas";
	}

	public Libro(int pISBN, String ptitulo, String pautor, int pnumPaginas) {
		ISBN = pISBN;
		titulo = ptitulo;
		autor = pautor;
		numPaginas = pnumPaginas;
	}

}
