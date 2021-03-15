package ud9_1;

import java.util.ArrayList;

public class EjecutableApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array de electrodomesticos de 10 posiciones
		Electrodomestico listaElectrodomesticos[] = new Electrodomestico[10];

		listaElectrodomesticos[0] = new Electrodomestico(0, "Lavadora", null, 0);
		listaElectrodomesticos[1] = new Electrodomestico(0, "Television", null, 0);
		listaElectrodomesticos[2] = new Electrodomestico(0, "Electrodomestico", null, 0);
		listaElectrodomesticos[3] = new Electrodomestico(0, "Lavadora", null, 0);
		listaElectrodomesticos[4] = new Electrodomestico(0, "Television", null, 0);
		listaElectrodomesticos[5] = new Electrodomestico(0, "Electrodomestico", null, 0);
		listaElectrodomesticos[6] = new Electrodomestico(0, "Lavadora", null, 0);
		listaElectrodomesticos[7] = new Electrodomestico(0, "Television", null, 0);
		listaElectrodomesticos[8] = new Electrodomestico(0, "Electrodomestico", null, 0);
		listaElectrodomesticos[9] = new Electrodomestico(0, "Lavadora", null, 0);

		double sumaElectrodomestico = 0;
		double sumaTelevision = 0;
		double sumaLavadora = 0;

		System.out.println("La suma del precio de los electrodomesticos es " + sumaElectrodomestico);
		System.out.println("La suma del precio de las lavadoras es " + sumaLavadora);
		System.out.println("La suma del precio de las televisiones es " + sumaTelevision);
	}

}
