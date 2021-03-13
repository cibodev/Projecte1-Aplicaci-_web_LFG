package Backend.PatronMVC;

	import Backend.PatronMVC.controller.AsignadoAController;
	import Backend.PatronMVC.controller.CientificosController;
	import Backend.PatronMVC.controller.ProyectoController;

	import Backend.PatronMVC.model.service.AsignadoAServ;
	import Backend.PatronMVC.model.service.CientificosServ;
	import Backend.PatronMVC.model.service.ProyectoServ;

	import Backend.PatronMVC.view.VentanaBuscarAsignadoA;
	import Backend.PatronMVC.view.VentanaBuscarCientificos;
	import Backend.PatronMVC.view.VentanaBuscarProyecto;

	import Backend.PatronMVC.view.VentanaPrincipalAsignadoA;
	import Backend.PatronMVC.view.VentanaPrincipalCientificos;
	import Backend.PatronMVC.view.VentanaPrincipalProyecto;

	import Backend.PatronMVC.view.VentanaRegistroAsignadoA;
	import Backend.PatronMVC.view.VentanaRegistroCientificos;
	import Backend.PatronMVC.view.VentanaRegistroProyecto;


	public class mainApp {
		
		AsignadoAServ miAsignadoAServ;
		CientificosServ miCientificosAServ;
		ProyectoServ miProyectoServ;

		VentanaPrincipalAsignadoA miVentanaPrincipalAsignadoA;
		VentanaPrincipalCientificos miVentanaPrincipalCientificos;
		VentanaPrincipalProyecto miVentanaPrincipalProyecto;

		VentanaBuscarAsignadoA miVentanaBuscarAsignadoA;
		VentanaBuscarCientificos miVentanaBuscarCientificos;
		VentanaBuscarProyecto miVentanaBuscarProyecto;

		VentanaRegistroAsignadoA miVentanaRegistroAsignadoA;
		VentanaRegistroCientificos miVentanaRegistroCientificos;
		VentanaRegistroProyecto miVentanaRegistroProyecto;

		asignadoAController AsignadoAController;
		cientificosController CientificosController;
		proyectoController ProyectoController;


		/**
		 * @param args
		 */
		public static void main(String[] args) {
			mainApp miPrincipal=new mainApp();
			miPrincipal.iniciar();
		}

		/**
		 * Permite instanciar todas las clases con las que trabaja
		 * el sistema
		 */
		private void iniciar() {
			/*Se instancian las clases*/
			miVentanaPrincipalAsignadoA=new VentanaPrincipalAsignadoA();
			miVentanaPrincipalCientifico=new VentanaPrincipalCientifico();
			miVentanaPrincipalProyecto=new VentanaPrincipalProyecto();

			
			miVentanaRegistroAsignadoA=new VentanaRegistroAsignadoA();
			miVentanaRegistroCientifico=new VentanaRegistroCientifico();
			miVentanaRegistroProyecto=new VentanaRegistroProyecto();

			
			miVentanaBuscarAsignadoA= new VentanaBuscarAsignadoA();
			miVentanaBuscarCientifico= new VentanaBuscarCientifico();
			miVentanaBuscarProyecto= new VentanaBuscarProyecto();

			
			miasignadoAServ=new AsignadoAServ();
			micientificoServ=new CientificoServ();
			miproyectoServ=new ProyectoServ();

			
			asignadoAController= new AsignadoAController();
			cientificoController= new CientificoController();
			proyectoController= new ProyectoController();

			
			/*Se establecen las relaciones entre clases*/
			miVentanaPrincipalAsignadoA.setCoordinador(asignadoAController);
			miVentanaPrincipalCientifico.setCoordinador(cientificoController);
			miVentanaPrincipalProyecto.setCoordinador(proyectoController);

			
			miVentanaRegistroAsignadoA.setCoordinador(asignadoAController);
			miVentanaRegistroCientifico.setCoordinador(cientificoController);
			miVentanaRegistroProyecto.setCoordinador(proyectoController);

			
			
			miVentanaBuscarAsignadoA.setCoordinador(asignadoAController);
			miVentanaBuscarCientifico.setCoordinador(cientificoController);
			miVentanaBuscarProyecto.setCoordinador(proyectoController);

			mipersonaServAsignadoA.setasignadoAController(asignadoAController);
			mipersonaServCientifico.setcientificoController(cientificoController);
			mipersonaServProyecto.setproyectoController(proyectoController);

			
			/*Se establecen relaciones con la clase coordinador*/
			asignadoAController.setMiVentanaPrincipalAsignadoA(miVentanaPrincipal);
			asignadoAController.setMiVentanaRegistroAsignadoA(miVentanaRegistro);
			asignadoAController.setMiVentanaBuscarAsignadoA(miVentanaBuscar);
			asignadoAController.setPersonaServAsignadoA(miasignadoAServ);
					
			
			cientificosController.setMiVentanaPrincipalCientificos(miVentanaPrincipal);
			cientificosController.setMiVentanaRegistroCientificos(miVentanaRegistro);
			cientificosController.setMiVentanaBuscarCientificos(miVentanaBuscar);
			cientificosController.setPersonaServCientificos(micientificosServ);
			
			proyectoController.setMiVentanaPrincipalProyecto(miVentanaPrincipal);
			proyectoController.setMiVentanaRegistroProyecto(miVentanaRegistro);
			proyectoController.setMiVentanaBuscarProyecto(miVentanaBuscar);
			proyectoController.setPersonaServProyecto(miproyectoServ);
			
			
			miVentanaPrincipalAsignadoA.setVisible(true);
			miVentanaPrincipalCientifico.setVisible(true);
			miVentanaPrincipalProyecto.setVisible(true);

		}

	}

}
