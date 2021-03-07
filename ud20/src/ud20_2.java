
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ud20_2 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		ud20_1 ventana = new ud20_1();
	}

	// Edición del tamaño de la ventana //
	public ud20_2() {

		setTitle("UD20_2");
		setBounds(400, 400, 279, 121);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// Etiqueta 1 //
		final JLabel etiqueta = new JLabel("Has pulsado:       ");
		etiqueta.setBounds(10, 11, 200, 20);

		// Botón 1 //
		final JButton btnPulsame = new JButton("Botón 1");
		btnPulsame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText(btnPulsame.getText());
			}
		});
		btnPulsame.setBounds(10, 43, 112, 20);
		btnPulsame.addActionListener(null);

		contentPane.add(btnPulsame);
		contentPane.add(etiqueta);

		// Botón 2 //
		final JButton btnBotn = new JButton("Botón 2");
		btnBotn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText(btnBotn.getText());
			}
		});
		btnBotn.setBounds(137, 42, 112, 20);
		contentPane.add(btnBotn);
		setVisible(true);

	};

}
