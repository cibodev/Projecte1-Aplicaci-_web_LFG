package ud5;
import javax.swing.JOptionPane;
public class ud5_4 {
	public static void main (String []args) {
		
		String texto=JOptionPane.showInputDialog("Área de un circulo");
		double radio=Double.parseDouble(texto);
		double area=Math.PI*Math.pow(radio,2);
		System.out.println("El area del circulo es "+area+"");
	}
	}
