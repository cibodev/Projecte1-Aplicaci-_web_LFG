package ud6;

import java.util.Random;

import javax.swing.JOptionPane;

public class ud6_12 {
	private static Random r;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = JOptionPane.showInputDialog("Posiciones del array: ");
		texto = JOptionPane.showInputDialog("Número en el que quieres que acabe: ");
		int num = Integer.parseInt(texto);

		int array[] = new int[num];
		int random;
		int ultNum;
		for (int i = 0; i < array.length; i++) {
			random = r.nextInt(299) + 1;
			ultNum = random % 10;
			if (ultNum == num) {
				array[i] = random;
			}

			for (int j = 0; j < array.length; j++) {
				System.out.println("[" + j + "] [" + array[j] + "]");

			}
		}
	}
}
