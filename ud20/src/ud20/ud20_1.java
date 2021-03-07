package ud20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ud20_1 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		ud20_1 ventana = new ud20_1();
	}

	// Edición del tamaño de la ventana //
	public ud20_1() {

		setTitle("UD20_1");
		setBounds(400, 400, 300, 179);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// Etiqueta cambiar tamaño de la ventana //
		JLabel etiqueta = new JLabel("Cambiar tamaño de la ventana: ");
		etiqueta.setBounds(10, 11, 200, 20);
		final JTextField textField = new JTextField("");
		textField.setBounds(10, 42, 123, 20);
		final JTextField textField2 = new JTextField("");
		textField2.setBounds(10, 75, 123, 20);

		// Botón editar tamaño de la ventana //
		JButton btnPulsame = new JButton("Editar");
		btnPulsame.setBounds(172, 58, 88, 20);

		contentPane.add(btnPulsame);
		contentPane.add(textField);
		contentPane.add(textField2);
		contentPane.add(etiqueta);
		setVisible(true);

		// Botón para saludar con el nombre introducido //
		btnPulsame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int horizontal = Integer.parseInt(textField.getText());
				int vertical = Integer.parseInt(textField2.getText());
				setBounds(", ", horizontal, vertical);
			}

			private void setBounds(String string, int horizontal, int vertical) {
				// TODO Auto-generated method stub

			}

		});
	}

}
