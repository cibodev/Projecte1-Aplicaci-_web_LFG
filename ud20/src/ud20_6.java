import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class ud20_6 extends JFrame {

	public static void main(String[] args) {
	}

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton boton1;
	private JLabel etiqueta3;
	private JTextField resultado;

	public ud20_6() {

		// Añadimos un titulo a la ventana //
		setTitle("Índice de masa corporal");

		// Coordenadas x y de la aplicación y su altura y longitud //
		setBounds(400, 200, 409, 147);

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

		// Etiqueta altura //
		JLabel etiqueta1 = new JLabel("Altura (metros)");
		etiqueta1.setBounds(10, 14, 91, 14);
		contentPane.add(etiqueta1);

		// Cuadro de texto //
		textField_1 = new JTextField();
		textField_1.setBounds(96, 11, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		// Etiqueta peso //
		JLabel etiqueta2 = new JLabel("Peso (Kg)");
		etiqueta2.setBounds(200, 14, 91, 14);
		contentPane.add(etiqueta2);

		// Cuadro de texto //
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(285, 11, 86, 20);
		contentPane.add(textField_2);

		// Botón calcular IMC //
		boton1 = new JButton("Calcular IMC");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double peso = Double.parseDouble(textField_1.getText());
				double altura = Double.parseDouble(textField_2.getText());
				double IMC = peso / (altura * altura);
			}
		});
		boton1.setBounds(91, 58, 99, 23);
		contentPane.add(boton1);

		// Etiqueta IMC //
		etiqueta3 = new JLabel("IMC");
		etiqueta3.setBounds(200, 62, 46, 14);
		contentPane.add(etiqueta3);

		// Etiqueta resultado //
		resultado = new JTextField();
		resultado.setBounds(227, 59, 86, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);

	}
}