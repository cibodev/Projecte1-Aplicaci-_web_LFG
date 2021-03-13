package mavenEjercicio3;

	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;

	import Backend.controller.CientificoController;
	import Backend.model.dto.Cientifico;


	public class VentanaRegistroCientifico extends JFrame implements ActionListener{

		
		private static final long serialVersionUID = 1L;
		private CientificoController cientificoController; //objeto personaController que permite la relacion entre esta clase y la clase PersonaController
		private JLabel labelTitulo;
		private JTextField textDNI,textNomApels;
		private JLabel dni, nomApels;
		private JButton botonGuardar,botonCancelar;
		
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

			dni=new JLabel();
			dni.setText("dni");
			dni.setBounds(20, 80, 80, 25);
			add(dni);
			
			nomApels=new JLabel();
			nomApels.setText("nomApels");
			nomApels.setBounds(20, 120, 80, 25);
			add(nomApels);
			
			textDNI=new JTextField();
			textDNI.setBounds(80, 80, 80, 25);
			add(textDNI);
			
			textNomApels=new JTextField();
			textNomApels.setBounds(80, 120, 190, 25);
			add(textNomApels);
			
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


		private void limpiar() 
		{
			textDNI.setText("");
			textNomApels.setText("");
		}


		public void setCoordinador(CientificoController cientificoController) {
			this.cientificoController=cientificoController;
		}


		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource()==botonGuardar)
			{
				try {
					Cientifico miCientifico=new Cientifico();
					miCientifico.setDNICientifico(textDNI.getText());
					miCientifico.setNomApelsCientifico(textNomApels.getText());

					
					cientificoController.registrarCientifico(miCientifico);	
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
					System.out.println(ex);
				}
			}
			if (e.getSource()==botonCancelar)
			{
				this.dispose();
			}
		}
		
		

	}

	
	
}
