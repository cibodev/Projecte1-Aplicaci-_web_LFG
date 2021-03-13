package ud9_6;

public class Peliculas {

	// Atributos//
	private String titulo;
	private double duracion;
	private String director;
	private int edadMinima;

	// Constructores//
	public Peliculas(String titulo, double duracion, int edadMinima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.director = director;
		this.edadMinima = edadMinima;
	}

	// Métodos get y set//
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	// Método toString//
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + titulo + " del director " + director + "duracion de " + duracion;
	}
}
