package ud9_3;

public class ud9_3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro1 = new Libro(1, "Crepúsculo", "Stephenie Meyer", 498);
		Libro libro2 = new Libro(2, "Amanecer", "Stephenie Meyer", 500);

		System.out.println(libro1.toString());
		System.out.println(libro2.toString());

		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println("Este libro tiene más páginas " + libro1.getTitulo());
		} else {
			System.out.println("Este libro tiene más páginas " + libro2.getTitulo());
		}
	}

}
