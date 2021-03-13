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


	public class VentanaRegistroProyecto extends JFrame implements ActionListener{

		
		private static final long serialVersionUID = 1L;
		private ProyectoController proyectoController; //objeto personaController que permite la relacion entre esta clase y la clase PersonaController
		private JLabel labelTitulo;
		private JTextField textId,textNombre, textHoras;
		private JLabel Id, nombre, horas;
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

			id=new JLabel();
			id.setText("id");
			id.setBounds(20, 80, 80, 25);
			add(id);
			
			nombre=new JLabel();
			nombre.setText("nombre");
			nombre.setBounds(20, 120, 80, 25);
			add(nombre);
			
			horas=new JLabel();
			horas.setText("horas");
			horas.setBounds(20, 160, 80, 25);
			add(horas);
			
			textid=new JTextField();
			textid.setBounds(80, 80, 80, 25);
			add(textid);
			
			textNombre=new JTextField();
			textNombre.setBounds(80, 120, 190, 25);
			add(textNombre);
			
			textHoras=new JTextField();
			textHoras.setBounds(80, 160, 190, 25);
			add(textHoras);
			
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
			textid.setText("");
			textNombre.setText("");
			textHoras.setText("");
		}


		public void setCoordinador(ProyectoController proyectoController) {
			this.proyectoController=proyectoController;
		}


		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource()==botonGuardar)
			{
				try {
					Proyecto miProyecto=new Proyecto();
					miProyecto.setIdProyecto(textId.getText());
					miProyecto.setNombreProyecto(textNombre.getText());
					miProyecto.setHorasProyecto(textHoras.getText());

					
					proyectoController.registrarProyecto(miProyecto);	
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
