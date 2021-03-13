package mavenEjercicio3;

	/*
	 * Esta parte del patrón es la que define la lógica de administración del sistema, 
	 * establece la conexión entre la vista y el modelo.
	 */


	import Backend.model.dto.Cientificos;
	import Backend.model.service.CientificosServ;
	import Backend.view.VentanaBuscar;
	import Backend.view.VentanaPrincipal;
	import Backend.view.VentanaRegistro;

	public class CientificosController {
		
		private CientificosServ CientificosServ;
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
		public CientificosServ getCientificosServ() {
			return CientificosServ;
		}
		public void setCientificosServ(CientificosServ cientificosServ) {
			this.CientificosServ = cientificosServ;
		}
		
		//Hace visible las vistas de Registro y Consulta
		public void mostrarVentanaRegistro() {
			miVentanaRegistro.setVisible(true);
		}
		public void mostrarVentanaConsulta() {
			miVentanaBuscar.setVisible(true);
		}
		
		//Llamadas a los metodos CRUD de la capa service para validar los datos de las vistas
		public void registrarCientificos(Cientificos miCientificos) {
			cientificosServ.validarRegistro(miCientificos);
		}
		
		public Cientificos buscarCientificos(String codigoCientificos) {
			return cientificosServ.validarConsulta(codigoCientificos);
		}
		
		public void modificarCientificos(Cientificos miCientificos) {
			cientificosServ.validarModificacion(miCientificos);
		}
		
		public void eliminarCientificos(String codigo) {
			cientificosServ.validarEliminacion(codigo);
		}


	}

	}

}
