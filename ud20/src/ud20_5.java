import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ud20_5 extends JFrame {

	public static void main(String[] args) {
	}

	private JPanel contentPane;
	private JTextField textField;
	private JTextField area_texto;

	public ud20_5() {

		// Añadimos un titulo a la ventana //
		setTitle("Ventana");

		// Coordenadas x y de la aplicación y su altura y longitud //
		setBounds(400, 200, 409, 242);

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

		// Botón de limpiar el area de texto //
		JButton boton_limpiar = new JButton("LIMPIAR");
		boton_limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area_texto.setText("");
			}
		});
		boton_limpiar.setBounds(153, 11, 89, 23);
		contentPane.add(boton_limpiar);

		// Recuadro de area de texto //
		area_texto = new JTextField();
		area_texto.setBounds(10, 44, 373, 148);
		contentPane.add(area_texto);
		area_texto.setColumns(10);
	}
}