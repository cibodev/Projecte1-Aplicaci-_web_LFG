package ud6;
import javax.swing.JOptionPane;
public class ud6_1_app {
	public static void main (String []args) {
		
		String figura=JOptionPane.showInputDialog("Figura: circulo, triangulo o cuadrado");
		double resultado=0;
		
		switch(figura) {
			case"circulo":
				String circulo=JOptionPane.showInputDialog("Valores área circulo");
				int radio=Integer.parseInt(circulo);
				int resultado1=areaCirculo(radio);
				break;
		
			case"triangulo":
				String triangulo=JOptionPane.showInputDialog("Valores área triangulo");
				int base=Integer.parseInt(triangulo);
				int altura=Integer.parseInt(triangulo);
				int resultado2=areaTriangulo(base,altura);
				break;
				
			case"cuadrado":
				String cuadrado=JOptionPane.showInputDialog("Valores área cuadrado");
				int lado=Integer.parseInt(cuadrado);
				int resultado3=areaCuadrado(lado);
				break;
			}
	}
	
			public static int areaCirculo (int radio){
				int resultado1=radio;
				return resultado1;
		}
				
			public static int areaTriangulo (int base, int altura) {
				int resultado2=base*altura/2;
				return resultado2;}

			public static int areaCuadrado (int lado){
				int resultado3=lado;
				return resultado3;
			}
}