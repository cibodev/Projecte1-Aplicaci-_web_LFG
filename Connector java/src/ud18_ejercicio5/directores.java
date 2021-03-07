package ud18_ejercicio5;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import Appmain.conector;

public class directores {

	// METODO QUE CREA TABLAS MYSQL
	public static void createTable(String db, String name) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conector.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE " + name + ""
					+ "(DNI VARCHAR(8) PRIMARY KEY, NomApels NVARCHAR(255), DNIjefe VARCHAR(8), Despacho INT)";
			Statement st = conector.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error creando tabla.");

		}

	}

	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertData(String db, String table_name, int DNI, String NomApels, int DNIjefe, int Despacho) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conector.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + table_name + " (DNI, NomApels, DNIjefe, Despacho) VALUE(" + "\"" + DNI
					+ "\"," + "\"" + NomApels + "\"," + "\"" + DNIjefe + "\"" + Despacho + "\"); ";
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
				System.out.println("DNI: " + resultSet.getString("DNI") + " " + "NomApels: "
						+ resultSet.getString("NomApels") + " " + "DNIjefe: " + resultSet.getString("DNIjefe") + " "
						+ "Despacho: " + resultSet.getString("Despacho") + " ");
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}

	}

}
