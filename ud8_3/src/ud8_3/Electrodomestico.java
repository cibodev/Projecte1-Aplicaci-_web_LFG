package ud8_3;

public class Electrodomestico {

	// Atributos
	protected double precio;
	protected String color;
	protected String consumoEnergetico;
	protected double peso;

	// Constantes definidas por defecto
	protected final static String COLOR_DEF = "blanco";
	protected final static String CONSUMO_DEF = "F";
	protected final static double PRECIO_DEF = 100;
	protected final static double PESO_DEF = 5;

	// Colores disponibles
	String colores[]= {"blanco", "negro", "rojo", "azul", "gris"};
	
	
	// Constructores (por defecto, con el precio y peso, y con todos los atributos
	public Electrodomestico() {
	}

	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.peso = peso;
	}

	public Electrodomestico(double precio, String color, String consumoEnergetico, double peso) {
		this.precio = precio;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

}
