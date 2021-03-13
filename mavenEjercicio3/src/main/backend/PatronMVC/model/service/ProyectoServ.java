/*
	 * Esta clase permite realizar las operaciones asociadas a la lógica de negocio
	 * como tal, desde ella realizamos las validaciones y llamadas a las operaciones
	 * CRUD del sistema.
	 * 
	 * En caso de que se requieran procesos adicionales asociados a la lógica de
	 * negocio, aquí será donde se creen los métodos para dichos procesos, por
	 * ejemplo el método validarRegistro determina si los datos son correctos y
	 * permite registrar la AsignadoA en el Dao.
	 */

package mavenEjercicio3;

public class ProyectoServ {

	import javax.swing.JOptionPane;

	import Backend.model.dao.ProyectoDao;
	import Backend.model.dto.Proyecto;
	import Backend.controller.ProyectoController;

	private ProyectoController ProyectoController;
	public static boolean consultaProyecto=false;
	public static boolean modificaProyecto=false;

	// Metodo de vinculación con el controller principal
	public void setProyectoController(ProyectoController ProyectoController) {
					this.setController(ProyectoController);		
				}

	// Metodo que valida los datos de Registro antes de pasar estos al DAO
	public void validarRegistro(Proyecto miProyecto) {
					ProyectoDao miProyectoDao;
					if (miProyecto.getIdProyecto() > 99) {
						miProyectoDao = new ProyectoDao();
						miProyectoDao.registrarProyecto(miProyecto);						
					}else {
						JOptionPane.showMessageDialog(null,"El documento Persona debe ser mas de 3 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
						
					}
					
				}

	// Metodo que valida los datos de consulta antes de pasar estos al DAO
	public Proyecto validarConsulta(String codigoProyecto) {
				ProyectoDao miProyectoDao;
					
					try {
						int codigo=Integer.parseInt(codigoProyecto);	
						if (codigo > 99) {
							ProyectoDao = new ProyectoDao();
							consultaProyecto=true;
							return miProyectoDao.buscarProyecto(codigo);						
						}else{
							JOptionPane.showMessageDialog(null,"El documento asignadoA debe ser mas de 3 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
							consultaAsignadoA=false;
						}
						
					}catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null,"Debe ingresar un dato numerico","Error",JOptionPane.ERROR_MESSAGE);
						consultaAsignadoA=false;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,"Se ha presentado un Error","Error",JOptionPane.ERROR_MESSAGE);
						consultaAsignadoA=false;
					}
								
					return null;
				}

	// Metodo que valida los datos de Modificación antes de pasar estos al DAO
	public void validarModificacion(Proyecto miProyecto) {
				ProyectoDao miProyectoDao;
					if (miProyecto.getNombreProyecto().length()>5) {
						miProyectoDao = new ProyectoDao();
						miProyectoDao.modificarProyecto(miProyecto);	
						modificaProyecto=true;
					}else{
						JOptionPane.showMessageDialog(null,"El nombre de la Persona debe ser mayor a 5 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
						modificaProyecto=false;
					}
				}

	// Metodo que valida los datos de Eliminación antes de pasar estos al DAO
	public void validarEliminacion(String codigo) {
				ProyectoDao miProyectoDao=new ProyectoDao();
					miProyectoDao.eliminarProyecto(codigo);
				}

	public ProyectoController getProyectoController() {
					return ProyectoController;
				}

	public void setController(ProyectoController ProyectoController) {
		this.ProyectoController = ProyectoController;
	}

}

}

}

}
