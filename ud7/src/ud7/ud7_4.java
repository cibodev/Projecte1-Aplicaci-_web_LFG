package ud7;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class ud7_4 {
	public static void main(String[] args) {
		String articulo = JOptionPane.showInputDialog("Introduce el articulo ");
		String numero = JOptionPane.showInputDialog("Número de articulos ");

		ArrayList<String> lista = new ArrayList<>();

		// Mostrará por pantalla la siguiente información
		lista.add("Articulo comprado: " + articulo);
		lista.add("Número de articulos: " + numero);

		System.out.println(lista.toString());

	}

}
