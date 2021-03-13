package mavenEjercicio3;

package mavenEjercicio3;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * Clase que permite el acceso a la base de datos CRUD
 *
 */
public class ProyectoDao {

	public void registrarProyecto(Proyecto miProyecto)
		{
			Conexion conex= new Conexion();
			
			try {
				Statement st = conex.getConnection().createStatement();
				String sql= "INSERT INTO Proyecto VALUES ('"+miProyecto.getidProyecto()+"', '"
						+miProyecto.getNombreProyecto()"', '"+miProyecto.getHorasProyecto()+"');""');";
				st.executeUpdate(sql);
				JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
				System.out.println(sql);
				st.close();
				conex.desconectar();
				
			} catch (SQLException e) {
	            System.out.println(e.getMessage());
				JOptionPane.showMessageDialog(null, "No se Registro");
			}
		}

	public Proyecto buscarProyecto(int codigo) {
		Conexion conex = new Conexion();
		Proyecto Proyecto = new Proyecto();
		boolean existe = false;
		try {
			String sql = "SELECT * FROM proyecto where id = ? ";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			consulta.setInt(1, codigo);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				existe = true;
				proyecto.setIdPersona(Integer.parseInt(res.getString("id")));
				proyecto.setNombreProyecto(res.getString("nombre"));
				proyecto.setHorasPersona(Integer.parseInt(res.getString("horas")));


			}
			res.close();
			conex.desconectar();
			System.out.println(sql);

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se conecto");
			System.out.println(e);
		}

		if (existe) {
			return Proyecto;
		} else
			return null;
	}

	public void modificarProyecto(Proyecto miProyecto) {

		Conexion conex = new Conexion();
		try {
			String consulta = "UPDATE Proyecto SET id= ? ,nombre = ?, horas=? WHERE id= ? ";
			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);

			estatuto.setInt(1, miProyecto.getIdProyecto());
			estatuto.setString(2, miProyecto.getNombreProyecto());
			estatuto.setInt(1, miProyecto.getHorasProyecto());

			estatuto.executeUpdate();

			JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ", "Confirmación",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println(consulta);

		} catch (SQLException e) {

			System.out.println(e);
			JOptionPane.showMessageDialog(null, "Error al Modificar", "Error", JOptionPane.ERROR_MESSAGE);

		}
	}

	public void eliminarProyecto(String codigo) {
		Conexion conex = new Conexion();
		try {
			String sql = "DELETE FROM Proyecto WHERE id='" + codigo + "'";
			Statement st = conex.getConnection().createStatement();
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println(sql);
			st.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Elimino");
		}
	}

}

}

}
