package ud9_2;

public class Ejecutable {
	private static Videojuego[] listaVideojuegos;

	public static void main(String[] args) {

		Serie listaSerie[] = new Serie[5];
		Videojuego listaVideojuego[] = new Videojuego[5];

		listaSerie[0] = new Serie();
		listaSerie[1] = new Serie("Los Simpsons", 30, "Animación", "Matt Groening");
		listaSerie[2] = new Serie("La casa de papel", 5, "Acción", "Álex Pina");
		listaSerie[3] = new Serie("Prison Break", 6, "Acción", "Paul T.Scheuring");
		listaSerie[4] = new Serie("Los Serrano", 8, "Comedia", "Álex Pina");

		listaVideojuego[0] = new Videojuego();
		listaVideojuego[1] = new Videojuego("GTA", 0, "Acción", "Rockstar North");
		listaVideojuego[2] = new Videojuego("Super Mario", 5, "Plataformas", "Nintendo");
		listaVideojuego[3] = new Videojuego("Skyrim", 0, "Acción", "Bethesda Game Studios");
		listaVideojuego[4] = new Videojuego("Assasin creed", 30, "Aventura", "EA");

		listaSerie[1].entregar();
		listaSerie[2].entregar();
		listaVideojuego[3].entregar();
		listaVideojuego[4].entregar();

		for (int i = 0; i < listaSerie.length; i++) {
			if (listaSerie[i].isEntregado()) {
				listaSerie[i].devolver();
			}
			if (listaVideojuego[i].isEntregado()) {
				listaVideojuego[i].devolver();
			}

			int entregados = 0;

			System.out.println(+entregados+  "articulos entregados");
			Serie serieMayor = listaSerie[0];
			listaVideojuegos = null;
			Videojuego videojuegoMayor = listaVideojuegos[0];

			System.out.println(videojuegoMayor);
			System.out.println(serieMayor);

		}

	}
}