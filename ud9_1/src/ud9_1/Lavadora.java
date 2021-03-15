package ud9_1;

public class Lavadora extends Electrodomestico {

	// Atributo
	private int carga;

	// Constante
	private final static int CARGA_DEF = 5;

	// Constructores
	public Lavadora() {
	}

	public Lavadora(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Lavadora(double precioBase, double peso, String consumoEnergetico, String color, int carga) {
		this.carga = carga;
	}

	// Método get de carga
	public int getCarga() {
		return carga;
	}

	// Método precioFinal
	public double precioFinal() {
		double plus = super.precioFinal();
		if (carga > 30) {
			plus += 50;
		}
		return plus;
	}

	public static int getCargaDef() {
		return CARGA_DEF;
	}
}
