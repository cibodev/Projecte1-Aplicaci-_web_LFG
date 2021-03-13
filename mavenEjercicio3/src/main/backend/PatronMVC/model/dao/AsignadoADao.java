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
	public class AsignadoADao {

		public void registrarAsignadoA(AsignadoA miAsignadoA)
		{
			Conexion conex= new Conexion();
			
			try {
				Statement st = conex.getConnection().createStatement();
				String sql= "INSERT INTO asignadoA VALUES ('"+miAsignadoA.getCientificoAsignadoA()+"', '"
						+miAsignadoA.getProyectoAsignadoA()+"');""');";
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

		public AsignadoA buscarAsignadoA(int codigo) {
			Conexion conex = new Conexion();
			AsignadoA asignadoA = new AsignadoA();
			boolean existe = false;
			try {
				String sql = "SELECT * FROM persona where id = ? ";
				PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
				consulta.setInt(1, codigo);
				ResultSet res = consulta.executeQuery();
				while (res.next()) {
					existe = true;
					asigandoA.setCientificoAsignadoA(res.getString("cientifico"));
					asignadoA.setProyectoAsignadoA(res.getString("proyecto"));


				}
				res.close();
				conex.desconectar();
				System.out.println(sql);

			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Error, no se conecto");
				System.out.println(e);
			}

			if (existe) {
				return asignadoA;
			} else
				return null;
		}

		public void modificarAsignadoA(AsignadoA miAsignadoA) {

			Conexion conex = new Conexion();
			try {
				String consulta = "UPDATE asignadoA SET cientifico= ? ,proyecto = ? WHERE id= ? ";
				PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);

				estatuto.setString(2, miAsignadoA.getCientificoAsignadoA());
				estatuto.setString(2, miAsignadoA.getProyectoAsignadoA());
				
				estatuto.executeUpdate();

				JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ", "Confirmación",
						JOptionPane.INFORMATION_MESSAGE);
				System.out.println(consulta);

			} catch (SQLException e) {

				System.out.println(e);
				JOptionPane.showMessageDialog(null, "Error al Modificar", "Error", JOptionPane.ERROR_MESSAGE);

			}
		}

		public void eliminarAsignadoA(String codigo) {
			Conexion conex = new Conexion();
			try {
				String sql = "DELETE FROM asignadoA WHERE id='" + codigo + "'";
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
