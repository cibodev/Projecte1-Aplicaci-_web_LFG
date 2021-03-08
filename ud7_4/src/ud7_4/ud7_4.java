
package ud7_4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ud7_4 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String articulo = JOptionPane.showInputDialog("Introduce el articulo: ");
		String iva = JOptionPane.showInputDialog("IVA aplicado (21% o 4%): ");
		String bruto = JOptionPane.showInputDialog("Precio total bruto y precio más IVA: ");
		String compra = JOptionPane.showInputDialog("Número de articulos comprados: ");
		String pagada = JOptionPane.showInputDialog("Cantidad pagada: ");
		String devolver = JOptionPane.showInputDialog("Cambio a devolver al cliente: ");
		String añadir = JOptionPane.showInputDialog("Añadir algún artículo más: ");

		ArrayList<String> lista = new ArrayList<>();

		// Mostrará por pantalla la siguiente información
		lista.add("Articulo comprado " + articulo);
		lista.add("IVA aplicado % " + iva);
		lista.add("Precio total bruto y precio más IVA " + bruto);
		lista.add("Número de articulos comprados " + compra);
		lista.add("Cantidad pagada € " + pagada);
		lista.add("Cambio a devolver € " + devolver);
		lista.add("" + añadir);
		System.out.println(lista.toString());
	}
}
