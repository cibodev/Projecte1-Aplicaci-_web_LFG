package Backend.PatronMVC;

import Backend.PatronMVC.controller.PersonaController;
import Backend.PatronMVC.model.service.PersonaServ;
import Backend.PatronMVC.view.VentanaBuscar;
import Backend.PatronMVC.view.VentanaPrincipal;
import Backend.PatronMVC.view.VentanaRegistro;

public class mainApp {

	PersonaServ mipersonaServ;
	VentanaPrincipal miVentanaPrincipal;
	VentanaBuscar miVentanaBuscar;
	VentanaRegistro miVentanaRegistro;
	PersonaController personaController;
	VideoServ miVideoServ;
	VentanaRegistroVideo miVentanaRegistroVideo;
	VentanaPrincipalVideo miVentanaPrincipalVideo;
	VentanaBuscarVideo miVentanaBuscarVideo;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		mainApp miPrincipal = new mainApp();
		miPrincipal.iniciar();
	}

	/**
	 * Permite instanciar todas las clases con las que trabaja el sistema
	 */
	private void iniciar() {
		/* Se instancian las clases */
		miVentanaPrincipal = new VentanaPrincipal();
		miVentanaRegistro = new VentanaRegistro();
		miVentanaBuscar = new VentanaBuscar();
		mipersonaServ = new PersonaServ();
		personaController = new PersonaController();
		miVideoServ = new VideoServ();
		miVentanaRegistroVideo = new VentanaRegistroVideo();
		miVentanaPrincipalVideo = new VentanaPrincipalVideo();
		miVentanaBuscarVideo = new VentanaBuscarVideo();

		/* Se establecen las relaciones entre clases */
		miVentanaPrincipal.setCoordinador(personaController);
		miVentanaRegistro.setCoordinador(personaController);
		miVentanaBuscar.setCoordinador(personaController);
		mipersonaServ.setpersonaController(personaController);
		miVideoServ.setpersonaController(personaController);
		miVentanaRegistroVideo.setCoordinador(personaController);
		miVentanaPrincipalVideo.setCoordinador(personaController);
		miVentanaBuscarVideo.setCoordinador(personaController);

		/* Se establecen relaciones con la clase coordinador */
		personaController.setMiVentanaPrincipal(miVentanaPrincipal);
		personaController.setMiVentanaRegistro(miVentanaRegistro);
		personaController.setMiVentanaBuscar(miVentanaBuscar);
		personaController.setPersonaServ(mipersonaServ);
		personaController.setVideoServ(mipersonaServ);
		personaController.setMiVentanaBuscarVideo(miVentanaBuscar);
		personaController.setMiVentanaRegistroVideo(miVentanaRegistro);
		personaController.setMiVentanaPrincipalVideo(miVentanaPrincipal);

		miVentanaPrincipal.setVisible(true);
	}

}
