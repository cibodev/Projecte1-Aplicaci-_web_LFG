
public class Licencia extends Persona {

	// Atributos //
	protected Licencia licencia;
	protected boolean asseguran�a;
	protected boolean garatge;

	// Get y set //
	public Licencia getLicencias() {
		return licencia;
	}

	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}

	public boolean isAsseguran�a() {
		return asseguran�a;
	}

	public void setAsseguran�a(boolean asseguran�a) {
		this.asseguran�a = asseguran�a;
	}

	public boolean isGaratge() {
		return garatge;
	}

	public void setGaratge(boolean garatge) {
		this.garatge = garatge;
	}

	// M�todos por defecto //
	public Licencia(String nombre, String apellidos, String fecha_nacimiento, Licencia licencia, boolean asseguran�a,
			boolean garatge) {
		super(nombre, apellidos, fecha_nacimiento);
		this.licencia = licencia;
		this.asseguran�a = asseguran�a;
		this.garatge = garatge;
	}

	// M�todo toString //
	@Override
	public String toString() {
		return super.toString() + "Licencia: " + licencia + "";
	}

}