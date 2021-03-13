package ud9;

//Esta clase llamada "Profesor" hereda de la clase padre llamada "Personas" //
class Profesor extends Personas {

	// Atributo//
	public final String ASIGNATURA_DEF = "matematicas";
	public final int asistenciaProfe = 80;
	public String asignatura;

	// Constructor//
	public Profesor(String nombre, int edad, char sexo, String asigantura, String asignatura) {
		super(nombre, edad, sexo);
		this.asignatura = asignatura;
	}

	// Get y set//
	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	// Método toString //
	public String toString() {
		return "Profesor: " + super.getNombre() + "Materia: " + asignatura + " ";
	}
}
