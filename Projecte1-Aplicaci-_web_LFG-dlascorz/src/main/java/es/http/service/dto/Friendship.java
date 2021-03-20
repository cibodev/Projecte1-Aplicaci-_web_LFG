package es.http.service.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Friendship {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	Usuario id_usuario;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario2")
	Usuario id_usuario2;

	//Constructor
	public Friendship(int id, Usuario id_usuario, Usuario id_usuario2) {
		super();
		this.id = id;
		this.id_usuario = id_usuario;
		this.id_usuario2 = id_usuario2;
	}

	public Friendship() {
	}

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Usuario id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Usuario getId_usuario2() {
		return id_usuario2;
	}

	public void setId_usuario2(Usuario id_usuario2) {
		this.id_usuario2 = id_usuario2;
	}
		
	
}
