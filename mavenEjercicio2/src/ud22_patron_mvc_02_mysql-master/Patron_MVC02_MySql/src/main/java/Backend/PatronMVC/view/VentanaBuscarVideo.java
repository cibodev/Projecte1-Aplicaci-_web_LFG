package Backend.PatronMVC.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Backend.PatronMVC.model.dto.Video;
import Backend.PatronMVC.model.service.VideoServ;
import Backend.PatronMVC.controller.VideoController;

public class VentanaBuscarVideo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private VideoController videoController;
	private JLabel labelTitulo;
	private JTextField textCod, textTitle, textDirector, textCli_id;
	private JLabel cod, title, director, cli_id;
	private JButton botonGuardar, botonCancelar, botonBuscar, botonModificar, botonEliminar;

	/**
	 * constructor de la clase donde se inicializan todos los componentes
	 * de la ventana de busqueda
	 */
	public VentanaBuscar() {

		botonGuardar = new JButton();
		botonGuardar.setBounds(50, 220, 120, 25);
		botonGuardar.setText("Guardar");
		
		botonCancelar = new JButton();
		botonCancelar.setBounds(190, 250, 120, 25);
		botonCancelar.setText("Cancelar");
		
		botonBuscar = new JButton();
		botonBuscar.setBounds(170, 80, 50, 25);
		botonBuscar.setText("Ok");
		
		botonEliminar = new JButton();
		botonEliminar.setBounds(330, 220, 120, 25);
		botonEliminar.setText("Eliminar");
		
		botonModificar = new JButton();
		botonModificar.setBounds(190, 220, 120, 25);
		botonModificar.setText("Modificar");

		labelTitulo = new JLabel();
		labelTitulo.setText("ADMINISTRAR PERSONAS");
		labelTitulo.setBounds(120, 20, 380, 30);
		labelTitulo.setFont(new java.awt.Font("Verdana", 1, 18));

		cod=new JLabel();
		cod.setText("Codigo");
		cod.setBounds(20, 80, 80, 25);
		add(cod);
		
		nombre=new JLabel();
		nombre.setText("Title");
		nombre.setBounds(20, 120, 80, 25);
		add(nombre);

		telefono=new JLabel();
		telefono.setText("Director");
		telefono.setBounds(290, 160, 80, 25);
		add(telefono);
		
		textCod=new JTextField();
		textCod.setBounds(80, 80, 80, 25);
		add(textCod);
		
		textNombre=new JTextField();
		textNombre.setBounds(80, 120, 190, 25);
		add(textNombre);

		textTelefono=new JTextField();
		textTelefono.setBounds(340, 160, 80, 25);
		add(textTelefono);
		
		botonModificar.addActionListener(this);
		botonEliminar.addActionListener(this);
		botonBuscar.addActionListener(this);
		botonGuardar.addActionListener(this);
		botonCancelar.addActionListener(this);

		add(botonCancelar);
		add(botonBuscar);
		add(botonModificar);
		add(botonEliminar);
		add(botonGuardar);
		add(labelTitulo);
		limpiar();
				
		setSize(480, 320);
		setTitle("Patron de Diseño/MVC");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

	}

	public void setCoordinador(VideoController videoController) {
		this.videoController = videoController;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonGuardar) {
			try {
				Persona miVideo = new Persona();
				miVideo.setIdVideo(Integer.parseInt(textCod.getText()));
				miVideo.setTitleVideo(textTitle.getText());
				miVideo.setDirectorVideo(textDirector.getText());
				miVideo.setCli_idVideo(Integer.parseInt(textCli_id.getText()));

				videoController.modificarVideo(miVideo);

				if (VideoServ.modificaVideo == true) {
					habilita(true, false, false, false, false, true, false, true, true);
				}
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Error en el Ingreso de Datos", "Error", JOptionPane.ERROR_MESSAGE);
			}

		}

		if (e.getSource() == botonBuscar) {
			Video miVideo = videoController.buscarVideo(textCod.getText());
			if (miVideo != null) {
				muestraVideo(miVideo);
			} else if (VideoServ.consultaVideo == true) {
				JOptionPane.showMessageDialog(null, "La persona no Existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
			}
		}

		if (e.getSource() == botonModificar) {
			habilita(false, true, true, true, true, false, true, false, false);

		}

		if (e.getSource() == botonEliminar) {
			if (!textCod.getText().equals("")) {
				int respuesta = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar la Persona?",
						"Confirmación", JOptionPane.YES_NO_OPTION);
				if (respuesta == JOptionPane.YES_NO_OPTION) {
					videoController.eliminarVideo(textCod.getText());
					limpiar();
				}
			} else {
				JOptionPane.showMessageDialog(null, "Ingrese un numero de Documento", "Información",
						JOptionPane.WARNING_MESSAGE);
			}

		}
		if (e.getSource() == botonCancelar) {
			this.dispose();
		}

	}

	/**
	 * permite cargar los datos de la Video consultada
	 * 
	 * @param miVideo
	 */
	private void muestraVideo(Video miVideo) {
		textTitle.setText(miVideo.getTitleVideo());
		textDirector.setText(miVideo.getDirectorVideo() + "");
		textCli_id.setText(miVideo.getCli_idVideo() + "");
		habilita(true, false, false, false, false, true, false);
	}

	/**
	 * Permite limpiar los componentes
	 */
	public void limpiar() {
		textCod.setText("");
		textTitle.setText("");
		textDirector.setText("");
		textCli_id.setText("");
		habilita(true, false, false, false, false, true, false);
	}

	/**
	 * Permite habilitar los componentes para establecer una modificacion
	 * 
	 * @param codigo
	 * @param nombre
	 * @param edad
	 * @param tel
	 * @param profesion
	 * @param cargo
	 * @param bBuscar
	 * @param bGuardar
	 * @param bModificar
	 * @param bEliminar
	 */
	public void habilita(boolean codigo, boolean title, boolean director, boolean cli_id, boolean bBuscar,
			boolean bGuardar, boolean bModificar, boolean bEliminar) {
		textCod.setEditable(codigo);
		textTitle.setEditable(title);
		textDirector.setEditable(director);
		textCli_id.setEditable(cli_id);
		botonBuscar.setEnabled(bBuscar);
		botonGuardar.setEnabled(bGuardar);
		botonModificar.setEnabled(bModificar);
		botonEliminar.setEnabled(bEliminar);
	}
}
