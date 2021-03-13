package mavenEjercicio3;

/*
 * Esta parte del patrón es la que define la lógica de administración del sistema, 
 * establece la conexión entre la vista y el modelo.
 */


	import Backend.model.dto.AsignadoA;
	import Backend.model.service.AsignadoAServ;
	import Backend.view.VentanaBuscar;
	import Backend.view.VentanaPrincipal;
	import Backend.view.VentanaRegistro;

public class AsignadoAController {
	
	private AsignadoAServ AsignadoAServ;
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
	public AsignadoAServ getAsignadoAServ() {
		return AsignadoAServ;
	}
	public void setAsignadoAServ(AsignadoAServ asignadoAServ) {
		this.AsignadoAServ = asignadoAServ;
	}
	
	//Hace visible las vistas de Registro y Consulta
	public void mostrarVentanaRegistro() {
		miVentanaRegistro.setVisible(true);
	}
	public void mostrarVentanaConsulta() {
		miVentanaBuscar.setVisible(true);
	}
	
	//Llamadas a los metodos CRUD de la capa service para validar los datos de las vistas
	public void registrarAsignadoA(AsignadoA miAsignadoA) {
		asignadoAServ.validarRegistro(miAsignadoA);
	}
	
	public AsignadoA buscarAsignadoA(String codigoAsignadoA) {
		return asignadoAServ.validarConsulta(codigoAsignadoA);
	}
	
	public void modificarAsignadoA(AsignadoA miAsignadoA) {
		asignadoAServ.validarModificacion(miAsignadoA);
	}
	
	public void eliminarAsignadoA(String codigo) {
		asignadoAServ.validarEliminacion(codigo);
	}


}

}
