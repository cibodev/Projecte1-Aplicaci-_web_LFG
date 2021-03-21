package es.http.service.dto;

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

	@ManyToOne
	@JoinColumn(name = "from")
	Usuario from;

	@Column(name = "message")
	private String message;

	@Column(name = "date")
	private String date;

	@ManyToOne
	@JoinColumn(name = "id_party")
	Party party;

	// Constructor
	public Message() {
	}

	public Message(int id, Usuario from, String message, String date, Party party) {
		super();
		this.id = id;
		this.from = from;
		this.message = message;
		this.date = date;
		this.party = party;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

}
