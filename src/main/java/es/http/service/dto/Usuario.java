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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usuario")
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

	@Column(name = "birthdate")
	private String birthdate;

	@Column(name = "steamuser")
	private String steamuser;

	@OneToMany(orphanRemoval=true)
	@JoinColumn(name = "id")
	private List<Party> party;

	@OneToMany(orphanRemoval=true)
	@JoinColumn(name = "from")
	private List<Message> message;

	@OneToMany(orphanRemoval=true)
	@JoinColumn(name = "id")
	private List<Friendship> friendship;

	// Constructor
	public Usuario(int id, String username, String email, String password, String imagen, String birthdate,
			String steamuser, List<Party> party, List<Message> message, List<Friendship> friendship) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.imagen = imagen;
		this.birthdate = birthdate;
		this.steamuser = steamuser;
		this.party = party;
		this.message = message;
		this.friendship = friendship;
	}

	public Usuario() {

	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getSteamuser() {
		return steamuser;
	}

	public void setSteamuser(String steamuser) {
		this.steamuser = steamuser;
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

	public void setMessage(List<Message> message) {
		this.message = message;
	}

	public void setFriendship(List<Friendship> friendship) {
		this.friendship = friendship;
	}

	public void setParty(List<Party> party) {
		this.party = party;
	}

}