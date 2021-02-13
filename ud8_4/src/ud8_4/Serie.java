package ud8_4;

public class Serie {

	// Atributos
	private String titulo;
	private int numTemporadas;
	private String entregado;
	private String genero;
	private String creador;

	// Constantes
	private final static int NUM_TEMPORADAS = 3;

	// Constructores implementados
	public Serie() {
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
}
