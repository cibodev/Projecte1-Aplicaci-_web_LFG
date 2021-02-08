package ud6;
import javax.swing.JOptionPane;
public class ud6_7_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto=JOptionPane.showInputDialog("Cantidad de euros");
		double euros=Double.parseDouble(texto);
		String moneda=JOptionPane.showInputDialog("Moneda a la que quieres convertir");
		cambio(euros,moneda);
	}
		public static void cambio (double euros, String moneda) {
			double res=0;
			
			switch (moneda) {
				case"libra":
					res=euros*0.86;
					break;
				case"dolar":
					res=euros*1.28611;
					break;
				case"yen":
					res=euros*129.852;
					break;
			}
			System.out.println("Cambio de euros a " +moneda+" son "+res);

					
			}
		}
