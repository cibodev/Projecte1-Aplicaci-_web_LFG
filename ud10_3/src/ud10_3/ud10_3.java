package ud10_3;

public class ud10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Generando número aleatorio...");
			int numero = (int) (Math.random() * 100);
			System.out.println(+numero);
			if (numero % 2 == 0) {
				throw new Exception("Número par");
			} else {
				throw new Exception("Número impar");
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}
	}
}
