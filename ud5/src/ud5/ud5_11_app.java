package ud5;
import javax.swing.JOptionPane;
public class ud5_11_app {
	public static void main (String []args) {
		
		String dia="Lunes";
		
		switch (dia) {
		case "Lunes":
			System.out.println("Hoy es d�a laboral"+dia);
			
		case "Martes":
			System.out.println("Hoy es d�a laboral"+dia);
			
		case "Mi�rcoles":
			System.out.println("Hoy es d�a laboral"+dia);
			break;
		case "Jueves":
			System.out.println("Hoy es d�a laboral"+dia);
			break;
		case "Viernes":
			System.out.println("Hoy es d�a laboral"+dia);
			break;
		case "S�bado":
			System.out.println("Hoy es d�a laboral"+dia);
			break;
		case "Domingo":
			System.out.println("Hoy es d�a festivo"+dia);
			
		}
	}
}
