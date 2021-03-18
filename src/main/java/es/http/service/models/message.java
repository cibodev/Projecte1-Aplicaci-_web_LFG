package proyecto;

public class message {
	private int from;
	private String message;
	private String date;
	private int id_party;
		
	public message(int from, String message, String date, int id_party) {
		this.from = from;
		this.message = message;
		this.date = date;
		this.id_party = id_party;
	}

	public message() {
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
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

	public int getId_party() {
		return id_party;
	}

	public void setId_party(int id_party) {
		this.id_party = id_party;
	}

	@Override
	public String toString() {
		return "message [from=" + from + ", message=" + message + ", date=" + date + ", id_party=" + id_party + "]";
	}
	
	
}
