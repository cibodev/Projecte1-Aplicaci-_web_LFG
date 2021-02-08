package ud6;

import javax.swing.JOptionPane;

public class ud6_9_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto=JOptionPane.showInputDialog("Tamaño del array");
		int num[]=new int [Integer.parseInt(texto)];
		
		numAleatorios(num,0,9);
		mostrarArray(num);
	}
		public static void numAleatorios(int lista[]);
			
		
		
		
		
		
		public static void mostrarValores (int lista[]) {
			for(int i=0;i<lista.length;i++) {
				System.out.println(lista [i]);
		
	}

}
