package ud9_2;

/**
 * Clase Videojuego
 * 
 * @author Emmapago
 */

public class Videojuego implements Entregable {

	// Constantes
	private final static int HORAS_ESTIMADAS = 100;
	public final static int MAYOR = 1;
	public final static int MENOR = -1;
	public final static int IGUAL = 0;

	// Atributos//
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private static String compañia;

	// Get y set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public boolean isEntregado1() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public void entregar() {
		entregado = true;
	}

	public void devolver() {
		entregado = false;
	}

	public boolean isEntregado() {
		if (entregado) {
			return true;
		}
		return entregado;

	}

	@Override
	public boolean compareTo(Object a) {
		Videojuego ref = (Videojuego) a;
		if (horasEstimadas > ref.getHorasEstimadas()) {
		} else if (horasEstimadas == ref.getHorasEstimadas()) {
		}
		return entregado;
	}

	// Constructor
	public Videojuego() {
		this(compañia, HORAS_ESTIMADAS, compañia, compañia);
	}

	public Videojuego(String titulo, String compañia) {
		this(titulo, HORAS_ESTIMADAS, compañia, compañia);
	}

	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
		this.entregado = false;

	}
}
