package es.http.service.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Party {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	Usuario id_usuario;
	
	@ManyToOne
	@JoinColumn(name = "id_game")
	Game id_game;

	
	//Constructor
	public Party(int id, String nombre, Usuario id_usuario, Game id_game) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.id_usuario = id_usuario;
		this.id_game = id_game;
	}


	public Party() {
	}

	//Getters and Setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Usuario getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(Usuario id_usuario) {
		this.id_usuario = id_usuario;
	}


	public Game getId_game() {
		return id_game;
	}


	public void setId_game(Game id_game) {
		this.id_game = id_game;
	}
	
	
	
	
	
}
