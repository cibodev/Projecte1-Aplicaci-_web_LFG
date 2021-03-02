package ud7;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ud7_3 implements ud7_3_able {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = JOptionPane.showInputDialog("Introduce articulo");
		String texto1 = JOptionPane.showInputDialog("Número de articulos");

		// Creamos la base de datos
		HashMap<String, Integer> articulosyPrecio = new HashMap<String, Integer>();

		// Creamos los 10 articulos junto con el precio
		articulosyPrecio.put("Camiseta", 10);
		articulosyPrecio.put("Pantalon", 19);
		articulosyPrecio.put("Abrigo", 30);
		articulosyPrecio.put("Camisa", 15);
		articulosyPrecio.put("Pasta de dientes", 3);
		articulosyPrecio.put("Acondicionado", 2);
		articulosyPrecio.put("Libreta", 1);
		articulosyPrecio.put("Pegamento", 3);
		articulosyPrecio.put("Estuche", 5);
		articulosyPrecio.put("Teclado pc", 22);

		System.out.println(articulosyPrecio.toString());

	}

}