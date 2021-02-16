package ud6;

import javax.swing.JOptionPane;

public class ud6_1_app {
	public static void main(String[] args) {

		String figura = JOptionPane.showInputDialog("Figura: circulo, triangulo o cuadrado");
		double resultado = 0;

		switch (figura) {
		case "circulo":
			String circulo = JOptionPane.showInputDialog("Introduce el radio");
			int radio = Integer.parseInt(circulo);
			resultado = areaCirculo(radio);
			break;

		case "triangulo":
			String triangulo = JOptionPane.showInputDialog("Introduce la base");
			int base = Integer.parseInt(triangulo);
			String triangulo2 = JOptionPane.showInputDialog("Introduce la altura");
			int altura = Integer.parseInt(triangulo);
			resultado = areaTriangulo(base, altura);
			break;

		case "cuadrado":
			String cuadrado = JOptionPane.showInputDialog("Introduce el lado");
			int lado = Integer.parseInt(cuadrado);
			resultado = areaCuadrado(lado);
			break;
		}
	}

	public static double areaCirculo(int radio) {
		return (Math.pow(radio, 2)*Math.PI);
	}

	public static double areaTriangulo(int base, int altura) {
		return base*altura/2;
	}

	public static int areaCuadrado(int lado) {
		return lado*lado;
	}

	System.out.println("El área de" +figura+ "es" +resultado+);
}