package ud6;

import javax.swing.JOptionPane;

public class ud6_6_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;
		do {
			String texto = JOptionPane.showInputDialog("Número entero positivo");
			numero = Integer.parseInt(texto);
		} while (numero < 0);
		int numCifras = contarCifras(numero);
		if (numCifras == 1) {
			System.out.println("El número " + numero + " tiene " + numCifras);
		}
	}

	public static int contarCifras(int numero) {
		int contador = 0;
		for (int i = numero; i > 0; i /= 10) {
			contador++;
		}
		return contador;
	}

}