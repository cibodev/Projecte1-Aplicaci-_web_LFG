package ud18_ejercicio4;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import Appmain.conector;

public class salas {

	// METODO QUE CREA TABLAS MYSQL
	public static void createTable(String db, String name) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conector.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE " + name + ""
					+ "(Codigo INT IDENTITY PRIMARY KEY, Nombre NVARCHAR(100), Película INT)";
			Statement st = conector.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error creando tabla.");

		}

	}

	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertData(String db, String table_name, int codigo, String nombre, int pelicula) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conector.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + table_name + " (Codigo, Nombre, Pelicula) VALUE(" + "\"" + codigo + "\"," + "\""
					+ nombre + "\"," + "\"" + pelicula + "\"); ";
			Statement st = conector.conexion.createStatement();
			st.executeUpdate(Query);

			System.out.println("Datos almacenados correctamente");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}

	}

	// METODO QUE OBTIENE VALORES MYSQL
	public static void getValues(String db, String table_name) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conector.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "SELECT * FROM " + table_name;
			Statement st = conector.conexion.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(Query);

			while (resultSet.next()) {
				System.out.println("Codigo: " + resultSet.getString("Codigo") + " " + "Nombre: "
						+ resultSet.getString("Nombre") + " " + "Película: " + resultSet.getString("Película") + " ");
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}

	}

}
