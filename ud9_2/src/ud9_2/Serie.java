package ud9_2;

/**
 * Ejercicio UD9_2
 * 
 * @author emmapago
 *
 */

public class Serie implements Entregable {

	// *Constantes*//
	private final static int NUM_TEMPORADAS = 3;
	public final static int MAYOR = 1;
	public final static int MENOR = -1;
	public final static int IGUAL = 0;
	private static final int NUM_TEMPORADA = 0;

	// *Atributos*//
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private static String creador;

	// Get y set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public void entregar() {
		entregado = true;
	}

	public void devolver() {
		entregado = false;
	}

	public boolean isEntregado1() {
		if (entregado) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "Información de la serie:" + "tTitulo: " + titulo + "" + "Número de temporadas: " + numTemporadas + ""
				+ "Genero: " + genero + "";
	}

	public boolean compareTo1(Object a) {
		return entregado;
	}

	public Serie() {
		this("", NUM_TEMPORADA, creador, creador);
	}

	public Serie(String titulo, String creador) {
		this(titulo, NUM_TEMPORADA, creador, creador);
	}

	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		Serie.creador = creador;
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean compareTo(Object a) {
		// TODO Auto-generated method stub
		return false;
	}

}
