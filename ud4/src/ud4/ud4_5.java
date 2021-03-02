package ud4;

public class ud4_5 {
	public static void main (String[] args) {
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		System.out.println("b toma el valor de c:"+(b=c));
		System.out.println("c toma el valor de a:"+(c=a));
		System.out.println("a toma el valor de d:"+(a=d));
		System.out.println("d toma el valor de b:"+(d=b));

	}
}
