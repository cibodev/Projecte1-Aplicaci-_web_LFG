package ud8_2;

public class Password {

	// Constante
	private final static int LONGITUD_CONTRA = 8;

	// Atributos
	private int longitud;
	private String contraseña;

	// Constructores
	public Password() {
		this(LONGITUD_CONTRA);
	}

	public Password(int longitud) {
		this.longitud = longitud;
		contraseña=generaPassword();
	}

	private String generaPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}
