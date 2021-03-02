package ud10_4;

import javax.swing.JOptionPane;
import java.util.InputMismatchException;

public class ud10_4 {

	int resultado;

	public int sumar(int num1, int num2) {
		resultado = num1 + num2;
		return resultado;
	}

	public int restar(int num1, int num2) {
		resultado = num1 - num2;
		return resultado;

	}

	public int multiplicar(int num1, int num2) {
		resultado = num1 * num2;
		return resultado;

	}

	public int dividir(int num1, int num2) {
		resultado = num1 / num2;
		return resultado;

	}

	public static void main(String[] args) {
		ud10_4 calculo = new ud10_4();
		int num1, num2;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número: "));

		try {
			System.out.println("La suma es: " + calculo.sumar(num1, num2));
			System.out.println("La resta es: " + calculo.restar(num1, num2));
			System.out.println("La multiplicación es: " + calculo.multiplicar(num1, num2));
			System.out.println("La división es: " + calculo.dividir(num1, num2));
			System.out.println("La potencia del número " + num1 + " elevado a: " + num2 + " es:");
			System.out.println(Math.pow(num1, num2));
			System.out.println("La raíz cuadrada del número " + num1 + " es:");
			System.out.println(Math.sqrt(num1));
			System.out.println("La raíz cuadrada del número " + num2 + " es:");
			System.out.println(Math.sqrt(num2));
			System.out.println("La raíz cubica del número " + num1 + " es:");
			System.out.println(Math.cbrt(num1));
			System.out.println("La raíz cubica del número " + num2 + " es:");
			System.out.println(Math.cbrt(num2));
			System.out.println("Cálculo terminado");

		} catch (InputMismatchException e) {
			System.out.print("Solo se aceptan números");

		}
	}
}