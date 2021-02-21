package ud10_2;

public class ud10_2 {

	public static void main(String[] args) {
		try {
			System.out.println("Mensaje mostrado por pantalla");
			Exception ex = new Exception("Programa terminado");

			// Constructor
			System.out.println("Excepción capturada con mensaje: Esto es un objeto Exception");

			throw ex;
		} catch (Exception ex) {
			System.out.println("Programa terminado");
		}

	}
}
