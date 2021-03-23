package com.bezkoder.springjwt.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="message")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "message")
	private String message;

	@Column(name = "fecha")
	private String fecha;

	@ManyToOne
	@JoinColumn(name = "id_party")
	Party party;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	Usuario id_usuario;
	// Constructor
	public Message() {
	}

	public Message(int id, String message, String fecha, Party party,Usuario id_usuario) {
		super();
		this.id = id;
		this.id_usuario = id_usuario;
		this.message = message;
		this.fecha = fecha;
		this.party = party;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getId_usuario() {
		return id_usuario ;
	}

	public void setId_usuario(Usuario id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

}
