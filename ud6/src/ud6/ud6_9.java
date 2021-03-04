package ud6;

import javax.swing.JOptionPane;

public class ud6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = JOptionPane.showInputDialog("Introduce el tamaño del array");
		System.out.println("Tamaño del array: " + texto);
		int lista[] = new int[Integer.parseInt(texto)];

		rellenarNumAleatorios(lista, 0, 9);
		mostrarArray(lista);

	}

	public static void rellenarNumAleatorios(int lista[], int a, int b) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = ((int) Math.floor(Math.random() * (a - b) + b));
		}
	}

	public static void mostrarArray(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("En " + i + " está el número " + lista[i]);

		}
	}
}
