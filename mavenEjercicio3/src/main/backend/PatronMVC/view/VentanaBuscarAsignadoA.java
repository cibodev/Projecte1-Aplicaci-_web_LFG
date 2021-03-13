package mavenEjercicio3;

public class VentanaBuscarAsignadoA {

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Backend.model.dto.AsignadoA;
import Backend.model.service.AsignadoAServ;
import Backend.controller.AsignadoAController;

public class VentanaBuscarAsignadoA extends JFrame implements ActionListener {

			private static final long serialVersionUID = 1L;

			private AsignadoAController AsignadoAController;
			private JLabel labelTitulo;
			private JTextField textCientifico, textProyecto;
			private JLabel cientifico, proyecto;
			private JButton botonGuardar, botonCancelar, botonBuscar, botonModificar, botonEliminar;

			/**
			 * constructor de la clase donde se inicializan todos los componentes
			 * de la ventana de busqueda
			 */
			public VentanaBuscarAsignadoA() {

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

				cientifico=new JLabel();
				cientifico.setText("Cientifico");
				cientifico.setBounds(20, 80, 80, 25);
				add(cientifico);
				
				proyecto=new JLabel();
				proyecto.setText("Proyecto");
				proyecto.setBounds(20, 120, 80, 25);
				add(proyecto);
				
				textCientifico=new JTextField();
				textcientifico.setBounds(80, 80, 80, 25);
				add(textCientifico);
				
				textProyecto=new JTextField();
				textProyecto.setBounds(80, 120, 190, 25);
				add(textProyecto);
				
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
				limpiar();
						
				setSize(480, 320);
				setTitle("Patron de Diseño/MVC");
				setLocationRelativeTo(null);
				setResizable(false);
				setLayout(null);

			}

			public void setCoordinador(AsignadoAController asignadoAController) {
				this.asignadoAController = asignadoAController;
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == botonGuardar) {
					try {
						Persona miAsignadoA = new AsignadoA();
						miAsignadoA.setCientificoAsignadoA(textCientifico.getText());
						miAsignadoA.setProyectoAsignadoA(textProyecto.getText());

						asignadoAController.modificarAsignadoA(miAsignadoA);

						if (AsignadoAServ.modificaAsignadoA == true) {
							habilita(true, false, false, false, false, true, false, true, true);
						}
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Error en el Ingreso de Datos", "Error", JOptionPane.ERROR_MESSAGE);
					}

				}

				if (e.getSource() == botonBuscar) {
					AsignadoA miAsignadoA = asignadoAController.buscarAsignadoA(textCientifico.getText());
					if (miAsignadoA != null) {
						muestraAsignadoA(miAsignadoA);
					} else if (AsignadoAServ.consultaAsignadoA == true) {
						JOptionPane.showMessageDialog(null, "La persona no Existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
					}
				}

				if (e.getSource() == botonModificar) {
					habilita(false, true, true, true, true, false, true, false, false);

				}

				if (e.getSource() == botonEliminar) {
					if (!textCientifico.getText().equals("")) {
						int respuesta = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar la Persona?",
								"Confirmación", JOptionPane.YES_NO_OPTION);
						if (respuesta == JOptionPane.YES_NO_OPTION) {
							asignadoAController.eliminarAsignadoA(textCientifico.getText());
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

			private void muestraAsignadoA(AsignadoA miAsignadoA) {
				textCientifico.setText(miAsignadoA.getCientificoAsignadoA());
				textProyecto.setProyecto(miAsignadoA.getProyectoAsignadoA() + "");
				habilita(true, false, false, false, false);
			}

		
			public void limpiar() {
				textCientifico.setText("");
				textProyecto.setText("");
				habilita(true, false, false, false, false);
			}

		
			public void habilita(boolean cientifico, boolean proyecto, boolean bBuscar,
					boolean bGuardar, boolean bModificar, boolean bEliminar) {
				textCientifico.setEditable(cientifico);
				textProyecto.setEditable(proyecto);
				botonBuscar.setEnabled(bBuscar);
				botonGuardar.setEnabled(bGuardar);
				botonModificar.setEnabled(bModificar);
				botonEliminar.setEnabled(bEliminar);
			}
		}

}

}
