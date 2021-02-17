package ud6;

import javax.swing.JOptionPane;

public class ud6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = JOptionPane.showInputDialog("Introduce el tamaño");
		int tamaño = Integer.parseInt(texto);

		int array1[] = new int[tamaño];
		int array2[];

		rellenarNumAleaArray(array1, 10, 100);
		array2 = array1;
		array1 = new int[tamaño];
		rellenarNumAleaArray(array1, 10, 100);
		int array3[] = null;
		multiplicar(array1, array2);

		System.out.println("Array1");
		mostrarArray(array1);

		System.out.println("Array2");
		mostrarArray(array2);

		System.out.println("Array3");
		mostrarArray(array3);
	}

	public static void rellenarNumAleaArray(int lista[], int a, int b) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = ((int) Math.floor(Math.random() * (a - b) + b));

		}
	}

	public static void mostrarArray(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("En " + i + "está el valor " + lista[i]);

		}

	}

	public static int[] multiplicar(int array1[], int array2[]) {
		int array3[] = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i] * array2[i];
		}
		return array3;
	}
}