
public class Licencia extends Persona {

	// Atributos //
	protected Licencia licencia;
	protected boolean assegurança;
	protected boolean garatge;

	// Get y set //
	public Licencia getLicencias() {
		return licencia;
	}

	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}

	public boolean isAssegurança() {
		return assegurança;
	}

	public void setAssegurança(boolean assegurança) {
		this.assegurança = assegurança;
	}

	public boolean isGaratge() {
		return garatge;
	}

	public void setGaratge(boolean garatge) {
		this.garatge = garatge;
	}

	// Métodos por defecto //
	public Licencia(String nombre, String apellidos, String fecha_nacimiento, Licencia licencia, boolean assegurança,
			boolean garatge) {
		super(nombre, apellidos, fecha_nacimiento);
		this.licencia = licencia;
		this.assegurança = assegurança;
		this.garatge = garatge;
	}

	// Método toString //
	@Override
	public String toString() {
		return super.toString() + "Licencia: " + licencia + "";
	}

}