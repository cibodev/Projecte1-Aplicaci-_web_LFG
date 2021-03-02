package ud6;

import javax.swing.JOptionPane;

public class ud6_8_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creo un array de 10 posiciones
		int num[] = new int[10];
		rellenarValores(num);
		mostrarValores(num);

	}

	public static void rellenarValores(int lista[]) {

		for (int i = 0; i < lista.length; i++) {
			String texto = JOptionPane.showInputDialog("Introduce un número");
			int valor = Integer.parseInt(texto);
			lista[i] = valor;
			// System.out.println(lista[i]);

		}
	}

	public static void mostrarValores(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);

		}

	}
}
