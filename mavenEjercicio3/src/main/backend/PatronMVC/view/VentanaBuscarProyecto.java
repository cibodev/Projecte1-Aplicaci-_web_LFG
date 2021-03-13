package mavenEjercicio3;

public class VentanaBuscarProyecto {

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Backend.model.dto.Proyecto;
import Backend.model.service.ProyectoServ;
import Backend.controller.ProyectoController;

public class VentanaBuscarProyecto extends JFrame implements ActionListener {

					private static final long serialVersionUID = 1L;

					private ProyectoController ProyectoController;
					private JLabel labelTitulo;
					private JTextField textid, textnombre;
					private JLabel id, nombre, horas;
					private JButton botonGuardar, botonCancelar, botonBuscar, botonModificar, botonEliminar;

					/**
					 * constructor de la clase donde se inicializan todos los componentes
					 * de la ventana de busqueda
					 */
					public VentanaBuscarProyecto() {

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
						horas.setBounds(20, 120, 80, 25);
						add(horas);
						
						textid=new JTextField();
						textid.setBounds(80, 80, 80, 25);
						add(textid);
						
						textnombre=new JTextField();
						textnombre.setBounds(80, 120, 190, 25);
						add(textnombre);
						
						texthoras=new JTextField();
						texthoras.setBounds(80, 120, 190, 25);
						add(texthoras);
						
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

					public void setCoordinador(ProyectoController ProyectoController) {
						this.ProyectoController = ProyectoController;
					}

					@Override
					public void actionPerformed(ActionEvent e) {
						if (e.getSource() == botonGuardar) {
							try {
								Proyecto miProyecto = new Proyecto();
								miProyecto.setidProyecto(textid.getText());
								miProyecto.setnombreProyecto(textnombre.getText());
								miProyecto.sethorasProyecto(texthoras.getText());

								ProyectoController.modificarProyecto(miProyecto);

								if (ProyectoServ.modificaProyecto == true) {
									habilita(true, false, false, false, false, true, false, true, true);
								}
							} catch (Exception e2) {
								JOptionPane.showMessageDialog(null, "Error en el Ingreso de Datos", "Error", JOptionPane.ERROR_MESSAGE);
							}

						}

						if (e.getSource() == botonBuscar) {
							Proyecto miProyecto = ProyectoController.buscarProyecto(textid.getText());
							if (miProyecto != null) {
								muestraProyecto(miProyecto);
							} else if (ProyectoServ.consultaProyecto == true) {
								JOptionPane.showMessageDialog(null, "La persona no Existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
							}
						}

						if (e.getSource() == botonModificar) {
							habilita(false, true, true, true, true, false, true, false, false);

						}

						if (e.getSource() == botonEliminar) {
							if (!textid.getText().equals("")) {
								int respuesta = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar el Proyecto?",
										"Confirmación", JOptionPane.YES_NO_OPTION);
								if (respuesta == JOptionPane.YES_NO_OPTION) {
									ProyectoController.eliminarProyecto(textid.getText());
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

					private void muestraProyecto(Proyecto miProyecto) {
						textid.setid(miProyecto.getidProyecto());
						textnombre.setnombre(miProyecto.getnombreProyecto() + "");
						texthoras.sethoras(miProyecto.gethorasProyecto()+"");
						habilita(true, false, false, false, false, false, true);
					}

				
					public void limpiar() {
						textid.setText("");
						textnombre.setText("");
						texthoras.setText("");
						habilita(true, false, false, false, false, true, false);
					}

				
					public void habilita(boolean id, boolean nombre, boolean horas, boolean bBuscar,
							boolean bGuardar, boolean bModificar, boolean bEliminar) {
						textid.setEditable(id);
						textnombre.setEditable(nombre);
						texthoras.setEditable(horas);
						botonBuscar.setEnabled(bBuscar);
						botonGuardar.setEnabled(bGuardar);
						botonModificar.setEnabled(bModificar);
						botonEliminar.setEnabled(bEliminar);
					}
				}

}

}

}

}
