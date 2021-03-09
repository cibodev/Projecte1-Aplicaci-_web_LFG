package Backend.PatronMVC.model.dto;

public class Persona {

	private Integer idPersona;
	private String nombrePersona;
	private String apellidoPersona;
	private String direccionPersona;
	private Integer DNIPersona;
	private String fechaPersona;

// Get y set //	
	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getApellidoPersona() {
		return apellidoPersona;
	}

	public void setApellidoPersona(String apellidoPersona) {
		this.apellidoPersona = apelidoPersona;
	}

	public String getDireccionPersona() {
		return direccionPersona;
	}

	public void setDireccionPersona(String direccionPersona) {
		this.direccionPersona = direccionPersona;
	}

	public Integer getDNIPersona() {
		return DNIPersona;
	}

	public void setDNIPersona(Integer DNIPersona) {
		this.DNIPersona = DNIPersona;
	}

	public String getFechaPersona() {
		return fechaPersona;
	}

	public void setFechaPersona(String fechaPersona) {
		this.fechaPersona = fechaPersona;
	}

}
