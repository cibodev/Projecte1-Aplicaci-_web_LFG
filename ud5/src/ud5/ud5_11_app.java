package ud5;

import javax.swing.JOptionPane;

public class ud5_11_app {
	public static void main(String[] args) {

		String dia = JOptionPane.showInputDialog("día de la semana");

		switch (dia) {
		case "Lunes":
		case "Martes":
		case "Miércoles":
		case "Jueves":
		case "Viernes":
		case "Sábado":
			System.out.println("Hoy es día laboral " + dia);
			break;
		case "Domingo":
			System.out.println("Hoy es día festivo " + dia);
			break;
		default:
			System.out.println("día de la semana");
		}
	}
}
