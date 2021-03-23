package com.bezkoder.springjwt.models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "usuario", uniqueConstraints = { @UniqueConstraint(columnNames = "username"),
		@UniqueConstraint(columnNames = "email") })
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotBlank
	@Size(max = 20)
	private String username;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;

	@NotBlank
	@Size(max = 120)
	private String password;

	@Column(name = "imagen")
	private String imagen;

	@Column(name = "birthdate")
	private String birthdate;

	@Column(name = "steamuser")
	private String steamuser;

	@OneToMany(orphanRemoval = true)
	@JoinColumn(name = "id")
	private List<Party> party;

	@OneToMany(orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	@JoinColumn(name = "id_usuario")
	private List<Message> message;

	@OneToMany(orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	@JoinColumn(name = "id")
	private List<Friendship> friendship;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	public Usuario() {
	}

	public Usuario(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	public Usuario(int id, String username, String email, String password, String imagen, String birthdate,String steamuser, List<Party> party, List<Message> message, List<Friendship> friendship) {
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

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
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

	public void setMessage(List<Message> message) {
		this.message = message;
	}

	public void setFriendship(List<Friendship> friendship) {
		this.friendship = friendship;
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
