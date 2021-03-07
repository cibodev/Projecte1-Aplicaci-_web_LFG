package ud18_ejercicio8;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import Appmain.conector;

public class reserva {

	// METODO QUE CREA TABLAS MYSQL
	public static void createTable(String db, String reserva) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conector.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE " + reserva + ""
					+ "(DNI VARCHAR(8) PRIMARY KEY, NumSerie CHAR(4), Comienzo DATETIME, Fin DATETIME)";
			Statement st = conector.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error creando tabla.");

		}

	}

	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertData(String db, String reserva, int DNI, int NumSerie, int Comienzo, int Fin) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conector.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + reserva + " (DNI, NumSerie, Comienzo, Fin) VALUE(" + "\"" + DNI + "\","
					+ "\"" + NumSerie + "\"," + "\"" + Comienzo + "\"" + Fin + "\"); ";
			Statement st = conector.conexion.createStatement();
			st.executeUpdate(Query);

			System.out.println("Datos almacenados correctamente");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}

	}

	// METODO QUE OBTIENE VALORES MYSQL
	public static void getValues(String db, String reserva) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conector.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "SELECT * FROM " + reserva;
			Statement st = conector.conexion.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(Query);

			while (resultSet.next()) {
				System.out.println("DNI: " + resultSet.getString("DNI") + " " + "NumSerie: "
						+ resultSet.getString("NumSerie") + " " + "Comienzo: " + resultSet.getString("Comienzo") + " "
						+ "Fin: " + resultSet.getString("Fin") + " ");
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}

	}

}
