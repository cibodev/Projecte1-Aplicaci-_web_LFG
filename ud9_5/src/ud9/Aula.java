package ud9;

public class Aula {

	// Atributos//
	private int id;
	private int numAlumnos;
	private String destino;

	// Constructor //
	public Aula(int id, int numAlumnos, String destino) {
		this.id = id;
		this.numAlumnos = numAlumnos;
		this.setDestino(destino);
	}

	// Get y set//
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getnumAlumnos() {
		return numAlumnos;
	}

	public void setnumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	// Método toString //
	public String toString() {
		return "Informacion del aula"

				+ "Identificador: " + id + " "

				+ "Nº maximo: " + numAlumnos + " "

				+ "Destinada: " + destino + " ";
	}
}
