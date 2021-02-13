package ud8_1;

public class Persona {
	// TODO Auto-generated method stub

	// Constante
	private final static String SEXO = "H";

	// Atributos
	private String nombre;
	private int edad;
	private int dni;
	private String sexo;
	private double peso;
	private double altura;

	// Constructores
	public Persona() {
	}

	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = SEXO;
		this.dni = 39524866;
		this.peso = 60;
		this.altura = 1.70;
	}

	// Getters Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
