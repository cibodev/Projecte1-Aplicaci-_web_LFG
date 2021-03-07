package ud18_ejercicio6;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import Appmain.conector;

public class suministra {

	// METODO QUE CREA TABLAS MYSQL
	public static void createTable(String db, String suministra) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conector.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE " + suministra + ""
					+ "(CodigoPieza INT PRIMARY KEY, IdProveedor CHAR(4), Precio INT)";
			Statement st = conector.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error creando tabla.");

		}

	}

	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertData(String db, String suministra, int CodigoPieza, String IdProveedor, int Precio) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conector.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + suministra + " (CodigoPieza, IdProveedor, Precio) VALUE(" + "\""
					+ CodigoPieza + "\"," + "\"" + IdProveedor + "\"," + "\"" + Precio + "\"); ";
			Statement st = conector.conexion.createStatement();
			st.executeUpdate(Query);

			System.out.println("Datos almacenados correctamente");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}

	}

	// METODO QUE OBTIENE VALORES MYSQL
	public static void getValues(String db, String suministra) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conector.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "SELECT * FROM " + suministra;
			Statement st = conector.conexion.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(Query);

			while (resultSet.next()) {
				System.out.println("CodigoPieza: " + resultSet.getString("CodigoPieza") + " " + "IdProveedor: "
						+ resultSet.getString("IdProveedor") + " " + "Precio: " + resultSet.getString("Precio") + " ");
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}

	}

}
