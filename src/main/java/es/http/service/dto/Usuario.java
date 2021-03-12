package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "username")
	private String username;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "imagen")
	private String imagen;
	
	@Column(name = "fechaNacimiento")
	private String fechaNacimiento;
	
	@Column(name = "steamUser")
	private String steamUser;

	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Party> party;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Message> message;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Friendship> friendship;

	
	//Constructor
	public Usuario(int id, String username, String email, String password, String imagen, String fechaNacimiento,
			String steamUser, List<Party> party, List<Message> message, List<Friendship> friendship) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.imagen = imagen;
		this.fechaNacimiento = fechaNacimiento;
		this.steamUser = steamUser;
		this.party = party;
		this.message = message;
		this.friendship = friendship;
	}

	
	//Getters and Setters
	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public void setMessage(List<Message> message) {
		this.message = message;
	}

	public void setFriendship(List<Friendship> friendship) {
		this.friendship = friendship;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setParty(List<Party> party) {
		this.party = party;
	}

	/**
	 * @return the party
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Party")
	public List<Party> getParty() {
		return party;
	}
	
	/**
	 * @return the message
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Message")
	public List<Message> getMessage() {
		return message;
	}
	
	/**
	 * @return the friendship
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Friendship")
	public List<Friendship> getFriendship() {
		return friendship;
	}
	

}