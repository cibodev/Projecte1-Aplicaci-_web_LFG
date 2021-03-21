package proyecto;

import java.sql.*;

public class conexion {
	static String bd = "proyecto";
	static String login = "";
	static String password = "";
	static String url = "";
	
	Connection con = null;
	
	public void Conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, login, password);
			
			if (con!=null) {
				System.out.println("Conexion realizada con exito");
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public Connection getConection() {
		return con;
	}
	
	public void Disconect() {
		con=null;
	}
}
