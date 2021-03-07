import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ud20_7 extends JFrame {

	public static void main(String[] args) {
	}

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton boton1;
	private JLabel etiqueta3;
	private JTextField resultado;
	private JTextField texto1;
	private JTextField texto2;

	public ud20_7() {

		// Añadimos un titulo a la ventana //
		setTitle("Calculadora cambio de monedas");

		// Coordenadas x y de la aplicación y su altura y longitud //
		setBounds(400, 200, 472, 171);

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

		// Etiqueta cantidad a convertir //
		final JLabel etiqueta1 = new JLabel("Cantidad a convertir");
		etiqueta1.setBounds(10, 11, 122, 14);
		contentPane.add(etiqueta1);

		// Caja de texto 1 //
		texto1 = new JTextField();
		texto1.setBounds(126, 8, 86, 20);
		contentPane.add(texto1);
		texto1.setColumns(10);

		// Caja de texto 2 //
		texto2 = new JTextField();
		texto2.setColumns(10);
		texto2.setBounds(312, 8, 112, 20);
		contentPane.add(texto2);

		// Etiqueta resultado //
		final JLabel etiqueta2 = new JLabel("Resultado");
		etiqueta2.setBounds(254, 11, 122, 14);
		contentPane.add(etiqueta2);

		// Botón Euros a pesetas //
		JButton boton2 = new JButton("Euros a ptas");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double euros = Double.parseDouble(texto1.getText());
				resultado.setText(String.valueOf(+euros * 166.386));
			}
		});
		boton2.setBounds(90, 53, 122, 23);
		contentPane.add(boton2);

		// Botón cambiar //
		JButton boton3 = new JButton("Cambiar");
		boton3.setBounds(254, 53, 89, 23);
		contentPane.add(boton3);

		// Botón borrar //
		JButton boton5 = new JButton("Borrar");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiqueta1.setText(null);
				etiqueta2.setText(null);
			}
		});
		boton5.setBounds(254, 87, 89, 23);
		contentPane.add(boton5);

		// Botón pesetas a Euros //
		JButton boton4 = new JButton("Ptas a Euros");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pesetas = Double.parseDouble(texto1.getText());
				resultado.setText(String.valueOf(+pesetas / 166.386));
			}
		});
		boton4.setBounds(90, 87, 122, 23);
		contentPane.add(boton4);
	}
}