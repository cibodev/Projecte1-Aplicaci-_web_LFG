package ud5;
import javax.swing.JOptionPane;
public class ud5_11_app {
	public static void main (String []args) {
		
		String dia="Lunes";
		
		switch (dia) {
		case "Lunes":
			System.out.println("Hoy es día laboral"+dia);
			
		case "Martes":
			System.out.println("Hoy es día laboral"+dia);
			
		case "Miércoles":
			System.out.println("Hoy es día laboral"+dia);
			break;
		case "Jueves":
			System.out.println("Hoy es día laboral"+dia);
			break;
		case "Viernes":
			System.out.println("Hoy es día laboral"+dia);
			break;
		case "Sábado":
			System.out.println("Hoy es día laboral"+dia);
			break;
		case "Domingo":
			System.out.println("Hoy es día festivo"+dia);
			
		}
	}
}
