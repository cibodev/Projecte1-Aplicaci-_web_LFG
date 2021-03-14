package ud6;

import javax.swing.JOptionPane;

public class ud6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = JOptionPane.showInputDialog("Introduce un número: ");
		int num = Integer.parseInt(texto);
		System.out.println(convertirNumABinario(num));
	}

	private static String convertirNumABinario(int num) {
		String binario = "";
		while (num != 0) {
			binario = num % 2 + binario;
			num = num / 2;
		}
		return binario;
	}
}
