package ud9;

// Esta clase llamada "Alumnos" hereda de la clase padre llamada "Personas" //
public class Alumnos extends Personas {

	// Atributos//
	private int nota;
	public final int asistencia = 50;
	private boolean falta;

	// Constructor//
	public Alumnos(String nombre, int edad, char sexo) {
		super(nombre, edad, sexo);
	}

	// get y set//
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public boolean alumnoEnClase() {
		boolean presente = false;
		return presente;
	}

	public boolean isFalta() {
		return falta;
	}

	public void setFalta(boolean falta) {
		this.falta = falta;
	}

	// Método toString //
	public String toString() {
		return "Nombre: " + this.nombre + "Edad: " + this.edad + "Nota: " + this.nota;
	}
}