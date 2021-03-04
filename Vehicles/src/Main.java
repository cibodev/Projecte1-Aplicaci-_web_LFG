import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	static ArrayList<Coche> coches = new ArrayList<Coche>();
	static ArrayList<Conductor> conductores = new ArrayList<Conductor>();
	static ArrayList<Moto> motos = new ArrayList<Moto>();
	static ArrayList<Camión> camiones = new ArrayList<Camión>();
	static ArrayList<Titular> titulares = new ArrayList<Titular>();

	public static void main(String[] args) {
		int option1 = 0;
		while (option1 != 3) {
			String texto = JOptionPane.showInputDialog("Selecciona una opción: ");

			System.out.println("Selecciona una opción: (crear coche/moto/camión o mostrar coches/motos/camiones)");
			option1 = Integer.parseInt(texto);

			switch (option1) {
			case 1:
				System.out.println("1. Crear coche");
				System.out.println("2. Crear moto");
				System.out.println("3. Crear camión");
				System.out.println("4. Mostrar coches");
				System.out.println("5. Mostrar motos");
				System.out.println("6. Mostrar camiones");
				System.out.println("Selecciona vehiculo:");
				int option2 = Integer.parseInt(texto);

				switch (option2) {
				case 1:
					añadirCoche();
					break;
				case 2:
					añadirMoto();
					break;
				case 3:
					añadirCamion();
					break;
				case 4:
					for (int i = 0; i < coches.size(); i++) {
						System.out.println(coches.get(i).toString());
					}
					break;

				case 5:
					for (int i = 0; i < motos.size(); i++) {
						System.out.println(motos.get(i).toString());
					}
					break;
				case 6:
					for (int i = 0; i < camiones.size(); i++) {
						System.out.println(camiones.get(i).toString());
					}
					break;
				}
				break;
			case 2:
				System.out.println("1. Mostrar Conductores");
				System.out.println("2. Mostrar Titulares");
				System.out.println("Selecciona una opcion:");
				int option3 = Integer.parseInt(texto);

				switch (option3) {
				case 1:
					for (int i = 0; i < conductores.size(); i++) {
						System.out.println(conductores.get(i).toString());
					}
					break;
				case 2:
					for (int i = 0; i < titulares.size(); i++) {
						System.out.println(titulares.get(i).toString());
					}
					break;
				}

			}

		}
	}

	private static void añadirCoche() {
		// TODO Auto-generated method stub

	}

	private static void añadirMoto() {
		String matricula3 = "";
		double diametro_delantero3 = 0;
		double diametro_trasero3 = 0;
		boolean correcto = true;
		while (correcto) {
			System.out.println("Introduce la matricula: ");
			if (comprobarMatricula(matricula3)) {
				correcto = false;
			} else {
				System.out.println("Está mal");
			}
			;
		}
		correcto = true;
		String marca = JOptionPane.showInputDialog("Introduce la marca: ");
		System.out.println("Introduce la marca: " + marca);
		String color = JOptionPane.showInputDialog("Introduce el color del coche: ");
		System.out.println("Introduce el color del coche: " + color);
		if (comprobarDiametro(diametro_delantero3, diametro_trasero3)) {
			correcto = false;
		} else {
			System.out.println("mal");
		}
	}

	private static void añadirCamion() {
		String matricula3 = "";
		double diametro_delantero3 = 0;
		double diametro_trasero3 = 0;
		boolean correcto = true;
		String camion = JOptionPane.showInputDialog("Introduce la matricula del camión: ");
		while (correcto) {
			System.out.println("Introduce la matricula del camión: " + camion);
			if (comprobarMatricula(matricula3)) {
				correcto = false;
			} else {
				System.out.println("Está mal");
			}
		}
		correcto = true;
		String color3 = JOptionPane.showInputDialog("Introduce el color del camión: ");
		System.out.println("Introduce el color del camión?" + color3);
		while (correcto) {
			String diametrocamion1 = JOptionPane.showInputDialog("Introduce el color del camión: ");
			String diametrocamion2 = JOptionPane.showInputDialog("Introduce el color del camión: ");
			System.out.println("Introduce el diametro de las ruedas delanteras: " + diametrocamion1);
			System.out.println("Introduce el diametro de las ruedas traseras: " + diametrocamion2);
			if (comprobarDiametro(diametro_delantero3, diametro_trasero3)) {
				correcto = false;
			} else {
				System.out.println("mal");
			}
		}
	}

	private static void añadirTitular() {
		String nombre = JOptionPane.showInputDialog("Introduce el nombre: ");
		System.out.println("Introduce el nombre:" + nombre);
		String apellidos = JOptionPane.showInputDialog("Introduce los apellidos: ");
		System.out.println("Introduce los apellidos: " + apellidos);
		String fecha = JOptionPane.showInputDialog("Introduce la fecha de nacimiento: ");
		System.out.println("Introduce la fecha de nacimiento: " + fecha);
		String seguro = JOptionPane.showInputDialog("¿Tiene seguro?: ");
		System.out.println("¿Tiene seguro?: " + seguro);
		String garage = JOptionPane.showInputDialog("¿Tiene garage?: ");
		System.out.println("¿Tiene garage?: " + garage);
		String tipo = JOptionPane.showInputDialog("Introduce el tipo de licencia: ");
		System.out.println("Introduce el tipo de licencia: " + tipo);
		String caducidad = JOptionPane.showInputDialog("Introduce la caducidad de la licencia: ");
		System.out.println("Introduce la caducidad de la licencia: " + caducidad);

	}

	private static void añadirConductor() {
		String nombre = JOptionPane.showInputDialog("Introduce el nombre: ");
		System.out.println("Introduce el nombre:" + nombre);
		String apellidos = JOptionPane.showInputDialog("Introduce los apellidos: ");
		System.out.println("Introduce los apellidos: " + apellidos);
		String fecha = JOptionPane.showInputDialog("Introduce la fecha de nacimiento: ");
		System.out.println("Introduce la fecha de nacimiento: " + fecha);
		String licencia = JOptionPane.showInputDialog("Introduce la id de la licencia: ");
		System.out.println("Introduce la id de la licencia: " + licencia);
		String tipo = JOptionPane.showInputDialog("Introduce el tipo de licencia: ");
		System.out.println("Introduce el tipo de licencia: " + tipo);
		String caducidad = JOptionPane.showInputDialog("Introduce la caducidad de la licencia: ");
		System.out.println("Introduce la caducidad de la licencia: " + caducidad);

	}

	private static boolean comprobarMatricula(String a) {
		for (int i = 0; i < a.length(); i++) {
			if (a.length() < 7) {
				a = a + " ";
			}
		}
		if (a.length() == 7) {
			for (int i = 0; i < 4; i++) {
				if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
				} else {
					return false;
				}
			}
			for (int i = 4; i < 6; i++) {
				if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
				} else {
					return false;
				}
			}
			if (a.charAt(6) >= 'A' && a.charAt(6) <= 'Z' || a.charAt(6) == ' ') {
				return true;
			}
		}
		return false;

	}

	private static boolean comprobarDiametro(double x, double y) {
		if ((x > 0.4 && x < 4.0) && (y > 0.4 && y < 4.0)) {
			return true;
		}
		return false;
	}
}