/**
 * 
 */
package proyecto;

/**
 * @author Christian Rivas
 *
 */
public class game {
	private int id;
	private String nombre;
	private String imagen;
	
//CONSTRUCTORES
	
	public game(String nombre, String imagen) {
		this.nombre = nombre;
		this.imagen = imagen;
	}

	public game(String nombre) {
		this.nombre = nombre;
	}

	public game() {
	}
	
//GETTERS SETTERS Y TOSTRING
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "game [id=" + id + ", nombre=" + nombre + ", imagen=" + imagen + "]";
	}
	
}
