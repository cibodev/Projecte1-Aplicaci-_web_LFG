
import java.util.ArrayList;

public class Coche extends Vehiculo {

	// Atributos//
	private double diametro_delantera;
	private double diametro_trasera;
	private String marca_rueda_delantera;
	private String marca_rueda_trasera;

	// Métodos por defecto//
	public Coche(String matricula, String marca, String color, ArrayList<Conductor> conductor, Titular titular,
			double diametro_delantera, double diametro_trasera, String marca_rueda_delantera,
			String marca_rueda_trasera) {
		super(matricula, marca, color, conductor, titular);
		this.diametro_delantera = diametro_delantera;
		this.diametro_trasera = diametro_trasera;
		this.marca_rueda_delantera = marca_rueda_delantera;
		this.marca_rueda_trasera = marca_rueda_trasera;
	}

	public Coche(String matricula, String marca, String color, Titular titular, double diametro_delantera,
			double diametro_trasera, String marca_rueda_delantera, String marca_rueda_trasera) {
		super(matricula, marca, color, titular);
		this.diametro_delantera = diametro_delantera;
		this.diametro_trasera = diametro_trasera;
		this.marca_rueda_delantera = marca_rueda_delantera;
		this.marca_rueda_trasera = marca_rueda_trasera;
	}

	// Get y set//
	public double getDiametro_delantera() {
		return diametro_delantera;
	}

	public void setDiametro_delantera(double diametro_delantera) {
		this.diametro_delantera = diametro_delantera;
	}

	public double getDiametro_trasera() {
		return diametro_trasera;
	}

	public void setDiametro_trasera(double diametro_trasera) {
		this.diametro_trasera = diametro_trasera;
	}

	public String getMarca_rueda_delantera() {
		return marca_rueda_delantera;
	}

	public void setMarca_rueda_delantera(String marca_rueda_delantera) {
		this.marca_rueda_delantera = marca_rueda_delantera;
	}

	public String getMarca_rueda_trasera() {
		return marca_rueda_trasera;
	}

	public void setMarca_rueda_trasera(String marca_rueda_trasera) {
		this.marca_rueda_trasera = marca_rueda_trasera;
	}

	public boolean comprobarDiametro() {
		if ((this.diametro_delantera > 0.4 && this.diametro_delantera < 4.0)
				&& (this.diametro_trasera > 0.4 && this.diametro_trasera < 4.0)) {
			return true;
		}
		return false;
	}

	// Método toString //
	@Override
	public String toString() {
		return super.toString() + "Diametro delantera: " + diametro_delantera + " Marca: " + marca_rueda_delantera + ""
				+ "Diametro trasera: " + diametro_trasera + " Marca: " + marca_rueda_trasera + "";
	}

}