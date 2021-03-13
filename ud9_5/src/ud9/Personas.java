package ud9;

public class Personas {

	// Atributos//
	protected String nombre;
	protected char sexo;
	protected int edad;

	// Constructor //
	public Personas(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	// Constantes//
	private final char SEXO_DEF = 'H';

	// Get y set//
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void comprobarSexo() {
		if (this.sexo != 'H' && this.sexo != 'M') {

			this.sexo = SEXO_DEF;

		}
	}

	// Método ToString //
	public String toString() {

		String sexo;

		if (this.sexo == 'H') {

			sexo = "Hombre";

		} else {

			sexo = "Mujer";

		}
		return sexo;

	}
}