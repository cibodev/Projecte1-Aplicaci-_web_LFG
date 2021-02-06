package ud5;
import javax.swing.JOptionPane;
public class ud5_6 {
	public static void main (String []args) {
		
		final double IVA=0.21;
		String texto_num=JOptionPane.showInputDialog("Precio del producto");
		
		int precio=Integer.parseInt(texto_num);
		JOptionPane.showMessageDialog(null, "El precio final con IVA es de " +precio+ "su precio final es de" +(precio+(precio*IVA)));
		
	}
}