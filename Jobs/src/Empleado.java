public class Empleado {

	// Atributos //
	protected String tipo;
	protected double sueldo;
	protected final String[] TIPO = { "Manager", "Boss", "Employee", "Volunteer" };

	// Constructores //
	public Empleado(String tipo, double sueldo) {
		this.tipo = tipo;
		this.sueldo = sueldo;
	}

	// Get y set //
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// Calcular el sueldo //
	public double calcular() {
		if (this.tipo.equals(TIPO[0])) {
			return this.sueldo * 1.10;
		} else if (this.tipo.equals(TIPO[1])) {
			return this.sueldo * 1.50;
		} else if (this.tipo.equals(TIPO[2])) {
			return this.sueldo * 0.85;
		} else if (this.tipo.equals(TIPO[3])) {
			return this.sueldo;
		}
		return 0;
	}

	// Método toString //
	@Override
	public String toString() {
		return "Empleado: " + "Tipo: " + tipo + "";
	}

}