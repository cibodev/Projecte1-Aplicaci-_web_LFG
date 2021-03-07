import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ud20_4 extends JFrame {

	public static void main(String[] args) {
	}

	private JPanel contentPane;
	private JTextField textField;

	public ud20_4() {

		// Añadimos un titulo a la ventana //
		setTitle("Ventana");

		// Coordenadas x y de la aplicación y su altura y longitud //
		setBounds(400, 200, 409, 194);

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

		// Etiqueta EVENTOS //
		JLabel etiqueta_eventos = new JLabel("EVENTOS");
		etiqueta_eventos.setBounds(10, 77, 61, 14);
		contentPane.add(etiqueta_eventos);

		// Campo de texto //
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		textField.setBounds(70, 11, 292, 126);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
