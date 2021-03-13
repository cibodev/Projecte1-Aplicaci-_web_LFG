package ud9_6;

import java.util.Random;

public class CineApp {

	private static final Peliculas[] Peliculas = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos un array de peliculas//

		Random r = new Random();

		String ArrayPelis[] = new String[5];

		Peliculas[0] = new Peliculas("El hombre invisible", 120, 18, "Leigh Whannell");
		Peliculas[1] = new Peliculas("Bad boys for life", 120, 12, "Adil El Arbi");
		Peliculas[2] = new Peliculas("Tenet", 120, 3, "Christopher Nolan");
		Peliculas[3] = new Peliculas("Historias lamentables", 120, 21, "Javier Fresser");
		Peliculas[4] = new Peliculas("Fragmentos de una mujer", 120, 21, "Korne Mundruczo");

		// obtenemos la pelicula que vaya a estrenarse
		ArrayPelis[0] = getTitulo();
		ArrayPelis[1] = getTitulo();
		ArrayPelis[2] = getTitulo();
		ArrayPelis[3] = getTitulo();
		ArrayPelis[4] = getTitulo();
		int pelicu = r.nextInt(5);
		System.out.println("La pelicula es: " + ArrayPelis[pelicu]);

	}

	private static String getTitulo() {
		// TODO Auto-generated method stub
		return null;
	}

}
