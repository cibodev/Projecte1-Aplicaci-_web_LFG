package Backend.PatronMVC.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Backend.PatronMVC.controller.PersonaController;
import Backend.PatronMVC.model.dto.Video;

public class VentanaRegistroVideo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private PersonaController personaController; // objeto personaController que permite la relacion entre esta clase y
													// la clase PersonaController
	private JLabel labelTitulo;
	private JTextField textCod, textTitulo, textDirector, textCli_id;
	private JLabel cod, titulo, director, cli_id;
	private JButton botonGuardar, botonCancelar;

	/**
	 * constructor de la clase donde se inicializan todos los componentes
	 * de la ventana de registro
	 */
	public VentanaRegistro() {

		botonGuardar = new JButton();
		botonGuardar.setBounds(110, 220, 120, 25);
		botonGuardar.setText("Registrar");
		
		botonCancelar = new JButton();
		botonCancelar.setBounds(250, 220, 120, 25);
		botonCancelar.setText("Cancelar");

		labelTitulo = new JLabel();
		labelTitulo.setText("REGISTRO DE PERSONAS");
		labelTitulo.setBounds(120, 20, 380, 30);
		labelTitulo.setFont(new java.awt.Font("Verdana", 1, 18));

		cod=new JLabel();
		cod.setText("Codigo");
		cod.setBounds(20, 80, 80, 25);
		add(cod);
		
		titulo=new JLabel();
		titulo.setText("Titulo");
		titulo.setBounds(20, 120, 80, 25);
		add(titulo);

		director=new JLabel();
		director.setText("Director");
		director.setBounds(290, 160, 80, 25);
		add(director);
		
		cli_id=new JLabel();
		cli_id.setText("Cli_id");
		cli_id.setBounds(290, 120, 80, 25);
		add(cli_id);
		
		textCod=new JTextField();
		textCod.setBounds(80, 80, 80, 25);
		add(textCod);
		
		textTitulo=new JTextField();
		textTitulo.setBounds(80, 120, 190, 25);
		add(textTitulo);

		textDirector=new JTextField();
		textDirector.setBounds(340, 160, 80, 25);
		add(textDirector);
		
		textCli_id=new JTextField();
		textCli_id.setBounds(340, 120, 80, 25);
		add(textCli_id);
		
		botonGuardar.addActionListener(this);
		botonCancelar.addActionListener(this);
		add(botonCancelar);
		add(botonGuardar);
		add(labelTitulo);
		limpiar();
		setSize(480, 300);
		setTitle("Patron de Diseño/MVC");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

	}

	private void limpiar() {
		textCod.setText("");
		textTitulo.setText("");
		textDirector.setText("");
		textCli_id.setText("");
	}

	public void setCoordinador(PersonaController personaController) {
		this.personaController = personaController;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonGuardar) {
			try {
				Persona miVideo = new Persona();
				miVideo.setIdPersona(Integer.parseInt(textCod.getText()));
				miVideo.setTituloVideo(textTitulo.getText());
				miVideo.setDirectorVideo(textDirector.getText());
				miVideo.setCli_idVideo(Integer.parseInt(textCli_id.getText()));

				personaController.registrarPersona(miPersona);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Error en el Ingreso de Datos", "Error", JOptionPane.ERROR_MESSAGE);
				System.out.println(ex);
			}
		}
		if (e.getSource() == botonCancelar) {
			this.dispose();
		}
	}

}
