package ud9_1;

public class Electrodomestico {

	// Atributos
	protected double precioBase;
	protected String color;
	protected String consumoEnergetico;
	protected double peso;

	// Constantes
	protected final static String COLOR_DEF = "blanco";
	protected final static String CONSUMO_DEF = "F";
	protected final static double PRECIO_DEF = 100;
	protected final static double PESO_DEF = 5;

	// Constructores
	public Electrodomestico() {
	}

	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, String consumoEnergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	// Métodos get de todos los atributos
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	// Comprobar precio final //
	public double precioFinal() {
		double letra = 0;
		switch (consumoEnergetico) {
		case "A":
			letra = 100;
			break;
		case "B":
			letra = 80;
			break;
		case "C":
			letra = 60;
			break;
		case "D":
			letra = 50;
			break;
		case "E":
			letra = 30;
			break;
		case "F":
			letra = 10;
			break;
		}
		return letra;

	}

	// Comprobar color //

	public static String comprobarColor(String color) {
		String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };
		boolean acierto = false;
		for (String unColor : colores) {
			if (color.equals(unColor)) {
				acierto = true;
			}
		}

		if (!acierto) {
			color = "Blanco";
		}

		return color;
	}
}
