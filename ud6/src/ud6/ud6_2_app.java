package ud6;
import javax.swing.JOptionPane;
import java.util.Random;
public class ud6_2_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto=JOptionPane.showInputDialog("Introduce un número");
		int num1=Integer.parseInt(texto);
        
		int aleatorio=(int)(Math.random()*10000);
		System.out.println(aleatorio);
	}
}
