package ud9_4;

public class Raices {

	// Atributos (3 coeficientes) //
	private double a;
	private double b;
	private double c;

	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	private void obtenerRaices() {
		double x1 = (-b + Math.sqrt(getAislar()) / 2 * a);
		double x2 = (-b + Math.sqrt(getAislar()) / 2 * a);

		System.out.println("Solución x1");
		System.out.println(x1);
		System.out.println("Solución x2");
		System.out.println(x2);
	}

	private void obtenerRaiz() {
		double x = (-b) / (2 * a);
		System.out.println("Una única solución");
		System.out.println(x);
	}

	private double getAislar() {
		return Math.pow(b, 2) - (4 * a * c);
	}

	private boolean tieneRaices() {
		return getAislar() > 0;
	}

	private boolean tieneRaiz() {
		return getAislar() == 0;
	}

	public void calculo() {
		if (tieneRaices()) {
			obtenerRaices();
		} else if (tieneRaiz()) {
			obtenerRaiz();
		} else {
			System.out.println("No hay solución");
		}
	}

}
