package es.http.service.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Message {

	@Id
	@ManyToOne
	@JoinColumn(name = "from")
	Usuario from;
	
	@Column(name = "message")
	private String message;

	@Column(name = "date")
	private String date;
	
	@ManyToOne
	@JoinColumn(name = "id_party")
	Usuario id_party;

	public Message(Usuario from, String message, String date, Usuario id_party) {
		super();
		this.from = from;
		this.message = message;
		this.date = date;
		this.id_party = id_party;
	}

	public Usuario getFrom() {
		return from;
	}

	public void setFrom(Usuario from) {
		this.from = from;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Usuario getId_party() {
		return id_party;
	}

	public void setId_party(Usuario id_party) {
		this.id_party = id_party;
	}
	
	
	
	
}
