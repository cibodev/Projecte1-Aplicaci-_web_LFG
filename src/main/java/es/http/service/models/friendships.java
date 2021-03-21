package proyecto;

public class friendships {
	private int id;
	private int id_usuario;
	private int id_usuario2;
	
	public friendships(int id_usuario, int id_usuario2) {
		this.id_usuario = id_usuario;
		this.id_usuario2 = id_usuario2;
	}

	public friendships() {
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public int getId_usuario2() {
		return id_usuario2;
	}

	public void setId_usuario2(int id_usuario2) {
		this.id_usuario2 = id_usuario2;
	}

	@Override
	public String toString() {
		return "friendships [id_usuario=" + id_usuario + ", id_usuario2=" + id_usuario2 + "]";
	}
	
	
}
