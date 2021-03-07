package ud18_ejercicio8;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import Appmain.conector;

public class investigadores {

	// METODO QUE CREA TABLAS MYSQL
	public static void createTable(String db, String investigadores) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conector.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE " + investigadores + ""
					+ "(DNI VARCHAR(8) PRIMARY KEY, NomApels NVARCHAR(255), Facultat INT)";
			Statement st = conector.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error creando tabla.");

		}

	}

	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertData(String db, String investigadores, int DNI, String NomApels, int Facultat) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conector.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + investigadores + " (DNI, NomApels, Facultat) VALUE(" + "\"" + DNI + "\","
					+ "\"" + NomApels + "\"," + "\"" + Facultat + "\"); ";
			Statement st = conector.conexion.createStatement();
			st.executeUpdate(Query);

			System.out.println("Datos almacenados correctamente");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}

	}

	// METODO QUE OBTIENE VALORES MYSQL
	public static void getValues(String db, String investigadores) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conector.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "SELECT * FROM " + investigadores;
			Statement st = conector.conexion.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(Query);

			while (resultSet.next()) {
				System.out.println("DNI: " + resultSet.getString("DNI") + " " + "NomApels: "
						+ resultSet.getString("NomApels") + " " + "Facultat: " + resultSet.getString("Facultat") + " ");
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}

	}

}
