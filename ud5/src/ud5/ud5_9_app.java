package ud5;
import javax.swing.JOptionPane;
public class ud5_9_app {
	public static void main (String []args) {
		
		int num=1;
		while (num<=100) {
			System.out.println(num);
			num++;
		if ((num%2==0)&&(num%3==0))
			System.out.println(num);
		}
	}
}