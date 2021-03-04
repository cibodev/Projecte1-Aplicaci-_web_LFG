package ud6;

import javax.swing.JOptionPane;

public class ud6_10 {

	public static void main(String[] args) {

		String texto = JOptionPane.showInputDialog("Introduce la longitud del array");
		System.out.println("Longitud del array: " + texto);
		int lista[];
		int posiciones = 0;
		lista = Meter(posiciones);
		Mostrar(lista, posiciones);

	}

	public static int[] Meter(int posiciones) {
		int num[] = new int[posiciones];
		int aleatorio;

		while (posiciones > 0) {
			aleatorio = (int) ((Math.random() * 100) + 2);
			if (primos(aleatorio) == true) {
				num[(posiciones - 1)] = aleatorio;
				posiciones--;
			}
		}
		return num;

	}

	public static boolean primos(int num1) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != num1)) {
			if (num1 % contador == 0) {
				primo = false;
			}
			contador++;
		}
		return primo;
	}

	public static void Mostrar(int[] num1, int posiciones) {
		System.out.println("Lista: ");
		for (int i = 0; i < posiciones; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println("");
		int mayor = 0;
		for (int i = 0; i < posiciones; i++) {
			if (num1[i] > mayor) {
				mayor = num1[i];
			}
		}
		System.out.print("El major és: " + mayor);
	}
}
