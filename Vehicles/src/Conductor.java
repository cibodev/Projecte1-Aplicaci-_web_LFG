
public class Conductor extends Persona {

	// Atributo //
	protected Licencia licencia;

	// Método por defecto //
	public Conductor(String nombre, String apellidos, String fecha_nacimiento, Licencia licencia) {
		super(nombre, apellidos, fecha_nacimiento);
		this.licencia = licencia;
	}

	// Get y set //
	public Licencia getLicencia() {
		return licencia;
	}

	public void setLicencias(Licencia licencia) {
		this.licencia = licencia;
	}

	// Método toString //
	@Override
	public String toString() {
		return super.toString() + "Licencia: " + licencia + "";
	}

}
