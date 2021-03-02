package ud6;

import javax.swing.JOptionPane;

public class ud6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = JOptionPane.showInputDialog("Introduce tamaño");
		int num[] = new int[Integer.parseInt(texto)];

		rellenarNumAleArray(num, 0, 9);
		mostrarArray(num);

	}

	public static void rellenarNumAleArray(int lista[], int a, int b) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = ((int) Math.floor(Math.random() * (a - b) + b));
		}

	}

	public static void mostrarArray(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("En" + i + "está el valor" + lista[i]);

		}
	}
}
