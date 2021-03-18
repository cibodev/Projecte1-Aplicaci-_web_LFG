/**
 * 
 */
package proyecto;

/**
 * @author Christian Rivas
 *
 */
public class usuario {
	private int id;
	private String username;
	private String email;
	private String password;
	private String imagen;
	private String fechaNacimiento;
	private String steamUser;
	
	
//CONTRUCTORES
	
	public usuario() {
	}

	public usuario(String username, String email, String password, String imagen, String fechaNacimiento, String steamUser) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.imagen = imagen;
		this.fechaNacimiento = fechaNacimiento;
		this.steamUser = steamUser;
	}

	public usuario(String username, String email) {
		this.username = username;
		this.email = email;
	}
	
// GETTERS SETTERS Y TOSTRING

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSteamUser() {
		return steamUser;
	}

	public void setSteamUser(String steamUser) {
		this.steamUser = steamUser;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "usuario [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", imagen=" + imagen + ", fechaNacimiento=" + fechaNacimiento + ", steamUser=" + steamUser + "]";
	}
	
	
	
}
