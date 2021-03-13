package ud9_6;

public class Cine {

	// Atributos//
	private String pelicula;
	private double precioEntrada;
	private int asiento;

	// Constructor//
	public Cine(String pelicula, double precioEntrada, int i, String string, int j) {
		super();
		this.pelicula = pelicula;
		this.precioEntrada = precioEntrada;
	}

	// Métodos get y set//

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}

	// Mostrar por pantalla //
	public void mostrar() {
		System.out.println("Pelicula reproducida: " + pelicula);
		System.out.println("Precio de la entrada: " + precioEntrada);
	}
}
