package ud19_3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;

public class ud19_3 extends JFrame {

	public static void main(String[] args) {
	}

	private JPanel contentPane;

	public ud19_3() {

		// Añadimos un titulo a la ventana //
		setTitle("Mini Encuesta");

		// Coordenadas x y de la aplicación y su altura y longitud //
		setBounds(400, 200, 455, 318);

		// Indicamos que cuando se cierre la ventana se acaba la aplicación //
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Hacemos visible la ventana //
		setVisible(true);

		// Creamos el panel //
		contentPane = new JPanel();

		// Indicamos su diseño //
		contentPane.setLayout(null);

		// Asignamos el panel a la ventana //
		setContentPane(contentPane);

		// Botón para asignar el sistema operativo //
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setBounds(45, 49, 109, 23);
		contentPane.add(rdbtnNewRadioButton);

		// Sistema operativo //
		JLabel lblNewLabel = new JLabel("Elige un sistema operativo");
		lblNewLabel.setBounds(49, 25, 156, 14);
		contentPane.add(lblNewLabel);

		// Botón para asignar el sistema operativo //
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		rdbtnNewRadioButton_1.setBounds(45, 85, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);

		// Botón para asignar el sistema operativo //
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		rdbtnNewRadioButton_2.setBounds(45, 127, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);

		// Elegir especialidad //
		JLabel lblEligeTuEspecialidad = new JLabel("Elige tu especialidad");
		lblEligeTuEspecialidad.setBounds(261, 25, 156, 14);
		contentPane.add(lblEligeTuEspecialidad);

		// Botón para asignar la especialidad //
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programación");
		chckbxNewCheckBox.setBounds(261, 49, 97, 23);
		contentPane.add(chckbxNewCheckBox);

		// Botón para asignar la especialidad //
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño gráfico");
		chckbxNewCheckBox_1.setBounds(261, 84, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);

		// Botón para asignar la especialidad //
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administración");
		chckbxNewCheckBox_2.setBounds(261, 124, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);

		// Slider de puntuación //
		JSlider slider = new JSlider();
		slider.setMaximum(10);
		slider.setBounds(102, 207, 200, 26);
		contentPane.add(slider);

		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setBounds(87, 207, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("10");
		lblNewLabel_2.setBounds(312, 207, 46, 14);
		contentPane.add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.setBounds(168, 244, 89, 23);
		contentPane.add(btnNewButton);

		setVisible(true);

		// Muestra por pantalla los datos seleccionados //
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mostrar = "Encuesta: ";
				if (rdbtnNewRadioButton.isSelected()) {
					mostrar += rdbtnNewRadioButton.getText();
				}
				if (rdbtnNewRadioButton_1.isSelected()) {
					mostrar += rdbtnNewRadioButton_1.getText();
				}
				if (rdbtnNewRadioButton_2.isSelected()) {
					mostrar += rdbtnNewRadioButton_2.getText();
				}
				if (chckbxNewCheckBox.isSelected()) {
					mostrar += chckbxNewCheckBox.getText();
				}
				if (chckbxNewCheckBox_1.isSelected()) {
					mostrar += chckbxNewCheckBox_1.getText();
				}
				if (chckbxNewCheckBox_2.isSelected()) {
					mostrar += chckbxNewCheckBox_2.getText();
				}
				mostrar += "Horas: " + slider.getValue();
				JOptionPane.showMessageDialog(null, mostrar);

			}

		});

	}
}
