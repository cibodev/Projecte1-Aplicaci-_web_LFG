package ud6;
import javax.swing.JOptionPane;
public class ud6_3_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto=JOptionPane.showInputDialog("Introduce un número");
			int numero=Integer.parseInt(texto);
						
			if (numPrimo(numero)) {
				System.out.println("El número "+numero+" es primo");
			}else { 
				System.out.println("El número "+numero+" no es primo");
			}
		}
			public static boolean numPrimo (int numero) {
				if (numero<=1){
					return false;
				}else {
					return true;
				}

			}
}