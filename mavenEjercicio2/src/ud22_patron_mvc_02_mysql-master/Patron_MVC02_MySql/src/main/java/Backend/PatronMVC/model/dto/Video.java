package Backend.PatronMVC.model.dto;

public class Video {

	private Integer idVideo;
	private String tituloVideo;
	private String directorVideo;
	private Integer cli_idVideo;

// Get y set //	
	public Integer getIdVideo() {
		return idVideo;
	}

	public void setIdVideo(Integer idVideo) {
		this.idVideo = idVideo;
	}

	public String getTituloVideo() {
		return tituloVideo;
	}

	public void setTituloVideo(String tituloVideo) {
		this.tituloVideo = tituloVideo;
	}

	public String getDirectorVideo() {
		return directorVideo;
	}

	public void setDirectorVideo(String directorVideo) {
		this.directorVideo = directorVideo;
	}

	public Integer getCli_idVideo() {
		return cli_idVideo;
	}

	public void setCli_idVideo(Integer cli_idVideo) {
		this.cli_idVideo = cli_idVideo;
	}

}
