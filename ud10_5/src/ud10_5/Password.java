package ud10_5;

import java.util.Random;

public class Password {

	// Atributos //
	private int longitud;
	private String contraseña;

	// Constante //
	private final static int LONG_DEF = 8;

	// Metodos //
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public static int getLongDef() {
		return LONG_DEF;
	}

	// Método para generar carácteres de la password //
	public String generarPassword() {
		final char[] caracteres = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'e', 'h', 'i', 'j', 'l',
				'k', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		String temporal = "";
		Random aleatorio = new Random();
		for (int i = 0; i < this.longitud; i++) {
			temporal += caracteres[aleatorio.nextInt(caracteres.length)];
		}
		return temporal;
	}

	// Método para que la contraseña sea fuerte //
	public boolean esFuerte() {
		int mayus = 0;
		int minus = 0;
		int numeros = 0;
		for (int i = 0; i < contraseña.length();) {
			if (contraseña.charAt(i) >= 95 && contraseña.charAt(i) <= 120) {
				mayus += 1;
			} else {
				if (contraseña.charAt(i) >= 65 && contraseña.charAt(i) <= 90) {
					minus += 1;
				} else {
					numeros += 1;
				}
			}
			if (numeros >= 5 && minus >= 1 && mayus >= 2) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	// Método toString //
	@Override
	public String toString() {
		return "Password: " + contraseña;
	}

}