package mavenEjercicio3;
	/*
	 * Esta parte del patrón es la que define la lógica de administración del sistema, 
	 * establece la conexión entre la vista y el modelo.
	 */


	import Backend.model.dto.Proyecto;
	import Backend.model.service.ProyectoServ;
	import Backend.view.VentanaBuscar;
	import Backend.view.VentanaPrincipal;
	import Backend.view.VentanaRegistro;


	public class ProyectoController {
		
		private ProyectoServ ProyectoServ;
		private VentanaPrincipal miVentanaPrincipal;
		private VentanaRegistro miVentanaRegistro;
		private VentanaBuscar miVentanaBuscar;
		
		//Metodos getter Setters de vistas
		public VentanaPrincipal getMiVentanaPrincipal() {
			return miVentanaPrincipal;
		}
		public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
			this.miVentanaPrincipal = miVentanaPrincipal;
		}
		public VentanaRegistro getMiVentanaRegistro() {
			return miVentanaRegistro;
		}
		public void setMiVentanaRegistro(VentanaRegistro miVentanaRegistro) {
			this.miVentanaRegistro = miVentanaRegistro;
		}
		public VentanaBuscar getMiVentanaBuscar() {
			return miVentanaBuscar;
		}
		public void setMiVentanaBuscar(VentanaBuscar miVentanaBuscar) {
			this.miVentanaBuscar = miVentanaBuscar;
		}
		public ProyectoServ getProyectoServ() {
			return ProyectoServ;
		}
		public void setProyectoServ(ProyectoServ proyectoServ) {
			this.ProyectoServ = proyectoServ;
		}
		
		//Hace visible las vistas de Registro y Consulta
		public void mostrarVentanaRegistro() {
			miVentanaRegistro.setVisible(true);
		}
		public void mostrarVentanaConsulta() {
			miVentanaBuscar.setVisible(true);
		}
		
		//Llamadas a los metodos CRUD de la capa service para validar los datos de las vistas
		public void registrarProyecto(Proyecto miProyecto) {
			proyectoServ.validarRegistro(miProyecto);
		}
		
		public Proyecto buscarProyecto(String codigoProyecto) {
			return proyectoServ.validarConsulta(codigoProyecto);
		}
		
		public void modificarProyecto(Proyecto miProyecto) {
			asignadoAServ.validarModificacion(miProyecto);
		}
		
		public void eliminarProyecto(String codigo) {
			proyectoServ.validarEliminacion(codigo);
		}


	}

	}

	
}
