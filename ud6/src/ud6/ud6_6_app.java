package ud6;
import javax.swing.JOptionPane;
public class ud6_6_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto=JOptionPane.showInputDialog("Número entero positivo");
		int num=Integer.parseInt(texto);
		int numCifras=contarCifras(numero);
	}
		public static int contarCifras(int numero) {
			int contador=0;
			for (int i=numero;i>0;i/=10) {
				contador++;
			}
			return contador;
		}
			
		}