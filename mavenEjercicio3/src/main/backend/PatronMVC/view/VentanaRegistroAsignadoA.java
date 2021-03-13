package mavenEjercicio3;

	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;

	import Backend.controller.AsignadoAController;
	import Backend.model.dto.AsignadoA;


	public class VentanaRegistroAsignadoA extends JFrame implements ActionListener{

		
		private static final long serialVersionUID = 1L;
		private AsignadoAController asignadoAController; //objeto personaController que permite la relacion entre esta clase y la clase PersonaController
		private JLabel labelTitulo;
		private JTextField textCientifico,textProyecto;
		private JLabel cientifico, proyecto;
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

			cientifico=new JLabel();
			cientifico.setText("cientifico");
			cientifico.setBounds(20, 80, 80, 25);
			add(cientifico);
			
			proyecto=new JLabel();
			proyecto.setText("Proyecto");
			proyecto.setBounds(20, 120, 80, 25);
			add(proyecto);
			
			textCientifico=new JTextField();
			textCientifico.setBounds(80, 80, 80, 25);
			add(textCientifico);
			
			textProyecto=new JTextField();
			textProyecto.setBounds(80, 120, 190, 25);
			add(textProyecto);
			
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
			textCientifico.setText("");
			textProyecto.setText("");
		}


		public void setCoordinador(AsignadoAController asignadoAController) {
			this.asignadoAController=asignadoAController;
		}


		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource()==botonGuardar)
			{
				try {
					AsignadoA miAsignadoA=new AsignadoA();
					miAsignadoA.setCientificoAsignadoA(textCientifico.getText());
					miAsignadoA.setProyectoAsignadoA(textProyecto.getText());

					
					asignadoAController.registrarAsignadoA(miAsignadoA);	
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
