/**
 * 
 */
package proyecto;

/**
 * @author User
 *
 */
public class party {
	private int id;
	private String nombre;
	private int id_usuario;
	private int id_game;
	
//CONSTRUCTORTES
	
	public party(String nombre, int id_usuario, int id_game) {
		this.nombre = nombre;
		this.id_usuario = id_usuario;
		this.id_game = id_game;
	}

	public party() {
	}

//GETTERS SETTERS Y TOSTRING
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public int getId_game() {
		return id_game;
	}

	public void setId_game(int id_game) {
		this.id_game = id_game;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "party [id=" + id + ", nombre=" + nombre + ", id_usuario=" + id_usuario + ", id_game=" + id_game + "]";
	}
	
	
	
	
}
