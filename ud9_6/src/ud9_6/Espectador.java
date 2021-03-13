package ud9_6;

public class Espectador {

	// Atributos//
	private String nombre;
	private int edad;
	private double dinero;
	private String asiento;

	// Constructores//
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	// Metodo get y set//
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public String getAsiento() {
		return asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	// Método toString//
	public String toString() {
		return "El espectador " + nombre + " con los años " + edad + " y " + dinero + " €";
	}

	public void pagar(double precio) {
		dinero = precio;
	}

	public boolean años(int edadMinima) {
		return edad >= edadMinima;
	}

	public boolean money(double dineroEspectador) {
		return dinero >= dineroEspectador;
	}

}
