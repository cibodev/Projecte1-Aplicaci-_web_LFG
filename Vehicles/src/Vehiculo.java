
import java.util.ArrayList;

public class Vehiculo {
	
	// Atributos //
	protected String matricula;
	protected String marca;
	protected String color;
	protected Titular titular;
	protected ArrayList<Conductor> conductor;

	// Definimos get y set //
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	// Comprobamos los carácteres de la matricula //
	public boolean matriculaCorrecta() {
		for (int i = 0; i < this.matricula.length(); i++) {
			if (this.matricula.length() < 7) {
				this.matricula = matricula + " ";
			}
		}
		if (this.matricula.length() == 7) {
			for (int i = 0; i < 4; i++) {
				if (matricula.charAt(i) >= '0' && matricula.charAt(i) <= '9') {
				} else {
					return false;
				}
			}
			for (int i = 4; i < 6; i++) {
				if (matricula.charAt(i) >= 'A' && matricula.charAt(i) <= 'Z') {
				} else {
					return false;
				}
			}
			if (matricula.charAt(6) >= 'A' && matricula.charAt(6) <= 'Z' || matricula.charAt(6) == ' ') {
				return true;
			}
		}
		return false;

	}

	// Métodos por defecto //
	public Vehiculo(String matricula, String marca, String color, ArrayList<Conductor> conductor, Titular titular) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
		this.titular = titular;
		this.conductor = conductor;
	}

	public Vehiculo(String matricula, String marca, String color, Titular titular) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
		this.titular = titular;
	}

	// Método toString //
	public String toString() {
		String lista = "Coche:" + "" + "Matricula: " + matricula + "" + "Marca vehiculo: " + marca + "" + "Color: "
				+ color + "" + "Titular: " + titular.nombre + " " + titular.apellidos + "" + "Conductores: ";
		lista += "-----------------";
		if (conductor != null) {
			for (int i = 0; i < conductor.size(); i++) {
				lista += conductor.get(i).getNombre() + " " + conductor.get(i).apellidos + "";
			}
		} else {
			lista += "ninguno";
		}

		lista += "-----------------";

		return lista;

	}

}