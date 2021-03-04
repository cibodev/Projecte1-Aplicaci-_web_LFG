package src.ud10_4;
import java.util.InputMismatchException;

public class ud10_4 {

	
	//import ejercicio4_4.*;


		public static void main(String[] args) {
			
			
			public static int suma(int a,int b) {
				return a+b;
			}
			
			public static int resta(int a,int b) {
				return a-b;
			}
			
			public static int multi(int a,int b) {
				return a*b;
			}
			
			public static int div(int a,int b) {
				return a/b;
			}
			
			public static int potencia(int a,int b) {
				return (int) Math.pow(a, b);
			}
			
			public static int raiz2(int a) {
				return (int) Math.sqrt(a);
			}
			
			public static int raiz3(int a) {
				return (int) Math.cbrt(a);
			}
			
			try {
String texto = JOptionPane.showInputDialog("Introduce el primer número: ");
System.out.println("Valor del primer número: "+texto);
				int a = texto;
				
				String texto1 = JOptionPane.showInputDialog("Introduce el segundo número: ");
				System.out.println("Valor del segundo número: "+texto1);
								int b = texto1;
				System.out.println("Valor del segundo número: ");
				int b = texto1;
				
				suma(a,b);
				resta(a,b);
				multi(a,b);
				div(a,b);
				potencia(a,b);
				raiz2(a);
				raiz3(a);

				
				
			}catch(InputMismatchException e){
				System.out.print("Solo acepta numeros!");
			}catch(ArithmeticException e) {
				System.out.print("No se puede dividir entre 0");
			};

		}
		
		
		

	}
}
