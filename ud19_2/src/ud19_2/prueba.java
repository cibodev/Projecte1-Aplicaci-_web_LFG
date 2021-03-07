package ud19_2;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class prueba extends JFrame {

	public static void main(String[] args) {
		prueba ventana = new prueba(null);
	}

	private JPanel contentPane;
	private AbstractButton textFieldNombre;
	JComboBox cmbPeliculas;

	public prueba(JTextField txtPeliculas) {

		// Añadimos un titulo a la ventana //
		setTitle("Películas");

		// Coordenadas x y de la aplicación y su altura y longitud //
		setBounds(400, 200, 462, 223);

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

		// Creación de componentes //
		JLabel etiqueta = new JLabel("Escribe el título de una película:");
		etiqueta.setHorizontalAlignment(SwingConstants.LEFT);
		etiqueta.setBounds(20, 28, 212, 20);

		// Colocamos el componente //
		etiqueta.setBounds(70, 28, 173, 20);

		// Añadimos el elemento al panel //
		contentPane.add(etiqueta);

		// Campo de texto para escribir el nombre de la película //
		txtPeliculas = new JTextField();
		txtPeliculas.setBounds(49, 79, 173, 26);
		contentPane.add(txtPeliculas);

		// Botón añadir //
		JButton btnPulsame = new JButton("Añadir");

		// Botón para añadir las películas al desplegable //
		btnPulsame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pelicula = btnPulsame.getText();
				cmbPeliculas.addItem(pelicula);
				JOptionPane.showMessageDialog(btnPulsame, e);
			}
		});
		btnPulsame.setBounds(93, 126, 89, 23);
		contentPane.add(btnPulsame);

		// Botón películas //
		JLabel lblNewLabel = new JLabel("Películas");
		lblNewLabel.setBounds(307, 31, 79, 14);
		contentPane.add(lblNewLabel);

		JComboBox cmbPeliculas = new JComboBox();
		cmbPeliculas.setBounds(265, 81, 133, 22);
		contentPane.add(cmbPeliculas);
		cmbPeliculas.addItem(etiqueta);

		setVisible(true);
	}
}
