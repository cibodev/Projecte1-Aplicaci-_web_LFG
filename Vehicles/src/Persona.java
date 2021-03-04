
public class Persona {

	// Atributos //
	protected String nombre;
	protected String apellidos;
	protected String fecha_nacimiento;

	// Método por defecto //
	public Persona(String nombre, String apellidos, String fecha_nacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
	}

	// Get y set //
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	
	// Método toString //
	@Override
	public String toString() {
		return "Nombre: " + nombre + "" + "Apellidos: " + apellidos + "" + "Fecha de nacimiento: " + fecha_nacimiento
				+ "";
	}

}
