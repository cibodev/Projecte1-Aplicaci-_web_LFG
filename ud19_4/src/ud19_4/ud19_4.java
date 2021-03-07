package ud19_4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ud19_4 extends JFrame implements ActionListener{

	public static void main(String[] args) {
	}

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public ud19_4() {

		// Añadimos un titulo a la ventana //
		setTitle("Calculadora");

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

		// JLabel operando 1, 2 y resultado //
		JLabel operando1 = new JLabel("Operando 1");
		operando1.setBounds(22, 45, 90, 14);
		contentPane.add(operando1);

		JLabel operando2 = new JLabel("Operando 2");
		operando2.setBounds(22, 93, 90, 14);
		contentPane.add(operando2);

		JLabel resultado = new JLabel("Resultado: ");
		resultado.setBounds(22, 209, 90, 14);
		contentPane.add(resultado);

		// Botón de salir //
		JButton exit = new JButton("EXIT");
		exit.setBounds(340, 245, 89, 23);
		contentPane.add(exit);

		// Botones de suma, resta, multiplicar y dividir //
		JButton suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operando1.setText(suma.getText());
			}
		});
		suma.setBounds(208, 36, 89, 23);
		contentPane.add(suma);

		JButton resta = new JButton("-");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operando1.setText(resta.getText());
			}
		});
		resta.setBounds(323, 36, 89, 23);
		contentPane.add(resta);

		JButton multiplicacion = new JButton("X");
		multiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operando1.setText(multiplicacion.getText());

			}
		});
		multiplicacion.setBounds(208, 112, 89, 23);
		contentPane.add(multiplicacion);

		JButton division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operando1.setText(division.getText());
			}
		});
		division.setBounds(323, 112, 89, 23);
		contentPane.add(division);

		textField = new JTextField();
		textField.setBounds(93, 42, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(93, 90, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(93, 206, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		// Botón resultado //
		JButton about = new JButton("ABOUT");
		about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operando1.getText().equals("+")) {
					int total = Integer.parseInt(operando1.getText()) + Integer.parseInt(operando2.getText());
					resultado.setText(Integer.toString(total));
				}
				if (operando1.getText().equals("-")) {
					int total = Integer.parseInt(operando1.getText()) - Integer.parseInt(operando2.getText());
					resultado.setText(Integer.toString(total));
				}
				if (operando1.getText().equals("X")) {
					int total = Integer.parseInt(operando1.getText()) * Integer.parseInt(operando2.getText());
					resultado.setText(Integer.toString(total));
				}
				if (operando1.getText().equals("/")) {
					double total = Double.parseDouble(operando1.getText()) / Double.parseDouble(operando2.getText());
				}
			}

		});

		about.setBounds(340, 205, 89, 23);
		contentPane.add(about);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
