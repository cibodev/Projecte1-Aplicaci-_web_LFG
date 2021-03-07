import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ArrayList //
		ArrayList<Categoria> empleados = new ArrayList<Categoria>();

		Categoria categoria1 = new Categoria("Manager", 3500, "Junior");
		Categoria categoria2 = new Categoria("Boss", 9000, "Senior");
		Categoria categoria3 = new Categoria("Employee", 1600, "Mid");

		empleados.add(categoria1);
		empleados.add(categoria2);
		empleados.add(categoria3);
		
		String empleado = JOptionPane.showInputDialog("Tipo de empleado: ");
		System.out.println("Tipo de empleado: "+empleado);
		String sueldo = JOptionPane.showInputDialog("Sueldo mensual: ");
		System.out.println("Sueldo mensual: "+sueldo);
		String categoria = JOptionPane.showInputDialog("Categoria empleado (junior, mid, senior): ");
		System.out.println("Categoria empleado: "+categoria);
		

	}

}
