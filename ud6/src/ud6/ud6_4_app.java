package ud6;

import javax.swing.JOptionPane;

public class ud6_4_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = JOptionPane.showInputDialog("Número factorial");
		int factorial = Integer.parseInt(texto);
		System.out.println("El factorial "+factorial+ " es "+numero(factorial));
	}

	public static int numero(int factorial) {
		int res = factorial;
		for (int cont = (factorial - 1); cont > 0; cont--) {
			res = res * cont;
		}
		return res;
	}

}
