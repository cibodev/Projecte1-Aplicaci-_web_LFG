package ud5;
import javax.swing.JOptionPane;
public class ud5_13_app {
	public static void main (String []args) {
		
		int operando1;
		int operando2;
		int resultado=0;
		
		String operando1=JOptionPane.showInputDialog("operando1"); 
		String calculadora=JOptionPane.showInputDialog("calculadora"); 
		String operando2=JOptionPane.showInputDialog("operando2"); 
		
		Swicht(calculadora){
			case"+";
			resultado=operando1+operando2;
			break;
			case"-";
			operando1-operando2=resultado;
			break;
			case"*";
			operando1*operando2=resultado;
			break;
			case"/";
			operando1/operando2=resultado;
			break;
			case"%";
			operando1%operando2=resultado;
			break;
		}
	}
}
