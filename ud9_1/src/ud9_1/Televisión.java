package ud9_1;

public class Televisión extends Electrodomestico {

	// Atributos
	private int resolucion;
	private boolean sintonizadorTDT;

	// Constante
	private final static int RESOLUCION_DEF = 20;

	// Constructores
	public Televisión() {
		super();
	}

	public Televisión(double precioBase, double peso, char consumoEnergetico, String color, int resolución,
			boolean sintonizadorTDT) {
	}

	// Método get
	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	// Método precioFinal
	public double precioFinal() {
		double plus = super.precioFinal();
		if (resolucion > 40)

		{
			plus += precioBase * 30;
		}
		if (sintonizadorTDT) {
			plus += 50;
		}
		return plus;
	}

	public static int getResolucionDef() {
		return RESOLUCION_DEF;
	}
}
