
public class Categoria extends Empleado {

	// Atributos //
	private final String[] CATEGORIA = { "Junior", "Mid", "Senior" };
	private boolean ayuda;
	private String categoria;
	
	// Constructores //
	public Categoria(String tipo, double sueldo, String categoria) {
		super(tipo, sueldo);
		this.categoria = categoria;
		this.ayuda = false;

	}

	public Categoria(String tipo, double sueldo, String categoria, boolean ayuda) {
		super(tipo, sueldo);
		this.categoria = categoria;
		this.ayuda = ayuda;
	}

	public boolean isAyuda() {
		return ayuda;
	}

	// Get y set //
	public void setAyuda(boolean ayuda) {
		this.ayuda = ayuda;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	// Calcular el sueldo mensual //
	public double calcular() {
		if (this.tipo.equals(TIPO[3])) {
			return super.calcular();
		} else {

			if (this.categoria.equals(CATEGORIA[0])) {
				return super.calcular() * 0.85;

			} else if (this.categoria.equals(CATEGORIA[1])) {
				return super.calcular() * 0.90;

			} else if (this.categoria.equals(CATEGORIA[2])) {
				return super.calcular() * 0.95;

			}
		}
		return 0;

	}

	// Calcular el IRPF //

	public double IRPF() {
		if (this.tipo.equals(TIPO[3])) {
			return calcular();
		} else if (this.tipo.equals(TIPO[0])) {
			return calcular() * 0.74;

		} else if (this.tipo.equals(TIPO[1])) {
			return calcular() * 0.68;

		} else if (this.categoria.equals(CATEGORIA[2])) {
			return calcular() * 0.76;

		} else if (this.categoria.equals(CATEGORIA[1])) {
			return calcular() * 0.85;

		} else if (this.categoria.equals(CATEGORIA[0])) {
			return calcular() * 0.98;

		}
		return 0;
	}

	// Validar Sueldo //
	public boolean validacioSou() {
		if (this.tipo.equals(TIPO[1])) {
			if (this.sueldo > 8000) {
				return true;
			} else {
				return false;
			}
		} else if (this.tipo.equals(TIPO[0])) {
			if (this.sueldo > 3000 && this.sueldo < 5000) {
				return true;
			} else {
				return false;
			}
		} else if (this.ayuda == false) {
			if (this.tipo.equals(TIPO[3])) {
				if (this.sueldo == 0) {
					return true;
				} else {
					return false;
				}
			}
		} else if (this.ayuda) {
			if (this.tipo.equals(TIPO[3])) {
				if (this.sueldo < 300) {
					return true;
				} else {
					return false;
				}
			}
		} else if (this.categoria.equals(CATEGORIA[2])) {
			if (this.sueldo > 2700 && this.sueldo < 4000) {
				return true;
			} else {
				return false;
			}
		} else if (this.categoria.equals(CATEGORIA[1])) {
			if (this.sueldo > 1800 && this.sueldo < 2500) {
				return true;
			} else {
				return false;
			}
		} else if (this.categoria.equals(CATEGORIA[0])) {
			if (this.sueldo > 900 && this.sueldo < 1600) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	// Calcula el sueldo anual //
	public double anual() {
		return calcular() * 12;
	}

	// Calcula el IRPF anual //

	public double anualIRPF() {
		return IRPF() * 12;
	}

	// Calcula el bonus //
	public double bonus() {
		return anualIRPF() * 0.10;
	}

}
